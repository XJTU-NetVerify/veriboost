// Generated from org/batfish/grammar/juniper/JuniperParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.juniper;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuniperParser extends org.batfish.grammar.BatfishParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPLACE=1, CLOSE_BRACE=2, CLOSE_BRACKET=3, CLOSE_PAREN=4, START_FLAT_LINE=5, 
		INACTIVE=6, COMMENT_LINE=7, MULTILINE_COMMENT=8, OPEN_BRACE=9, OPEN_BRACKET=10, 
		OPEN_PAREN=11, SEMICOLON=12, WORD=13, NEWLINE=14, WS=15, M_FLAT_LINE_WS=16;
	public static final int
		RULE_braced_clause = 0, RULE_bracketed_clause = 1, RULE_juniper_configuration = 2, 
		RULE_statement = 3, RULE_flat_statement = 4, RULE_hierarchical_statement = 5, 
		RULE_terminator = 6, RULE_word = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"braced_clause", "bracketed_clause", "juniper_configuration", "statement", 
			"flat_statement", "hierarchical_statement", "terminator", "word"
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

	@Override
	public String getGrammarFileName() { return "JuniperParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuniperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Braced_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(JuniperParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(JuniperParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Braced_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braced_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterBraced_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitBraced_clause(this);
		}
	}

	public final Braced_clauseContext braced_clause() throws RecognitionException {
		Braced_clauseContext _localctx = new Braced_clauseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_braced_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(OPEN_BRACE);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPLACE) | (1L << START_FLAT_LINE) | (1L << INACTIVE) | (1L << WORD))) != 0)) {
				{
				{
				setState(17);
				statement();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(CLOSE_BRACE);
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

	public static class Bracketed_clauseContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(JuniperParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(JuniperParser.CLOSE_BRACKET, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Bracketed_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterBracketed_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitBracketed_clause(this);
		}
	}

	public final Bracketed_clauseContext bracketed_clause() throws RecognitionException {
		Bracketed_clauseContext _localctx = new Bracketed_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bracketed_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(OPEN_BRACKET);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				word();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(31);
			match(CLOSE_BRACKET);
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

	public static class Juniper_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JuniperParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Juniper_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_juniper_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterJuniper_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitJuniper_configuration(this);
		}
	}

	public final Juniper_configurationContext juniper_configuration() throws RecognitionException {
		Juniper_configurationContext _localctx = new Juniper_configurationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_juniper_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPLACE) | (1L << START_FLAT_LINE) | (1L << INACTIVE) | (1L << WORD))) != 0) );
			setState(38);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public Flat_statementContext flat_statement() {
			return getRuleContext(Flat_statementContext.class,0);
		}
		public Hierarchical_statementContext hierarchical_statement() {
			return getRuleContext(Hierarchical_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_FLAT_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				flat_statement();
				}
				break;
			case REPLACE:
			case INACTIVE:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				hierarchical_statement();
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

	public static class Flat_statementContext extends ParserRuleContext {
		public WordContext word;
		public List<WordContext> words = new ArrayList<WordContext>();
		public TerminalNode START_FLAT_LINE() { return getToken(JuniperParser.START_FLAT_LINE, 0); }
		public TerminalNode NEWLINE() { return getToken(JuniperParser.NEWLINE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Flat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterFlat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitFlat_statement(this);
		}
	}

	public final Flat_statementContext flat_statement() throws RecognitionException {
		Flat_statementContext _localctx = new Flat_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_flat_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(START_FLAT_LINE);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				((Flat_statementContext)_localctx).word = word();
				((Flat_statementContext)_localctx).words.add(((Flat_statementContext)_localctx).word);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(50);
			match(NEWLINE);
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

	public static class Hierarchical_statementContext extends ParserRuleContext {
		public WordContext word;
		public List<WordContext> words = new ArrayList<WordContext>();
		public Braced_clauseContext braced_clause() {
			return getRuleContext(Braced_clauseContext.class,0);
		}
		public Bracketed_clauseContext bracketed_clause() {
			return getRuleContext(Bracketed_clauseContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode INACTIVE() { return getToken(JuniperParser.INACTIVE, 0); }
		public TerminalNode REPLACE() { return getToken(JuniperParser.REPLACE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public Hierarchical_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchical_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterHierarchical_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitHierarchical_statement(this);
		}
	}

	public final Hierarchical_statementContext hierarchical_statement() throws RecognitionException {
		Hierarchical_statementContext _localctx = new Hierarchical_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hierarchical_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPLACE || _la==INACTIVE) {
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==REPLACE || _la==INACTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				((Hierarchical_statementContext)_localctx).word = word();
				((Hierarchical_statementContext)_localctx).words.add(((Hierarchical_statementContext)_localctx).word);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(60);
				braced_clause();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(61);
				bracketed_clause();
				setState(62);
				terminator();
				}
				break;
			case SEMICOLON:
				{
				setState(64);
				terminator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(JuniperParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(SEMICOLON);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(JuniperParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniperParserListener ) ((JuniperParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(WORD);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4\6"+
		"\4%\n\4\r\4\16\4&\3\4\3\4\3\5\3\5\5\5-\n\5\3\6\3\6\6\6\61\n\6\r\6\16\6"+
		"\62\3\6\3\6\3\7\5\78\n\7\3\7\6\7;\n\7\r\7\16\7<\3\7\3\7\3\7\3\7\3\7\5"+
		"\7D\n\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\3\3\b\b\2"+
		"J\2\22\3\2\2\2\4\33\3\2\2\2\6$\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f\67\3\2"+
		"\2\2\16E\3\2\2\2\20G\3\2\2\2\22\26\7\13\2\2\23\25\5\b\5\2\24\23\3\2\2"+
		"\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2"+
		"\2\31\32\7\4\2\2\32\3\3\2\2\2\33\35\7\f\2\2\34\36\5\20\t\2\35\34\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\5\2\2\"\5\3"+
		"\2\2\2#%\5\b\5\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2("+
		")\7\2\2\3)\7\3\2\2\2*-\5\n\6\2+-\5\f\7\2,*\3\2\2\2,+\3\2\2\2-\t\3\2\2"+
		"\2.\60\7\7\2\2/\61\5\20\t\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\3\2\2\2\64\65\7\20\2\2\65\13\3\2\2\2\668\t\2\2\2\67"+
		"\66\3\2\2\2\678\3\2\2\28:\3\2\2\29;\5\20\t\2:9\3\2\2\2;<\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=C\3\2\2\2>D\5\2\2\2?@\5\4\3\2@A\5\16\b\2AD\3\2\2\2BD\5"+
		"\16\b\2C>\3\2\2\2C?\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EF\7\16\2\2F\17\3\2\2"+
		"\2GH\7\17\2\2H\21\3\2\2\2\n\26\37&,\62\67<C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}