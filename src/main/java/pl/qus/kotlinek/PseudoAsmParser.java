// Generated from PseudoAsmParser.g4 by ANTLR 4.5.1
package pl.qus.kotlinek;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoAsmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DelimitedComment=1, LineComment=2, WS=3, NL=4, DOT=5, HASH=6, LANGLE=7, 
		RANGLE=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, ASSIGNMENT=13, 
		COMMA=14, QUEST=15, AT=16, ARROW=17, MOD=18, DOLLAR=19, QUOTE_OPEN=20, 
		TRIPLE_QUOTE_OPEN=21, FloatLiteral=22, DoubleLiteral=23, IntegerLiteral=24, 
		Identifier=25, UNICODE_CLASS_LL=26, UNICODE_CLASS_LM=27, UNICODE_CLASS_LO=28, 
		UNICODE_CLASS_LT=29, UNICODE_CLASS_LU=30, UNICODE_CLASS_ND=31, UNICODE_CLASS_NL=32, 
		QUOTE_CLOSE=33, LineStrText=34, LineStrEscapedChar=35, TRIPLE_QUOTE_CLOSE=36, 
		MultiLineStringQuote=37, MultiLineStrText=38, MultiLineStrEscapedChar=39, 
		MultiLineNL=40;
	public static final int
		RULE_pseudoAsmFile = 0, RULE_jocker = 1, RULE_operand = 2, RULE_value = 3, 
		RULE_addressed = 4, RULE_index = 5, RULE_immediate = 6, RULE_floatimmediate = 7, 
		RULE_stringimmediate = 8, RULE_absAddress = 9, RULE_name = 10, RULE_typeName = 11, 
		RULE_instrukcja = 12, RULE_linia = 13, RULE_target = 14, RULE_arg = 15, 
		RULE_identifier = 16, RULE_simpleIdentifier = 17, RULE_assemblerBody = 18, 
		RULE_multiLineStringLiteral = 19, RULE_multiLineStringContent = 20, RULE_lineStringLiteral = 21, 
		RULE_lineStringContent = 22;
	public static final String[] ruleNames = {
		"pseudoAsmFile", "jocker", "operand", "value", "addressed", "index", "immediate", 
		"floatimmediate", "stringimmediate", "absAddress", "name", "typeName", 
		"instrukcja", "linia", "target", "arg", "identifier", "simpleIdentifier", 
		"assemblerBody", "multiLineStringLiteral", "multiLineStringContent", "lineStringLiteral", 
		"lineStringContent"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'.'", "'#'", "'<'", "'>'", "'('", "')'", 
		"'['", "']'", "'='", "','", "'?'", "'@'", "'->'", "'%'", "'$'", null, 
		"'\"\"\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DelimitedComment", "LineComment", "WS", "NL", "DOT", "HASH", "LANGLE", 
		"RANGLE", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "ASSIGNMENT", "COMMA", 
		"QUEST", "AT", "ARROW", "MOD", "DOLLAR", "QUOTE_OPEN", "TRIPLE_QUOTE_OPEN", 
		"FloatLiteral", "DoubleLiteral", "IntegerLiteral", "Identifier", "UNICODE_CLASS_LL", 
		"UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", 
		"UNICODE_CLASS_ND", "UNICODE_CLASS_NL", "QUOTE_CLOSE", "LineStrText", 
		"LineStrEscapedChar", "TRIPLE_QUOTE_CLOSE", "MultiLineStringQuote", "MultiLineStrText", 
		"MultiLineStrEscapedChar", "MultiLineNL"
	};
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
	public String getGrammarFileName() { return "PseudoAsmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudoAsmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PseudoAsmFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PseudoAsmParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(PseudoAsmParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PseudoAsmParser.NL, i);
		}
		public List<LiniaContext> linia() {
			return getRuleContexts(LiniaContext.class);
		}
		public LiniaContext linia(int i) {
			return getRuleContext(LiniaContext.class,i);
		}
		public PseudoAsmFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoAsmFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterPseudoAsmFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitPseudoAsmFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitPseudoAsmFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoAsmFileContext pseudoAsmFile() throws RecognitionException {
		PseudoAsmFileContext _localctx = new PseudoAsmFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pseudoAsmFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(46);
				match(NL);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(52);
				linia();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(53);
					match(NL);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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

	public static class JockerContext extends ParserRuleContext {
		public TerminalNode QUEST() { return getToken(PseudoAsmParser.QUEST, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public JockerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jocker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterJocker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitJocker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitJocker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JockerContext jocker() throws RecognitionException {
		JockerContext _localctx = new JockerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jocker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(QUEST);
			setState(67);
			simpleIdentifier();
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

	public static class OperandContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			value();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LANGLE) {
				{
				{
				setState(70);
				name();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQUARE) {
				{
				{
				setState(76);
				typeName();
				}
				}
				setState(81);
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

	public static class ValueContext extends ParserRuleContext {
		public AddressedContext addressed() {
			return getRuleContext(AddressedContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public FloatimmediateContext floatimmediate() {
			return getRuleContext(FloatimmediateContext.class,0);
		}
		public StringimmediateContext stringimmediate() {
			return getRuleContext(StringimmediateContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			switch (_input.LA(1)) {
			case QUEST:
			case IntegerLiteral:
			case Identifier:
				{
				setState(82);
				addressed();
				}
				break;
			case HASH:
				{
				setState(83);
				immediate();
				}
				break;
			case MOD:
				{
				setState(84);
				floatimmediate();
				}
				break;
			case DOLLAR:
				{
				setState(85);
				stringimmediate();
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

	public static class AddressedContext extends ParserRuleContext {
		public JockerContext jocker() {
			return getRuleContext(JockerContext.class,0);
		}
		public AbsAddressContext absAddress() {
			return getRuleContext(AbsAddressContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PseudoAsmParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PseudoAsmParser.LPAREN, i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PseudoAsmParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PseudoAsmParser.RPAREN, i);
		}
		public AddressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterAddressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitAddressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitAddressed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressedContext addressed() throws RecognitionException {
		AddressedContext _localctx = new AddressedContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addressed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(88);
				jocker();
				}
				break;
			case IntegerLiteral:
				{
				setState(89);
				absAddress();
				}
				break;
			case Identifier:
				{
				setState(90);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(93);
				match(LPAREN);
				setState(94);
				index();
				setState(95);
				match(RPAREN);
				}
				}
				setState(101);
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

	public static class IndexContext extends ParserRuleContext {
		public JockerContext jocker() {
			return getRuleContext(JockerContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(PseudoAsmParser.IntegerLiteral, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(102);
				jocker();
				}
				break;
			case IntegerLiteral:
				{
				setState(103);
				match(IntegerLiteral);
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

	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(PseudoAsmParser.HASH, 0); }
		public JockerContext jocker() {
			return getRuleContext(JockerContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(PseudoAsmParser.IntegerLiteral, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(HASH);
			setState(109);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(107);
				jocker();
				}
				break;
			case IntegerLiteral:
				{
				setState(108);
				match(IntegerLiteral);
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

	public static class FloatimmediateContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(PseudoAsmParser.MOD, 0); }
		public JockerContext jocker() {
			return getRuleContext(JockerContext.class,0);
		}
		public TerminalNode DoubleLiteral() { return getToken(PseudoAsmParser.DoubleLiteral, 0); }
		public FloatimmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatimmediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterFloatimmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitFloatimmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitFloatimmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatimmediateContext floatimmediate() throws RecognitionException {
		FloatimmediateContext _localctx = new FloatimmediateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatimmediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MOD);
			setState(114);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(112);
				jocker();
				}
				break;
			case DoubleLiteral:
				{
				setState(113);
				match(DoubleLiteral);
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

	public static class StringimmediateContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(PseudoAsmParser.DOLLAR, 0); }
		public JockerContext jocker() {
			return getRuleContext(JockerContext.class,0);
		}
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public StringimmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringimmediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterStringimmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitStringimmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitStringimmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringimmediateContext stringimmediate() throws RecognitionException {
		StringimmediateContext _localctx = new StringimmediateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringimmediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(DOLLAR);
			setState(119);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(117);
				jocker();
				}
				break;
			case QUOTE_OPEN:
				{
				setState(118);
				lineStringLiteral();
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

	public static class AbsAddressContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(PseudoAsmParser.IntegerLiteral, 0); }
		public AbsAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterAbsAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitAbsAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitAbsAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsAddressContext absAddress() throws RecognitionException {
		AbsAddressContext _localctx = new AbsAddressContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_absAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IntegerLiteral);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(PseudoAsmParser.LANGLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(PseudoAsmParser.RANGLE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LANGLE);
			setState(124);
			identifier();
			setState(125);
			match(RANGLE);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(PseudoAsmParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(PseudoAsmParser.RSQUARE, 0); }
		public JockerContext jocker() {
			return getRuleContext(JockerContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LSQUARE);
			setState(130);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(128);
				jocker();
				}
				break;
			case Identifier:
				{
				setState(129);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(RSQUARE);
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

	public static class InstrukcjaContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public InstrukcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitInstrukcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitInstrukcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instrukcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			simpleIdentifier();
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

	public static class LiniaContext extends ParserRuleContext {
		public InstrukcjaContext instrukcja() {
			return getRuleContext(InstrukcjaContext.class,0);
		}
		public TerminalNode NL() { return getToken(PseudoAsmParser.NL, 0); }
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(PseudoAsmParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(PseudoAsmParser.ASSIGNMENT, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(PseudoAsmParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(PseudoAsmParser.ARROW, i);
		}
		public List<AssemblerBodyContext> assemblerBody() {
			return getRuleContexts(AssemblerBodyContext.class);
		}
		public AssemblerBodyContext assemblerBody(int i) {
			return getRuleContext(AssemblerBodyContext.class,i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoAsmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoAsmParser.COMMA, i);
		}
		public LiniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterLinia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitLinia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitLinia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiniaContext linia() throws RecognitionException {
		LiniaContext _localctx = new LiniaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_linia);
		int _la;
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				instrukcja();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HASH) | (1L << QUEST) | (1L << MOD) | (1L << DOLLAR) | (1L << IntegerLiteral) | (1L << Identifier))) != 0)) {
					{
					{
					setState(137);
					target();
					setState(138);
					match(ASSIGNMENT);
					{
					setState(139);
					arg();
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(140);
						match(COMMA);
						setState(141);
						arg();
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(152);
					match(ARROW);
					setState(153);
					assemblerBody();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				instrukcja();
				setState(162);
				arg();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					arg();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(170);
					match(ARROW);
					setState(171);
					assemblerBody();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(NL);
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

	public static class TargetContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			operand();
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

	public static class ArgContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			operand();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PseudoAsmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PseudoAsmParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(PseudoAsmParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PseudoAsmParser.NL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			simpleIdentifier();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(186);
						match(NL);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(192);
					match(DOT);
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(193);
							simpleIdentifier();
							}
							} 
						}
						setState(198);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoAsmParser.Identifier, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Identifier);
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

	public static class AssemblerBodyContext extends ParserRuleContext {
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public AssemblerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterAssemblerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitAssemblerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitAssemblerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblerBodyContext assemblerBody() throws RecognitionException {
		AssemblerBodyContext _localctx = new AssemblerBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assemblerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			multiLineStringLiteral();
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

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(PseudoAsmParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(PseudoAsmParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<TerminalNode> MultiLineStringQuote() { return getTokens(PseudoAsmParser.MultiLineStringQuote); }
		public TerminalNode MultiLineStringQuote(int i) {
			return getToken(PseudoAsmParser.MultiLineStringQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitMultiLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitMultiLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(TRIPLE_QUOTE_OPEN);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultiLineStringQuote || _la==MultiLineStrText) {
				{
				setState(211);
				switch (_input.LA(1)) {
				case MultiLineStrText:
					{
					setState(209);
					multiLineStringContent();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(210);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(TRIPLE_QUOTE_CLOSE);
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

	public static class MultiLineStringContentContext extends ParserRuleContext {
		public TerminalNode MultiLineStrText() { return getToken(PseudoAsmParser.MultiLineStrText, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitMultiLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitMultiLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiLineStringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(MultiLineStrText);
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

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(PseudoAsmParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(PseudoAsmParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(QUOTE_OPEN);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(221);
				lineStringContent();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(QUOTE_CLOSE);
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

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(PseudoAsmParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(PseudoAsmParser.LineStrEscapedChar, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==LineStrText || _la==LineStrEscapedChar) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\7\4P"+
		"\n\4\f\4\16\4S\13\4\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\5\6^\n\6\3\6"+
		"\3\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\5\b"+
		"p\n\b\3\t\3\t\3\t\5\tu\n\t\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\5\r\u0085\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u0091\n\17\f\17\16\17\u0094\13\17\7\17\u0096\n\17\f\17\16"+
		"\17\u0099\13\17\3\17\3\17\7\17\u009d\n\17\f\17\16\17\u00a0\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00a8\n\17\f\17\16\17\u00ab\13\17\3\17"+
		"\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17\3\17\3\17\5\17\u00b6\n\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\7\22\u00be\n\22\f\22\16\22\u00c1\13\22"+
		"\3\22\3\22\7\22\u00c5\n\22\f\22\16\22\u00c8\13\22\7\22\u00ca\n\22\f\22"+
		"\16\22\u00cd\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u00d6\n\25"+
		"\f\25\16\25\u00d9\13\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00e1\n\27"+
		"\f\27\16\27\u00e4\13\27\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2$%\u00ee\2\63\3\2\2\2\4D\3\2"+
		"\2\2\6G\3\2\2\2\bX\3\2\2\2\n]\3\2\2\2\fj\3\2\2\2\16l\3\2\2\2\20q\3\2\2"+
		"\2\22v\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0081\3\2\2\2\32\u0088\3\2\2"+
		"\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2\2\2$\u00ce"+
		"\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00dc\3\2\2\2,\u00de\3\2\2\2."+
		"\u00e7\3\2\2\2\60\62\7\6\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64?\3\2\2\2\65\63\3\2\2\2\66:\5\34\17\2\679\7\6\2\28\67"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\66\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2"+
		"\2DE\7\21\2\2EF\5$\23\2F\5\3\2\2\2GK\5\b\5\2HJ\5\26\f\2IH\3\2\2\2JM\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\30\r\2ON\3\2\2\2PS"+
		"\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2SQ\3\2\2\2TY\5\n\6\2UY\5\16\b\2"+
		"VY\5\20\t\2WY\5\22\n\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\t\3\2"+
		"\2\2Z^\5\4\3\2[^\5\24\13\2\\^\5\"\22\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2"+
		"^e\3\2\2\2_`\7\13\2\2`a\5\f\7\2ab\7\f\2\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hk\5\4\3\2ik\7\32\2\2jh\3"+
		"\2\2\2ji\3\2\2\2k\r\3\2\2\2lo\7\b\2\2mp\5\4\3\2np\7\32\2\2om\3\2\2\2o"+
		"n\3\2\2\2p\17\3\2\2\2qt\7\24\2\2ru\5\4\3\2su\7\31\2\2tr\3\2\2\2ts\3\2"+
		"\2\2u\21\3\2\2\2vy\7\25\2\2wz\5\4\3\2xz\5,\27\2yw\3\2\2\2yx\3\2\2\2z\23"+
		"\3\2\2\2{|\7\32\2\2|\25\3\2\2\2}~\7\t\2\2~\177\5\"\22\2\177\u0080\7\n"+
		"\2\2\u0080\27\3\2\2\2\u0081\u0084\7\r\2\2\u0082\u0085\5\4\3\2\u0083\u0085"+
		"\5\"\22\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\7\16\2\2\u0087\31\3\2\2\2\u0088\u0089\5$\23\2\u0089\33\3"+
		"\2\2\2\u008a\u0097\5\32\16\2\u008b\u008c\5\36\20\2\u008c\u008d\7\17\2"+
		"\2\u008d\u0092\5 \21\2\u008e\u008f\7\20\2\2\u008f\u0091\5 \21\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008b\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009e\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\23\2\2\u009b\u009d\5&\24\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2"+
		"\u00b6\3\2\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a9\5 \21\2\u00a5\u00a6\7"+
		"\20\2\2\u00a6\u00a8\5 \21\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b0\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00af\5&\24\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u008a\3\2\2\2\u00b5\u00a3\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\5\6\4"+
		"\2\u00b8\37\3\2\2\2\u00b9\u00ba\5\6\4\2\u00ba!\3\2\2\2\u00bb\u00cb\5$"+
		"\23\2\u00bc\u00be\7\6\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c6\7\7\2\2\u00c3\u00c5\5$\23\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00bf\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00ce\u00cf\7\33\2\2\u00cf%\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\'\3\2\2"+
		"\2\u00d2\u00d7\7\27\2\2\u00d3\u00d6\5*\26\2\u00d4\u00d6\7\'\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7&\2\2\u00db)\3\2\2\2\u00dc\u00dd\7(\2\2\u00dd+\3\2\2\2\u00de\u00e2"+
		"\7\26\2\2\u00df\u00e1\5.\30\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6-\3\2\2\2\u00e7\u00e8\t\2\2\2\u00e8/"+
		"\3\2\2\2\33\63:?KQX]ejoty\u0084\u0092\u0097\u009e\u00a9\u00b0\u00b5\u00bf"+
		"\u00c6\u00cb\u00d5\u00d7\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}