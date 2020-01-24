// Generated from PseudoAsmParser.g4 by ANTLR 4.5.1
package pl.qus.wolin;
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
		COMMA=14, QUEST=15, AT=16, ARROW=17, MOD=18, DOLLAR=19, REFERENCE=20, 
		DEREFERENCE=21, QUOTE_OPEN=22, TRIPLE_QUOTE_OPEN=23, FloatLiteral=24, 
		DoubleLiteral=25, IntegerLiteral=26, Identifier=27, UNICODE_CLASS_LL=28, 
		UNICODE_CLASS_LM=29, UNICODE_CLASS_LO=30, UNICODE_CLASS_LT=31, UNICODE_CLASS_LU=32, 
		UNICODE_CLASS_ND=33, UNICODE_CLASS_NL=34, QUOTE_CLOSE=35, LineStrText=36, 
		LineStrEscapedChar=37, TRIPLE_QUOTE_CLOSE=38, MultiLineStringQuote=39, 
		MultiLineStrText=40, MultiLineStrEscapedChar=41, MultiLineNL=42;
	public static final int
		RULE_pseudoAsmFile = 0, RULE_jocker = 1, RULE_referencer = 2, RULE_operand = 3, 
		RULE_value = 4, RULE_addressed = 5, RULE_index = 6, RULE_immediate = 7, 
		RULE_floatimmediate = 8, RULE_stringimmediate = 9, RULE_absAddress = 10, 
		RULE_name = 11, RULE_typeName = 12, RULE_instrukcja = 13, RULE_linia = 14, 
		RULE_target = 15, RULE_arg = 16, RULE_identifier = 17, RULE_simpleIdentifier = 18, 
		RULE_assemblerBody = 19, RULE_multiLineStringLiteral = 20, RULE_multiLineStringContent = 21, 
		RULE_lineStringLiteral = 22, RULE_lineStringContent = 23;
	public static final String[] ruleNames = {
		"pseudoAsmFile", "jocker", "referencer", "operand", "value", "addressed", 
		"index", "immediate", "floatimmediate", "stringimmediate", "absAddress", 
		"name", "typeName", "instrukcja", "linia", "target", "arg", "identifier", 
		"simpleIdentifier", "assemblerBody", "multiLineStringLiteral", "multiLineStringContent", 
		"lineStringLiteral", "lineStringContent"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'.'", "'#'", "'<'", "'>'", "'('", "')'", 
		"'['", "']'", "'='", "','", "'?'", "'@'", "'->'", "'%'", "'$'", "'*'", 
		"'&'", null, "'\"\"\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DelimitedComment", "LineComment", "WS", "NL", "DOT", "HASH", "LANGLE", 
		"RANGLE", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "ASSIGNMENT", "COMMA", 
		"QUEST", "AT", "ARROW", "MOD", "DOLLAR", "REFERENCE", "DEREFERENCE", "QUOTE_OPEN", 
		"TRIPLE_QUOTE_OPEN", "FloatLiteral", "DoubleLiteral", "IntegerLiteral", 
		"Identifier", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
		"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
		"QUOTE_CLOSE", "LineStrText", "LineStrEscapedChar", "TRIPLE_QUOTE_CLOSE", 
		"MultiLineStringQuote", "MultiLineStrText", "MultiLineStrEscapedChar", 
		"MultiLineNL"
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(48);
				match(NL);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(54);
				linia();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(55);
					match(NL);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
			setState(68);
			match(QUEST);
			setState(69);
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

	public static class ReferencerContext extends ParserRuleContext {
		public TerminalNode REFERENCE() { return getToken(PseudoAsmParser.REFERENCE, 0); }
		public TerminalNode DEREFERENCE() { return getToken(PseudoAsmParser.DEREFERENCE, 0); }
		public ReferencerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).enterReferencer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoAsmParserListener ) ((PseudoAsmParserListener)listener).exitReferencer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoAsmParserVisitor ) return ((PseudoAsmParserVisitor<? extends T>)visitor).visitReferencer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencerContext referencer() throws RecognitionException {
		ReferencerContext _localctx = new ReferencerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_referencer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==DEREFERENCE) ) {
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

	public static class OperandContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ReferencerContext> referencer() {
			return getRuleContexts(ReferencerContext.class);
		}
		public ReferencerContext referencer(int i) {
			return getRuleContext(ReferencerContext.class,i);
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
		enterRule(_localctx, 6, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REFERENCE || _la==DEREFERENCE) {
				{
				{
				setState(73);
				referencer();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			value();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LANGLE) {
				{
				{
				setState(80);
				name();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQUARE) {
				{
				{
				setState(86);
				typeName();
				}
				}
				setState(91);
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
		enterRule(_localctx, 8, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			switch (_input.LA(1)) {
			case QUEST:
			case IntegerLiteral:
			case Identifier:
				{
				setState(92);
				addressed();
				}
				break;
			case HASH:
				{
				setState(93);
				immediate();
				}
				break;
			case MOD:
				{
				setState(94);
				floatimmediate();
				}
				break;
			case DOLLAR:
				{
				setState(95);
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
		enterRule(_localctx, 10, RULE_addressed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(98);
				jocker();
				}
				break;
			case IntegerLiteral:
				{
				setState(99);
				absAddress();
				}
				break;
			case Identifier:
				{
				setState(100);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(103);
				match(LPAREN);
				setState(104);
				index();
				setState(105);
				match(RPAREN);
				}
				}
				setState(111);
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
		enterRule(_localctx, 12, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(112);
				jocker();
				}
				break;
			case IntegerLiteral:
				{
				setState(113);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(HASH);
			setState(120);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(117);
				jocker();
				}
				break;
			case IntegerLiteral:
				{
				setState(118);
				match(IntegerLiteral);
				}
				break;
			case Identifier:
				{
				setState(119);
				identifier();
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
		enterRule(_localctx, 16, RULE_floatimmediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(MOD);
			setState(125);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(123);
				jocker();
				}
				break;
			case DoubleLiteral:
				{
				setState(124);
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
		enterRule(_localctx, 18, RULE_stringimmediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(DOLLAR);
			setState(130);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(128);
				jocker();
				}
				break;
			case QUOTE_OPEN:
				{
				setState(129);
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
		enterRule(_localctx, 20, RULE_absAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LANGLE);
			setState(135);
			identifier();
			setState(136);
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
		public List<ReferencerContext> referencer() {
			return getRuleContexts(ReferencerContext.class);
		}
		public ReferencerContext referencer(int i) {
			return getRuleContext(ReferencerContext.class,i);
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
		enterRule(_localctx, 24, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(LSQUARE);
			setState(141);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(139);
				jocker();
				}
				break;
			case Identifier:
				{
				setState(140);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REFERENCE || _la==DEREFERENCE) {
				{
				{
				setState(143);
				referencer();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		enterRule(_localctx, 26, RULE_instrukcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 28, RULE_linia);
		int _la;
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				instrukcja();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HASH) | (1L << QUEST) | (1L << MOD) | (1L << DOLLAR) | (1L << REFERENCE) | (1L << DEREFERENCE) | (1L << IntegerLiteral) | (1L << Identifier))) != 0)) {
					{
					{
					setState(154);
					target();
					setState(155);
					match(ASSIGNMENT);
					{
					setState(156);
					arg();
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(157);
						match(COMMA);
						setState(158);
						arg();
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(169);
					match(ARROW);
					setState(170);
					assemblerBody();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				instrukcja();
				setState(179);
				arg();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					arg();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(187);
					match(ARROW);
					setState(188);
					assemblerBody();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
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
		enterRule(_localctx, 30, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 32, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 34, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			simpleIdentifier();
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(203);
						match(NL);
						}
						}
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(209);
					match(DOT);
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(210);
							simpleIdentifier();
							}
							} 
						}
						setState(215);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 36, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 38, RULE_assemblerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 40, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TRIPLE_QUOTE_OPEN);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultiLineStringQuote || _la==MultiLineStrText) {
				{
				setState(228);
				switch (_input.LA(1)) {
				case MultiLineStrText:
					{
					setState(226);
					multiLineStringContent();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(227);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
		enterRule(_localctx, 42, RULE_multiLineStringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 44, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(QUOTE_OPEN);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(238);
				lineStringContent();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		enterRule(_localctx, 46, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\7\5M\n\5\f\5\16\5"+
		"P\13\5\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6"+
		"\3\6\3\6\3\6\5\6c\n\6\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\7\7n\n\7\f"+
		"\7\16\7q\13\7\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\5"+
		"\n\u0080\n\n\3\13\3\13\3\13\5\13\u0085\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\5\16\u0090\n\16\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a2\n\20"+
		"\f\20\16\20\u00a5\13\20\7\20\u00a7\n\20\f\20\16\20\u00aa\13\20\3\20\3"+
		"\20\7\20\u00ae\n\20\f\20\16\20\u00b1\13\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13\20\3\20\3\20\7\20\u00c0\n\20\f"+
		"\20\16\20\u00c3\13\20\3\20\3\20\5\20\u00c7\n\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\7\23\u00cf\n\23\f\23\16\23\u00d2\13\23\3\23\3\23\7\23\u00d6\n"+
		"\23\f\23\16\23\u00d9\13\23\7\23\u00db\n\23\f\23\16\23\u00de\13\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00e7\n\26\f\26\16\26\u00ea\13\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u00f2\n\30\f\30\16\30\u00f5\13\30"+
		"\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\4\3\2\26\27\3\2&\'\u0101\2\65\3\2\2\2\4F\3\2\2\2\6I\3\2"+
		"\2\2\bN\3\2\2\2\nb\3\2\2\2\fg\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22|\3\2"+
		"\2\2\24\u0081\3\2\2\2\26\u0086\3\2\2\2\30\u0088\3\2\2\2\32\u008c\3\2\2"+
		"\2\34\u0099\3\2\2\2\36\u00c6\3\2\2\2 \u00c8\3\2\2\2\"\u00ca\3\2\2\2$\u00cc"+
		"\3\2\2\2&\u00df\3\2\2\2(\u00e1\3\2\2\2*\u00e3\3\2\2\2,\u00ed\3\2\2\2."+
		"\u00ef\3\2\2\2\60\u00f8\3\2\2\2\62\64\7\6\2\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66A\3\2\2\2\67\65\3\2\2\28<\5\36\20\2"+
		"9;\7\6\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		"?8\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\2\2\3"+
		"E\3\3\2\2\2FG\7\21\2\2GH\5&\24\2H\5\3\2\2\2IJ\t\2\2\2J\7\3\2\2\2KM\5\6"+
		"\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\5\n"+
		"\6\2RT\5\30\r\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3"+
		"\2\2\2XZ\5\32\16\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2"+
		"\2][\3\2\2\2^c\5\f\7\2_c\5\20\t\2`c\5\22\n\2ac\5\24\13\2b^\3\2\2\2b_\3"+
		"\2\2\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2\2dh\5\4\3\2eh\5\26\f\2fh\5$\23\2"+
		"gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2ho\3\2\2\2ij\7\13\2\2jk\5\16\b\2kl\7\f\2"+
		"\2ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3\2\2\2qo\3\2"+
		"\2\2ru\5\4\3\2su\7\34\2\2tr\3\2\2\2ts\3\2\2\2u\17\3\2\2\2vz\7\b\2\2w{"+
		"\5\4\3\2x{\7\34\2\2y{\5$\23\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\21\3\2\2"+
		"\2|\177\7\24\2\2}\u0080\5\4\3\2~\u0080\7\33\2\2\177}\3\2\2\2\177~\3\2"+
		"\2\2\u0080\23\3\2\2\2\u0081\u0084\7\25\2\2\u0082\u0085\5\4\3\2\u0083\u0085"+
		"\5.\30\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\25\3\2\2\2\u0086"+
		"\u0087\7\34\2\2\u0087\27\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008a\5$\23"+
		"\2\u008a\u008b\7\n\2\2\u008b\31\3\2\2\2\u008c\u008f\7\r\2\2\u008d\u0090"+
		"\5\4\3\2\u008e\u0090\5$\23\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0094\3\2\2\2\u0091\u0093\5\6\4\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\16\2\2\u0098\33\3\2\2\2\u0099\u009a\5&\24"+
		"\2\u009a\35\3\2\2\2\u009b\u00a8\5\34\17\2\u009c\u009d\5 \21\2\u009d\u009e"+
		"\7\17\2\2\u009e\u00a3\5\"\22\2\u009f\u00a0\7\20\2\2\u00a0\u00a2\5\"\22"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u009c\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00af\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\23\2\2\u00ac\u00ae\5(\25\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00c7\3\2\2\2\u00b4\u00b5\5\34\17\2\u00b5\u00ba\5\"\22\2\u00b6\u00b7"+
		"\7\20\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00be\7\23\2\2\u00be\u00c0\5(\25\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\6\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u009b\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\5\b\5"+
		"\2\u00c9!\3\2\2\2\u00ca\u00cb\5\b\5\2\u00cb#\3\2\2\2\u00cc\u00dc\5&\24"+
		"\2\u00cd\u00cf\7\6\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d7\7\7\2\2\u00d4\u00d6\5&\24\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00d0\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd%\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0"+
		"\7\35\2\2\u00e0\'\3\2\2\2\u00e1\u00e2\5*\26\2\u00e2)\3\2\2\2\u00e3\u00e8"+
		"\7\31\2\2\u00e4\u00e7\5,\27\2\u00e5\u00e7\7)\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7(\2\2\u00ec"+
		"+\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee-\3\2\2\2\u00ef\u00f3\7\30\2\2\u00f0"+
		"\u00f2\5\60\31\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f7\7%\2\2\u00f7/\3\2\2\2\u00f8\u00f9\t\3\2\2\u00f9\61\3\2\2\2\35\65"+
		"<ANU[bgotz\177\u0084\u008f\u0094\u00a3\u00a8\u00af\u00ba\u00c1\u00c6\u00d0"+
		"\u00d7\u00dc\u00e6\u00e8\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}