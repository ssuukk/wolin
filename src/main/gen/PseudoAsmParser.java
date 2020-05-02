// Generated from L:/Projekty/kotlinek/src/main/antlr\PseudoAsmParser.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		StrExpr_WS=169, StrExpr_NL=170, DOLLAR=180;
	public static final int
		RULE_pseudoAsmFile = 0, RULE_jocker = 1, RULE_referencer = 2, RULE_operand = 3, 
		RULE_value = 4, RULE_addressed = 5, RULE_index = 6, RULE_immediate = 7, 
		RULE_floatimmediate = 8, RULE_stringimmediate = 9, RULE_absAddress = 10, 
		RULE_name = 11, RULE_typeName = 12, RULE_instrukcja = 13, RULE_linia = 14, 
		RULE_target = 15, RULE_arg = 16, RULE_identifier = 17, RULE_simpleIdentifier = 18, 
		RULE_assemblerBody = 19, RULE_multiLineStringLiteral = 20, RULE_multiLineStringContent = 21, 
		RULE_lineStringLiteral = 22, RULE_lineStringContent = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"pseudoAsmFile", "jocker", "referencer", "operand", "value", "addressed", 
			"index", "immediate", "floatimmediate", "stringimmediate", "absAddress", 
			"name", "typeName", "instrukcja", "linia", "target", "arg", "identifier", 
			"simpleIdentifier", "assemblerBody", "multiLineStringLiteral", "multiLineStringContent", 
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
			null, null, "DOLLAR"
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
			_errHandler.sync(this);
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
			_errHandler.sync(this);
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
			_errHandler.sync(this);
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
			setState(119);
			_errHandler.sync(this);
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
			setState(121);
			match(MOD);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(122);
				jocker();
				}
				break;
			case DoubleLiteral:
				{
				setState(123);
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
			setState(126);
			match(DOLLAR);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(127);
				jocker();
				}
				break;
			case QUOTE_OPEN:
				{
				setState(128);
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
			setState(131);
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
			setState(133);
			match(LANGLE);
			setState(134);
			identifier();
			setState(135);
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
			setState(137);
			match(LSQUARE);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUEST:
				{
				setState(138);
				jocker();
				}
				break;
			case Identifier:
				{
				setState(139);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REFERENCE || _la==DEREFERENCE) {
				{
				{
				setState(142);
				referencer();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
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
			setState(150);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				instrukcja();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MOD) | (1L << DEREFERENCE) | (1L << HASH) | (1L << QUEST))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (IntegerLiteral - 135)) | (1L << (Identifier - 135)) | (1L << (DOLLAR - 135)))) != 0)) {
					{
					{
					setState(153);
					target();
					setState(154);
					match(ASSIGNMENT);
					{
					setState(155);
					arg();
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(156);
						match(COMMA);
						setState(157);
						arg();
						}
						}
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(168);
					match(ARROW);
					setState(169);
					assemblerBody();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				instrukcja();
				setState(178);
				arg();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					arg();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(186);
					match(ARROW);
					setState(187);
					assemblerBody();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
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
			setState(197);
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
			setState(199);
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
			setState(201);
			simpleIdentifier();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(202);
						match(NL);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(208);
					match(DOT);
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(209);
							simpleIdentifier();
							}
							} 
						}
						setState(214);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
					} 
				}
				setState(219);
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
			setState(220);
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
			setState(222);
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
			setState(224);
			match(TRIPLE_QUOTE_OPEN);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultiLineStringQuote || _la==MultiLineStrText) {
				{
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrText:
					{
					setState(225);
					multiLineStringContent();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(226);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
			setState(234);
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
			setState(236);
			match(QUOTE_OPEN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(237);
				lineStringContent();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
			setState(245);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b6\u00fa\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\7\5M\n\5\f\5\16\5"+
		"P\13\5\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6"+
		"\3\6\3\6\3\6\5\6c\n\6\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\7\7n\n\7\f"+
		"\7\16\7q\13\7\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\5\n\177"+
		"\n\n\3\13\3\13\3\13\5\13\u0084\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\5\16\u008f\n\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a1\n\20\f\20\16"+
		"\20\u00a4\13\20\7\20\u00a6\n\20\f\20\16\20\u00a9\13\20\3\20\3\20\7\20"+
		"\u00ad\n\20\f\20\16\20\u00b0\13\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00b8\n\20\f\20\16\20\u00bb\13\20\3\20\3\20\7\20\u00bf\n\20\f\20\16\20"+
		"\u00c2\13\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21\3\22\3\22\3\23\3\23\7"+
		"\23\u00ce\n\23\f\23\16\23\u00d1\13\23\3\23\3\23\7\23\u00d5\n\23\f\23\16"+
		"\23\u00d8\13\23\7\23\u00da\n\23\f\23\16\23\u00dd\13\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u00e6\n\26\f\26\16\26\u00e9\13\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\7\30\u00f1\n\30\f\30\16\30\u00f4\13\30\3\30\3\30"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\4\4\2\21\21\30\30\3\2\u009f\u00a0\2\u00ff\2\65\3\2\2\2\4F\3\2\2"+
		"\2\6I\3\2\2\2\bN\3\2\2\2\nb\3\2\2\2\fg\3\2\2\2\16t\3\2\2\2\20v\3\2\2\2"+
		"\22{\3\2\2\2\24\u0080\3\2\2\2\26\u0085\3\2\2\2\30\u0087\3\2\2\2\32\u008b"+
		"\3\2\2\2\34\u0098\3\2\2\2\36\u00c5\3\2\2\2 \u00c7\3\2\2\2\"\u00c9\3\2"+
		"\2\2$\u00cb\3\2\2\2&\u00de\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,\u00ec"+
		"\3\2\2\2.\u00ee\3\2\2\2\60\u00f7\3\2\2\2\62\64\7\7\2\2\63\62\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66A\3\2\2\2\67\65\3\2\2\28<\5"+
		"\36\20\29;\7\7\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2>"+
		"<\3\2\2\2?8\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2"+
		"DE\7\2\2\3E\3\3\2\2\2FG\7+\2\2GH\5&\24\2H\5\3\2\2\2IJ\t\2\2\2J\7\3\2\2"+
		"\2KM\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2"+
		"\2QU\5\n\6\2RT\5\30\r\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2"+
		"\2\2WU\3\2\2\2XZ\5\32\16\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"\t\3\2\2\2][\3\2\2\2^c\5\f\7\2_c\5\20\t\2`c\5\22\n\2ac\5\24\13\2b^\3\2"+
		"\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2\2dh\5\4\3\2eh\5\26\f\2fh"+
		"\5$\23\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2ho\3\2\2\2ij\7\13\2\2jk\5\16\b\2"+
		"kl\7\f\2\2ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3\2\2"+
		"\2qo\3\2\2\2ru\5\4\3\2su\7\u0089\2\2tr\3\2\2\2ts\3\2\2\2u\17\3\2\2\2v"+
		"y\7)\2\2wz\5\4\3\2xz\7\u0089\2\2yw\3\2\2\2yx\3\2\2\2z\21\3\2\2\2{~\7\22"+
		"\2\2|\177\5\4\3\2}\177\7\u0087\2\2~|\3\2\2\2~}\3\2\2\2\177\23\3\2\2\2"+
		"\u0080\u0083\7\u00b6\2\2\u0081\u0084\5\4\3\2\u0082\u0084\5.\30\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086\7\u0089"+
		"\2\2\u0086\27\3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089\5$\23\2\u0089\u008a"+
		"\7.\2\2\u008a\31\3\2\2\2\u008b\u008e\7\r\2\2\u008c\u008f\5\4\3\2\u008d"+
		"\u008f\5$\23\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0093\3\2"+
		"\2\2\u0090\u0092\5\6\4\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7\16\2\2\u0097\33\3\2\2\2\u0098\u0099\5&\24\2\u0099\35"+
		"\3\2\2\2\u009a\u00a7\5\34\17\2\u009b\u009c\5 \21\2\u009c\u009d\7\35\2"+
		"\2\u009d\u00a2\5\"\22\2\u009e\u009f\7\n\2\2\u009f\u00a1\5\"\22\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009b\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ae\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ad\5(\25\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\7\2\2\u00b2"+
		"\u00c6\3\2\2\2\u00b3\u00b4\5\34\17\2\u00b4\u00b9\5\"\22\2\u00b5\u00b6"+
		"\7\n\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c0\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00bf\5(\25\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u009a\3\2\2\2\u00c5\u00b3\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\5\b\5"+
		"\2\u00c8!\3\2\2\2\u00c9\u00ca\5\b\5\2\u00ca#\3\2\2\2\u00cb\u00db\5&\24"+
		"\2\u00cc\u00ce\7\7\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d6\7\t\2\2\u00d3\u00d5\5&\24\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00cf\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc%\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\7\u008e\2\2\u00df\'\3\2\2\2\u00e0\u00e1\5*\26\2\u00e1)\3\2\2\2\u00e2"+
		"\u00e7\7\u0084\2\2\u00e3\u00e6\5,\27\2\u00e4\u00e6\7\u00a3\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\u00a2"+
		"\2\2\u00eb+\3\2\2\2\u00ec\u00ed\7\u00a5\2\2\u00ed-\3\2\2\2\u00ee\u00f2"+
		"\7\u0083\2\2\u00ef\u00f1\5\60\31\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7\u009d\2\2\u00f6/\3\2\2\2\u00f7\u00f8\t\3"+
		"\2\2\u00f8\61\3\2\2\2\35\65<ANU[bgoty~\u0083\u008e\u0093\u00a2\u00a7\u00ae"+
		"\u00b9\u00c0\u00c5\u00cf\u00d6\u00db\u00e5\u00e7\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}