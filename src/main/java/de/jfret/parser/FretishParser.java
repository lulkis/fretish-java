package de.jfret.parser;
// Generated from Fretish.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FretishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, AFTER=20, ALWAYS=21, AND=22, AT=23, BEFORE=24, DURING=25, 
		EVENTUALLY=26, EXCEPT=27, FALSE=28, FINALLY=29, FIRST=30, FOR=31, HOUR=32, 
		IF=33, IMMEDIATELY=34, IN=35, INITIALLY=36, IS=37, LAST=38, MICROSECOND=39, 
		MILLISECOND=40, MINUTE=41, MOD=42, MODE=43, NEVER=44, NEXT=45, NOT=46, 
		OCCURRENCE=47, OF=48, ONLY=49, OR=50, PREVIOUS=51, PROB=52, SAME=53, SATISFY=54, 
		SECOND=55, SHALL=56, THE=57, THEN=58, TICK=59, TIMEPOINT=60, TRUE=61, 
		UNLESS=62, UNTIL=63, UPON=64, WHAT=65, WHEN=66, WHENEVER=67, WHERE=68, 
		WHILE=69, WITH=70, WITHIN=71, XOR=72, ID=73, STRING=74, RELATIONAL_OP=75, 
		NUMBER=76, WS=77;
	public static final int
		RULE_reqt_body = 0, RULE_freeform = 1, RULE_nasa = 2, RULE_scope = 3, 
		RULE_reqt_condition = 4, RULE_regular_condition = 5, RULE_qualifier_word = 6, 
		RULE_qualified_condition1 = 7, RULE_qualified_condition2 = 8, RULE_scope_condition = 9, 
		RULE_scope_mode = 10, RULE_pre_condition = 11, RULE_stop_condition = 12, 
		RULE_component = 13, RULE_response = 14, RULE_satisfaction = 15, RULE_probability = 16, 
		RULE_probability_aux = 17, RULE_prob_num = 18, RULE_timing = 19, RULE_timing_aux = 20, 
		RULE_duration_upper = 21, RULE_duration_lower = 22, RULE_component_name = 23, 
		RULE_mode_name = 24, RULE_duration = 25, RULE_timeunit = 26, RULE_post_condition = 27, 
		RULE_bool_expr = 28, RULE_numeric_expr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"reqt_body", "freeform", "nasa", "scope", "reqt_condition", "regular_condition", 
			"qualifier_word", "qualified_condition1", "qualified_condition2", "scope_condition", 
			"scope_mode", "pre_condition", "stop_condition", "component", "response", 
			"satisfaction", "probability", "probability_aux", "prob_num", "timing", 
			"timing_aux", "duration_upper", "duration_lower", "component_name", "mode_name", 
			"duration", "timeunit", "post_condition", "bool_expr", "numeric_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'!'", "'~'", "'&'", "'|'", "'->'", "'=>'", "'<->'", 
			"'<=>'", "'('", "')'", "'true'", "'false'", "'^'", "'-'", "'*'", "'/'", 
			"'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "AFTER", "ALWAYS", "AND", 
			"AT", "BEFORE", "DURING", "EVENTUALLY", "EXCEPT", "FALSE", "FINALLY", 
			"FIRST", "FOR", "HOUR", "IF", "IMMEDIATELY", "IN", "INITIALLY", "IS", 
			"LAST", "MICROSECOND", "MILLISECOND", "MINUTE", "MOD", "MODE", "NEVER", 
			"NEXT", "NOT", "OCCURRENCE", "OF", "ONLY", "OR", "PREVIOUS", "PROB", 
			"SAME", "SATISFY", "SECOND", "SHALL", "THE", "THEN", "TICK", "TIMEPOINT", 
			"TRUE", "UNLESS", "UNTIL", "UPON", "WHAT", "WHEN", "WHENEVER", "WHERE", 
			"WHILE", "WITH", "WITHIN", "XOR", "ID", "STRING", "RELATIONAL_OP", "NUMBER", 
			"WS"
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
	public String getGrammarFileName() { return "Fretish.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FretishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reqt_bodyContext extends ParserRuleContext {
		public NasaContext nasa() {
			return getRuleContext(NasaContext.class,0);
		}
		public FreeformContext freeform() {
			return getRuleContext(FreeformContext.class,0);
		}
		public Reqt_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqt_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterReqt_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitReqt_body(this);
		}
	}

	public final Reqt_bodyContext reqt_body() throws RecognitionException {
		Reqt_bodyContext _localctx = new Reqt_bodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_reqt_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFTER:
			case AND:
			case BEFORE:
			case DURING:
			case EXCEPT:
			case IF:
			case IN:
			case ONLY:
			case SHALL:
			case THE:
			case UNLESS:
			case UPON:
			case WHEN:
			case WHENEVER:
			case WHERE:
			case WHILE:
			case ID:
				{
				setState(60);
				nasa();
				}
				break;
			case STRING:
				{
				setState(61);
				freeform();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(64);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FreeformContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FretishParser.STRING, 0); }
		public FreeformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterFreeform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitFreeform(this);
		}
	}

	public final FreeformContext freeform() throws RecognitionException {
		FreeformContext _localctx = new FreeformContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_freeform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NasaContext extends ParserRuleContext {
		public ResponseContext response() {
			return getRuleContext(ResponseContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public TerminalNode SHALL() { return getToken(FretishParser.SHALL, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public Reqt_conditionContext reqt_condition() {
			return getRuleContext(Reqt_conditionContext.class,0);
		}
		public ProbabilityContext probability() {
			return getRuleContext(ProbabilityContext.class,0);
		}
		public TimingContext timing() {
			return getRuleContext(TimingContext.class,0);
		}
		public NasaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nasa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterNasa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitNasa(this);
		}
	}

	public final NasaContext nasa() throws RecognitionException {
		NasaContext _localctx = new NasaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nasa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(69);
				scope();
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 128642860451841L) != 0)) {
				{
				setState(72);
				reqt_condition();
				}
			}

			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THE:
			case ID:
				{
				setState(75);
				component();
				setState(76);
				match(SHALL);
				}
				break;
			case SHALL:
				{
				setState(78);
				match(SHALL);
				setState(79);
				component();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82);
				probability();
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223354355989610492L) != 0) || _la==WITHIN) {
				{
				setState(85);
				timing();
				}
			}

			setState(88);
			response();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(FretishParser.ONLY, 0); }
		public TerminalNode EXCEPT() { return getToken(FretishParser.EXCEPT, 0); }
		public TerminalNode IN() { return getToken(FretishParser.IN, 0); }
		public Scope_modeContext scope_mode() {
			return getRuleContext(Scope_modeContext.class,0);
		}
		public TerminalNode UNLESS() { return getToken(FretishParser.UNLESS, 0); }
		public TerminalNode WHILE() { return getToken(FretishParser.WHILE, 0); }
		public Scope_conditionContext scope_condition() {
			return getRuleContext(Scope_conditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(FretishParser.WHEN, 0); }
		public TerminalNode IF() { return getToken(FretishParser.IF, 0); }
		public TerminalNode DURING() { return getToken(FretishParser.DURING, 0); }
		public TerminalNode AFTER() { return getToken(FretishParser.AFTER, 0); }
		public TerminalNode BEFORE() { return getToken(FretishParser.BEFORE, 0); }
		public TerminalNode NOT() { return getToken(FretishParser.NOT, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONLY:
				{
				{
				setState(90);
				match(ONLY);
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DURING:
				case IF:
				case IN:
				case WHEN:
					{
					{
					setState(96);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DURING:
						{
						setState(91);
						match(DURING);
						}
						break;
					case IF:
					case IN:
					case WHEN:
						{
						{
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IF || _la==WHEN) {
							{
							setState(92);
							_la = _input.LA(1);
							if ( !(_la==IF || _la==WHEN) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(95);
						match(IN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98);
					scope_mode();
					}
					}
					break;
				case WHILE:
					{
					{
					setState(99);
					match(WHILE);
					setState(100);
					scope_condition();
					}
					}
					break;
				case AFTER:
				case BEFORE:
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==AFTER || _la==BEFORE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(102);
						scope_mode();
						}
						break;
					case 2:
						{
						setState(103);
						scope_condition();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case EXCEPT:
				{
				{
				setState(108);
				match(EXCEPT);
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DURING:
				case IF:
				case IN:
				case WHEN:
					{
					{
					setState(114);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DURING:
						{
						setState(109);
						match(DURING);
						}
						break;
					case IF:
					case IN:
					case WHEN:
						{
						{
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IF || _la==WHEN) {
							{
							setState(110);
							_la = _input.LA(1);
							if ( !(_la==IF || _la==WHEN) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(113);
						match(IN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116);
					scope_mode();
					}
					}
					break;
				case WHILE:
					{
					{
					setState(117);
					match(WHILE);
					setState(118);
					scope_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case IF:
			case WHEN:
				{
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==IF || _la==WHEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(122);
					match(NOT);
					}
				}

				setState(125);
				match(IN);
				setState(126);
				scope_mode();
				}
				}
				break;
			case DURING:
			case IN:
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==DURING || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				scope_mode();
				}
				}
				break;
			case UNLESS:
				{
				{
				setState(129);
				match(UNLESS);
				setState(130);
				match(IN);
				setState(131);
				scope_mode();
				}
				}
				break;
			case WHILE:
				{
				{
				setState(132);
				match(WHILE);
				setState(133);
				scope_condition();
				}
				}
				break;
			case AFTER:
			case BEFORE:
				{
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==AFTER || _la==BEFORE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(135);
					scope_mode();
					}
					break;
				case 2:
					{
					setState(136);
					scope_condition();
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(141);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Reqt_conditionContext extends ParserRuleContext {
		public Regular_conditionContext regular_condition() {
			return getRuleContext(Regular_conditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(FretishParser.AND, 0); }
		public Reqt_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqt_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterReqt_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitReqt_condition(this);
		}
	}

	public final Reqt_conditionContext reqt_condition() throws RecognitionException {
		Reqt_conditionContext _localctx = new Reqt_conditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reqt_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(144);
				match(AND);
				}
			}

			{
			setState(147);
			regular_condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Regular_conditionContext extends ParserRuleContext {
		public Qualified_condition1Context qualified_condition1() {
			return getRuleContext(Qualified_condition1Context.class,0);
		}
		public List<Qualified_condition2Context> qualified_condition2() {
			return getRuleContexts(Qualified_condition2Context.class);
		}
		public Qualified_condition2Context qualified_condition2(int i) {
			return getRuleContext(Qualified_condition2Context.class,i);
		}
		public Regular_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regular_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterRegular_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitRegular_condition(this);
		}
	}

	public final Regular_conditionContext regular_condition() throws RecognitionException {
		Regular_conditionContext _localctx = new Regular_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_regular_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			qualified_condition1();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(150);
						match(T__1);
						}
					}

					setState(153);
					qualified_condition2();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(159);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Qualifier_wordContext extends ParserRuleContext {
		public TerminalNode UPON() { return getToken(FretishParser.UPON, 0); }
		public TerminalNode WHENEVER() { return getToken(FretishParser.WHENEVER, 0); }
		public TerminalNode WHEN() { return getToken(FretishParser.WHEN, 0); }
		public TerminalNode UNLESS() { return getToken(FretishParser.UNLESS, 0); }
		public TerminalNode WHERE() { return getToken(FretishParser.WHERE, 0); }
		public TerminalNode IF() { return getToken(FretishParser.IF, 0); }
		public Qualifier_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterQualifier_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitQualifier_word(this);
		}
	}

	public final Qualifier_wordContext qualifier_word() throws RecognitionException {
		Qualifier_wordContext _localctx = new Qualifier_wordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifier_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 62813896705L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_condition1Context extends ParserRuleContext {
		public Qualifier_wordContext qualifier_word() {
			return getRuleContext(Qualifier_wordContext.class,0);
		}
		public Pre_conditionContext pre_condition() {
			return getRuleContext(Pre_conditionContext.class,0);
		}
		public TerminalNode IS() { return getToken(FretishParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(FretishParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FretishParser.FALSE, 0); }
		public Qualified_condition1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_condition1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterQualified_condition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitQualified_condition1(this);
		}
	}

	public final Qualified_condition1Context qualified_condition1() throws RecognitionException {
		Qualified_condition1Context _localctx = new Qualified_condition1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_qualified_condition1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			qualifier_word();
			setState(165);
			pre_condition();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(166);
				match(IS);
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_condition2Context extends ParserRuleContext {
		public Qualifier_wordContext qualifier_word() {
			return getRuleContext(Qualifier_wordContext.class,0);
		}
		public Pre_conditionContext pre_condition() {
			return getRuleContext(Pre_conditionContext.class,0);
		}
		public TerminalNode IS() { return getToken(FretishParser.IS, 0); }
		public TerminalNode AND() { return getToken(FretishParser.AND, 0); }
		public TerminalNode OR() { return getToken(FretishParser.OR, 0); }
		public TerminalNode TRUE() { return getToken(FretishParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FretishParser.FALSE, 0); }
		public Qualified_condition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_condition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterQualified_condition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitQualified_condition2(this);
		}
	}

	public final Qualified_condition2Context qualified_condition2() throws RecognitionException {
		Qualified_condition2Context _localctx = new Qualified_condition2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_qualified_condition2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(173);
			qualifier_word();
			setState(174);
			pre_condition();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(175);
				match(IS);
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scope_conditionContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Scope_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterScope_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitScope_condition(this);
		}
	}

	public final Scope_conditionContext scope_condition() throws RecognitionException {
		Scope_conditionContext _localctx = new Scope_conditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scope_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			bool_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scope_modeContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(FretishParser.MODE, 0); }
		public Mode_nameContext mode_name() {
			return getRuleContext(Mode_nameContext.class,0);
		}
		public Scope_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterScope_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitScope_mode(this);
		}
	}

	public final Scope_modeContext scope_mode() throws RecognitionException {
		Scope_modeContext _localctx = new Scope_modeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_scope_mode);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(181);
				match(MODE);
				setState(182);
				mode_name();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(183);
				mode_name();
				setState(184);
				match(MODE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				mode_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pre_conditionContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Pre_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterPre_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitPre_condition(this);
		}
	}

	public final Pre_conditionContext pre_condition() throws RecognitionException {
		Pre_conditionContext _localctx = new Pre_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pre_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			bool_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stop_conditionContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Stop_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterStop_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitStop_condition(this);
		}
	}

	public final Stop_conditionContext stop_condition() throws RecognitionException {
		Stop_conditionContext _localctx = new Stop_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stop_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			bool_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public Component_nameContext component_name() {
			return getRuleContext(Component_nameContext.class,0);
		}
		public TerminalNode THE() { return getToken(FretishParser.THE, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THE) {
				{
				setState(193);
				match(THE);
				}
			}

			setState(196);
			component_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseContext extends ParserRuleContext {
		public SatisfactionContext satisfaction() {
			return getRuleContext(SatisfactionContext.class,0);
		}
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitResponse(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			satisfaction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SatisfactionContext extends ParserRuleContext {
		public TerminalNode SATISFY() { return getToken(FretishParser.SATISFY, 0); }
		public Post_conditionContext post_condition() {
			return getRuleContext(Post_conditionContext.class,0);
		}
		public SatisfactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satisfaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterSatisfaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitSatisfaction(this);
		}
	}

	public final SatisfactionContext satisfaction() throws RecognitionException {
		SatisfactionContext _localctx = new SatisfactionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_satisfaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SATISFY);
			setState(201);
			post_condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProbabilityContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(FretishParser.WITH, 0); }
		public Probability_auxContext probability_aux() {
			return getRuleContext(Probability_auxContext.class,0);
		}
		public ProbabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterProbability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitProbability(this);
		}
	}

	public final ProbabilityContext probability() throws RecognitionException {
		ProbabilityContext _localctx = new ProbabilityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_probability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(203);
				match(T__1);
				}
			}

			setState(206);
			match(WITH);
			setState(207);
			probability_aux();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(208);
				match(T__1);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Probability_auxContext extends ParserRuleContext {
		public TerminalNode PROB() { return getToken(FretishParser.PROB, 0); }
		public TerminalNode RELATIONAL_OP() { return getToken(FretishParser.RELATIONAL_OP, 0); }
		public Prob_numContext prob_num() {
			return getRuleContext(Prob_numContext.class,0);
		}
		public Probability_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterProbability_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitProbability_aux(this);
		}
	}

	public final Probability_auxContext probability_aux() throws RecognitionException {
		Probability_auxContext _localctx = new Probability_auxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_probability_aux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(PROB);
			setState(212);
			match(RELATIONAL_OP);
			setState(213);
			prob_num();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Prob_numContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FretishParser.NUMBER, 0); }
		public Prob_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prob_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterProb_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitProb_num(this);
		}
	}

	public final Prob_numContext prob_num() throws RecognitionException {
		Prob_numContext _localctx = new Prob_numContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prob_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimingContext extends ParserRuleContext {
		public Timing_auxContext timing_aux() {
			return getRuleContext(Timing_auxContext.class,0);
		}
		public TimingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterTiming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitTiming(this);
		}
	}

	public final TimingContext timing() throws RecognitionException {
		TimingContext _localctx = new TimingContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_timing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(217);
				match(T__1);
				}
			}

			setState(220);
			timing_aux();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(221);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Timing_auxContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(FretishParser.WITHIN, 0); }
		public Duration_upperContext duration_upper() {
			return getRuleContext(Duration_upperContext.class,0);
		}
		public TerminalNode FOR() { return getToken(FretishParser.FOR, 0); }
		public TerminalNode AFTER() { return getToken(FretishParser.AFTER, 0); }
		public Duration_lowerContext duration_lower() {
			return getRuleContext(Duration_lowerContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(FretishParser.UNTIL, 0); }
		public Stop_conditionContext stop_condition() {
			return getRuleContext(Stop_conditionContext.class,0);
		}
		public TerminalNode BEFORE() { return getToken(FretishParser.BEFORE, 0); }
		public TerminalNode AT() { return getToken(FretishParser.AT, 0); }
		public TerminalNode THE() { return getToken(FretishParser.THE, 0); }
		public TerminalNode TIMEPOINT() { return getToken(FretishParser.TIMEPOINT, 0); }
		public TerminalNode FIRST() { return getToken(FretishParser.FIRST, 0); }
		public TerminalNode SAME() { return getToken(FretishParser.SAME, 0); }
		public TerminalNode NEXT() { return getToken(FretishParser.NEXT, 0); }
		public TerminalNode LAST() { return getToken(FretishParser.LAST, 0); }
		public TerminalNode IMMEDIATELY() { return getToken(FretishParser.IMMEDIATELY, 0); }
		public TerminalNode INITIALLY() { return getToken(FretishParser.INITIALLY, 0); }
		public TerminalNode FINALLY() { return getToken(FretishParser.FINALLY, 0); }
		public TerminalNode EVENTUALLY() { return getToken(FretishParser.EVENTUALLY, 0); }
		public TerminalNode ALWAYS() { return getToken(FretishParser.ALWAYS, 0); }
		public TerminalNode NEVER() { return getToken(FretishParser.NEVER, 0); }
		public Timing_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timing_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterTiming_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitTiming_aux(this);
		}
	}

	public final Timing_auxContext timing_aux() throws RecognitionException {
		Timing_auxContext _localctx = new Timing_auxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_timing_aux);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(WITHIN);
				setState(225);
				duration_upper();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(FOR);
				setState(227);
				duration_upper();
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(AFTER);
				setState(229);
				duration_lower();
				}
				break;
			case UNTIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(UNTIL);
				setState(231);
				stop_condition();
				}
				break;
			case BEFORE:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(BEFORE);
				setState(233);
				stop_condition();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(AT);
				setState(235);
				match(THE);
				setState(236);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9042659578478592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				match(TIMEPOINT);
				}
				break;
			case IMMEDIATELY:
			case INITIALLY:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==IMMEDIATELY || _la==INITIALLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FINALLY:
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				match(FINALLY);
				}
				break;
			case EVENTUALLY:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				match(EVENTUALLY);
				}
				break;
			case ALWAYS:
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				match(ALWAYS);
				}
				break;
			case NEVER:
				enterOuterAlt(_localctx, 11);
				{
				setState(242);
				match(NEVER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Duration_upperContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public Duration_upperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration_upper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterDuration_upper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitDuration_upper(this);
		}
	}

	public final Duration_upperContext duration_upper() throws RecognitionException {
		Duration_upperContext _localctx = new Duration_upperContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_duration_upper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			duration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Duration_lowerContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public Duration_lowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration_lower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterDuration_lower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitDuration_lower(this);
		}
	}

	public final Duration_lowerContext duration_lower() throws RecognitionException {
		Duration_lowerContext _localctx = new Duration_lowerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_duration_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			duration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Component_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FretishParser.ID, 0); }
		public Component_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterComponent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitComponent_name(this);
		}
	}

	public final Component_nameContext component_name() throws RecognitionException {
		Component_nameContext _localctx = new Component_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_component_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mode_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FretishParser.ID, 0); }
		public Mode_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterMode_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitMode_name(this);
		}
	}

	public final Mode_nameContext mode_name() throws RecognitionException {
		Mode_nameContext _localctx = new Mode_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mode_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DurationContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FretishParser.NUMBER, 0); }
		public TimeunitContext timeunit() {
			return getRuleContext(TimeunitContext.class,0);
		}
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitDuration(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(NUMBER);
			setState(254);
			timeunit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeunitContext extends ParserRuleContext {
		public TerminalNode TICK() { return getToken(FretishParser.TICK, 0); }
		public TerminalNode MICROSECOND() { return getToken(FretishParser.MICROSECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(FretishParser.MILLISECOND, 0); }
		public TerminalNode SECOND() { return getToken(FretishParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(FretishParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(FretishParser.HOUR, 0); }
		public TimeunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterTimeunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitTimeunit(this);
		}
	}

	public final TimeunitContext timeunit() throws RecognitionException {
		TimeunitContext _localctx = new TimeunitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_timeunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 612493401908051968L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Post_conditionContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Post_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterPost_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitPost_condition(this);
		}
	}

	public final Post_conditionContext post_condition() throws RecognitionException {
		Post_conditionContext _localctx = new Post_conditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_post_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			bool_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode IF() { return getToken(FretishParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FretishParser.THEN, 0); }
		public TerminalNode AT() { return getToken(FretishParser.AT, 0); }
		public TerminalNode THE() { return getToken(FretishParser.THE, 0); }
		public TerminalNode OCCURRENCE() { return getToken(FretishParser.OCCURRENCE, 0); }
		public TerminalNode OF() { return getToken(FretishParser.OF, 0); }
		public TerminalNode PREVIOUS() { return getToken(FretishParser.PREVIOUS, 0); }
		public TerminalNode NEXT() { return getToken(FretishParser.NEXT, 0); }
		public List<Numeric_exprContext> numeric_expr() {
			return getRuleContexts(Numeric_exprContext.class);
		}
		public Numeric_exprContext numeric_expr(int i) {
			return getRuleContext(Numeric_exprContext.class,i);
		}
		public TerminalNode RELATIONAL_OP() { return getToken(FretishParser.RELATIONAL_OP, 0); }
		public TerminalNode ID() { return getToken(FretishParser.ID, 0); }
		public TerminalNode XOR() { return getToken(FretishParser.XOR, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				bool_expr(11);
				}
				break;
			case 2:
				{
				setState(263);
				match(IF);
				setState(264);
				bool_expr(0);
				setState(265);
				match(THEN);
				setState(266);
				bool_expr(7);
				}
				break;
			case 3:
				{
				setState(268);
				match(AT);
				setState(269);
				match(THE);
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==NEXT || _la==PREVIOUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				match(OCCURRENCE);
				setState(272);
				match(OF);
				setState(273);
				bool_expr(0);
				setState(274);
				match(T__1);
				setState(275);
				bool_expr(6);
				}
				break;
			case 4:
				{
				setState(277);
				match(T__10);
				setState(278);
				bool_expr(0);
				setState(279);
				match(T__11);
				}
				break;
			case 5:
				{
				setState(281);
				numeric_expr(0);
				setState(282);
				match(RELATIONAL_OP);
				setState(283);
				numeric_expr(0);
				}
				break;
			case 6:
				{
				setState(285);
				match(ID);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(286);
					match(T__10);
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8598415384L) != 0) || _la==ID || _la==NUMBER) {
						{
						setState(289);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(287);
							bool_expr(0);
							}
							break;
						case 2:
							{
							setState(288);
							numeric_expr(0);
							}
							break;
						}
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(291);
							match(T__1);
							setState(294);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
							case 1:
								{
								setState(292);
								bool_expr(0);
								}
								break;
							case 2:
								{
								setState(293);
								numeric_expr(0);
								}
								break;
							}
							}
							}
							setState(300);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(303);
					match(T__11);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(306);
				match(T__12);
				}
				break;
			case 8:
				{
				setState(307);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(311);
						match(T__4);
						setState(312);
						bool_expr(11);
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(313);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(314);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						bool_expr(10);
						}
						break;
					case 3:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(316);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(317);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(318);
						bool_expr(9);
						}
						break;
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_exprContext extends ParserRuleContext {
		public List<Numeric_exprContext> numeric_expr() {
			return getRuleContexts(Numeric_exprContext.class);
		}
		public Numeric_exprContext numeric_expr(int i) {
			return getRuleContext(Numeric_exprContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(FretishParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(FretishParser.ID, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(FretishParser.MOD, 0); }
		public Numeric_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).enterNumeric_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FretishListener ) ((FretishListener)listener).exitNumeric_expr(this);
		}
	}

	public final Numeric_exprContext numeric_expr() throws RecognitionException {
		return numeric_expr(0);
	}

	private Numeric_exprContext numeric_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Numeric_exprContext _localctx = new Numeric_exprContext(_ctx, _parentState);
		Numeric_exprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_numeric_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(325);
				match(T__15);
				setState(326);
				numeric_expr(6);
				}
				break;
			case NUMBER:
				{
				setState(327);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(328);
				match(ID);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(329);
					match(T__10);
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8598415384L) != 0) || _la==ID || _la==NUMBER) {
						{
						setState(332);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(330);
							bool_expr(0);
							}
							break;
						case 2:
							{
							setState(331);
							numeric_expr(0);
							}
							break;
						}
						setState(341);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(334);
							match(T__1);
							setState(337);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
							case 1:
								{
								setState(335);
								bool_expr(0);
								}
								break;
							case 2:
								{
								setState(336);
								numeric_expr(0);
								}
								break;
							}
							}
							}
							setState(343);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(346);
					match(T__11);
					}
					break;
				}
				}
				break;
			case T__10:
				{
				setState(349);
				match(T__10);
				setState(350);
				numeric_expr(0);
				setState(351);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new Numeric_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expr);
						setState(355);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(356);
						match(T__14);
						setState(357);
						numeric_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Numeric_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expr);
						setState(358);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(359);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046904320L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(360);
						numeric_expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Numeric_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numeric_expr);
						setState(361);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(362);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(363);
						numeric_expr(5);
						}
						break;
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 29:
			return numeric_expr_sempred((Numeric_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean numeric_expr_sempred(Numeric_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u0172\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0000\u0003\u0000B\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0003\u0002W\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003^\b\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003"+
		"\u0003\u0003k\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"p\b\u0003\u0001\u0003\u0003\u0003s\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003x\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003|\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u008a\b\u0003\u0003\u0003\u008c\b\u0003\u0001\u0003\u0003"+
		"\u0003\u008f\b\u0003\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0098\b\u0005\u0001\u0005"+
		"\u0005\u0005\u009b\b\u0005\n\u0005\f\u0005\u009e\t\u0005\u0001\u0005\u0003"+
		"\u0005\u00a1\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00a9\b\u0007\u0001\b\u0003\b\u00ac\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b2\b\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bc\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0003\r\u00c3\b\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0003\u0010\u00cd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00d2\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0003\u0013\u00db\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00df\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f4\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0122\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0127\b\u001c\u0005\u001c\u0129\b\u001c\n\u001c\f\u001c\u012c"+
		"\t\u001c\u0003\u001c\u012e\b\u001c\u0001\u001c\u0003\u001c\u0131\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0135\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0140\b\u001c\n\u001c\f\u001c\u0143\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u014d\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0152\b\u001d\u0005\u001d\u0154\b\u001d\n\u001d\f\u001d"+
		"\u0157\t\u001d\u0003\u001d\u0159\b\u001d\u0001\u001d\u0003\u001d\u015c"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0162"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u016d\b\u001d\n"+
		"\u001d\f\u001d\u0170\t\u001d\u0001\u001d\u0000\u00028:\u001e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:\u0000\u000f\u0002\u0000!!BB\u0002\u0000\u0014\u0014\u0018"+
		"\u0018\u0002\u0000\u0019\u0019##\u0004\u0000!!>>@@BD\u0002\u0000\u001c"+
		"\u001c==\u0002\u0000\u0016\u001622\u0004\u0000\u001e\u001e&&--55\u0002"+
		"\u0000\"\"$$\u0004\u0000  \')77;;\u0001\u0000\u0003\u0004\u0002\u0000"+
		"--33\u0002\u0000\u0006\u0006HH\u0001\u0000\u0007\n\u0002\u0000\u0011\u0012"+
		"**\u0002\u0000\u0010\u0010\u0013\u0013\u019d\u0000>\u0001\u0000\u0000"+
		"\u0000\u0002C\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006"+
		"\u008b\u0001\u0000\u0000\u0000\b\u0091\u0001\u0000\u0000\u0000\n\u0095"+
		"\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000\u000e\u00a4\u0001"+
		"\u0000\u0000\u0000\u0010\u00ab\u0001\u0000\u0000\u0000\u0012\u00b3\u0001"+
		"\u0000\u0000\u0000\u0014\u00bb\u0001\u0000\u0000\u0000\u0016\u00bd\u0001"+
		"\u0000\u0000\u0000\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00c2\u0001"+
		"\u0000\u0000\u0000\u001c\u00c6\u0001\u0000\u0000\u0000\u001e\u00c8\u0001"+
		"\u0000\u0000\u0000 \u00cc\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000"+
		"\u0000\u0000$\u00d7\u0001\u0000\u0000\u0000&\u00da\u0001\u0000\u0000\u0000"+
		"(\u00f3\u0001\u0000\u0000\u0000*\u00f5\u0001\u0000\u0000\u0000,\u00f7"+
		"\u0001\u0000\u0000\u0000.\u00f9\u0001\u0000\u0000\u00000\u00fb\u0001\u0000"+
		"\u0000\u00002\u00fd\u0001\u0000\u0000\u00004\u0100\u0001\u0000\u0000\u0000"+
		"6\u0102\u0001\u0000\u0000\u00008\u0134\u0001\u0000\u0000\u0000:\u0161"+
		"\u0001\u0000\u0000\u0000<?\u0003\u0004\u0002\u0000=?\u0003\u0002\u0001"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@B\u0005\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B\u0001\u0001\u0000\u0000\u0000CD\u0005J\u0000\u0000"+
		"D\u0003\u0001\u0000\u0000\u0000EG\u0003\u0006\u0003\u0000FE\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0003"+
		"\b\u0004\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JP\u0001"+
		"\u0000\u0000\u0000KL\u0003\u001a\r\u0000LM\u00058\u0000\u0000MQ\u0001"+
		"\u0000\u0000\u0000NO\u00058\u0000\u0000OQ\u0003\u001a\r\u0000PK\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RT\u0003 \u0010\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000UW\u0003&\u0013\u0000VU\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0003\u001c\u000e"+
		"\u0000Y\u0005\u0001\u0000\u0000\u0000Zj\u00051\u0000\u0000[a\u0005\u0019"+
		"\u0000\u0000\\^\u0007\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0005#\u0000\u0000`[\u0001"+
		"\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bk\u0003\u0014\n\u0000cd\u0005E\u0000\u0000dk\u0003\u0012\t\u0000eh\u0007"+
		"\u0001\u0000\u0000fi\u0003\u0014\n\u0000gi\u0003\u0012\t\u0000hf\u0001"+
		"\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"j`\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000\u0000je\u0001\u0000\u0000"+
		"\u0000k\u008c\u0001\u0000\u0000\u0000lw\u0005\u001b\u0000\u0000ms\u0005"+
		"\u0019\u0000\u0000np\u0007\u0000\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005#\u0000\u0000"+
		"rm\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tx\u0003\u0014\n\u0000uv\u0005E\u0000\u0000vx\u0003\u0012\t\u0000"+
		"wr\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x\u008c\u0001\u0000"+
		"\u0000\u0000y{\u0007\u0000\u0000\u0000z|\u0005.\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005"+
		"#\u0000\u0000~\u008c\u0003\u0014\n\u0000\u007f\u0080\u0007\u0002\u0000"+
		"\u0000\u0080\u008c\u0003\u0014\n\u0000\u0081\u0082\u0005>\u0000\u0000"+
		"\u0082\u0083\u0005#\u0000\u0000\u0083\u008c\u0003\u0014\n\u0000\u0084"+
		"\u0085\u0005E\u0000\u0000\u0085\u008c\u0003\u0012\t\u0000\u0086\u0089"+
		"\u0007\u0001\u0000\u0000\u0087\u008a\u0003\u0014\n\u0000\u0088\u008a\u0003"+
		"\u0012\t\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008bZ\u0001\u0000\u0000"+
		"\u0000\u008bl\u0001\u0000\u0000\u0000\u008by\u0001\u0000\u0000\u0000\u008b"+
		"\u007f\u0001\u0000\u0000\u0000\u008b\u0081\u0001\u0000\u0000\u0000\u008b"+
		"\u0084\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u008f\u0005\u0002\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0007\u0001\u0000\u0000\u0000\u0090\u0092\u0005\u0016\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0003\n\u0005\u0000\u0094\t"+
		"\u0001\u0000\u0000\u0000\u0095\u009c\u0003\u000e\u0007\u0000\u0096\u0098"+
		"\u0005\u0002\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0003\u0010\b\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0005\u0002\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u000b\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0007\u0003\u0000\u0000\u00a3\r\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0003\f\u0006\u0000\u00a5\u00a8\u0003\u0016\u000b"+
		"\u0000\u00a6\u00a7\u0005%\u0000\u0000\u00a7\u00a9\u0007\u0004\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00ac\u0007\u0005\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003\f\u0006\u0000\u00ae"+
		"\u00b1\u0003\u0016\u000b\u0000\u00af\u00b0\u0005%\u0000\u0000\u00b0\u00b2"+
		"\u0007\u0004\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u0011\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u00038\u001c\u0000\u00b4\u0013\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"+\u0000\u0000\u00b6\u00bc\u00030\u0018\u0000\u00b7\u00b8\u00030\u0018"+
		"\u0000\u00b8\u00b9\u0005+\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bc\u00030\u0018\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u0015\u0001\u0000\u0000\u0000\u00bd\u00be\u00038\u001c\u0000\u00be\u0017"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u00038\u001c\u0000\u00c0\u0019\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c3\u00059\u0000\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0003.\u0017\u0000\u00c5\u001b\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7\u001d\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u00056\u0000\u0000\u00c9\u00ca\u00036\u001b\u0000\u00ca"+
		"\u001f\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u0002\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005F\u0000\u0000\u00cf\u00d1"+
		"\u0003\"\u0011\u0000\u00d0\u00d2\u0005\u0002\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2!\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u00054\u0000\u0000\u00d4\u00d5\u0005K\u0000\u0000"+
		"\u00d5\u00d6\u0003$\u0012\u0000\u00d6#\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005L\u0000\u0000\u00d8%\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\u0002"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0003(\u0014"+
		"\u0000\u00dd\u00df\u0005\u0002\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\'\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005G\u0000\u0000\u00e1\u00f4\u0003*\u0015\u0000\u00e2\u00e3"+
		"\u0005\u001f\u0000\u0000\u00e3\u00f4\u0003*\u0015\u0000\u00e4\u00e5\u0005"+
		"\u0014\u0000\u0000\u00e5\u00f4\u0003,\u0016\u0000\u00e6\u00e7\u0005?\u0000"+
		"\u0000\u00e7\u00f4\u0003\u0018\f\u0000\u00e8\u00e9\u0005\u0018\u0000\u0000"+
		"\u00e9\u00f4\u0003\u0018\f\u0000\u00ea\u00eb\u0005\u0017\u0000\u0000\u00eb"+
		"\u00ec\u00059\u0000\u0000\u00ec\u00ed\u0007\u0006\u0000\u0000\u00ed\u00f4"+
		"\u0005<\u0000\u0000\u00ee\u00f4\u0007\u0007\u0000\u0000\u00ef\u00f4\u0005"+
		"\u001d\u0000\u0000\u00f0\u00f4\u0005\u001a\u0000\u0000\u00f1\u00f4\u0005"+
		"\u0015\u0000\u0000\u00f2\u00f4\u0005,\u0000\u0000\u00f3\u00e0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00e2\u0001\u0000\u0000\u0000\u00f3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00e6\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000"+
		"\u0000\u0000\u00f3\u00ea\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4)\u0001\u0000\u0000\u0000\u00f5\u00f6\u00032\u0019\u0000"+
		"\u00f6+\u0001\u0000\u0000\u0000\u00f7\u00f8\u00032\u0019\u0000\u00f8-"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005I\u0000\u0000\u00fa/\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005I\u0000\u0000\u00fc1\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005L\u0000\u0000\u00fe\u00ff\u00034\u001a\u0000\u00ff3"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0007\b\u0000\u0000\u01015\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u00038\u001c\u0000\u01037\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0006\u001c\uffff\uffff\u0000\u0105\u0106\u0007\t\u0000"+
		"\u0000\u0106\u0135\u00038\u001c\u000b\u0107\u0108\u0005!\u0000\u0000\u0108"+
		"\u0109\u00038\u001c\u0000\u0109\u010a\u0005:\u0000\u0000\u010a\u010b\u0003"+
		"8\u001c\u0007\u010b\u0135\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0017"+
		"\u0000\u0000\u010d\u010e\u00059\u0000\u0000\u010e\u010f\u0007\n\u0000"+
		"\u0000\u010f\u0110\u0005/\u0000\u0000\u0110\u0111\u00050\u0000\u0000\u0111"+
		"\u0112\u00038\u001c\u0000\u0112\u0113\u0005\u0002\u0000\u0000\u0113\u0114"+
		"\u00038\u001c\u0006\u0114\u0135\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"\u000b\u0000\u0000\u0116\u0117\u00038\u001c\u0000\u0117\u0118\u0005\f"+
		"\u0000\u0000\u0118\u0135\u0001\u0000\u0000\u0000\u0119\u011a\u0003:\u001d"+
		"\u0000\u011a\u011b\u0005K\u0000\u0000\u011b\u011c\u0003:\u001d\u0000\u011c"+
		"\u0135\u0001\u0000\u0000\u0000\u011d\u0130\u0005I\u0000\u0000\u011e\u012d"+
		"\u0005\u000b\u0000\u0000\u011f\u0122\u00038\u001c\u0000\u0120\u0122\u0003"+
		":\u001d\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u012a\u0001\u0000\u0000\u0000\u0123\u0126\u0005\u0002"+
		"\u0000\u0000\u0124\u0127\u00038\u001c\u0000\u0125\u0127\u0003:\u001d\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0123\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0121\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0005\f\u0000\u0000\u0130\u011e\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0135\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0005\r\u0000\u0000\u0133\u0135\u0005\u000e\u0000\u0000\u0134\u0104"+
		"\u0001\u0000\u0000\u0000\u0134\u0107\u0001\u0000\u0000\u0000\u0134\u010c"+
		"\u0001\u0000\u0000\u0000\u0134\u0115\u0001\u0000\u0000\u0000\u0134\u0119"+
		"\u0001\u0000\u0000\u0000\u0134\u011d\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0141"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\n\n\u0000\u0000\u0137\u0138\u0005"+
		"\u0005\u0000\u0000\u0138\u0140\u00038\u001c\u000b\u0139\u013a\n\t\u0000"+
		"\u0000\u013a\u013b\u0007\u000b\u0000\u0000\u013b\u0140\u00038\u001c\n"+
		"\u013c\u013d\n\b\u0000\u0000\u013d\u013e\u0007\f\u0000\u0000\u013e\u0140"+
		"\u00038\u001c\t\u013f\u0136\u0001\u0000\u0000\u0000\u013f\u0139\u0001"+
		"\u0000\u0000\u0000\u013f\u013c\u0001\u0000\u0000\u0000\u0140\u0143\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u01429\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0006\u001d\uffff\uffff\u0000\u0145\u0146\u0005"+
		"\u0010\u0000\u0000\u0146\u0162\u0003:\u001d\u0006\u0147\u0162\u0005L\u0000"+
		"\u0000\u0148\u015b\u0005I\u0000\u0000\u0149\u0158\u0005\u000b\u0000\u0000"+
		"\u014a\u014d\u00038\u001c\u0000\u014b\u014d\u0003:\u001d\u0000\u014c\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0155"+
		"\u0001\u0000\u0000\u0000\u014e\u0151\u0005\u0002\u0000\u0000\u014f\u0152"+
		"\u00038\u001c\u0000\u0150\u0152\u0003:\u001d\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000"+
		"\u0000\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u014c\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0005\f\u0000"+
		"\u0000\u015b\u0149\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u0162\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u000b\u0000"+
		"\u0000\u015e\u015f\u0003:\u001d\u0000\u015f\u0160\u0005\f\u0000\u0000"+
		"\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0144\u0001\u0000\u0000\u0000"+
		"\u0161\u0147\u0001\u0000\u0000\u0000\u0161\u0148\u0001\u0000\u0000\u0000"+
		"\u0161\u015d\u0001\u0000\u0000\u0000\u0162\u016e\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\n\u0007\u0000\u0000\u0164\u0165\u0005\u000f\u0000\u0000\u0165"+
		"\u016d\u0003:\u001d\b\u0166\u0167\n\u0005\u0000\u0000\u0167\u0168\u0007"+
		"\r\u0000\u0000\u0168\u016d\u0003:\u001d\u0006\u0169\u016a\n\u0004\u0000"+
		"\u0000\u016a\u016b\u0007\u000e\u0000\u0000\u016b\u016d\u0003:\u001d\u0005"+
		"\u016c\u0163\u0001\u0000\u0000\u0000\u016c\u0166\u0001\u0000\u0000\u0000"+
		"\u016c\u0169\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000"+
		"\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f;\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u00000>"+
		"AFIPSV]`hjorw{\u0089\u008b\u008e\u0091\u0097\u009c\u00a0\u00a8\u00ab\u00b1"+
		"\u00bb\u00c2\u00cc\u00d1\u00da\u00de\u00f3\u0121\u0126\u012a\u012d\u0130"+
		"\u0134\u013f\u0141\u014c\u0151\u0155\u0158\u015b\u0161\u016c\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}