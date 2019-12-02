package com;// Generated from /Users/jack/Documents/ideaWorkspace/ruleset-pmml/src/main/antlr4/RuleSetGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AND=9, 
		OR=10, TRUE=11, FALSE=12, MULT=13, DIV=14, PLUS=15, MINUS=16, GT=17, GE=18, 
		LT=19, LE=20, EQ=21, NE=22, LPAREN=23, RPAREN=24, DECIMAL=25, IDENTIFIER=26, 
		SEMI=27, COMMENT=28, WS=29, QUOTED_STRING=30;
	public static final int
		RULE_ruleSet = 0, RULE_single_rule = 1, RULE_rule_identifier = 2, RULE_rule_predicate = 3, 
		RULE_rule_prediction = 4, RULE_train_test_measures = 5, RULE_condition = 6, 
		RULE_conclusion = 7, RULE_logical_expr = 8, RULE_comparison_expr = 9, 
		RULE_comparison_operand = 10, RULE_comp_operator = 11, RULE_arithmetic_expr = 12, 
		RULE_logical_entity = 13, RULE_numeric_entity = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"ruleSet", "single_rule", "rule_identifier", "rule_predicate", "rule_prediction", 
			"train_test_measures", "condition", "conclusion", "logical_expr", "comparison_expr", 
			"comparison_operand", "comp_operator", "arithmetic_expr", "logical_entity", 
			"numeric_entity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'PREDICATE'", "'PREDICTION'", "'Training/test measures'", 
			"'recordCount'", "'nbCorrect'", "'confidence'", "'weight'", null, null, 
			null, null, "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", 
			null, null, "'('", "')'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AND", "OR", "TRUE", 
			"FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", 
			"NE", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "SEMI", "COMMENT", 
			"WS", "QUOTED_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleSetGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RuleSetContext extends ParserRuleContext {
		public List<Single_ruleContext> single_rule() {
			return getRuleContexts(Single_ruleContext.class);
		}
		public Single_ruleContext single_rule(int i) {
			return getRuleContext(Single_ruleContext.class,i);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(30);
				single_rule();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_ruleContext extends ParserRuleContext {
		public Rule_identifierContext rule_identifier() {
			return getRuleContext(Rule_identifierContext.class,0);
		}
		public Rule_predicateContext rule_predicate() {
			return getRuleContext(Rule_predicateContext.class,0);
		}
		public Rule_predictionContext rule_prediction() {
			return getRuleContext(Rule_predictionContext.class,0);
		}
		public Train_test_measuresContext train_test_measures() {
			return getRuleContext(Train_test_measuresContext.class,0);
		}
		public Single_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterSingle_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitSingle_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitSingle_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_ruleContext single_rule() throws RecognitionException {
		Single_ruleContext _localctx = new Single_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			rule_identifier();
			setState(37);
			rule_predicate();
			setState(38);
			rule_prediction();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(39);
				train_test_measures();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_identifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RuleSetGrammarParser.IDENTIFIER, 0); }
		public Rule_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterRule_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitRule_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitRule_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_identifierContext rule_identifier() throws RecognitionException {
		Rule_identifierContext _localctx = new Rule_identifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rule_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IDENTIFIER);
			setState(43);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_predicateContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Rule_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterRule_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitRule_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitRule_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_predicateContext rule_predicate() throws RecognitionException {
		Rule_predicateContext _localctx = new Rule_predicateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rule_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(T__0);
			setState(47);
			logical_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_predictionContext extends ParserRuleContext {
		public Logical_entityContext logical_entity() {
			return getRuleContext(Logical_entityContext.class,0);
		}
		public Numeric_entityContext numeric_entity() {
			return getRuleContext(Numeric_entityContext.class,0);
		}
		public Rule_predictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_prediction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterRule_prediction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitRule_prediction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitRule_prediction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_predictionContext rule_prediction() throws RecognitionException {
		Rule_predictionContext _localctx = new Rule_predictionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule_prediction);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__2);
				setState(50);
				match(T__0);
				setState(51);
				logical_entity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__2);
				setState(53);
				match(T__0);
				setState(54);
				numeric_entity();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Train_test_measuresContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL() { return getTokens(RuleSetGrammarParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(RuleSetGrammarParser.DECIMAL, i);
		}
		public Train_test_measuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_train_test_measures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterTrain_test_measures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitTrain_test_measures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitTrain_test_measures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Train_test_measuresContext train_test_measures() throws RecognitionException {
		Train_test_measuresContext _localctx = new Train_test_measuresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_train_test_measures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__3);
			setState(58);
			match(T__0);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(59);
				match(T__4);
				setState(60);
				match(DECIMAL);
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(63);
				match(T__5);
				setState(64);
				match(DECIMAL);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(67);
				match(T__6);
				setState(68);
				match(DECIMAL);
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(71);
				match(T__7);
				setState(72);
				match(DECIMAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			logical_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConclusionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RuleSetGrammarParser.IDENTIFIER, 0); }
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalEntityContext extends Logical_exprContext {
		public Logical_entityContext logical_entity() {
			return getRuleContext(Logical_entityContext.class,0);
		}
		public LogicalEntityContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalEntity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends Logical_exprContext {
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public ComparisonExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionInParenContext extends Logical_exprContext {
		public TerminalNode LPAREN() { return getToken(RuleSetGrammarParser.LPAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuleSetGrammarParser.RPAREN, 0); }
		public LogicalExpressionInParenContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalExpressionInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalExpressionInParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalExpressionInParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionAndContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RuleSetGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RuleSetGrammarParser.AND, i);
		}
		public LogicalExpressionAndContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionOrContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(RuleSetGrammarParser.OR, 0); }
		public LogicalExpressionOrContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(80);
				comparison_expr();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(LPAREN);
				setState(82);
				logical_expr(0);
				setState(83);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalEntityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				logical_entity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						match(OR);
						setState(90);
						logical_expr(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(92);
								match(AND);
								setState(93);
								logical_expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(96); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_exprContext extends ParserRuleContext {
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
	 
		public Comparison_exprContext() { }
		public void copyFrom(Comparison_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionParensContext extends Comparison_exprContext {
		public TerminalNode LPAREN() { return getToken(RuleSetGrammarParser.LPAREN, 0); }
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuleSetGrammarParser.RPAREN, 0); }
		public ComparisonExpressionParensContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterComparisonExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitComparisonExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitComparisonExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionWithOperatorContext extends Comparison_exprContext {
		public List<Comparison_operandContext> comparison_operand() {
			return getRuleContexts(Comparison_operandContext.class);
		}
		public Comparison_operandContext comparison_operand(int i) {
			return getRuleContext(Comparison_operandContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public ComparisonExpressionWithOperatorContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterComparisonExpressionWithOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitComparisonExpressionWithOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitComparisonExpressionWithOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison_expr);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				comparison_operand();
				setState(104);
				comp_operator();
				setState(105);
				comparison_operand();
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(LPAREN);
				setState(108);
				comparison_expr();
				setState(109);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operandContext extends ParserRuleContext {
		public Comparison_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operand; }
	 
		public Comparison_operandContext() { }
		public void copyFrom(Comparison_operandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonOperandExprContext extends Comparison_operandContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ComparisonOperandExprContext(Comparison_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterComparisonOperandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitComparisonOperandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitComparisonOperandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonOperandStringContext extends Comparison_operandContext {
		public TerminalNode QUOTED_STRING() { return getToken(RuleSetGrammarParser.QUOTED_STRING, 0); }
		public ComparisonOperandStringContext(Comparison_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterComparisonOperandString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitComparisonOperandString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitComparisonOperandString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operandContext comparison_operand() throws RecognitionException {
		Comparison_operandContext _localctx = new Comparison_operandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison_operand);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LPAREN:
			case DECIMAL:
			case IDENTIFIER:
				_localctx = new ComparisonOperandExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				arithmetic_expr(0);
				}
				break;
			case QUOTED_STRING:
				_localctx = new ComparisonOperandStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(QUOTED_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_operatorContext extends ParserRuleContext {
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
	 
		public Comp_operatorContext() { }
		public void copyFrom(Comp_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorGreaterOrEqualContext extends Comp_operatorContext {
		public TerminalNode GE() { return getToken(RuleSetGrammarParser.GE, 0); }
		public OperatorGreaterOrEqualContext(Comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterOperatorGreaterOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitOperatorGreaterOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitOperatorGreaterOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorNotEqualContext extends Comp_operatorContext {
		public TerminalNode NE() { return getToken(RuleSetGrammarParser.NE, 0); }
		public OperatorNotEqualContext(Comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterOperatorNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitOperatorNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitOperatorNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorEqualContext extends Comp_operatorContext {
		public TerminalNode EQ() { return getToken(RuleSetGrammarParser.EQ, 0); }
		public OperatorEqualContext(Comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterOperatorEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitOperatorEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitOperatorEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorLessThanContext extends Comp_operatorContext {
		public TerminalNode LT() { return getToken(RuleSetGrammarParser.LT, 0); }
		public OperatorLessThanContext(Comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterOperatorLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitOperatorLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitOperatorLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorGreaterThanContext extends Comp_operatorContext {
		public TerminalNode GT() { return getToken(RuleSetGrammarParser.GT, 0); }
		public OperatorGreaterThanContext(Comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterOperatorGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitOperatorGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitOperatorGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorLessOrEqualContext extends Comp_operatorContext {
		public TerminalNode LE() { return getToken(RuleSetGrammarParser.LE, 0); }
		public OperatorLessOrEqualContext(Comp_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterOperatorLessOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitOperatorLessOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitOperatorLessOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp_operator);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new OperatorEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(EQ);
				}
				break;
			case NE:
				_localctx = new OperatorNotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(NE);
				}
				break;
			case LT:
				_localctx = new OperatorLessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(LT);
				}
				break;
			case LE:
				_localctx = new OperatorLessOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(LE);
				}
				break;
			case GT:
				_localctx = new OperatorGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(GT);
				}
				break;
			case GE:
				_localctx = new OperatorGreaterOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(GE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticExpressionMultContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(RuleSetGrammarParser.MULT, 0); }
		public ArithmeticExpressionMultContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionMinusContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(RuleSetGrammarParser.MINUS, 0); }
		public ArithmeticExpressionMinusContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionParensContext extends Arithmetic_exprContext {
		public TerminalNode LPAREN() { return getToken(RuleSetGrammarParser.LPAREN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuleSetGrammarParser.RPAREN, 0); }
		public ArithmeticExpressionParensContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionNumericEntityContext extends Arithmetic_exprContext {
		public Numeric_entityContext numeric_entity() {
			return getRuleContext(Numeric_entityContext.class,0);
		}
		public ArithmeticExpressionNumericEntityContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionNumericEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionNumericEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionNumericEntity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionDivContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(RuleSetGrammarParser.DIV, 0); }
		public ArithmeticExpressionDivContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionPlusContext extends Arithmetic_exprContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RuleSetGrammarParser.PLUS, 0); }
		public ArithmeticExpressionPlusContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionNegationContext extends Arithmetic_exprContext {
		public TerminalNode MINUS() { return getToken(RuleSetGrammarParser.MINUS, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticExpressionNegationContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterArithmeticExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitArithmeticExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitArithmeticExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithmetic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new ArithmeticExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				match(MINUS);
				setState(127);
				arithmetic_expr(3);
				}
				break;
			case LPAREN:
				{
				_localctx = new ArithmeticExpressionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(LPAREN);
				setState(129);
				arithmetic_expr(0);
				setState(130);
				match(RPAREN);
				}
				break;
			case DECIMAL:
			case IDENTIFIER:
				{
				_localctx = new ArithmeticExpressionNumericEntityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				numeric_entity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionMultContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(135);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(136);
						match(MULT);
						setState(137);
						arithmetic_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionDivContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(138);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(139);
						match(DIV);
						setState(140);
						arithmetic_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionPlusContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						match(PLUS);
						setState(143);
						arithmetic_expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionMinusContext(new Arithmetic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						match(MINUS);
						setState(146);
						arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_entityContext extends ParserRuleContext {
		public Logical_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_entity; }
	 
		public Logical_entityContext() { }
		public void copyFrom(Logical_entityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalVariableContext extends Logical_entityContext {
		public TerminalNode IDENTIFIER() { return getToken(RuleSetGrammarParser.IDENTIFIER, 0); }
		public LogicalVariableContext(Logical_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalFalseConstContext extends Logical_entityContext {
		public TerminalNode FALSE() { return getToken(RuleSetGrammarParser.FALSE, 0); }
		public LogicalFalseConstContext(Logical_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalFalseConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalFalseConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalFalseConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalTrueConstContext extends Logical_entityContext {
		public TerminalNode TRUE() { return getToken(RuleSetGrammarParser.TRUE, 0); }
		public LogicalTrueConstContext(Logical_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalTrueConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalTrueConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalTrueConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalStringContext extends Logical_entityContext {
		public TerminalNode QUOTED_STRING() { return getToken(RuleSetGrammarParser.QUOTED_STRING, 0); }
		public LogicalStringContext(Logical_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterLogicalString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitLogicalString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitLogicalString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_entityContext logical_entity() throws RecognitionException {
		Logical_entityContext _localctx = new Logical_entityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logical_entity);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new LogicalTrueConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new LogicalFalseConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(FALSE);
				}
				break;
			case IDENTIFIER:
				_localctx = new LogicalVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_STRING:
				_localctx = new LogicalStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(QUOTED_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_entityContext extends ParserRuleContext {
		public Numeric_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_entity; }
	 
		public Numeric_entityContext() { }
		public void copyFrom(Numeric_entityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericConstContext extends Numeric_entityContext {
		public TerminalNode DECIMAL() { return getToken(RuleSetGrammarParser.DECIMAL, 0); }
		public NumericConstContext(Numeric_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterNumericConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitNumericConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitNumericConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericVariableContext extends Numeric_entityContext {
		public TerminalNode IDENTIFIER() { return getToken(RuleSetGrammarParser.IDENTIFIER, 0); }
		public NumericVariableContext(Numeric_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).enterNumericVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleSetGrammarListener ) ((RuleSetGrammarListener)listener).exitNumericVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleSetGrammarVisitor ) return ((RuleSetGrammarVisitor<? extends T>)visitor).visitNumericVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_entityContext numeric_entity() throws RecognitionException {
		Numeric_entityContext _localctx = new Numeric_entityContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numeric_entity);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
				_localctx = new NumericConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(DECIMAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new NumericVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		case 12:
			return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\3\7\5\7D\n\7\3"+
		"\7\3\7\5\7H\n\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nY\n\n\3\n\3\n\3\n\3\n\3\n\3\n\6\na\n\n\r\n\16\nb\7\ne\n\n\f"+
		"\n\16\nh\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\f\3"+
		"\f\5\fv\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0088\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0096\n\16\f\16\16\16\u0099\13\16\3\17\3\17"+
		"\3\17\3\17\5\17\u009f\n\17\3\20\3\20\5\20\u00a3\n\20\3\20\2\4\22\32\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00b2\2#\3\2\2\2\4&\3\2"+
		"\2\2\6,\3\2\2\2\b/\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16M\3\2\2\2\20O\3\2\2"+
		"\2\22X\3\2\2\2\24q\3\2\2\2\26u\3\2\2\2\30}\3\2\2\2\32\u0087\3\2\2\2\34"+
		"\u009e\3\2\2\2\36\u00a2\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&\'\5\6\4\2\'(\5\b\5\2(*\5\n\6\2)+"+
		"\5\f\7\2*)\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,-\7\34\2\2-.\7\3\2\2.\7\3\2\2"+
		"\2/\60\7\4\2\2\60\61\7\3\2\2\61\62\5\22\n\2\62\t\3\2\2\2\63\64\7\5\2\2"+
		"\64\65\7\3\2\2\65:\5\34\17\2\66\67\7\5\2\2\678\7\3\2\28:\5\36\20\29\63"+
		"\3\2\2\29\66\3\2\2\2:\13\3\2\2\2;<\7\6\2\2<?\7\3\2\2=>\7\7\2\2>@\7\33"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2AB\7\b\2\2BD\7\33\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DG\3\2\2\2EF\7\t\2\2FH\7\33\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IJ"+
		"\7\n\2\2JL\7\33\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MN\5\22\n\2N\17\3\2"+
		"\2\2OP\7\34\2\2P\21\3\2\2\2QR\b\n\1\2RY\5\24\13\2ST\7\31\2\2TU\5\22\n"+
		"\2UV\7\32\2\2VY\3\2\2\2WY\5\34\17\2XQ\3\2\2\2XS\3\2\2\2XW\3\2\2\2Yf\3"+
		"\2\2\2Z[\f\6\2\2[\\\7\f\2\2\\e\5\22\n\7]`\f\7\2\2^_\7\13\2\2_a\5\22\n"+
		"\2`^\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2dZ\3\2\2\2d]\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\23\3\2\2\2hf\3\2\2\2ij\5\26\f\2jk\5"+
		"\30\r\2kl\5\26\f\2lr\3\2\2\2mn\7\31\2\2no\5\24\13\2op\7\32\2\2pr\3\2\2"+
		"\2qi\3\2\2\2qm\3\2\2\2r\25\3\2\2\2sv\5\32\16\2tv\7 \2\2us\3\2\2\2ut\3"+
		"\2\2\2v\27\3\2\2\2w~\7\27\2\2x~\7\30\2\2y~\7\25\2\2z~\7\26\2\2{~\7\23"+
		"\2\2|~\7\24\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3"+
		"\2\2\2~\31\3\2\2\2\177\u0080\b\16\1\2\u0080\u0081\7\22\2\2\u0081\u0088"+
		"\5\32\16\5\u0082\u0083\7\31\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\32"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0088\5\36\20\2\u0087\177\3\2\2\2\u0087"+
		"\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0097\3\2\2\2\u0089\u008a\f\t"+
		"\2\2\u008a\u008b\7\17\2\2\u008b\u0096\5\32\16\n\u008c\u008d\f\b\2\2\u008d"+
		"\u008e\7\20\2\2\u008e\u0096\5\32\16\t\u008f\u0090\f\7\2\2\u0090\u0091"+
		"\7\21\2\2\u0091\u0096\5\32\16\b\u0092\u0093\f\6\2\2\u0093\u0094\7\22\2"+
		"\2\u0094\u0096\5\32\16\7\u0095\u0089\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\33\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f"+
		"\7\r\2\2\u009b\u009f\7\16\2\2\u009c\u009f\7\34\2\2\u009d\u009f\7 \2\2"+
		"\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a3\7\33\2\2\u00a1\u00a3\7\34\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\25#*9?CGKXbdfqu}\u0087"+
		"\u0095\u0097\u009e\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}