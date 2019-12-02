// Generated from /Users/jack/Documents/ideaWorkspace/ruleset-pmml/src/main/antlr4/RuleSetGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleSetGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleSetGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(RuleSetGrammarParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_rule(RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#rule_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_identifier(RuleSetGrammarParser.Rule_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#rule_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_predicate(RuleSetGrammarParser.Rule_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#rule_prediction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_prediction(RuleSetGrammarParser.Rule_predictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#train_test_measures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrain_test_measures(RuleSetGrammarParser.Train_test_measuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RuleSetGrammarParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(RuleSetGrammarParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalEntity(RuleSetGrammarParser.LogicalEntityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(RuleSetGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionInParen(RuleSetGrammarParser.LogicalExpressionInParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionAnd(RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpressionOr(RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionWithOperator(RuleSetGrammarParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionParens(RuleSetGrammarParser.ComparisonExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOperandExpr}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperandExpr(RuleSetGrammarParser.ComparisonOperandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOperandString}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperandString(RuleSetGrammarParser.ComparisonOperandStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorEqual(RuleSetGrammarParser.OperatorEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorNotEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorNotEqual(RuleSetGrammarParser.OperatorNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorLessThan}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLessThan(RuleSetGrammarParser.OperatorLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorLessOrEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLessOrEqual(RuleSetGrammarParser.OperatorLessOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorGreaterThan}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorGreaterThan(RuleSetGrammarParser.OperatorGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorGreaterOrEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorGreaterOrEqual(RuleSetGrammarParser.OperatorGreaterOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMult(RuleSetGrammarParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionMinus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionMinus(RuleSetGrammarParser.ArithmeticExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionParens}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionParens(RuleSetGrammarParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNumericEntity(RuleSetGrammarParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionDiv(RuleSetGrammarParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionPlus(RuleSetGrammarParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNegation(RuleSetGrammarParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalTrueConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalTrueConst(RuleSetGrammarParser.LogicalTrueConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalFalseConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalFalseConst(RuleSetGrammarParser.LogicalFalseConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalVariable(RuleSetGrammarParser.LogicalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalString}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalString(RuleSetGrammarParser.LogicalStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConst(RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericVariable(RuleSetGrammarParser.NumericVariableContext ctx);
}