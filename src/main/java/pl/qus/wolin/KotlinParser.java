// Generated from KotlinParser.g4 by ANTLR 4.5.1
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
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ShebangLine=1, DelimitedComment=2, LineComment=3, WS=4, NL=5, RESERVED=6, 
		DOT=7, COMMA=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, LCURL=13, 
		RCURL=14, MULT=15, MOD=16, DIV=17, ADD=18, SUB=19, INCR=20, DECR=21, CONJ=22, 
		DISJ=23, EXCL=24, COLON=25, SEMICOLON=26, ASSIGNMENT=27, ADD_ASSIGNMENT=28, 
		SUB_ASSIGNMENT=29, MULT_ASSIGNMENT=30, DIV_ASSIGNMENT=31, MOD_ASSIGNMENT=32, 
		ARROW=33, DOUBLE_ARROW=34, RANGE=35, COLONCOLON=36, Q_COLONCOLON=37, DOUBLE_SEMICOLON=38, 
		HASH=39, AT=40, CARON=41, QUEST=42, ELVIS=43, LANGLE=44, RANGLE=45, LE=46, 
		GE=47, EXCL_EQ=48, EXCL_EQEQ=49, AS_SAFE=50, EQEQ=51, EQEQEQ=52, SINGLE_QUOTE=53, 
		RETURN_AT=54, CONTINUE_AT=55, BREAK_AT=56, FILE=57, PACKAGE=58, IMPORT=59, 
		CLASS=60, INTERFACE=61, FUN=62, OBJECT=63, VAL=64, VAR=65, TYPE_ALIAS=66, 
		CONSTRUCTOR=67, BY=68, COMPANION=69, INIT=70, THIS=71, SUPER=72, TYPEOF=73, 
		WHERE=74, IF=75, ELSE=76, WHEN=77, TRY=78, CATCH=79, FINALLY=80, FOR=81, 
		DO=82, WHILE=83, THROW=84, RETURN=85, CONTINUE=86, BREAK=87, AS=88, IS=89, 
		IN=90, NOT_IS=91, NOT_IN=92, OUT=93, FIELD=94, PROPERTY=95, GET=96, SET=97, 
		GETTER=98, SETTER=99, RECEIVER=100, PARAM=101, SETPARAM=102, DELEGATE=103, 
		DYNAMIC=104, PUBLIC=105, PRIVATE=106, PROTECTED=107, INTERNAL=108, ENUM=109, 
		SEALED=110, ANNOTATION=111, DATA=112, INNER=113, TAILREC=114, OPERATOR=115, 
		INLINE=116, INFIX=117, EXTERNAL=118, SUSPEND=119, OVERRIDE=120, ABSTRACT=121, 
		FINAL=122, OPEN=123, CONST=124, LATEINIT=125, VARARG=126, NOINLINE=127, 
		CROSSINLINE=128, REIFIED=129, QUOTE_OPEN=130, TRIPLE_QUOTE_OPEN=131, RealLiteral=132, 
		FloatLiteral=133, DoubleLiteral=134, LongLiteral=135, IntegerLiteral=136, 
		HexLiteral=137, BinLiteral=138, BooleanLiteral=139, NullLiteral=140, Identifier=141, 
		LabelReference=142, LabelDefinition=143, FieldIdentifier=144, CharacterLiteral=145, 
		UNICODE_CLASS_LL=146, UNICODE_CLASS_LM=147, UNICODE_CLASS_LO=148, UNICODE_CLASS_LT=149, 
		UNICODE_CLASS_LU=150, UNICODE_CLASS_ND=151, UNICODE_CLASS_NL=152, Inside_Comment=153, 
		Inside_WS=154, Inside_NL=155, QUOTE_CLOSE=156, LineStrRef=157, LineStrText=158, 
		LineStrEscapedChar=159, LineStrExprStart=160, TRIPLE_QUOTE_CLOSE=161, 
		MultiLineStringQuote=162, MultiLineStrRef=163, MultiLineStrText=164, MultiLineStrEscapedChar=165, 
		MultiLineStrExprStart=166, MultiLineNL=167, StrExpr_IN=168, StrExpr_Comment=169, 
		StrExpr_WS=170, StrExpr_NL=171;
	public static final int
		RULE_kotlinFile = 0, RULE_script = 1, RULE_preamble = 2, RULE_fileAnnotations = 3, 
		RULE_fileAnnotation = 4, RULE_packageHeader = 5, RULE_importList = 6, 
		RULE_importHeader = 7, RULE_importAlias = 8, RULE_topLevelObject = 9, 
		RULE_classDeclaration = 10, RULE_primaryConstructor = 11, RULE_classParameters = 12, 
		RULE_classParameter = 13, RULE_delegationSpecifiers = 14, RULE_delegationSpecifier = 15, 
		RULE_constructorInvocation = 16, RULE_explicitDelegation = 17, RULE_classBody = 18, 
		RULE_classMemberDeclaration = 19, RULE_anonymousInitializer = 20, RULE_secondaryConstructor = 21, 
		RULE_constructorDelegationCall = 22, RULE_enumClassBody = 23, RULE_enumEntries = 24, 
		RULE_enumEntry = 25, RULE_functionDeclaration = 26, RULE_functionValueParameters = 27, 
		RULE_functionValueParameter = 28, RULE_parameter = 29, RULE_functionBody = 30, 
		RULE_objectDeclaration = 31, RULE_companionObject = 32, RULE_propertyDeclaration = 33, 
		RULE_multiVariableDeclaration = 34, RULE_variableDeclaration = 35, RULE_getter = 36, 
		RULE_setter = 37, RULE_typeAlias = 38, RULE_typeParameters = 39, RULE_typeParameter = 40, 
		RULE_type = 41, RULE_typeModifierList = 42, RULE_parenthesizedType = 43, 
		RULE_nullableType = 44, RULE_typeReference = 45, RULE_arrayDeclaration = 46, 
		RULE_functionType = 47, RULE_functionTypeReceiver = 48, RULE_userType = 49, 
		RULE_simpleUserType = 50, RULE_locationReference = 51, RULE_functionTypeParameters = 52, 
		RULE_typeConstraints = 53, RULE_typeConstraint = 54, RULE_block = 55, 
		RULE_statements = 56, RULE_statement = 57, RULE_blockLevelExpression = 58, 
		RULE_declaration = 59, RULE_expression = 60, RULE_disjunction = 61, RULE_conjunction = 62, 
		RULE_equalityComparison = 63, RULE_comparison = 64, RULE_namedInfix = 65, 
		RULE_elvisExpression = 66, RULE_infixFunctionCall = 67, RULE_rangeExpression = 68, 
		RULE_additiveExpression = 69, RULE_multiplicativeExpression = 70, RULE_typeRHS = 71, 
		RULE_prefixUnaryExpression = 72, RULE_postfixUnaryExpression = 73, RULE_atomicExpression = 74, 
		RULE_parenthesizedExpression = 75, RULE_callSuffix = 76, RULE_annotatedLambda = 77, 
		RULE_arrayAccess = 78, RULE_valueArguments = 79, RULE_typeArguments = 80, 
		RULE_typeProjection = 81, RULE_typeProjectionModifierList = 82, RULE_valueArgument = 83, 
		RULE_literalConstant = 84, RULE_stringLiteral = 85, RULE_lineStringLiteral = 86, 
		RULE_multiLineStringLiteral = 87, RULE_lineStringContent = 88, RULE_lineStringExpression = 89, 
		RULE_multiLineStringContent = 90, RULE_multiLineStringExpression = 91, 
		RULE_functionLiteral = 92, RULE_lambdaParameters = 93, RULE_lambdaParameter = 94, 
		RULE_objectLiteral = 95, RULE_collectionLiteral = 96, RULE_thisExpression = 97, 
		RULE_superExpression = 98, RULE_conditionalExpression = 99, RULE_ifExpression = 100, 
		RULE_controlStructureBody = 101, RULE_whenExpression = 102, RULE_whenEntry = 103, 
		RULE_whenCondition = 104, RULE_rangeTest = 105, RULE_typeTest = 106, RULE_tryExpression = 107, 
		RULE_catchBlock = 108, RULE_finallyBlock = 109, RULE_loopExpression = 110, 
		RULE_forExpression = 111, RULE_whileExpression = 112, RULE_doWhileExpression = 113, 
		RULE_jumpExpression = 114, RULE_callableReference = 115, RULE_assignmentOperator = 116, 
		RULE_equalityOperation = 117, RULE_comparisonOperator = 118, RULE_inOperator = 119, 
		RULE_isOperator = 120, RULE_additiveOperator = 121, RULE_multiplicativeOperation = 122, 
		RULE_typeOperation = 123, RULE_prefixUnaryOperation = 124, RULE_postfixUnaryOperation = 125, 
		RULE_memberAccessOperator = 126, RULE_modifierList = 127, RULE_modifier = 128, 
		RULE_classModifier = 129, RULE_memberModifier = 130, RULE_visibilityModifier = 131, 
		RULE_varianceAnnotation = 132, RULE_functionModifier = 133, RULE_propertyModifier = 134, 
		RULE_inheritanceModifier = 135, RULE_parameterModifier = 136, RULE_typeParameterModifier = 137, 
		RULE_labelDefinition = 138, RULE_annotations = 139, RULE_annotation = 140, 
		RULE_annotationList = 141, RULE_annotationUseSiteTarget = 142, RULE_unescapedAnnotation = 143, 
		RULE_identifier = 144, RULE_simpleIdentifier = 145, RULE_semi = 146, RULE_anysemi = 147;
	public static final String[] ruleNames = {
		"kotlinFile", "script", "preamble", "fileAnnotations", "fileAnnotation", 
		"packageHeader", "importList", "importHeader", "importAlias", "topLevelObject", 
		"classDeclaration", "primaryConstructor", "classParameters", "classParameter", 
		"delegationSpecifiers", "delegationSpecifier", "constructorInvocation", 
		"explicitDelegation", "classBody", "classMemberDeclaration", "anonymousInitializer", 
		"secondaryConstructor", "constructorDelegationCall", "enumClassBody", 
		"enumEntries", "enumEntry", "functionDeclaration", "functionValueParameters", 
		"functionValueParameter", "parameter", "functionBody", "objectDeclaration", 
		"companionObject", "propertyDeclaration", "multiVariableDeclaration", 
		"variableDeclaration", "getter", "setter", "typeAlias", "typeParameters", 
		"typeParameter", "type", "typeModifierList", "parenthesizedType", "nullableType", 
		"typeReference", "arrayDeclaration", "functionType", "functionTypeReceiver", 
		"userType", "simpleUserType", "locationReference", "functionTypeParameters", 
		"typeConstraints", "typeConstraint", "block", "statements", "statement", 
		"blockLevelExpression", "declaration", "expression", "disjunction", "conjunction", 
		"equalityComparison", "comparison", "namedInfix", "elvisExpression", "infixFunctionCall", 
		"rangeExpression", "additiveExpression", "multiplicativeExpression", "typeRHS", 
		"prefixUnaryExpression", "postfixUnaryExpression", "atomicExpression", 
		"parenthesizedExpression", "callSuffix", "annotatedLambda", "arrayAccess", 
		"valueArguments", "typeArguments", "typeProjection", "typeProjectionModifierList", 
		"valueArgument", "literalConstant", "stringLiteral", "lineStringLiteral", 
		"multiLineStringLiteral", "lineStringContent", "lineStringExpression", 
		"multiLineStringContent", "multiLineStringExpression", "functionLiteral", 
		"lambdaParameters", "lambdaParameter", "objectLiteral", "collectionLiteral", 
		"thisExpression", "superExpression", "conditionalExpression", "ifExpression", 
		"controlStructureBody", "whenExpression", "whenEntry", "whenCondition", 
		"rangeTest", "typeTest", "tryExpression", "catchBlock", "finallyBlock", 
		"loopExpression", "forExpression", "whileExpression", "doWhileExpression", 
		"jumpExpression", "callableReference", "assignmentOperator", "equalityOperation", 
		"comparisonOperator", "inOperator", "isOperator", "additiveOperator", 
		"multiplicativeOperation", "typeOperation", "prefixUnaryOperation", "postfixUnaryOperation", 
		"memberAccessOperator", "modifierList", "modifier", "classModifier", "memberModifier", 
		"visibilityModifier", "varianceAnnotation", "functionModifier", "propertyModifier", 
		"inheritanceModifier", "parameterModifier", "typeParameterModifier", "labelDefinition", 
		"annotations", "annotation", "annotationList", "annotationUseSiteTarget", 
		"unescapedAnnotation", "identifier", "simpleIdentifier", "semi", "anysemi"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'...'", "'.'", "','", "'('", null, 
		"'['", null, "'{'", "'}'", "'*'", "'%'", "'/'", "'+'", "'-'", "'++'", 
		"'--'", "'&&'", "'||'", "'!'", "':'", "';'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'->'", "'=>'", "'..'", "'::'", "'?::'", "';;'", "'#'", 
		"'@'", "'^'", "'?'", "'?:'", "'<'", "'>'", "'<='", "'>='", "'!='", "'!=='", 
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
		null, "'\"\"\"'", null, null, null, null, null, null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ShebangLine", "DelimitedComment", "LineComment", "WS", "NL", "RESERVED", 
		"DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
		"MULT", "MOD", "DIV", "ADD", "SUB", "INCR", "DECR", "CONJ", "DISJ", "EXCL", 
		"COLON", "SEMICOLON", "ASSIGNMENT", "ADD_ASSIGNMENT", "SUB_ASSIGNMENT", 
		"MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT", "ARROW", "DOUBLE_ARROW", 
		"RANGE", "COLONCOLON", "Q_COLONCOLON", "DOUBLE_SEMICOLON", "HASH", "AT", 
		"CARON", "QUEST", "ELVIS", "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", 
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
		"TRIPLE_QUOTE_OPEN", "RealLiteral", "FloatLiteral", "DoubleLiteral", "LongLiteral", 
		"IntegerLiteral", "HexLiteral", "BinLiteral", "BooleanLiteral", "NullLiteral", 
		"Identifier", "LabelReference", "LabelDefinition", "FieldIdentifier", 
		"CharacterLiteral", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
		"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
		"Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrRef", 
		"LineStrText", "LineStrEscapedChar", "LineStrExprStart", "TRIPLE_QUOTE_CLOSE", 
		"MultiLineStringQuote", "MultiLineStrRef", "MultiLineStrText", "MultiLineStrEscapedChar", 
		"MultiLineStrExprStart", "MultiLineNL", "StrExpr_IN", "StrExpr_Comment", 
		"StrExpr_WS", "StrExpr_NL"
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
	public String getGrammarFileName() { return "KotlinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KotlinFileContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public List<TopLevelObjectContext> topLevelObject() {
			return getRuleContexts(TopLevelObjectContext.class);
		}
		public TopLevelObjectContext topLevelObject(int i) {
			return getRuleContext(TopLevelObjectContext.class,i);
		}
		public KotlinFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kotlinFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterKotlinFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitKotlinFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitKotlinFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KotlinFileContext kotlinFile() throws RecognitionException {
		KotlinFileContext _localctx = new KotlinFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kotlinFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(NL);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(302);
			preamble();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SEMICOLON) {
				{
				{
				setState(303);
				anysemi();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (PUBLIC - 105)) | (1L << (PRIVATE - 105)) | (1L << (PROTECTED - 105)) | (1L << (INTERNAL - 105)) | (1L << (ENUM - 105)) | (1L << (SEALED - 105)) | (1L << (ANNOTATION - 105)) | (1L << (DATA - 105)) | (1L << (INNER - 105)) | (1L << (TAILREC - 105)) | (1L << (OPERATOR - 105)) | (1L << (INLINE - 105)) | (1L << (INFIX - 105)) | (1L << (EXTERNAL - 105)) | (1L << (SUSPEND - 105)) | (1L << (OVERRIDE - 105)) | (1L << (ABSTRACT - 105)) | (1L << (FINAL - 105)) | (1L << (OPEN - 105)) | (1L << (CONST - 105)) | (1L << (LATEINIT - 105)) | (1L << (VARARG - 105)) | (1L << (NOINLINE - 105)) | (1L << (CROSSINLINE - 105)) | (1L << (REIFIED - 105)) | (1L << (LabelReference - 105)))) != 0)) {
				{
				setState(309);
				topLevelObject();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(311); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(310);
							anysemi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(313); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(316);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (PUBLIC - 105)) | (1L << (PRIVATE - 105)) | (1L << (PROTECTED - 105)) | (1L << (INTERNAL - 105)) | (1L << (ENUM - 105)) | (1L << (SEALED - 105)) | (1L << (ANNOTATION - 105)) | (1L << (DATA - 105)) | (1L << (INNER - 105)) | (1L << (TAILREC - 105)) | (1L << (OPERATOR - 105)) | (1L << (INLINE - 105)) | (1L << (INFIX - 105)) | (1L << (EXTERNAL - 105)) | (1L << (SUSPEND - 105)) | (1L << (OVERRIDE - 105)) | (1L << (ABSTRACT - 105)) | (1L << (FINAL - 105)) | (1L << (OPEN - 105)) | (1L << (CONST - 105)) | (1L << (LATEINIT - 105)) | (1L << (VARARG - 105)) | (1L << (NOINLINE - 105)) | (1L << (CROSSINLINE - 105)) | (1L << (REIFIED - 105)) | (1L << (LabelReference - 105)))) != 0)) {
						{
						setState(315);
						topLevelObject();
						}
					}

					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325);
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

	public static class ScriptContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KotlinParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					match(NL);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(333);
			preamble();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(334);
					anysemi();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CONSTRUCTOR - 67)) | (1L << (BY - 67)) | (1L << (COMPANION - 67)) | (1L << (INIT - 67)) | (1L << (THIS - 67)) | (1L << (SUPER - 67)) | (1L << (WHERE - 67)) | (1L << (IF - 67)) | (1L << (WHEN - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (FINALLY - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (THROW - 67)) | (1L << (RETURN - 67)) | (1L << (CONTINUE - 67)) | (1L << (BREAK - 67)) | (1L << (OUT - 67)) | (1L << (FIELD - 67)) | (1L << (PROPERTY - 67)) | (1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (GETTER - 67)) | (1L << (SETTER - 67)) | (1L << (RECEIVER - 67)) | (1L << (PARAM - 67)) | (1L << (SETPARAM - 67)) | (1L << (DELEGATE - 67)) | (1L << (DYNAMIC - 67)) | (1L << (PUBLIC - 67)) | (1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (INTERNAL - 67)) | (1L << (ENUM - 67)) | (1L << (SEALED - 67)) | (1L << (ANNOTATION - 67)) | (1L << (DATA - 67)) | (1L << (INNER - 67)) | (1L << (TAILREC - 67)) | (1L << (OPERATOR - 67)) | (1L << (INLINE - 67)) | (1L << (INFIX - 67)) | (1L << (EXTERNAL - 67)) | (1L << (SUSPEND - 67)) | (1L << (OVERRIDE - 67)) | (1L << (ABSTRACT - 67)) | (1L << (FINAL - 67)) | (1L << (OPEN - 67)) | (1L << (CONST - 67)) | (1L << (LATEINIT - 67)) | (1L << (VARARG - 67)) | (1L << (NOINLINE - 67)) | (1L << (CROSSINLINE - 67)) | (1L << (REIFIED - 67)) | (1L << (QUOTE_OPEN - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (TRIPLE_QUOTE_OPEN - 131)) | (1L << (RealLiteral - 131)) | (1L << (LongLiteral - 131)) | (1L << (IntegerLiteral - 131)) | (1L << (HexLiteral - 131)) | (1L << (BinLiteral - 131)) | (1L << (BooleanLiteral - 131)) | (1L << (NullLiteral - 131)) | (1L << (Identifier - 131)) | (1L << (LabelReference - 131)) | (1L << (LabelDefinition - 131)) | (1L << (CharacterLiteral - 131)))) != 0)) {
				{
				setState(340);
				expression();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(342); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(341);
							anysemi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(344); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(347);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(346);
						expression();
						}
						break;
					}
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
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

	public static class PreambleContext extends ParserRuleContext {
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public FileAnnotationsContext fileAnnotations() {
			return getRuleContext(FileAnnotationsContext.class,0);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preamble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(358);
				fileAnnotations();
				}
				break;
			}
			setState(361);
			packageHeader();
			setState(362);
			importList();
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

	public static class FileAnnotationsContext extends ParserRuleContext {
		public List<FileAnnotationContext> fileAnnotation() {
			return getRuleContexts(FileAnnotationContext.class);
		}
		public FileAnnotationContext fileAnnotation(int i) {
			return getRuleContext(FileAnnotationContext.class,i);
		}
		public FileAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAnnotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFileAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFileAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFileAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAnnotationsContext fileAnnotations() throws RecognitionException {
		FileAnnotationsContext _localctx = new FileAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileAnnotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(364);
					fileAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FileAnnotationContext extends ParserRuleContext {
		public List<TerminalNode> FILE() { return getTokens(KotlinParser.FILE); }
		public TerminalNode FILE(int i) {
			return getToken(KotlinParser.FILE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(KotlinParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KotlinParser.COLON, i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(KotlinParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(KotlinParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(KotlinParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(KotlinParser.RSQUARE, i);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public FileAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFileAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFileAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFileAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAnnotationContext fileAnnotation() throws RecognitionException {
		FileAnnotationContext _localctx = new FileAnnotationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fileAnnotation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(369);
					match(FILE);
					setState(370);
					match(COLON);
					setState(380);
					switch (_input.LA(1)) {
					case LSQUARE:
						{
						setState(371);
						match(LSQUARE);
						setState(373); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(372);
							unescapedAnnotation();
							}
							}
							setState(375); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0) );
						setState(377);
						match(RSQUARE);
						}
						break;
					case IMPORT:
					case CONSTRUCTOR:
					case BY:
					case COMPANION:
					case INIT:
					case WHERE:
					case CATCH:
					case FINALLY:
					case OUT:
					case GETTER:
					case SETTER:
					case DYNAMIC:
					case PUBLIC:
					case PRIVATE:
					case PROTECTED:
					case INTERNAL:
					case ENUM:
					case SEALED:
					case ANNOTATION:
					case DATA:
					case INNER:
					case TAILREC:
					case OPERATOR:
					case INLINE:
					case INFIX:
					case EXTERNAL:
					case SUSPEND:
					case OVERRIDE:
					case ABSTRACT:
					case FINAL:
					case OPEN:
					case CONST:
					case LATEINIT:
					case VARARG:
					case NOINLINE:
					case CROSSINLINE:
					case REIFIED:
					case Identifier:
						{
						setState(379);
						unescapedAnnotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(383);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(382);
						semi();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(387); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PackageHeaderContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KotlinParser.PACKAGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public PackageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPackageHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPackageHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPackageHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageHeaderContext packageHeader() throws RecognitionException {
		PackageHeaderContext _localctx = new PackageHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_packageHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(390);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
					{
					setState(389);
					modifierList();
					}
				}

				setState(392);
				match(PACKAGE);
				setState(393);
				identifier();
				setState(395);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(394);
					semi();
					}
					break;
				}
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

	public static class ImportListContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					importHeader();
					}
					} 
				}
				setState(404);
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

	public static class ImportHeaderContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public ImportAliasContext importAlias() {
			return getRuleContext(ImportAliasContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitImportHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(IMPORT);
			setState(406);
			identifier();
			setState(410);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(407);
				match(DOT);
				setState(408);
				match(MULT);
				}
				break;
			case AS:
				{
				setState(409);
				importAlias();
				}
				break;
			case EOF:
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case SEMICOLON:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case CLASS:
			case INTERFACE:
			case FUN:
			case OBJECT:
			case VAL:
			case VAR:
			case TYPE_ALIAS:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(413);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(412);
				semi();
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

	public static class ImportAliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(KotlinParser.AS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ImportAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitImportAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasContext importAlias() throws RecognitionException {
		ImportAliasContext _localctx = new ImportAliasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(AS);
			setState(416);
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

	public static class TopLevelObjectContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public TopLevelObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTopLevelObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTopLevelObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTopLevelObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelObjectContext topLevelObject() throws RecognitionException {
		TopLevelObjectContext _localctx = new TopLevelObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_topLevelObject);
		try {
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				objectDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				typeAlias();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(KotlinParser.INTERFACE, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(425);
				modifierList();
				}
			}

			setState(428);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(429);
				match(NL);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			simpleIdentifier();
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(436);
					match(NL);
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				typeParameters();
				}
				break;
			}
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(445);
					match(NL);
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451);
				primaryConstructor();
				}
				break;
			}
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(454);
					match(NL);
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				match(COLON);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(461);
					match(NL);
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				delegationSpecifiers();
				}
				break;
			}
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(470);
					match(NL);
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				typeConstraints();
				}
				break;
			}
			setState(493);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(479);
					match(NL);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				classBody();
				}
				break;
			case 2:
				{
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(486);
					match(NL);
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
				enumClassBody();
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

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public ClassParametersContext classParameters() {
			return getRuleContext(ClassParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrimaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrimaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(495);
				modifierList();
				}
			}

			setState(505);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(498);
				match(CONSTRUCTOR);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(499);
					match(NL);
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(507);
			classParameters();
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

	public static class ClassParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ClassParameterContext> classParameter() {
			return getRuleContexts(ClassParameterContext.class);
		}
		public ClassParameterContext classParameter(int i) {
			return getRuleContext(ClassParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ClassParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParametersContext classParameters() throws RecognitionException {
		ClassParametersContext _localctx = new ClassParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(LPAREN);
			setState(518);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (DYNAMIC - 104)) | (1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(510);
				classParameter();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(511);
					match(COMMA);
					setState(512);
					classParameter();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(520);
			match(RPAREN);
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

	public static class ClassParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public ClassParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassParameterContext classParameter() throws RecognitionException {
		ClassParameterContext _localctx = new ClassParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(522);
				modifierList();
				}
				break;
			}
			setState(526);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(525);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(528);
			simpleIdentifier();
			setState(529);
			match(COLON);
			setState(530);
			type();
			setState(533);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(531);
				match(ASSIGNMENT);
				setState(532);
				expression();
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

	public static class DelegationSpecifiersContext extends ParserRuleContext {
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DelegationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDelegationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegationSpecifiersContext delegationSpecifiers() throws RecognitionException {
		DelegationSpecifiersContext _localctx = new DelegationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_delegationSpecifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (FIELD - 94)) | (1L << (PROPERTY - 94)) | (1L << (GET - 94)) | (1L << (SET - 94)) | (1L << (RECEIVER - 94)) | (1L << (PARAM - 94)) | (1L << (SETPARAM - 94)) | (1L << (DELEGATE - 94)) | (1L << (LabelReference - 94)))) != 0)) {
				{
				{
				setState(535);
				annotations();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			delegationSpecifier();
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(542);
						match(NL);
						}
						}
						setState(547);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(548);
					match(COMMA);
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(549);
						match(NL);
						}
						}
						setState(554);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(555);
					delegationSpecifier();
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class DelegationSpecifierContext extends ParserRuleContext {
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ExplicitDelegationContext explicitDelegation() {
			return getRuleContext(ExplicitDelegationContext.class,0);
		}
		public DelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDelegationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegationSpecifierContext delegationSpecifier() throws RecognitionException {
		DelegationSpecifierContext _localctx = new DelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delegationSpecifier);
		try {
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				explicitDelegation();
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

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			userType();
			setState(567);
			callSuffix();
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

	public static class ExplicitDelegationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode BY() { return getToken(KotlinParser.BY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ExplicitDelegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDelegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExplicitDelegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExplicitDelegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExplicitDelegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitDelegationContext explicitDelegation() throws RecognitionException {
		ExplicitDelegationContext _localctx = new ExplicitDelegationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_explicitDelegation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			userType();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(570);
				match(NL);
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(BY);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577);
					match(NL);
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(583);
			expression();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(LCURL);
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(586);
					match(NL);
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (PUBLIC - 105)) | (1L << (PRIVATE - 105)) | (1L << (PROTECTED - 105)) | (1L << (INTERNAL - 105)) | (1L << (ENUM - 105)) | (1L << (SEALED - 105)) | (1L << (ANNOTATION - 105)) | (1L << (DATA - 105)) | (1L << (INNER - 105)) | (1L << (TAILREC - 105)) | (1L << (OPERATOR - 105)) | (1L << (INLINE - 105)) | (1L << (INFIX - 105)) | (1L << (EXTERNAL - 105)) | (1L << (SUSPEND - 105)) | (1L << (OVERRIDE - 105)) | (1L << (ABSTRACT - 105)) | (1L << (FINAL - 105)) | (1L << (OPEN - 105)) | (1L << (CONST - 105)) | (1L << (LATEINIT - 105)) | (1L << (VARARG - 105)) | (1L << (NOINLINE - 105)) | (1L << (CROSSINLINE - 105)) | (1L << (REIFIED - 105)) | (1L << (LabelReference - 105)))) != 0)) {
				{
				{
				setState(592);
				classMemberDeclaration();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(598);
				match(NL);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			match(RCURL);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public CompanionObjectContext companionObject() {
			return getRuleContext(CompanionObjectContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public AnonymousInitializerContext anonymousInitializer() {
			return getRuleContext(AnonymousInitializerContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classMemberDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(606);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(607);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(608);
				objectDeclaration();
				}
				break;
			case 4:
				{
				setState(609);
				companionObject();
				}
				break;
			case 5:
				{
				setState(610);
				propertyDeclaration();
				}
				break;
			case 6:
				{
				setState(611);
				anonymousInitializer();
				}
				break;
			case 7:
				{
				setState(612);
				secondaryConstructor();
				}
				break;
			case 8:
				{
				setState(613);
				typeAlias();
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(616);
					anysemi();
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class AnonymousInitializerContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(KotlinParser.INIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AnonymousInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnonymousInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnonymousInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnonymousInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousInitializerContext anonymousInitializer() throws RecognitionException {
		AnonymousInitializerContext _localctx = new AnonymousInitializerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(INIT);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(623);
				match(NL);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			block();
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

	public static class SecondaryConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSecondaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSecondaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(631);
				modifierList();
				}
			}

			setState(634);
			match(CONSTRUCTOR);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(635);
				match(NL);
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641);
			functionValueParameters();
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(642);
					match(NL);
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(648);
				match(COLON);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(649);
					match(NL);
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(655);
				constructorDelegationCall();
				}
				break;
			}
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(658);
				match(NL);
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			block();
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

	public static class ConstructorDelegationCallContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KotlinParser.THIS, 0); }
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode SUPER() { return getToken(KotlinParser.SUPER, 0); }
		public ConstructorDelegationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDelegationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorDelegationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorDelegationCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorDelegationCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDelegationCallContext constructorDelegationCall() throws RecognitionException {
		ConstructorDelegationCallContext _localctx = new ConstructorDelegationCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorDelegationCall);
		int _la;
		try {
			setState(682);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				match(THIS);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(667);
					match(NL);
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				valueArguments();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(SUPER);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(675);
					match(NL);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				valueArguments();
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

	public static class EnumClassBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public EnumClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEnumClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumClassBodyContext enumClassBody() throws RecognitionException {
		EnumClassBodyContext _localctx = new EnumClassBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumClassBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(LCURL);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(685);
					match(NL);
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(692);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0)) {
				{
				setState(691);
				enumEntries();
				}
			}

			setState(713);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(694);
					match(NL);
					}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(700);
				match(SEMICOLON);
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(701);
						match(NL);
						}
						} 
					}
					setState(706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (CLASS - 40)) | (1L << (INTERFACE - 40)) | (1L << (FUN - 40)) | (1L << (OBJECT - 40)) | (1L << (VAL - 40)) | (1L << (VAR - 40)) | (1L << (TYPE_ALIAS - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (PUBLIC - 105)) | (1L << (PRIVATE - 105)) | (1L << (PROTECTED - 105)) | (1L << (INTERNAL - 105)) | (1L << (ENUM - 105)) | (1L << (SEALED - 105)) | (1L << (ANNOTATION - 105)) | (1L << (DATA - 105)) | (1L << (INNER - 105)) | (1L << (TAILREC - 105)) | (1L << (OPERATOR - 105)) | (1L << (INLINE - 105)) | (1L << (INFIX - 105)) | (1L << (EXTERNAL - 105)) | (1L << (SUSPEND - 105)) | (1L << (OVERRIDE - 105)) | (1L << (ABSTRACT - 105)) | (1L << (FINAL - 105)) | (1L << (OPEN - 105)) | (1L << (CONST - 105)) | (1L << (LATEINIT - 105)) | (1L << (VARARG - 105)) | (1L << (NOINLINE - 105)) | (1L << (CROSSINLINE - 105)) | (1L << (REIFIED - 105)) | (1L << (LabelReference - 105)))) != 0)) {
					{
					{
					setState(707);
					classMemberDeclaration();
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(715);
				match(NL);
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			match(RCURL);
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

	public static class EnumEntriesContext extends ParserRuleContext {
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEnumEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(723);
				enumEntry();
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(724);
						match(NL);
						}
						} 
					}
					setState(729);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				}
				}
				setState(732); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0) );
			setState(735);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(734);
				match(SEMICOLON);
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

	public static class EnumEntryContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(KotlinParser.COMMA, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEnumEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			simpleIdentifier();
			setState(745);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(738);
					match(NL);
					}
					}
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(744);
				valueArguments();
				}
				break;
			}
			setState(754);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(747);
					match(NL);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
				classBody();
				}
				break;
			}
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(756);
					match(NL);
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(762);
				match(COMMA);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(KotlinParser.FUN, 0); }
		public FunctionValueParametersContext functionValueParameters() {
			return getRuleContext(FunctionValueParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CARON() { return getToken(KotlinParser.CARON, 0); }
		public LocationReferenceContext locationReference() {
			return getRuleContext(LocationReferenceContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(765);
				modifierList();
				}
			}

			setState(768);
			match(FUN);
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(769);
					match(NL);
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				type();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(776);
					match(NL);
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(DOT);
				}
				break;
			}
			setState(793);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(786);
					match(NL);
					}
					}
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(792);
				typeParameters();
				}
				break;
			}
			setState(802);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(795);
					match(NL);
					}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(801);
				identifier();
				}
				break;
			}
			setState(812);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(804);
					match(NL);
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(810);
				match(CARON);
				setState(811);
				locationReference();
				}
				break;
			}
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(814);
				match(NL);
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			functionValueParameters();
			setState(835);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(821);
					match(NL);
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(827);
				match(COLON);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(828);
					match(NL);
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(834);
				type();
				}
				break;
			}
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(837);
					match(NL);
					}
					}
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(843);
				typeConstraints();
				}
				break;
			}
			setState(853);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(846);
					match(NL);
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(852);
				functionBody();
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

	public static class FunctionValueParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<FunctionValueParameterContext> functionValueParameter() {
			return getRuleContexts(FunctionValueParameterContext.class);
		}
		public FunctionValueParameterContext functionValueParameter(int i) {
			return getRuleContext(FunctionValueParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public FunctionValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionValueParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionValueParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueParametersContext functionValueParameters() throws RecognitionException {
		FunctionValueParametersContext _localctx = new FunctionValueParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionValueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LPAREN);
			setState(864);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (AT - 40)) | (1L << (FILE - 40)) | (1L << (IMPORT - 40)) | (1L << (CONSTRUCTOR - 40)) | (1L << (BY - 40)) | (1L << (COMPANION - 40)) | (1L << (INIT - 40)) | (1L << (WHERE - 40)) | (1L << (CATCH - 40)) | (1L << (FINALLY - 40)) | (1L << (IN - 40)) | (1L << (OUT - 40)) | (1L << (FIELD - 40)) | (1L << (PROPERTY - 40)) | (1L << (GET - 40)) | (1L << (SET - 40)) | (1L << (GETTER - 40)) | (1L << (SETTER - 40)) | (1L << (RECEIVER - 40)) | (1L << (PARAM - 40)) | (1L << (SETPARAM - 40)) | (1L << (DELEGATE - 40)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (DYNAMIC - 104)) | (1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)) | (1L << (ENUM - 104)) | (1L << (SEALED - 104)) | (1L << (ANNOTATION - 104)) | (1L << (DATA - 104)) | (1L << (INNER - 104)) | (1L << (TAILREC - 104)) | (1L << (OPERATOR - 104)) | (1L << (INLINE - 104)) | (1L << (INFIX - 104)) | (1L << (EXTERNAL - 104)) | (1L << (SUSPEND - 104)) | (1L << (OVERRIDE - 104)) | (1L << (ABSTRACT - 104)) | (1L << (FINAL - 104)) | (1L << (OPEN - 104)) | (1L << (CONST - 104)) | (1L << (LATEINIT - 104)) | (1L << (VARARG - 104)) | (1L << (NOINLINE - 104)) | (1L << (CROSSINLINE - 104)) | (1L << (REIFIED - 104)) | (1L << (Identifier - 104)) | (1L << (LabelReference - 104)))) != 0)) {
				{
				setState(856);
				functionValueParameter();
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(857);
					match(COMMA);
					setState(858);
					functionValueParameter();
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(866);
			match(RPAREN);
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

	public static class FunctionValueParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionValueParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValueParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionValueParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionValueParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionValueParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueParameterContext functionValueParameter() throws RecognitionException {
		FunctionValueParameterContext _localctx = new FunctionValueParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionValueParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(868);
				modifierList();
				}
				break;
			}
			setState(871);
			parameter();
			setState(874);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(872);
				match(ASSIGNMENT);
				setState(873);
				expression();
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

	public static class ParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			simpleIdentifier();
			setState(877);
			match(COLON);
			setState(878);
			type();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionBody);
		try {
			int _alt;
			setState(889);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(ASSIGNMENT);
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(882);
						match(NL);
						}
						} 
					}
					setState(887);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(888);
				expression();
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(KotlinParser.OBJECT, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(891);
				modifierList();
				}
			}

			setState(894);
			match(OBJECT);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(895);
				match(NL);
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(901);
			simpleIdentifier();
			setState(909);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(902);
					match(NL);
					}
					}
					setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(908);
				primaryConstructor();
				}
				break;
			}
			setState(925);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(911);
					match(NL);
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				match(COLON);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(918);
					match(NL);
					}
					}
					setState(923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
				delegationSpecifiers();
				}
				break;
			}
			setState(934);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(927);
					match(NL);
					}
					}
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(933);
				classBody();
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

	public static class CompanionObjectContext extends ParserRuleContext {
		public TerminalNode COMPANION() { return getToken(KotlinParser.COMPANION, 0); }
		public TerminalNode OBJECT() { return getToken(KotlinParser.OBJECT, 0); }
		public List<ModifierListContext> modifierList() {
			return getRuleContexts(ModifierListContext.class);
		}
		public ModifierListContext modifierList(int i) {
			return getRuleContext(ModifierListContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public CompanionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCompanionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCompanionObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCompanionObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompanionObjectContext companionObject() throws RecognitionException {
		CompanionObjectContext _localctx = new CompanionObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(936);
				modifierList();
				}
			}

			setState(939);
			match(COMPANION);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(940);
				match(NL);
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(947);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(946);
				modifierList();
				}
			}

			setState(949);
			match(OBJECT);
			setState(957);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(950);
					match(NL);
					}
					}
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(956);
				simpleIdentifier();
				}
				break;
			}
			setState(973);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(959);
					match(NL);
					}
					}
					setState(964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(965);
				match(COLON);
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(966);
					match(NL);
					}
					}
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(972);
				delegationSpecifiers();
				}
				break;
			}
			setState(982);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(975);
					match(NL);
					}
					}
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(981);
				classBody();
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(KotlinParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode BY() { return getToken(KotlinParser.BY, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(984);
				modifierList();
				}
			}

			setState(987);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(995);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(988);
					match(NL);
					}
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(994);
				typeParameters();
				}
				break;
			}
			setState(1012);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(997);
					match(NL);
					}
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1003);
				type();
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1004);
					match(NL);
					}
					}
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1010);
				match(DOT);
				}
				break;
			}
			{
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1014);
				match(NL);
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1020);
				multiVariableDeclaration();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(1021);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1031);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1024);
					match(NL);
					}
					}
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1030);
				typeConstraints();
				}
				break;
			}
			setState(1047);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1033);
					match(NL);
					}
					}
					setState(1038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1039);
				_la = _input.LA(1);
				if ( !(_la==ASSIGNMENT || _la==BY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1040);
						match(NL);
						}
						} 
					}
					setState(1045);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1046);
				expression();
				}
				break;
			}
			setState(1061);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1049);
				getter();
				setState(1053);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1050);
					semi();
					setState(1051);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1055);
				setter();
				setState(1059);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1056);
					semi();
					setState(1057);
					getter();
					}
					break;
				}
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

	public static class MultiVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public MultiVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiVariableDeclarationContext multiVariableDeclaration() throws RecognitionException {
		MultiVariableDeclarationContext _localctx = new MultiVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(LPAREN);
			setState(1064);
			variableDeclaration();
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1065);
				match(COMMA);
				setState(1066);
				variableDeclaration();
				}
				}
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1072);
			match(RPAREN);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			simpleIdentifier();
			setState(1077);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1075);
				match(COLON);
				setState(1076);
				type();
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GETTER() { return getToken(KotlinParser.GETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_getter);
		int _la;
		try {
			int _alt;
			setState(1128);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
					{
					setState(1079);
					modifierList();
					}
				}

				setState(1082);
				match(GETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
					{
					setState(1083);
					modifierList();
					}
				}

				setState(1086);
				match(GETTER);
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1087);
					match(NL);
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1093);
				match(LPAREN);
				setState(1094);
				match(RPAREN);
				setState(1109);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1095);
						match(NL);
						}
						}
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1101);
					match(COLON);
					setState(1105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1102);
						match(NL);
						}
						}
						setState(1107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1108);
					type();
					}
					break;
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1111);
					match(NL);
					}
					}
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1126);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(1117);
					block();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1118);
					match(ASSIGNMENT);
					setState(1122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1119);
							match(NL);
							}
							} 
						}
						setState(1124);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
					}
					setState(1125);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SETTER() { return getToken(KotlinParser.SETTER, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ParameterModifierContext> parameterModifier() {
			return getRuleContexts(ParameterModifierContext.class);
		}
		public ParameterModifierContext parameterModifier(int i) {
			return getRuleContext(ParameterModifierContext.class,i);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_setter);
		int _la;
		try {
			int _alt;
			setState(1165);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
					{
					setState(1130);
					modifierList();
					}
				}

				setState(1133);
				match(SETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
					{
					setState(1134);
					modifierList();
					}
				}

				setState(1137);
				match(SETTER);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1138);
					match(NL);
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1144);
				match(LPAREN);
				setState(1149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1147);
						switch (_input.LA(1)) {
						case AT:
						case FILE:
						case FIELD:
						case PROPERTY:
						case GET:
						case SET:
						case RECEIVER:
						case PARAM:
						case SETPARAM:
						case DELEGATE:
						case LabelReference:
							{
							setState(1145);
							annotations();
							}
							break;
						case VARARG:
						case NOINLINE:
						case CROSSINLINE:
							{
							setState(1146);
							parameterModifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1154);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1152);
					simpleIdentifier();
					}
					break;
				case 2:
					{
					setState(1153);
					parameter();
					}
					break;
				}
				setState(1156);
				match(RPAREN);
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1157);
					match(NL);
					}
					}
					setState(1162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1163);
				functionBody();
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode TYPE_ALIAS() { return getToken(KotlinParser.TYPE_ALIAS, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (IN - 90)) | (1L << (OUT - 90)) | (1L << (FIELD - 90)) | (1L << (PROPERTY - 90)) | (1L << (GET - 90)) | (1L << (SET - 90)) | (1L << (RECEIVER - 90)) | (1L << (PARAM - 90)) | (1L << (SETPARAM - 90)) | (1L << (DELEGATE - 90)) | (1L << (PUBLIC - 90)) | (1L << (PRIVATE - 90)) | (1L << (PROTECTED - 90)) | (1L << (INTERNAL - 90)) | (1L << (ENUM - 90)) | (1L << (SEALED - 90)) | (1L << (ANNOTATION - 90)) | (1L << (DATA - 90)) | (1L << (INNER - 90)) | (1L << (TAILREC - 90)) | (1L << (OPERATOR - 90)) | (1L << (INLINE - 90)) | (1L << (INFIX - 90)) | (1L << (EXTERNAL - 90)) | (1L << (SUSPEND - 90)) | (1L << (OVERRIDE - 90)) | (1L << (ABSTRACT - 90)) | (1L << (FINAL - 90)) | (1L << (OPEN - 90)) | (1L << (CONST - 90)) | (1L << (LATEINIT - 90)) | (1L << (VARARG - 90)) | (1L << (NOINLINE - 90)) | (1L << (CROSSINLINE - 90)) | (1L << (REIFIED - 90)) | (1L << (LabelReference - 90)))) != 0)) {
				{
				setState(1167);
				modifierList();
				}
			}

			setState(1170);
			match(TYPE_ALIAS);
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1171);
				match(NL);
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1177);
			simpleIdentifier();
			setState(1185);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1178);
					match(NL);
					}
					}
					setState(1183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1184);
				typeParameters();
				}
				break;
			}
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1187);
				match(NL);
				}
				}
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1193);
			match(ASSIGNMENT);
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1194);
				match(NL);
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1200);
			type();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(LANGLE);
			setState(1206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1203);
					match(NL);
					}
					} 
				}
				setState(1208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1209);
			typeParameter();
			setState(1226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1210);
						match(NL);
						}
						}
						setState(1215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1216);
					match(COMMA);
					setState(1220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1217);
							match(NL);
							}
							} 
						}
						setState(1222);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					}
					setState(1223);
					typeParameter();
					}
					} 
				}
				setState(1228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1229);
				match(NL);
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1235);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1237);
				modifierList();
				}
				break;
			}
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1240);
				match(NL);
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1246);
			simpleIdentifier();
			setState(1267);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1247);
					match(NL);
					}
					}
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1253);
				match(COLON);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1254);
					match(NL);
					}
					}
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1260);
				type();
				setState(1264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1261);
						match(NL);
						}
						} 
					}
					setState(1266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TypeModifierListContext typeModifierList() {
			return getRuleContext(TypeModifierListContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1269);
				typeModifierList();
				}
				break;
			}
			setState(1276);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1272);
				functionType();
				}
				break;
			case 2:
				{
				setState(1273);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1274);
				nullableType();
				}
				break;
			case 4:
				{
				setState(1275);
				typeReference();
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

	public static class TypeModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> SUSPEND() { return getTokens(KotlinParser.SUSPEND); }
		public TerminalNode SUSPEND(int i) {
			return getToken(KotlinParser.SUSPEND, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeModifierListContext typeModifierList() throws RecognitionException {
		TypeModifierListContext _localctx = new TypeModifierListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeModifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1286); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1286);
					switch (_input.LA(1)) {
					case AT:
					case FILE:
					case FIELD:
					case PROPERTY:
					case GET:
					case SET:
					case RECEIVER:
					case PARAM:
					case SETPARAM:
					case DELEGATE:
					case LabelReference:
						{
						setState(1278);
						annotations();
						}
						break;
					case SUSPEND:
						{
						setState(1279);
						match(SUSPEND);
						setState(1283);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1280);
							match(NL);
							}
							}
							setState(1285);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1288); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParenthesizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(LPAREN);
			setState(1291);
			type();
			setState(1292);
			match(RPAREN);
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

	public static class NullableTypeContext extends ParserRuleContext {
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(KotlinParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(KotlinParser.QUEST, i);
		}
		public NullableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterNullableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitNullableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitNullableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullableTypeContext nullableType() throws RecognitionException {
		NullableTypeContext _localctx = new NullableTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nullableType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1294);
				typeReference();
				}
				break;
			case 2:
				{
				setState(1295);
				parenthesizedType();
				}
				break;
			}
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1298);
				match(NL);
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1305); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1304);
					match(QUEST);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1307); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypeReferenceContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public TerminalNode CARON() { return getToken(KotlinParser.CARON, 0); }
		public LocationReferenceContext locationReference() {
			return getRuleContext(LocationReferenceContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode DYNAMIC() { return getToken(KotlinParser.DYNAMIC, 0); }
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeReference);
		int _la;
		try {
			setState(1328);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				match(LPAREN);
				setState(1310);
				typeReference();
				setState(1311);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				userType();
				setState(1315);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1314);
					arrayDeclaration();
					}
					break;
				}
				setState(1325);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1317);
						match(NL);
						}
						}
						setState(1322);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1323);
					match(CARON);
					setState(1324);
					locationReference();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1327);
				match(DYNAMIC);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(LSQUARE);
			setState(1332);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0)) {
				{
				setState(1331);
				userType();
				}
			}

			setState(1334);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeParametersContext functionTypeParameters() {
			return getRuleContext(FunctionTypeParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeReceiverContext functionTypeReceiver() {
			return getRuleContext(FunctionTypeReceiverContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1336);
				functionTypeReceiver();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1337);
					match(NL);
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1343);
				match(DOT);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1344);
					match(NL);
					}
					}
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1352);
			functionTypeParameters();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1353);
				match(NL);
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1359);
			match(ARROW);
			{
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1360);
				match(NL);
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1366);
			type();
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

	public static class FunctionTypeReceiverContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public NullableTypeContext nullableType() {
			return getRuleContext(NullableTypeContext.class,0);
		}
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public FunctionTypeReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionTypeReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionTypeReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionTypeReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeReceiverContext functionTypeReceiver() throws RecognitionException {
		FunctionTypeReceiverContext _localctx = new FunctionTypeReceiverContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionTypeReceiver);
		try {
			setState(1371);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1368);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				typeReference();
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

	public static class UserTypeContext extends ParserRuleContext {
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			simpleUserType();
			setState(1390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1374);
						match(NL);
						}
						}
						setState(1379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1380);
					match(DOT);
					setState(1384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1381);
						match(NL);
						}
						}
						setState(1386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1387);
					simpleUserType();
					}
					} 
				}
				setState(1392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class SimpleUserTypeContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SimpleUserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSimpleUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUserTypeContext simpleUserType() throws RecognitionException {
		SimpleUserTypeContext _localctx = new SimpleUserTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			simpleIdentifier();
			setState(1401);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1394);
					match(NL);
					}
					}
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1400);
				typeArguments();
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

	public static class LocationReferenceContext extends ParserRuleContext {
		public List<LiteralConstantContext> literalConstant() {
			return getRuleContexts(LiteralConstantContext.class);
		}
		public LiteralConstantContext literalConstant(int i) {
			return getRuleContext(LiteralConstantContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(KotlinParser.RANGE, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public LocationReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLocationReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLocationReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLocationReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationReferenceContext locationReference() throws RecognitionException {
		LocationReferenceContext _localctx = new LocationReferenceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_locationReference);
		try {
			setState(1409);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				literalConstant();
				setState(1406);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1404);
					match(RANGE);
					setState(1405);
					literalConstant();
					}
					break;
				}
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				userType();
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

	public static class FunctionTypeParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public FunctionTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParametersContext functionTypeParameters() throws RecognitionException {
		FunctionTypeParametersContext _localctx = new FunctionTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(LPAREN);
			setState(1414);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1412);
				parameter();
				}
				break;
			case 2:
				{
				setState(1413);
				type();
				}
				break;
			}
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1416);
				match(COMMA);
				setState(1419);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1417);
					parameter();
					}
					break;
				case 2:
					{
					setState(1418);
					type();
					}
					break;
				}
				}
				}
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1426);
			match(RPAREN);
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

	public static class TypeConstraintsContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(KotlinParser.WHERE, 0); }
		public List<TypeConstraintContext> typeConstraint() {
			return getRuleContexts(TypeConstraintContext.class);
		}
		public TypeConstraintContext typeConstraint(int i) {
			return getRuleContext(TypeConstraintContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public TypeConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConstraintsContext typeConstraints() throws RecognitionException {
		TypeConstraintsContext _localctx = new TypeConstraintsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(WHERE);
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1429);
				match(NL);
				}
				}
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1435);
			typeConstraint();
			setState(1452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1436);
						match(NL);
						}
						}
						setState(1441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1442);
					match(COMMA);
					setState(1446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1443);
						match(NL);
						}
						}
						setState(1448);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1449);
					typeConstraint();
					}
					} 
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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

	public static class TypeConstraintContext extends ParserRuleContext {
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConstraintContext typeConstraint() throws RecognitionException {
		TypeConstraintContext _localctx = new TypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (FIELD - 94)) | (1L << (PROPERTY - 94)) | (1L << (GET - 94)) | (1L << (SET - 94)) | (1L << (RECEIVER - 94)) | (1L << (PARAM - 94)) | (1L << (SETPARAM - 94)) | (1L << (DELEGATE - 94)) | (1L << (LabelReference - 94)))) != 0)) {
				{
				{
				setState(1455);
				annotations();
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
			simpleIdentifier();
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1462);
				match(NL);
				}
				}
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1468);
			match(COLON);
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1469);
				match(NL);
				}
				}
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1475);
			type();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(LCURL);
			setState(1478);
			statements();
			setState(1479);
			match(RCURL);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1481);
					anysemi();
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1501);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1487);
				statement();
				setState(1498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1489); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1488);
								anysemi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1491); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1494);
						switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
						case 1:
							{
							setState(1493);
							statement();
							}
							break;
						}
						}
						} 
					}
					setState(1500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockLevelExpressionContext blockLevelExpression() {
			return getRuleContext(BlockLevelExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_statement);
		try {
			setState(1505);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				blockLevelExpression();
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

	public static class BlockLevelExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public BlockLevelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLevelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterBlockLevelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitBlockLevelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitBlockLevelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockLevelExpressionContext blockLevelExpression() throws RecognitionException {
		BlockLevelExpressionContext _localctx = new BlockLevelExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_blockLevelExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1507);
					annotations();
					}
					} 
				}
				setState(1512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(1516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1513);
					match(NL);
					}
					} 
				}
				setState(1518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			setState(1519);
			expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public List<LabelDefinitionContext> labelDefinition() {
			return getRuleContexts(LabelDefinitionContext.class);
		}
		public LabelDefinitionContext labelDefinition(int i) {
			return getRuleContext(LabelDefinitionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LabelDefinition) {
				{
				{
				setState(1521);
				labelDefinition();
				}
				}
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1531);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1527);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(1528);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(1529);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(1530);
				typeAlias();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<AssignmentOperatorContext> assignmentOperator() {
			return getRuleContexts(AssignmentOperatorContext.class);
		}
		public AssignmentOperatorContext assignmentOperator(int i) {
			return getRuleContext(AssignmentOperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			disjunction();
			setState(1539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1534);
					assignmentOperator();
					setState(1535);
					disjunction();
					}
					} 
				}
				setState(1541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> DISJ() { return getTokens(KotlinParser.DISJ); }
		public TerminalNode DISJ(int i) {
			return getToken(KotlinParser.DISJ, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_disjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			conjunction();
			setState(1559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1543);
						match(NL);
						}
						}
						setState(1548);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1549);
					match(DISJ);
					setState(1553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1550);
							match(NL);
							}
							} 
						}
						setState(1555);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
					}
					setState(1556);
					conjunction();
					}
					} 
				}
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityComparisonContext> equalityComparison() {
			return getRuleContexts(EqualityComparisonContext.class);
		}
		public EqualityComparisonContext equalityComparison(int i) {
			return getRuleContext(EqualityComparisonContext.class,i);
		}
		public List<TerminalNode> CONJ() { return getTokens(KotlinParser.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(KotlinParser.CONJ, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_conjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			equalityComparison();
			setState(1579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1566);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1563);
						match(NL);
						}
						}
						setState(1568);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1569);
					match(CONJ);
					setState(1573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1570);
							match(NL);
							}
							} 
						}
						setState(1575);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
					}
					setState(1576);
					equalityComparison();
					}
					} 
				}
				setState(1581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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

	public static class EqualityComparisonContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<EqualityOperationContext> equalityOperation() {
			return getRuleContexts(EqualityOperationContext.class);
		}
		public EqualityOperationContext equalityOperation(int i) {
			return getRuleContext(EqualityOperationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public EqualityComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEqualityComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityComparisonContext equalityComparison() throws RecognitionException {
		EqualityComparisonContext _localctx = new EqualityComparisonContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			comparison();
			setState(1594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1583);
					equalityOperation();
					setState(1587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1584);
							match(NL);
							}
							} 
						}
						setState(1589);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
					}
					setState(1590);
					comparison();
					}
					} 
				}
				setState(1596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<NamedInfixContext> namedInfix() {
			return getRuleContexts(NamedInfixContext.class);
		}
		public NamedInfixContext namedInfix(int i) {
			return getRuleContext(NamedInfixContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			namedInfix();
			setState(1607);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1598);
				comparisonOperator();
				setState(1602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1599);
						match(NL);
						}
						} 
					}
					setState(1604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				}
				setState(1605);
				namedInfix();
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

	public static class NamedInfixContext extends ParserRuleContext {
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InOperatorContext> inOperator() {
			return getRuleContexts(InOperatorContext.class);
		}
		public InOperatorContext inOperator(int i) {
			return getRuleContext(InOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public NamedInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedInfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterNamedInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitNamedInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitNamedInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedInfixContext namedInfix() throws RecognitionException {
		NamedInfixContext _localctx = new NamedInfixContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_namedInfix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			elvisExpression();
			setState(1632);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1619); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1610);
						inOperator();
						setState(1614);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1611);
								match(NL);
								}
								} 
							}
							setState(1616);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
						}
						setState(1617);
						elvisExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1621); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				{
				setState(1623);
				isOperator();
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1624);
					match(NL);
					}
					}
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1630);
				type();
				}
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

	public static class ElvisExpressionContext extends ParserRuleContext {
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
		}
		public List<TerminalNode> ELVIS() { return getTokens(KotlinParser.ELVIS); }
		public TerminalNode ELVIS(int i) {
			return getToken(KotlinParser.ELVIS, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterElvisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitElvisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitElvisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elvisExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			infixFunctionCall();
			setState(1651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1635);
						match(NL);
						}
						}
						setState(1640);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1641);
					match(ELVIS);
					setState(1645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1642);
							match(NL);
							}
							} 
						}
						setState(1647);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
					}
					setState(1648);
					infixFunctionCall();
					}
					} 
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class InfixFunctionCallContext extends ParserRuleContext {
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public InfixFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInfixFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInfixFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInfixFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixFunctionCallContext infixFunctionCall() throws RecognitionException {
		InfixFunctionCallContext _localctx = new InfixFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			rangeExpression();
			setState(1666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					simpleIdentifier();
					setState(1659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1656);
							match(NL);
							}
							} 
						}
						setState(1661);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
					}
					setState(1662);
					rangeExpression();
					}
					} 
				}
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RANGE() { return getTokens(KotlinParser.RANGE); }
		public TerminalNode RANGE(int i) {
			return getToken(KotlinParser.RANGE, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			additiveExpression();
			setState(1680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1670);
					match(RANGE);
					setState(1674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1671);
							match(NL);
							}
							} 
						}
						setState(1676);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
					}
					setState(1677);
					additiveExpression();
					}
					} 
				}
				setState(1682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			multiplicativeExpression();
			setState(1695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1684);
					additiveOperator();
					setState(1688);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1685);
							match(NL);
							}
							} 
						}
						setState(1690);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
					}
					setState(1691);
					multiplicativeExpression();
					}
					} 
				}
				setState(1697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<TypeRHSContext> typeRHS() {
			return getRuleContexts(TypeRHSContext.class);
		}
		public TypeRHSContext typeRHS(int i) {
			return getRuleContext(TypeRHSContext.class,i);
		}
		public List<MultiplicativeOperationContext> multiplicativeOperation() {
			return getRuleContexts(MultiplicativeOperationContext.class);
		}
		public MultiplicativeOperationContext multiplicativeOperation(int i) {
			return getRuleContext(MultiplicativeOperationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			typeRHS();
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699);
					multiplicativeOperation();
					setState(1703);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1700);
							match(NL);
							}
							} 
						}
						setState(1705);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
					}
					setState(1706);
					typeRHS();
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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

	public static class TypeRHSContext extends ParserRuleContext {
		public List<PrefixUnaryExpressionContext> prefixUnaryExpression() {
			return getRuleContexts(PrefixUnaryExpressionContext.class);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression(int i) {
			return getRuleContext(PrefixUnaryExpressionContext.class,i);
		}
		public List<TypeOperationContext> typeOperation() {
			return getRuleContexts(TypeOperationContext.class);
		}
		public TypeOperationContext typeOperation(int i) {
			return getRuleContext(TypeOperationContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeRHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeRHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRHSContext typeRHS() throws RecognitionException {
		TypeRHSContext _localctx = new TypeRHSContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typeRHS);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			prefixUnaryExpression();
			setState(1725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1714);
						match(NL);
						}
						}
						setState(1719);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1720);
					typeOperation();
					setState(1721);
					prefixUnaryExpression();
					}
					} 
				}
				setState(1727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PrefixUnaryOperationContext> prefixUnaryOperation() {
			return getRuleContexts(PrefixUnaryOperationContext.class);
		}
		public PrefixUnaryOperationContext prefixUnaryOperation(int i) {
			return getRuleContext(PrefixUnaryOperationContext.class,i);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrefixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1728);
					prefixUnaryOperation();
					}
					} 
				}
				setState(1733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			setState(1734);
			postfixUnaryExpression();
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

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
		}
		public List<PostfixUnaryOperationContext> postfixUnaryOperation() {
			return getRuleContexts(PostfixUnaryOperationContext.class);
		}
		public PostfixUnaryOperationContext postfixUnaryOperation(int i) {
			return getRuleContext(PostfixUnaryOperationContext.class,i);
		}
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPostfixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_postfixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1736);
				atomicExpression();
				}
				break;
			case 2:
				{
				setState(1737);
				callableReference();
				}
				break;
			}
			setState(1743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1740);
					postfixUnaryOperation();
					}
					} 
				}
				setState(1745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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

	public static class AtomicExpressionContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public SuperExpressionContext superExpression() {
			return getRuleContext(SuperExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public JumpExpressionContext jumpExpression() {
			return getRuleContext(JumpExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public CollectionLiteralContext collectionLiteral() {
			return getRuleContext(CollectionLiteralContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_atomicExpression);
		try {
			setState(1758);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				parenthesizedExpression();
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1747);
				literalConstant();
				}
				break;
			case LCURL:
			case AT:
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case LabelReference:
				enterOuterAlt(_localctx, 3);
				{
				setState(1748);
				functionLiteral();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1749);
				thisExpression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1750);
				superExpression();
				}
				break;
			case IF:
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1751);
				conditionalExpression();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 7);
				{
				setState(1752);
				tryExpression();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1753);
				objectLiteral();
				}
				break;
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(1754);
				jumpExpression();
				}
				break;
			case FOR:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1755);
				loopExpression();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1756);
				collectionLiteral();
				}
				break;
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 12);
				{
				setState(1757);
				simpleIdentifier();
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

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(LPAREN);
			setState(1761);
			expression();
			setState(1762);
			match(RPAREN);
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

	public static class CallSuffixContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public List<AnnotatedLambdaContext> annotatedLambda() {
			return getRuleContexts(AnnotatedLambdaContext.class);
		}
		public AnnotatedLambdaContext annotatedLambda(int i) {
			return getRuleContext(AnnotatedLambdaContext.class,i);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_callSuffix);
		try {
			int _alt;
			setState(1786);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764);
				typeArguments();
				setState(1766);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1765);
					valueArguments();
					}
					break;
				}
				setState(1771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1768);
						annotatedLambda();
						}
						} 
					}
					setState(1773);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				valueArguments();
				setState(1778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1775);
						annotatedLambda();
						}
						} 
					}
					setState(1780);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				}
				}
				break;
			case NL:
			case LCURL:
			case AT:
			case FILE:
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1782); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1781);
						annotatedLambda();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1784); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AnnotatedLambdaContext extends ParserRuleContext {
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode LabelDefinition() { return getToken(KotlinParser.LabelDefinition, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AnnotatedLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotatedLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotatedLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotatedLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedLambdaContext annotatedLambda() throws RecognitionException {
		AnnotatedLambdaContext _localctx = new AnnotatedLambdaContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0)) {
				{
				{
				setState(1788);
				unescapedAnnotation();
				}
				}
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1795);
			_la = _input.LA(1);
			if (_la==LabelDefinition) {
				{
				setState(1794);
				match(LabelDefinition);
				}
			}

			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1797);
				match(NL);
				}
				}
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1803);
			functionLiteral();
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(LSQUARE);
			setState(1814);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CONSTRUCTOR - 67)) | (1L << (BY - 67)) | (1L << (COMPANION - 67)) | (1L << (INIT - 67)) | (1L << (THIS - 67)) | (1L << (SUPER - 67)) | (1L << (WHERE - 67)) | (1L << (IF - 67)) | (1L << (WHEN - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (FINALLY - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (THROW - 67)) | (1L << (RETURN - 67)) | (1L << (CONTINUE - 67)) | (1L << (BREAK - 67)) | (1L << (OUT - 67)) | (1L << (FIELD - 67)) | (1L << (PROPERTY - 67)) | (1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (GETTER - 67)) | (1L << (SETTER - 67)) | (1L << (RECEIVER - 67)) | (1L << (PARAM - 67)) | (1L << (SETPARAM - 67)) | (1L << (DELEGATE - 67)) | (1L << (DYNAMIC - 67)) | (1L << (PUBLIC - 67)) | (1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (INTERNAL - 67)) | (1L << (ENUM - 67)) | (1L << (SEALED - 67)) | (1L << (ANNOTATION - 67)) | (1L << (DATA - 67)) | (1L << (INNER - 67)) | (1L << (TAILREC - 67)) | (1L << (OPERATOR - 67)) | (1L << (INLINE - 67)) | (1L << (INFIX - 67)) | (1L << (EXTERNAL - 67)) | (1L << (SUSPEND - 67)) | (1L << (OVERRIDE - 67)) | (1L << (ABSTRACT - 67)) | (1L << (FINAL - 67)) | (1L << (OPEN - 67)) | (1L << (CONST - 67)) | (1L << (LATEINIT - 67)) | (1L << (VARARG - 67)) | (1L << (NOINLINE - 67)) | (1L << (CROSSINLINE - 67)) | (1L << (REIFIED - 67)) | (1L << (QUOTE_OPEN - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (TRIPLE_QUOTE_OPEN - 131)) | (1L << (RealLiteral - 131)) | (1L << (LongLiteral - 131)) | (1L << (IntegerLiteral - 131)) | (1L << (HexLiteral - 131)) | (1L << (BinLiteral - 131)) | (1L << (BooleanLiteral - 131)) | (1L << (NullLiteral - 131)) | (1L << (Identifier - 131)) | (1L << (LabelReference - 131)) | (1L << (LabelDefinition - 131)) | (1L << (CharacterLiteral - 131)))) != 0)) {
				{
				setState(1806);
				expression();
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1807);
					match(COMMA);
					setState(1808);
					expression();
					}
					}
					setState(1813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1816);
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

	public static class ValueArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<ValueArgumentContext> valueArgument() {
			return getRuleContexts(ValueArgumentContext.class);
		}
		public ValueArgumentContext valueArgument(int i) {
			return getRuleContext(ValueArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitValueArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_valueArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(LPAREN);
			setState(1827);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << MULT) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CONSTRUCTOR - 67)) | (1L << (BY - 67)) | (1L << (COMPANION - 67)) | (1L << (INIT - 67)) | (1L << (THIS - 67)) | (1L << (SUPER - 67)) | (1L << (WHERE - 67)) | (1L << (IF - 67)) | (1L << (WHEN - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (FINALLY - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (THROW - 67)) | (1L << (RETURN - 67)) | (1L << (CONTINUE - 67)) | (1L << (BREAK - 67)) | (1L << (OUT - 67)) | (1L << (FIELD - 67)) | (1L << (PROPERTY - 67)) | (1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (GETTER - 67)) | (1L << (SETTER - 67)) | (1L << (RECEIVER - 67)) | (1L << (PARAM - 67)) | (1L << (SETPARAM - 67)) | (1L << (DELEGATE - 67)) | (1L << (DYNAMIC - 67)) | (1L << (PUBLIC - 67)) | (1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (INTERNAL - 67)) | (1L << (ENUM - 67)) | (1L << (SEALED - 67)) | (1L << (ANNOTATION - 67)) | (1L << (DATA - 67)) | (1L << (INNER - 67)) | (1L << (TAILREC - 67)) | (1L << (OPERATOR - 67)) | (1L << (INLINE - 67)) | (1L << (INFIX - 67)) | (1L << (EXTERNAL - 67)) | (1L << (SUSPEND - 67)) | (1L << (OVERRIDE - 67)) | (1L << (ABSTRACT - 67)) | (1L << (FINAL - 67)) | (1L << (OPEN - 67)) | (1L << (CONST - 67)) | (1L << (LATEINIT - 67)) | (1L << (VARARG - 67)) | (1L << (NOINLINE - 67)) | (1L << (CROSSINLINE - 67)) | (1L << (REIFIED - 67)) | (1L << (QUOTE_OPEN - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (TRIPLE_QUOTE_OPEN - 131)) | (1L << (RealLiteral - 131)) | (1L << (LongLiteral - 131)) | (1L << (IntegerLiteral - 131)) | (1L << (HexLiteral - 131)) | (1L << (BinLiteral - 131)) | (1L << (BooleanLiteral - 131)) | (1L << (NullLiteral - 131)) | (1L << (Identifier - 131)) | (1L << (LabelReference - 131)) | (1L << (LabelDefinition - 131)) | (1L << (CharacterLiteral - 131)))) != 0)) {
				{
				setState(1819);
				valueArgument();
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1820);
					match(COMMA);
					setState(1821);
					valueArgument();
					}
					}
					setState(1826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1829);
			match(RPAREN);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public List<TypeProjectionContext> typeProjection() {
			return getRuleContexts(TypeProjectionContext.class);
		}
		public TypeProjectionContext typeProjection(int i) {
			return getRuleContext(TypeProjectionContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(LANGLE);
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1832);
				match(NL);
				}
				}
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1838);
			typeProjection();
			setState(1849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1839);
						match(NL);
						}
						}
						setState(1844);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1845);
					match(COMMA);
					setState(1846);
					typeProjection();
					}
					} 
				}
				setState(1851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			}
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1852);
				match(NL);
				}
				}
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1858);
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

	public static class TypeProjectionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeProjectionModifierListContext typeProjectionModifierList() {
			return getRuleContext(TypeProjectionModifierListContext.class,0);
		}
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TypeProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeProjectionContext typeProjection() throws RecognitionException {
		TypeProjectionContext _localctx = new TypeProjectionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeProjection);
		try {
			setState(1865);
			switch (_input.LA(1)) {
			case LPAREN:
			case AT:
			case FILE:
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
			case LabelReference:
				enterOuterAlt(_localctx, 1);
				{
				setState(1861);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(1860);
					typeProjectionModifierList();
					}
					break;
				}
				setState(1863);
				type();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1864);
				match(MULT);
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

	public static class TypeProjectionModifierListContext extends ParserRuleContext {
		public List<VarianceAnnotationContext> varianceAnnotation() {
			return getRuleContexts(VarianceAnnotationContext.class);
		}
		public VarianceAnnotationContext varianceAnnotation(int i) {
			return getRuleContext(VarianceAnnotationContext.class,i);
		}
		public TypeProjectionModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProjectionModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeProjectionModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeProjectionModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeProjectionModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeProjectionModifierListContext typeProjectionModifierList() throws RecognitionException {
		TypeProjectionModifierListContext _localctx = new TypeProjectionModifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeProjectionModifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1868); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1867);
					varianceAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1870); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ValueArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ValueArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitValueArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentContext valueArgument() throws RecognitionException {
		ValueArgumentContext _localctx = new ValueArgumentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(1872);
				simpleIdentifier();
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1873);
					match(NL);
					}
					}
					setState(1878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1879);
				match(ASSIGNMENT);
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1880);
						match(NL);
						}
						} 
					}
					setState(1885);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				}
				}
				break;
			}
			setState(1889);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(1888);
				match(MULT);
				}
			}

			setState(1894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1891);
					match(NL);
					}
					} 
				}
				setState(1896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			}
			setState(1897);
			expression();
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(KotlinParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(KotlinParser.IntegerLiteral, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(KotlinParser.HexLiteral, 0); }
		public TerminalNode BinLiteral() { return getToken(KotlinParser.BinLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(KotlinParser.CharacterLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(KotlinParser.RealLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(KotlinParser.NullLiteral, 0); }
		public TerminalNode LongLiteral() { return getToken(KotlinParser.LongLiteral, 0); }
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_literalConstant);
		try {
			setState(1908);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1899);
				match(BooleanLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				match(IntegerLiteral);
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1901);
				stringLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1902);
				match(HexLiteral);
				}
				break;
			case BinLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1903);
				match(BinLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1904);
				match(CharacterLiteral);
				}
				break;
			case RealLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(1905);
				match(RealLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(1906);
				match(NullLiteral);
				}
				break;
			case LongLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(1907);
				match(LongLiteral);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_stringLiteral);
		try {
			setState(1912);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				multiLineStringLiteral();
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

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(KotlinParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(KotlinParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public List<LineStringExpressionContext> lineStringExpression() {
			return getRuleContexts(LineStringExpressionContext.class);
		}
		public LineStringExpressionContext lineStringExpression(int i) {
			return getRuleContext(LineStringExpressionContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(QUOTE_OPEN);
			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (LineStrRef - 157)) | (1L << (LineStrText - 157)) | (1L << (LineStrEscapedChar - 157)) | (1L << (LineStrExprStart - 157)))) != 0)) {
				{
				setState(1917);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(1915);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(1916);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1922);
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

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(KotlinParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(KotlinParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<MultiLineStringExpressionContext> multiLineStringExpression() {
			return getRuleContexts(MultiLineStringExpressionContext.class);
		}
		public MultiLineStringExpressionContext multiLineStringExpression(int i) {
			return getRuleContext(MultiLineStringExpressionContext.class,i);
		}
		public List<LineStringLiteralContext> lineStringLiteral() {
			return getRuleContexts(LineStringLiteralContext.class);
		}
		public LineStringLiteralContext lineStringLiteral(int i) {
			return getRuleContext(LineStringLiteralContext.class,i);
		}
		public List<TerminalNode> MultiLineStringQuote() { return getTokens(KotlinParser.MultiLineStringQuote); }
		public TerminalNode MultiLineStringQuote(int i) {
			return getToken(KotlinParser.MultiLineStringQuote, i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiLineStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiLineStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			match(TRIPLE_QUOTE_OPEN);
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (QUOTE_OPEN - 130)) | (1L << (MultiLineStringQuote - 130)) | (1L << (MultiLineStrRef - 130)) | (1L << (MultiLineStrText - 130)) | (1L << (MultiLineStrEscapedChar - 130)) | (1L << (MultiLineStrExprStart - 130)))) != 0)) {
				{
				setState(1929);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(1925);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(1926);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(1927);
					lineStringLiteral();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(1928);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1934);
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

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(KotlinParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(KotlinParser.LineStrEscapedChar, 0); }
		public TerminalNode LineStrRef() { return getToken(KotlinParser.LineStrRef, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (LineStrRef - 157)) | (1L << (LineStrText - 157)) | (1L << (LineStrEscapedChar - 157)))) != 0)) ) {
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

	public static class LineStringExpressionContext extends ParserRuleContext {
		public TerminalNode LineStrExprStart() { return getToken(KotlinParser.LineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public LineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLineStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLineStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStringExpressionContext lineStringExpression() throws RecognitionException {
		LineStringExpressionContext _localctx = new LineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			match(LineStrExprStart);
			setState(1939);
			expression();
			setState(1940);
			match(RCURL);
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
		public TerminalNode MultiLineStrText() { return getToken(KotlinParser.MultiLineStrText, 0); }
		public TerminalNode MultiLineStrEscapedChar() { return getToken(KotlinParser.MultiLineStrEscapedChar, 0); }
		public TerminalNode MultiLineStrRef() { return getToken(KotlinParser.MultiLineStrRef, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiLineStringContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiLineStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (MultiLineStrRef - 163)) | (1L << (MultiLineStrText - 163)) | (1L << (MultiLineStrEscapedChar - 163)))) != 0)) ) {
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

	public static class MultiLineStringExpressionContext extends ParserRuleContext {
		public TerminalNode MultiLineStrExprStart() { return getToken(KotlinParser.MultiLineStrExprStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public MultiLineStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiLineStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiLineStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiLineStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLineStringExpressionContext multiLineStringExpression() throws RecognitionException {
		MultiLineStringExpressionContext _localctx = new MultiLineStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(MultiLineStrExprStart);
			setState(1945);
			expression();
			setState(1946);
			match(RCURL);
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

	public static class FunctionLiteralContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (FIELD - 94)) | (1L << (PROPERTY - 94)) | (1L << (GET - 94)) | (1L << (SET - 94)) | (1L << (RECEIVER - 94)) | (1L << (PARAM - 94)) | (1L << (SETPARAM - 94)) | (1L << (DELEGATE - 94)) | (1L << (LabelReference - 94)))) != 0)) {
				{
				{
				setState(1948);
				annotations();
				}
				}
				setState(1953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2000);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(1954);
				match(LCURL);
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1955);
						match(NL);
						}
						} 
					}
					setState(1960);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
				}
				setState(1961);
				statements();
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1962);
					match(NL);
					}
					}
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1968);
				match(RCURL);
				}
				break;
			case 2:
				{
				setState(1970);
				match(LCURL);
				setState(1974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1971);
						match(NL);
						}
						} 
					}
					setState(1976);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				}
				setState(1977);
				lambdaParameters();
				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1978);
					match(NL);
					}
					}
					setState(1983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1984);
				match(ARROW);
				setState(1988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1985);
						match(NL);
						}
						} 
					}
					setState(1990);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				}
				setState(1991);
				statements();
				setState(1995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1992);
					match(NL);
					}
					}
					setState(1997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1998);
				match(RCURL);
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<LambdaParameterContext> lambdaParameter() {
			return getRuleContexts(LambdaParameterContext.class);
		}
		public LambdaParameterContext lambdaParameter(int i) {
			return getRuleContext(LambdaParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==IMPORT || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CONSTRUCTOR - 67)) | (1L << (BY - 67)) | (1L << (COMPANION - 67)) | (1L << (INIT - 67)) | (1L << (WHERE - 67)) | (1L << (CATCH - 67)) | (1L << (FINALLY - 67)) | (1L << (OUT - 67)) | (1L << (GETTER - 67)) | (1L << (SETTER - 67)) | (1L << (DYNAMIC - 67)) | (1L << (PUBLIC - 67)) | (1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (INTERNAL - 67)) | (1L << (ENUM - 67)) | (1L << (SEALED - 67)) | (1L << (ANNOTATION - 67)) | (1L << (DATA - 67)) | (1L << (INNER - 67)) | (1L << (TAILREC - 67)) | (1L << (OPERATOR - 67)) | (1L << (INLINE - 67)) | (1L << (INFIX - 67)) | (1L << (EXTERNAL - 67)) | (1L << (SUSPEND - 67)) | (1L << (OVERRIDE - 67)) | (1L << (ABSTRACT - 67)) | (1L << (FINAL - 67)) | (1L << (OPEN - 67)) | (1L << (CONST - 67)) | (1L << (LATEINIT - 67)) | (1L << (VARARG - 67)) | (1L << (NOINLINE - 67)) | (1L << (CROSSINLINE - 67)) | (1L << (REIFIED - 67)))) != 0) || _la==Identifier) {
				{
				setState(2002);
				lambdaParameter();
				}
			}

			setState(2021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2008);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2005);
						match(NL);
						}
						}
						setState(2010);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2011);
					match(COMMA);
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2012);
						match(NL);
						}
						}
						setState(2017);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2018);
					lambdaParameter();
					}
					} 
				}
				setState(2023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
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

	public static class LambdaParameterContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public LambdaParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLambdaParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLambdaParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLambdaParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParameterContext lambdaParameter() throws RecognitionException {
		LambdaParameterContext _localctx = new LambdaParameterContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lambdaParameter);
		int _la;
		try {
			setState(2042);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				variableDeclaration();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				multiVariableDeclaration();
				setState(2040);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2029);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2026);
						match(NL);
						}
						}
						setState(2031);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2032);
					match(COLON);
					setState(2036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2033);
						match(NL);
						}
						}
						setState(2038);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2039);
					type();
					}
					break;
				}
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(KotlinParser.OBJECT, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public DelegationSpecifiersContext delegationSpecifiers() {
			return getRuleContext(DelegationSpecifiersContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			match(OBJECT);
			setState(2059);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2045);
					match(NL);
					}
					}
					setState(2050);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2051);
				match(COLON);
				setState(2055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2052);
					match(NL);
					}
					}
					setState(2057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2058);
				delegationSpecifiers();
				}
				break;
			}
			setState(2064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2061);
				match(NL);
				}
				}
				setState(2066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2067);
			classBody();
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

	public static class CollectionLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public CollectionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCollectionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCollectionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionLiteralContext collectionLiteral() throws RecognitionException {
		CollectionLiteralContext _localctx = new CollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_collectionLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(LSQUARE);
			setState(2071);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CONSTRUCTOR - 67)) | (1L << (BY - 67)) | (1L << (COMPANION - 67)) | (1L << (INIT - 67)) | (1L << (THIS - 67)) | (1L << (SUPER - 67)) | (1L << (WHERE - 67)) | (1L << (IF - 67)) | (1L << (WHEN - 67)) | (1L << (TRY - 67)) | (1L << (CATCH - 67)) | (1L << (FINALLY - 67)) | (1L << (FOR - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (THROW - 67)) | (1L << (RETURN - 67)) | (1L << (CONTINUE - 67)) | (1L << (BREAK - 67)) | (1L << (OUT - 67)) | (1L << (FIELD - 67)) | (1L << (PROPERTY - 67)) | (1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (GETTER - 67)) | (1L << (SETTER - 67)) | (1L << (RECEIVER - 67)) | (1L << (PARAM - 67)) | (1L << (SETPARAM - 67)) | (1L << (DELEGATE - 67)) | (1L << (DYNAMIC - 67)) | (1L << (PUBLIC - 67)) | (1L << (PRIVATE - 67)) | (1L << (PROTECTED - 67)) | (1L << (INTERNAL - 67)) | (1L << (ENUM - 67)) | (1L << (SEALED - 67)) | (1L << (ANNOTATION - 67)) | (1L << (DATA - 67)) | (1L << (INNER - 67)) | (1L << (TAILREC - 67)) | (1L << (OPERATOR - 67)) | (1L << (INLINE - 67)) | (1L << (INFIX - 67)) | (1L << (EXTERNAL - 67)) | (1L << (SUSPEND - 67)) | (1L << (OVERRIDE - 67)) | (1L << (ABSTRACT - 67)) | (1L << (FINAL - 67)) | (1L << (OPEN - 67)) | (1L << (CONST - 67)) | (1L << (LATEINIT - 67)) | (1L << (VARARG - 67)) | (1L << (NOINLINE - 67)) | (1L << (CROSSINLINE - 67)) | (1L << (REIFIED - 67)) | (1L << (QUOTE_OPEN - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (TRIPLE_QUOTE_OPEN - 131)) | (1L << (RealLiteral - 131)) | (1L << (LongLiteral - 131)) | (1L << (IntegerLiteral - 131)) | (1L << (HexLiteral - 131)) | (1L << (BinLiteral - 131)) | (1L << (BooleanLiteral - 131)) | (1L << (NullLiteral - 131)) | (1L << (Identifier - 131)) | (1L << (LabelReference - 131)) | (1L << (LabelDefinition - 131)) | (1L << (CharacterLiteral - 131)))) != 0)) {
				{
				setState(2070);
				expression();
				}
			}

			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2073);
				match(COMMA);
				setState(2074);
				expression();
				}
				}
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2080);
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

	public static class ThisExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(KotlinParser.THIS, 0); }
		public TerminalNode LabelReference() { return getToken(KotlinParser.LabelReference, 0); }
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			match(THIS);
			setState(2084);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2083);
				match(LabelReference);
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

	public static class SuperExpressionContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(KotlinParser.SUPER, 0); }
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public TerminalNode LabelReference() { return getToken(KotlinParser.LabelReference, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SuperExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperExpressionContext superExpression() throws RecognitionException {
		SuperExpressionContext _localctx = new SuperExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			match(SUPER);
			setState(2103);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2087);
				match(LANGLE);
				setState(2091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2088);
					match(NL);
					}
					}
					setState(2093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2094);
				type();
				setState(2098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2095);
					match(NL);
					}
					}
					setState(2100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2101);
				match(RANGLE);
				}
				break;
			}
			setState(2106);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2105);
				match(LabelReference);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhenExpressionContext whenExpression() {
			return getRuleContext(WhenExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_conditionalExpression);
		try {
			setState(2110);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				ifExpression();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				whenExpression();
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KotlinParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<ControlStructureBodyContext> controlStructureBody() {
			return getRuleContexts(ControlStructureBodyContext.class);
		}
		public ControlStructureBodyContext controlStructureBody(int i) {
			return getRuleContext(ControlStructureBodyContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
			match(IF);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2113);
				match(NL);
				}
				}
				setState(2118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2119);
			match(LPAREN);
			setState(2120);
			expression();
			setState(2121);
			match(RPAREN);
			setState(2125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2122);
					match(NL);
					}
					} 
				}
				setState(2127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2129);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2128);
				controlStructureBody();
				}
				break;
			}
			setState(2132);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2131);
				match(SEMICOLON);
				}
				break;
			}
			setState(2150);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2134);
					match(NL);
					}
					}
					setState(2139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2140);
				match(ELSE);
				setState(2144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2141);
						match(NL);
						}
						} 
					}
					setState(2146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				}
				setState(2148);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2147);
					controlStructureBody();
					}
					break;
				}
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

	public static class ControlStructureBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlStructureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterControlStructureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitControlStructureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitControlStructureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStructureBodyContext controlStructureBody() throws RecognitionException {
		ControlStructureBodyContext _localctx = new ControlStructureBodyContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_controlStructureBody);
		try {
			setState(2154);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2152);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				expression();
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

	public static class WhenExpressionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KotlinParser.WHEN, 0); }
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
		}
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_whenExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			match(WHEN);
			setState(2160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2157);
					match(NL);
					}
					} 
				}
				setState(2162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			setState(2167);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2163);
				match(LPAREN);
				setState(2164);
				expression();
				setState(2165);
				match(RPAREN);
				}
			}

			setState(2172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2169);
				match(NL);
				}
				}
				setState(2174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2175);
			match(LCURL);
			setState(2179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2176);
					match(NL);
					}
					} 
				}
				setState(2181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			}
			setState(2191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2182);
					whenEntry();
					setState(2186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2183);
							match(NL);
							}
							} 
						}
						setState(2188);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
					}
					}
					} 
				}
				setState(2193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			setState(2197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2194);
				match(NL);
				}
				}
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2200);
			match(RCURL);
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

	public static class WhenEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(KotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KotlinParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public WhenEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhenEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenEntryContext whenEntry() throws RecognitionException {
		WhenEntryContext _localctx = new WhenEntryContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_whenEntry);
		int _la;
		try {
			int _alt;
			setState(2254);
			switch (_input.LA(1)) {
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case OBJECT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case IS:
			case IN:
			case NOT_IS:
			case NOT_IN:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				whenCondition();
				setState(2219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2206);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2203);
							match(NL);
							}
							}
							setState(2208);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2209);
						match(COMMA);
						setState(2213);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2210);
								match(NL);
								}
								} 
							}
							setState(2215);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
						}
						setState(2216);
						whenCondition();
						}
						} 
					}
					setState(2221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
				}
				setState(2225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2222);
					match(NL);
					}
					}
					setState(2227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2228);
				match(ARROW);
				setState(2232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2229);
						match(NL);
						}
						} 
					}
					setState(2234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
				}
				setState(2235);
				controlStructureBody();
				setState(2237);
				switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
				case 1:
					{
					setState(2236);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239);
				match(ELSE);
				setState(2243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2240);
					match(NL);
					}
					}
					setState(2245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2246);
				match(ARROW);
				setState(2250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2247);
						match(NL);
						}
						} 
					}
					setState(2252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				}
				setState(2253);
				controlStructureBody();
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

	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeTestContext rangeTest() {
			return getRuleContext(RangeTestContext.class,0);
		}
		public TypeTestContext typeTest() {
			return getRuleContext(TypeTestContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_whenCondition);
		try {
			setState(2259);
			switch (_input.LA(1)) {
			case NL:
			case LPAREN:
			case LSQUARE:
			case LCURL:
			case ADD:
			case SUB:
			case INCR:
			case DECR:
			case EXCL:
			case COLONCOLON:
			case Q_COLONCOLON:
			case AT:
			case RETURN_AT:
			case CONTINUE_AT:
			case BREAK_AT:
			case FILE:
			case IMPORT:
			case OBJECT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case THIS:
			case SUPER:
			case WHERE:
			case IF:
			case WHEN:
			case TRY:
			case CATCH:
			case FINALLY:
			case FOR:
			case DO:
			case WHILE:
			case THROW:
			case RETURN:
			case CONTINUE:
			case BREAK:
			case OUT:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case GETTER:
			case SETTER:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
			case RealLiteral:
			case LongLiteral:
			case IntegerLiteral:
			case HexLiteral:
			case BinLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case Identifier:
			case LabelReference:
			case LabelDefinition:
			case CharacterLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2256);
				expression();
				}
				break;
			case IN:
			case NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2257);
				rangeTest();
				}
				break;
			case IS:
			case NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2258);
				typeTest();
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

	public static class RangeTestContext extends ParserRuleContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public RangeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterRangeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitRangeTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitRangeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTestContext rangeTest() throws RecognitionException {
		RangeTestContext _localctx = new RangeTestContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_rangeTest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			inOperator();
			setState(2265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2262);
					match(NL);
					}
					} 
				}
				setState(2267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			}
			setState(2268);
			expression();
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

	public static class TypeTestContext extends ParserRuleContext {
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTestContext typeTest() throws RecognitionException {
		TypeTestContext _localctx = new TypeTestContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_typeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			isOperator();
			setState(2274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2271);
				match(NL);
				}
				}
				setState(2276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2277);
			type();
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

	public static class TryExpressionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(KotlinParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			match(TRY);
			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2280);
				match(NL);
				}
				}
				setState(2285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2286);
			block();
			setState(2296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2287);
						match(NL);
						}
						}
						setState(2292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2293);
					catchBlock();
					}
					} 
				}
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			setState(2306);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				{
				setState(2302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2299);
					match(NL);
					}
					}
					setState(2304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2305);
				finallyBlock();
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

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(KotlinParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public SimpleIdentifierContext simpleIdentifier() {
			return getRuleContext(SimpleIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(CATCH);
			setState(2312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2309);
				match(NL);
				}
				}
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2315);
			match(LPAREN);
			setState(2319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (FIELD - 94)) | (1L << (PROPERTY - 94)) | (1L << (GET - 94)) | (1L << (SET - 94)) | (1L << (RECEIVER - 94)) | (1L << (PARAM - 94)) | (1L << (SETPARAM - 94)) | (1L << (DELEGATE - 94)) | (1L << (LabelReference - 94)))) != 0)) {
				{
				{
				setState(2316);
				annotations();
				}
				}
				setState(2321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2322);
			simpleIdentifier();
			setState(2323);
			match(COLON);
			setState(2324);
			userType();
			setState(2325);
			match(RPAREN);
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2326);
				match(NL);
				}
				}
				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2332);
			block();
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(KotlinParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			match(FINALLY);
			setState(2338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2335);
				match(NL);
				}
				}
				setState(2340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2341);
			block();
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public DoWhileExpressionContext doWhileExpression() {
			return getRuleContext(DoWhileExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_loopExpression);
		try {
			setState(2346);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2343);
				forExpression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2344);
				whileExpression();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(2345);
				doWhileExpression();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KotlinParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MultiVariableDeclarationContext multiVariableDeclaration() {
			return getRuleContext(MultiVariableDeclarationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_forExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			match(FOR);
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2349);
				match(NL);
				}
				}
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2355);
			match(LPAREN);
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (FIELD - 94)) | (1L << (PROPERTY - 94)) | (1L << (GET - 94)) | (1L << (SET - 94)) | (1L << (RECEIVER - 94)) | (1L << (PARAM - 94)) | (1L << (SETPARAM - 94)) | (1L << (DELEGATE - 94)) | (1L << (LabelReference - 94)))) != 0)) {
				{
				{
				setState(2356);
				annotations();
				}
				}
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2364);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(2362);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2363);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2366);
			match(IN);
			setState(2367);
			expression();
			setState(2368);
			match(RPAREN);
			setState(2372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2369);
					match(NL);
					}
					} 
				}
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			}
			setState(2376);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2375);
				controlStructureBody();
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

	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhileExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhileExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_whileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			match(WHILE);
			setState(2382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2379);
				match(NL);
				}
				}
				setState(2384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2385);
			match(LPAREN);
			setState(2386);
			expression();
			setState(2387);
			match(RPAREN);
			setState(2391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2388);
					match(NL);
					}
					} 
				}
				setState(2393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			}
			setState(2395);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2394);
				controlStructureBody();
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

	public static class DoWhileExpressionContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KotlinParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public DoWhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDoWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDoWhileExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDoWhileExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileExpressionContext doWhileExpression() throws RecognitionException {
		DoWhileExpressionContext _localctx = new DoWhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_doWhileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			match(DO);
			setState(2401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2398);
					match(NL);
					}
					} 
				}
				setState(2403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			setState(2405);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2404);
				controlStructureBody();
				}
				break;
			}
			setState(2410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2407);
				match(NL);
				}
				}
				setState(2412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2413);
			match(WHILE);
			setState(2417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2414);
				match(NL);
				}
				}
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2420);
			match(LPAREN);
			setState(2421);
			expression();
			setState(2422);
			match(RPAREN);
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

	public static class JumpExpressionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(KotlinParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode RETURN() { return getToken(KotlinParser.RETURN, 0); }
		public TerminalNode RETURN_AT() { return getToken(KotlinParser.RETURN_AT, 0); }
		public TerminalNode CONTINUE() { return getToken(KotlinParser.CONTINUE, 0); }
		public TerminalNode CONTINUE_AT() { return getToken(KotlinParser.CONTINUE_AT, 0); }
		public TerminalNode BREAK() { return getToken(KotlinParser.BREAK, 0); }
		public TerminalNode BREAK_AT() { return getToken(KotlinParser.BREAK_AT, 0); }
		public JumpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterJumpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitJumpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitJumpExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpExpressionContext jumpExpression() throws RecognitionException {
		JumpExpressionContext _localctx = new JumpExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_jumpExpression);
		int _la;
		try {
			int _alt;
			setState(2440);
			switch (_input.LA(1)) {
			case THROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2424);
				match(THROW);
				setState(2428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2425);
						match(NL);
						}
						} 
					}
					setState(2430);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
				}
				setState(2431);
				expression();
				}
				break;
			case RETURN_AT:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				_la = _input.LA(1);
				if ( !(_la==RETURN_AT || _la==RETURN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2434);
				switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
				case 1:
					{
					setState(2433);
					expression();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2436);
				match(CONTINUE);
				}
				break;
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2437);
				match(CONTINUE_AT);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2438);
				match(BREAK);
				}
				break;
			case BREAK_AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2439);
				match(BREAK_AT);
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

	public static class CallableReferenceContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(KotlinParser.COLONCOLON, 0); }
		public TerminalNode Q_COLONCOLON() { return getToken(KotlinParser.Q_COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> QUEST() { return getTokens(KotlinParser.QUEST); }
		public TerminalNode QUEST(int i) {
			return getToken(KotlinParser.QUEST, i);
		}
		public CallableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCallableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallableReferenceContext callableReference() throws RecognitionException {
		CallableReferenceContext _localctx = new CallableReferenceContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_callableReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0)) {
				{
				setState(2442);
				userType();
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUEST) {
					{
					{
					setState(2443);
					match(QUEST);
					setState(2447);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,370,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2444);
							match(NL);
							}
							} 
						}
						setState(2449);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,370,_ctx);
					}
					}
					}
					setState(2454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2457);
				match(NL);
				}
				}
				setState(2462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2463);
			_la = _input.LA(1);
			if ( !(_la==COLONCOLON || _la==Q_COLONCOLON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2464);
				match(NL);
				}
				}
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2472);
			switch (_input.LA(1)) {
			case IMPORT:
			case CONSTRUCTOR:
			case BY:
			case COMPANION:
			case INIT:
			case WHERE:
			case CATCH:
			case FINALLY:
			case OUT:
			case GETTER:
			case SETTER:
			case DYNAMIC:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case OVERRIDE:
			case ABSTRACT:
			case FINAL:
			case OPEN:
			case CONST:
			case LATEINIT:
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
			case REIFIED:
			case Identifier:
				{
				setState(2470);
				identifier();
				}
				break;
			case CLASS:
				{
				setState(2471);
				match(CLASS);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(KotlinParser.ASSIGNMENT, 0); }
		public TerminalNode ADD_ASSIGNMENT() { return getToken(KotlinParser.ADD_ASSIGNMENT, 0); }
		public TerminalNode SUB_ASSIGNMENT() { return getToken(KotlinParser.SUB_ASSIGNMENT, 0); }
		public TerminalNode MULT_ASSIGNMENT() { return getToken(KotlinParser.MULT_ASSIGNMENT, 0); }
		public TerminalNode DIV_ASSIGNMENT() { return getToken(KotlinParser.DIV_ASSIGNMENT, 0); }
		public TerminalNode MOD_ASSIGNMENT() { return getToken(KotlinParser.MOD_ASSIGNMENT, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << ADD_ASSIGNMENT) | (1L << SUB_ASSIGNMENT) | (1L << MULT_ASSIGNMENT) | (1L << DIV_ASSIGNMENT) | (1L << MOD_ASSIGNMENT))) != 0)) ) {
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

	public static class EqualityOperationContext extends ParserRuleContext {
		public TerminalNode EXCL_EQ() { return getToken(KotlinParser.EXCL_EQ, 0); }
		public TerminalNode EXCL_EQEQ() { return getToken(KotlinParser.EXCL_EQEQ, 0); }
		public TerminalNode EQEQ() { return getToken(KotlinParser.EQEQ, 0); }
		public TerminalNode EQEQEQ() { return getToken(KotlinParser.EQEQEQ, 0); }
		public EqualityOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEqualityOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperationContext equalityOperation() throws RecognitionException {
		EqualityOperationContext _localctx = new EqualityOperationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCL_EQ) | (1L << EXCL_EQEQ) | (1L << EQEQ) | (1L << EQEQEQ))) != 0)) ) {
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(KotlinParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(KotlinParser.RANGLE, 0); }
		public TerminalNode LE() { return getToken(KotlinParser.LE, 0); }
		public TerminalNode GE() { return getToken(KotlinParser.GE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE))) != 0)) ) {
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

	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public TerminalNode NOT_IN() { return getToken(KotlinParser.NOT_IN, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2480);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
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

	public static class IsOperatorContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(KotlinParser.IS, 0); }
		public TerminalNode NOT_IS() { return getToken(KotlinParser.NOT_IS, 0); }
		public IsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2484);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class MultiplicativeOperationContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KotlinParser.MOD, 0); }
		public MultiplicativeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiplicativeOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperationContext multiplicativeOperation() throws RecognitionException {
		MultiplicativeOperationContext _localctx = new MultiplicativeOperationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << DIV))) != 0)) ) {
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

	public static class TypeOperationContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(KotlinParser.AS, 0); }
		public TerminalNode AS_SAFE() { return getToken(KotlinParser.AS_SAFE, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOperationContext typeOperation() throws RecognitionException {
		TypeOperationContext _localctx = new TypeOperationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (COLON - 25)) | (1L << (AS_SAFE - 25)) | (1L << (AS - 25)))) != 0)) ) {
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

	public static class PrefixUnaryOperationContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(KotlinParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(KotlinParser.DECR, 0); }
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public TerminalNode EXCL() { return getToken(KotlinParser.EXCL, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public PrefixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrefixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryOperationContext prefixUnaryOperation() throws RecognitionException {
		PrefixUnaryOperationContext _localctx = new PrefixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_prefixUnaryOperation);
		try {
			setState(2497);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2490);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2491);
				match(DECR);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2492);
				match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2493);
				match(SUB);
				}
				break;
			case EXCL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2494);
				match(EXCL);
				}
				break;
			case AT:
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
			case LabelReference:
				enterOuterAlt(_localctx, 6);
				{
				setState(2495);
				annotations();
				}
				break;
			case LabelDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(2496);
				labelDefinition();
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

	public static class PostfixUnaryOperationContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(KotlinParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(KotlinParser.DECR, 0); }
		public List<TerminalNode> EXCL() { return getTokens(KotlinParser.EXCL); }
		public TerminalNode EXCL(int i) {
			return getToken(KotlinParser.EXCL, i);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MemberAccessOperatorContext memberAccessOperator() {
			return getRuleContext(MemberAccessOperatorContext.class,0);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public PostfixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPostfixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryOperationContext postfixUnaryOperation() throws RecognitionException {
		PostfixUnaryOperationContext _localctx = new PostfixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_postfixUnaryOperation);
		int _la;
		try {
			setState(2514);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2499);
				match(INCR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2500);
				match(DECR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2501);
				match(EXCL);
				setState(2502);
				match(EXCL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2503);
				callSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2504);
				arrayAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2505);
					match(NL);
					}
					}
					setState(2510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2511);
				memberAccessOperator();
				setState(2512);
				postfixUnaryExpression();
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

	public static class MemberAccessOperatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public TerminalNode QUEST() { return getToken(KotlinParser.QUEST, 0); }
		public MemberAccessOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberAccessOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberAccessOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMemberAccessOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessOperatorContext memberAccessOperator() throws RecognitionException {
		MemberAccessOperatorContext _localctx = new MemberAccessOperatorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_memberAccessOperator);
		try {
			setState(2519);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2516);
				match(DOT);
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(2517);
				match(QUEST);
				setState(2518);
				match(DOT);
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<AnnotationsContext> annotations() {
			return getRuleContexts(AnnotationsContext.class);
		}
		public AnnotationsContext annotations(int i) {
			return getRuleContext(AnnotationsContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_modifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2523); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2523);
					switch (_input.LA(1)) {
					case AT:
					case FILE:
					case FIELD:
					case PROPERTY:
					case GET:
					case SET:
					case RECEIVER:
					case PARAM:
					case SETPARAM:
					case DELEGATE:
					case LabelReference:
						{
						setState(2521);
						annotations();
						}
						break;
					case IN:
					case OUT:
					case PUBLIC:
					case PRIVATE:
					case PROTECTED:
					case INTERNAL:
					case ENUM:
					case SEALED:
					case ANNOTATION:
					case DATA:
					case INNER:
					case TAILREC:
					case OPERATOR:
					case INLINE:
					case INFIX:
					case EXTERNAL:
					case SUSPEND:
					case OVERRIDE:
					case ABSTRACT:
					case FINAL:
					case OPEN:
					case CONST:
					case LATEINIT:
					case VARARG:
					case NOINLINE:
					case CROSSINLINE:
					case REIFIED:
						{
						setState(2522);
						modifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2525); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
		}
		public InheritanceModifierContext inheritanceModifier() {
			return getRuleContext(InheritanceModifierContext.class,0);
		}
		public ParameterModifierContext parameterModifier() {
			return getRuleContext(ParameterModifierContext.class,0);
		}
		public TypeParameterModifierContext typeParameterModifier() {
			return getRuleContext(TypeParameterModifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_modifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			switch (_input.LA(1)) {
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
				{
				setState(2527);
				classModifier();
				}
				break;
			case OVERRIDE:
			case LATEINIT:
				{
				setState(2528);
				memberModifier();
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
				{
				setState(2529);
				visibilityModifier();
				}
				break;
			case IN:
			case OUT:
				{
				setState(2530);
				varianceAnnotation();
				}
				break;
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
				{
				setState(2531);
				functionModifier();
				}
				break;
			case CONST:
				{
				setState(2532);
				propertyModifier();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case OPEN:
				{
				setState(2533);
				inheritanceModifier();
				}
				break;
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
				{
				setState(2534);
				parameterModifier();
				}
				break;
			case REIFIED:
				{
				setState(2535);
				typeParameterModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2538);
					match(NL);
					}
					} 
				}
				setState(2543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(KotlinParser.ENUM, 0); }
		public TerminalNode SEALED() { return getToken(KotlinParser.SEALED, 0); }
		public TerminalNode ANNOTATION() { return getToken(KotlinParser.ANNOTATION, 0); }
		public TerminalNode DATA() { return getToken(KotlinParser.DATA, 0); }
		public TerminalNode INNER() { return getToken(KotlinParser.INNER, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ENUM - 109)) | (1L << (SEALED - 109)) | (1L << (ANNOTATION - 109)) | (1L << (DATA - 109)) | (1L << (INNER - 109)))) != 0)) ) {
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode LATEINIT() { return getToken(KotlinParser.LATEINIT, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			_la = _input.LA(1);
			if ( !(_la==OVERRIDE || _la==LATEINIT) ) {
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

	public static class VisibilityModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(KotlinParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(KotlinParser.PRIVATE, 0); }
		public TerminalNode INTERNAL() { return getToken(KotlinParser.INTERNAL, 0); }
		public TerminalNode PROTECTED() { return getToken(KotlinParser.PROTECTED, 0); }
		public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVisibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVisibilityModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitVisibilityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityModifierContext visibilityModifier() throws RecognitionException {
		VisibilityModifierContext _localctx = new VisibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (PUBLIC - 105)) | (1L << (PRIVATE - 105)) | (1L << (PROTECTED - 105)) | (1L << (INTERNAL - 105)))) != 0)) ) {
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

	public static class VarianceAnnotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(KotlinParser.IN, 0); }
		public TerminalNode OUT() { return getToken(KotlinParser.OUT, 0); }
		public VarianceAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianceAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVarianceAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVarianceAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitVarianceAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarianceAnnotationContext varianceAnnotation() throws RecognitionException {
		VarianceAnnotationContext _localctx = new VarianceAnnotationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
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

	public static class FunctionModifierContext extends ParserRuleContext {
		public TerminalNode TAILREC() { return getToken(KotlinParser.TAILREC, 0); }
		public TerminalNode OPERATOR() { return getToken(KotlinParser.OPERATOR, 0); }
		public TerminalNode INFIX() { return getToken(KotlinParser.INFIX, 0); }
		public TerminalNode INLINE() { return getToken(KotlinParser.INLINE, 0); }
		public TerminalNode EXTERNAL() { return getToken(KotlinParser.EXTERNAL, 0); }
		public TerminalNode SUSPEND() { return getToken(KotlinParser.SUSPEND, 0); }
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2552);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (TAILREC - 114)) | (1L << (OPERATOR - 114)) | (1L << (INLINE - 114)) | (1L << (INFIX - 114)) | (1L << (EXTERNAL - 114)) | (1L << (SUSPEND - 114)))) != 0)) ) {
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

	public static class PropertyModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(KotlinParser.CONST, 0); }
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPropertyModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			match(CONST);
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

	public static class InheritanceModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(KotlinParser.FINAL, 0); }
		public TerminalNode OPEN() { return getToken(KotlinParser.OPEN, 0); }
		public InheritanceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInheritanceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInheritanceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInheritanceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceModifierContext inheritanceModifier() throws RecognitionException {
		InheritanceModifierContext _localctx = new InheritanceModifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (ABSTRACT - 121)) | (1L << (FINAL - 121)) | (1L << (OPEN - 121)))) != 0)) ) {
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

	public static class ParameterModifierContext extends ParserRuleContext {
		public TerminalNode VARARG() { return getToken(KotlinParser.VARARG, 0); }
		public TerminalNode NOINLINE() { return getToken(KotlinParser.NOINLINE, 0); }
		public TerminalNode CROSSINLINE() { return getToken(KotlinParser.CROSSINLINE, 0); }
		public ParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterModifierContext parameterModifier() throws RecognitionException {
		ParameterModifierContext _localctx = new ParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_parameterModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2558);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (VARARG - 126)) | (1L << (NOINLINE - 126)) | (1L << (CROSSINLINE - 126)))) != 0)) ) {
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

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public TerminalNode REIFIED() { return getToken(KotlinParser.REIFIED, 0); }
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			match(REIFIED);
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public TerminalNode LabelDefinition() { return getToken(KotlinParser.LabelDefinition, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			match(LabelDefinition);
			setState(2566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2563);
					match(NL);
					}
					} 
				}
				setState(2568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				{
				setState(2569);
				annotation();
				}
				break;
			case 2:
				{
				setState(2570);
				annotationList();
				}
				break;
			}
			setState(2576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2573);
					match(NL);
					}
					} 
				}
				setState(2578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public UnescapedAnnotationContext unescapedAnnotation() {
			return getRuleContext(UnescapedAnnotationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode LabelReference() { return getToken(KotlinParser.LabelReference, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_annotation);
		int _la;
		try {
			setState(2614);
			switch (_input.LA(1)) {
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2579);
				annotationUseSiteTarget();
				setState(2583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2580);
					match(NL);
					}
					}
					setState(2585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2586);
				match(COLON);
				setState(2590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2587);
					match(NL);
					}
					}
					setState(2592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2593);
				unescapedAnnotation();
				}
				break;
			case LabelReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(2595);
				match(LabelReference);
				setState(2603);
				switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
				case 1:
					{
					setState(2599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2596);
						match(NL);
						}
						}
						setState(2601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2602);
					typeArguments();
					}
					break;
				}
				setState(2612);
				switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
				case 1:
					{
					setState(2608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2605);
						match(NL);
						}
						}
						setState(2610);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2611);
					valueArguments();
					}
					break;
				}
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

	public static class AnnotationListContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TerminalNode LSQUARE() { return getToken(KotlinParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(KotlinParser.RSQUARE, 0); }
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public TerminalNode AT() { return getToken(KotlinParser.AT, 0); }
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_annotationList);
		int _la;
		try {
			setState(2635);
			switch (_input.LA(1)) {
			case FILE:
			case FIELD:
			case PROPERTY:
			case GET:
			case SET:
			case RECEIVER:
			case PARAM:
			case SETPARAM:
			case DELEGATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2616);
				annotationUseSiteTarget();
				setState(2617);
				match(COLON);
				setState(2618);
				match(LSQUARE);
				setState(2620); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2619);
					unescapedAnnotation();
					}
					}
					setState(2622); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0) );
				setState(2624);
				match(RSQUARE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				match(AT);
				setState(2627);
				match(LSQUARE);
				setState(2629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2628);
					unescapedAnnotation();
					}
					}
					setState(2631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0) );
				setState(2633);
				match(RSQUARE);
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

	public static class AnnotationUseSiteTargetContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(KotlinParser.FIELD, 0); }
		public TerminalNode FILE() { return getToken(KotlinParser.FILE, 0); }
		public TerminalNode PROPERTY() { return getToken(KotlinParser.PROPERTY, 0); }
		public TerminalNode GET() { return getToken(KotlinParser.GET, 0); }
		public TerminalNode SET() { return getToken(KotlinParser.SET, 0); }
		public TerminalNode RECEIVER() { return getToken(KotlinParser.RECEIVER, 0); }
		public TerminalNode PARAM() { return getToken(KotlinParser.PARAM, 0); }
		public TerminalNode SETPARAM() { return getToken(KotlinParser.SETPARAM, 0); }
		public TerminalNode DELEGATE() { return getToken(KotlinParser.DELEGATE, 0); }
		public AnnotationUseSiteTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationUseSiteTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotationUseSiteTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotationUseSiteTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotationUseSiteTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationUseSiteTargetContext annotationUseSiteTarget() throws RecognitionException {
		AnnotationUseSiteTargetContext _localctx = new AnnotationUseSiteTargetContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2637);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (FILE - 57)) | (1L << (FIELD - 57)) | (1L << (PROPERTY - 57)) | (1L << (GET - 57)) | (1L << (SET - 57)) | (1L << (RECEIVER - 57)) | (1L << (PARAM - 57)) | (1L << (SETPARAM - 57)) | (1L << (DELEGATE - 57)))) != 0)) ) {
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

	public static class UnescapedAnnotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public UnescapedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUnescapedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUnescapedAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitUnescapedAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnescapedAnnotationContext unescapedAnnotation() throws RecognitionException {
		UnescapedAnnotationContext _localctx = new UnescapedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2639);
			identifier();
			setState(2641);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(2640);
				typeArguments();
				}
			}

			setState(2644);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(2643);
				valueArguments();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2646);
			simpleIdentifier();
			setState(2657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2647);
						match(NL);
						}
						}
						setState(2652);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2653);
					match(DOT);
					setState(2654);
					simpleIdentifier();
					}
					} 
				}
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
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
		public TerminalNode Identifier() { return getToken(KotlinParser.Identifier, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TerminalNode ANNOTATION() { return getToken(KotlinParser.ANNOTATION, 0); }
		public TerminalNode BY() { return getToken(KotlinParser.BY, 0); }
		public TerminalNode CATCH() { return getToken(KotlinParser.CATCH, 0); }
		public TerminalNode COMPANION() { return getToken(KotlinParser.COMPANION, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(KotlinParser.CONSTRUCTOR, 0); }
		public TerminalNode CROSSINLINE() { return getToken(KotlinParser.CROSSINLINE, 0); }
		public TerminalNode DATA() { return getToken(KotlinParser.DATA, 0); }
		public TerminalNode DYNAMIC() { return getToken(KotlinParser.DYNAMIC, 0); }
		public TerminalNode ENUM() { return getToken(KotlinParser.ENUM, 0); }
		public TerminalNode EXTERNAL() { return getToken(KotlinParser.EXTERNAL, 0); }
		public TerminalNode FINAL() { return getToken(KotlinParser.FINAL, 0); }
		public TerminalNode FINALLY() { return getToken(KotlinParser.FINALLY, 0); }
		public TerminalNode GETTER() { return getToken(KotlinParser.GETTER, 0); }
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public TerminalNode INFIX() { return getToken(KotlinParser.INFIX, 0); }
		public TerminalNode INIT() { return getToken(KotlinParser.INIT, 0); }
		public TerminalNode INLINE() { return getToken(KotlinParser.INLINE, 0); }
		public TerminalNode INNER() { return getToken(KotlinParser.INNER, 0); }
		public TerminalNode INTERNAL() { return getToken(KotlinParser.INTERNAL, 0); }
		public TerminalNode LATEINIT() { return getToken(KotlinParser.LATEINIT, 0); }
		public TerminalNode NOINLINE() { return getToken(KotlinParser.NOINLINE, 0); }
		public TerminalNode OPEN() { return getToken(KotlinParser.OPEN, 0); }
		public TerminalNode OPERATOR() { return getToken(KotlinParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(KotlinParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode PRIVATE() { return getToken(KotlinParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(KotlinParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(KotlinParser.PUBLIC, 0); }
		public TerminalNode REIFIED() { return getToken(KotlinParser.REIFIED, 0); }
		public TerminalNode SEALED() { return getToken(KotlinParser.SEALED, 0); }
		public TerminalNode TAILREC() { return getToken(KotlinParser.TAILREC, 0); }
		public TerminalNode SETTER() { return getToken(KotlinParser.SETTER, 0); }
		public TerminalNode VARARG() { return getToken(KotlinParser.VARARG, 0); }
		public TerminalNode WHERE() { return getToken(KotlinParser.WHERE, 0); }
		public TerminalNode CONST() { return getToken(KotlinParser.CONST, 0); }
		public TerminalNode SUSPEND() { return getToken(KotlinParser.SUSPEND, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSimpleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IMPORT - 59)) | (1L << (CONSTRUCTOR - 59)) | (1L << (BY - 59)) | (1L << (COMPANION - 59)) | (1L << (INIT - 59)) | (1L << (WHERE - 59)) | (1L << (CATCH - 59)) | (1L << (FINALLY - 59)) | (1L << (OUT - 59)) | (1L << (GETTER - 59)) | (1L << (SETTER - 59)) | (1L << (DYNAMIC - 59)) | (1L << (PUBLIC - 59)) | (1L << (PRIVATE - 59)) | (1L << (PROTECTED - 59)) | (1L << (INTERNAL - 59)) | (1L << (ENUM - 59)) | (1L << (SEALED - 59)) | (1L << (ANNOTATION - 59)) | (1L << (DATA - 59)) | (1L << (INNER - 59)) | (1L << (TAILREC - 59)) | (1L << (OPERATOR - 59)) | (1L << (INLINE - 59)) | (1L << (INFIX - 59)) | (1L << (EXTERNAL - 59)) | (1L << (SUSPEND - 59)) | (1L << (OVERRIDE - 59)) | (1L << (ABSTRACT - 59)) | (1L << (FINAL - 59)))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (OPEN - 123)) | (1L << (CONST - 123)) | (1L << (LATEINIT - 123)) | (1L << (VARARG - 123)) | (1L << (NOINLINE - 123)) | (1L << (CROSSINLINE - 123)) | (1L << (REIFIED - 123)) | (1L << (Identifier - 123)))) != 0)) ) {
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

	public static class SemiContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(2680);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2663); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2662);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2665); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2667);
					match(NL);
					}
					}
					setState(2672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2673);
				match(SEMICOLON);
				setState(2677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2674);
						match(NL);
						}
						} 
					}
					setState(2679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
				}
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

	public static class AnysemiContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(KotlinParser.NL, 0); }
		public TerminalNode SEMICOLON() { return getToken(KotlinParser.SEMICOLON, 0); }
		public AnysemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anysemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnysemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnysemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnysemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnysemiContext anysemi() throws RecognitionException {
		AnysemiContext _localctx = new AnysemiContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_anysemi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2682);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==SEMICOLON) ) {
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00ad\u0a7f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\3\2\7\2\u012c\n\2\f\2"+
		"\16\2\u012f\13\2\3\2\3\2\7\2\u0133\n\2\f\2\16\2\u0136\13\2\3\2\3\2\6\2"+
		"\u013a\n\2\r\2\16\2\u013b\3\2\5\2\u013f\n\2\7\2\u0141\n\2\f\2\16\2\u0144"+
		"\13\2\5\2\u0146\n\2\3\2\3\2\3\3\7\3\u014b\n\3\f\3\16\3\u014e\13\3\3\3"+
		"\3\3\7\3\u0152\n\3\f\3\16\3\u0155\13\3\3\3\3\3\6\3\u0159\n\3\r\3\16\3"+
		"\u015a\3\3\5\3\u015e\n\3\7\3\u0160\n\3\f\3\16\3\u0163\13\3\5\3\u0165\n"+
		"\3\3\3\3\3\3\4\5\4\u016a\n\4\3\4\3\4\3\4\3\5\6\5\u0170\n\5\r\5\16\5\u0171"+
		"\3\6\3\6\3\6\3\6\6\6\u0178\n\6\r\6\16\6\u0179\3\6\3\6\3\6\5\6\u017f\n"+
		"\6\3\6\5\6\u0182\n\6\6\6\u0184\n\6\r\6\16\6\u0185\3\7\5\7\u0189\n\7\3"+
		"\7\3\7\3\7\5\7\u018e\n\7\5\7\u0190\n\7\3\b\7\b\u0193\n\b\f\b\16\b\u0196"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u019d\n\t\3\t\5\t\u01a0\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u01aa\n\13\3\f\5\f\u01ad\n\f\3\f\3\f\7"+
		"\f\u01b1\n\f\f\f\16\f\u01b4\13\f\3\f\3\f\7\f\u01b8\n\f\f\f\16\f\u01bb"+
		"\13\f\3\f\5\f\u01be\n\f\3\f\7\f\u01c1\n\f\f\f\16\f\u01c4\13\f\3\f\5\f"+
		"\u01c7\n\f\3\f\7\f\u01ca\n\f\f\f\16\f\u01cd\13\f\3\f\3\f\7\f\u01d1\n\f"+
		"\f\f\16\f\u01d4\13\f\3\f\5\f\u01d7\n\f\3\f\7\f\u01da\n\f\f\f\16\f\u01dd"+
		"\13\f\3\f\5\f\u01e0\n\f\3\f\7\f\u01e3\n\f\f\f\16\f\u01e6\13\f\3\f\3\f"+
		"\7\f\u01ea\n\f\f\f\16\f\u01ed\13\f\3\f\5\f\u01f0\n\f\3\r\5\r\u01f3\n\r"+
		"\3\r\3\r\7\r\u01f7\n\r\f\r\16\r\u01fa\13\r\5\r\u01fc\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\7\16\u0204\n\16\f\16\16\16\u0207\13\16\5\16\u0209\n\16"+
		"\3\16\3\16\3\17\5\17\u020e\n\17\3\17\5\17\u0211\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0218\n\17\3\20\7\20\u021b\n\20\f\20\16\20\u021e\13\20\3"+
		"\20\3\20\7\20\u0222\n\20\f\20\16\20\u0225\13\20\3\20\3\20\7\20\u0229\n"+
		"\20\f\20\16\20\u022c\13\20\3\20\7\20\u022f\n\20\f\20\16\20\u0232\13\20"+
		"\3\21\3\21\3\21\5\21\u0237\n\21\3\22\3\22\3\22\3\23\3\23\7\23\u023e\n"+
		"\23\f\23\16\23\u0241\13\23\3\23\3\23\7\23\u0245\n\23\f\23\16\23\u0248"+
		"\13\23\3\23\3\23\3\24\3\24\7\24\u024e\n\24\f\24\16\24\u0251\13\24\3\24"+
		"\7\24\u0254\n\24\f\24\16\24\u0257\13\24\3\24\7\24\u025a\n\24\f\24\16\24"+
		"\u025d\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0269"+
		"\n\25\3\25\7\25\u026c\n\25\f\25\16\25\u026f\13\25\3\26\3\26\7\26\u0273"+
		"\n\26\f\26\16\26\u0276\13\26\3\26\3\26\3\27\5\27\u027b\n\27\3\27\3\27"+
		"\7\27\u027f\n\27\f\27\16\27\u0282\13\27\3\27\3\27\7\27\u0286\n\27\f\27"+
		"\16\27\u0289\13\27\3\27\3\27\7\27\u028d\n\27\f\27\16\27\u0290\13\27\3"+
		"\27\5\27\u0293\n\27\3\27\7\27\u0296\n\27\f\27\16\27\u0299\13\27\3\27\3"+
		"\27\3\30\3\30\7\30\u029f\n\30\f\30\16\30\u02a2\13\30\3\30\3\30\3\30\7"+
		"\30\u02a7\n\30\f\30\16\30\u02aa\13\30\3\30\5\30\u02ad\n\30\3\31\3\31\7"+
		"\31\u02b1\n\31\f\31\16\31\u02b4\13\31\3\31\5\31\u02b7\n\31\3\31\7\31\u02ba"+
		"\n\31\f\31\16\31\u02bd\13\31\3\31\3\31\7\31\u02c1\n\31\f\31\16\31\u02c4"+
		"\13\31\3\31\7\31\u02c7\n\31\f\31\16\31\u02ca\13\31\5\31\u02cc\n\31\3\31"+
		"\7\31\u02cf\n\31\f\31\16\31\u02d2\13\31\3\31\3\31\3\32\3\32\7\32\u02d8"+
		"\n\32\f\32\16\32\u02db\13\32\6\32\u02dd\n\32\r\32\16\32\u02de\3\32\5\32"+
		"\u02e2\n\32\3\33\3\33\7\33\u02e6\n\33\f\33\16\33\u02e9\13\33\3\33\5\33"+
		"\u02ec\n\33\3\33\7\33\u02ef\n\33\f\33\16\33\u02f2\13\33\3\33\5\33\u02f5"+
		"\n\33\3\33\7\33\u02f8\n\33\f\33\16\33\u02fb\13\33\3\33\5\33\u02fe\n\33"+
		"\3\34\5\34\u0301\n\34\3\34\3\34\7\34\u0305\n\34\f\34\16\34\u0308\13\34"+
		"\3\34\3\34\7\34\u030c\n\34\f\34\16\34\u030f\13\34\3\34\3\34\5\34\u0313"+
		"\n\34\3\34\7\34\u0316\n\34\f\34\16\34\u0319\13\34\3\34\5\34\u031c\n\34"+
		"\3\34\7\34\u031f\n\34\f\34\16\34\u0322\13\34\3\34\5\34\u0325\n\34\3\34"+
		"\7\34\u0328\n\34\f\34\16\34\u032b\13\34\3\34\3\34\5\34\u032f\n\34\3\34"+
		"\7\34\u0332\n\34\f\34\16\34\u0335\13\34\3\34\3\34\7\34\u0339\n\34\f\34"+
		"\16\34\u033c\13\34\3\34\3\34\7\34\u0340\n\34\f\34\16\34\u0343\13\34\3"+
		"\34\5\34\u0346\n\34\3\34\7\34\u0349\n\34\f\34\16\34\u034c\13\34\3\34\5"+
		"\34\u034f\n\34\3\34\7\34\u0352\n\34\f\34\16\34\u0355\13\34\3\34\5\34\u0358"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u035e\n\35\f\35\16\35\u0361\13\35\5\35"+
		"\u0363\n\35\3\35\3\35\3\36\5\36\u0368\n\36\3\36\3\36\3\36\5\36\u036d\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u0376\n \f \16 \u0379\13 \3 \5 \u037c"+
		"\n \3!\5!\u037f\n!\3!\3!\7!\u0383\n!\f!\16!\u0386\13!\3!\3!\7!\u038a\n"+
		"!\f!\16!\u038d\13!\3!\5!\u0390\n!\3!\7!\u0393\n!\f!\16!\u0396\13!\3!\3"+
		"!\7!\u039a\n!\f!\16!\u039d\13!\3!\5!\u03a0\n!\3!\7!\u03a3\n!\f!\16!\u03a6"+
		"\13!\3!\5!\u03a9\n!\3\"\5\"\u03ac\n\"\3\"\3\"\7\"\u03b0\n\"\f\"\16\"\u03b3"+
		"\13\"\3\"\5\"\u03b6\n\"\3\"\3\"\7\"\u03ba\n\"\f\"\16\"\u03bd\13\"\3\""+
		"\5\"\u03c0\n\"\3\"\7\"\u03c3\n\"\f\"\16\"\u03c6\13\"\3\"\3\"\7\"\u03ca"+
		"\n\"\f\"\16\"\u03cd\13\"\3\"\5\"\u03d0\n\"\3\"\7\"\u03d3\n\"\f\"\16\""+
		"\u03d6\13\"\3\"\5\"\u03d9\n\"\3#\5#\u03dc\n#\3#\3#\7#\u03e0\n#\f#\16#"+
		"\u03e3\13#\3#\5#\u03e6\n#\3#\7#\u03e9\n#\f#\16#\u03ec\13#\3#\3#\7#\u03f0"+
		"\n#\f#\16#\u03f3\13#\3#\3#\5#\u03f7\n#\3#\7#\u03fa\n#\f#\16#\u03fd\13"+
		"#\3#\3#\5#\u0401\n#\3#\7#\u0404\n#\f#\16#\u0407\13#\3#\5#\u040a\n#\3#"+
		"\7#\u040d\n#\f#\16#\u0410\13#\3#\3#\7#\u0414\n#\f#\16#\u0417\13#\3#\5"+
		"#\u041a\n#\3#\3#\3#\3#\5#\u0420\n#\3#\3#\3#\3#\5#\u0426\n#\5#\u0428\n"+
		"#\3$\3$\3$\3$\7$\u042e\n$\f$\16$\u0431\13$\3$\3$\3%\3%\3%\5%\u0438\n%"+
		"\3&\5&\u043b\n&\3&\3&\5&\u043f\n&\3&\3&\7&\u0443\n&\f&\16&\u0446\13&\3"+
		"&\3&\3&\7&\u044b\n&\f&\16&\u044e\13&\3&\3&\7&\u0452\n&\f&\16&\u0455\13"+
		"&\3&\5&\u0458\n&\3&\7&\u045b\n&\f&\16&\u045e\13&\3&\3&\3&\7&\u0463\n&"+
		"\f&\16&\u0466\13&\3&\5&\u0469\n&\5&\u046b\n&\3\'\5\'\u046e\n\'\3\'\3\'"+
		"\5\'\u0472\n\'\3\'\3\'\7\'\u0476\n\'\f\'\16\'\u0479\13\'\3\'\3\'\3\'\7"+
		"\'\u047e\n\'\f\'\16\'\u0481\13\'\3\'\3\'\5\'\u0485\n\'\3\'\3\'\7\'\u0489"+
		"\n\'\f\'\16\'\u048c\13\'\3\'\3\'\5\'\u0490\n\'\3(\5(\u0493\n(\3(\3(\7"+
		"(\u0497\n(\f(\16(\u049a\13(\3(\3(\7(\u049e\n(\f(\16(\u04a1\13(\3(\5(\u04a4"+
		"\n(\3(\7(\u04a7\n(\f(\16(\u04aa\13(\3(\3(\7(\u04ae\n(\f(\16(\u04b1\13"+
		"(\3(\3(\3)\3)\7)\u04b7\n)\f)\16)\u04ba\13)\3)\3)\7)\u04be\n)\f)\16)\u04c1"+
		"\13)\3)\3)\7)\u04c5\n)\f)\16)\u04c8\13)\3)\7)\u04cb\n)\f)\16)\u04ce\13"+
		")\3)\7)\u04d1\n)\f)\16)\u04d4\13)\3)\3)\3*\5*\u04d9\n*\3*\7*\u04dc\n*"+
		"\f*\16*\u04df\13*\3*\3*\7*\u04e3\n*\f*\16*\u04e6\13*\3*\3*\7*\u04ea\n"+
		"*\f*\16*\u04ed\13*\3*\3*\7*\u04f1\n*\f*\16*\u04f4\13*\5*\u04f6\n*\3+\5"+
		"+\u04f9\n+\3+\3+\3+\3+\5+\u04ff\n+\3,\3,\3,\7,\u0504\n,\f,\16,\u0507\13"+
		",\6,\u0509\n,\r,\16,\u050a\3-\3-\3-\3-\3.\3.\5.\u0513\n.\3.\7.\u0516\n"+
		".\f.\16.\u0519\13.\3.\6.\u051c\n.\r.\16.\u051d\3/\3/\3/\3/\3/\3/\5/\u0526"+
		"\n/\3/\7/\u0529\n/\f/\16/\u052c\13/\3/\3/\5/\u0530\n/\3/\5/\u0533\n/\3"+
		"\60\3\60\5\60\u0537\n\60\3\60\3\60\3\61\3\61\7\61\u053d\n\61\f\61\16\61"+
		"\u0540\13\61\3\61\3\61\7\61\u0544\n\61\f\61\16\61\u0547\13\61\5\61\u0549"+
		"\n\61\3\61\3\61\7\61\u054d\n\61\f\61\16\61\u0550\13\61\3\61\3\61\7\61"+
		"\u0554\n\61\f\61\16\61\u0557\13\61\3\61\3\61\3\62\3\62\3\62\5\62\u055e"+
		"\n\62\3\63\3\63\7\63\u0562\n\63\f\63\16\63\u0565\13\63\3\63\3\63\7\63"+
		"\u0569\n\63\f\63\16\63\u056c\13\63\3\63\7\63\u056f\n\63\f\63\16\63\u0572"+
		"\13\63\3\64\3\64\7\64\u0576\n\64\f\64\16\64\u0579\13\64\3\64\5\64\u057c"+
		"\n\64\3\65\3\65\3\65\5\65\u0581\n\65\3\65\5\65\u0584\n\65\3\66\3\66\3"+
		"\66\5\66\u0589\n\66\3\66\3\66\3\66\5\66\u058e\n\66\7\66\u0590\n\66\f\66"+
		"\16\66\u0593\13\66\3\66\3\66\3\67\3\67\7\67\u0599\n\67\f\67\16\67\u059c"+
		"\13\67\3\67\3\67\7\67\u05a0\n\67\f\67\16\67\u05a3\13\67\3\67\3\67\7\67"+
		"\u05a7\n\67\f\67\16\67\u05aa\13\67\3\67\7\67\u05ad\n\67\f\67\16\67\u05b0"+
		"\13\67\38\78\u05b3\n8\f8\168\u05b6\138\38\38\78\u05ba\n8\f8\168\u05bd"+
		"\138\38\38\78\u05c1\n8\f8\168\u05c4\138\38\38\39\39\39\39\3:\7:\u05cd"+
		"\n:\f:\16:\u05d0\13:\3:\3:\6:\u05d4\n:\r:\16:\u05d5\3:\5:\u05d9\n:\7:"+
		"\u05db\n:\f:\16:\u05de\13:\5:\u05e0\n:\3;\3;\5;\u05e4\n;\3<\7<\u05e7\n"+
		"<\f<\16<\u05ea\13<\3<\7<\u05ed\n<\f<\16<\u05f0\13<\3<\3<\3=\7=\u05f5\n"+
		"=\f=\16=\u05f8\13=\3=\3=\3=\3=\5=\u05fe\n=\3>\3>\3>\3>\7>\u0604\n>\f>"+
		"\16>\u0607\13>\3?\3?\7?\u060b\n?\f?\16?\u060e\13?\3?\3?\7?\u0612\n?\f"+
		"?\16?\u0615\13?\3?\7?\u0618\n?\f?\16?\u061b\13?\3@\3@\7@\u061f\n@\f@\16"+
		"@\u0622\13@\3@\3@\7@\u0626\n@\f@\16@\u0629\13@\3@\7@\u062c\n@\f@\16@\u062f"+
		"\13@\3A\3A\3A\7A\u0634\nA\fA\16A\u0637\13A\3A\3A\7A\u063b\nA\fA\16A\u063e"+
		"\13A\3B\3B\3B\7B\u0643\nB\fB\16B\u0646\13B\3B\3B\5B\u064a\nB\3C\3C\3C"+
		"\7C\u064f\nC\fC\16C\u0652\13C\3C\3C\6C\u0656\nC\rC\16C\u0657\3C\3C\7C"+
		"\u065c\nC\fC\16C\u065f\13C\3C\3C\5C\u0663\nC\3D\3D\7D\u0667\nD\fD\16D"+
		"\u066a\13D\3D\3D\7D\u066e\nD\fD\16D\u0671\13D\3D\7D\u0674\nD\fD\16D\u0677"+
		"\13D\3E\3E\3E\7E\u067c\nE\fE\16E\u067f\13E\3E\3E\7E\u0683\nE\fE\16E\u0686"+
		"\13E\3F\3F\3F\7F\u068b\nF\fF\16F\u068e\13F\3F\7F\u0691\nF\fF\16F\u0694"+
		"\13F\3G\3G\3G\7G\u0699\nG\fG\16G\u069c\13G\3G\3G\7G\u06a0\nG\fG\16G\u06a3"+
		"\13G\3H\3H\3H\7H\u06a8\nH\fH\16H\u06ab\13H\3H\3H\7H\u06af\nH\fH\16H\u06b2"+
		"\13H\3I\3I\7I\u06b6\nI\fI\16I\u06b9\13I\3I\3I\3I\7I\u06be\nI\fI\16I\u06c1"+
		"\13I\3J\7J\u06c4\nJ\fJ\16J\u06c7\13J\3J\3J\3K\3K\5K\u06cd\nK\3K\7K\u06d0"+
		"\nK\fK\16K\u06d3\13K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u06e1\nL\3"+
		"M\3M\3M\3M\3N\3N\5N\u06e9\nN\3N\7N\u06ec\nN\fN\16N\u06ef\13N\3N\3N\7N"+
		"\u06f3\nN\fN\16N\u06f6\13N\3N\6N\u06f9\nN\rN\16N\u06fa\5N\u06fd\nN\3O"+
		"\7O\u0700\nO\fO\16O\u0703\13O\3O\5O\u0706\nO\3O\7O\u0709\nO\fO\16O\u070c"+
		"\13O\3O\3O\3P\3P\3P\3P\7P\u0714\nP\fP\16P\u0717\13P\5P\u0719\nP\3P\3P"+
		"\3Q\3Q\3Q\3Q\7Q\u0721\nQ\fQ\16Q\u0724\13Q\5Q\u0726\nQ\3Q\3Q\3R\3R\7R\u072c"+
		"\nR\fR\16R\u072f\13R\3R\3R\7R\u0733\nR\fR\16R\u0736\13R\3R\3R\7R\u073a"+
		"\nR\fR\16R\u073d\13R\3R\7R\u0740\nR\fR\16R\u0743\13R\3R\3R\3S\5S\u0748"+
		"\nS\3S\3S\5S\u074c\nS\3T\6T\u074f\nT\rT\16T\u0750\3U\3U\7U\u0755\nU\f"+
		"U\16U\u0758\13U\3U\3U\7U\u075c\nU\fU\16U\u075f\13U\5U\u0761\nU\3U\5U\u0764"+
		"\nU\3U\7U\u0767\nU\fU\16U\u076a\13U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\5"+
		"V\u0777\nV\3W\3W\5W\u077b\nW\3X\3X\3X\7X\u0780\nX\fX\16X\u0783\13X\3X"+
		"\3X\3Y\3Y\3Y\3Y\3Y\7Y\u078c\nY\fY\16Y\u078f\13Y\3Y\3Y\3Z\3Z\3[\3[\3[\3"+
		"[\3\\\3\\\3]\3]\3]\3]\3^\7^\u07a0\n^\f^\16^\u07a3\13^\3^\3^\7^\u07a7\n"+
		"^\f^\16^\u07aa\13^\3^\3^\7^\u07ae\n^\f^\16^\u07b1\13^\3^\3^\3^\3^\7^\u07b7"+
		"\n^\f^\16^\u07ba\13^\3^\3^\7^\u07be\n^\f^\16^\u07c1\13^\3^\3^\7^\u07c5"+
		"\n^\f^\16^\u07c8\13^\3^\3^\7^\u07cc\n^\f^\16^\u07cf\13^\3^\3^\5^\u07d3"+
		"\n^\3_\5_\u07d6\n_\3_\7_\u07d9\n_\f_\16_\u07dc\13_\3_\3_\7_\u07e0\n_\f"+
		"_\16_\u07e3\13_\3_\7_\u07e6\n_\f_\16_\u07e9\13_\3`\3`\3`\7`\u07ee\n`\f"+
		"`\16`\u07f1\13`\3`\3`\7`\u07f5\n`\f`\16`\u07f8\13`\3`\5`\u07fb\n`\5`\u07fd"+
		"\n`\3a\3a\7a\u0801\na\fa\16a\u0804\13a\3a\3a\7a\u0808\na\fa\16a\u080b"+
		"\13a\3a\5a\u080e\na\3a\7a\u0811\na\fa\16a\u0814\13a\3a\3a\3b\3b\5b\u081a"+
		"\nb\3b\3b\7b\u081e\nb\fb\16b\u0821\13b\3b\3b\3c\3c\5c\u0827\nc\3d\3d\3"+
		"d\7d\u082c\nd\fd\16d\u082f\13d\3d\3d\7d\u0833\nd\fd\16d\u0836\13d\3d\3"+
		"d\5d\u083a\nd\3d\5d\u083d\nd\3e\3e\5e\u0841\ne\3f\3f\7f\u0845\nf\ff\16"+
		"f\u0848\13f\3f\3f\3f\3f\7f\u084e\nf\ff\16f\u0851\13f\3f\5f\u0854\nf\3"+
		"f\5f\u0857\nf\3f\7f\u085a\nf\ff\16f\u085d\13f\3f\3f\7f\u0861\nf\ff\16"+
		"f\u0864\13f\3f\5f\u0867\nf\5f\u0869\nf\3g\3g\5g\u086d\ng\3h\3h\7h\u0871"+
		"\nh\fh\16h\u0874\13h\3h\3h\3h\3h\5h\u087a\nh\3h\7h\u087d\nh\fh\16h\u0880"+
		"\13h\3h\3h\7h\u0884\nh\fh\16h\u0887\13h\3h\3h\7h\u088b\nh\fh\16h\u088e"+
		"\13h\7h\u0890\nh\fh\16h\u0893\13h\3h\7h\u0896\nh\fh\16h\u0899\13h\3h\3"+
		"h\3i\3i\7i\u089f\ni\fi\16i\u08a2\13i\3i\3i\7i\u08a6\ni\fi\16i\u08a9\13"+
		"i\3i\7i\u08ac\ni\fi\16i\u08af\13i\3i\7i\u08b2\ni\fi\16i\u08b5\13i\3i\3"+
		"i\7i\u08b9\ni\fi\16i\u08bc\13i\3i\3i\5i\u08c0\ni\3i\3i\7i\u08c4\ni\fi"+
		"\16i\u08c7\13i\3i\3i\7i\u08cb\ni\fi\16i\u08ce\13i\3i\5i\u08d1\ni\3j\3"+
		"j\3j\5j\u08d6\nj\3k\3k\7k\u08da\nk\fk\16k\u08dd\13k\3k\3k\3l\3l\7l\u08e3"+
		"\nl\fl\16l\u08e6\13l\3l\3l\3m\3m\7m\u08ec\nm\fm\16m\u08ef\13m\3m\3m\7"+
		"m\u08f3\nm\fm\16m\u08f6\13m\3m\7m\u08f9\nm\fm\16m\u08fc\13m\3m\7m\u08ff"+
		"\nm\fm\16m\u0902\13m\3m\5m\u0905\nm\3n\3n\7n\u0909\nn\fn\16n\u090c\13"+
		"n\3n\3n\7n\u0910\nn\fn\16n\u0913\13n\3n\3n\3n\3n\3n\7n\u091a\nn\fn\16"+
		"n\u091d\13n\3n\3n\3o\3o\7o\u0923\no\fo\16o\u0926\13o\3o\3o\3p\3p\3p\5"+
		"p\u092d\np\3q\3q\7q\u0931\nq\fq\16q\u0934\13q\3q\3q\7q\u0938\nq\fq\16"+
		"q\u093b\13q\3q\3q\5q\u093f\nq\3q\3q\3q\3q\7q\u0945\nq\fq\16q\u0948\13"+
		"q\3q\5q\u094b\nq\3r\3r\7r\u094f\nr\fr\16r\u0952\13r\3r\3r\3r\3r\7r\u0958"+
		"\nr\fr\16r\u095b\13r\3r\5r\u095e\nr\3s\3s\7s\u0962\ns\fs\16s\u0965\13"+
		"s\3s\5s\u0968\ns\3s\7s\u096b\ns\fs\16s\u096e\13s\3s\3s\7s\u0972\ns\fs"+
		"\16s\u0975\13s\3s\3s\3s\3s\3t\3t\7t\u097d\nt\ft\16t\u0980\13t\3t\3t\3"+
		"t\5t\u0985\nt\3t\3t\3t\3t\5t\u098b\nt\3u\3u\3u\7u\u0990\nu\fu\16u\u0993"+
		"\13u\7u\u0995\nu\fu\16u\u0998\13u\5u\u099a\nu\3u\7u\u099d\nu\fu\16u\u09a0"+
		"\13u\3u\3u\7u\u09a4\nu\fu\16u\u09a7\13u\3u\3u\5u\u09ab\nu\3v\3v\3w\3w"+
		"\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3~\3~\3~\3~\3~\5~\u09c4\n~"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u09cd\n\177\f\177\16"+
		"\177\u09d0\13\177\3\177\3\177\3\177\5\177\u09d5\n\177\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u09da\n\u0080\3\u0081\3\u0081\6\u0081\u09de\n\u0081\r"+
		"\u0081\16\u0081\u09df\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u09eb\n\u0082\3\u0082\7\u0082\u09ee\n"+
		"\u0082\f\u0082\16\u0082\u09f1\13\u0082\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\7\u008c\u0a07"+
		"\n\u008c\f\u008c\16\u008c\u0a0a\13\u008c\3\u008d\3\u008d\5\u008d\u0a0e"+
		"\n\u008d\3\u008d\7\u008d\u0a11\n\u008d\f\u008d\16\u008d\u0a14\13\u008d"+
		"\3\u008e\3\u008e\7\u008e\u0a18\n\u008e\f\u008e\16\u008e\u0a1b\13\u008e"+
		"\3\u008e\3\u008e\7\u008e\u0a1f\n\u008e\f\u008e\16\u008e\u0a22\13\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0a28\n\u008e\f\u008e\16\u008e"+
		"\u0a2b\13\u008e\3\u008e\5\u008e\u0a2e\n\u008e\3\u008e\7\u008e\u0a31\n"+
		"\u008e\f\u008e\16\u008e\u0a34\13\u008e\3\u008e\5\u008e\u0a37\n\u008e\5"+
		"\u008e\u0a39\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\6\u008f\u0a3f\n\u008f"+
		"\r\u008f\16\u008f\u0a40\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\6\u008f"+
		"\u0a48\n\u008f\r\u008f\16\u008f\u0a49\3\u008f\3\u008f\5\u008f\u0a4e\n"+
		"\u008f\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u0a54\n\u0091\3\u0091\5"+
		"\u0091\u0a57\n\u0091\3\u0092\3\u0092\7\u0092\u0a5b\n\u0092\f\u0092\16"+
		"\u0092\u0a5e\13\u0092\3\u0092\3\u0092\7\u0092\u0a62\n\u0092\f\u0092\16"+
		"\u0092\u0a65\13\u0092\3\u0093\3\u0093\3\u0094\6\u0094\u0a6a\n\u0094\r"+
		"\u0094\16\u0094\u0a6b\3\u0094\7\u0094\u0a6f\n\u0094\f\u0094\16\u0094\u0a72"+
		"\13\u0094\3\u0094\3\u0094\7\u0094\u0a76\n\u0094\f\u0094\16\u0094\u0a79"+
		"\13\u0094\5\u0094\u0a7b\n\u0094\3\u0095\3\u0095\3\u0095\2\2\u0096\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\2\33\3\2>?\3\2BC\4\2\35\35FF\3\2\u009f"+
		"\u00a1\3\2\u00a5\u00a7\4\288WW\3\2&\'\3\2\35\"\4\2\62\63\65\66\3\2.\61"+
		"\4\2\\\\^^\4\2[[]]\3\2\24\25\3\2\21\23\5\2\33\33\64\64ZZ\3\2os\4\2zz\177"+
		"\177\3\2kn\4\2\\\\__\3\2ty\3\2{}\3\2\u0080\u0082\5\2;;`cfi\n\2==EHLLQ"+
		"R__dej\u0083\u008f\u008f\4\2\7\7\34\34\u0bbe\2\u012d\3\2\2\2\4\u014c\3"+
		"\2\2\2\6\u0169\3\2\2\2\b\u016f\3\2\2\2\n\u0183\3\2\2\2\f\u018f\3\2\2\2"+
		"\16\u0194\3\2\2\2\20\u0197\3\2\2\2\22\u01a1\3\2\2\2\24\u01a9\3\2\2\2\26"+
		"\u01ac\3\2\2\2\30\u01f2\3\2\2\2\32\u01ff\3\2\2\2\34\u020d\3\2\2\2\36\u021c"+
		"\3\2\2\2 \u0236\3\2\2\2\"\u0238\3\2\2\2$\u023b\3\2\2\2&\u024b\3\2\2\2"+
		"(\u0268\3\2\2\2*\u0270\3\2\2\2,\u027a\3\2\2\2.\u02ac\3\2\2\2\60\u02ae"+
		"\3\2\2\2\62\u02dc\3\2\2\2\64\u02e3\3\2\2\2\66\u0300\3\2\2\28\u0359\3\2"+
		"\2\2:\u0367\3\2\2\2<\u036e\3\2\2\2>\u037b\3\2\2\2@\u037e\3\2\2\2B\u03ab"+
		"\3\2\2\2D\u03db\3\2\2\2F\u0429\3\2\2\2H\u0434\3\2\2\2J\u046a\3\2\2\2L"+
		"\u048f\3\2\2\2N\u0492\3\2\2\2P\u04b4\3\2\2\2R\u04d8\3\2\2\2T\u04f8\3\2"+
		"\2\2V\u0508\3\2\2\2X\u050c\3\2\2\2Z\u0512\3\2\2\2\\\u0532\3\2\2\2^\u0534"+
		"\3\2\2\2`\u0548\3\2\2\2b\u055d\3\2\2\2d\u055f\3\2\2\2f\u0573\3\2\2\2h"+
		"\u0583\3\2\2\2j\u0585\3\2\2\2l\u0596\3\2\2\2n\u05b4\3\2\2\2p\u05c7\3\2"+
		"\2\2r\u05ce\3\2\2\2t\u05e3\3\2\2\2v\u05e8\3\2\2\2x\u05f6\3\2\2\2z\u05ff"+
		"\3\2\2\2|\u0608\3\2\2\2~\u061c\3\2\2\2\u0080\u0630\3\2\2\2\u0082\u063f"+
		"\3\2\2\2\u0084\u064b\3\2\2\2\u0086\u0664\3\2\2\2\u0088\u0678\3\2\2\2\u008a"+
		"\u0687\3\2\2\2\u008c\u0695\3\2\2\2\u008e\u06a4\3\2\2\2\u0090\u06b3\3\2"+
		"\2\2\u0092\u06c5\3\2\2\2\u0094\u06cc\3\2\2\2\u0096\u06e0\3\2\2\2\u0098"+
		"\u06e2\3\2\2\2\u009a\u06fc\3\2\2\2\u009c\u0701\3\2\2\2\u009e\u070f\3\2"+
		"\2\2\u00a0\u071c\3\2\2\2\u00a2\u0729\3\2\2\2\u00a4\u074b\3\2\2\2\u00a6"+
		"\u074e\3\2\2\2\u00a8\u0760\3\2\2\2\u00aa\u0776\3\2\2\2\u00ac\u077a\3\2"+
		"\2\2\u00ae\u077c\3\2\2\2\u00b0\u0786\3\2\2\2\u00b2\u0792\3\2\2\2\u00b4"+
		"\u0794\3\2\2\2\u00b6\u0798\3\2\2\2\u00b8\u079a\3\2\2\2\u00ba\u07a1\3\2"+
		"\2\2\u00bc\u07d5\3\2\2\2\u00be\u07fc\3\2\2\2\u00c0\u07fe\3\2\2\2\u00c2"+
		"\u0817\3\2\2\2\u00c4\u0824\3\2\2\2\u00c6\u0828\3\2\2\2\u00c8\u0840\3\2"+
		"\2\2\u00ca\u0842\3\2\2\2\u00cc\u086c\3\2\2\2\u00ce\u086e\3\2\2\2\u00d0"+
		"\u08d0\3\2\2\2\u00d2\u08d5\3\2\2\2\u00d4\u08d7\3\2\2\2\u00d6\u08e0\3\2"+
		"\2\2\u00d8\u08e9\3\2\2\2\u00da\u0906\3\2\2\2\u00dc\u0920\3\2\2\2\u00de"+
		"\u092c\3\2\2\2\u00e0\u092e\3\2\2\2\u00e2\u094c\3\2\2\2\u00e4\u095f\3\2"+
		"\2\2\u00e6\u098a\3\2\2\2\u00e8\u0999\3\2\2\2\u00ea\u09ac\3\2\2\2\u00ec"+
		"\u09ae\3\2\2\2\u00ee\u09b0\3\2\2\2\u00f0\u09b2\3\2\2\2\u00f2\u09b4\3\2"+
		"\2\2\u00f4\u09b6\3\2\2\2\u00f6\u09b8\3\2\2\2\u00f8\u09ba\3\2\2\2\u00fa"+
		"\u09c3\3\2\2\2\u00fc\u09d4\3\2\2\2\u00fe\u09d9\3\2\2\2\u0100\u09dd\3\2"+
		"\2\2\u0102\u09ea\3\2\2\2\u0104\u09f2\3\2\2\2\u0106\u09f4\3\2\2\2\u0108"+
		"\u09f6\3\2\2\2\u010a\u09f8\3\2\2\2\u010c\u09fa\3\2\2\2\u010e\u09fc\3\2"+
		"\2\2\u0110\u09fe\3\2\2\2\u0112\u0a00\3\2\2\2\u0114\u0a02\3\2\2\2\u0116"+
		"\u0a04\3\2\2\2\u0118\u0a0d\3\2\2\2\u011a\u0a38\3\2\2\2\u011c\u0a4d\3\2"+
		"\2\2\u011e\u0a4f\3\2\2\2\u0120\u0a51\3\2\2\2\u0122\u0a58\3\2\2\2\u0124"+
		"\u0a66\3\2\2\2\u0126\u0a7a\3\2\2\2\u0128\u0a7c\3\2\2\2\u012a\u012c\7\7"+
		"\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\5\6"+
		"\4\2\u0131\u0133\5\u0128\u0095\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2"+
		"\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0145\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0142\5\24\13\2\u0138\u013a\5\u0128\u0095\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013f\5\24\13\2\u013e\u013d\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u0141\3\2\2\2\u0140\u0139\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0137\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\7\2\2\3\u0148\3\3\2\2\2\u0149\u014b\7\7\2\2\u014a\u0149\3\2\2\2"+
		"\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\5\6\4\2\u0150\u0152\5\u0128\u0095"+
		"\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0164\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0161\5z>\2\u0157"+
		"\u0159\5\u0128\u0095\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5z>\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0158\3\2"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0156\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7\2\2\3\u0167\5\3\2\2\2\u0168\u016a"+
		"\5\b\5\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\5\f\7\2\u016c\u016d\5\16\b\2\u016d\7\3\2\2\2\u016e\u0170\5\n\6"+
		"\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\t\3\2\2\2\u0173\u0174\7;\2\2\u0174\u017e\7\33\2\2\u0175"+
		"\u0177\7\r\2\2\u0176\u0178\5\u0120\u0091\2\u0177\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\7\16\2\2\u017c\u017f\3\2\2\2\u017d\u017f\5\u0120\u0091\2\u017e"+
		"\u0175\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182\5\u0126"+
		"\u0094\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0173\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\13\3\2\2\2\u0187\u0189\5\u0100\u0081\2\u0188\u0187\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7<\2\2\u018b\u018d"+
		"\5\u0122\u0092\2\u018c\u018e\5\u0126\u0094\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\r\3\2\2\2\u0191\u0193\5\20\t\2\u0192\u0191\3\2\2\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\17\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7=\2\2\u0198\u019c\5\u0122\u0092\2\u0199\u019a"+
		"\7\t\2\2\u019a\u019d\7\21\2\2\u019b\u019d\5\22\n\2\u019c\u0199\3\2\2\2"+
		"\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0"+
		"\5\u0126\u0094\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\21\3\2"+
		"\2\2\u01a1\u01a2\7Z\2\2\u01a2\u01a3\5\u0124\u0093\2\u01a3\23\3\2\2\2\u01a4"+
		"\u01aa\5\26\f\2\u01a5\u01aa\5@!\2\u01a6\u01aa\5\66\34\2\u01a7\u01aa\5"+
		"D#\2\u01a8\u01aa\5N(\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\25\3\2\2\2\u01ab"+
		"\u01ad\5\u0100\u0081\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01b2\t\2\2\2\u01af\u01b1\7\7\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01bd\5\u0124\u0093\2\u01b6\u01b8\7\7\2"+
		"\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\5P)\2\u01bd"+
		"\u01b9\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c6\3\2\2\2\u01bf\u01c1\7\7"+
		"\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\5\30"+
		"\r\2\u01c6\u01c2\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01d6\3\2\2\2\u01c8"+
		"\u01ca\7\7\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01d2\7\33\2\2\u01cf\u01d1\7\7\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3"+
		"\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\u01d7\5\36\20\2\u01d6\u01cb\3\2\2\2\u01d6\u01d7\3"+
		"\2\2\2\u01d7\u01df\3\2\2\2\u01d8\u01da\7\7\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\5l\67\2\u01df\u01db\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01ef\3\2\2\2\u01e1\u01e3\7\7\2\2\u01e2\u01e1\3\2"+
		"\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01f0\5&\24\2\u01e8\u01ea\7\7"+
		"\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0\5\60"+
		"\31\2\u01ef\u01e4\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\27\3\2\2\2\u01f1\u01f3\5\u0100\u0081\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01fb\3\2\2\2\u01f4\u01f8\7E\2\2\u01f5\u01f7\7\7\2\2\u01f6"+
		"\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01f4\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\5\32\16\2\u01fe\31\3\2"+
		"\2\2\u01ff\u0208\7\13\2\2\u0200\u0205\5\34\17\2\u0201\u0202\7\n\2\2\u0202"+
		"\u0204\5\34\17\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3"+
		"\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0208"+
		"\u0200\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\7\f"+
		"\2\2\u020b\33\3\2\2\2\u020c\u020e\5\u0100\u0081\2\u020d\u020c\3\2\2\2"+
		"\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0211\t\3\2\2\u0210\u020f"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5\u0124\u0093"+
		"\2\u0213\u0214\7\33\2\2\u0214\u0217\5T+\2\u0215\u0216\7\35\2\2\u0216\u0218"+
		"\5z>\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\35\3\2\2\2\u0219"+
		"\u021b\5\u0118\u008d\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0230\5 \21\2\u0220\u0222\7\7\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u022a\7\n\2\2\u0227\u0229\7\7\2\2\u0228\u0227\3\2"+
		"\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022f\5 \21\2\u022e\u0223\3\2"+
		"\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\37\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0237\5\"\22\2\u0234\u0237\5d\63"+
		"\2\u0235\u0237\5$\23\2\u0236\u0233\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0235"+
		"\3\2\2\2\u0237!\3\2\2\2\u0238\u0239\5d\63\2\u0239\u023a\5\u009aN\2\u023a"+
		"#\3\2\2\2\u023b\u023f\5d\63\2\u023c\u023e\7\7\2\2\u023d\u023c\3\2\2\2"+
		"\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0246\7F\2\2\u0243\u0245\7\7\2\2\u0244"+
		"\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\5z>\2\u024a%"+
		"\3\2\2\2\u024b\u024f\7\17\2\2\u024c\u024e\7\7\2\2\u024d\u024c\3\2\2\2"+
		"\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0255"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0254\5(\25\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025b\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0258\u025a\7\7\2\2\u0259\u0258\3\2\2\2\u025a"+
		"\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2"+
		"\2\2\u025d\u025b\3\2\2\2\u025e\u025f\7\20\2\2\u025f\'\3\2\2\2\u0260\u0269"+
		"\5\26\f\2\u0261\u0269\5\66\34\2\u0262\u0269\5@!\2\u0263\u0269\5B\"\2\u0264"+
		"\u0269\5D#\2\u0265\u0269\5*\26\2\u0266\u0269\5,\27\2\u0267\u0269\5N(\2"+
		"\u0268\u0260\3\2\2\2\u0268\u0261\3\2\2\2\u0268\u0262\3\2\2\2\u0268\u0263"+
		"\3\2\2\2\u0268\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0267\3\2\2\2\u0269\u026d\3\2\2\2\u026a\u026c\5\u0128\u0095\2\u026b\u026a"+
		"\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		")\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0274\7H\2\2\u0271\u0273\7\7\2\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\5p9\2\u0278+"+
		"\3\2\2\2\u0279\u027b\5\u0100\u0081\2\u027a\u0279\3\2\2\2\u027a\u027b\3"+
		"\2\2\2\u027b\u027c\3\2\2\2\u027c\u0280\7E\2\2\u027d\u027f\7\7\2\2\u027e"+
		"\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0292\58\35\2\u0284"+
		"\u0286\7\7\2\2\u0285\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a"+
		"\u028e\7\33\2\2\u028b\u028d\7\7\2\2\u028c\u028b\3\2\2\2\u028d\u0290\3"+
		"\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0291\u0293\5.\30\2\u0292\u0287\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0297\3\2\2\2\u0294\u0296\7\7\2\2\u0295\u0294\3\2\2\2\u0296"+
		"\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\3\2"+
		"\2\2\u0299\u0297\3\2\2\2\u029a\u029b\5p9\2\u029b-\3\2\2\2\u029c\u02a0"+
		"\7I\2\2\u029d\u029f\7\7\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2"+
		"\2\2\u02a3\u02ad\5\u00a0Q\2\u02a4\u02a8\7J\2\2\u02a5\u02a7\7\7\2\2\u02a6"+
		"\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\5\u00a0Q\2\u02ac"+
		"\u029c\3\2\2\2\u02ac\u02a4\3\2\2\2\u02ad/\3\2\2\2\u02ae\u02b2\7\17\2\2"+
		"\u02af\u02b1\7\7\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5"+
		"\u02b7\5\62\32\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02cb\3"+
		"\2\2\2\u02b8\u02ba\7\7\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02be\u02c2\7\34\2\2\u02bf\u02c1\7\7\2\2\u02c0\u02bf\3\2\2\2\u02c1"+
		"\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c8\3\2"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c7\5(\25\2\u02c6\u02c5\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cc\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02bb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02d0\3\2\2\2\u02cd\u02cf\7\7\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d3\u02d4\7\20\2\2\u02d4\61\3\2\2\2\u02d5\u02d9\5\64"+
		"\33\2\u02d6\u02d8\7\7\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2"+
		"\2\2\u02dc\u02d5\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02e2\7\34\2\2\u02e1\u02e0\3"+
		"\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\63\3\2\2\2\u02e3\u02eb\5\u0124\u0093"+
		"\2\u02e4\u02e6\7\7\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
		"\u02ec\5\u00a0Q\2\u02eb\u02e7\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f4"+
		"\3\2\2\2\u02ed\u02ef\7\7\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2"+
		"\2\2\u02f3\u02f5\5&\24\2\u02f4\u02f0\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02fd\3\2\2\2\u02f6\u02f8\7\7\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2"+
		"\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fc\u02fe\7\n\2\2\u02fd\u02f9\3\2\2\2\u02fd\u02fe\3\2"+
		"\2\2\u02fe\65\3\2\2\2\u02ff\u0301\5\u0100\u0081\2\u0300\u02ff\3\2\2\2"+
		"\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0312\7@\2\2\u0303\u0305"+
		"\7\7\2\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030d\5T"+
		"+\2\u030a\u030c\7\7\2\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2"+
		"\2\2\u0310\u0311\7\t\2\2\u0311\u0313\3\2\2\2\u0312\u0306\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u031b\3\2\2\2\u0314\u0316\7\7\2\2\u0315\u0314\3\2"+
		"\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u031a\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031c\5P)\2\u031b\u0317\3\2\2"+
		"\2\u031b\u031c\3\2\2\2\u031c\u0324\3\2\2\2\u031d\u031f\7\7\2\2\u031e\u031d"+
		"\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0325\5\u0122\u0092\2\u0324\u0320"+
		"\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u032e\3\2\2\2\u0326\u0328\7\7\2\2\u0327"+
		"\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\7+\2\2\u032d"+
		"\u032f\5h\65\2\u032e\u0329\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0333\3\2"+
		"\2\2\u0330\u0332\7\7\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u0345\58\35\2\u0337\u0339\7\7\2\2\u0338\u0337\3\2\2\2\u0339"+
		"\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2"+
		"\2\2\u033c\u033a\3\2\2\2\u033d\u0341\7\33\2\2\u033e\u0340\7\7\2\2\u033f"+
		"\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0346\5T+\2\u0345\u033a"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034e\3\2\2\2\u0347\u0349\7\7\2\2\u0348"+
		"\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034d\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034f\5l\67\2\u034e"+
		"\u034a\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0357\3\2\2\2\u0350\u0352\7\7"+
		"\2\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0358\5>"+
		" \2\u0357\u0353\3\2\2\2\u0357\u0358\3\2\2\2\u0358\67\3\2\2\2\u0359\u0362"+
		"\7\13\2\2\u035a\u035f\5:\36\2\u035b\u035c\7\n\2\2\u035c\u035e\5:\36\2"+
		"\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u035a\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7\f\2\2\u03659\3\2\2\2"+
		"\u0366\u0368\5\u0100\u0081\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036c\5<\37\2\u036a\u036b\7\35\2\2\u036b\u036d\5"+
		"z>\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d;\3\2\2\2\u036e\u036f"+
		"\5\u0124\u0093\2\u036f\u0370\7\33\2\2\u0370\u0371\5T+\2\u0371=\3\2\2\2"+
		"\u0372\u037c\5p9\2\u0373\u0377\7\35\2\2\u0374\u0376\7\7\2\2\u0375\u0374"+
		"\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037a\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037c\5z>\2\u037b\u0372\3\2\2"+
		"\2\u037b\u0373\3\2\2\2\u037c?\3\2\2\2\u037d\u037f\5\u0100\u0081\2\u037e"+
		"\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0384\7A"+
		"\2\2\u0381\u0383\7\7\2\2\u0382\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2"+
		"\2\2\u0387\u038f\5\u0124\u0093\2\u0388\u038a\7\7\2\2\u0389\u0388\3\2\2"+
		"\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e"+
		"\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0390\5\30\r\2\u038f\u038b\3\2\2\2"+
		"\u038f\u0390\3\2\2\2\u0390\u039f\3\2\2\2\u0391\u0393\7\7\2\2\u0392\u0391"+
		"\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u039b\7\33\2\2\u0398\u039a\7"+
		"\7\2\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a0\5\36"+
		"\20\2\u039f\u0394\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a8\3\2\2\2\u03a1"+
		"\u03a3\7\7\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7"+
		"\u03a9\5&\24\2\u03a8\u03a4\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9A\3\2\2\2"+
		"\u03aa\u03ac\5\u0100\u0081\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03b1\7G\2\2\u03ae\u03b0\7\7\2\2\u03af\u03ae\3\2"+
		"\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6\5\u0100\u0081\2\u03b5\u03b4"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03bf\7A\2\2\u03b8"+
		"\u03ba\7\7\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be"+
		"\u03c0\5\u0124\u0093\2\u03bf\u03bb\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03cf"+
		"\3\2\2\2\u03c1\u03c3\7\7\2\2\u03c2\u03c1\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c4\3\2"+
		"\2\2\u03c7\u03cb\7\33\2\2\u03c8\u03ca\7\7\2\2\u03c9\u03c8\3\2\2\2\u03ca"+
		"\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2"+
		"\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03d0\5\36\20\2\u03cf\u03c4\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d8\3\2\2\2\u03d1\u03d3\7\7\2\2\u03d2\u03d1\3\2"+
		"\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d7\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d9\5&\24\2\u03d8\u03d4\3\2"+
		"\2\2\u03d8\u03d9\3\2\2\2\u03d9C\3\2\2\2\u03da\u03dc\5\u0100\u0081\2\u03db"+
		"\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e5\t\3"+
		"\2\2\u03de\u03e0\7\7\2\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1"+
		"\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e1\3\2"+
		"\2\2\u03e4\u03e6\5P)\2\u03e5\u03e1\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03f6"+
		"\3\2\2\2\u03e7\u03e9\7\7\2\2\u03e8\u03e7\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ea\3\2"+
		"\2\2\u03ed\u03f1\5T+\2\u03ee\u03f0\7\7\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3"+
		"\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f4\u03f5\7\t\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03ea\3\2"+
		"\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03fb\3\2\2\2\u03f8\u03fa\7\7\2\2\u03f9"+
		"\u03f8\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u0400\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0401\5F$\2\u03ff\u0401"+
		"\5H%\2\u0400\u03fe\3\2\2\2\u0400\u03ff\3\2\2\2\u0401\u0409\3\2\2\2\u0402"+
		"\u0404\7\7\2\2\u0403\u0402\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408"+
		"\u040a\5l\67\2\u0409\u0405\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u0419\3\2"+
		"\2\2\u040b\u040d\7\7\2\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e"+
		"\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u040e\3\2"+
		"\2\2\u0411\u0415\t\4\2\2\u0412\u0414\7\7\2\2\u0413\u0412\3\2\2\2\u0414"+
		"\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2"+
		"\2\2\u0417\u0415\3\2\2\2\u0418\u041a\5z>\2\u0419\u040e\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u0427\3\2\2\2\u041b\u041f\5J&\2\u041c\u041d\5\u0126\u0094"+
		"\2\u041d\u041e\5L\'\2\u041e\u0420\3\2\2\2\u041f\u041c\3\2\2\2\u041f\u0420"+
		"\3\2\2\2\u0420\u0428\3\2\2\2\u0421\u0425\5L\'\2\u0422\u0423\5\u0126\u0094"+
		"\2\u0423\u0424\5J&\2\u0424\u0426\3\2\2\2\u0425\u0422\3\2\2\2\u0425\u0426"+
		"\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u041b\3\2\2\2\u0427\u0421\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428E\3\2\2\2\u0429\u042a\7\13\2\2\u042a\u042f\5H%\2\u042b"+
		"\u042c\7\n\2\2\u042c\u042e\5H%\2\u042d\u042b\3\2\2\2\u042e\u0431\3\2\2"+
		"\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431\u042f"+
		"\3\2\2\2\u0432\u0433\7\f\2\2\u0433G\3\2\2\2\u0434\u0437\5\u0124\u0093"+
		"\2\u0435\u0436\7\33\2\2\u0436\u0438\5T+\2\u0437\u0435\3\2\2\2\u0437\u0438"+
		"\3\2\2\2\u0438I\3\2\2\2\u0439\u043b\5\u0100\u0081\2\u043a\u0439\3\2\2"+
		"\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u046b\7d\2\2\u043d\u043f"+
		"\5\u0100\u0081\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3"+
		"\2\2\2\u0440\u0444\7d\2\2\u0441\u0443\7\7\2\2\u0442\u0441\3\2\2\2\u0443"+
		"\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2"+
		"\2\2\u0446\u0444\3\2\2\2\u0447\u0448\7\13\2\2\u0448\u0457\7\f\2\2\u0449"+
		"\u044b\7\7\2\2\u044a\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2"+
		"\2\2\u044c\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f"+
		"\u0453\7\33\2\2\u0450\u0452\7\7\2\2\u0451\u0450\3\2\2\2\u0452\u0455\3"+
		"\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455"+
		"\u0453\3\2\2\2\u0456\u0458\5T+\2\u0457\u044c\3\2\2\2\u0457\u0458\3\2\2"+
		"\2\u0458\u045c\3\2\2\2\u0459\u045b\7\7\2\2\u045a\u0459\3\2\2\2\u045b\u045e"+
		"\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0468\3\2\2\2\u045e"+
		"\u045c\3\2\2\2\u045f\u0469\5p9\2\u0460\u0464\7\35\2\2\u0461\u0463\7\7"+
		"\2\2\u0462\u0461\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464"+
		"\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u0469\5z"+
		">\2\u0468\u045f\3\2\2\2\u0468\u0460\3\2\2\2\u0469\u046b\3\2\2\2\u046a"+
		"\u043a\3\2\2\2\u046a\u043e\3\2\2\2\u046bK\3\2\2\2\u046c\u046e\5\u0100"+
		"\u0081\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u0490\7e\2\2\u0470\u0472\5\u0100\u0081\2\u0471\u0470\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0477\7e\2\2\u0474\u0476\7\7\2\2\u0475"+
		"\u0474\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2"+
		"\2\2\u0478\u047a\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047f\7\13\2\2\u047b"+
		"\u047e\5\u0118\u008d\2\u047c\u047e\5\u0112\u008a\2\u047d\u047b\3\2\2\2"+
		"\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480"+
		"\3\2\2\2\u0480\u0484\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0485\5\u0124\u0093"+
		"\2\u0483\u0485\5<\37\2\u0484\u0482\3\2\2\2\u0484\u0483\3\2\2\2\u0485\u0486"+
		"\3\2\2\2\u0486\u048a\7\f\2\2\u0487\u0489\7\7\2\2\u0488\u0487\3\2\2\2\u0489"+
		"\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\3\2"+
		"\2\2\u048c\u048a\3\2\2\2\u048d\u048e\5> \2\u048e\u0490\3\2\2\2\u048f\u046d"+
		"\3\2\2\2\u048f\u0471\3\2\2\2\u0490M\3\2\2\2\u0491\u0493\5\u0100\u0081"+
		"\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0498"+
		"\7D\2\2\u0495\u0497\7\7\2\2\u0496\u0495\3\2\2\2\u0497\u049a\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2"+
		"\2\2\u049b\u04a3\5\u0124\u0093\2\u049c\u049e\7\7\2\2\u049d\u049c\3\2\2"+
		"\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2"+
		"\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04a4\5P)\2\u04a3\u049f\3\2\2\2\u04a3"+
		"\u04a4\3\2\2\2\u04a4\u04a8\3\2\2\2\u04a5\u04a7\7\7\2\2\u04a6\u04a5\3\2"+
		"\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u04ab\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04af\7\35\2\2\u04ac\u04ae\7"+
		"\7\2\2\u04ad\u04ac\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b3\5T"+
		"+\2\u04b3O\3\2\2\2\u04b4\u04b8\7.\2\2\u04b5\u04b7\7\7\2\2\u04b6\u04b5"+
		"\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04bb\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04cc\5R*\2\u04bc\u04be\7\7\2"+
		"\2\u04bd\u04bc\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c6\7\n\2\2\u04c3"+
		"\u04c5\7\7\2\2\u04c4\u04c3\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2"+
		"\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9"+
		"\u04cb\5R*\2\u04ca\u04bf\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04d2\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf\u04d1"+
		"\7\7\2\2\u04d0\u04cf\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d6\7/"+
		"\2\2\u04d6Q\3\2\2\2\u04d7\u04d9\5\u0100\u0081\2\u04d8\u04d7\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04dd\3\2\2\2\u04da\u04dc\7\7\2\2\u04db\u04da\3\2"+
		"\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04e0\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04f5\5\u0124\u0093\2\u04e1\u04e3"+
		"\7\7\2\2\u04e2\u04e1\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04eb\7\33"+
		"\2\2\u04e8\u04ea\7\7\2\2\u04e9\u04e8\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04eb\3\2"+
		"\2\2\u04ee\u04f2\5T+\2\u04ef\u04f1\7\7\2\2\u04f0\u04ef\3\2\2\2\u04f1\u04f4"+
		"\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4"+
		"\u04f2\3\2\2\2\u04f5\u04e4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6S\3\2\2\2"+
		"\u04f7\u04f9\5V,\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fe"+
		"\3\2\2\2\u04fa\u04ff\5`\61\2\u04fb\u04ff\5X-\2\u04fc\u04ff\5Z.\2\u04fd"+
		"\u04ff\5\\/\2\u04fe\u04fa\3\2\2\2\u04fe\u04fb\3\2\2\2\u04fe\u04fc\3\2"+
		"\2\2\u04fe\u04fd\3\2\2\2\u04ffU\3\2\2\2\u0500\u0509\5\u0118\u008d\2\u0501"+
		"\u0505\7y\2\2\u0502\u0504\7\7\2\2\u0503\u0502\3\2\2\2\u0504\u0507\3\2"+
		"\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0509\3\2\2\2\u0507"+
		"\u0505\3\2\2\2\u0508\u0500\3\2\2\2\u0508\u0501\3\2\2\2\u0509\u050a\3\2"+
		"\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050bW\3\2\2\2\u050c\u050d"+
		"\7\13\2\2\u050d\u050e\5T+\2\u050e\u050f\7\f\2\2\u050fY\3\2\2\2\u0510\u0513"+
		"\5\\/\2\u0511\u0513\5X-\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513"+
		"\u0517\3\2\2\2\u0514\u0516\7\7\2\2\u0515\u0514\3\2\2\2\u0516\u0519\3\2"+
		"\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051b\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u051a\u051c\7,\2\2\u051b\u051a\3\2\2\2\u051c\u051d\3\2"+
		"\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e[\3\2\2\2\u051f\u0520"+
		"\7\13\2\2\u0520\u0521\5\\/\2\u0521\u0522\7\f\2\2\u0522\u0533\3\2\2\2\u0523"+
		"\u0525\5d\63\2\u0524\u0526\5^\60\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2"+
		"\2\2\u0526\u052f\3\2\2\2\u0527\u0529\7\7\2\2\u0528\u0527\3\2\2\2\u0529"+
		"\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2"+
		"\2\2\u052c\u052a\3\2\2\2\u052d\u052e\7+\2\2\u052e\u0530\5h\65\2\u052f"+
		"\u052a\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u0533\7j"+
		"\2\2\u0532\u051f\3\2\2\2\u0532\u0523\3\2\2\2\u0532\u0531\3\2\2\2\u0533"+
		"]\3\2\2\2\u0534\u0536\7\r\2\2\u0535\u0537\5d\63\2\u0536\u0535\3\2\2\2"+
		"\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\7\16\2\2\u0539_\3"+
		"\2\2\2\u053a\u053e\5b\62\2\u053b\u053d\7\7\2\2\u053c\u053b\3\2\2\2\u053d"+
		"\u0540\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2"+
		"\2\2\u0540\u053e\3\2\2\2\u0541\u0545\7\t\2\2\u0542\u0544\7\7\2\2\u0543"+
		"\u0542\3\2\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2"+
		"\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u053a\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054e\5j\66\2\u054b\u054d\7\7"+
		"\2\2\u054c\u054b\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e"+
		"\u054f\3\2\2\2\u054f\u0551\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0555\7#"+
		"\2\2\u0552\u0554\7\7\2\2\u0553\u0552\3\2\2\2\u0554\u0557\3\2\2\2\u0555"+
		"\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0555\3\2"+
		"\2\2\u0558\u0559\5T+\2\u0559a\3\2\2\2\u055a\u055e\5X-\2\u055b\u055e\5"+
		"Z.\2\u055c\u055e\5\\/\2\u055d\u055a\3\2\2\2\u055d\u055b\3\2\2\2\u055d"+
		"\u055c\3\2\2\2\u055ec\3\2\2\2\u055f\u0570\5f\64\2\u0560\u0562\7\7\2\2"+
		"\u0561\u0560\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564"+
		"\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0563\3\2\2\2\u0566\u056a\7\t\2\2\u0567"+
		"\u0569\7\7\2\2\u0568\u0567\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2"+
		"\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2\2\2\u056d"+
		"\u056f\5f\64\2\u056e\u0563\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2"+
		"\2\2\u0570\u0571\3\2\2\2\u0571e\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u057b"+
		"\5\u0124\u0093\2\u0574\u0576\7\7\2\2\u0575\u0574\3\2\2\2\u0576\u0579\3"+
		"\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579"+
		"\u0577\3\2\2\2\u057a\u057c\5\u00a2R\2\u057b\u0577\3\2\2\2\u057b\u057c"+
		"\3\2\2\2\u057cg\3\2\2\2\u057d\u0580\5\u00aaV\2\u057e\u057f\7%\2\2\u057f"+
		"\u0581\5\u00aaV\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0584"+
		"\3\2\2\2\u0582\u0584\5d\63\2\u0583\u057d\3\2\2\2\u0583\u0582\3\2\2\2\u0584"+
		"i\3\2\2\2\u0585\u0588\7\13\2\2\u0586\u0589\5<\37\2\u0587\u0589\5T+\2\u0588"+
		"\u0586\3\2\2\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u0591\3\2"+
		"\2\2\u058a\u058d\7\n\2\2\u058b\u058e\5<\37\2\u058c\u058e\5T+\2\u058d\u058b"+
		"\3\2\2\2\u058d\u058c\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u058a\3\2\2\2\u0590"+
		"\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2"+
		"\2\2\u0593\u0591\3\2\2\2\u0594\u0595\7\f\2\2\u0595k\3\2\2\2\u0596\u059a"+
		"\7L\2\2\u0597\u0599\7\7\2\2\u0598\u0597\3\2\2\2\u0599\u059c\3\2\2\2\u059a"+
		"\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a\3\2"+
		"\2\2\u059d\u05ae\5n8\2\u059e\u05a0\7\7\2\2\u059f\u059e\3\2\2\2\u05a0\u05a3"+
		"\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3"+
		"\u05a1\3\2\2\2\u05a4\u05a8\7\n\2\2\u05a5\u05a7\7\7\2\2\u05a6\u05a5\3\2"+
		"\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ab\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ad\5n8\2\u05ac\u05a1\3\2\2"+
		"\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05afm"+
		"\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b3\5\u0118\u008d\2\u05b2\u05b1\3"+
		"\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05bb\5\u0124\u0093\2\u05b8\u05ba"+
		"\7\7\2\2\u05b9\u05b8\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u05be\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05c2\7\33"+
		"\2\2\u05bf\u05c1\7\7\2\2\u05c0\u05bf\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2"+
		"\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05c2\3\2"+
		"\2\2\u05c5\u05c6\5T+\2\u05c6o\3\2\2\2\u05c7\u05c8\7\17\2\2\u05c8\u05c9"+
		"\5r:\2\u05c9\u05ca\7\20\2\2\u05caq\3\2\2\2\u05cb\u05cd\5\u0128\u0095\2"+
		"\u05cc\u05cb\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf"+
		"\3\2\2\2\u05cf\u05df\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05dc\5t;\2\u05d2"+
		"\u05d4\5\u0128\u0095\2\u05d3\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d3"+
		"\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05d9\5t;\2\u05d8"+
		"\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05d3\3\2"+
		"\2\2\u05db\u05de\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05df\u05d1\3\2\2\2\u05df\u05e0\3\2"+
		"\2\2\u05e0s\3\2\2\2\u05e1\u05e4\5x=\2\u05e2\u05e4\5v<\2\u05e3\u05e1\3"+
		"\2\2\2\u05e3\u05e2\3\2\2\2\u05e4u\3\2\2\2\u05e5\u05e7\5\u0118\u008d\2"+
		"\u05e6\u05e5\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9"+
		"\3\2\2\2\u05e9\u05ee\3\2\2\2\u05ea\u05e8\3\2\2\2\u05eb\u05ed\7\7\2\2\u05ec"+
		"\u05eb\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2"+
		"\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f2\5z>\2\u05f2w"+
		"\3\2\2\2\u05f3\u05f5\5\u0116\u008c\2\u05f4\u05f3\3\2\2\2\u05f5\u05f8\3"+
		"\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05fd\3\2\2\2\u05f8"+
		"\u05f6\3\2\2\2\u05f9\u05fe\5\26\f\2\u05fa\u05fe\5\66\34\2\u05fb\u05fe"+
		"\5D#\2\u05fc\u05fe\5N(\2\u05fd\u05f9\3\2\2\2\u05fd\u05fa\3\2\2\2\u05fd"+
		"\u05fb\3\2\2\2\u05fd\u05fc\3\2\2\2\u05fey\3\2\2\2\u05ff\u0605\5|?\2\u0600"+
		"\u0601\5\u00eav\2\u0601\u0602\5|?\2\u0602\u0604\3\2\2\2\u0603\u0600\3"+
		"\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"{\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u0619\5~@\2\u0609\u060b\7\7\2\2\u060a"+
		"\u0609\3\2\2\2\u060b\u060e\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2"+
		"\2\2\u060d\u060f\3\2\2\2\u060e\u060c\3\2\2\2\u060f\u0613\7\31\2\2\u0610"+
		"\u0612\7\7\2\2\u0611\u0610\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2"+
		"\2\2\u0613\u0614\3\2\2\2\u0614\u0616\3\2\2\2\u0615\u0613\3\2\2\2\u0616"+
		"\u0618\5~@\2\u0617\u060c\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617\3\2\2"+
		"\2\u0619\u061a\3\2\2\2\u061a}\3\2\2\2\u061b\u0619\3\2\2\2\u061c\u062d"+
		"\5\u0080A\2\u061d\u061f\7\7\2\2\u061e\u061d\3\2\2\2\u061f\u0622\3\2\2"+
		"\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\3\2\2\2\u0622\u0620"+
		"\3\2\2\2\u0623\u0627\7\30\2\2\u0624\u0626\7\7\2\2\u0625\u0624\3\2\2\2"+
		"\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a"+
		"\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u062c\5\u0080A\2\u062b\u0620\3\2\2"+
		"\2\u062c\u062f\3\2\2\2\u062d\u062b\3\2\2\2\u062d\u062e\3\2\2\2\u062e\177"+
		"\3\2\2\2\u062f\u062d\3\2\2\2\u0630\u063c\5\u0082B\2\u0631\u0635\5\u00ec"+
		"w\2\u0632\u0634\7\7\2\2\u0633\u0632\3\2\2\2\u0634\u0637\3\2\2\2\u0635"+
		"\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0635\3\2"+
		"\2\2\u0638\u0639\5\u0082B\2\u0639\u063b\3\2\2\2\u063a\u0631\3\2\2\2\u063b"+
		"\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u0081\3\2"+
		"\2\2\u063e\u063c\3\2\2\2\u063f\u0649\5\u0084C\2\u0640\u0644\5\u00eex\2"+
		"\u0641\u0643\7\7\2\2\u0642\u0641\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642"+
		"\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0644\3\2\2\2\u0647"+
		"\u0648\5\u0084C\2\u0648\u064a\3\2\2\2\u0649\u0640\3\2\2\2\u0649\u064a"+
		"\3\2\2\2\u064a\u0083\3\2\2\2\u064b\u0662\5\u0086D\2\u064c\u0650\5\u00f0"+
		"y\2\u064d\u064f\7\7\2\2\u064e\u064d\3\2\2\2\u064f\u0652\3\2\2\2\u0650"+
		"\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0650\3\2"+
		"\2\2\u0653\u0654\5\u0086D\2\u0654\u0656\3\2\2\2\u0655\u064c\3\2\2\2\u0656"+
		"\u0657\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0663\3\2"+
		"\2\2\u0659\u065d\5\u00f2z\2\u065a\u065c\7\7\2\2\u065b\u065a\3\2\2\2\u065c"+
		"\u065f\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2"+
		"\2\2\u065f\u065d\3\2\2\2\u0660\u0661\5T+\2\u0661\u0663\3\2\2\2\u0662\u0655"+
		"\3\2\2\2\u0662\u0659\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0085\3\2\2\2\u0664"+
		"\u0675\5\u0088E\2\u0665\u0667\7\7\2\2\u0666\u0665\3\2\2\2\u0667\u066a"+
		"\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066b\3\2\2\2\u066a"+
		"\u0668\3\2\2\2\u066b\u066f\7-\2\2\u066c\u066e\7\7\2\2\u066d\u066c\3\2"+
		"\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670"+
		"\u0672\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0674\5\u0088E\2\u0673\u0668"+
		"\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676"+
		"\u0087\3\2\2\2\u0677\u0675\3\2\2\2\u0678\u0684\5\u008aF\2\u0679\u067d"+
		"\5\u0124\u0093\2\u067a\u067c\7\7\2\2\u067b\u067a\3\2\2\2\u067c\u067f\3"+
		"\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f"+
		"\u067d\3\2\2\2\u0680\u0681\5\u008aF\2\u0681\u0683\3\2\2\2\u0682\u0679"+
		"\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685"+
		"\u0089\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0692\5\u008cG\2\u0688\u068c"+
		"\7%\2\2\u0689\u068b\7\7\2\2\u068a\u0689\3\2\2\2\u068b\u068e\3\2\2\2\u068c"+
		"\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e\u068c\3\2"+
		"\2\2\u068f\u0691\5\u008cG\2\u0690\u0688\3\2\2\2\u0691\u0694\3\2\2\2\u0692"+
		"\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u008b\3\2\2\2\u0694\u0692\3\2"+
		"\2\2\u0695\u06a1\5\u008eH\2\u0696\u069a\5\u00f4{\2\u0697\u0699\7\7\2\2"+
		"\u0698\u0697\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b"+
		"\3\2\2\2\u069b\u069d\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u069e\5\u008eH"+
		"\2\u069e\u06a0\3\2\2\2\u069f\u0696\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f"+
		"\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u008d\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4"+
		"\u06b0\5\u0090I\2\u06a5\u06a9\5\u00f6|\2\u06a6\u06a8\7\7\2\2\u06a7\u06a6"+
		"\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06ac\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac\u06ad\5\u0090I\2\u06ad\u06af"+
		"\3\2\2\2\u06ae\u06a5\3\2\2\2\u06af\u06b2\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0"+
		"\u06b1\3\2\2\2\u06b1\u008f\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b3\u06bf\5\u0092"+
		"J\2\u06b4\u06b6\7\7\2\2\u06b5\u06b4\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7"+
		"\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9\u06b7\3\2"+
		"\2\2\u06ba\u06bb\5\u00f8}\2\u06bb\u06bc\5\u0092J\2\u06bc\u06be\3\2\2\2"+
		"\u06bd\u06b7\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0"+
		"\3\2\2\2\u06c0\u0091\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c2\u06c4\5\u00fa~"+
		"\2\u06c3\u06c2\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6"+
		"\3\2\2\2\u06c6\u06c8\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u06c9\5\u0094K"+
		"\2\u06c9\u0093\3\2\2\2\u06ca\u06cd\5\u0096L\2\u06cb\u06cd\5\u00e8u\2\u06cc"+
		"\u06ca\3\2\2\2\u06cc\u06cb\3\2\2\2\u06cd\u06d1\3\2\2\2\u06ce\u06d0\5\u00fc"+
		"\177\2\u06cf\u06ce\3\2\2\2\u06d0\u06d3\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u0095\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d4\u06e1\5\u0098"+
		"M\2\u06d5\u06e1\5\u00aaV\2\u06d6\u06e1\5\u00ba^\2\u06d7\u06e1\5\u00c4"+
		"c\2\u06d8\u06e1\5\u00c6d\2\u06d9\u06e1\5\u00c8e\2\u06da\u06e1\5\u00d8"+
		"m\2\u06db\u06e1\5\u00c0a\2\u06dc\u06e1\5\u00e6t\2\u06dd\u06e1\5\u00de"+
		"p\2\u06de\u06e1\5\u00c2b\2\u06df\u06e1\5\u0124\u0093\2\u06e0\u06d4\3\2"+
		"\2\2\u06e0\u06d5\3\2\2\2\u06e0\u06d6\3\2\2\2\u06e0\u06d7\3\2\2\2\u06e0"+
		"\u06d8\3\2\2\2\u06e0\u06d9\3\2\2\2\u06e0\u06da\3\2\2\2\u06e0\u06db\3\2"+
		"\2\2\u06e0\u06dc\3\2\2\2\u06e0\u06dd\3\2\2\2\u06e0\u06de\3\2\2\2\u06e0"+
		"\u06df\3\2\2\2\u06e1\u0097\3\2\2\2\u06e2\u06e3\7\13\2\2\u06e3\u06e4\5"+
		"z>\2\u06e4\u06e5\7\f\2\2\u06e5\u0099\3\2\2\2\u06e6\u06e8\5\u00a2R\2\u06e7"+
		"\u06e9\5\u00a0Q\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ed"+
		"\3\2\2\2\u06ea\u06ec\5\u009cO\2\u06eb\u06ea\3\2\2\2\u06ec\u06ef\3\2\2"+
		"\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06fd\3\2\2\2\u06ef\u06ed"+
		"\3\2\2\2\u06f0\u06f4\5\u00a0Q\2\u06f1\u06f3\5\u009cO\2\u06f2\u06f1\3\2"+
		"\2\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5"+
		"\u06fd\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06f9\5\u009cO\2\u06f8\u06f7"+
		"\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb"+
		"\u06fd\3\2\2\2\u06fc\u06e6\3\2\2\2\u06fc\u06f0\3\2\2\2\u06fc\u06f8\3\2"+
		"\2\2\u06fd\u009b\3\2\2\2\u06fe\u0700\5\u0120\u0091\2\u06ff\u06fe\3\2\2"+
		"\2\u0700\u0703\3\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0705"+
		"\3\2\2\2\u0703\u0701\3\2\2\2\u0704\u0706\7\u0091\2\2\u0705\u0704\3\2\2"+
		"\2\u0705\u0706\3\2\2\2\u0706\u070a\3\2\2\2\u0707\u0709\7\7\2\2\u0708\u0707"+
		"\3\2\2\2\u0709\u070c\3\2\2\2\u070a\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u070d\3\2\2\2\u070c\u070a\3\2\2\2\u070d\u070e\5\u00ba^\2\u070e\u009d"+
		"\3\2\2\2\u070f\u0718\7\r\2\2\u0710\u0715\5z>\2\u0711\u0712\7\n\2\2\u0712"+
		"\u0714\5z>\2\u0713\u0711\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2\2"+
		"\2\u0715\u0716\3\2\2\2\u0716\u0719\3\2\2\2\u0717\u0715\3\2\2\2\u0718\u0710"+
		"\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\7\16\2\2"+
		"\u071b\u009f\3\2\2\2\u071c\u0725\7\13\2\2\u071d\u0722\5\u00a8U\2\u071e"+
		"\u071f\7\n\2\2\u071f\u0721\5\u00a8U\2\u0720\u071e\3\2\2\2\u0721\u0724"+
		"\3\2\2\2\u0722\u0720\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0726\3\2\2\2\u0724"+
		"\u0722\3\2\2\2\u0725\u071d\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\3\2"+
		"\2\2\u0727\u0728\7\f\2\2\u0728\u00a1\3\2\2\2\u0729\u072d\7.\2\2\u072a"+
		"\u072c\7\7\2\2\u072b\u072a\3\2\2\2\u072c\u072f\3\2\2\2\u072d\u072b\3\2"+
		"\2\2\u072d\u072e\3\2\2\2\u072e\u0730\3\2\2\2\u072f\u072d\3\2\2\2\u0730"+
		"\u073b\5\u00a4S\2\u0731\u0733\7\7\2\2\u0732\u0731\3\2\2\2\u0733\u0736"+
		"\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0737\3\2\2\2\u0736"+
		"\u0734\3\2\2\2\u0737\u0738\7\n\2\2\u0738\u073a\5\u00a4S\2\u0739\u0734"+
		"\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c"+
		"\u0741\3\2\2\2\u073d\u073b\3\2\2\2\u073e\u0740\7\7\2\2\u073f\u073e\3\2"+
		"\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742"+
		"\u0744\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u0745\7/\2\2\u0745\u00a3\3\2"+
		"\2\2\u0746\u0748\5\u00a6T\2\u0747\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748"+
		"\u0749\3\2\2\2\u0749\u074c\5T+\2\u074a\u074c\7\21\2\2\u074b\u0747\3\2"+
		"\2\2\u074b\u074a\3\2\2\2\u074c\u00a5\3\2\2\2\u074d\u074f\5\u010a\u0086"+
		"\2\u074e\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751"+
		"\3\2\2\2\u0751\u00a7\3\2\2\2\u0752\u0756\5\u0124\u0093\2\u0753\u0755\7"+
		"\7\2\2\u0754\u0753\3\2\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756"+
		"\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075d\7\35"+
		"\2\2\u075a\u075c\7\7\2\2\u075b\u075a\3\2\2\2\u075c\u075f\3\2\2\2\u075d"+
		"\u075b\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2"+
		"\2\2\u0760\u0752\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762"+
		"\u0764\7\21\2\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0768\3"+
		"\2\2\2\u0765\u0767\7\7\2\2\u0766\u0765\3\2\2\2\u0767\u076a\3\2\2\2\u0768"+
		"\u0766\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076b\3\2\2\2\u076a\u0768\3\2"+
		"\2\2\u076b\u076c\5z>\2\u076c\u00a9\3\2\2\2\u076d\u0777\7\u008d\2\2\u076e"+
		"\u0777\7\u008a\2\2\u076f\u0777\5\u00acW\2\u0770\u0777\7\u008b\2\2\u0771"+
		"\u0777\7\u008c\2\2\u0772\u0777\7\u0093\2\2\u0773\u0777\7\u0086\2\2\u0774"+
		"\u0777\7\u008e\2\2\u0775\u0777\7\u0089\2\2\u0776\u076d\3\2\2\2\u0776\u076e"+
		"\3\2\2\2\u0776\u076f\3\2\2\2\u0776\u0770\3\2\2\2\u0776\u0771\3\2\2\2\u0776"+
		"\u0772\3\2\2\2\u0776\u0773\3\2\2\2\u0776\u0774\3\2\2\2\u0776\u0775\3\2"+
		"\2\2\u0777\u00ab\3\2\2\2\u0778\u077b\5\u00aeX\2\u0779\u077b\5\u00b0Y\2"+
		"\u077a\u0778\3\2\2\2\u077a\u0779\3\2\2\2\u077b\u00ad\3\2\2\2\u077c\u0781"+
		"\7\u0084\2\2\u077d\u0780\5\u00b2Z\2\u077e\u0780\5\u00b4[\2\u077f\u077d"+
		"\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0783\3\2\2\2\u0781\u077f\3\2\2\2\u0781"+
		"\u0782\3\2\2\2\u0782\u0784\3\2\2\2\u0783\u0781\3\2\2\2\u0784\u0785\7\u009e"+
		"\2\2\u0785\u00af\3\2\2\2\u0786\u078d\7\u0085\2\2\u0787\u078c\5\u00b6\\"+
		"\2\u0788\u078c\5\u00b8]\2\u0789\u078c\5\u00aeX\2\u078a\u078c\7\u00a4\2"+
		"\2\u078b\u0787\3\2\2\2\u078b\u0788\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078a"+
		"\3\2\2\2\u078c\u078f\3\2\2\2\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e"+
		"\u0790\3\2\2\2\u078f\u078d\3\2\2\2\u0790\u0791\7\u00a3\2\2\u0791\u00b1"+
		"\3\2\2\2\u0792\u0793\t\5\2\2\u0793\u00b3\3\2\2\2\u0794\u0795\7\u00a2\2"+
		"\2\u0795\u0796\5z>\2\u0796\u0797\7\20\2\2\u0797\u00b5\3\2\2\2\u0798\u0799"+
		"\t\6\2\2\u0799\u00b7\3\2\2\2\u079a\u079b\7\u00a8\2\2\u079b\u079c\5z>\2"+
		"\u079c\u079d\7\20\2\2\u079d\u00b9\3\2\2\2\u079e\u07a0\5\u0118\u008d\2"+
		"\u079f\u079e\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2"+
		"\3\2\2\2\u07a2\u07d2\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4\u07a8\7\17\2\2"+
		"\u07a5\u07a7\7\7\2\2\u07a6\u07a5\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6"+
		"\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ab\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab"+
		"\u07af\5r:\2\u07ac\u07ae\7\7\2\2\u07ad\u07ac\3\2\2\2\u07ae\u07b1\3\2\2"+
		"\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07af"+
		"\3\2\2\2\u07b2\u07b3\7\20\2\2\u07b3\u07d3\3\2\2\2\u07b4\u07b8\7\17\2\2"+
		"\u07b5\u07b7\7\7\2\2\u07b6\u07b5\3\2\2\2\u07b7\u07ba\3\2\2\2\u07b8\u07b6"+
		"\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07bb\3\2\2\2\u07ba\u07b8\3\2\2\2\u07bb"+
		"\u07bf\5\u00bc_\2\u07bc\u07be\7\7\2\2\u07bd\u07bc\3\2\2\2\u07be\u07c1"+
		"\3\2\2\2\u07bf\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c2\3\2\2\2\u07c1"+
		"\u07bf\3\2\2\2\u07c2\u07c6\7#\2\2\u07c3\u07c5\7\7\2\2\u07c4\u07c3\3\2"+
		"\2\2\u07c5\u07c8\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u07c9\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c9\u07cd\5r:\2\u07ca\u07cc\7\7\2"+
		"\2\u07cb\u07ca\3\2\2\2\u07cc\u07cf\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce"+
		"\3\2\2\2\u07ce\u07d0\3\2\2\2\u07cf\u07cd\3\2\2\2\u07d0\u07d1\7\20\2\2"+
		"\u07d1\u07d3\3\2\2\2\u07d2\u07a4\3\2\2\2\u07d2\u07b4\3\2\2\2\u07d3\u00bb"+
		"\3\2\2\2\u07d4\u07d6\5\u00be`\2\u07d5\u07d4\3\2\2\2\u07d5\u07d6\3\2\2"+
		"\2\u07d6\u07e7\3\2\2\2\u07d7\u07d9\7\7\2\2\u07d8\u07d7\3\2\2\2\u07d9\u07dc"+
		"\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dd\3\2\2\2\u07dc"+
		"\u07da\3\2\2\2\u07dd\u07e1\7\n\2\2\u07de\u07e0\7\7\2\2\u07df\u07de\3\2"+
		"\2\2\u07e0\u07e3\3\2\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2"+
		"\u07e4\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e4\u07e6\5\u00be`\2\u07e5\u07da"+
		"\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8"+
		"\u00bd\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea\u07fd\5H%\2\u07eb\u07fa\5F$\2"+
		"\u07ec\u07ee\7\7\2\2\u07ed\u07ec\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed"+
		"\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2"+
		"\u07f6\7\33\2\2\u07f3\u07f5\7\7\2\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8\3"+
		"\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8"+
		"\u07f6\3\2\2\2\u07f9\u07fb\5T+\2\u07fa\u07ef\3\2\2\2\u07fa\u07fb\3\2\2"+
		"\2\u07fb\u07fd\3\2\2\2\u07fc\u07ea\3\2\2\2\u07fc\u07eb\3\2\2\2\u07fd\u00bf"+
		"\3\2\2\2\u07fe\u080d\7A\2\2\u07ff\u0801\7\7\2\2\u0800\u07ff\3\2\2\2\u0801"+
		"\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\3\2"+
		"\2\2\u0804\u0802\3\2\2\2\u0805\u0809\7\33\2\2\u0806\u0808\7\7\2\2\u0807"+
		"\u0806\3\2\2\2\u0808\u080b\3\2\2\2\u0809\u0807\3\2\2\2\u0809\u080a\3\2"+
		"\2\2\u080a\u080c\3\2\2\2\u080b\u0809\3\2\2\2\u080c\u080e\5\36\20\2\u080d"+
		"\u0802\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0812\3\2\2\2\u080f\u0811\7\7"+
		"\2\2\u0810\u080f\3\2\2\2\u0811\u0814\3\2\2\2\u0812\u0810\3\2\2\2\u0812"+
		"\u0813\3\2\2\2\u0813\u0815\3\2\2\2\u0814\u0812\3\2\2\2\u0815\u0816\5&"+
		"\24\2\u0816\u00c1\3\2\2\2\u0817\u0819\7\r\2\2\u0818\u081a\5z>\2\u0819"+
		"\u0818\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081f\3\2\2\2\u081b\u081c\7\n"+
		"\2\2\u081c\u081e\5z>\2\u081d\u081b\3\2\2\2\u081e\u0821\3\2\2\2\u081f\u081d"+
		"\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0822\3\2\2\2\u0821\u081f\3\2\2\2\u0822"+
		"\u0823\7\16\2\2\u0823\u00c3\3\2\2\2\u0824\u0826\7I\2\2\u0825\u0827\7\u0090"+
		"\2\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u00c5\3\2\2\2\u0828"+
		"\u0839\7J\2\2\u0829\u082d\7.\2\2\u082a\u082c\7\7\2\2\u082b\u082a\3\2\2"+
		"\2\u082c\u082f\3\2\2\2\u082d\u082b\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0830"+
		"\3\2\2\2\u082f\u082d\3\2\2\2\u0830\u0834\5T+\2\u0831\u0833\7\7\2\2\u0832"+
		"\u0831\3\2\2\2\u0833\u0836\3\2\2\2\u0834\u0832\3\2\2\2\u0834\u0835\3\2"+
		"\2\2\u0835\u0837\3\2\2\2\u0836\u0834\3\2\2\2\u0837\u0838\7/\2\2\u0838"+
		"\u083a\3\2\2\2\u0839\u0829\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\3\2"+
		"\2\2\u083b\u083d\7\u0090\2\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d"+
		"\u00c7\3\2\2\2\u083e\u0841\5\u00caf\2\u083f\u0841\5\u00ceh\2\u0840\u083e"+
		"\3\2\2\2\u0840\u083f\3\2\2\2\u0841\u00c9\3\2\2\2\u0842\u0846\7M\2\2\u0843"+
		"\u0845\7\7\2\2\u0844\u0843\3\2\2\2\u0845\u0848\3\2\2\2\u0846\u0844\3\2"+
		"\2\2\u0846\u0847\3\2\2\2\u0847\u0849\3\2\2\2\u0848\u0846\3\2\2\2\u0849"+
		"\u084a\7\13\2\2\u084a\u084b\5z>\2\u084b\u084f\7\f\2\2\u084c\u084e\7\7"+
		"\2\2\u084d\u084c\3\2\2\2\u084e\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0853\3\2\2\2\u0851\u084f\3\2\2\2\u0852\u0854\5\u00cc"+
		"g\2\u0853\u0852\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0856\3\2\2\2\u0855"+
		"\u0857\7\34\2\2\u0856\u0855\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0868\3"+
		"\2\2\2\u0858\u085a\7\7\2\2\u0859\u0858\3\2\2\2\u085a\u085d\3\2\2\2\u085b"+
		"\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\3\2\2\2\u085d\u085b\3\2"+
		"\2\2\u085e\u0862\7N\2\2\u085f\u0861\7\7\2\2\u0860\u085f\3\2\2\2\u0861"+
		"\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0866\3\2"+
		"\2\2\u0864\u0862\3\2\2\2\u0865\u0867\5\u00ccg\2\u0866\u0865\3\2\2\2\u0866"+
		"\u0867\3\2\2\2\u0867\u0869\3\2\2\2\u0868\u085b\3\2\2\2\u0868\u0869\3\2"+
		"\2\2\u0869\u00cb\3\2\2\2\u086a\u086d\5p9\2\u086b\u086d\5z>\2\u086c\u086a"+
		"\3\2\2\2\u086c\u086b\3\2\2\2\u086d\u00cd\3\2\2\2\u086e\u0872\7O\2\2\u086f"+
		"\u0871\7\7\2\2\u0870\u086f\3\2\2\2\u0871\u0874\3\2\2\2\u0872\u0870\3\2"+
		"\2\2\u0872\u0873\3\2\2\2\u0873\u0879\3\2\2\2\u0874\u0872\3\2\2\2\u0875"+
		"\u0876\7\13\2\2\u0876\u0877\5z>\2\u0877\u0878\7\f\2\2\u0878\u087a\3\2"+
		"\2\2\u0879\u0875\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087e\3\2\2\2\u087b"+
		"\u087d\7\7\2\2\u087c\u087b\3\2\2\2\u087d\u0880\3\2\2\2\u087e\u087c\3\2"+
		"\2\2\u087e\u087f\3\2\2\2\u087f\u0881\3\2\2\2\u0880\u087e\3\2\2\2\u0881"+
		"\u0885\7\17\2\2\u0882\u0884\7\7\2\2\u0883\u0882\3\2\2\2\u0884\u0887\3"+
		"\2\2\2\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0891\3\2\2\2\u0887"+
		"\u0885\3\2\2\2\u0888\u088c\5\u00d0i\2\u0889\u088b\7\7\2\2\u088a\u0889"+
		"\3\2\2\2\u088b\u088e\3\2\2\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d"+
		"\u0890\3\2\2\2\u088e\u088c\3\2\2\2\u088f\u0888\3\2\2\2\u0890\u0893\3\2"+
		"\2\2\u0891\u088f\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0897\3\2\2\2\u0893"+
		"\u0891\3\2\2\2\u0894\u0896\7\7\2\2\u0895\u0894\3\2\2\2\u0896\u0899\3\2"+
		"\2\2\u0897\u0895\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u089a\3\2\2\2\u0899"+
		"\u0897\3\2\2\2\u089a\u089b\7\20\2\2\u089b\u00cf\3\2\2\2\u089c\u08ad\5"+
		"\u00d2j\2\u089d\u089f\7\7\2\2\u089e\u089d\3\2\2\2\u089f\u08a2\3\2\2\2"+
		"\u08a0\u089e\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a3\3\2\2\2\u08a2\u08a0"+
		"\3\2\2\2\u08a3\u08a7\7\n\2\2\u08a4\u08a6\7\7\2\2\u08a5\u08a4\3\2\2\2\u08a6"+
		"\u08a9\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08aa\3\2"+
		"\2\2\u08a9\u08a7\3\2\2\2\u08aa\u08ac\5\u00d2j\2\u08ab\u08a0\3\2\2\2\u08ac"+
		"\u08af\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b3\3\2"+
		"\2\2\u08af\u08ad\3\2\2\2\u08b0\u08b2\7\7\2\2\u08b1\u08b0\3\2\2\2\u08b2"+
		"\u08b5\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\3\2"+
		"\2\2\u08b5\u08b3\3\2\2\2\u08b6\u08ba\7#\2\2\u08b7\u08b9\7\7\2\2\u08b8"+
		"\u08b7\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb\3\2"+
		"\2\2\u08bb\u08bd\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bd\u08bf\5\u00ccg\2\u08be"+
		"\u08c0\5\u0126\u0094\2\u08bf\u08be\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08d1"+
		"\3\2\2\2\u08c1\u08c5\7N\2\2\u08c2\u08c4\7\7\2\2\u08c3\u08c2\3\2\2\2\u08c4"+
		"\u08c7\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c8\3\2"+
		"\2\2\u08c7\u08c5\3\2\2\2\u08c8\u08cc\7#\2\2\u08c9\u08cb\7\7\2\2\u08ca"+
		"\u08c9\3\2\2\2\u08cb\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd\3\2"+
		"\2\2\u08cd\u08cf\3\2\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08d1\5\u00ccg\2\u08d0"+
		"\u089c\3\2\2\2\u08d0\u08c1\3\2\2\2\u08d1\u00d1\3\2\2\2\u08d2\u08d6\5z"+
		">\2\u08d3\u08d6\5\u00d4k\2\u08d4\u08d6\5\u00d6l\2\u08d5\u08d2\3\2\2\2"+
		"\u08d5\u08d3\3\2\2\2\u08d5\u08d4\3\2\2\2\u08d6\u00d3\3\2\2\2\u08d7\u08db"+
		"\5\u00f0y\2\u08d8\u08da\7\7\2\2\u08d9\u08d8\3\2\2\2\u08da\u08dd\3\2\2"+
		"\2\u08db\u08d9\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08de\3\2\2\2\u08dd\u08db"+
		"\3\2\2\2\u08de\u08df\5z>\2\u08df\u00d5\3\2\2\2\u08e0\u08e4\5\u00f2z\2"+
		"\u08e1\u08e3\7\7\2\2\u08e2\u08e1\3\2\2\2\u08e3\u08e6\3\2\2\2\u08e4\u08e2"+
		"\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e7\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e7"+
		"\u08e8\5T+\2\u08e8\u00d7\3\2\2\2\u08e9\u08ed\7P\2\2\u08ea\u08ec\7\7\2"+
		"\2\u08eb\u08ea\3\2\2\2\u08ec\u08ef\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ed\u08ee"+
		"\3\2\2\2\u08ee\u08f0\3\2\2\2\u08ef\u08ed\3\2\2\2\u08f0\u08fa\5p9\2\u08f1"+
		"\u08f3\7\7\2\2\u08f2\u08f1\3\2\2\2\u08f3\u08f6\3\2\2\2\u08f4\u08f2\3\2"+
		"\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f7\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f7"+
		"\u08f9\5\u00dan\2\u08f8\u08f4\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa\u08f8"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u0904\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fd"+
		"\u08ff\7\7\2\2\u08fe\u08fd\3\2\2\2\u08ff\u0902\3\2\2\2\u0900\u08fe\3\2"+
		"\2\2\u0900\u0901\3\2\2\2\u0901\u0903\3\2\2\2\u0902\u0900\3\2\2\2\u0903"+
		"\u0905\5\u00dco\2\u0904\u0900\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u00d9"+
		"\3\2\2\2\u0906\u090a\7Q\2\2\u0907\u0909\7\7\2\2\u0908\u0907\3\2\2\2\u0909"+
		"\u090c\3\2\2\2\u090a\u0908\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090d\3\2"+
		"\2\2\u090c\u090a\3\2\2\2\u090d\u0911\7\13\2\2\u090e\u0910\5\u0118\u008d"+
		"\2\u090f\u090e\3\2\2\2\u0910\u0913\3\2\2\2\u0911\u090f\3\2\2\2\u0911\u0912"+
		"\3\2\2\2\u0912\u0914\3\2\2\2\u0913\u0911\3\2\2\2\u0914\u0915\5\u0124\u0093"+
		"\2\u0915\u0916\7\33\2\2\u0916\u0917\5d\63\2\u0917\u091b\7\f\2\2\u0918"+
		"\u091a\7\7\2\2\u0919\u0918\3\2\2\2\u091a\u091d\3\2\2\2\u091b\u0919\3\2"+
		"\2\2\u091b\u091c\3\2\2\2\u091c\u091e\3\2\2\2\u091d\u091b\3\2\2\2\u091e"+
		"\u091f\5p9\2\u091f\u00db\3\2\2\2\u0920\u0924\7R\2\2\u0921\u0923\7\7\2"+
		"\2\u0922\u0921\3\2\2\2\u0923\u0926\3\2\2\2\u0924\u0922\3\2\2\2\u0924\u0925"+
		"\3\2\2\2\u0925\u0927\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0926\u0924\3\2\2\2\u0927\u0928\5p9\2\u0928\u00dd\3\2\2\2\u0929"+
		"\u092d\5\u00e0q\2\u092a\u092d\5\u00e2r\2\u092b\u092d\5\u00e4s\2\u092c"+
		"\u0929\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092b\3\2\2\2\u092d\u00df\3\2"+
		"\2\2\u092e\u0932\7S\2\2\u092f\u0931\7\7\2\2\u0930\u092f\3\2\2\2\u0931"+
		"\u0934\3\2\2\2\u0932\u0930\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0935\3\2"+
		"\2\2\u0934\u0932\3\2\2\2\u0935\u0939\7\13\2\2\u0936\u0938\5\u0118\u008d"+
		"\2\u0937\u0936\3\2\2\2\u0938\u093b\3\2\2\2\u0939\u0937\3\2\2\2\u0939\u093a"+
		"\3\2\2\2\u093a\u093e\3\2\2\2\u093b\u0939\3\2\2\2\u093c\u093f\5H%\2\u093d"+
		"\u093f\5F$\2\u093e\u093c\3\2\2\2\u093e\u093d\3\2\2\2\u093f\u0940\3\2\2"+
		"\2\u0940\u0941\7\\\2\2\u0941\u0942\5z>\2\u0942\u0946\7\f\2\2\u0943\u0945"+
		"\7\7\2\2\u0944\u0943\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0944\3\2\2\2\u0946"+
		"\u0947\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946\3\2\2\2\u0949\u094b\5\u00cc"+
		"g\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u00e1\3\2\2\2\u094c"+
		"\u0950\7U\2\2\u094d\u094f\7\7\2\2\u094e\u094d\3\2\2\2\u094f\u0952\3\2"+
		"\2\2\u0950\u094e\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0953\3\2\2\2\u0952"+
		"\u0950\3\2\2\2\u0953\u0954\7\13\2\2\u0954\u0955\5z>\2\u0955\u0959\7\f"+
		"\2\2\u0956\u0958\7\7\2\2\u0957\u0956\3\2\2\2\u0958\u095b\3\2\2\2\u0959"+
		"\u0957\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2"+
		"\2\2\u095c\u095e\5\u00ccg\2\u095d\u095c\3\2\2\2\u095d\u095e\3\2\2\2\u095e"+
		"\u00e3\3\2\2\2\u095f\u0963\7T\2\2\u0960\u0962\7\7\2\2\u0961\u0960\3\2"+
		"\2\2\u0962\u0965\3\2\2\2\u0963\u0961\3\2\2\2\u0963\u0964\3\2\2\2\u0964"+
		"\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0966\u0968\5\u00ccg\2\u0967\u0966"+
		"\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u096c\3\2\2\2\u0969\u096b\7\7\2\2\u096a"+
		"\u0969\3\2\2\2\u096b\u096e\3\2\2\2\u096c\u096a\3\2\2\2\u096c\u096d\3\2"+
		"\2\2\u096d\u096f\3\2\2\2\u096e\u096c\3\2\2\2\u096f\u0973\7U\2\2\u0970"+
		"\u0972\7\7\2\2\u0971\u0970\3\2\2\2\u0972\u0975\3\2\2\2\u0973\u0971\3\2"+
		"\2\2\u0973\u0974\3\2\2\2\u0974\u0976\3\2\2\2\u0975\u0973\3\2\2\2\u0976"+
		"\u0977\7\13\2\2\u0977\u0978\5z>\2\u0978\u0979\7\f\2\2\u0979\u00e5\3\2"+
		"\2\2\u097a\u097e\7V\2\2\u097b\u097d\7\7\2\2\u097c\u097b\3\2\2\2\u097d"+
		"\u0980\3\2\2\2\u097e\u097c\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0981\3\2"+
		"\2\2\u0980\u097e\3\2\2\2\u0981\u098b\5z>\2\u0982\u0984\t\7\2\2\u0983\u0985"+
		"\5z>\2\u0984\u0983\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u098b\3\2\2\2\u0986"+
		"\u098b\7X\2\2\u0987\u098b\79\2\2\u0988\u098b\7Y\2\2\u0989\u098b\7:\2\2"+
		"\u098a\u097a\3\2\2\2\u098a\u0982\3\2\2\2\u098a\u0986\3\2\2\2\u098a\u0987"+
		"\3\2\2\2\u098a\u0988\3\2\2\2\u098a\u0989\3\2\2\2\u098b\u00e7\3\2\2\2\u098c"+
		"\u0996\5d\63\2\u098d\u0991\7,\2\2\u098e\u0990\7\7\2\2\u098f\u098e\3\2"+
		"\2\2\u0990\u0993\3\2\2\2\u0991\u098f\3\2\2\2\u0991\u0992\3\2\2\2\u0992"+
		"\u0995\3\2\2\2\u0993\u0991\3\2\2\2\u0994\u098d\3\2\2\2\u0995\u0998\3\2"+
		"\2\2\u0996\u0994\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u099a\3\2\2\2\u0998"+
		"\u0996\3\2\2\2\u0999\u098c\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099e\3\2"+
		"\2\2\u099b\u099d\7\7\2\2\u099c\u099b\3\2\2\2\u099d\u09a0\3\2\2\2\u099e"+
		"\u099c\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a1\3\2\2\2\u09a0\u099e\3\2"+
		"\2\2\u09a1\u09a5\t\b\2\2\u09a2\u09a4\7\7\2\2\u09a3\u09a2\3\2\2\2\u09a4"+
		"\u09a7\3\2\2\2\u09a5\u09a3\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09aa\3\2"+
		"\2\2\u09a7\u09a5\3\2\2\2\u09a8\u09ab\5\u0122\u0092\2\u09a9\u09ab\7>\2"+
		"\2\u09aa\u09a8\3\2\2\2\u09aa\u09a9\3\2\2\2\u09ab\u00e9\3\2\2\2\u09ac\u09ad"+
		"\t\t\2\2\u09ad\u00eb\3\2\2\2\u09ae\u09af\t\n\2\2\u09af\u00ed\3\2\2\2\u09b0"+
		"\u09b1\t\13\2\2\u09b1\u00ef\3\2\2\2\u09b2\u09b3\t\f\2\2\u09b3\u00f1\3"+
		"\2\2\2\u09b4\u09b5\t\r\2\2\u09b5\u00f3\3\2\2\2\u09b6\u09b7\t\16\2\2\u09b7"+
		"\u00f5\3\2\2\2\u09b8\u09b9\t\17\2\2\u09b9\u00f7\3\2\2\2\u09ba\u09bb\t"+
		"\20\2\2\u09bb\u00f9\3\2\2\2\u09bc\u09c4\7\26\2\2\u09bd\u09c4\7\27\2\2"+
		"\u09be\u09c4\7\24\2\2\u09bf\u09c4\7\25\2\2\u09c0\u09c4\7\32\2\2\u09c1"+
		"\u09c4\5\u0118\u008d\2\u09c2\u09c4\5\u0116\u008c\2\u09c3\u09bc\3\2\2\2"+
		"\u09c3\u09bd\3\2\2\2\u09c3\u09be\3\2\2\2\u09c3\u09bf\3\2\2\2\u09c3\u09c0"+
		"\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c3\u09c2\3\2\2\2\u09c4\u00fb\3\2\2\2\u09c5"+
		"\u09d5\7\26\2\2\u09c6\u09d5\7\27\2\2\u09c7\u09c8\7\32\2\2\u09c8\u09d5"+
		"\7\32\2\2\u09c9\u09d5\5\u009aN\2\u09ca\u09d5\5\u009eP\2\u09cb\u09cd\7"+
		"\7\2\2\u09cc\u09cb\3\2\2\2\u09cd\u09d0\3\2\2\2\u09ce\u09cc\3\2\2\2\u09ce"+
		"\u09cf\3\2\2\2\u09cf\u09d1\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d1\u09d2\5\u00fe"+
		"\u0080\2\u09d2\u09d3\5\u0094K\2\u09d3\u09d5\3\2\2\2\u09d4\u09c5\3\2\2"+
		"\2\u09d4\u09c6\3\2\2\2\u09d4\u09c7\3\2\2\2\u09d4\u09c9\3\2\2\2\u09d4\u09ca"+
		"\3\2\2\2\u09d4\u09ce\3\2\2\2\u09d5\u00fd\3\2\2\2\u09d6\u09da\7\t\2\2\u09d7"+
		"\u09d8\7,\2\2\u09d8\u09da\7\t\2\2\u09d9\u09d6\3\2\2\2\u09d9\u09d7\3\2"+
		"\2\2\u09da\u00ff\3\2\2\2\u09db\u09de\5\u0118\u008d\2\u09dc\u09de\5\u0102"+
		"\u0082\2\u09dd\u09db\3\2\2\2\u09dd\u09dc\3\2\2\2\u09de\u09df\3\2\2\2\u09df"+
		"\u09dd\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u0101\3\2\2\2\u09e1\u09eb\5\u0104"+
		"\u0083\2\u09e2\u09eb\5\u0106\u0084\2\u09e3\u09eb\5\u0108\u0085\2\u09e4"+
		"\u09eb\5\u010a\u0086\2\u09e5\u09eb\5\u010c\u0087\2\u09e6\u09eb\5\u010e"+
		"\u0088\2\u09e7\u09eb\5\u0110\u0089\2\u09e8\u09eb\5\u0112\u008a\2\u09e9"+
		"\u09eb\5\u0114\u008b\2\u09ea\u09e1\3\2\2\2\u09ea\u09e2\3\2\2\2\u09ea\u09e3"+
		"\3\2\2\2\u09ea\u09e4\3\2\2\2\u09ea\u09e5\3\2\2\2\u09ea\u09e6\3\2\2\2\u09ea"+
		"\u09e7\3\2\2\2\u09ea\u09e8\3\2\2\2\u09ea\u09e9\3\2\2\2\u09eb\u09ef\3\2"+
		"\2\2\u09ec\u09ee\7\7\2\2\u09ed\u09ec\3\2\2\2\u09ee\u09f1\3\2\2\2\u09ef"+
		"\u09ed\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u0103\3\2\2\2\u09f1\u09ef\3\2"+
		"\2\2\u09f2\u09f3\t\21\2\2\u09f3\u0105\3\2\2\2\u09f4\u09f5\t\22\2\2\u09f5"+
		"\u0107\3\2\2\2\u09f6\u09f7\t\23\2\2\u09f7\u0109\3\2\2\2\u09f8\u09f9\t"+
		"\24\2\2\u09f9\u010b\3\2\2\2\u09fa\u09fb\t\25\2\2\u09fb\u010d\3\2\2\2\u09fc"+
		"\u09fd\7~\2\2\u09fd\u010f\3\2\2\2\u09fe\u09ff\t\26\2\2\u09ff\u0111\3\2"+
		"\2\2\u0a00\u0a01\t\27\2\2\u0a01\u0113\3\2\2\2\u0a02\u0a03\7\u0083\2\2"+
		"\u0a03\u0115\3\2\2\2\u0a04\u0a08\7\u0091\2\2\u0a05\u0a07\7\7\2\2\u0a06"+
		"\u0a05\3\2\2\2\u0a07\u0a0a\3\2\2\2\u0a08\u0a06\3\2\2\2\u0a08\u0a09\3\2"+
		"\2\2\u0a09\u0117\3\2\2\2\u0a0a\u0a08\3\2\2\2\u0a0b\u0a0e\5\u011a\u008e"+
		"\2\u0a0c\u0a0e\5\u011c\u008f\2\u0a0d\u0a0b\3\2\2\2\u0a0d\u0a0c\3\2\2\2"+
		"\u0a0e\u0a12\3\2\2\2\u0a0f\u0a11\7\7\2\2\u0a10\u0a0f\3\2\2\2\u0a11\u0a14"+
		"\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0119\3\2\2\2\u0a14"+
		"\u0a12\3\2\2\2\u0a15\u0a19\5\u011e\u0090\2\u0a16\u0a18\7\7\2\2\u0a17\u0a16"+
		"\3\2\2\2\u0a18\u0a1b\3\2\2\2\u0a19\u0a17\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a"+
		"\u0a1c\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1c\u0a20\7\33\2\2\u0a1d\u0a1f\7"+
		"\7\2\2\u0a1e\u0a1d\3\2\2\2\u0a1f\u0a22\3\2\2\2\u0a20\u0a1e\3\2\2\2\u0a20"+
		"\u0a21\3\2\2\2\u0a21\u0a23\3\2\2\2\u0a22\u0a20\3\2\2\2\u0a23\u0a24\5\u0120"+
		"\u0091\2\u0a24\u0a39\3\2\2\2\u0a25\u0a2d\7\u0090\2\2\u0a26\u0a28\7\7\2"+
		"\2\u0a27\u0a26\3\2\2\2\u0a28\u0a2b\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29\u0a2a"+
		"\3\2\2\2\u0a2a\u0a2c\3\2\2\2\u0a2b\u0a29\3\2\2\2\u0a2c\u0a2e\5\u00a2R"+
		"\2\u0a2d\u0a29\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a36\3\2\2\2\u0a2f\u0a31"+
		"\7\7\2\2\u0a30\u0a2f\3\2\2\2\u0a31\u0a34\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a32"+
		"\u0a33\3\2\2\2\u0a33\u0a35\3\2\2\2\u0a34\u0a32\3\2\2\2\u0a35\u0a37\5\u00a0"+
		"Q\2\u0a36\u0a32\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a39\3\2\2\2\u0a38"+
		"\u0a15\3\2\2\2\u0a38\u0a25\3\2\2\2\u0a39\u011b\3\2\2\2\u0a3a\u0a3b\5\u011e"+
		"\u0090\2\u0a3b\u0a3c\7\33\2\2\u0a3c\u0a3e\7\r\2\2\u0a3d\u0a3f\5\u0120"+
		"\u0091\2\u0a3e\u0a3d\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a40"+
		"\u0a41\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a43\7\16\2\2\u0a43\u0a4e\3"+
		"\2\2\2\u0a44\u0a45\7*\2\2\u0a45\u0a47\7\r\2\2\u0a46\u0a48\5\u0120\u0091"+
		"\2\u0a47\u0a46\3\2\2\2\u0a48\u0a49\3\2\2\2\u0a49\u0a47\3\2\2\2\u0a49\u0a4a"+
		"\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u0a4c\7\16\2\2\u0a4c\u0a4e\3\2\2\2"+
		"\u0a4d\u0a3a\3\2\2\2\u0a4d\u0a44\3\2\2\2\u0a4e\u011d\3\2\2\2\u0a4f\u0a50"+
		"\t\30\2\2\u0a50\u011f\3\2\2\2\u0a51\u0a53\5\u0122\u0092\2\u0a52\u0a54"+
		"\5\u00a2R\2\u0a53\u0a52\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a56\3\2\2"+
		"\2\u0a55\u0a57\5\u00a0Q\2\u0a56\u0a55\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57"+
		"\u0121\3\2\2\2\u0a58\u0a63\5\u0124\u0093\2\u0a59\u0a5b\7\7\2\2\u0a5a\u0a59"+
		"\3\2\2\2\u0a5b\u0a5e\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d"+
		"\u0a5f\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5f\u0a60\7\t\2\2\u0a60\u0a62\5\u0124"+
		"\u0093\2\u0a61\u0a5c\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a63"+
		"\u0a64\3\2\2\2\u0a64\u0123\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a66\u0a67\t\31"+
		"\2\2\u0a67\u0125\3\2\2\2\u0a68\u0a6a\7\7\2\2\u0a69\u0a68\3\2\2\2\u0a6a"+
		"\u0a6b\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a7b\3\2"+
		"\2\2\u0a6d\u0a6f\7\7\2\2\u0a6e\u0a6d\3\2\2\2\u0a6f\u0a72\3\2\2\2\u0a70"+
		"\u0a6e\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a73\3\2\2\2\u0a72\u0a70\3\2"+
		"\2\2\u0a73\u0a77\7\34\2\2\u0a74\u0a76\7\7\2\2\u0a75\u0a74\3\2\2\2\u0a76"+
		"\u0a79\3\2\2\2\u0a77\u0a75\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a7b\3\2"+
		"\2\2\u0a79\u0a77\3\2\2\2\u0a7a\u0a69\3\2\2\2\u0a7a\u0a70\3\2\2\2\u0a7b"+
		"\u0127\3\2\2\2\u0a7c\u0a7d\t\32\2\2\u0a7d\u0129\3\2\2\2\u0197\u012d\u0134"+
		"\u013b\u013e\u0142\u0145\u014c\u0153\u015a\u015d\u0161\u0164\u0169\u0171"+
		"\u0179\u017e\u0181\u0185\u0188\u018d\u018f\u0194\u019c\u019f\u01a9\u01ac"+
		"\u01b2\u01b9\u01bd\u01c2\u01c6\u01cb\u01d2\u01d6\u01db\u01df\u01e4\u01eb"+
		"\u01ef\u01f2\u01f8\u01fb\u0205\u0208\u020d\u0210\u0217\u021c\u0223\u022a"+
		"\u0230\u0236\u023f\u0246\u024f\u0255\u025b\u0268\u026d\u0274\u027a\u0280"+
		"\u0287\u028e\u0292\u0297\u02a0\u02a8\u02ac\u02b2\u02b6\u02bb\u02c2\u02c8"+
		"\u02cb\u02d0\u02d9\u02de\u02e1\u02e7\u02eb\u02f0\u02f4\u02f9\u02fd\u0300"+
		"\u0306\u030d\u0312\u0317\u031b\u0320\u0324\u0329\u032e\u0333\u033a\u0341"+
		"\u0345\u034a\u034e\u0353\u0357\u035f\u0362\u0367\u036c\u0377\u037b\u037e"+
		"\u0384\u038b\u038f\u0394\u039b\u039f\u03a4\u03a8\u03ab\u03b1\u03b5\u03bb"+
		"\u03bf\u03c4\u03cb\u03cf\u03d4\u03d8\u03db\u03e1\u03e5\u03ea\u03f1\u03f6"+
		"\u03fb\u0400\u0405\u0409\u040e\u0415\u0419\u041f\u0425\u0427\u042f\u0437"+
		"\u043a\u043e\u0444\u044c\u0453\u0457\u045c\u0464\u0468\u046a\u046d\u0471"+
		"\u0477\u047d\u047f\u0484\u048a\u048f\u0492\u0498\u049f\u04a3\u04a8\u04af"+
		"\u04b8\u04bf\u04c6\u04cc\u04d2\u04d8\u04dd\u04e4\u04eb\u04f2\u04f5\u04f8"+
		"\u04fe\u0505\u0508\u050a\u0512\u0517\u051d\u0525\u052a\u052f\u0532\u0536"+
		"\u053e\u0545\u0548\u054e\u0555\u055d\u0563\u056a\u0570\u0577\u057b\u0580"+
		"\u0583\u0588\u058d\u0591\u059a\u05a1\u05a8\u05ae\u05b4\u05bb\u05c2\u05ce"+
		"\u05d5\u05d8\u05dc\u05df\u05e3\u05e8\u05ee\u05f6\u05fd\u0605\u060c\u0613"+
		"\u0619\u0620\u0627\u062d\u0635\u063c\u0644\u0649\u0650\u0657\u065d\u0662"+
		"\u0668\u066f\u0675\u067d\u0684\u068c\u0692\u069a\u06a1\u06a9\u06b0\u06b7"+
		"\u06bf\u06c5\u06cc\u06d1\u06e0\u06e8\u06ed\u06f4\u06fa\u06fc\u0701\u0705"+
		"\u070a\u0715\u0718\u0722\u0725\u072d\u0734\u073b\u0741\u0747\u074b\u0750"+
		"\u0756\u075d\u0760\u0763\u0768\u0776\u077a\u077f\u0781\u078b\u078d\u07a1"+
		"\u07a8\u07af\u07b8\u07bf\u07c6\u07cd\u07d2\u07d5\u07da\u07e1\u07e7\u07ef"+
		"\u07f6\u07fa\u07fc\u0802\u0809\u080d\u0812\u0819\u081f\u0826\u082d\u0834"+
		"\u0839\u083c\u0840\u0846\u084f\u0853\u0856\u085b\u0862\u0866\u0868\u086c"+
		"\u0872\u0879\u087e\u0885\u088c\u0891\u0897\u08a0\u08a7\u08ad\u08b3\u08ba"+
		"\u08bf\u08c5\u08cc\u08d0\u08d5\u08db\u08e4\u08ed\u08f4\u08fa\u0900\u0904"+
		"\u090a\u0911\u091b\u0924\u092c\u0932\u0939\u093e\u0946\u094a\u0950\u0959"+
		"\u095d\u0963\u0967\u096c\u0973\u097e\u0984\u098a\u0991\u0996\u0999\u099e"+
		"\u09a5\u09aa\u09c3\u09ce\u09d4\u09d9\u09dd\u09df\u09ea\u09ef\u0a08\u0a0d"+
		"\u0a12\u0a19\u0a20\u0a29\u0a2d\u0a32\u0a36\u0a38\u0a40\u0a49\u0a4d\u0a53"+
		"\u0a56\u0a5c\u0a63\u0a6b\u0a70\u0a77\u0a7a";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}