package com;// Generated from /Users/jack/Documents/ideaWorkspace/ruleset-pmml/src/main/antlr4/RuleSetGrammar.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AND=9, 
		OR=10, TRUE=11, FALSE=12, MULT=13, DIV=14, PLUS=15, MINUS=16, GT=17, GE=18, 
		LT=19, LE=20, EQ=21, NE=22, LPAREN=23, RPAREN=24, DECIMAL=25, IDENTIFIER=26, 
		SEMI=27, COMMENT=28, WS=29, QUOTED_STRING=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "AND", 
			"OR", "TRUE", "FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "EQ", "NE", "LPAREN", "RPAREN", "DECIMAL", "IDENTIFIER", "SEMI", 
			"COMMENT", "WS", "ESCAPED_QUOTE", "QUOTED_STRING"
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


	public RuleSetGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

//	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\13\3\13\5\13\u00a4\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3\n\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27\3\27\3\27\5\27\u00e0"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\5\32\u00e7\n\32\3\32\6\32\u00ea\n\32\r"+
		"\32\16\32\u00eb\3\32\3\32\6\32\u00f0\n\32\r\32\16\32\u00f1\5\32\u00f4"+
		"\n\32\3\33\3\33\7\33\u00f8\n\33\f\33\16\33\u00fb\13\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\6\35\u0103\n\35\r\35\16\35\u0104\3\35\5\35\u0108\n\35"+
		"\3\35\3\35\3\36\6\36\u010d\n\36\r\36\16\36\u010e\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \7 \u0119\n \f \16 \u011c\13 \3 \3 \4\u0104\u011a\2!\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?"+
		" \3\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7M\3\2\2\2"+
		"\tX\3\2\2\2\13o\3\2\2\2\r{\3\2\2\2\17\u0085\3\2\2\2\21\u0090\3\2\2\2\23"+
		"\u009d\3\2\2\2\25\u00a3\3\2\2\2\27\u00b1\3\2\2\2\31\u00c2\3\2\2\2\33\u00c4"+
		"\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8\3\2\2\2!\u00ca\3\2\2\2#\u00cc\3\2\2"+
		"\2%\u00ce\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d9\3\2\2\2-\u00df"+
		"\3\2\2\2/\u00e1\3\2\2\2\61\u00e3\3\2\2\2\63\u00e6\3\2\2\2\65\u00f5\3\2"+
		"\2\2\67\u00fc\3\2\2\29\u00fe\3\2\2\2;\u010c\3\2\2\2=\u0112\3\2\2\2?\u0115"+
		"\3\2\2\2AB\7<\2\2B\4\3\2\2\2CD\7R\2\2DE\7T\2\2EF\7G\2\2FG\7F\2\2GH\7K"+
		"\2\2HI\7E\2\2IJ\7C\2\2JK\7V\2\2KL\7G\2\2L\6\3\2\2\2MN\7R\2\2NO\7T\2\2"+
		"OP\7G\2\2PQ\7F\2\2QR\7K\2\2RS\7E\2\2ST\7V\2\2TU\7K\2\2UV\7Q\2\2VW\7P\2"+
		"\2W\b\3\2\2\2XY\7V\2\2YZ\7t\2\2Z[\7c\2\2[\\\7k\2\2\\]\7p\2\2]^\7k\2\2"+
		"^_\7p\2\2_`\7i\2\2`a\7\61\2\2ab\7v\2\2bc\7g\2\2cd\7u\2\2de\7v\2\2ef\7"+
		"\"\2\2fg\7o\2\2gh\7g\2\2hi\7c\2\2ij\7u\2\2jk\7w\2\2kl\7t\2\2lm\7g\2\2"+
		"mn\7u\2\2n\n\3\2\2\2op\7t\2\2pq\7g\2\2qr\7e\2\2rs\7q\2\2st\7t\2\2tu\7"+
		"f\2\2uv\7E\2\2vw\7q\2\2wx\7w\2\2xy\7p\2\2yz\7v\2\2z\f\3\2\2\2{|\7p\2\2"+
		"|}\7d\2\2}~\7E\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7e\2\2\u0083\u0084\7v\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087\u0088\7p\2\2\u0088\u0089\7h\2\2"+
		"\u0089\u008a\7k\2\2\u008a\u008b\7f\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7e\2\2\u008e\u008f\7g\2\2\u008f\20\3\2\2\2\u0090\u0091"+
		"\7y\2\2\u0091\u0092\7g\2\2\u0092\u0093\7k\2\2\u0093\u0094\7i\2\2\u0094"+
		"\u0095\7j\2\2\u0095\u0096\7v\2\2\u0096\22\3\2\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009e\7f\2\2\u009a\u009b\7C\2\2\u009b\u009c\7P\2\2"+
		"\u009c\u009e\7F\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\24\3"+
		"\2\2\2\u009f\u00a0\7q\2\2\u00a0\u00a4\7t\2\2\u00a1\u00a2\7Q\2\2\u00a2"+
		"\u00a4\7T\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\26\3\2\2\2"+
		"\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7w\2\2\u00a8\u00b2"+
		"\7g\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7w\2\2\u00ac"+
		"\u00b2\7g\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7W\2\2"+
		"\u00b0\u00b2\7G\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00c3\7g\2\2\u00b8\u00b9\7H\2\2"+
		"\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00c3"+
		"\7g\2\2\u00bd\u00be\7H\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7N\2\2\u00c0"+
		"\u00c1\7U\2\2\u00c1\u00c3\7G\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b8\3\2\2"+
		"\2\u00c2\u00bd\3\2\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\34\3"+
		"\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9"+
		" \3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd"+
		"$\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d0\7?\2\2\u00d0&\3\2\2\2\u00d1\u00d2"+
		"\7>\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7?\2\2\u00d5*\3"+
		"\2\2\2\u00d6\u00da\7?\2\2\u00d7\u00d8\7?\2\2\u00d8\u00da\7?\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da,\3\2\2\2\u00db\u00dc\7>\2\2\u00dc"+
		"\u00e0\7@\2\2\u00dd\u00de\7#\2\2\u00de\u00e0\7?\2\2\u00df\u00db\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2\60\3\2"+
		"\2\2\u00e3\u00e4\7+\2\2\u00e4\62\3\2\2\2\u00e5\u00e7\7/\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ef\7\60\2\2\u00ee\u00f0\t\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\64\3\2\2\2\u00f5\u00f9\t\3\2\2\u00f6\u00f8\t\4\2\2\u00f7\u00f6\3\2\2"+
		"\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\66"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7=\2\2\u00fd8\3\2\2\2\u00fe\u00ff"+
		"\7\61\2\2\u00ff\u0100\7\61\2\2\u0100\u0102\3\2\2\2\u0101\u0103\13\2\2"+
		"\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b\35\2\2\u010a:\3\2\2\2\u010b\u010d\t\6\2\2"+
		"\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b\36\2\2\u0111<\3\2\2\2\u0112"+
		"\u0113\7^\2\2\u0113\u0114\7$\2\2\u0114>\3\2\2\2\u0115\u011a\7$\2\2\u0116"+
		"\u0119\5=\37\2\u0117\u0119\n\7\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7$\2\2\u011e@\3\2\2\2\23"+
		"\2\u009d\u00a3\u00b1\u00c2\u00d9\u00df\u00e6\u00eb\u00f1\u00f3\u00f9\u0104"+
		"\u0107\u010e\u0118\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}