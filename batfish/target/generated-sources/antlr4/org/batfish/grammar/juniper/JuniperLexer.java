// Generated from org/batfish/grammar/juniper/JuniperLexer.g4 by ANTLR 4.7.2
package org.batfish.grammar.juniper;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuniperLexer extends org.batfish.grammar.juniper.parsing.JuniperBaseLexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPLACE=1, CLOSE_BRACE=2, CLOSE_BRACKET=3, CLOSE_PAREN=4, START_FLAT_LINE=5, 
		INACTIVE=6, COMMENT_LINE=7, MULTILINE_COMMENT=8, OPEN_BRACE=9, OPEN_BRACKET=10, 
		OPEN_PAREN=11, SEMICOLON=12, WORD=13, NEWLINE=14, WS=15, M_FLAT_LINE_WS=16;
	public static final int
		M_FLAT_LINE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "M_FLAT_LINE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REPLACE", "CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PAREN", "START_FLAT_LINE", 
			"INACTIVE", "COMMENT_LINE", "MULTILINE_COMMENT", "OPEN_BRACE", "OPEN_BRACKET", 
			"OPEN_PAREN", "SEMICOLON", "WORD", "NEWLINE", "WS", "M_FLAT_LINE_WORD", 
			"M_FLAT_LINE_NEWLINE", "M_FLAT_LINE_WS", "F_NewlineChar", "F_NonNewlineChar", 
			"F_ParenString", "F_QuotedString", "F_WhitespaceChar", "F_WordChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'replace:'", "'}'", "']'", "')'", null, "'inactive:'", null, null, 
			"'{'", "'['", "'('", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPLACE", "CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PAREN", "START_FLAT_LINE", 
			"INACTIVE", "COMMENT_LINE", "MULTILINE_COMMENT", "OPEN_BRACE", "OPEN_BRACKET", 
			"OPEN_PAREN", "SEMICOLON", "WORD", "NEWLINE", "WS", "M_FLAT_LINE_WS"
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


	boolean enableIPV6_ADDRESS = true;
	boolean enableIP_ADDRESS = true;
	boolean enableDEC = true;

	@Override
	public String printStateVariables() {
	   StringBuilder sb = new StringBuilder();
	   sb.append("enableIPV6_ADDRESS: " + enableIPV6_ADDRESS + "\n");
	   sb.append("enableIP_ADDRESS: " + enableIP_ADDRESS + "\n");
	   sb.append("enableDEC: " + enableDEC + "\n");
	   return sb.toString();
	}



	public JuniperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JuniperLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return START_FLAT_LINE_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return COMMENT_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean START_FLAT_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return lastTokenType() == -1 || lastTokenType() == NEWLINE;
		}
		return true;
	}
	private boolean COMMENT_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return lastTokenType() == -1 || lastTokenType() == NEWLINE;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00f0\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3\b\7\b\u0084\n"+
		"\b\f\b\16\b\u0087\13\b\3\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\5\b\u008f"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\6\16\u00ac"+
		"\n\16\r\16\16\16\u00ad\5\16\u00b0\n\16\3\17\6\17\u00b3\n\17\r\17\16\17"+
		"\u00b4\3\17\3\17\3\20\6\20\u00ba\n\20\r\20\16\20\u00bb\3\20\3\20\3\21"+
		"\3\21\3\21\6\21\u00c3\n\21\r\21\16\21\u00c4\5\21\u00c7\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u00d1\n\23\r\23\16\23\u00d2\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00dd\n\26\f\26\16\26\u00e0\13"+
		"\26\3\26\3\26\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\u0098\2\32\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22"+
		"\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\2$\2&\22(\2*\2,\2.\2\60\2\62"+
		"\2\4\2\3\b\4\2##%%\4\2\f\f\17\17\3\2++\3\2$$\5\2\13\13\16\16\"\"\f\2\13"+
		"\f\16\17\"\"$%*+==]]__}}\177\177\2\u00fd\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3"+
		"\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2"+
		"\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36"+
		"\3\2\2\2\2 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\4\64\3\2\2\2\6="+
		"\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fF\3\2\2\2\16p\3\2\2\2\20}\3\2\2\2\22\u0092"+
		"\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6\3"+
		"\2\2\2\34\u00af\3\2\2\2\36\u00b2\3\2\2\2 \u00b9\3\2\2\2\"\u00c6\3\2\2"+
		"\2$\u00ca\3\2\2\2&\u00d0\3\2\2\2(\u00d6\3\2\2\2*\u00d8\3\2\2\2,\u00da"+
		"\3\2\2\2.\u00e3\3\2\2\2\60\u00ec\3\2\2\2\62\u00ee\3\2\2\2\64\65\7t\2\2"+
		"\65\66\7g\2\2\66\67\7r\2\2\678\7n\2\289\7c\2\29:\7e\2\2:;\7g\2\2;<\7<"+
		"\2\2<\5\3\2\2\2=>\7\177\2\2>\7\3\2\2\2?@\7_\2\2@\t\3\2\2\2AB\7+\2\2B\13"+
		"\3\2\2\2CE\5\60\30\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2Gj\3\2\2\2"+
		"HF\3\2\2\2IJ\7c\2\2JK\7e\2\2KL\7v\2\2LM\7k\2\2MN\7x\2\2NO\7c\2\2OP\7v"+
		"\2\2Pk\7g\2\2QR\7f\2\2RS\7g\2\2ST\7c\2\2TU\7e\2\2UV\7v\2\2VW\7k\2\2WX"+
		"\7x\2\2XY\7c\2\2YZ\7v\2\2Zk\7g\2\2[\\\7f\2\2\\]\7g\2\2]^\7n\2\2^_\7g\2"+
		"\2_`\7v\2\2`k\7g\2\2ab\7k\2\2bc\7p\2\2cd\7u\2\2de\7g\2\2ef\7t\2\2fk\7"+
		"v\2\2gh\7u\2\2hi\7g\2\2ik\7v\2\2jI\3\2\2\2jQ\3\2\2\2j[\3\2\2\2ja\3\2\2"+
		"\2jg\3\2\2\2kl\3\2\2\2lm\6\6\2\2mn\3\2\2\2no\b\6\2\2o\r\3\2\2\2pq\7k\2"+
		"\2qr\7p\2\2rs\7c\2\2st\7e\2\2tu\7v\2\2uv\7k\2\2vw\7x\2\2wx\7g\2\2xy\7"+
		"<\2\2y\17\3\2\2\2z|\5\60\30\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2"+
		"\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\t\2\2\2\u0081\u0085\6\b\3\2"+
		"\u0082\u0084\5*\25\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008e\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\5(\24\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008f\7\2\2\3\u008e"+
		"\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\b"+
		"\3\2\u0091\21\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7,\2\2\u0094\u0098"+
		"\3\2\2\2\u0095\u0097\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7,\2\2\u009c\u009d\7\61\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\t\3\2\u009f\23\3\2\2\2\u00a0\u00a1\7}\2\2\u00a1\25\3\2\2\2\u00a2"+
		"\u00a3\7]\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\31\3\2\2\2\u00a6"+
		"\u00a7\7=\2\2\u00a7\33\3\2\2\2\u00a8\u00b0\5.\27\2\u00a9\u00b0\5,\26\2"+
		"\u00aa\u00ac\5\62\31\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a8\3\2\2\2\u00af"+
		"\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00b3\5(\24"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\17\4\2\u00b7\37\3\2\2\2\u00b8"+
		"\u00ba\5\60\30\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\20\3\2\u00be"+
		"!\3\2\2\2\u00bf\u00c7\5.\27\2\u00c0\u00c7\5,\26\2\u00c1\u00c3\5\62\31"+
		"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\21\5\2\u00c9#\3\2\2\2"+
		"\u00ca\u00cb\5(\24\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\22\6\2\u00cd\u00ce"+
		"\b\22\7\2\u00ce%\3\2\2\2\u00cf\u00d1\5\60\30\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\b\23\3\2\u00d5\'\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7)\3"+
		"\2\2\2\u00d8\u00d9\n\3\2\2\u00d9+\3\2\2\2\u00da\u00de\7*\2\2\u00db\u00dd"+
		"\n\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7+"+
		"\2\2\u00e2-\3\2\2\2\u00e3\u00e7\7$\2\2\u00e4\u00e6\n\5\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7$\2\2\u00eb/\3\2\2\2\u00ec"+
		"\u00ed\t\6\2\2\u00ed\61\3\2\2\2\u00ee\u00ef\n\7\2\2\u00ef\63\3\2\2\2\24"+
		"\2\3Fj}\u0085\u008b\u008e\u0098\u00ad\u00af\u00b4\u00bb\u00c4\u00c6\u00d2"+
		"\u00de\u00e7\b\7\3\2\b\2\2\2\3\2\t\17\2\t\20\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}