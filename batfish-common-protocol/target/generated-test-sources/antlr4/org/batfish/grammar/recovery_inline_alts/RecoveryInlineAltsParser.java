// Generated from org/batfish/grammar/recovery_inline_alts/RecoveryInlineAltsParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.recovery_inline_alts;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecoveryInlineAltsParser extends org.batfish.grammar.BatfishParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, ADDRESS=2, COST=3, DNS=4, INTERFACE=5, IP=6, MTU=7, OSPF=8, PERMIT=9, 
		ROUTING=10, SSH=11, IP_ADDRESS=12, NEWLINE=13, UINT32=14, WS=15, M_Word_WS=16;
	public static final int
		RULE_recovery_inline_alts_configuration = 0, RULE_s_interface = 1, RULE_i_ip = 2, 
		RULE_iip_address = 3, RULE_iip_ospf_cost = 4, RULE_i_mtu = 5, RULE_i_permit = 6, 
		RULE_s_ip = 7, RULE_ip_routing = 8, RULE_s_permit = 9, RULE_ip_address = 10, 
		RULE_structure_name = 11, RULE_uint32 = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"recovery_inline_alts_configuration", "s_interface", "i_ip", "iip_address", 
			"iip_ospf_cost", "i_mtu", "i_permit", "s_ip", "ip_routing", "s_permit", 
			"ip_address", "structure_name", "uint32"
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

	@Override
	public String getGrammarFileName() { return "RecoveryInlineAltsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RecoveryInlineAltsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Recovery_inline_alts_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RecoveryInlineAltsParser.EOF, 0); }
		public List<S_interfaceContext> s_interface() {
			return getRuleContexts(S_interfaceContext.class);
		}
		public S_interfaceContext s_interface(int i) {
			return getRuleContext(S_interfaceContext.class,i);
		}
		public List<S_ipContext> s_ip() {
			return getRuleContexts(S_ipContext.class);
		}
		public S_ipContext s_ip(int i) {
			return getRuleContext(S_ipContext.class,i);
		}
		public List<S_permitContext> s_permit() {
			return getRuleContexts(S_permitContext.class);
		}
		public S_permitContext s_permit(int i) {
			return getRuleContext(S_permitContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RecoveryInlineAltsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RecoveryInlineAltsParser.NEWLINE, i);
		}
		public Recovery_inline_alts_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recovery_inline_alts_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterRecovery_inline_alts_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitRecovery_inline_alts_configuration(this);
		}
	}

	public final Recovery_inline_alts_configurationContext recovery_inline_alts_configuration() throws RecognitionException {
		Recovery_inline_alts_configurationContext _localctx = new Recovery_inline_alts_configurationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_recovery_inline_alts_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERFACE) | (1L << IP) | (1L << PERMIT) | (1L << NEWLINE))) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTERFACE:
					{
					setState(26);
					s_interface();
					}
					break;
				case IP:
					{
					setState(27);
					s_ip();
					}
					break;
				case PERMIT:
					{
					setState(28);
					s_permit();
					}
					break;
				case NEWLINE:
					{
					setState(29);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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

	public static class S_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(RecoveryInlineAltsParser.INTERFACE, 0); }
		public Structure_nameContext structure_name() {
			return getRuleContext(Structure_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public List<I_ipContext> i_ip() {
			return getRuleContexts(I_ipContext.class);
		}
		public I_ipContext i_ip(int i) {
			return getRuleContext(I_ipContext.class,i);
		}
		public List<I_mtuContext> i_mtu() {
			return getRuleContexts(I_mtuContext.class);
		}
		public I_mtuContext i_mtu(int i) {
			return getRuleContext(I_mtuContext.class,i);
		}
		public List<I_permitContext> i_permit() {
			return getRuleContexts(I_permitContext.class);
		}
		public I_permitContext i_permit(int i) {
			return getRuleContext(I_permitContext.class,i);
		}
		public S_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterS_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitS_interface(this);
		}
	}

	public final S_interfaceContext s_interface() throws RecognitionException {
		S_interfaceContext _localctx = new S_interfaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s_interface);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(INTERFACE);
			setState(38);
			structure_name();
			setState(39);
			match(NEWLINE);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IP:
						{
						setState(40);
						i_ip();
						}
						break;
					case MTU:
						{
						setState(41);
						i_mtu();
						}
						break;
					case PERMIT:
						{
						setState(42);
						i_permit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class I_ipContext extends ParserRuleContext {
		public TerminalNode IP() { return getToken(RecoveryInlineAltsParser.IP, 0); }
		public Iip_addressContext iip_address() {
			return getRuleContext(Iip_addressContext.class,0);
		}
		public Iip_ospf_costContext iip_ospf_cost() {
			return getRuleContext(Iip_ospf_costContext.class,0);
		}
		public I_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterI_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitI_ip(this);
		}
	}

	public final I_ipContext i_ip() throws RecognitionException {
		I_ipContext _localctx = new I_ipContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_i_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IP);
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDRESS:
				{
				setState(49);
				iip_address();
				}
				break;
			case OSPF:
				{
				setState(50);
				iip_ospf_cost();
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

	public static class Iip_addressContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode ADDRESS() { return getToken(RecoveryInlineAltsParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Iip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterIip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitIip_address(this);
		}
	}

	public final Iip_addressContext iip_address() throws RecognitionException {
		Iip_addressContext _localctx = new Iip_addressContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_iip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ADDRESS);
			setState(54);
			((Iip_addressContext)_localctx).ip = ip_address();
			setState(55);
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

	public static class Iip_ospf_costContext extends ParserRuleContext {
		public Uint32Context cost;
		public TerminalNode OSPF() { return getToken(RecoveryInlineAltsParser.OSPF, 0); }
		public TerminalNode COST() { return getToken(RecoveryInlineAltsParser.COST, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public Iip_ospf_costContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iip_ospf_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterIip_ospf_cost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitIip_ospf_cost(this);
		}
	}

	public final Iip_ospf_costContext iip_ospf_cost() throws RecognitionException {
		Iip_ospf_costContext _localctx = new Iip_ospf_costContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iip_ospf_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(OSPF);
			setState(58);
			match(COST);
			setState(59);
			((Iip_ospf_costContext)_localctx).cost = uint32();
			setState(60);
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

	public static class I_mtuContext extends ParserRuleContext {
		public Uint32Context mtu;
		public TerminalNode MTU() { return getToken(RecoveryInlineAltsParser.MTU, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public I_mtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterI_mtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitI_mtu(this);
		}
	}

	public final I_mtuContext i_mtu() throws RecognitionException {
		I_mtuContext _localctx = new I_mtuContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_i_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(MTU);
			setState(63);
			((I_mtuContext)_localctx).mtu = uint32();
			setState(64);
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

	public static class I_permitContext extends ParserRuleContext {
		public TerminalNode PERMIT() { return getToken(RecoveryInlineAltsParser.PERMIT, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public List<TerminalNode> DNS() { return getTokens(RecoveryInlineAltsParser.DNS); }
		public TerminalNode DNS(int i) {
			return getToken(RecoveryInlineAltsParser.DNS, i);
		}
		public List<TerminalNode> SSH() { return getTokens(RecoveryInlineAltsParser.SSH); }
		public TerminalNode SSH(int i) {
			return getToken(RecoveryInlineAltsParser.SSH, i);
		}
		public I_permitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_permit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterI_permit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitI_permit(this);
		}
	}

	public final I_permitContext i_permit() throws RecognitionException {
		I_permitContext _localctx = new I_permitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_i_permit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PERMIT);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==DNS || _la==SSH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DNS || _la==SSH );
			setState(72);
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

	public static class S_ipContext extends ParserRuleContext {
		public TerminalNode IP() { return getToken(RecoveryInlineAltsParser.IP, 0); }
		public Ip_routingContext ip_routing() {
			return getRuleContext(Ip_routingContext.class,0);
		}
		public S_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterS_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitS_ip(this);
		}
	}

	public final S_ipContext s_ip() throws RecognitionException {
		S_ipContext _localctx = new S_ipContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_s_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IP);
			setState(75);
			ip_routing();
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

	public static class Ip_routingContext extends ParserRuleContext {
		public TerminalNode ROUTING() { return getToken(RecoveryInlineAltsParser.ROUTING, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public Ip_routingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_routing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterIp_routing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitIp_routing(this);
		}
	}

	public final Ip_routingContext ip_routing() throws RecognitionException {
		Ip_routingContext _localctx = new Ip_routingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ip_routing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ROUTING);
			setState(78);
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

	public static class S_permitContext extends ParserRuleContext {
		public TerminalNode PERMIT() { return getToken(RecoveryInlineAltsParser.PERMIT, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryInlineAltsParser.NEWLINE, 0); }
		public List<TerminalNode> DNS() { return getTokens(RecoveryInlineAltsParser.DNS); }
		public TerminalNode DNS(int i) {
			return getToken(RecoveryInlineAltsParser.DNS, i);
		}
		public List<TerminalNode> SSH() { return getTokens(RecoveryInlineAltsParser.SSH); }
		public TerminalNode SSH(int i) {
			return getToken(RecoveryInlineAltsParser.SSH, i);
		}
		public S_permitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_permit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterS_permit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitS_permit(this);
		}
	}

	public final S_permitContext s_permit() throws RecognitionException {
		S_permitContext _localctx = new S_permitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_s_permit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PERMIT);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==DNS || _la==SSH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DNS || _la==SSH );
			setState(86);
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

	public static class Ip_addressContext extends ParserRuleContext {
		public TerminalNode IP_ADDRESS() { return getToken(RecoveryInlineAltsParser.IP_ADDRESS, 0); }
		public Ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterIp_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitIp_address(this);
		}
	}

	public final Ip_addressContext ip_address() throws RecognitionException {
		Ip_addressContext _localctx = new Ip_addressContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IP_ADDRESS);
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

	public static class Structure_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(RecoveryInlineAltsParser.WORD, 0); }
		public Structure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterStructure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitStructure_name(this);
		}
	}

	public final Structure_nameContext structure_name() throws RecognitionException {
		Structure_nameContext _localctx = new Structure_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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

	public static class Uint32Context extends ParserRuleContext {
		public TerminalNode UINT32() { return getToken(RecoveryInlineAltsParser.UINT32, 0); }
		public Uint32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryInlineAltsParserListener ) ((RecoveryInlineAltsParserListener)listener).exitUint32(this);
		}
	}

	public final Uint32Context uint32() throws RecognitionException {
		Uint32Context _localctx = new Uint32Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_uint32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(UINT32);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\6\bG"+
		"\n\b\r\b\16\bH\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\6\13U\n\13\r"+
		"\13\16\13V\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\3\4\2\6\6\r\r\2]\2\"\3\2\2\2\4\'\3\2\2\2\6\62"+
		"\3\2\2\2\b\67\3\2\2\2\n;\3\2\2\2\f@\3\2\2\2\16D\3\2\2\2\20L\3\2\2\2\22"+
		"O\3\2\2\2\24R\3\2\2\2\26Z\3\2\2\2\30\\\3\2\2\2\32^\3\2\2\2\34!\5\4\3\2"+
		"\35!\5\20\t\2\36!\5\24\13\2\37!\7\17\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3"+
		"\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2"+
		"\2%&\7\2\2\3&\3\3\2\2\2\'(\7\7\2\2()\5\30\r\2)/\7\17\2\2*.\5\6\4\2+.\5"+
		"\f\7\2,.\5\16\b\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2"+
		"/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62\65\7\b\2\2\63\66\5\b\5\2\64\66"+
		"\5\n\6\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\678\7\4\2\289\5\26\f"+
		"\29:\7\17\2\2:\t\3\2\2\2;<\7\n\2\2<=\7\5\2\2=>\5\32\16\2>?\7\17\2\2?\13"+
		"\3\2\2\2@A\7\t\2\2AB\5\32\16\2BC\7\17\2\2C\r\3\2\2\2DF\7\13\2\2EG\t\2"+
		"\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\17\2\2K\17"+
		"\3\2\2\2LM\7\b\2\2MN\5\22\n\2N\21\3\2\2\2OP\7\f\2\2PQ\7\17\2\2Q\23\3\2"+
		"\2\2RT\7\13\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3"+
		"\2\2\2XY\7\17\2\2Y\25\3\2\2\2Z[\7\16\2\2[\27\3\2\2\2\\]\7\3\2\2]\31\3"+
		"\2\2\2^_\7\20\2\2_\33\3\2\2\2\t \"-/\65HV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}