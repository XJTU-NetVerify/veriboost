// Generated from org/batfish/grammar/recovery_rule_alts/RecoveryRuleAltsParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.recovery_rule_alts;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecoveryRuleAltsParser extends org.batfish.grammar.BatfishParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, ADDRESS=2, COST=3, DNS=4, INTERFACE=5, IP=6, MTU=7, OSPF=8, PERMIT=9, 
		ROUTING=10, SSH=11, IP_ADDRESS=12, NEWLINE=13, UINT32=14, WS=15, M_Word_WS=16;
	public static final int
		RULE_recovery_rule_alts_configuration = 0, RULE_statement = 1, RULE_s_interface = 2, 
		RULE_si = 3, RULE_i_ip = 4, RULE_iip = 5, RULE_iip_address = 6, RULE_iip_ospf_cost = 7, 
		RULE_i_mtu = 8, RULE_i_permit = 9, RULE_s_ip = 10, RULE_ip_routing = 11, 
		RULE_s_permit = 12, RULE_protocol = 13, RULE_ip_address = 14, RULE_structure_name = 15, 
		RULE_uint32 = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"recovery_rule_alts_configuration", "statement", "s_interface", "si", 
			"i_ip", "iip", "iip_address", "iip_ospf_cost", "i_mtu", "i_permit", "s_ip", 
			"ip_routing", "s_permit", "protocol", "ip_address", "structure_name", 
			"uint32"
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
	public String getGrammarFileName() { return "RecoveryRuleAltsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RecoveryRuleAltsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Recovery_rule_alts_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RecoveryRuleAltsParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RecoveryRuleAltsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RecoveryRuleAltsParser.NEWLINE, i);
		}
		public Recovery_rule_alts_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recovery_rule_alts_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterRecovery_rule_alts_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitRecovery_rule_alts_configuration(this);
		}
	}

	public final Recovery_rule_alts_configurationContext recovery_rule_alts_configuration() throws RecognitionException {
		Recovery_rule_alts_configurationContext _localctx = new Recovery_rule_alts_configurationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_recovery_rule_alts_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTERFACE) | (1L << IP) | (1L << PERMIT) | (1L << NEWLINE))) != 0)) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTERFACE:
				case IP:
				case PERMIT:
					{
					setState(34);
					statement();
					}
					break;
				case NEWLINE:
					{
					setState(35);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
		public S_interfaceContext s_interface() {
			return getRuleContext(S_interfaceContext.class,0);
		}
		public S_ipContext s_ip() {
			return getRuleContext(S_ipContext.class,0);
		}
		public S_permitContext s_permit() {
			return getRuleContext(S_permitContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				s_interface();
				}
				break;
			case IP:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				s_ip();
				}
				break;
			case PERMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				s_permit();
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

	public static class S_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(RecoveryRuleAltsParser.INTERFACE, 0); }
		public Structure_nameContext structure_name() {
			return getRuleContext(Structure_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public List<SiContext> si() {
			return getRuleContexts(SiContext.class);
		}
		public SiContext si(int i) {
			return getRuleContext(SiContext.class,i);
		}
		public S_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterS_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitS_interface(this);
		}
	}

	public final S_interfaceContext s_interface() throws RecognitionException {
		S_interfaceContext _localctx = new S_interfaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s_interface);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INTERFACE);
			setState(49);
			structure_name();
			setState(50);
			match(NEWLINE);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					si();
					}
					} 
				}
				setState(56);
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

	public static class SiContext extends ParserRuleContext {
		public I_ipContext i_ip() {
			return getRuleContext(I_ipContext.class,0);
		}
		public I_mtuContext i_mtu() {
			return getRuleContext(I_mtuContext.class,0);
		}
		public I_permitContext i_permit() {
			return getRuleContext(I_permitContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_si);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				i_ip();
				}
				break;
			case MTU:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				i_mtu();
				}
				break;
			case PERMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				i_permit();
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

	public static class I_ipContext extends ParserRuleContext {
		public TerminalNode IP() { return getToken(RecoveryRuleAltsParser.IP, 0); }
		public IipContext iip() {
			return getRuleContext(IipContext.class,0);
		}
		public I_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterI_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitI_ip(this);
		}
	}

	public final I_ipContext i_ip() throws RecognitionException {
		I_ipContext _localctx = new I_ipContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_i_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IP);
			setState(63);
			iip();
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

	public static class IipContext extends ParserRuleContext {
		public Iip_addressContext iip_address() {
			return getRuleContext(Iip_addressContext.class,0);
		}
		public Iip_ospf_costContext iip_ospf_cost() {
			return getRuleContext(Iip_ospf_costContext.class,0);
		}
		public IipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterIip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitIip(this);
		}
	}

	public final IipContext iip() throws RecognitionException {
		IipContext _localctx = new IipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iip);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				iip_address();
				}
				break;
			case OSPF:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				iip_ospf_cost();
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

	public static class Iip_addressContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode ADDRESS() { return getToken(RecoveryRuleAltsParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Iip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterIip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitIip_address(this);
		}
	}

	public final Iip_addressContext iip_address() throws RecognitionException {
		Iip_addressContext _localctx = new Iip_addressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ADDRESS);
			setState(70);
			((Iip_addressContext)_localctx).ip = ip_address();
			setState(71);
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
		public TerminalNode OSPF() { return getToken(RecoveryRuleAltsParser.OSPF, 0); }
		public TerminalNode COST() { return getToken(RecoveryRuleAltsParser.COST, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public Iip_ospf_costContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iip_ospf_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterIip_ospf_cost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitIip_ospf_cost(this);
		}
	}

	public final Iip_ospf_costContext iip_ospf_cost() throws RecognitionException {
		Iip_ospf_costContext _localctx = new Iip_ospf_costContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iip_ospf_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OSPF);
			setState(74);
			match(COST);
			setState(75);
			((Iip_ospf_costContext)_localctx).cost = uint32();
			setState(76);
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
		public TerminalNode MTU() { return getToken(RecoveryRuleAltsParser.MTU, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public I_mtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterI_mtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitI_mtu(this);
		}
	}

	public final I_mtuContext i_mtu() throws RecognitionException {
		I_mtuContext _localctx = new I_mtuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_i_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(MTU);
			setState(79);
			((I_mtuContext)_localctx).mtu = uint32();
			setState(80);
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
		public TerminalNode PERMIT() { return getToken(RecoveryRuleAltsParser.PERMIT, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public List<ProtocolContext> protocol() {
			return getRuleContexts(ProtocolContext.class);
		}
		public ProtocolContext protocol(int i) {
			return getRuleContext(ProtocolContext.class,i);
		}
		public I_permitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_permit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterI_permit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitI_permit(this);
		}
	}

	public final I_permitContext i_permit() throws RecognitionException {
		I_permitContext _localctx = new I_permitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_i_permit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PERMIT);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				protocol();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DNS || _la==SSH );
			setState(88);
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
		public TerminalNode IP() { return getToken(RecoveryRuleAltsParser.IP, 0); }
		public Ip_routingContext ip_routing() {
			return getRuleContext(Ip_routingContext.class,0);
		}
		public S_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterS_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitS_ip(this);
		}
	}

	public final S_ipContext s_ip() throws RecognitionException {
		S_ipContext _localctx = new S_ipContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_s_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IP);
			setState(91);
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
		public TerminalNode ROUTING() { return getToken(RecoveryRuleAltsParser.ROUTING, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public Ip_routingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_routing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterIp_routing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitIp_routing(this);
		}
	}

	public final Ip_routingContext ip_routing() throws RecognitionException {
		Ip_routingContext _localctx = new Ip_routingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ip_routing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ROUTING);
			setState(94);
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
		public TerminalNode PERMIT() { return getToken(RecoveryRuleAltsParser.PERMIT, 0); }
		public TerminalNode NEWLINE() { return getToken(RecoveryRuleAltsParser.NEWLINE, 0); }
		public List<ProtocolContext> protocol() {
			return getRuleContexts(ProtocolContext.class);
		}
		public ProtocolContext protocol(int i) {
			return getRuleContext(ProtocolContext.class,i);
		}
		public S_permitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_permit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterS_permit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitS_permit(this);
		}
	}

	public final S_permitContext s_permit() throws RecognitionException {
		S_permitContext _localctx = new S_permitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_s_permit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PERMIT);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				protocol();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DNS || _la==SSH );
			setState(102);
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

	public static class ProtocolContext extends ParserRuleContext {
		public TerminalNode DNS() { return getToken(RecoveryRuleAltsParser.DNS, 0); }
		public TerminalNode SSH() { return getToken(RecoveryRuleAltsParser.SSH, 0); }
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterProtocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitProtocol(this);
		}
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_protocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public TerminalNode IP_ADDRESS() { return getToken(RecoveryRuleAltsParser.IP_ADDRESS, 0); }
		public Ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterIp_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitIp_address(this);
		}
	}

	public final Ip_addressContext ip_address() throws RecognitionException {
		Ip_addressContext _localctx = new Ip_addressContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		public TerminalNode WORD() { return getToken(RecoveryRuleAltsParser.WORD, 0); }
		public Structure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterStructure_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitStructure_name(this);
		}
	}

	public final Structure_nameContext structure_name() throws RecognitionException {
		Structure_nameContext _localctx = new Structure_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		public TerminalNode UINT32() { return getToken(RecoveryRuleAltsParser.UINT32, 0); }
		public Uint32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecoveryRuleAltsParserListener ) ((RecoveryRuleAltsParserListener)listener).exitUint32(this);
		}
	}

	public final Uint32Context uint32() throws RecognitionException {
		Uint32Context _localctx = new Uint32Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_uint32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\5\7F\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\6\13W\n\13\r\13\16\13X\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\6\16e\n\16\r\16\16\16f\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\6\6"+
		"\r\r\2k\2(\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fE"+
		"\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22P\3\2\2\2\24T\3\2\2\2\26\\\3\2\2\2"+
		"\30_\3\2\2\2\32b\3\2\2\2\34j\3\2\2\2\36l\3\2\2\2 n\3\2\2\2\"p\3\2\2\2"+
		"$\'\5\4\3\2%\'\7\17\2\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)+\3\2\2\2*(\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-\61\5\6\4\2.\61\5\26\f\2"+
		"/\61\5\32\16\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63"+
		"\7\7\2\2\63\64\5 \21\2\648\7\17\2\2\65\67\5\b\5\2\66\65\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;?\5\n\6\2<?\5\22\n\2"+
		"=?\5\24\13\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\t\3\2\2\2@A\7\b\2\2AB\5\f"+
		"\7\2B\13\3\2\2\2CF\5\16\b\2DF\5\20\t\2EC\3\2\2\2ED\3\2\2\2F\r\3\2\2\2"+
		"GH\7\4\2\2HI\5\36\20\2IJ\7\17\2\2J\17\3\2\2\2KL\7\n\2\2LM\7\5\2\2MN\5"+
		"\"\22\2NO\7\17\2\2O\21\3\2\2\2PQ\7\t\2\2QR\5\"\22\2RS\7\17\2\2S\23\3\2"+
		"\2\2TV\7\13\2\2UW\5\34\17\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ"+
		"\3\2\2\2Z[\7\17\2\2[\25\3\2\2\2\\]\7\b\2\2]^\5\30\r\2^\27\3\2\2\2_`\7"+
		"\f\2\2`a\7\17\2\2a\31\3\2\2\2bd\7\13\2\2ce\5\34\17\2dc\3\2\2\2ef\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\17\2\2i\33\3\2\2\2jk\t\2\2\2k\35"+
		"\3\2\2\2lm\7\16\2\2m\37\3\2\2\2no\7\3\2\2o!\3\2\2\2pq\7\20\2\2q#\3\2\2"+
		"\2\n&(\608>EXf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}