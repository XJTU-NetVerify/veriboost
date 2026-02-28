// Generated from org/batfish/grammar/recovery_rule_alts/RecoveryRuleAltsLexer.g4 by ANTLR 4.7.2
package org.batfish.grammar.recovery_rule_alts;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecoveryRuleAltsLexer extends org.batfish.grammar.BatfishLexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, ADDRESS=2, COST=3, DNS=4, INTERFACE=5, IP=6, MTU=7, OSPF=8, PERMIT=9, 
		ROUTING=10, SSH=11, IP_ADDRESS=12, NEWLINE=13, UINT32=14, WS=15, M_Word_WS=16;
	public static final int
		M_Word=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "M_Word"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADDRESS", "COST", "DNS", "INTERFACE", "IP", "MTU", "OSPF", "PERMIT", 
			"ROUTING", "SSH", "IP_ADDRESS", "NEWLINE", "UINT32", "WS", "F_IpAddress", 
			"F_Uint8", "F_PositiveDigit", "F_Digit", "F_Uint32", "F_Whitespace", 
			"F_Newline", "F_Word", "F_WordChar", "M_Word_NEWLINE", "M_Word_WORD", 
			"M_Word_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'address'", "'cost'", "'dns'", "'interface'", "'ip'", "'mtu'", 
			"'ospf'", "'permit'", "'routing'", "'ssh'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WORD", "ADDRESS", "COST", "DNS", "INTERFACE", "IP", "MTU", "OSPF", 
			"PERMIT", "ROUTING", "SSH", "IP_ADDRESS", "NEWLINE", "UINT32", "WS", 
			"M_Word_WS"
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


	public RecoveryRuleAltsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RecoveryRuleAltsLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u014c\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\6\17|\n\17\r\17\16\17}\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0099\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00a3\n\24\3\24\5\24\u00a6\n\24\3\24\5\24\u00a9\n"+
		"\24\3\24\5\24\u00ac\n\24\3\24\5\24\u00af\n\24\3\24\5\24\u00b2\n\24\3\24"+
		"\5\24\u00b5\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012b\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\6\27\u0132\n\27\r\27\16\27\u0133\3\30\5\30\u0137\n\30\3\31\6\31"+
		"\u013a\n\31\r\31\16\31\u013b\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\6\33\u0147\n\33\r\33\16\33\u0148\3\33\3\33\2\2\34\4\4\6\5\b\6\n\7"+
		"\f\b\16\t\20\n\22\13\24\f\26\r\30\16\32\17\34\20\36\21 \2\"\2$\2&\2(\2"+
		"*\2,\2.\2\60\2\62\2\64\2\66\22\4\2\3\16\3\2\62\66\3\2\62\67\3\2\63;\3"+
		"\2\62;\3\2\63\65\3\2\62\63\3\2\62:\3\2\62\65\3\2\628\6\2\13\13\16\16\""+
		"\"\u00a2\u00a2\4\2\f\f\17\17\13\2##%(*-/=??B\\`ac}\177\177\2\u015b\2\4"+
		"\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2"+
		"\2\2\48\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\fU\3\2\2\2\16X\3\2\2"+
		"\2\20\\\3\2\2\2\22a\3\2\2\2\24h\3\2\2\2\26p\3\2\2\2\30t\3\2\2\2\32v\3"+
		"\2\2\2\34x\3\2\2\2\36{\3\2\2\2 \u0081\3\2\2\2\"\u0098\3\2\2\2$\u009a\3"+
		"\2\2\2&\u009c\3\2\2\2(\u012a\3\2\2\2*\u012c\3\2\2\2,\u012e\3\2\2\2.\u0131"+
		"\3\2\2\2\60\u0136\3\2\2\2\62\u0139\3\2\2\2\64\u0140\3\2\2\2\66\u0146\3"+
		"\2\2\289\7c\2\29:\7f\2\2:;\7f\2\2;<\7t\2\2<=\7g\2\2=>\7u\2\2>?\7u\2\2"+
		"?\5\3\2\2\2@A\7e\2\2AB\7q\2\2BC\7u\2\2CD\7v\2\2D\7\3\2\2\2EF\7f\2\2FG"+
		"\7p\2\2GH\7u\2\2H\t\3\2\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2LM\7g\2\2MN\7t\2"+
		"\2NO\7h\2\2OP\7c\2\2PQ\7e\2\2QR\7g\2\2RS\3\2\2\2ST\b\5\2\2T\13\3\2\2\2"+
		"UV\7k\2\2VW\7r\2\2W\r\3\2\2\2XY\7o\2\2YZ\7v\2\2Z[\7w\2\2[\17\3\2\2\2\\"+
		"]\7q\2\2]^\7u\2\2^_\7r\2\2_`\7h\2\2`\21\3\2\2\2ab\7r\2\2bc\7g\2\2cd\7"+
		"t\2\2de\7o\2\2ef\7k\2\2fg\7v\2\2g\23\3\2\2\2hi\7t\2\2ij\7q\2\2jk\7w\2"+
		"\2kl\7v\2\2lm\7k\2\2mn\7p\2\2no\7i\2\2o\25\3\2\2\2pq\7u\2\2qr\7u\2\2r"+
		"s\7j\2\2s\27\3\2\2\2tu\5 \20\2u\31\3\2\2\2vw\5,\26\2w\33\3\2\2\2xy\5("+
		"\24\2y\35\3\2\2\2z|\5*\25\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\b\17\3\2\u0080\37\3\2\2\2\u0081\u0082\5\"\21\2\u0082"+
		"\u0083\7\60\2\2\u0083\u0084\5\"\21\2\u0084\u0085\7\60\2\2\u0085\u0086"+
		"\5\"\21\2\u0086\u0087\7\60\2\2\u0087\u0088\5\"\21\2\u0088!\3\2\2\2\u0089"+
		"\u0099\5&\23\2\u008a\u008b\5$\22\2\u008b\u008c\5&\23\2\u008c\u0099\3\2"+
		"\2\2\u008d\u008e\7\63\2\2\u008e\u008f\5&\23\2\u008f\u0090\5&\23\2\u0090"+
		"\u0099\3\2\2\2\u0091\u0092\7\64\2\2\u0092\u0093\t\2\2\2\u0093\u0099\5"+
		"&\23\2\u0094\u0095\7\64\2\2\u0095\u0096\7\67\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\t\3\2\2\u0098\u0089\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u008d\3\2"+
		"\2\2\u0098\u0091\3\2\2\2\u0098\u0094\3\2\2\2\u0099#\3\2\2\2\u009a\u009b"+
		"\t\4\2\2\u009b%\3\2\2\2\u009c\u009d\t\5\2\2\u009d\'\3\2\2\2\u009e\u012b"+
		"\5&\23\2\u009f\u00a0\5$\22\2\u00a0\u00a2\5&\23\2\u00a1\u00a3\5&\23\2\u00a2"+
		"\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5&"+
		"\23\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a9\5&\23\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00ac\5&\23\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00af\5&\23\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5&\23\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5&\23\2\u00b4\u00b3\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u012b\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7"+
		"\u00b8\5&\23\2\u00b8\u00b9\5&\23\2\u00b9\u00ba\5&\23\2\u00ba\u00bb\5&"+
		"\23\2\u00bb\u00bc\5&\23\2\u00bc\u00bd\5&\23\2\u00bd\u00be\5&\23\2\u00be"+
		"\u00bf\5&\23\2\u00bf\u00c0\5&\23\2\u00c0\u012b\3\2\2\2\u00c1\u00c2\7\66"+
		"\2\2\u00c2\u00c3\t\7\2\2\u00c3\u00c4\5&\23\2\u00c4\u00c5\5&\23\2\u00c5"+
		"\u00c6\5&\23\2\u00c6\u00c7\5&\23\2\u00c7\u00c8\5&\23\2\u00c8\u00c9\5&"+
		"\23\2\u00c9\u00ca\5&\23\2\u00ca\u00cb\5&\23\2\u00cb\u012b\3\2\2\2\u00cc"+
		"\u00cd\7\66\2\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\t"+
		"\b\2\2\u00d0\u00d1\5&\23\2\u00d1\u00d2\5&\23\2\u00d2\u00d3\5&\23\2\u00d3"+
		"\u00d4\5&\23\2\u00d4\u00d5\5&\23\2\u00d5\u00d6\5&\23\2\u00d6\u00d7\5&"+
		"\23\2\u00d7\u012b\3\2\2\2\u00d8\u00d9\7\66\2\2\u00d9\u00da\7\64\2\2\u00da"+
		"\u00db\7;\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\t\t\2\2\u00dd\u00de\5&\23"+
		"\2\u00de\u00df\5&\23\2\u00df\u00e0\5&\23\2\u00e0\u00e1\5&\23\2\u00e1\u00e2"+
		"\5&\23\2\u00e2\u00e3\5&\23\2\u00e3\u012b\3\2\2\2\u00e4\u00e5\7\66\2\2"+
		"\u00e5\u00e6\7\64\2\2\u00e6\u00e7\7;\2\2\u00e7\u00e8\7\66\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\t\b\2\2\u00ea\u00eb\5&\23\2\u00eb\u00ec\5&\23\2\u00ec"+
		"\u00ed\5&\23\2\u00ed\u00ee\5&\23\2\u00ee\u00ef\5&\23\2\u00ef\u012b\3\2"+
		"\2\2\u00f0\u00f1\7\66\2\2\u00f1\u00f2\7\64\2\2\u00f2\u00f3\7;\2\2\u00f3"+
		"\u00f4\7\66\2\2\u00f4\u00f5\7;\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\t\3"+
		"\2\2\u00f7\u00f8\5&\23\2\u00f8\u00f9\5&\23\2\u00f9\u00fa\5&\23\2\u00fa"+
		"\u00fb\5&\23\2\u00fb\u012b\3\2\2\2\u00fc\u00fd\7\66\2\2\u00fd\u00fe\7"+
		"\64\2\2\u00fe\u00ff\7;\2\2\u00ff\u0100\7\66\2\2\u0100\u0101\7;\2\2\u0101"+
		"\u0102\78\2\2\u0102\u0103\3\2\2\2\u0103\u0104\t\n\2\2\u0104\u0105\5&\23"+
		"\2\u0105\u0106\5&\23\2\u0106\u0107\5&\23\2\u0107\u012b\3\2\2\2\u0108\u0109"+
		"\7\66\2\2\u0109\u010a\7\64\2\2\u010a\u010b\7;\2\2\u010b\u010c\7\66\2\2"+
		"\u010c\u010d\7;\2\2\u010d\u010e\78\2\2\u010e\u010f\79\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\t\7\2\2\u0111\u0112\5&\23\2\u0112\u0113\5&\23\2\u0113"+
		"\u012b\3\2\2\2\u0114\u0115\7\66\2\2\u0115\u0116\7\64\2\2\u0116\u0117\7"+
		";\2\2\u0117\u0118\7\66\2\2\u0118\u0119\7;\2\2\u0119\u011a\78\2\2\u011a"+
		"\u011b\79\2\2\u011b\u011c\7\64\2\2\u011c\u011d\3\2\2\2\u011d\u011e\t\b"+
		"\2\2\u011e\u012b\5&\23\2\u011f\u0120\7\66\2\2\u0120\u0121\7\64\2\2\u0121"+
		"\u0122\7;\2\2\u0122\u0123\7\66\2\2\u0123\u0124\7;\2\2\u0124\u0125\78\2"+
		"\2\u0125\u0126\79\2\2\u0126\u0127\7\64\2\2\u0127\u0128\7;\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012b\t\3\2\2\u012a\u009e\3\2\2\2\u012a\u009f\3\2\2\2\u012a"+
		"\u00b6\3\2\2\2\u012a\u00c1\3\2\2\2\u012a\u00cc\3\2\2\2\u012a\u00d8\3\2"+
		"\2\2\u012a\u00e4\3\2\2\2\u012a\u00f0\3\2\2\2\u012a\u00fc\3\2\2\2\u012a"+
		"\u0108\3\2\2\2\u012a\u0114\3\2\2\2\u012a\u011f\3\2\2\2\u012b)\3\2\2\2"+
		"\u012c\u012d\t\13\2\2\u012d+\3\2\2\2\u012e\u012f\t\f\2\2\u012f-\3\2\2"+
		"\2\u0130\u0132\5\60\30\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134/\3\2\2\2\u0135\u0137\t\r\2\2"+
		"\u0136\u0135\3\2\2\2\u0137\61\3\2\2\2\u0138\u013a\5,\26\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\b\31\4\2\u013e\u013f\b\31\5\2\u013f\63\3\2"+
		"\2\2\u0140\u0141\5.\27\2\u0141\u0142\3\2\2\2\u0142\u0143\b\32\6\2\u0143"+
		"\u0144\b\32\5\2\u0144\65\3\2\2\2\u0145\u0147\5*\25\2\u0146\u0145\3\2\2"+
		"\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\b\33\3\2\u014b\67\3\2\2\2\22\2\3}\u0098\u00a2\u00a5"+
		"\u00a8\u00ab\u00ae\u00b1\u00b4\u012a\u0133\u0136\u013b\u0148\7\7\3\2\2"+
		"\3\2\t\17\2\6\2\2\t\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}