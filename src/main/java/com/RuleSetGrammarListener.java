package com;// Generated from /Users/jack/Documents/ideaWorkspace/ruleset-pmml/src/main/antlr4/RuleSetGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleSetGrammarParser}.
 */
public interface RuleSetGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(RuleSetGrammarParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(RuleSetGrammarParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void enterSingle_rule(RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#single_rule}.
	 * @param ctx the parse tree
	 */
	void exitSingle_rule(RuleSetGrammarParser.Single_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#rule_identifier}.
	 * @param ctx the parse tree
	 */
	void enterRule_identifier(RuleSetGrammarParser.Rule_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#rule_identifier}.
	 * @param ctx the parse tree
	 */
	void exitRule_identifier(RuleSetGrammarParser.Rule_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#rule_predicate}.
	 * @param ctx the parse tree
	 */
	void enterRule_predicate(RuleSetGrammarParser.Rule_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#rule_predicate}.
	 * @param ctx the parse tree
	 */
	void exitRule_predicate(RuleSetGrammarParser.Rule_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#rule_prediction}.
	 * @param ctx the parse tree
	 */
	void enterRule_prediction(RuleSetGrammarParser.Rule_predictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#rule_prediction}.
	 * @param ctx the parse tree
	 */
	void exitRule_prediction(RuleSetGrammarParser.Rule_predictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#train_test_measures}.
	 * @param ctx the parse tree
	 */
	void enterTrain_test_measures(RuleSetGrammarParser.Train_test_measuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#train_test_measures}.
	 * @param ctx the parse tree
	 */
	void exitTrain_test_measures(RuleSetGrammarParser.Train_test_measuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RuleSetGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleSetGrammarParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(RuleSetGrammarParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleSetGrammarParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(RuleSetGrammarParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEntity(RuleSetGrammarParser.LogicalEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEntity(RuleSetGrammarParser.LogicalEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(RuleSetGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(RuleSetGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionInParen(RuleSetGrammarParser.LogicalExpressionInParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionInParen}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionInParen(RuleSetGrammarParser.LogicalExpressionInParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionAnd(RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionAnd}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionAnd(RuleSetGrammarParser.LogicalExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpressionOr(RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpressionOr}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpressionOr(RuleSetGrammarParser.LogicalExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionWithOperator(RuleSetGrammarParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionWithOperator}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionWithOperator(RuleSetGrammarParser.ComparisonExpressionWithOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionParens(RuleSetGrammarParser.ComparisonExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionParens}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionParens(RuleSetGrammarParser.ComparisonExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonOperandExpr}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperandExpr(RuleSetGrammarParser.ComparisonOperandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonOperandExpr}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperandExpr(RuleSetGrammarParser.ComparisonOperandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonOperandString}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperandString(RuleSetGrammarParser.ComparisonOperandStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonOperandString}
	 * labeled alternative in {@link RuleSetGrammarParser#comparison_operand}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperandString(RuleSetGrammarParser.ComparisonOperandStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorEqual(RuleSetGrammarParser.OperatorEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorEqual(RuleSetGrammarParser.OperatorEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorNotEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorNotEqual(RuleSetGrammarParser.OperatorNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorNotEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorNotEqual(RuleSetGrammarParser.OperatorNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorLessThan}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorLessThan(RuleSetGrammarParser.OperatorLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorLessThan}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorLessThan(RuleSetGrammarParser.OperatorLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorLessOrEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorLessOrEqual(RuleSetGrammarParser.OperatorLessOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorLessOrEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorLessOrEqual(RuleSetGrammarParser.OperatorLessOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorGreaterThan}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorGreaterThan(RuleSetGrammarParser.OperatorGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorGreaterThan}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorGreaterThan(RuleSetGrammarParser.OperatorGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorGreaterOrEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorGreaterOrEqual(RuleSetGrammarParser.OperatorGreaterOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorGreaterOrEqual}
	 * labeled alternative in {@link RuleSetGrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorGreaterOrEqual(RuleSetGrammarParser.OperatorGreaterOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionMult(RuleSetGrammarParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionMult}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionMult(RuleSetGrammarParser.ArithmeticExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionMinus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionMinus(RuleSetGrammarParser.ArithmeticExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionMinus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionMinus(RuleSetGrammarParser.ArithmeticExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionParens}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionParens(RuleSetGrammarParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionParens}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionParens(RuleSetGrammarParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNumericEntity(RuleSetGrammarParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionNumericEntity}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNumericEntity(RuleSetGrammarParser.ArithmeticExpressionNumericEntityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionDiv(RuleSetGrammarParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionDiv}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionDiv(RuleSetGrammarParser.ArithmeticExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionPlus(RuleSetGrammarParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionPlus}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionPlus(RuleSetGrammarParser.ArithmeticExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNegation(RuleSetGrammarParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpressionNegation}
	 * labeled alternative in {@link RuleSetGrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNegation(RuleSetGrammarParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalTrueConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTrueConst(RuleSetGrammarParser.LogicalTrueConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalTrueConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTrueConst(RuleSetGrammarParser.LogicalTrueConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalFalseConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalFalseConst(RuleSetGrammarParser.LogicalFalseConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalFalseConst}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalFalseConst(RuleSetGrammarParser.LogicalFalseConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalVariable(RuleSetGrammarParser.LogicalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalVariable(RuleSetGrammarParser.LogicalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalString}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogicalString(RuleSetGrammarParser.LogicalStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalString}
	 * labeled alternative in {@link RuleSetGrammarParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogicalString(RuleSetGrammarParser.LogicalStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericConst(RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericConst}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericConst(RuleSetGrammarParser.NumericConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumericVariable(RuleSetGrammarParser.NumericVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericVariable}
	 * labeled alternative in {@link RuleSetGrammarParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumericVariable(RuleSetGrammarParser.NumericVariableContext ctx);
}