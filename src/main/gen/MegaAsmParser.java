// Generated from D:/Projekty/kotlinek/src/main/antlr\MegaAsmParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MegaAsmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ShebangLine=1, DelimitedComment=2, LineComment=3, WS=4, NL=5, RESERVED=6, 
		DOT=7, COMMA=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, LCURL=13, 
		RCURL=14, REFERENCE=15, MOD=16, DIV=17, ADD=18, SUB=19, INCR=20, DECR=21, 
		DEREFERENCE=22, DISJ=23, EXCL=24, COLON=25, SEMICOLON=26, ASSIGNMENT=27, 
		ADD_ASSIGNMENT=28, SUB_ASSIGNMENT=29, MULT_ASSIGNMENT=30, DIV_ASSIGNMENT=31, 
		MOD_ASSIGNMENT=32, ARROW=33, DOUBLE_ARROW=34, RANGE=35, COLONCOLON=36, 
		Q_COLONCOLON=37, DOUBLE_SEMICOLON=38, HASH=39, AT=40, QUEST=41, ELVIS=42, 
		LANGLE=43, RANGLE=44, LE=45, GE=46, EXCL_EQ=47, EXCL_EQEQ=48, AS_SAFE=49, 
		EQEQ=50, EQEQEQ=51, SINGLE_QUOTE=52, RETURN_AT=53, CONTINUE_AT=54, BREAK_AT=55, 
		FILE=56, PACKAGE=57, IMPORT=58, CLASS=59, INTERFACE=60, FUN=61, OBJECT=62, 
		VAL=63, VAR=64, TYPE_ALIAS=65, CONSTRUCTOR=66, BY=67, COMPANION=68, INIT=69, 
		THIS=70, SUPER=71, TYPEOF=72, WHERE=73, IF=74, ELSE=75, WHEN=76, TRY=77, 
		CATCH=78, FINALLY=79, FOR=80, DO=81, WHILE=82, THROW=83, RETURN=84, CONTINUE=85, 
		BREAK=86, AS=87, IS=88, IN=89, NOT_IS=90, NOT_IN=91, OUT=92, FIELD=93, 
		PROPERTY=94, GET=95, SET=96, GETTER=97, SETTER=98, RECEIVER=99, PARAM=100, 
		SETPARAM=101, DELEGATE=102, DYNAMIC=103, PUBLIC=104, PRIVATE=105, PROTECTED=106, 
		INTERNAL=107, ENUM=108, SEALED=109, ANNOTATION=110, DATA=111, INNER=112, 
		TAILREC=113, OPERATOR=114, INLINE=115, INFIX=116, EXTERNAL=117, SUSPEND=118, 
		OVERRIDE=119, ABSTRACT=120, FINAL=121, OPEN=122, CONST=123, LATEINIT=124, 
		VARARG=125, NOINLINE=126, CROSSINLINE=127, REIFIED=128, QUOTE_OPEN=129, 
		TRIPLE_QUOTE_OPEN=130, RealLiteral=131, FloatLiteral=132, DoubleLiteral=133, 
		LongLiteral=134, IntegerLiteral=135, HexLiteral=136, BinLiteral=137, BooleanLiteral=138, 
		NullLiteral=139, Identifier=140, LabelReference=141, LabelDefinition=142, 
		FieldIdentifier=143, CharacterLiteral=144, UNICODE_CLASS_LL=145, UNICODE_CLASS_LM=146, 
		UNICODE_CLASS_LO=147, UNICODE_CLASS_LT=148, UNICODE_CLASS_LU=149, UNICODE_CLASS_ND=150, 
		UNICODE_CLASS_NL=151, Inside_Comment=152, Inside_WS=153, Inside_NL=154, 
		QUOTE_CLOSE=155, LineStrRef=156, LineStrText=157, LineStrEscapedChar=158, 
		LineStrExprStart=159, TRIPLE_QUOTE_CLOSE=160, MultiLineStringQuote=161, 
		MultiLineStrRef=162, MultiLineStrText=163, MultiLineStrEscapedChar=164, 
		MultiLineStrExprStart=165, MultiLineNL=166, StrExpr_IN=167, StrExpr_Comment=168, 
		StrExpr_WS=169, StrExpr_NL=170, DOLLAR=180, Operator=181;
	public static final int
		RULE_pseudoAsmFile = 0, RULE_referencer = 1, RULE_operand = 2, RULE_value = 3, 
		RULE_addressed = 4, RULE_index = 5, RULE_immediate = 6, RULE_floatimmediate = 7, 
		RULE_stringimmediate = 8, RULE_absAddress = 9, RULE_typeName = 10, RULE_instrukcja = 11, 
		RULE_linia = 12, RULE_target = 13, RULE_arg = 14, RULE_identifier = 15, 
		RULE_simpleIdentifier = 16, RULE_assemblerBody = 17, RULE_multiLineStringLiteral = 18, 
		RULE_multiLineStringContent = 19, RULE_lineStringLiteral = 20, RULE_lineStringContent = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"pseudoAsmFile", "referencer", "operand", "value", "addressed", "index", 
			"immediate", "floatimmediate", "stringimmediate", "absAddress", "typeName", 
			"instrukcja", "linia", "target", "arg", "identifier", "simpleIdentifier", 
			"assemblerBody", "multiLineStringLiteral", "multiLineStringContent", 
			"lineStringLiteral", "lineStringContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'...'", "'.'", "','", "'('", null, 
			"'['", null, "'{'", "'}'", "'*'", "'%'", "'/'", "'+'", "'-'", "'++'", 
			"'--'", "'&'", "'||'", "'!'", "':'", "';'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'->'", "'=>'", "'..'", "'::'", "'?::'", "';;'", "'#'", 
			"'@'", "'?'", "'?:'", "'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", 
			"'as?'", "'=='", "'==='", "'''", null, null, null, "'@file'", "'package'", 
			"'import'", "'class'", "'interface'", "'fun'", "'object'", "'val'", "'var'", 
			"'typealias'", "'constructor'", "'by'", "'companion'", "'init'", "'this'", 
			"'super'", "'typeof'", "'where'", "'if'", "'else'", "'when'", "'try'", 
			"'catch'", "'finally'", "'for'", "'do'", "'while'", "'throw'", "'return'", 
			"'continue'", "'break'", "'as'", "'is'", "'in'", null, null, "'out'", 
			"'@field'", "'@property'", "'@get'", "'@set'", "'get'", "'set'", "'@receiver'", 
			"'@param'", "'@setparam'", "'@delegate'", "'dynamic'", "'public'", "'private'", 
			"'protected'", "'internal'", "'enum'", "'sealed'", "'annotation'", "'data'", 
			"'inner'", "'tailrec'", "'operator'", "'inline'", "'infix'", "'external'", 
			"'suspend'", "'override'", "'abstract'", "'final'", "'open'", "'const'", 
			"'lateinit'", "'vararg'", "'noinline'", "'crossinline'", "'reified'", 
			null, "'\"\"\"'", null, null, null, null, null, null, null, null, "'null'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ShebangLine", "DelimitedComment", "LineComment", "WS", "NL", "RESERVED", 
			"DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
			"REFERENCE", "MOD", "DIV", "ADD", "SUB", "INCR", "DECR", "DEREFERENCE", 
			"DISJ", "EXCL", "COLON", "SEMICOLON", "ASSIGNMENT", "ADD_ASSIGNMENT", 
			"SUB_ASSIGNMENT", "MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT", 
			"ARROW", "DOUBLE_ARROW", "RANGE", "COLONCOLON", "Q_COLONCOLON", "DOUBLE_SEMICOLON", 
			"HASH", "AT", "QUEST", "ELVIS", "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", 
			"EXCL_EQEQ", "AS_SAFE", "EQEQ", "EQEQEQ", "SINGLE_QUOTE", "RETURN_AT", 
			"CONTINUE_AT", "BREAK_AT", "FILE", "PACKAGE", "IMPORT", "CLASS", "INTERFACE", 
			"FUN", "OBJECT", "VAL", "VAR", "TYPE_ALIAS", "CONSTRUCTOR", "BY", "COMPANION", 
			"INIT", "THIS", "SUPER", "TYPEOF", "WHERE", "IF", "ELSE", "WHEN", "TRY", 
			"CATCH", "FINALLY", "FOR", "DO", "WHILE", "THROW", "RETURN", "CONTINUE", 
			"BREAK", "AS", "IS", "IN", "NOT_IS", "NOT_IN", "OUT", "FIELD", "PROPERTY", 
			"GET", "SET", "GETTER", "SETTER", "RECEIVER", "PARAM", "SETPARAM", "DELEGATE", 
			"DYNAMIC", "PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "ENUM", "SEALED", 
			"ANNOTATION", "DATA", "INNER", "TAILREC", "OPERATOR", "INLINE", "INFIX", 
			"EXTERNAL", "SUSPEND", "OVERRIDE", "ABSTRACT", "FINAL", "OPEN", "CONST", 
			"LATEINIT", "VARARG", "NOINLINE", "CROSSINLINE", "REIFIED", "QUOTE_OPEN", 
			"TRIPLE_QUOTE_OPEN", "RealLiteral", "FloatLiteral", "DoubleLiteral", 
			"LongLiteral", "IntegerLiteral", "HexLiteral", "BinLiteral", "BooleanLiteral", 
			"NullLiteral", "Identifier", "LabelReference", "LabelDefinition", "FieldIdentifier", 
			"CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
			"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
			"Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrRef", 
			"LineStrText", "LineStrEscapedChar", "LineStrExprStart", "TRIPLE_QUOTE_CLOSE", 
			"MultiLineStringQuote", "MultiLineStrRef", "MultiLineStrText", "MultiLineStrEscapedChar", 
			"MultiLineStrExprStart", "MultiLineNL", "StrExpr_IN", "StrExpr_Comment", 
			"StrExpr_WS", "StrExpr_NL", null, null, null, null, null, null, null, 
			null, null, "DOLLAR", "Operator"
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
	public String getGrammarFileName() { return "MegaAsmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MegaAsmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PseudoAsmFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MegaAsmParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(MegaAsmParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MegaAsmParser.NL, i);
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterPseudoAsmFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitPseudoAsmFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitPseudoAsmFile(this);
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(44);
				match(NL);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(50);
				linia();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(51);
					match(NL);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class ReferencerContext extends ParserRuleContext {
		public TerminalNode REFERENCE() { return getToken(MegaAsmParser.REFERENCE, 0); }
		public TerminalNode DEREFERENCE() { return getToken(MegaAsmParser.DEREFERENCE, 0); }
		public ReferencerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterReferencer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitReferencer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitReferencer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencerContext referencer() throws RecognitionException {
		ReferencerContext _localctx = new ReferencerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_referencer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==DEREFERENCE) ) {
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitOperand(this);
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
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REFERENCE || _la==DEREFERENCE) {
				{
				{
				setState(66);
				referencer();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			value();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(73);
				typeName();
				}
				}
				setState(78);
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case Identifier:
				{
				setState(79);
				addressed();
				}
				break;
			case HASH:
				{
				setState(80);
				immediate();
				}
				break;
			case MOD:
				{
				setState(81);
				floatimmediate();
				}
				break;
			case DOLLAR:
				{
				setState(82);
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
		public AbsAddressContext absAddress() {
			return getRuleContext(AbsAddressContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(MegaAsmParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MegaAsmParser.LPAREN, i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MegaAsmParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MegaAsmParser.RPAREN, i);
		}
		public AddressedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterAddressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitAddressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitAddressed(this);
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				{
				setState(85);
				absAddress();
				}
				break;
			case Identifier:
				{
				setState(86);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(89);
				match(LPAREN);
				setState(90);
				index();
				setState(91);
				match(RPAREN);
				}
				}
				setState(97);
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
		public TerminalNode IntegerLiteral() { return getToken(MegaAsmParser.IntegerLiteral, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			match(IntegerLiteral);
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
		public TerminalNode HASH() { return getToken(MegaAsmParser.HASH, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MegaAsmParser.IntegerLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(HASH);
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				{
				setState(101);
				match(IntegerLiteral);
				}
				break;
			case Identifier:
				{
				setState(102);
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
		public TerminalNode MOD() { return getToken(MegaAsmParser.MOD, 0); }
		public TerminalNode DoubleLiteral() { return getToken(MegaAsmParser.DoubleLiteral, 0); }
		public FloatimmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatimmediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterFloatimmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitFloatimmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitFloatimmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatimmediateContext floatimmediate() throws RecognitionException {
		FloatimmediateContext _localctx = new FloatimmediateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatimmediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(MOD);
			{
			setState(106);
			match(DoubleLiteral);
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
		public TerminalNode DOLLAR() { return getToken(MegaAsmParser.DOLLAR, 0); }
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public StringimmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringimmediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterStringimmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitStringimmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitStringimmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringimmediateContext stringimmediate() throws RecognitionException {
		StringimmediateContext _localctx = new StringimmediateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringimmediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DOLLAR);
			{
			setState(109);
			lineStringLiteral();
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
		public TerminalNode IntegerLiteral() { return getToken(MegaAsmParser.IntegerLiteral, 0); }
		public AbsAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterAbsAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitAbsAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitAbsAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsAddressContext absAddress() throws RecognitionException {
		AbsAddressContext _localctx = new AbsAddressContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_absAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MegaAsmParser.COLON, 0); }
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(COLON);
			{
			setState(114);
			identifier();
			}
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					referencer();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitInstrukcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitInstrukcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrukcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		public TerminalNode NL() { return getToken(MegaAsmParser.NL, 0); }
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(MegaAsmParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(MegaAsmParser.ASSIGNMENT, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(MegaAsmParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(MegaAsmParser.ARROW, i);
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
		public List<TerminalNode> Operator() { return getTokens(MegaAsmParser.Operator); }
		public TerminalNode Operator(int i) {
			return getToken(MegaAsmParser.Operator, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MegaAsmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MegaAsmParser.COMMA, i);
		}
		public LiniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterLinia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitLinia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitLinia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiniaContext linia() throws RecognitionException {
		LiniaContext _localctx = new LiniaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_linia);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				instrukcja();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MOD) | (1L << DEREFERENCE) | (1L << HASH))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (IntegerLiteral - 135)) | (1L << (Identifier - 135)) | (1L << (DOLLAR - 135)))) != 0)) {
					{
					{
					setState(124);
					target();
					setState(125);
					match(ASSIGNMENT);
					{
					setState(126);
					arg();
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Operator) {
						{
						{
						setState(127);
						match(Operator);
						setState(128);
						arg();
						}
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(139);
					match(ARROW);
					setState(140);
					assemblerBody();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				instrukcja();
				setState(149);
				arg();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					arg();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(157);
					match(ARROW);
					setState(158);
					assemblerBody();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		public List<TerminalNode> DOT() { return getTokens(MegaAsmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MegaAsmParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(MegaAsmParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MegaAsmParser.NL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			simpleIdentifier();
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(173);
						match(NL);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					match(DOT);
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(180);
							simpleIdentifier();
							}
							} 
						}
						setState(185);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode Identifier() { return getToken(MegaAsmParser.Identifier, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterAssemblerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitAssemblerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitAssemblerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblerBodyContext assemblerBody() throws RecognitionException {
		AssemblerBodyContext _localctx = new AssemblerBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assemblerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(MegaAsmParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(MegaAsmParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<TerminalNode> MultiLineStringQuote() { return getTokens(MegaAsmParser.MultiLineStringQuote); }
		public TerminalNode MultiLineStringQuote(int i) {
			return getToken(MegaAsmParser.MultiLineStringQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitMultiLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitMultiLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(TRIPLE_QUOTE_OPEN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultiLineStringQuote || _la==MultiLineStrText) {
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrText:
					{
					setState(196);
					multiLineStringContent();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(197);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		public TerminalNode MultiLineStrText() { return getToken(MegaAsmParser.MultiLineStrText, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitMultiLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitMultiLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiLineStringContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		public TerminalNode QUOTE_OPEN() { return getToken(MegaAsmParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(MegaAsmParser.QUOTE_CLOSE, 0); }
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
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(QUOTE_OPEN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(208);
				lineStringContent();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
		public TerminalNode LineStrText() { return getToken(MegaAsmParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(MegaAsmParser.LineStrEscapedChar, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaAsmParserListener ) ((MegaAsmParserListener)listener).exitLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaAsmParserVisitor ) return ((MegaAsmParserVisitor<? extends T>)visitor).visitLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==LineStrText || _la==LineStrEscapedChar) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b7\u00dd\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\7\2<\n\2\f\2\16\2?\13"+
		"\2\3\2\3\2\3\3\3\3\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\7\4M\n\4\f\4\16"+
		"\4P\13\4\3\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\7\6"+
		"`\n\6\f\6\16\6c\13\6\3\7\3\7\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u0084\n\16\f\16\16\16\u0087\13\16\7\16\u0089\n"+
		"\16\f\16\16\16\u008c\13\16\3\16\3\16\7\16\u0090\n\16\f\16\16\16\u0093"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009b\n\16\f\16\16\16\u009e"+
		"\13\16\3\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\16\3\16\5\16"+
		"\u00a9\n\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4"+
		"\13\21\3\21\3\21\7\21\u00b8\n\21\f\21\16\21\u00bb\13\21\7\21\u00bd\n\21"+
		"\f\21\16\21\u00c0\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00c9"+
		"\n\24\f\24\16\24\u00cc\13\24\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00d4"+
		"\n\26\f\26\16\26\u00d7\13\26\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\4\2\21\21\30\30\3\2\u009f\u00a0"+
		"\2\u00de\2\61\3\2\2\2\4B\3\2\2\2\6G\3\2\2\2\bU\3\2\2\2\nY\3\2\2\2\fd\3"+
		"\2\2\2\16f\3\2\2\2\20k\3\2\2\2\22n\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30"+
		"{\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa\3\2\2\2\36\u00ac\3\2\2\2 \u00ae\3"+
		"\2\2\2\"\u00c1\3\2\2\2$\u00c3\3\2\2\2&\u00c5\3\2\2\2(\u00cf\3\2\2\2*\u00d1"+
		"\3\2\2\2,\u00da\3\2\2\2.\60\7\7\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62=\3\2\2\2\63\61\3\2\2\2\648\5\32\16\2\65\67\7\7\2\2"+
		"\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;"+
		"\64\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\2\2"+
		"\3A\3\3\2\2\2BC\t\2\2\2C\5\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\5\b\5\2KM\5\26\f\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2\2QV\5\n\6\2RV\5\16\b\2S"+
		"V\5\20\t\2TV\5\22\n\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\t\3\2\2"+
		"\2WZ\5\24\13\2XZ\5 \21\2YW\3\2\2\2YX\3\2\2\2Za\3\2\2\2[\\\7\13\2\2\\]"+
		"\5\f\7\2]^\7\f\2\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b"+
		"\13\3\2\2\2ca\3\2\2\2de\7\u0089\2\2e\r\3\2\2\2fi\7)\2\2gj\7\u0089\2\2"+
		"hj\5 \21\2ig\3\2\2\2ih\3\2\2\2j\17\3\2\2\2kl\7\22\2\2lm\7\u0087\2\2m\21"+
		"\3\2\2\2no\7\u00b6\2\2op\5*\26\2p\23\3\2\2\2qr\7\u0089\2\2r\25\3\2\2\2"+
		"st\7\33\2\2tx\5 \21\2uw\5\4\3\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y\27\3\2\2\2zx\3\2\2\2{|\5\"\22\2|\31\3\2\2\2}\u008a\5\30\r\2~\177\5"+
		"\34\17\2\177\u0080\7\35\2\2\u0080\u0085\5\36\20\2\u0081\u0082\7\u00b7"+
		"\2\2\u0082\u0084\5\36\20\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088~\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0091\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7#\2\2\u008e"+
		"\u0090\5$\23\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\7\2\2\u0095\u00a9\3\2\2\2\u0096\u0097\5\30\r\2\u0097\u009c\5"+
		"\36\20\2\u0098\u0099\7\n\2\2\u0099\u009b\5\36\20\2\u009a\u0098\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a3"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a2\5$\23\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\7\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8}\3\2\2\2\u00a8\u0096\3\2\2\2\u00a9\33\3\2\2\2\u00aa"+
		"\u00ab\5\6\4\2\u00ab\35\3\2\2\2\u00ac\u00ad\5\6\4\2\u00ad\37\3\2\2\2\u00ae"+
		"\u00be\5\"\22\2\u00af\u00b1\7\7\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b9\7\t\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\7\u008e\2\2\u00c2#\3\2\2\2\u00c3\u00c4\5&\24\2\u00c4"+
		"%\3\2\2\2\u00c5\u00ca\7\u0084\2\2\u00c6\u00c9\5(\25\2\u00c7\u00c9\7\u00a3"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7\u00a2\2\2\u00ce\'\3\2\2\2\u00cf\u00d0\7\u00a5\2\2\u00d0"+
		")\3\2\2\2\u00d1\u00d5\7\u0083\2\2\u00d2\u00d4\5,\27\2\u00d3\u00d2\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\u009d\2\2\u00d9+\3\2"+
		"\2\2\u00da\u00db\t\3\2\2\u00db-\3\2\2\2\30\618=GNUYaix\u0085\u008a\u0091"+
		"\u009c\u00a3\u00a8\u00b2\u00b9\u00be\u00c8\u00ca\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}