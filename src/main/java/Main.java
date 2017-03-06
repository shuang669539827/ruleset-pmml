
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dmg.pmml.Application;
import org.dmg.pmml.CompoundPredicate;
import org.dmg.pmml.CompoundPredicate.BooleanOperator;
import org.dmg.pmml.DataDictionary;
import org.dmg.pmml.DataField;
import org.dmg.pmml.DataType;
import org.dmg.pmml.False;
import org.dmg.pmml.FieldName;
import org.dmg.pmml.FieldUsageType;
import org.dmg.pmml.Header;
import org.dmg.pmml.MiningField;
import org.dmg.pmml.MiningFunctionType;
import org.dmg.pmml.MiningSchema;
import org.dmg.pmml.OpType;
import org.dmg.pmml.PMML;
import org.dmg.pmml.Predicate;
import org.dmg.pmml.RuleSelectionMethod;
import org.dmg.pmml.RuleSelectionMethod.Criterion;
import org.dmg.pmml.RuleSet;
import org.dmg.pmml.RuleSetModel;
import org.dmg.pmml.SimplePredicate;
import org.dmg.pmml.SimplePredicate.Operator;
import org.dmg.pmml.SimpleRule;
import org.dmg.pmml.Timestamp;
import org.dmg.pmml.True;

public class Main {

	private static final String PMML_VERSION = "4.2";
	private static final String APPLICATION_VERSION = "1.0";
	private static final String APPLICATION_NAME = "RulesetPmml";

	public static void main(String[] args) throws JAXBException, IOException, ConvertToPredicateException,
			ConvertToOperatorException, DataTypeConsistencyException {
		// Read the file from parameters
		InputStream inputStream = new FileInputStream(new File(args[0]));

		// Parse
		ANTLRInputStream input = new ANTLRInputStream(inputStream);
		RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);

		RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);
		// parser.removeErrorListeners();
		// parser.setErrorHandler(new ExceptionThrowingErrorHandler());
		ParserRuleContext ruleContext = parser.rule_set();
		// show AST in console
		// System.out.println(parser.rule_set().toStringTree(parser));
		
		

		PMML pmml = Converter.createModelFromRuleContext(ruleContext);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(PMML.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		m.marshal(pmml, System.out);
	}

	private static void addApplication(Header header) {
		Application application = new Application();
		application.setName(APPLICATION_NAME);
		application.setVersion(APPLICATION_VERSION);
		header.setApplication(application);
	}

	private static void addTimestampNow(Header header) {
		Timestamp timestamp = new Timestamp();
		SimpleDateFormat ISO8601DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
		Date now = new Date(System.currentTimeMillis());
		timestamp.addContent(ISO8601DATEFORMAT.format(now));
		header.setTimestamp(timestamp);
	}

	private static void addDataDictionnary(ConvertContext context, PMML pmml) {
		DataDictionary dataDictionary = new DataDictionary();
		for (FieldName name : context.getFields().values()) {
			DataField dataField = new DataField(name, OpType.CONTINUOUS, DataType.DOUBLE);
			dataField.setDataType(context.getFieldType(name.getValue()));
			dataDictionary.addDataFields(dataField);
		}

		// DataField dataFieldTarget = new DataField("target",
		// OpType.CONTINUOUS, DataType.STRING);

		// Add target
		DataField targetDataField = new DataField(new FieldName(context.getTargetVarName()), context.getTargetOpType(),
				context.getTargetDataType());
		dataDictionary.addDataFields(targetDataField);

		// Add field afterward
		pmml.setDataDictionary(dataDictionary);
	}

	private static void addMiningField(ConvertContext context, RuleSetModel model) {
		MiningSchema miningSchema = new MiningSchema();
		for (FieldName name : context.getFields().values()) {
			MiningField miningField = new MiningField(name);
			miningSchema.addMiningFields(miningField);
		}

		// Add target
		MiningField target = new MiningField(new FieldName(context.getTargetVarName()));
		target.setUsageType(FieldUsageType.TARGET);
		miningSchema.addMiningFields(target); // add special var

		// Add field afterward
		model.setMiningSchema(miningSchema);
	}

	private static Predicate convertToPredicate(ConvertContext context, ParseTree parseTree)
			throws ConvertToPredicateException, ConvertToOperatorException, DataTypeConsistencyException {
		if (parseTree instanceof RuleSetGrammarParser.LogicalExpressionAndContext) {
			RuleSetGrammarParser.LogicalExpressionAndContext andExpre = (RuleSetGrammarParser.LogicalExpressionAndContext) parseTree;
			CompoundPredicate predicate = new CompoundPredicate(BooleanOperator.AND);
			// add left and right
			predicate.addPredicates(convertToPredicate(context, andExpre.getChild(0)));
			predicate.addPredicates(convertToPredicate(context, andExpre.getChild(2)));
			return predicate;
		}

		// ComparisonExpressionContext
		else if (parseTree instanceof RuleSetGrammarParser.ComparisonExpressionContext) {
			// There are only two cases that we can convert
			return convertToPredicate(context, parseTree.getChild(0));
		}

		// ComparisonExpressionWithOperatorContext
		else if (parseTree instanceof RuleSetGrammarParser.ComparisonExpressionWithOperatorContext) {
			SimplePredicate predicate = new SimplePredicate();
			String key = parseTree.getChild(0).getText();

			predicate.setField(context.getField(key));
			predicate.setOperator(convertToOperator(parseTree.getChild(1)));

			// Check if it's a string
			// System.out.println(parseTree.getChild(2).getClass().getName());
			if (parseTree.getChild(2) instanceof RuleSetGrammarParser.ComparisonOperandStringContext) {
				context.setFieldType(key, DataType.STRING);
				String val = parseTree.getChild(2).getText().substring(1);
				predicate.setValue(val.substring(0, val.length() - 1));
			} else if (parseTree.getChild(2) instanceof RuleSetGrammarParser.ComparisonOperandExprContext) {
				context.setFieldType(key, DataType.DOUBLE);
				predicate.setValue(parseTree.getChild(2).getText());
			}

			return predicate;
		}
		
		else if (parseTree instanceof RuleSetGrammarParser.LogicalEntityContext) {
			ParseTree child = parseTree.getChild(0);
			if (child instanceof RuleSetGrammarParser.LogicalTrueConstContext) {
				return new True();
			} else if (child instanceof RuleSetGrammarParser.LogicalFalseConstContext) {
				return new False();
			}
			throw new ConvertToPredicateException();
		}
		
		// OR
		else if (parseTree instanceof RuleSetGrammarParser.LogicalExpressionOrContext) {
			ParseTree childLeft = parseTree.getChild(0);
			ParseTree childRight = parseTree.getChild(2);
			
			CompoundPredicate predicate = new CompoundPredicate();
			predicate.setBooleanOperator(BooleanOperator.OR);
			predicate.addPredicates(convertToPredicate(context, childLeft));
			predicate.addPredicates(convertToPredicate(context, childRight));
			
			return predicate;
		}
		
		// paren
		else if (parseTree instanceof RuleSetGrammarParser.LogicalExpressionInParenContext) {
			return convertToPredicate(context, parseTree.getChild(1));
		}

		throw new ConvertToPredicateException();
	}

	private static Operator convertToOperator(ParseTree child) throws ConvertToOperatorException {
		if (child instanceof RuleSetGrammarParser.OperatorEqualContext) {
			return Operator.EQUAL;
		} else if (child instanceof RuleSetGrammarParser.OperatorNotEqualContext) {
			return Operator.NOT_EQUAL;
		} else if (child instanceof RuleSetGrammarParser.OperatorLessThanContext) {
			return Operator.LESS_THAN;
		} else if (child instanceof RuleSetGrammarParser.OperatorLessOrEqualContext) {
			return Operator.LESS_OR_EQUAL;
		} else if (child instanceof RuleSetGrammarParser.OperatorGreaterThanContext) {
			return Operator.GREATER_THAN;
		} else if (child instanceof RuleSetGrammarParser.OperatorGreaterOrEqualContext) {
			return Operator.GREATER_OR_EQUAL;
		} else {
			throw new ConvertToOperatorException();
		}
	}
}
