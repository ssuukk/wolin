// Generated from D:/Projekty/kotlinek/src/main/antlr\KotlinParser.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ShebangLine=1, DelimitedComment=2, LineComment=3, WS=4, NL=5, RESERVED=6, 
		DOT=7, COMMA=8, LPAREN=9, RPAREN=10, LSQUARE=11, RSQUARE=12, LCURL=13, 
		RCURL=14, MULT=15, MOD=16, DIV=17, ADD=18, SUB=19, INCR=20, DECR=21, CONJ=22, 
		DISJ=23, EXCL=24, COLON=25, SEMICOLON=26, ASSIGNMENT=27, ADD_ASSIGNMENT=28, 
		SUB_ASSIGNMENT=29, MULT_ASSIGNMENT=30, DIV_ASSIGNMENT=31, MOD_ASSIGNMENT=32, 
		BIT_ASSIGNMENT=300, BIT_DEASSIGNMENT=300, BIT_OR=301, BIT_AND=302, BIT_OR_ASSIGNMENT=303, 
		BIT_AND_ASSIGNMENT=304, ARROW=33, DOUBLE_ARROW=34, RANGE=35, CARON=200, 
		COLONCOLON=36, Q_COLONCOLON=37, DOUBLE_SEMICOLON=38, HASH=39, AT=40, QUEST=41, 
		ELVIS=42, LANGLE=43, RANGLE=44, LE=45, GE=46, EXCL_EQ=47, EXCL_EQEQ=48, 
		AS_SAFE=49, EQEQ=50, EQEQEQ=51, SINGLE_QUOTE=52, RETURN_AT=53, CONTINUE_AT=54, 
		BREAK_AT=55, FILE=56, PACKAGE=57, IMPORT=58, CLASS=59, INTERFACE=60, FUN=61, 
		OBJECT=62, VAL=63, VAR=64, TYPE_ALIAS=65, CONSTRUCTOR=66, BY=67, COMPANION=68, 
		INIT=69, THIS=70, SUPER=71, TYPEOF=72, WHERE=73, IF=74, ELSE=75, WHEN=76, 
		TRY=77, CATCH=78, FINALLY=79, FOR=80, DO=81, WHILE=82, THROW=83, RETURN=84, 
		CONTINUE=85, BREAK=86, AS=87, IS=88, IN=89, NOT_IS=90, NOT_IN=91, OUT=92, 
		FIELD=93, PROPERTY=94, GET=95, SET=96, GETTER=97, SETTER=98, RECEIVER=99, 
		PARAM=100, SETPARAM=101, DELEGATE=102, DYNAMIC=103, PUBLIC=104, PRIVATE=105, 
		PROTECTED=106, INTERNAL=107, ENUM=108, SEALED=109, ANNOTATION=110, DATA=111, 
		INNER=112, TAILREC=113, OPERATOR=114, INLINE=115, INFIX=116, EXTERNAL=117, 
		SUSPEND=118, OVERRIDE=119, ABSTRACT=120, FINAL=121, OPEN=122, CONST=123, 
		LATEINIT=124, VARARG=125, NOINLINE=126, CROSSINLINE=127, REIFIED=128, 
		QUOTE_OPEN=129, TRIPLE_QUOTE_OPEN=130, RealLiteral=131, FloatLiteral=132, 
		DoubleLiteral=133, LongLiteral=134, IntegerLiteral=135, HexLiteral=136, 
		BinLiteral=137, BooleanLiteral=138, NullLiteral=139, Identifier=140, LabelReference=141, 
		LabelDefinition=142, FieldIdentifier=143, CharacterLiteral=144, UNICODE_CLASS_LL=145, 
		UNICODE_CLASS_LM=146, UNICODE_CLASS_LO=147, UNICODE_CLASS_LT=148, UNICODE_CLASS_LU=149, 
		UNICODE_CLASS_ND=150, UNICODE_CLASS_NL=151, Inside_Comment=152, Inside_WS=153, 
		Inside_NL=154, QUOTE_CLOSE=155, LineStrRef=156, LineStrText=157, LineStrEscapedChar=158, 
		LineStrExprStart=159, TRIPLE_QUOTE_CLOSE=160, MultiLineStringQuote=161, 
		MultiLineStrRef=162, MultiLineStrText=163, MultiLineStrEscapedChar=164, 
		MultiLineStrExprStart=165, MultiLineNL=166, StrExpr_IN=167, StrExpr_Comment=168, 
		StrExpr_WS=169, StrExpr_NL=170, INTERRUPT=171, ASSEMBLER_INSTRUCTION=500, 
		ASMSTRING=501, ASMNAME=502, ASMNUMBER=503, ASMCOMMENT=504, ADC=505, AND=506, 
		ASL=507, BCC=508, BCS=509, BEQ=510, BIT=511, BMI=512, BNE=513, BPL=514, 
		BRA=515, BRK=516, BVC=517, BVS=518, CLC=519, CLD=520, CLI=521, CLV=522, 
		CMP=523, CPX=524, CPY=525, DEC=526, DEX=527, DEY=528, EOR=529, INC=530, 
		INX=531, INY=532, JMP=533, JSR=534, LDA=535, LDY=536, LDX=537, LSR=538, 
		NOP=539, ORA=540, PHA=541, PHX=542, PHY=543, PHP=544, PLA=545, PLP=546, 
		PLY=547, ROL=548, ROR=549, RTI=550, RTS=551, SBC=552, SEC=553, SED=554, 
		SEI=555, STA=556, STX=557, STY=558, STZ=559, TAX=560, TAY=561, TSX=562, 
		TXA=563, TXS=564, TYA=565;
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
		RULE_asmblock = 56, RULE_statements = 57, RULE_statement = 58, RULE_blockLevelExpression = 59, 
		RULE_declaration = 60, RULE_expression = 61, RULE_disjunction = 62, RULE_conjunction = 63, 
		RULE_equalityComparison = 64, RULE_comparison = 65, RULE_namedInfix = 66, 
		RULE_elvisExpression = 67, RULE_infixFunctionCall = 68, RULE_rangeExpression = 69, 
		RULE_additiveExpression = 70, RULE_multiplicativeExpression = 71, RULE_typeRHS = 72, 
		RULE_prefixUnaryExpression = 73, RULE_postfixUnaryExpression = 74, RULE_atomicExpression = 75, 
		RULE_parenthesizedExpression = 76, RULE_callSuffix = 77, RULE_annotatedLambda = 78, 
		RULE_arrayAccess = 79, RULE_valueArguments = 80, RULE_typeArguments = 81, 
		RULE_typeProjection = 82, RULE_typeProjectionModifierList = 83, RULE_valueArgument = 84, 
		RULE_literalConstant = 85, RULE_stringLiteral = 86, RULE_lineStringLiteral = 87, 
		RULE_multiLineStringLiteral = 88, RULE_lineStringContent = 89, RULE_lineStringExpression = 90, 
		RULE_multiLineStringContent = 91, RULE_multiLineStringExpression = 92, 
		RULE_functionLiteral = 93, RULE_lambdaParameters = 94, RULE_lambdaParameter = 95, 
		RULE_objectLiteral = 96, RULE_collectionLiteral = 97, RULE_thisExpression = 98, 
		RULE_superExpression = 99, RULE_conditionalExpression = 100, RULE_ifExpression = 101, 
		RULE_controlStructureBody = 102, RULE_whenExpression = 103, RULE_whenEntry = 104, 
		RULE_whenCondition = 105, RULE_rangeTest = 106, RULE_typeTest = 107, RULE_tryExpression = 108, 
		RULE_catchBlock = 109, RULE_finallyBlock = 110, RULE_loopExpression = 111, 
		RULE_forExpression = 112, RULE_whileExpression = 113, RULE_doWhileExpression = 114, 
		RULE_jumpExpression = 115, RULE_callableReference = 116, RULE_assignmentOperator = 117, 
		RULE_equalityOperation = 118, RULE_comparisonOperator = 119, RULE_inOperator = 120, 
		RULE_isOperator = 121, RULE_additiveOperator = 122, RULE_multiplicativeOperation = 123, 
		RULE_typeOperation = 124, RULE_prefixUnaryOperation = 125, RULE_postfixUnaryOperation = 126, 
		RULE_memberAccessOperator = 127, RULE_modifierList = 128, RULE_modifier = 129, 
		RULE_classModifier = 130, RULE_memberModifier = 131, RULE_visibilityModifier = 132, 
		RULE_varianceAnnotation = 133, RULE_functionModifier = 134, RULE_propertyModifier = 135, 
		RULE_inheritanceModifier = 136, RULE_parameterModifier = 137, RULE_typeParameterModifier = 138, 
		RULE_labelDefinition = 139, RULE_annotations = 140, RULE_annotation = 141, 
		RULE_annotationList = 142, RULE_annotationUseSiteTarget = 143, RULE_unescapedAnnotation = 144, 
		RULE_identifier = 145, RULE_simpleIdentifier = 146, RULE_semi = 147, RULE_anysemi = 148, 
		RULE_asmprog = 149, RULE_asmline = 150, RULE_asminstruction = 151, RULE_asmlbl = 152, 
		RULE_asmargumentlist = 153, RULE_asmlabel = 154, RULE_asmargument = 155, 
		RULE_asmprefix = 156, RULE_asmstring = 157, RULE_asmname = 158, RULE_asmnumber = 159, 
		RULE_asmcomment = 160, RULE_asmopcode = 161;
	private static String[] makeRuleNames() {
		return new String[] {
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
			"typeConstraints", "typeConstraint", "block", "asmblock", "statements", 
			"statement", "blockLevelExpression", "declaration", "expression", "disjunction", 
			"conjunction", "equalityComparison", "comparison", "namedInfix", "elvisExpression", 
			"infixFunctionCall", "rangeExpression", "additiveExpression", "multiplicativeExpression", 
			"typeRHS", "prefixUnaryExpression", "postfixUnaryExpression", "atomicExpression", 
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
			"memberAccessOperator", "modifierList", "modifier", "classModifier", 
			"memberModifier", "visibilityModifier", "varianceAnnotation", "functionModifier", 
			"propertyModifier", "inheritanceModifier", "parameterModifier", "typeParameterModifier", 
			"labelDefinition", "annotations", "annotation", "annotationList", "annotationUseSiteTarget", 
			"unescapedAnnotation", "identifier", "simpleIdentifier", "semi", "anysemi", 
			"asmprog", "asmline", "asminstruction", "asmlbl", "asmargumentlist", 
			"asmlabel", "asmargument", "asmprefix", "asmstring", "asmname", "asmnumber", 
			"asmcomment", "asmopcode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'...'", "'.'", "','", "'('", null, 
			"'['", null, "'{'", "'}'", "'*'", "'%'", "'/'", "'+'", "'-'", "'++'", 
			"'--'", "'&&'", "'||'", "'!'", "':'", "';'", "'='", "'+='", "'-='", "'*='", 
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
			null, null, null, null, null, null, null, "'interrupt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ShebangLine", "DelimitedComment", "LineComment", "WS", "NL", "RESERVED", 
			"DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", 
			"MULT", "MOD", "DIV", "ADD", "SUB", "INCR", "DECR", "CONJ", "DISJ", "EXCL", 
			"COLON", "SEMICOLON", "ASSIGNMENT", "ADD_ASSIGNMENT", "SUB_ASSIGNMENT", 
			"MULT_ASSIGNMENT", "DIV_ASSIGNMENT", "MOD_ASSIGNMENT", "ARROW", "DOUBLE_ARROW", 
			"RANGE", "COLONCOLON", "Q_COLONCOLON", "DOUBLE_SEMICOLON", "HASH", "AT", 
			"QUEST", "ELVIS", "LANGLE", "RANGLE", "LE", "GE", "EXCL_EQ", "EXCL_EQEQ", 
			"AS_SAFE", "EQEQ", "EQEQEQ", "SINGLE_QUOTE", "RETURN_AT", "CONTINUE_AT", 
			"BREAK_AT", "FILE", "PACKAGE", "IMPORT", "CLASS", "INTERFACE", "FUN", 
			"OBJECT", "VAL", "VAR", "TYPE_ALIAS", "CONSTRUCTOR", "BY", "COMPANION", 
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
			"StrExpr_WS", "StrExpr_NL", "INTERRUPT", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "CARON", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BIT_ASSIGNMENT", "BIT_OR", "BIT_AND", "BIT_OR_ASSIGNMENT", 
			"BIT_AND_ASSIGNMENT", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ASSEMBLER_INSTRUCTION", "ASMSTRING", 
			"ASMNAME", "ASMNUMBER", "ASMCOMMENT", "ADC", "AND", "ASL", "BCC", "BCS", 
			"BEQ", "BIT", "BMI", "BNE", "BPL", "BRA", "BRK", "BVC", "BVS", "CLC", 
			"CLD", "CLI", "CLV", "CMP", "CPX", "CPY", "DEC", "DEX", "DEY", "EOR", 
			"INC", "INX", "INY", "JMP", "JSR", "LDA", "LDY", "LDX", "LSR", "NOP", 
			"ORA", "PHA", "PHX", "PHY", "PHP", "PLA", "PLP", "PLY", "ROL", "ROR", 
			"RTI", "RTS", "SBC", "SEC", "SED", "SEI", "STA", "STX", "STY", "STZ", 
			"TAX", "TAY", "TSX", "TXA", "TXS", "TYA"
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
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					match(NL);
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(330);
			preamble();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SEMICOLON) {
				{
				{
				setState(331);
				anysemi();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << FILE) | (1L << CLASS) | (1L << INTERFACE) | (1L << FUN) | (1L << OBJECT) | (1L << VAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VAR - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (FIELD - 64)) | (1L << (PROPERTY - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (RECEIVER - 64)) | (1L << (PARAM - 64)) | (1L << (SETPARAM - 64)) | (1L << (DELEGATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (INTERNAL - 64)) | (1L << (ENUM - 64)) | (1L << (SEALED - 64)) | (1L << (ANNOTATION - 64)) | (1L << (DATA - 64)) | (1L << (INNER - 64)) | (1L << (TAILREC - 64)) | (1L << (OPERATOR - 64)) | (1L << (INLINE - 64)) | (1L << (INFIX - 64)) | (1L << (EXTERNAL - 64)) | (1L << (SUSPEND - 64)) | (1L << (OVERRIDE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (FINAL - 64)) | (1L << (OPEN - 64)) | (1L << (CONST - 64)) | (1L << (LATEINIT - 64)) | (1L << (VARARG - 64)) | (1L << (NOINLINE - 64)) | (1L << (CROSSINLINE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REIFIED - 128)) | (1L << (LabelReference - 128)) | (1L << (INTERRUPT - 128)))) != 0)) {
				{
				setState(337);
				topLevelObject();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(339); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(338);
							anysemi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(341); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << FILE) | (1L << CLASS) | (1L << INTERFACE) | (1L << FUN) | (1L << OBJECT) | (1L << VAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VAR - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (FIELD - 64)) | (1L << (PROPERTY - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (RECEIVER - 64)) | (1L << (PARAM - 64)) | (1L << (SETPARAM - 64)) | (1L << (DELEGATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (INTERNAL - 64)) | (1L << (ENUM - 64)) | (1L << (SEALED - 64)) | (1L << (ANNOTATION - 64)) | (1L << (DATA - 64)) | (1L << (INNER - 64)) | (1L << (TAILREC - 64)) | (1L << (OPERATOR - 64)) | (1L << (INLINE - 64)) | (1L << (INFIX - 64)) | (1L << (EXTERNAL - 64)) | (1L << (SUSPEND - 64)) | (1L << (OVERRIDE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (FINAL - 64)) | (1L << (OPEN - 64)) | (1L << (CONST - 64)) | (1L << (LATEINIT - 64)) | (1L << (VARARG - 64)) | (1L << (NOINLINE - 64)) | (1L << (CROSSINLINE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REIFIED - 128)) | (1L << (LabelReference - 128)) | (1L << (INTERRUPT - 128)))) != 0)) {
						{
						setState(343);
						topLevelObject();
						}
					}

					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(353);
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
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					match(NL);
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(361);
			preamble();
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					anysemi();
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(368);
				expression();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL || _la==SEMICOLON) {
					{
					{
					setState(370); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(369);
							anysemi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(372); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(374);
						expression();
						}
						break;
					}
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(384);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(386);
				fileAnnotations();
				}
				break;
			}
			setState(389);
			packageHeader();
			setState(390);
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
			setState(393); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(392);
					fileAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(395); 
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
			setState(413); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(397);
					match(FILE);
					setState(398);
					match(COLON);
					setState(408);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LSQUARE:
						{
						setState(399);
						match(LSQUARE);
						setState(401); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(400);
							unescapedAnnotation();
							}
							}
							setState(403); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
						setState(405);
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
						setState(407);
						unescapedAnnotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(410);
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
				setState(415); 
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
					{
					setState(417);
					modifierList();
					}
				}

				setState(420);
				match(PACKAGE);
				setState(421);
				identifier();
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(422);
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
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					importHeader();
					}
					} 
				}
				setState(432);
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
			setState(433);
			match(IMPORT);
			setState(434);
			identifier();
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(435);
				match(DOT);
				setState(436);
				match(MULT);
				}
				break;
			case AS:
				{
				setState(437);
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
			case INTERRUPT:
				break;
			default:
				break;
			}
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(440);
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
			setState(443);
			match(AS);
			setState(444);
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
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				objectDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
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
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(453);
				modifierList();
				}
			}

			setState(456);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(457);
				match(NL);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			simpleIdentifier();
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(464);
					match(NL);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				typeParameters();
				}
				break;
			}
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(473);
					match(NL);
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				primaryConstructor();
				}
				break;
			}
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(482);
					match(NL);
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(COLON);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(489);
					match(NL);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				delegationSpecifiers();
				}
				break;
			}
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(498);
					match(NL);
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				typeConstraints();
				}
				break;
			}
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(507);
					match(NL);
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				classBody();
				}
				break;
			case 2:
				{
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(514);
					match(NL);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
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
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(523);
				modifierList();
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(526);
				match(CONSTRUCTOR);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(527);
					match(NL);
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(535);
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
			setState(537);
			match(LPAREN);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << FILE) | (1L << IMPORT) | (1L << VAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VAR - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (BY - 64)) | (1L << (COMPANION - 64)) | (1L << (INIT - 64)) | (1L << (WHERE - 64)) | (1L << (CATCH - 64)) | (1L << (FINALLY - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (FIELD - 64)) | (1L << (PROPERTY - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (GETTER - 64)) | (1L << (SETTER - 64)) | (1L << (RECEIVER - 64)) | (1L << (PARAM - 64)) | (1L << (SETPARAM - 64)) | (1L << (DELEGATE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (INTERNAL - 64)) | (1L << (ENUM - 64)) | (1L << (SEALED - 64)) | (1L << (ANNOTATION - 64)) | (1L << (DATA - 64)) | (1L << (INNER - 64)) | (1L << (TAILREC - 64)) | (1L << (OPERATOR - 64)) | (1L << (INLINE - 64)) | (1L << (INFIX - 64)) | (1L << (EXTERNAL - 64)) | (1L << (SUSPEND - 64)) | (1L << (OVERRIDE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (FINAL - 64)) | (1L << (OPEN - 64)) | (1L << (CONST - 64)) | (1L << (LATEINIT - 64)) | (1L << (VARARG - 64)) | (1L << (NOINLINE - 64)) | (1L << (CROSSINLINE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REIFIED - 128)) | (1L << (Identifier - 128)) | (1L << (LabelReference - 128)) | (1L << (INTERRUPT - 128)))) != 0)) {
				{
				setState(538);
				classParameter();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(539);
					match(COMMA);
					setState(540);
					classParameter();
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(548);
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
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(550);
				modifierList();
				}
				break;
			}
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAL || _la==VAR) {
				{
				setState(553);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(556);
			simpleIdentifier();
			setState(557);
			match(COLON);
			setState(558);
			type();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(559);
				match(ASSIGNMENT);
				setState(560);
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
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(563);
				annotations();
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			delegationSpecifier();
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(COMMA);
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(577);
						match(NL);
						}
						}
						setState(582);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(583);
					delegationSpecifier();
					}
					} 
				}
				setState(588);
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
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
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
			setState(594);
			userType();
			setState(595);
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
			setState(597);
			userType();
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
			match(BY);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(NL);
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(611);
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
			setState(613);
			match(LCURL);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(614);
					match(NL);
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << FILE) | (1L << CLASS) | (1L << INTERFACE) | (1L << FUN) | (1L << OBJECT) | (1L << VAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VAR - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (COMPANION - 64)) | (1L << (INIT - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (FIELD - 64)) | (1L << (PROPERTY - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (RECEIVER - 64)) | (1L << (PARAM - 64)) | (1L << (SETPARAM - 64)) | (1L << (DELEGATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (INTERNAL - 64)) | (1L << (ENUM - 64)) | (1L << (SEALED - 64)) | (1L << (ANNOTATION - 64)) | (1L << (DATA - 64)) | (1L << (INNER - 64)) | (1L << (TAILREC - 64)) | (1L << (OPERATOR - 64)) | (1L << (INLINE - 64)) | (1L << (INFIX - 64)) | (1L << (EXTERNAL - 64)) | (1L << (SUSPEND - 64)) | (1L << (OVERRIDE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (FINAL - 64)) | (1L << (OPEN - 64)) | (1L << (CONST - 64)) | (1L << (LATEINIT - 64)) | (1L << (VARARG - 64)) | (1L << (NOINLINE - 64)) | (1L << (CROSSINLINE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REIFIED - 128)) | (1L << (LabelReference - 128)) | (1L << (INTERRUPT - 128)))) != 0)) {
				{
				{
				setState(620);
				classMemberDeclaration();
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(626);
				match(NL);
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
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
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(634);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(635);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(636);
				objectDeclaration();
				}
				break;
			case 4:
				{
				setState(637);
				companionObject();
				}
				break;
			case 5:
				{
				setState(638);
				propertyDeclaration();
				}
				break;
			case 6:
				{
				setState(639);
				anonymousInitializer();
				}
				break;
			case 7:
				{
				setState(640);
				secondaryConstructor();
				}
				break;
			case 8:
				{
				setState(641);
				typeAlias();
				}
				break;
			}
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(644);
					anysemi();
					}
					} 
				}
				setState(649);
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
			setState(650);
			match(INIT);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(651);
				match(NL);
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
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
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(659);
				modifierList();
				}
			}

			setState(662);
			match(CONSTRUCTOR);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(663);
				match(NL);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			functionValueParameters();
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(670);
					match(NL);
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(676);
				match(COLON);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(677);
					match(NL);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
				constructorDelegationCall();
				}
				break;
			}
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(686);
				match(NL);
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
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
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(THIS);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(695);
					match(NL);
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(701);
				valueArguments();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(SUPER);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(703);
					match(NL);
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(709);
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
			setState(712);
			match(LCURL);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(713);
					match(NL);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(719);
				enumEntries();
				}
			}

			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(722);
					match(NL);
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				match(SEMICOLON);
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(729);
						match(NL);
						}
						} 
					}
					setState(734);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << FILE) | (1L << CLASS) | (1L << INTERFACE) | (1L << FUN) | (1L << OBJECT) | (1L << VAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VAR - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (COMPANION - 64)) | (1L << (INIT - 64)) | (1L << (IN - 64)) | (1L << (OUT - 64)) | (1L << (FIELD - 64)) | (1L << (PROPERTY - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (RECEIVER - 64)) | (1L << (PARAM - 64)) | (1L << (SETPARAM - 64)) | (1L << (DELEGATE - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (INTERNAL - 64)) | (1L << (ENUM - 64)) | (1L << (SEALED - 64)) | (1L << (ANNOTATION - 64)) | (1L << (DATA - 64)) | (1L << (INNER - 64)) | (1L << (TAILREC - 64)) | (1L << (OPERATOR - 64)) | (1L << (INLINE - 64)) | (1L << (INFIX - 64)) | (1L << (EXTERNAL - 64)) | (1L << (SUSPEND - 64)) | (1L << (OVERRIDE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (FINAL - 64)) | (1L << (OPEN - 64)) | (1L << (CONST - 64)) | (1L << (LATEINIT - 64)) | (1L << (VARARG - 64)) | (1L << (NOINLINE - 64)) | (1L << (CROSSINLINE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REIFIED - 128)) | (1L << (LabelReference - 128)) | (1L << (INTERRUPT - 128)))) != 0)) {
					{
					{
					setState(735);
					classMemberDeclaration();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(743);
				match(NL);
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
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
			setState(758); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(751);
				enumEntry();
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(752);
						match(NL);
						}
						} 
					}
					setState(757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				}
				}
				setState(760); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(762);
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
			setState(765);
			simpleIdentifier();
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(766);
					match(NL);
					}
					}
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(772);
				valueArguments();
				}
				break;
			}
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(775);
					match(NL);
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(781);
				classBody();
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(784);
					match(NL);
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
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
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(793);
				modifierList();
				}
			}

			setState(796);
			match(FUN);
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(797);
					match(NL);
					}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(803);
				type();
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
				match(DOT);
				}
				break;
			}
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
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
				typeParameters();
				}
				break;
			}
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(823);
					match(NL);
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(829);
				identifier();
				}
				break;
			}
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(832);
					match(NL);
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(838);
				match(CARON);
				setState(839);
				locationReference();
				}
				break;
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(842);
				match(NL);
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(848);
			functionValueParameters();
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(849);
					match(NL);
					}
					}
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(855);
				match(COLON);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(856);
					match(NL);
					}
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(862);
				type();
				}
				break;
			}
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(865);
					match(NL);
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(871);
				typeConstraints();
				}
				break;
			}
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(874);
					match(NL);
					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(880);
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
			setState(883);
			match(LPAREN);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << FILE) | (1L << IMPORT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (WHERE - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (IN - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (Identifier - 140)) | (1L << (LabelReference - 140)) | (1L << (INTERRUPT - 140)))) != 0)) {
				{
				setState(884);
				functionValueParameter();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(885);
					match(COMMA);
					setState(886);
					functionValueParameter();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(894);
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
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(896);
				modifierList();
				}
				break;
			}
			setState(899);
			parameter();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(900);
				match(ASSIGNMENT);
				setState(901);
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
			setState(904);
			simpleIdentifier();
			setState(905);
			match(COLON);
			setState(906);
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
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(ASSIGNMENT);
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(910);
						match(NL);
						}
						} 
					}
					setState(915);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(916);
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
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(919);
				modifierList();
				}
			}

			setState(922);
			match(OBJECT);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(923);
				match(NL);
				}
				}
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(929);
			simpleIdentifier();
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(930);
					match(NL);
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				primaryConstructor();
				}
				break;
			}
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(939);
					match(NL);
					}
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(945);
				match(COLON);
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(946);
					match(NL);
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(952);
				delegationSpecifiers();
				}
				break;
			}
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(955);
					match(NL);
					}
					}
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(961);
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
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(964);
				modifierList();
				}
			}

			setState(967);
			match(COMPANION);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(968);
				match(NL);
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(974);
				modifierList();
				}
			}

			setState(977);
			match(OBJECT);
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(978);
					match(NL);
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(984);
				simpleIdentifier();
				}
				break;
			}
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(987);
					match(NL);
					}
					}
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(993);
				match(COLON);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(994);
					match(NL);
					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1000);
				delegationSpecifiers();
				}
				break;
			}
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1003);
					match(NL);
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1009);
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
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(1012);
				modifierList();
				}
			}

			setState(1015);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1016);
					match(NL);
					}
					}
					setState(1021);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1022);
				typeParameters();
				}
				break;
			}
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1025);
					match(NL);
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				type();
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1032);
					match(NL);
					}
					}
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1038);
				match(DOT);
				}
				break;
			}
			{
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1042);
				match(NL);
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1048);
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
				setState(1049);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1052);
					match(NL);
					}
					}
					setState(1057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1058);
				typeConstraints();
				}
				break;
			}
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1061);
					match(NL);
					}
					}
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1067);
				_la = _input.LA(1);
				if ( !(_la==ASSIGNMENT || _la==BY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1068);
						match(NL);
						}
						} 
					}
					setState(1073);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1074);
				expression();
				}
				break;
			}
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1077);
				getter();
				setState(1081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1078);
					semi();
					setState(1079);
					setter();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1083);
				setter();
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1084);
					semi();
					setState(1085);
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
			setState(1091);
			match(LPAREN);
			setState(1092);
			variableDeclaration();
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1093);
				match(COMMA);
				setState(1094);
				variableDeclaration();
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1100);
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
			setState(1102);
			simpleIdentifier();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1103);
				match(COLON);
				setState(1104);
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
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
					{
					setState(1107);
					modifierList();
					}
				}

				setState(1110);
				match(GETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
					{
					setState(1111);
					modifierList();
					}
				}

				setState(1114);
				match(GETTER);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1115);
					match(NL);
					}
					}
					setState(1120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1121);
				match(LPAREN);
				setState(1122);
				match(RPAREN);
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1123);
						match(NL);
						}
						}
						setState(1128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1129);
					match(COLON);
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1130);
						match(NL);
						}
						}
						setState(1135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1136);
					type();
					}
					break;
				}
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1139);
					match(NL);
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(1145);
					block();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1146);
					match(ASSIGNMENT);
					setState(1150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1147);
							match(NL);
							}
							} 
						}
						setState(1152);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
					}
					setState(1153);
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
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
					{
					setState(1158);
					modifierList();
					}
				}

				setState(1161);
				match(SETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
					{
					setState(1162);
					modifierList();
					}
				}

				setState(1165);
				match(SETTER);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1166);
					match(NL);
					}
					}
					setState(1171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1172);
				match(LPAREN);
				setState(1177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1175);
						_errHandler.sync(this);
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
							setState(1173);
							annotations();
							}
							break;
						case VARARG:
						case NOINLINE:
						case CROSSINLINE:
							{
							setState(1174);
							parameterModifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(1179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1180);
					simpleIdentifier();
					}
					break;
				case 2:
					{
					setState(1181);
					parameter();
					}
					break;
				}
				setState(1184);
				match(RPAREN);
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1185);
					match(NL);
					}
					}
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1191);
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
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==FILE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (IN - 89)) | (1L << (OUT - 89)) | (1L << (FIELD - 89)) | (1L << (PROPERTY - 89)) | (1L << (GET - 89)) | (1L << (SET - 89)) | (1L << (RECEIVER - 89)) | (1L << (PARAM - 89)) | (1L << (SETPARAM - 89)) | (1L << (DELEGATE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (PROTECTED - 89)) | (1L << (INTERNAL - 89)) | (1L << (ENUM - 89)) | (1L << (SEALED - 89)) | (1L << (ANNOTATION - 89)) | (1L << (DATA - 89)) | (1L << (INNER - 89)) | (1L << (TAILREC - 89)) | (1L << (OPERATOR - 89)) | (1L << (INLINE - 89)) | (1L << (INFIX - 89)) | (1L << (EXTERNAL - 89)) | (1L << (SUSPEND - 89)) | (1L << (OVERRIDE - 89)) | (1L << (ABSTRACT - 89)) | (1L << (FINAL - 89)) | (1L << (OPEN - 89)) | (1L << (CONST - 89)) | (1L << (LATEINIT - 89)) | (1L << (VARARG - 89)) | (1L << (NOINLINE - 89)) | (1L << (CROSSINLINE - 89)) | (1L << (REIFIED - 89)) | (1L << (LabelReference - 89)))) != 0) || _la==INTERRUPT) {
				{
				setState(1195);
				modifierList();
				}
			}

			setState(1198);
			match(TYPE_ALIAS);
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1199);
				match(NL);
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1205);
			simpleIdentifier();
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1206);
					match(NL);
					}
					}
					setState(1211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1212);
				typeParameters();
				}
				break;
			}
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1215);
				match(NL);
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1221);
			match(ASSIGNMENT);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1222);
				match(NL);
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1228);
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
			setState(1230);
			match(LANGLE);
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1231);
					match(NL);
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1237);
			typeParameter();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1238);
						match(NL);
						}
						}
						setState(1243);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1244);
					match(COMMA);
					setState(1248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1245);
							match(NL);
							}
							} 
						}
						setState(1250);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					}
					setState(1251);
					typeParameter();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1257);
				match(NL);
				}
				}
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1263);
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
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1265);
				modifierList();
				}
				break;
			}
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1268);
				match(NL);
				}
				}
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1274);
			simpleIdentifier();
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1275);
					match(NL);
					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1281);
				match(COLON);
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1282);
					match(NL);
					}
					}
					setState(1287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1288);
				type();
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1289);
						match(NL);
						}
						} 
					}
					setState(1294);
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
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1297);
				typeModifierList();
				}
				break;
			}
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1300);
				functionType();
				}
				break;
			case 2:
				{
				setState(1301);
				parenthesizedType();
				}
				break;
			case 3:
				{
				setState(1302);
				nullableType();
				}
				break;
			case 4:
				{
				setState(1303);
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
			setState(1314); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1314);
					_errHandler.sync(this);
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
						setState(1306);
						annotations();
						}
						break;
					case SUSPEND:
						{
						setState(1307);
						match(SUSPEND);
						setState(1311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1308);
							match(NL);
							}
							}
							setState(1313);
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
				setState(1316); 
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
			setState(1318);
			match(LPAREN);
			setState(1319);
			type();
			setState(1320);
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
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1322);
				typeReference();
				}
				break;
			case 2:
				{
				setState(1323);
				parenthesizedType();
				}
				break;
			}
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1326);
				match(NL);
				}
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1333); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1332);
					match(QUEST);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1335); 
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
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				match(LPAREN);
				setState(1338);
				typeReference();
				setState(1339);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				userType();
				setState(1343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1342);
					arrayDeclaration();
					}
					break;
				}
				setState(1353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1345);
						match(NL);
						}
						}
						setState(1350);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1351);
					match(CARON);
					setState(1352);
					locationReference();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1355);
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
			setState(1358);
			match(LSQUARE);
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(1359);
				userType();
				}
			}

			setState(1362);
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
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1364);
				functionTypeReceiver();
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1365);
					match(NL);
					}
					}
					setState(1370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1371);
				match(DOT);
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1372);
					match(NL);
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1380);
			functionTypeParameters();
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
			match(ARROW);
			{
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1388);
				match(NL);
				}
				}
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1394);
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
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				nullableType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1398);
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
			setState(1401);
			simpleUserType();
			setState(1418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1402);
						match(NL);
						}
						}
						setState(1407);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1408);
					match(DOT);
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1409);
						match(NL);
						}
						}
						setState(1414);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1415);
					simpleUserType();
					}
					} 
				}
				setState(1420);
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
			setState(1421);
			simpleIdentifier();
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1422);
					match(NL);
					}
					}
					setState(1427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1428);
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
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
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
			setState(1433);
			_errHandler.sync(this);
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
				setState(1431);
				literalConstant();
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
				setState(1432);
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
			setState(1435);
			match(LPAREN);
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1436);
				parameter();
				}
				break;
			case 2:
				{
				setState(1437);
				type();
				}
				break;
			}
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1440);
				match(COMMA);
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1441);
					parameter();
					}
					break;
				case 2:
					{
					setState(1442);
					type();
					}
					break;
				}
				}
				}
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1450);
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
			setState(1452);
			match(WHERE);
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1453);
				match(NL);
				}
				}
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1459);
			typeConstraint();
			setState(1476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1460);
						match(NL);
						}
						}
						setState(1465);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1466);
					match(COMMA);
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1467);
						match(NL);
						}
						}
						setState(1472);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1473);
					typeConstraint();
					}
					} 
				}
				setState(1478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1479);
				annotations();
				}
				}
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1485);
			simpleIdentifier();
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1486);
				match(NL);
				}
				}
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1492);
			match(COLON);
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1493);
				match(NL);
				}
				}
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1499);
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
			setState(1501);
			match(LCURL);
			setState(1502);
			statements();
			setState(1503);
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

	public static class AsmblockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public AsmprogContext asmprog() {
			return getRuleContext(AsmprogContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public AsmblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmblockContext asmblock() throws RecognitionException {
		AsmblockContext _localctx = new AsmblockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_asmblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(LCURL);
			setState(1506);
			asmprog();
			setState(1507);
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
		enterRule(_localctx, 114, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1509);
					anysemi();
					}
					} 
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1515);
				statement();
				setState(1526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1517); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1516);
								anysemi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1519); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1522);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
						case 1:
							{
							setState(1521);
							statement();
							}
							break;
						}
						}
						} 
					}
					setState(1528);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
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
		enterRule(_localctx, 116, RULE_statement);
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
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
		enterRule(_localctx, 118, RULE_blockLevelExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1535);
					annotations();
					}
					} 
				}
				setState(1540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1541);
					match(NL);
					}
					} 
				}
				setState(1546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(1547);
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
		enterRule(_localctx, 120, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LabelDefinition) {
				{
				{
				setState(1549);
				labelDefinition();
				}
				}
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1555);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(1556);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(1557);
				propertyDeclaration();
				}
				break;
			case 4:
				{
				setState(1558);
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
		enterRule(_localctx, 122, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			disjunction();
			setState(1567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1562);
					assignmentOperator();
					setState(1563);
					disjunction();
					}
					} 
				}
				setState(1569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
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
		enterRule(_localctx, 124, RULE_disjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			conjunction();
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1571);
						match(NL);
						}
						}
						setState(1576);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1577);
					match(DISJ);
					setState(1581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1578);
							match(NL);
							}
							} 
						}
						setState(1583);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
					}
					setState(1584);
					conjunction();
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
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
		enterRule(_localctx, 126, RULE_conjunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			equalityComparison();
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1591);
						match(NL);
						}
						}
						setState(1596);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1597);
					match(CONJ);
					setState(1601);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1598);
							match(NL);
							}
							} 
						}
						setState(1603);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
					}
					setState(1604);
					equalityComparison();
					}
					} 
				}
				setState(1609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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
		enterRule(_localctx, 128, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			comparison();
			setState(1622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1611);
					equalityOperation();
					setState(1615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1612);
							match(NL);
							}
							} 
						}
						setState(1617);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
					}
					setState(1618);
					comparison();
					}
					} 
				}
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
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
		enterRule(_localctx, 130, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			namedInfix();
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1626);
				comparisonOperator();
				setState(1630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1627);
						match(NL);
						}
						} 
					}
					setState(1632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
				setState(1633);
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
		enterRule(_localctx, 132, RULE_namedInfix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			elvisExpression();
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1647); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1638);
						inOperator();
						setState(1642);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1639);
								match(NL);
								}
								} 
							}
							setState(1644);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
						}
						setState(1645);
						elvisExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1649); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				{
				setState(1651);
				isOperator();
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1652);
					match(NL);
					}
					}
					setState(1657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1658);
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
		enterRule(_localctx, 134, RULE_elvisExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			infixFunctionCall();
			setState(1679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1663);
						match(NL);
						}
						}
						setState(1668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1669);
					match(ELVIS);
					setState(1673);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1670);
							match(NL);
							}
							} 
						}
						setState(1675);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
					}
					setState(1676);
					infixFunctionCall();
					}
					} 
				}
				setState(1681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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
		enterRule(_localctx, 136, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			rangeExpression();
			setState(1694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1683);
					simpleIdentifier();
					setState(1687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1684);
							match(NL);
							}
							} 
						}
						setState(1689);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
					}
					setState(1690);
					rangeExpression();
					}
					} 
				}
				setState(1696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
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
		enterRule(_localctx, 138, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			additiveExpression();
			setState(1708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1698);
					match(RANGE);
					setState(1702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1699);
							match(NL);
							}
							} 
						}
						setState(1704);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
					}
					setState(1705);
					additiveExpression();
					}
					} 
				}
				setState(1710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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
		enterRule(_localctx, 140, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			multiplicativeExpression();
			setState(1723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1712);
					additiveOperator();
					setState(1716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1713);
							match(NL);
							}
							} 
						}
						setState(1718);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
					}
					setState(1719);
					multiplicativeExpression();
					}
					} 
				}
				setState(1725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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
		enterRule(_localctx, 142, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			typeRHS();
			setState(1738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1727);
					multiplicativeOperation();
					setState(1731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1728);
							match(NL);
							}
							} 
						}
						setState(1733);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
					}
					setState(1734);
					typeRHS();
					}
					} 
				}
				setState(1740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		enterRule(_localctx, 144, RULE_typeRHS);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			prefixUnaryExpression();
			setState(1753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1742);
						match(NL);
						}
						}
						setState(1747);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1748);
					typeOperation();
					setState(1749);
					prefixUnaryExpression();
					}
					} 
				}
				setState(1755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
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
		enterRule(_localctx, 146, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1756);
					prefixUnaryOperation();
					}
					} 
				}
				setState(1761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			}
			setState(1762);
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
		enterRule(_localctx, 148, RULE_postfixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1764);
				atomicExpression();
				}
				break;
			case 2:
				{
				setState(1765);
				callableReference();
				}
				break;
			}
			setState(1771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1768);
					postfixUnaryOperation();
					}
					} 
				}
				setState(1773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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
		enterRule(_localctx, 150, RULE_atomicExpression);
		try {
			setState(1786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
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
				setState(1775);
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
				setState(1776);
				functionLiteral();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1777);
				thisExpression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1778);
				superExpression();
				}
				break;
			case IF:
			case WHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1779);
				conditionalExpression();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 7);
				{
				setState(1780);
				tryExpression();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1781);
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
				setState(1782);
				jumpExpression();
				}
				break;
			case FOR:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1783);
				loopExpression();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1784);
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
				setState(1785);
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
		enterRule(_localctx, 152, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(LPAREN);
			setState(1789);
			expression();
			setState(1790);
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
		enterRule(_localctx, 154, RULE_callSuffix);
		try {
			int _alt;
			setState(1814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1792);
				typeArguments();
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1793);
					valueArguments();
					}
					break;
				}
				setState(1799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1796);
						annotatedLambda();
						}
						} 
					}
					setState(1801);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				valueArguments();
				setState(1806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1803);
						annotatedLambda();
						}
						} 
					}
					setState(1808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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
				setState(1810); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1809);
						annotatedLambda();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1812); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
		enterRule(_localctx, 156, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				{
				setState(1816);
				unescapedAnnotation();
				}
				}
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LabelDefinition) {
				{
				setState(1822);
				match(LabelDefinition);
				}
			}

			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1825);
				match(NL);
				}
				}
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1831);
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
		enterRule(_localctx, 158, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			match(LSQUARE);
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(1834);
				expression();
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1835);
					match(COMMA);
					setState(1836);
					expression();
					}
					}
					setState(1841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1844);
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
		enterRule(_localctx, 160, RULE_valueArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			match(LPAREN);
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << MULT) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(1847);
				valueArgument();
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1848);
					match(COMMA);
					setState(1849);
					valueArgument();
					}
					}
					setState(1854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1857);
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
		enterRule(_localctx, 162, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(LANGLE);
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1860);
				match(NL);
				}
				}
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1866);
			typeProjection();
			setState(1877);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1870);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(1867);
						match(NL);
						}
						}
						setState(1872);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1873);
					match(COMMA);
					setState(1874);
					typeProjection();
					}
					} 
				}
				setState(1879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1880);
				match(NL);
				}
				}
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1886);
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
		enterRule(_localctx, 164, RULE_typeProjection);
		try {
			setState(1893);
			_errHandler.sync(this);
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
				setState(1889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(1888);
					typeProjectionModifierList();
					}
					break;
				}
				setState(1891);
				type();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
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
		enterRule(_localctx, 166, RULE_typeProjectionModifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1896); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1895);
					varianceAnnotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1898); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
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
		enterRule(_localctx, 168, RULE_valueArgument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1900);
				simpleIdentifier();
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1901);
					match(NL);
					}
					}
					setState(1906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1907);
				match(ASSIGNMENT);
				setState(1911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1908);
						match(NL);
						}
						} 
					}
					setState(1913);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				}
				}
				break;
			}
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(1916);
				match(MULT);
				}
			}

			setState(1922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1919);
					match(NL);
					}
					} 
				}
				setState(1924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			setState(1925);
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
		enterRule(_localctx, 170, RULE_literalConstant);
		try {
			setState(1936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				match(BooleanLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				match(IntegerLiteral);
				}
				break;
			case QUOTE_OPEN:
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1929);
				stringLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1930);
				match(HexLiteral);
				}
				break;
			case BinLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1931);
				match(BinLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1932);
				match(CharacterLiteral);
				}
				break;
			case RealLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(1933);
				match(RealLiteral);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(1934);
				match(NullLiteral);
				}
				break;
			case LongLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(1935);
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
		enterRule(_localctx, 172, RULE_stringLiteral);
		try {
			setState(1940);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1938);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
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
		enterRule(_localctx, 174, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(QUOTE_OPEN);
			setState(1947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (LineStrRef - 156)) | (1L << (LineStrText - 156)) | (1L << (LineStrEscapedChar - 156)) | (1L << (LineStrExprStart - 156)))) != 0)) {
				{
				setState(1945);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LineStrRef:
				case LineStrText:
				case LineStrEscapedChar:
					{
					setState(1943);
					lineStringContent();
					}
					break;
				case LineStrExprStart:
					{
					setState(1944);
					lineStringExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1950);
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
		enterRule(_localctx, 176, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(TRIPLE_QUOTE_OPEN);
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (QUOTE_OPEN - 129)) | (1L << (MultiLineStringQuote - 129)) | (1L << (MultiLineStrRef - 129)) | (1L << (MultiLineStrText - 129)) | (1L << (MultiLineStrEscapedChar - 129)) | (1L << (MultiLineStrExprStart - 129)))) != 0)) {
				{
				setState(1957);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrRef:
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(1953);
					multiLineStringContent();
					}
					break;
				case MultiLineStrExprStart:
					{
					setState(1954);
					multiLineStringExpression();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(1955);
					lineStringLiteral();
					}
					break;
				case MultiLineStringQuote:
					{
					setState(1956);
					match(MultiLineStringQuote);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1962);
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
		enterRule(_localctx, 178, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			_la = _input.LA(1);
			if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (LineStrRef - 156)) | (1L << (LineStrText - 156)) | (1L << (LineStrEscapedChar - 156)))) != 0)) ) {
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
		enterRule(_localctx, 180, RULE_lineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(LineStrExprStart);
			setState(1967);
			expression();
			setState(1968);
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
		enterRule(_localctx, 182, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			_la = _input.LA(1);
			if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (MultiLineStrRef - 162)) | (1L << (MultiLineStrText - 162)) | (1L << (MultiLineStrEscapedChar - 162)))) != 0)) ) {
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
		enterRule(_localctx, 184, RULE_multiLineStringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(MultiLineStrExprStart);
			setState(1973);
			expression();
			setState(1974);
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
		enterRule(_localctx, 186, RULE_functionLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(1976);
				annotations();
				}
				}
				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(1982);
				match(LCURL);
				setState(1986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1983);
						match(NL);
						}
						} 
					}
					setState(1988);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				}
				setState(1989);
				statements();
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1990);
					match(NL);
					}
					}
					setState(1995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1996);
				match(RCURL);
				}
				break;
			case 2:
				{
				setState(1998);
				match(LCURL);
				setState(2002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1999);
						match(NL);
						}
						} 
					}
					setState(2004);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				}
				setState(2005);
				lambdaParameters();
				setState(2009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2006);
					match(NL);
					}
					}
					setState(2011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2012);
				match(ARROW);
				setState(2016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2013);
						match(NL);
						}
						} 
					}
					setState(2018);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
				}
				setState(2019);
				statements();
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2020);
					match(NL);
					}
					}
					setState(2025);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2026);
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
		enterRule(_localctx, 188, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==IMPORT || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (WHERE - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (OUT - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)))) != 0) || _la==Identifier) {
				{
				setState(2030);
				lambdaParameter();
				}
			}

			setState(2049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(COMMA);
					setState(2043);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2040);
						match(NL);
						}
						}
						setState(2045);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2046);
					lambdaParameter();
					}
					} 
				}
				setState(2051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
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
		enterRule(_localctx, 190, RULE_lambdaParameter);
		int _la;
		try {
			setState(2070);
			_errHandler.sync(this);
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
				setState(2052);
				variableDeclaration();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				multiVariableDeclaration();
				setState(2068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2057);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2054);
						match(NL);
						}
						}
						setState(2059);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2060);
					match(COLON);
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
		enterRule(_localctx, 192, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			match(OBJECT);
			setState(2087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2073);
					match(NL);
					}
					}
					setState(2078);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2079);
				match(COLON);
				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2080);
					match(NL);
					}
					}
					setState(2085);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2086);
				delegationSpecifiers();
				}
				break;
			}
			setState(2092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2089);
				match(NL);
				}
				}
				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2095);
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
		enterRule(_localctx, 194, RULE_collectionLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(LSQUARE);
			setState(2099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAREN) | (1L << LSQUARE) | (1L << LCURL) | (1L << ADD) | (1L << SUB) | (1L << INCR) | (1L << DECR) | (1L << EXCL) | (1L << COLONCOLON) | (1L << Q_COLONCOLON) | (1L << AT) | (1L << RETURN_AT) | (1L << CONTINUE_AT) | (1L << BREAK_AT) | (1L << FILE) | (1L << IMPORT) | (1L << OBJECT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONSTRUCTOR - 66)) | (1L << (BY - 66)) | (1L << (COMPANION - 66)) | (1L << (INIT - 66)) | (1L << (THIS - 66)) | (1L << (SUPER - 66)) | (1L << (WHERE - 66)) | (1L << (IF - 66)) | (1L << (WHEN - 66)) | (1L << (TRY - 66)) | (1L << (CATCH - 66)) | (1L << (FINALLY - 66)) | (1L << (FOR - 66)) | (1L << (DO - 66)) | (1L << (WHILE - 66)) | (1L << (THROW - 66)) | (1L << (RETURN - 66)) | (1L << (CONTINUE - 66)) | (1L << (BREAK - 66)) | (1L << (OUT - 66)) | (1L << (FIELD - 66)) | (1L << (PROPERTY - 66)) | (1L << (GET - 66)) | (1L << (SET - 66)) | (1L << (GETTER - 66)) | (1L << (SETTER - 66)) | (1L << (RECEIVER - 66)) | (1L << (PARAM - 66)) | (1L << (SETPARAM - 66)) | (1L << (DELEGATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (INTERNAL - 66)) | (1L << (ENUM - 66)) | (1L << (SEALED - 66)) | (1L << (ANNOTATION - 66)) | (1L << (DATA - 66)) | (1L << (INNER - 66)) | (1L << (TAILREC - 66)) | (1L << (OPERATOR - 66)) | (1L << (INLINE - 66)) | (1L << (INFIX - 66)) | (1L << (EXTERNAL - 66)) | (1L << (SUSPEND - 66)) | (1L << (OVERRIDE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (FINAL - 66)) | (1L << (OPEN - 66)) | (1L << (CONST - 66)) | (1L << (LATEINIT - 66)) | (1L << (VARARG - 66)) | (1L << (NOINLINE - 66)) | (1L << (CROSSINLINE - 66)) | (1L << (REIFIED - 66)) | (1L << (QUOTE_OPEN - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (TRIPLE_QUOTE_OPEN - 130)) | (1L << (RealLiteral - 130)) | (1L << (LongLiteral - 130)) | (1L << (IntegerLiteral - 130)) | (1L << (HexLiteral - 130)) | (1L << (BinLiteral - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NullLiteral - 130)) | (1L << (Identifier - 130)) | (1L << (LabelReference - 130)) | (1L << (LabelDefinition - 130)) | (1L << (CharacterLiteral - 130)))) != 0)) {
				{
				setState(2098);
				expression();
				}
			}

			setState(2105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2101);
				match(COMMA);
				setState(2102);
				expression();
				}
				}
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2108);
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
		enterRule(_localctx, 196, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(THIS);
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2111);
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
		enterRule(_localctx, 198, RULE_superExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(SUPER);
			setState(2131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2115);
				match(LANGLE);
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2116);
					match(NL);
					}
					}
					setState(2121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2122);
				type();
				setState(2126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2123);
					match(NL);
					}
					}
					setState(2128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2129);
				match(RANGLE);
				}
				break;
			}
			setState(2134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2133);
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
		enterRule(_localctx, 200, RULE_conditionalExpression);
		try {
			setState(2138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(2136);
				ifExpression();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2137);
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
		enterRule(_localctx, 202, RULE_ifExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			match(IF);
			setState(2144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2141);
				match(NL);
				}
				}
				setState(2146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2147);
			match(LPAREN);
			setState(2148);
			expression();
			setState(2149);
			match(RPAREN);
			setState(2153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2150);
					match(NL);
					}
					} 
				}
				setState(2155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2156);
				controlStructureBody();
				}
				break;
			}
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2159);
				match(SEMICOLON);
				}
				break;
			}
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2162);
					match(NL);
					}
					}
					setState(2167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2168);
				match(ELSE);
				setState(2172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2169);
						match(NL);
						}
						} 
					}
					setState(2174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
				}
				setState(2176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2175);
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
		enterRule(_localctx, 204, RULE_controlStructureBody);
		try {
			setState(2182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2180);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2181);
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
		enterRule(_localctx, 206, RULE_whenExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			match(WHEN);
			setState(2188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2185);
					match(NL);
					}
					} 
				}
				setState(2190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			setState(2195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2191);
				match(LPAREN);
				setState(2192);
				expression();
				setState(2193);
				match(RPAREN);
				}
			}

			setState(2200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2197);
				match(NL);
				}
				}
				setState(2202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2203);
			match(LCURL);
			setState(2207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2204);
					match(NL);
					}
					} 
				}
				setState(2209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			}
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2210);
					whenEntry();
					setState(2214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2211);
							match(NL);
							}
							} 
						}
						setState(2216);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
					}
					}
					} 
				}
				setState(2221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
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
		enterRule(_localctx, 208, RULE_whenEntry);
		int _la;
		try {
			int _alt;
			setState(2282);
			_errHandler.sync(this);
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
				setState(2230);
				whenCondition();
				setState(2247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2234);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(2231);
							match(NL);
							}
							}
							setState(2236);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2237);
						match(COMMA);
						setState(2241);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2238);
								match(NL);
								}
								} 
							}
							setState(2243);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
						}
						setState(2244);
						whenCondition();
						}
						} 
					}
					setState(2249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
				}
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2250);
					match(NL);
					}
					}
					setState(2255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2256);
				match(ARROW);
				setState(2260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2257);
						match(NL);
						}
						} 
					}
					setState(2262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
				}
				setState(2263);
				controlStructureBody();
				setState(2265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2264);
					semi();
					}
					break;
				}
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2267);
				match(ELSE);
				setState(2271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2268);
					match(NL);
					}
					}
					setState(2273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2274);
				match(ARROW);
				setState(2278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2275);
						match(NL);
						}
						} 
					}
					setState(2280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,339,_ctx);
				}
				setState(2281);
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
		enterRule(_localctx, 210, RULE_whenCondition);
		try {
			setState(2287);
			_errHandler.sync(this);
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
				setState(2284);
				expression();
				}
				break;
			case IN:
			case NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2285);
				rangeTest();
				}
				break;
			case IS:
			case NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2286);
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
		enterRule(_localctx, 212, RULE_rangeTest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			inOperator();
			setState(2293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2290);
					match(NL);
					}
					} 
				}
				setState(2295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			}
			setState(2296);
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
		enterRule(_localctx, 214, RULE_typeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			isOperator();
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
		enterRule(_localctx, 216, RULE_tryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(TRY);
			setState(2311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2308);
				match(NL);
				}
				}
				setState(2313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2314);
			block();
			setState(2324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2315);
						match(NL);
						}
						}
						setState(2320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2321);
					catchBlock();
					}
					} 
				}
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			}
			setState(2334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2327);
					match(NL);
					}
					}
					setState(2332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2333);
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
		enterRule(_localctx, 218, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			match(CATCH);
			setState(2340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2337);
				match(NL);
				}
				}
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2343);
			match(LPAREN);
			setState(2347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2344);
				annotations();
				}
				}
				setState(2349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2350);
			simpleIdentifier();
			setState(2351);
			match(COLON);
			setState(2352);
			userType();
			setState(2353);
			match(RPAREN);
			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2354);
				match(NL);
				}
				}
				setState(2359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2360);
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
		enterRule(_localctx, 220, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			match(FINALLY);
			setState(2366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2363);
				match(NL);
				}
				}
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2369);
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
		enterRule(_localctx, 222, RULE_loopExpression);
		try {
			setState(2374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				forExpression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2372);
				whileExpression();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(2373);
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
		enterRule(_localctx, 224, RULE_forExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			match(FOR);
			setState(2380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2377);
				match(NL);
				}
				}
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2383);
			match(LPAREN);
			setState(2387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==FILE || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (FIELD - 93)) | (1L << (PROPERTY - 93)) | (1L << (GET - 93)) | (1L << (SET - 93)) | (1L << (RECEIVER - 93)) | (1L << (PARAM - 93)) | (1L << (SETPARAM - 93)) | (1L << (DELEGATE - 93)) | (1L << (LabelReference - 93)))) != 0)) {
				{
				{
				setState(2384);
				annotations();
				}
				}
				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2392);
			_errHandler.sync(this);
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
				setState(2390);
				variableDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(2391);
				multiVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2394);
			match(IN);
			setState(2395);
			expression();
			setState(2396);
			match(RPAREN);
			setState(2400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2397);
					match(NL);
					}
					} 
				}
				setState(2402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			setState(2404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2403);
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
		enterRule(_localctx, 226, RULE_whileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			match(WHILE);
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
			match(LPAREN);
			setState(2414);
			expression();
			setState(2415);
			match(RPAREN);
			setState(2419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2416);
					match(NL);
					}
					} 
				}
				setState(2421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			}
			setState(2423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2422);
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
		enterRule(_localctx, 228, RULE_doWhileExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			match(DO);
			setState(2429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2426);
					match(NL);
					}
					} 
				}
				setState(2431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			}
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
			case 1:
				{
				setState(2432);
				controlStructureBody();
				}
				break;
			}
			setState(2438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2435);
				match(NL);
				}
				}
				setState(2440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2441);
			match(WHILE);
			setState(2445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2442);
				match(NL);
				}
				}
				setState(2447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2448);
			match(LPAREN);
			setState(2449);
			expression();
			setState(2450);
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
		enterRule(_localctx, 230, RULE_jumpExpression);
		int _la;
		try {
			int _alt;
			setState(2468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452);
				match(THROW);
				setState(2456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2453);
						match(NL);
						}
						} 
					}
					setState(2458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				}
				setState(2459);
				expression();
				}
				break;
			case RETURN_AT:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2460);
				_la = _input.LA(1);
				if ( !(_la==RETURN_AT || _la==RETURN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2461);
					expression();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2464);
				match(CONTINUE);
				}
				break;
			case CONTINUE_AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2465);
				match(CONTINUE_AT);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2466);
				match(BREAK);
				}
				break;
			case BREAK_AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2467);
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
		enterRule(_localctx, 232, RULE_callableReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) {
				{
				setState(2470);
				userType();
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUEST) {
					{
					{
					setState(2471);
					match(QUEST);
					setState(2475);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2472);
							match(NL);
							}
							} 
						}
						setState(2477);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
					}
					}
					}
					setState(2482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2485);
				match(NL);
				}
				}
				setState(2490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2491);
			_la = _input.LA(1);
			if ( !(_la==COLONCOLON || _la==Q_COLONCOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(2492);
				match(NL);
				}
				}
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2500);
			_errHandler.sync(this);
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
				setState(2498);
				identifier();
				}
				break;
			case CLASS:
				{
				setState(2499);
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
		public TerminalNode BIT_ASSIGNMENT() { return getToken(KotlinParser.BIT_ASSIGNMENT, 0); }
		public TerminalNode BIT_DEASSIGNMENT() { return getToken(KotlinParser.BIT_DEASSIGNMENT, 0); }
		public TerminalNode BIT_OR_ASSIGNMENT() { return getToken(KotlinParser.BIT_OR_ASSIGNMENT, 0); }
		public TerminalNode BIT_AND_ASSIGNMENT() { return getToken(KotlinParser.BIT_AND_ASSIGNMENT, 0); }
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
		enterRule(_localctx, 234, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << ADD_ASSIGNMENT) | (1L << SUB_ASSIGNMENT) | (1L << MULT_ASSIGNMENT) | (1L << DIV_ASSIGNMENT) | (1L << MOD_ASSIGNMENT))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (BIT_ASSIGNMENT - 300)) | (1L << (BIT_OR_ASSIGNMENT - 300)) | (1L << (BIT_AND_ASSIGNMENT - 300)))) != 0)) ) {
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
		enterRule(_localctx, 236, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCL_EQ) | (1L << EXCL_EQEQ) | (1L << EQEQ) | (1L << EQEQEQ))) != 0)) ) {
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
		enterRule(_localctx, 238, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LE) | (1L << GE))) != 0)) ) {
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
		enterRule(_localctx, 240, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==NOT_IN) ) {
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
		enterRule(_localctx, 242, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT_IS) ) {
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public TerminalNode BIT_OR() { return getToken(KotlinParser.BIT_OR, 0); }
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
		enterRule(_localctx, 244, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB || _la==BIT_OR) ) {
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

	public static class MultiplicativeOperationContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(KotlinParser.MOD, 0); }
		public TerminalNode BIT_AND() { return getToken(KotlinParser.BIT_AND, 0); }
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
		enterRule(_localctx, 246, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << MOD) | (1L << DIV))) != 0) || _la==BIT_AND) ) {
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
		enterRule(_localctx, 248, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (COLON - 25)) | (1L << (AS_SAFE - 25)) | (1L << (AS - 25)))) != 0)) ) {
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
		enterRule(_localctx, 250, RULE_prefixUnaryOperation);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				match(INCR);
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2519);
				match(DECR);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2520);
				match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2521);
				match(SUB);
				}
				break;
			case EXCL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2522);
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
				setState(2523);
				annotations();
				}
				break;
			case LabelDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(2524);
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
		enterRule(_localctx, 252, RULE_postfixUnaryOperation);
		int _la;
		try {
			setState(2542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2527);
				match(INCR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2528);
				match(DECR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2529);
				match(EXCL);
				setState(2530);
				match(EXCL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2531);
				callSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2532);
				arrayAccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2533);
					match(NL);
					}
					}
					setState(2538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2539);
				memberAccessOperator();
				setState(2540);
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
		enterRule(_localctx, 254, RULE_memberAccessOperator);
		try {
			setState(2547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2544);
				match(DOT);
				}
				break;
			case QUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(2545);
				match(QUEST);
				setState(2546);
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
		enterRule(_localctx, 256, RULE_modifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2551); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2551);
					_errHandler.sync(this);
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
						setState(2549);
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
					case INTERRUPT:
						{
						setState(2550);
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
				setState(2553); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
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
		enterRule(_localctx, 258, RULE_modifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
			case SEALED:
			case ANNOTATION:
			case DATA:
			case INNER:
				{
				setState(2555);
				classModifier();
				}
				break;
			case OVERRIDE:
			case LATEINIT:
				{
				setState(2556);
				memberModifier();
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case INTERNAL:
				{
				setState(2557);
				visibilityModifier();
				}
				break;
			case IN:
			case OUT:
				{
				setState(2558);
				varianceAnnotation();
				}
				break;
			case TAILREC:
			case OPERATOR:
			case INLINE:
			case INFIX:
			case EXTERNAL:
			case SUSPEND:
			case INTERRUPT:
				{
				setState(2559);
				functionModifier();
				}
				break;
			case CONST:
				{
				setState(2560);
				propertyModifier();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case OPEN:
				{
				setState(2561);
				inheritanceModifier();
				}
				break;
			case VARARG:
			case NOINLINE:
			case CROSSINLINE:
				{
				setState(2562);
				parameterModifier();
				}
				break;
			case REIFIED:
				{
				setState(2563);
				typeParameterModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2566);
					match(NL);
					}
					} 
				}
				setState(2571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
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
		enterRule(_localctx, 260, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2572);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (ENUM - 108)) | (1L << (SEALED - 108)) | (1L << (ANNOTATION - 108)) | (1L << (DATA - 108)) | (1L << (INNER - 108)))) != 0)) ) {
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
		enterRule(_localctx, 262, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			_la = _input.LA(1);
			if ( !(_la==OVERRIDE || _la==LATEINIT) ) {
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
		enterRule(_localctx, 264, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (PUBLIC - 104)) | (1L << (PRIVATE - 104)) | (1L << (PROTECTED - 104)) | (1L << (INTERNAL - 104)))) != 0)) ) {
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
		enterRule(_localctx, 266, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
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

	public static class FunctionModifierContext extends ParserRuleContext {
		public TerminalNode TAILREC() { return getToken(KotlinParser.TAILREC, 0); }
		public TerminalNode OPERATOR() { return getToken(KotlinParser.OPERATOR, 0); }
		public TerminalNode INFIX() { return getToken(KotlinParser.INFIX, 0); }
		public TerminalNode INLINE() { return getToken(KotlinParser.INLINE, 0); }
		public TerminalNode EXTERNAL() { return getToken(KotlinParser.EXTERNAL, 0); }
		public TerminalNode SUSPEND() { return getToken(KotlinParser.SUSPEND, 0); }
		public TerminalNode INTERRUPT() { return getToken(KotlinParser.INTERRUPT, 0); }
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
		enterRule(_localctx, 268, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2580);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (TAILREC - 113)) | (1L << (OPERATOR - 113)) | (1L << (INLINE - 113)) | (1L << (INFIX - 113)) | (1L << (EXTERNAL - 113)) | (1L << (SUSPEND - 113)) | (1L << (INTERRUPT - 113)))) != 0)) ) {
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
		enterRule(_localctx, 270, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
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
		enterRule(_localctx, 272, RULE_inheritanceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ABSTRACT - 120)) | (1L << (FINAL - 120)) | (1L << (OPEN - 120)))) != 0)) ) {
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
		enterRule(_localctx, 274, RULE_parameterModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (VARARG - 125)) | (1L << (NOINLINE - 125)) | (1L << (CROSSINLINE - 125)))) != 0)) ) {
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
		enterRule(_localctx, 276, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2588);
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
		enterRule(_localctx, 278, RULE_labelDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(LabelDefinition);
			setState(2594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2591);
					match(NL);
					}
					} 
				}
				setState(2596);
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
		enterRule(_localctx, 280, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				{
				setState(2597);
				annotation();
				}
				break;
			case 2:
				{
				setState(2598);
				annotationList();
				}
				break;
			}
			setState(2604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2601);
					match(NL);
					}
					} 
				}
				setState(2606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
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
		enterRule(_localctx, 282, RULE_annotation);
		int _la;
		try {
			setState(2642);
			_errHandler.sync(this);
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
				setState(2607);
				annotationUseSiteTarget();
				setState(2611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2608);
					match(NL);
					}
					}
					setState(2613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2614);
				match(COLON);
				setState(2618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2615);
					match(NL);
					}
					}
					setState(2620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2621);
				unescapedAnnotation();
				}
				break;
			case LabelReference:
				enterOuterAlt(_localctx, 2);
				{
				setState(2623);
				match(LabelReference);
				setState(2631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
				case 1:
					{
					setState(2627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2624);
						match(NL);
						}
						}
						setState(2629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2630);
					typeArguments();
					}
					break;
				}
				setState(2640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
				case 1:
					{
					setState(2636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2633);
						match(NL);
						}
						}
						setState(2638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2639);
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
		enterRule(_localctx, 284, RULE_annotationList);
		int _la;
		try {
			setState(2663);
			_errHandler.sync(this);
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
				setState(2644);
				annotationUseSiteTarget();
				setState(2645);
				match(COLON);
				setState(2646);
				match(LSQUARE);
				setState(2648); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2647);
					unescapedAnnotation();
					}
					}
					setState(2650); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(2652);
				match(RSQUARE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654);
				match(AT);
				setState(2655);
				match(LSQUARE);
				setState(2657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2656);
					unescapedAnnotation();
					}
					}
					setState(2659); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0) );
				setState(2661);
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
		enterRule(_localctx, 286, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (FILE - 56)) | (1L << (FIELD - 56)) | (1L << (PROPERTY - 56)) | (1L << (GET - 56)) | (1L << (SET - 56)) | (1L << (RECEIVER - 56)) | (1L << (PARAM - 56)) | (1L << (SETPARAM - 56)) | (1L << (DELEGATE - 56)))) != 0)) ) {
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
		enterRule(_localctx, 288, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2667);
			identifier();
			setState(2669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(2668);
				typeArguments();
				}
			}

			setState(2672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				{
				setState(2671);
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
		enterRule(_localctx, 290, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			simpleIdentifier();
			setState(2685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2678);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(2675);
						match(NL);
						}
						}
						setState(2680);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2681);
					match(DOT);
					setState(2682);
					simpleIdentifier();
					}
					} 
				}
				setState(2687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
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
		enterRule(_localctx, 292, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2688);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IMPORT - 58)) | (1L << (CONSTRUCTOR - 58)) | (1L << (BY - 58)) | (1L << (COMPANION - 58)) | (1L << (INIT - 58)) | (1L << (WHERE - 58)) | (1L << (CATCH - 58)) | (1L << (FINALLY - 58)) | (1L << (OUT - 58)) | (1L << (GETTER - 58)) | (1L << (SETTER - 58)) | (1L << (DYNAMIC - 58)) | (1L << (PUBLIC - 58)) | (1L << (PRIVATE - 58)) | (1L << (PROTECTED - 58)) | (1L << (INTERNAL - 58)) | (1L << (ENUM - 58)) | (1L << (SEALED - 58)) | (1L << (ANNOTATION - 58)) | (1L << (DATA - 58)) | (1L << (INNER - 58)) | (1L << (TAILREC - 58)) | (1L << (OPERATOR - 58)) | (1L << (INLINE - 58)) | (1L << (INFIX - 58)) | (1L << (EXTERNAL - 58)) | (1L << (SUSPEND - 58)) | (1L << (OVERRIDE - 58)) | (1L << (ABSTRACT - 58)) | (1L << (FINAL - 58)))) != 0) || ((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (OPEN - 122)) | (1L << (CONST - 122)) | (1L << (LATEINIT - 122)) | (1L << (VARARG - 122)) | (1L << (NOINLINE - 122)) | (1L << (CROSSINLINE - 122)) | (1L << (REIFIED - 122)) | (1L << (Identifier - 122)))) != 0)) ) {
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
		enterRule(_localctx, 294, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(2708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2691); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2690);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2693); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(2695);
					match(NL);
					}
					}
					setState(2700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2701);
				match(SEMICOLON);
				setState(2705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2702);
						match(NL);
						}
						} 
					}
					setState(2707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
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
		enterRule(_localctx, 296, RULE_anysemi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2710);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==SEMICOLON) ) {
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

	public static class AsmprogContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<AsmlineContext> asmline() {
			return getRuleContexts(AsmlineContext.class);
		}
		public AsmlineContext asmline(int i) {
			return getRuleContext(AsmlineContext.class,i);
		}
		public AsmprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmprog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmprogContext asmprog() throws RecognitionException {
		AsmprogContext _localctx = new AsmprogContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_asmprog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2716); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 502)) & ~0x3f) == 0 && ((1L << (_la - 502)) & ((1L << (ASMNAME - 502)) | (1L << (ASMCOMMENT - 502)) | (1L << (ADC - 502)) | (1L << (AND - 502)) | (1L << (ASL - 502)) | (1L << (BCC - 502)) | (1L << (BCS - 502)) | (1L << (BEQ - 502)) | (1L << (BIT - 502)) | (1L << (BMI - 502)) | (1L << (BNE - 502)) | (1L << (BPL - 502)) | (1L << (BRA - 502)) | (1L << (BRK - 502)) | (1L << (BVC - 502)) | (1L << (BVS - 502)) | (1L << (CLC - 502)) | (1L << (CLD - 502)) | (1L << (CLI - 502)) | (1L << (CLV - 502)) | (1L << (CMP - 502)) | (1L << (CPX - 502)) | (1L << (CPY - 502)) | (1L << (DEC - 502)) | (1L << (DEX - 502)) | (1L << (DEY - 502)) | (1L << (EOR - 502)) | (1L << (INC - 502)) | (1L << (INX - 502)) | (1L << (INY - 502)) | (1L << (JMP - 502)) | (1L << (JSR - 502)) | (1L << (LDA - 502)) | (1L << (LDY - 502)) | (1L << (LDX - 502)) | (1L << (LSR - 502)) | (1L << (NOP - 502)) | (1L << (ORA - 502)) | (1L << (PHA - 502)) | (1L << (PHX - 502)) | (1L << (PHY - 502)) | (1L << (PHP - 502)) | (1L << (PLA - 502)) | (1L << (PLP - 502)) | (1L << (PLY - 502)) | (1L << (ROL - 502)) | (1L << (ROR - 502)) | (1L << (RTI - 502)) | (1L << (RTS - 502)) | (1L << (SBC - 502)) | (1L << (SEC - 502)) | (1L << (SED - 502)) | (1L << (SEI - 502)) | (1L << (STA - 502)) | (1L << (STX - 502)) | (1L << (STY - 502)) | (1L << (STZ - 502)) | (1L << (TAX - 502)) | (1L << (TAY - 502)) | (1L << (TSX - 502)) | (1L << (TXA - 502)) | (1L << (TXS - 502)) | (1L << (TYA - 502)))) != 0)) {
					{
					setState(2712);
					asmline();
					}
				}

				setState(2715);
				match(NL);
				}
				}
				setState(2718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL || ((((_la - 502)) & ~0x3f) == 0 && ((1L << (_la - 502)) & ((1L << (ASMNAME - 502)) | (1L << (ASMCOMMENT - 502)) | (1L << (ADC - 502)) | (1L << (AND - 502)) | (1L << (ASL - 502)) | (1L << (BCC - 502)) | (1L << (BCS - 502)) | (1L << (BEQ - 502)) | (1L << (BIT - 502)) | (1L << (BMI - 502)) | (1L << (BNE - 502)) | (1L << (BPL - 502)) | (1L << (BRA - 502)) | (1L << (BRK - 502)) | (1L << (BVC - 502)) | (1L << (BVS - 502)) | (1L << (CLC - 502)) | (1L << (CLD - 502)) | (1L << (CLI - 502)) | (1L << (CLV - 502)) | (1L << (CMP - 502)) | (1L << (CPX - 502)) | (1L << (CPY - 502)) | (1L << (DEC - 502)) | (1L << (DEX - 502)) | (1L << (DEY - 502)) | (1L << (EOR - 502)) | (1L << (INC - 502)) | (1L << (INX - 502)) | (1L << (INY - 502)) | (1L << (JMP - 502)) | (1L << (JSR - 502)) | (1L << (LDA - 502)) | (1L << (LDY - 502)) | (1L << (LDX - 502)) | (1L << (LSR - 502)) | (1L << (NOP - 502)) | (1L << (ORA - 502)) | (1L << (PHA - 502)) | (1L << (PHX - 502)) | (1L << (PHY - 502)) | (1L << (PHP - 502)) | (1L << (PLA - 502)) | (1L << (PLP - 502)) | (1L << (PLY - 502)) | (1L << (ROL - 502)) | (1L << (ROR - 502)) | (1L << (RTI - 502)) | (1L << (RTS - 502)) | (1L << (SBC - 502)) | (1L << (SEC - 502)) | (1L << (SED - 502)) | (1L << (SEI - 502)) | (1L << (STA - 502)) | (1L << (STX - 502)) | (1L << (STY - 502)) | (1L << (STZ - 502)) | (1L << (TAX - 502)) | (1L << (TAY - 502)) | (1L << (TSX - 502)) | (1L << (TXA - 502)) | (1L << (TXS - 502)) | (1L << (TYA - 502)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmlineContext extends ParserRuleContext {
		public AsmcommentContext asmcomment() {
			return getRuleContext(AsmcommentContext.class,0);
		}
		public AsminstructionContext asminstruction() {
			return getRuleContext(AsminstructionContext.class,0);
		}
		public AsmlblContext asmlbl() {
			return getRuleContext(AsmlblContext.class,0);
		}
		public AsmlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmlineContext asmline() throws RecognitionException {
		AsmlineContext _localctx = new AsmlineContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_asmline);
		try {
			setState(2723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2720);
				asmcomment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2721);
				asminstruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2722);
				asmlbl();
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

	public static class AsminstructionContext extends ParserRuleContext {
		public AsmopcodeContext asmopcode() {
			return getRuleContext(AsmopcodeContext.class,0);
		}
		public AsmlabelContext asmlabel() {
			return getRuleContext(AsmlabelContext.class,0);
		}
		public AsmargumentlistContext asmargumentlist() {
			return getRuleContext(AsmargumentlistContext.class,0);
		}
		public AsmcommentContext asmcomment() {
			return getRuleContext(AsmcommentContext.class,0);
		}
		public AsminstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asminstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsminstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsminstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsminstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsminstructionContext asminstruction() throws RecognitionException {
		AsminstructionContext _localctx = new AsminstructionContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_asminstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASMNAME) {
				{
				setState(2725);
				asmlabel();
				}
			}

			setState(2728);
			asmopcode();
			setState(2730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MULT) | (1L << HASH))) != 0) || ((((_la - 501)) & ~0x3f) == 0 && ((1L << (_la - 501)) & ((1L << (ASMSTRING - 501)) | (1L << (ASMNAME - 501)) | (1L << (ASMNUMBER - 501)))) != 0)) {
				{
				setState(2729);
				asmargumentlist();
				}
			}

			setState(2733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASMCOMMENT) {
				{
				setState(2732);
				asmcomment();
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

	public static class AsmlblContext extends ParserRuleContext {
		public AsmlabelContext asmlabel() {
			return getRuleContext(AsmlabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public AsmlblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmlbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmlbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmlbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmlbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmlblContext asmlbl() throws RecognitionException {
		AsmlblContext _localctx = new AsmlblContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_asmlbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2735);
			asmlabel();
			setState(2736);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmargumentlistContext extends ParserRuleContext {
		public AsmargumentContext asmargument() {
			return getRuleContext(AsmargumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(KotlinParser.COMMA, 0); }
		public AsmargumentlistContext asmargumentlist() {
			return getRuleContext(AsmargumentlistContext.class,0);
		}
		public AsmargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmargumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmargumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmargumentlistContext asmargumentlist() throws RecognitionException {
		AsmargumentlistContext _localctx = new AsmargumentlistContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_asmargumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2738);
			asmargument();
			setState(2741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2739);
				match(COMMA);
				setState(2740);
				asmargumentlist();
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

	public static class AsmlabelContext extends ParserRuleContext {
		public AsmnameContext asmname() {
			return getRuleContext(AsmnameContext.class,0);
		}
		public AsmlabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmlabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmlabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmlabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmlabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmlabelContext asmlabel() throws RecognitionException {
		AsmlabelContext _localctx = new AsmlabelContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_asmlabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2743);
			asmname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmargumentContext extends ParserRuleContext {
		public List<AsmnumberContext> asmnumber() {
			return getRuleContexts(AsmnumberContext.class);
		}
		public AsmnumberContext asmnumber(int i) {
			return getRuleContext(AsmnumberContext.class,i);
		}
		public AsmnameContext asmname() {
			return getRuleContext(AsmnameContext.class,0);
		}
		public AsmstringContext asmstring() {
			return getRuleContext(AsmstringContext.class,0);
		}
		public TerminalNode MULT() { return getToken(KotlinParser.MULT, 0); }
		public AsmprefixContext asmprefix() {
			return getRuleContext(AsmprefixContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KotlinParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(KotlinParser.SUB, 0); }
		public TerminalNode LPAREN() { return getToken(KotlinParser.LPAREN, 0); }
		public AsmargumentContext asmargument() {
			return getRuleContext(AsmargumentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KotlinParser.RPAREN, 0); }
		public AsmargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmargument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmargument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmargumentContext asmargument() throws RecognitionException {
		AsmargumentContext _localctx = new AsmargumentContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_asmargument);
		int _la;
		try {
			setState(2762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case HASH:
			case ASMSTRING:
			case ASMNAME:
			case ASMNUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(2745);
					asmprefix();
					}
				}

				setState(2752);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASMNUMBER:
					{
					setState(2748);
					asmnumber();
					}
					break;
				case ASMNAME:
					{
					setState(2749);
					asmname();
					}
					break;
				case ASMSTRING:
					{
					setState(2750);
					asmstring();
					}
					break;
				case MULT:
					{
					setState(2751);
					match(MULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(2754);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2755);
					asmnumber();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2758);
				match(LPAREN);
				setState(2759);
				asmargument();
				setState(2760);
				match(RPAREN);
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

	public static class AsmprefixContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(KotlinParser.HASH, 0); }
		public AsmprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmprefixContext asmprefix() throws RecognitionException {
		AsmprefixContext _localctx = new AsmprefixContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_asmprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2764);
			match(HASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmstringContext extends ParserRuleContext {
		public TerminalNode ASMSTRING() { return getToken(KotlinParser.ASMSTRING, 0); }
		public AsmstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmstringContext asmstring() throws RecognitionException {
		AsmstringContext _localctx = new AsmstringContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_asmstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
			match(ASMSTRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmnameContext extends ParserRuleContext {
		public TerminalNode ASMNAME() { return getToken(KotlinParser.ASMNAME, 0); }
		public AsmnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmnameContext asmname() throws RecognitionException {
		AsmnameContext _localctx = new AsmnameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_asmname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
			match(ASMNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmnumberContext extends ParserRuleContext {
		public TerminalNode ASMNUMBER() { return getToken(KotlinParser.ASMNUMBER, 0); }
		public AsmnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmnumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmnumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmnumberContext asmnumber() throws RecognitionException {
		AsmnumberContext _localctx = new AsmnumberContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_asmnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
			match(ASMNUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmcommentContext extends ParserRuleContext {
		public TerminalNode ASMCOMMENT() { return getToken(KotlinParser.ASMCOMMENT, 0); }
		public AsmcommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmcomment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmcomment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmcomment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmcomment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmcommentContext asmcomment() throws RecognitionException {
		AsmcommentContext _localctx = new AsmcommentContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_asmcomment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			match(ASMCOMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmopcodeContext extends ParserRuleContext {
		public TerminalNode ADC() { return getToken(KotlinParser.ADC, 0); }
		public TerminalNode AND() { return getToken(KotlinParser.AND, 0); }
		public TerminalNode ASL() { return getToken(KotlinParser.ASL, 0); }
		public TerminalNode BCC() { return getToken(KotlinParser.BCC, 0); }
		public TerminalNode BCS() { return getToken(KotlinParser.BCS, 0); }
		public TerminalNode BEQ() { return getToken(KotlinParser.BEQ, 0); }
		public TerminalNode BIT() { return getToken(KotlinParser.BIT, 0); }
		public TerminalNode BMI() { return getToken(KotlinParser.BMI, 0); }
		public TerminalNode BNE() { return getToken(KotlinParser.BNE, 0); }
		public TerminalNode BPL() { return getToken(KotlinParser.BPL, 0); }
		public TerminalNode BRA() { return getToken(KotlinParser.BRA, 0); }
		public TerminalNode BRK() { return getToken(KotlinParser.BRK, 0); }
		public TerminalNode BVC() { return getToken(KotlinParser.BVC, 0); }
		public TerminalNode BVS() { return getToken(KotlinParser.BVS, 0); }
		public TerminalNode CLC() { return getToken(KotlinParser.CLC, 0); }
		public TerminalNode CLD() { return getToken(KotlinParser.CLD, 0); }
		public TerminalNode CLI() { return getToken(KotlinParser.CLI, 0); }
		public TerminalNode CLV() { return getToken(KotlinParser.CLV, 0); }
		public TerminalNode CMP() { return getToken(KotlinParser.CMP, 0); }
		public TerminalNode CPX() { return getToken(KotlinParser.CPX, 0); }
		public TerminalNode CPY() { return getToken(KotlinParser.CPY, 0); }
		public TerminalNode DEC() { return getToken(KotlinParser.DEC, 0); }
		public TerminalNode DEX() { return getToken(KotlinParser.DEX, 0); }
		public TerminalNode DEY() { return getToken(KotlinParser.DEY, 0); }
		public TerminalNode EOR() { return getToken(KotlinParser.EOR, 0); }
		public TerminalNode INC() { return getToken(KotlinParser.INC, 0); }
		public TerminalNode INX() { return getToken(KotlinParser.INX, 0); }
		public TerminalNode INY() { return getToken(KotlinParser.INY, 0); }
		public TerminalNode JMP() { return getToken(KotlinParser.JMP, 0); }
		public TerminalNode JSR() { return getToken(KotlinParser.JSR, 0); }
		public TerminalNode LDA() { return getToken(KotlinParser.LDA, 0); }
		public TerminalNode LDY() { return getToken(KotlinParser.LDY, 0); }
		public TerminalNode LDX() { return getToken(KotlinParser.LDX, 0); }
		public TerminalNode LSR() { return getToken(KotlinParser.LSR, 0); }
		public TerminalNode NOP() { return getToken(KotlinParser.NOP, 0); }
		public TerminalNode ORA() { return getToken(KotlinParser.ORA, 0); }
		public TerminalNode PHA() { return getToken(KotlinParser.PHA, 0); }
		public TerminalNode PHX() { return getToken(KotlinParser.PHX, 0); }
		public TerminalNode PHY() { return getToken(KotlinParser.PHY, 0); }
		public TerminalNode PHP() { return getToken(KotlinParser.PHP, 0); }
		public TerminalNode PLA() { return getToken(KotlinParser.PLA, 0); }
		public TerminalNode PLP() { return getToken(KotlinParser.PLP, 0); }
		public TerminalNode PLY() { return getToken(KotlinParser.PLY, 0); }
		public TerminalNode ROL() { return getToken(KotlinParser.ROL, 0); }
		public TerminalNode ROR() { return getToken(KotlinParser.ROR, 0); }
		public TerminalNode RTI() { return getToken(KotlinParser.RTI, 0); }
		public TerminalNode RTS() { return getToken(KotlinParser.RTS, 0); }
		public TerminalNode SBC() { return getToken(KotlinParser.SBC, 0); }
		public TerminalNode SEC() { return getToken(KotlinParser.SEC, 0); }
		public TerminalNode SED() { return getToken(KotlinParser.SED, 0); }
		public TerminalNode SEI() { return getToken(KotlinParser.SEI, 0); }
		public TerminalNode STA() { return getToken(KotlinParser.STA, 0); }
		public TerminalNode STX() { return getToken(KotlinParser.STX, 0); }
		public TerminalNode STY() { return getToken(KotlinParser.STY, 0); }
		public TerminalNode STZ() { return getToken(KotlinParser.STZ, 0); }
		public TerminalNode TAX() { return getToken(KotlinParser.TAX, 0); }
		public TerminalNode TAY() { return getToken(KotlinParser.TAY, 0); }
		public TerminalNode TSX() { return getToken(KotlinParser.TSX, 0); }
		public TerminalNode TXA() { return getToken(KotlinParser.TXA, 0); }
		public TerminalNode TXS() { return getToken(KotlinParser.TXS, 0); }
		public TerminalNode TYA() { return getToken(KotlinParser.TYA, 0); }
		public AsmopcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmopcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAsmopcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAsmopcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAsmopcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmopcodeContext asmopcode() throws RecognitionException {
		AsmopcodeContext _localctx = new AsmopcodeContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_asmopcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2774);
			_la = _input.LA(1);
			if ( !(((((_la - 505)) & ~0x3f) == 0 && ((1L << (_la - 505)) & ((1L << (ADC - 505)) | (1L << (AND - 505)) | (1L << (ASL - 505)) | (1L << (BCC - 505)) | (1L << (BCS - 505)) | (1L << (BEQ - 505)) | (1L << (BIT - 505)) | (1L << (BMI - 505)) | (1L << (BNE - 505)) | (1L << (BPL - 505)) | (1L << (BRA - 505)) | (1L << (BRK - 505)) | (1L << (BVC - 505)) | (1L << (BVS - 505)) | (1L << (CLC - 505)) | (1L << (CLD - 505)) | (1L << (CLI - 505)) | (1L << (CLV - 505)) | (1L << (CMP - 505)) | (1L << (CPX - 505)) | (1L << (CPY - 505)) | (1L << (DEC - 505)) | (1L << (DEX - 505)) | (1L << (DEY - 505)) | (1L << (EOR - 505)) | (1L << (INC - 505)) | (1L << (INX - 505)) | (1L << (INY - 505)) | (1L << (JMP - 505)) | (1L << (JSR - 505)) | (1L << (LDA - 505)) | (1L << (LDY - 505)) | (1L << (LDX - 505)) | (1L << (LSR - 505)) | (1L << (NOP - 505)) | (1L << (ORA - 505)) | (1L << (PHA - 505)) | (1L << (PHX - 505)) | (1L << (PHY - 505)) | (1L << (PHP - 505)) | (1L << (PLA - 505)) | (1L << (PLP - 505)) | (1L << (PLY - 505)) | (1L << (ROL - 505)) | (1L << (ROR - 505)) | (1L << (RTI - 505)) | (1L << (RTS - 505)) | (1L << (SBC - 505)) | (1L << (SEC - 505)) | (1L << (SED - 505)) | (1L << (SEI - 505)) | (1L << (STA - 505)) | (1L << (STX - 505)) | (1L << (STY - 505)) | (1L << (STZ - 505)) | (1L << (TAX - 505)) | (1L << (TAY - 505)) | (1L << (TSX - 505)) | (1L << (TXA - 505)) | (1L << (TXS - 505)) | (1L << (TYA - 505)))) != 0)) ) {
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0237\u0adb\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\3\2\7\2\u0148"+
		"\n\2\f\2\16\2\u014b\13\2\3\2\3\2\7\2\u014f\n\2\f\2\16\2\u0152\13\2\3\2"+
		"\3\2\6\2\u0156\n\2\r\2\16\2\u0157\3\2\5\2\u015b\n\2\7\2\u015d\n\2\f\2"+
		"\16\2\u0160\13\2\5\2\u0162\n\2\3\2\3\2\3\3\7\3\u0167\n\3\f\3\16\3\u016a"+
		"\13\3\3\3\3\3\7\3\u016e\n\3\f\3\16\3\u0171\13\3\3\3\3\3\6\3\u0175\n\3"+
		"\r\3\16\3\u0176\3\3\5\3\u017a\n\3\7\3\u017c\n\3\f\3\16\3\u017f\13\3\5"+
		"\3\u0181\n\3\3\3\3\3\3\4\5\4\u0186\n\4\3\4\3\4\3\4\3\5\6\5\u018c\n\5\r"+
		"\5\16\5\u018d\3\6\3\6\3\6\3\6\6\6\u0194\n\6\r\6\16\6\u0195\3\6\3\6\3\6"+
		"\5\6\u019b\n\6\3\6\5\6\u019e\n\6\6\6\u01a0\n\6\r\6\16\6\u01a1\3\7\5\7"+
		"\u01a5\n\7\3\7\3\7\3\7\5\7\u01aa\n\7\5\7\u01ac\n\7\3\b\7\b\u01af\n\b\f"+
		"\b\16\b\u01b2\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u01b9\n\t\3\t\5\t\u01bc\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u01c6\n\13\3\f\5\f\u01c9\n"+
		"\f\3\f\3\f\7\f\u01cd\n\f\f\f\16\f\u01d0\13\f\3\f\3\f\7\f\u01d4\n\f\f\f"+
		"\16\f\u01d7\13\f\3\f\5\f\u01da\n\f\3\f\7\f\u01dd\n\f\f\f\16\f\u01e0\13"+
		"\f\3\f\5\f\u01e3\n\f\3\f\7\f\u01e6\n\f\f\f\16\f\u01e9\13\f\3\f\3\f\7\f"+
		"\u01ed\n\f\f\f\16\f\u01f0\13\f\3\f\5\f\u01f3\n\f\3\f\7\f\u01f6\n\f\f\f"+
		"\16\f\u01f9\13\f\3\f\5\f\u01fc\n\f\3\f\7\f\u01ff\n\f\f\f\16\f\u0202\13"+
		"\f\3\f\3\f\7\f\u0206\n\f\f\f\16\f\u0209\13\f\3\f\5\f\u020c\n\f\3\r\5\r"+
		"\u020f\n\r\3\r\3\r\7\r\u0213\n\r\f\r\16\r\u0216\13\r\5\r\u0218\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\7\16\u0220\n\16\f\16\16\16\u0223\13\16\5\16\u0225"+
		"\n\16\3\16\3\16\3\17\5\17\u022a\n\17\3\17\5\17\u022d\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0234\n\17\3\20\7\20\u0237\n\20\f\20\16\20\u023a\13"+
		"\20\3\20\3\20\7\20\u023e\n\20\f\20\16\20\u0241\13\20\3\20\3\20\7\20\u0245"+
		"\n\20\f\20\16\20\u0248\13\20\3\20\7\20\u024b\n\20\f\20\16\20\u024e\13"+
		"\20\3\21\3\21\3\21\5\21\u0253\n\21\3\22\3\22\3\22\3\23\3\23\7\23\u025a"+
		"\n\23\f\23\16\23\u025d\13\23\3\23\3\23\7\23\u0261\n\23\f\23\16\23\u0264"+
		"\13\23\3\23\3\23\3\24\3\24\7\24\u026a\n\24\f\24\16\24\u026d\13\24\3\24"+
		"\7\24\u0270\n\24\f\24\16\24\u0273\13\24\3\24\7\24\u0276\n\24\f\24\16\24"+
		"\u0279\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0285"+
		"\n\25\3\25\7\25\u0288\n\25\f\25\16\25\u028b\13\25\3\26\3\26\7\26\u028f"+
		"\n\26\f\26\16\26\u0292\13\26\3\26\3\26\3\27\5\27\u0297\n\27\3\27\3\27"+
		"\7\27\u029b\n\27\f\27\16\27\u029e\13\27\3\27\3\27\7\27\u02a2\n\27\f\27"+
		"\16\27\u02a5\13\27\3\27\3\27\7\27\u02a9\n\27\f\27\16\27\u02ac\13\27\3"+
		"\27\5\27\u02af\n\27\3\27\7\27\u02b2\n\27\f\27\16\27\u02b5\13\27\3\27\3"+
		"\27\3\30\3\30\7\30\u02bb\n\30\f\30\16\30\u02be\13\30\3\30\3\30\3\30\7"+
		"\30\u02c3\n\30\f\30\16\30\u02c6\13\30\3\30\5\30\u02c9\n\30\3\31\3\31\7"+
		"\31\u02cd\n\31\f\31\16\31\u02d0\13\31\3\31\5\31\u02d3\n\31\3\31\7\31\u02d6"+
		"\n\31\f\31\16\31\u02d9\13\31\3\31\3\31\7\31\u02dd\n\31\f\31\16\31\u02e0"+
		"\13\31\3\31\7\31\u02e3\n\31\f\31\16\31\u02e6\13\31\5\31\u02e8\n\31\3\31"+
		"\7\31\u02eb\n\31\f\31\16\31\u02ee\13\31\3\31\3\31\3\32\3\32\7\32\u02f4"+
		"\n\32\f\32\16\32\u02f7\13\32\6\32\u02f9\n\32\r\32\16\32\u02fa\3\32\5\32"+
		"\u02fe\n\32\3\33\3\33\7\33\u0302\n\33\f\33\16\33\u0305\13\33\3\33\5\33"+
		"\u0308\n\33\3\33\7\33\u030b\n\33\f\33\16\33\u030e\13\33\3\33\5\33\u0311"+
		"\n\33\3\33\7\33\u0314\n\33\f\33\16\33\u0317\13\33\3\33\5\33\u031a\n\33"+
		"\3\34\5\34\u031d\n\34\3\34\3\34\7\34\u0321\n\34\f\34\16\34\u0324\13\34"+
		"\3\34\3\34\7\34\u0328\n\34\f\34\16\34\u032b\13\34\3\34\3\34\5\34\u032f"+
		"\n\34\3\34\7\34\u0332\n\34\f\34\16\34\u0335\13\34\3\34\5\34\u0338\n\34"+
		"\3\34\7\34\u033b\n\34\f\34\16\34\u033e\13\34\3\34\5\34\u0341\n\34\3\34"+
		"\7\34\u0344\n\34\f\34\16\34\u0347\13\34\3\34\3\34\5\34\u034b\n\34\3\34"+
		"\7\34\u034e\n\34\f\34\16\34\u0351\13\34\3\34\3\34\7\34\u0355\n\34\f\34"+
		"\16\34\u0358\13\34\3\34\3\34\7\34\u035c\n\34\f\34\16\34\u035f\13\34\3"+
		"\34\5\34\u0362\n\34\3\34\7\34\u0365\n\34\f\34\16\34\u0368\13\34\3\34\5"+
		"\34\u036b\n\34\3\34\7\34\u036e\n\34\f\34\16\34\u0371\13\34\3\34\5\34\u0374"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u037a\n\35\f\35\16\35\u037d\13\35\5\35"+
		"\u037f\n\35\3\35\3\35\3\36\5\36\u0384\n\36\3\36\3\36\3\36\5\36\u0389\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u0392\n \f \16 \u0395\13 \3 \5 \u0398"+
		"\n \3!\5!\u039b\n!\3!\3!\7!\u039f\n!\f!\16!\u03a2\13!\3!\3!\7!\u03a6\n"+
		"!\f!\16!\u03a9\13!\3!\5!\u03ac\n!\3!\7!\u03af\n!\f!\16!\u03b2\13!\3!\3"+
		"!\7!\u03b6\n!\f!\16!\u03b9\13!\3!\5!\u03bc\n!\3!\7!\u03bf\n!\f!\16!\u03c2"+
		"\13!\3!\5!\u03c5\n!\3\"\5\"\u03c8\n\"\3\"\3\"\7\"\u03cc\n\"\f\"\16\"\u03cf"+
		"\13\"\3\"\5\"\u03d2\n\"\3\"\3\"\7\"\u03d6\n\"\f\"\16\"\u03d9\13\"\3\""+
		"\5\"\u03dc\n\"\3\"\7\"\u03df\n\"\f\"\16\"\u03e2\13\"\3\"\3\"\7\"\u03e6"+
		"\n\"\f\"\16\"\u03e9\13\"\3\"\5\"\u03ec\n\"\3\"\7\"\u03ef\n\"\f\"\16\""+
		"\u03f2\13\"\3\"\5\"\u03f5\n\"\3#\5#\u03f8\n#\3#\3#\7#\u03fc\n#\f#\16#"+
		"\u03ff\13#\3#\5#\u0402\n#\3#\7#\u0405\n#\f#\16#\u0408\13#\3#\3#\7#\u040c"+
		"\n#\f#\16#\u040f\13#\3#\3#\5#\u0413\n#\3#\7#\u0416\n#\f#\16#\u0419\13"+
		"#\3#\3#\5#\u041d\n#\3#\7#\u0420\n#\f#\16#\u0423\13#\3#\5#\u0426\n#\3#"+
		"\7#\u0429\n#\f#\16#\u042c\13#\3#\3#\7#\u0430\n#\f#\16#\u0433\13#\3#\5"+
		"#\u0436\n#\3#\3#\3#\3#\5#\u043c\n#\3#\3#\3#\3#\5#\u0442\n#\5#\u0444\n"+
		"#\3$\3$\3$\3$\7$\u044a\n$\f$\16$\u044d\13$\3$\3$\3%\3%\3%\5%\u0454\n%"+
		"\3&\5&\u0457\n&\3&\3&\5&\u045b\n&\3&\3&\7&\u045f\n&\f&\16&\u0462\13&\3"+
		"&\3&\3&\7&\u0467\n&\f&\16&\u046a\13&\3&\3&\7&\u046e\n&\f&\16&\u0471\13"+
		"&\3&\5&\u0474\n&\3&\7&\u0477\n&\f&\16&\u047a\13&\3&\3&\3&\7&\u047f\n&"+
		"\f&\16&\u0482\13&\3&\5&\u0485\n&\5&\u0487\n&\3\'\5\'\u048a\n\'\3\'\3\'"+
		"\5\'\u048e\n\'\3\'\3\'\7\'\u0492\n\'\f\'\16\'\u0495\13\'\3\'\3\'\3\'\7"+
		"\'\u049a\n\'\f\'\16\'\u049d\13\'\3\'\3\'\5\'\u04a1\n\'\3\'\3\'\7\'\u04a5"+
		"\n\'\f\'\16\'\u04a8\13\'\3\'\3\'\5\'\u04ac\n\'\3(\5(\u04af\n(\3(\3(\7"+
		"(\u04b3\n(\f(\16(\u04b6\13(\3(\3(\7(\u04ba\n(\f(\16(\u04bd\13(\3(\5(\u04c0"+
		"\n(\3(\7(\u04c3\n(\f(\16(\u04c6\13(\3(\3(\7(\u04ca\n(\f(\16(\u04cd\13"+
		"(\3(\3(\3)\3)\7)\u04d3\n)\f)\16)\u04d6\13)\3)\3)\7)\u04da\n)\f)\16)\u04dd"+
		"\13)\3)\3)\7)\u04e1\n)\f)\16)\u04e4\13)\3)\7)\u04e7\n)\f)\16)\u04ea\13"+
		")\3)\7)\u04ed\n)\f)\16)\u04f0\13)\3)\3)\3*\5*\u04f5\n*\3*\7*\u04f8\n*"+
		"\f*\16*\u04fb\13*\3*\3*\7*\u04ff\n*\f*\16*\u0502\13*\3*\3*\7*\u0506\n"+
		"*\f*\16*\u0509\13*\3*\3*\7*\u050d\n*\f*\16*\u0510\13*\5*\u0512\n*\3+\5"+
		"+\u0515\n+\3+\3+\3+\3+\5+\u051b\n+\3,\3,\3,\7,\u0520\n,\f,\16,\u0523\13"+
		",\6,\u0525\n,\r,\16,\u0526\3-\3-\3-\3-\3.\3.\5.\u052f\n.\3.\7.\u0532\n"+
		".\f.\16.\u0535\13.\3.\6.\u0538\n.\r.\16.\u0539\3/\3/\3/\3/\3/\3/\5/\u0542"+
		"\n/\3/\7/\u0545\n/\f/\16/\u0548\13/\3/\3/\5/\u054c\n/\3/\5/\u054f\n/\3"+
		"\60\3\60\5\60\u0553\n\60\3\60\3\60\3\61\3\61\7\61\u0559\n\61\f\61\16\61"+
		"\u055c\13\61\3\61\3\61\7\61\u0560\n\61\f\61\16\61\u0563\13\61\5\61\u0565"+
		"\n\61\3\61\3\61\7\61\u0569\n\61\f\61\16\61\u056c\13\61\3\61\3\61\7\61"+
		"\u0570\n\61\f\61\16\61\u0573\13\61\3\61\3\61\3\62\3\62\3\62\5\62\u057a"+
		"\n\62\3\63\3\63\7\63\u057e\n\63\f\63\16\63\u0581\13\63\3\63\3\63\7\63"+
		"\u0585\n\63\f\63\16\63\u0588\13\63\3\63\7\63\u058b\n\63\f\63\16\63\u058e"+
		"\13\63\3\64\3\64\7\64\u0592\n\64\f\64\16\64\u0595\13\64\3\64\5\64\u0598"+
		"\n\64\3\65\3\65\5\65\u059c\n\65\3\66\3\66\3\66\5\66\u05a1\n\66\3\66\3"+
		"\66\3\66\5\66\u05a6\n\66\7\66\u05a8\n\66\f\66\16\66\u05ab\13\66\3\66\3"+
		"\66\3\67\3\67\7\67\u05b1\n\67\f\67\16\67\u05b4\13\67\3\67\3\67\7\67\u05b8"+
		"\n\67\f\67\16\67\u05bb\13\67\3\67\3\67\7\67\u05bf\n\67\f\67\16\67\u05c2"+
		"\13\67\3\67\7\67\u05c5\n\67\f\67\16\67\u05c8\13\67\38\78\u05cb\n8\f8\16"+
		"8\u05ce\138\38\38\78\u05d2\n8\f8\168\u05d5\138\38\38\78\u05d9\n8\f8\16"+
		"8\u05dc\138\38\38\39\39\39\39\3:\3:\3:\3:\3;\7;\u05e9\n;\f;\16;\u05ec"+
		"\13;\3;\3;\6;\u05f0\n;\r;\16;\u05f1\3;\5;\u05f5\n;\7;\u05f7\n;\f;\16;"+
		"\u05fa\13;\5;\u05fc\n;\3<\3<\5<\u0600\n<\3=\7=\u0603\n=\f=\16=\u0606\13"+
		"=\3=\7=\u0609\n=\f=\16=\u060c\13=\3=\3=\3>\7>\u0611\n>\f>\16>\u0614\13"+
		">\3>\3>\3>\3>\5>\u061a\n>\3?\3?\3?\3?\7?\u0620\n?\f?\16?\u0623\13?\3@"+
		"\3@\7@\u0627\n@\f@\16@\u062a\13@\3@\3@\7@\u062e\n@\f@\16@\u0631\13@\3"+
		"@\7@\u0634\n@\f@\16@\u0637\13@\3A\3A\7A\u063b\nA\fA\16A\u063e\13A\3A\3"+
		"A\7A\u0642\nA\fA\16A\u0645\13A\3A\7A\u0648\nA\fA\16A\u064b\13A\3B\3B\3"+
		"B\7B\u0650\nB\fB\16B\u0653\13B\3B\3B\7B\u0657\nB\fB\16B\u065a\13B\3C\3"+
		"C\3C\7C\u065f\nC\fC\16C\u0662\13C\3C\3C\5C\u0666\nC\3D\3D\3D\7D\u066b"+
		"\nD\fD\16D\u066e\13D\3D\3D\6D\u0672\nD\rD\16D\u0673\3D\3D\7D\u0678\nD"+
		"\fD\16D\u067b\13D\3D\3D\5D\u067f\nD\3E\3E\7E\u0683\nE\fE\16E\u0686\13"+
		"E\3E\3E\7E\u068a\nE\fE\16E\u068d\13E\3E\7E\u0690\nE\fE\16E\u0693\13E\3"+
		"F\3F\3F\7F\u0698\nF\fF\16F\u069b\13F\3F\3F\7F\u069f\nF\fF\16F\u06a2\13"+
		"F\3G\3G\3G\7G\u06a7\nG\fG\16G\u06aa\13G\3G\7G\u06ad\nG\fG\16G\u06b0\13"+
		"G\3H\3H\3H\7H\u06b5\nH\fH\16H\u06b8\13H\3H\3H\7H\u06bc\nH\fH\16H\u06bf"+
		"\13H\3I\3I\3I\7I\u06c4\nI\fI\16I\u06c7\13I\3I\3I\7I\u06cb\nI\fI\16I\u06ce"+
		"\13I\3J\3J\7J\u06d2\nJ\fJ\16J\u06d5\13J\3J\3J\3J\7J\u06da\nJ\fJ\16J\u06dd"+
		"\13J\3K\7K\u06e0\nK\fK\16K\u06e3\13K\3K\3K\3L\3L\5L\u06e9\nL\3L\7L\u06ec"+
		"\nL\fL\16L\u06ef\13L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u06fd\nM\3"+
		"N\3N\3N\3N\3O\3O\5O\u0705\nO\3O\7O\u0708\nO\fO\16O\u070b\13O\3O\3O\7O"+
		"\u070f\nO\fO\16O\u0712\13O\3O\6O\u0715\nO\rO\16O\u0716\5O\u0719\nO\3P"+
		"\7P\u071c\nP\fP\16P\u071f\13P\3P\5P\u0722\nP\3P\7P\u0725\nP\fP\16P\u0728"+
		"\13P\3P\3P\3Q\3Q\3Q\3Q\7Q\u0730\nQ\fQ\16Q\u0733\13Q\5Q\u0735\nQ\3Q\3Q"+
		"\3R\3R\3R\3R\7R\u073d\nR\fR\16R\u0740\13R\5R\u0742\nR\3R\3R\3S\3S\7S\u0748"+
		"\nS\fS\16S\u074b\13S\3S\3S\7S\u074f\nS\fS\16S\u0752\13S\3S\3S\7S\u0756"+
		"\nS\fS\16S\u0759\13S\3S\7S\u075c\nS\fS\16S\u075f\13S\3S\3S\3T\5T\u0764"+
		"\nT\3T\3T\5T\u0768\nT\3U\6U\u076b\nU\rU\16U\u076c\3V\3V\7V\u0771\nV\f"+
		"V\16V\u0774\13V\3V\3V\7V\u0778\nV\fV\16V\u077b\13V\5V\u077d\nV\3V\5V\u0780"+
		"\nV\3V\7V\u0783\nV\fV\16V\u0786\13V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\5"+
		"W\u0793\nW\3X\3X\5X\u0797\nX\3Y\3Y\3Y\7Y\u079c\nY\fY\16Y\u079f\13Y\3Y"+
		"\3Y\3Z\3Z\3Z\3Z\3Z\7Z\u07a8\nZ\fZ\16Z\u07ab\13Z\3Z\3Z\3[\3[\3\\\3\\\3"+
		"\\\3\\\3]\3]\3^\3^\3^\3^\3_\7_\u07bc\n_\f_\16_\u07bf\13_\3_\3_\7_\u07c3"+
		"\n_\f_\16_\u07c6\13_\3_\3_\7_\u07ca\n_\f_\16_\u07cd\13_\3_\3_\3_\3_\7"+
		"_\u07d3\n_\f_\16_\u07d6\13_\3_\3_\7_\u07da\n_\f_\16_\u07dd\13_\3_\3_\7"+
		"_\u07e1\n_\f_\16_\u07e4\13_\3_\3_\7_\u07e8\n_\f_\16_\u07eb\13_\3_\3_\5"+
		"_\u07ef\n_\3`\5`\u07f2\n`\3`\7`\u07f5\n`\f`\16`\u07f8\13`\3`\3`\7`\u07fc"+
		"\n`\f`\16`\u07ff\13`\3`\7`\u0802\n`\f`\16`\u0805\13`\3a\3a\3a\7a\u080a"+
		"\na\fa\16a\u080d\13a\3a\3a\7a\u0811\na\fa\16a\u0814\13a\3a\5a\u0817\n"+
		"a\5a\u0819\na\3b\3b\7b\u081d\nb\fb\16b\u0820\13b\3b\3b\7b\u0824\nb\fb"+
		"\16b\u0827\13b\3b\5b\u082a\nb\3b\7b\u082d\nb\fb\16b\u0830\13b\3b\3b\3"+
		"c\3c\5c\u0836\nc\3c\3c\7c\u083a\nc\fc\16c\u083d\13c\3c\3c\3d\3d\5d\u0843"+
		"\nd\3e\3e\3e\7e\u0848\ne\fe\16e\u084b\13e\3e\3e\7e\u084f\ne\fe\16e\u0852"+
		"\13e\3e\3e\5e\u0856\ne\3e\5e\u0859\ne\3f\3f\5f\u085d\nf\3g\3g\7g\u0861"+
		"\ng\fg\16g\u0864\13g\3g\3g\3g\3g\7g\u086a\ng\fg\16g\u086d\13g\3g\5g\u0870"+
		"\ng\3g\5g\u0873\ng\3g\7g\u0876\ng\fg\16g\u0879\13g\3g\3g\7g\u087d\ng\f"+
		"g\16g\u0880\13g\3g\5g\u0883\ng\5g\u0885\ng\3h\3h\5h\u0889\nh\3i\3i\7i"+
		"\u088d\ni\fi\16i\u0890\13i\3i\3i\3i\3i\5i\u0896\ni\3i\7i\u0899\ni\fi\16"+
		"i\u089c\13i\3i\3i\7i\u08a0\ni\fi\16i\u08a3\13i\3i\3i\7i\u08a7\ni\fi\16"+
		"i\u08aa\13i\7i\u08ac\ni\fi\16i\u08af\13i\3i\7i\u08b2\ni\fi\16i\u08b5\13"+
		"i\3i\3i\3j\3j\7j\u08bb\nj\fj\16j\u08be\13j\3j\3j\7j\u08c2\nj\fj\16j\u08c5"+
		"\13j\3j\7j\u08c8\nj\fj\16j\u08cb\13j\3j\7j\u08ce\nj\fj\16j\u08d1\13j\3"+
		"j\3j\7j\u08d5\nj\fj\16j\u08d8\13j\3j\3j\5j\u08dc\nj\3j\3j\7j\u08e0\nj"+
		"\fj\16j\u08e3\13j\3j\3j\7j\u08e7\nj\fj\16j\u08ea\13j\3j\5j\u08ed\nj\3"+
		"k\3k\3k\5k\u08f2\nk\3l\3l\7l\u08f6\nl\fl\16l\u08f9\13l\3l\3l\3m\3m\7m"+
		"\u08ff\nm\fm\16m\u0902\13m\3m\3m\3n\3n\7n\u0908\nn\fn\16n\u090b\13n\3"+
		"n\3n\7n\u090f\nn\fn\16n\u0912\13n\3n\7n\u0915\nn\fn\16n\u0918\13n\3n\7"+
		"n\u091b\nn\fn\16n\u091e\13n\3n\5n\u0921\nn\3o\3o\7o\u0925\no\fo\16o\u0928"+
		"\13o\3o\3o\7o\u092c\no\fo\16o\u092f\13o\3o\3o\3o\3o\3o\7o\u0936\no\fo"+
		"\16o\u0939\13o\3o\3o\3p\3p\7p\u093f\np\fp\16p\u0942\13p\3p\3p\3q\3q\3"+
		"q\5q\u0949\nq\3r\3r\7r\u094d\nr\fr\16r\u0950\13r\3r\3r\7r\u0954\nr\fr"+
		"\16r\u0957\13r\3r\3r\5r\u095b\nr\3r\3r\3r\3r\7r\u0961\nr\fr\16r\u0964"+
		"\13r\3r\5r\u0967\nr\3s\3s\7s\u096b\ns\fs\16s\u096e\13s\3s\3s\3s\3s\7s"+
		"\u0974\ns\fs\16s\u0977\13s\3s\5s\u097a\ns\3t\3t\7t\u097e\nt\ft\16t\u0981"+
		"\13t\3t\5t\u0984\nt\3t\7t\u0987\nt\ft\16t\u098a\13t\3t\3t\7t\u098e\nt"+
		"\ft\16t\u0991\13t\3t\3t\3t\3t\3u\3u\7u\u0999\nu\fu\16u\u099c\13u\3u\3"+
		"u\3u\5u\u09a1\nu\3u\3u\3u\3u\5u\u09a7\nu\3v\3v\3v\7v\u09ac\nv\fv\16v\u09af"+
		"\13v\7v\u09b1\nv\fv\16v\u09b4\13v\5v\u09b6\nv\3v\7v\u09b9\nv\fv\16v\u09bc"+
		"\13v\3v\3v\7v\u09c0\nv\fv\16v\u09c3\13v\3v\3v\5v\u09c7\nv\3w\3w\3x\3x"+
		"\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\5\177\u09e0\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\7\u0080\u09e9\n\u0080\f\u0080\16\u0080\u09ec\13\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u09f1\n\u0080\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u09f6\n\u0081\3\u0082\3\u0082\6\u0082\u09fa\n\u0082\r\u0082\16\u0082"+
		"\u09fb\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0a07\n\u0083\3\u0083\7\u0083\u0a0a\n\u0083\f\u0083\16"+
		"\u0083\u0a0d\13\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\7\u008d\u0a23\n\u008d\f\u008d"+
		"\16\u008d\u0a26\13\u008d\3\u008e\3\u008e\5\u008e\u0a2a\n\u008e\3\u008e"+
		"\7\u008e\u0a2d\n\u008e\f\u008e\16\u008e\u0a30\13\u008e\3\u008f\3\u008f"+
		"\7\u008f\u0a34\n\u008f\f\u008f\16\u008f\u0a37\13\u008f\3\u008f\3\u008f"+
		"\7\u008f\u0a3b\n\u008f\f\u008f\16\u008f\u0a3e\13\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\7\u008f\u0a44\n\u008f\f\u008f\16\u008f\u0a47\13\u008f"+
		"\3\u008f\5\u008f\u0a4a\n\u008f\3\u008f\7\u008f\u0a4d\n\u008f\f\u008f\16"+
		"\u008f\u0a50\13\u008f\3\u008f\5\u008f\u0a53\n\u008f\5\u008f\u0a55\n\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\6\u0090\u0a5b\n\u0090\r\u0090\16\u0090"+
		"\u0a5c\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\6\u0090\u0a64\n\u0090\r"+
		"\u0090\16\u0090\u0a65\3\u0090\3\u0090\5\u0090\u0a6a\n\u0090\3\u0091\3"+
		"\u0091\3\u0092\3\u0092\5\u0092\u0a70\n\u0092\3\u0092\5\u0092\u0a73\n\u0092"+
		"\3\u0093\3\u0093\7\u0093\u0a77\n\u0093\f\u0093\16\u0093\u0a7a\13\u0093"+
		"\3\u0093\3\u0093\7\u0093\u0a7e\n\u0093\f\u0093\16\u0093\u0a81\13\u0093"+
		"\3\u0094\3\u0094\3\u0095\6\u0095\u0a86\n\u0095\r\u0095\16\u0095\u0a87"+
		"\3\u0095\7\u0095\u0a8b\n\u0095\f\u0095\16\u0095\u0a8e\13\u0095\3\u0095"+
		"\3\u0095\7\u0095\u0a92\n\u0095\f\u0095\16\u0095\u0a95\13\u0095\5\u0095"+
		"\u0a97\n\u0095\3\u0096\3\u0096\3\u0097\5\u0097\u0a9c\n\u0097\3\u0097\6"+
		"\u0097\u0a9f\n\u0097\r\u0097\16\u0097\u0aa0\3\u0098\3\u0098\3\u0098\5"+
		"\u0098\u0aa6\n\u0098\3\u0099\5\u0099\u0aa9\n\u0099\3\u0099\3\u0099\5\u0099"+
		"\u0aad\n\u0099\3\u0099\5\u0099\u0ab0\n\u0099\3\u009a\3\u009a\3\u009a\3"+
		"\u009b\3\u009b\3\u009b\5\u009b\u0ab8\n\u009b\3\u009c\3\u009c\3\u009d\5"+
		"\u009d\u0abd\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0ac3\n\u009d"+
		"\3\u009d\3\u009d\5\u009d\u0ac7\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\5\u009d\u0acd\n\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\2\2\u00a4\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\2\35\3\2=>\3\2AB\4\2\35\35"+
		"EE\3\2\u009e\u00a0\3\2\u00a4\u00a6\4\2\67\67VV\3\2&\'\5\2\35\"\u012e\u012e"+
		"\u0131\u0132\4\2\61\62\64\65\3\2-\60\4\2[[]]\4\2ZZ\\\\\4\2\24\25\u012f"+
		"\u012f\4\2\21\23\u0130\u0130\5\2\33\33\63\63YY\3\2nr\4\2yy~~\3\2jm\4\2"+
		"[[^^\4\2sx\u00ad\u00ad\3\2z|\3\2\177\u0081\5\2::_beh\n\2<<DGKKPQ^^cdi"+
		"\u0082\u008e\u008e\4\2\7\7\34\34\3\2\24\25\3\2\u01fb\u0237\2\u0c19\2\u0149"+
		"\3\2\2\2\4\u0168\3\2\2\2\6\u0185\3\2\2\2\b\u018b\3\2\2\2\n\u019f\3\2\2"+
		"\2\f\u01ab\3\2\2\2\16\u01b0\3\2\2\2\20\u01b3\3\2\2\2\22\u01bd\3\2\2\2"+
		"\24\u01c5\3\2\2\2\26\u01c8\3\2\2\2\30\u020e\3\2\2\2\32\u021b\3\2\2\2\34"+
		"\u0229\3\2\2\2\36\u0238\3\2\2\2 \u0252\3\2\2\2\"\u0254\3\2\2\2$\u0257"+
		"\3\2\2\2&\u0267\3\2\2\2(\u0284\3\2\2\2*\u028c\3\2\2\2,\u0296\3\2\2\2."+
		"\u02c8\3\2\2\2\60\u02ca\3\2\2\2\62\u02f8\3\2\2\2\64\u02ff\3\2\2\2\66\u031c"+
		"\3\2\2\28\u0375\3\2\2\2:\u0383\3\2\2\2<\u038a\3\2\2\2>\u0397\3\2\2\2@"+
		"\u039a\3\2\2\2B\u03c7\3\2\2\2D\u03f7\3\2\2\2F\u0445\3\2\2\2H\u0450\3\2"+
		"\2\2J\u0486\3\2\2\2L\u04ab\3\2\2\2N\u04ae\3\2\2\2P\u04d0\3\2\2\2R\u04f4"+
		"\3\2\2\2T\u0514\3\2\2\2V\u0524\3\2\2\2X\u0528\3\2\2\2Z\u052e\3\2\2\2\\"+
		"\u054e\3\2\2\2^\u0550\3\2\2\2`\u0564\3\2\2\2b\u0579\3\2\2\2d\u057b\3\2"+
		"\2\2f\u058f\3\2\2\2h\u059b\3\2\2\2j\u059d\3\2\2\2l\u05ae\3\2\2\2n\u05cc"+
		"\3\2\2\2p\u05df\3\2\2\2r\u05e3\3\2\2\2t\u05ea\3\2\2\2v\u05ff\3\2\2\2x"+
		"\u0604\3\2\2\2z\u0612\3\2\2\2|\u061b\3\2\2\2~\u0624\3\2\2\2\u0080\u0638"+
		"\3\2\2\2\u0082\u064c\3\2\2\2\u0084\u065b\3\2\2\2\u0086\u0667\3\2\2\2\u0088"+
		"\u0680\3\2\2\2\u008a\u0694\3\2\2\2\u008c\u06a3\3\2\2\2\u008e\u06b1\3\2"+
		"\2\2\u0090\u06c0\3\2\2\2\u0092\u06cf\3\2\2\2\u0094\u06e1\3\2\2\2\u0096"+
		"\u06e8\3\2\2\2\u0098\u06fc\3\2\2\2\u009a\u06fe\3\2\2\2\u009c\u0718\3\2"+
		"\2\2\u009e\u071d\3\2\2\2\u00a0\u072b\3\2\2\2\u00a2\u0738\3\2\2\2\u00a4"+
		"\u0745\3\2\2\2\u00a6\u0767\3\2\2\2\u00a8\u076a\3\2\2\2\u00aa\u077c\3\2"+
		"\2\2\u00ac\u0792\3\2\2\2\u00ae\u0796\3\2\2\2\u00b0\u0798\3\2\2\2\u00b2"+
		"\u07a2\3\2\2\2\u00b4\u07ae\3\2\2\2\u00b6\u07b0\3\2\2\2\u00b8\u07b4\3\2"+
		"\2\2\u00ba\u07b6\3\2\2\2\u00bc\u07bd\3\2\2\2\u00be\u07f1\3\2\2\2\u00c0"+
		"\u0818\3\2\2\2\u00c2\u081a\3\2\2\2\u00c4\u0833\3\2\2\2\u00c6\u0840\3\2"+
		"\2\2\u00c8\u0844\3\2\2\2\u00ca\u085c\3\2\2\2\u00cc\u085e\3\2\2\2\u00ce"+
		"\u0888\3\2\2\2\u00d0\u088a\3\2\2\2\u00d2\u08ec\3\2\2\2\u00d4\u08f1\3\2"+
		"\2\2\u00d6\u08f3\3\2\2\2\u00d8\u08fc\3\2\2\2\u00da\u0905\3\2\2\2\u00dc"+
		"\u0922\3\2\2\2\u00de\u093c\3\2\2\2\u00e0\u0948\3\2\2\2\u00e2\u094a\3\2"+
		"\2\2\u00e4\u0968\3\2\2\2\u00e6\u097b\3\2\2\2\u00e8\u09a6\3\2\2\2\u00ea"+
		"\u09b5\3\2\2\2\u00ec\u09c8\3\2\2\2\u00ee\u09ca\3\2\2\2\u00f0\u09cc\3\2"+
		"\2\2\u00f2\u09ce\3\2\2\2\u00f4\u09d0\3\2\2\2\u00f6\u09d2\3\2\2\2\u00f8"+
		"\u09d4\3\2\2\2\u00fa\u09d6\3\2\2\2\u00fc\u09df\3\2\2\2\u00fe\u09f0\3\2"+
		"\2\2\u0100\u09f5\3\2\2\2\u0102\u09f9\3\2\2\2\u0104\u0a06\3\2\2\2\u0106"+
		"\u0a0e\3\2\2\2\u0108\u0a10\3\2\2\2\u010a\u0a12\3\2\2\2\u010c\u0a14\3\2"+
		"\2\2\u010e\u0a16\3\2\2\2\u0110\u0a18\3\2\2\2\u0112\u0a1a\3\2\2\2\u0114"+
		"\u0a1c\3\2\2\2\u0116\u0a1e\3\2\2\2\u0118\u0a20\3\2\2\2\u011a\u0a29\3\2"+
		"\2\2\u011c\u0a54\3\2\2\2\u011e\u0a69\3\2\2\2\u0120\u0a6b\3\2\2\2\u0122"+
		"\u0a6d\3\2\2\2\u0124\u0a74\3\2\2\2\u0126\u0a82\3\2\2\2\u0128\u0a96\3\2"+
		"\2\2\u012a\u0a98\3\2\2\2\u012c\u0a9e\3\2\2\2\u012e\u0aa5\3\2\2\2\u0130"+
		"\u0aa8\3\2\2\2\u0132\u0ab1\3\2\2\2\u0134\u0ab4\3\2\2\2\u0136\u0ab9\3\2"+
		"\2\2\u0138\u0acc\3\2\2\2\u013a\u0ace\3\2\2\2\u013c\u0ad0\3\2\2\2\u013e"+
		"\u0ad2\3\2\2\2\u0140\u0ad4\3\2\2\2\u0142\u0ad6\3\2\2\2\u0144\u0ad8\3\2"+
		"\2\2\u0146\u0148\7\7\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0150\5\6\4\2\u014d\u014f\5\u012a\u0096\2\u014e\u014d\3\2\2"+
		"\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0161"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u015e\5\24\13\2\u0154\u0156\5\u012a"+
		"\u0096\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u015b\5\24\13\2\u015a\u0159\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u0155\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\7\2\2\3\u0164\3\3\2\2\2\u0165\u0167\7\7\2\2"+
		"\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016f\5\6\4\2\u016c"+
		"\u016e\5\u012a\u0096\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0180\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u017d\5|?\2\u0173\u0175\5\u012a\u0096\2\u0174\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u017a\5|?\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2"+
		"\2\u017b\u0174\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0172\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\2\2\3\u0183\5\3\2\2\2"+
		"\u0184\u0186\5\b\5\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0188\5\f\7\2\u0188\u0189\5\16\b\2\u0189\7\3\2\2\2\u018a"+
		"\u018c\5\n\6\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\t\3\2\2\2\u018f\u0190\7:\2\2\u0190\u019a"+
		"\7\33\2\2\u0191\u0193\7\r\2\2\u0192\u0194\5\u0122\u0092\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\7\16\2\2\u0198\u019b\3\2\2\2\u0199\u019b\5"+
		"\u0122\u0092\2\u019a\u0191\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019d\3\2"+
		"\2\2\u019c\u019e\5\u0128\u0095\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2"+
		"\2\u019e\u01a0\3\2\2\2\u019f\u018f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\13\3\2\2\2\u01a3\u01a5\5\u0102\u0082"+
		"\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7"+
		"\7;\2\2\u01a7\u01a9\5\u0124\u0093\2\u01a8\u01aa\5\u0128\u0095\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a4\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\r\3\2\2\2\u01ad\u01af\5\20\t\2\u01ae\u01ad"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\17\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7<\2\2\u01b4\u01b8\5\u0124"+
		"\u0093\2\u01b5\u01b6\7\t\2\2\u01b6\u01b9\7\21\2\2\u01b7\u01b9\5\22\n\2"+
		"\u01b8\u01b5\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01bc\5\u0128\u0095\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3"+
		"\2\2\2\u01bc\21\3\2\2\2\u01bd\u01be\7Y\2\2\u01be\u01bf\5\u0126\u0094\2"+
		"\u01bf\23\3\2\2\2\u01c0\u01c6\5\26\f\2\u01c1\u01c6\5@!\2\u01c2\u01c6\5"+
		"\66\34\2\u01c3\u01c6\5D#\2\u01c4\u01c6\5N(\2\u01c5\u01c0\3\2\2\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\25\3\2\2\2\u01c7\u01c9\5\u0102\u0082\2\u01c8\u01c7\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01ce\t\2\2\2\u01cb\u01cd"+
		"\7\7\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d9\5\u0126"+
		"\u0094\2\u01d2\u01d4\7\7\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01da\5P)\2\u01d9\u01d5\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01e2"+
		"\3\2\2\2\u01db\u01dd\7\7\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e1\u01e3\5\30\r\2\u01e2\u01de\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01f2\3\2\2\2\u01e4\u01e6\7\7\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01ee\7\33\2\2\u01eb\u01ed\7\7\2\2\u01ec\u01eb\3"+
		"\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\5\36\20\2\u01f2\u01e7\3"+
		"\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01fb\3\2\2\2\u01f4\u01f6\7\7\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc\5l\67\2\u01fb"+
		"\u01f7\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u020b\3\2\2\2\u01fd\u01ff\7\7"+
		"\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u020c\5&"+
		"\24\2\u0204\u0206\7\7\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020c\5\60\31\2\u020b\u0200\3\2\2\2\u020b\u0207\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\27\3\2\2\2\u020d\u020f\5\u0102\u0082\2\u020e\u020d"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0217\3\2\2\2\u0210\u0214\7D\2\2\u0211"+
		"\u0213\7\7\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0210\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5\32"+
		"\16\2\u021a\31\3\2\2\2\u021b\u0224\7\13\2\2\u021c\u0221\5\34\17\2\u021d"+
		"\u021e\7\n\2\2\u021e\u0220\5\34\17\2\u021f\u021d\3\2\2\2\u0220\u0223\3"+
		"\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u021c\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0227\7\f\2\2\u0227\33\3\2\2\2\u0228\u022a\5\u0102\u0082\2"+
		"\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u022d"+
		"\t\3\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\5\u0126\u0094\2\u022f\u0230\7\33\2\2\u0230\u0233\5T+\2\u0231\u0232"+
		"\7\35\2\2\u0232\u0234\5|?\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\35\3\2\2\2\u0235\u0237\5\u011a\u008e\2\u0236\u0235\3\2\2\2\u0237\u023a"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023b\u024c\5 \21\2\u023c\u023e\7\7\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0246\7\n\2\2\u0243\u0245\7\7"+
		"\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024b\5 "+
		"\21\2\u024a\u023f\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\37\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0253\5\"\22"+
		"\2\u0250\u0253\5d\63\2\u0251\u0253\5$\23\2\u0252\u024f\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0251\3\2\2\2\u0253!\3\2\2\2\u0254\u0255\5d\63\2\u0255"+
		"\u0256\5\u009cO\2\u0256#\3\2\2\2\u0257\u025b\5d\63\2\u0258\u025a\7\7\2"+
		"\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0262\7E\2\2\u025f"+
		"\u0261\7\7\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265"+
		"\u0266\5|?\2\u0266%\3\2\2\2\u0267\u026b\7\17\2\2\u0268\u026a\7\7\2\2\u0269"+
		"\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u0271\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0270\5(\25\2\u026f"+
		"\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0277\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0276\7\7\2\2\u0275"+
		"\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\7\20\2\2\u027b"+
		"\'\3\2\2\2\u027c\u0285\5\26\f\2\u027d\u0285\5\66\34\2\u027e\u0285\5@!"+
		"\2\u027f\u0285\5B\"\2\u0280\u0285\5D#\2\u0281\u0285\5*\26\2\u0282\u0285"+
		"\5,\27\2\u0283\u0285\5N(\2\u0284\u027c\3\2\2\2\u0284\u027d\3\2\2\2\u0284"+
		"\u027e\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0281\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285\u0289\3\2\2\2\u0286"+
		"\u0288\5\u012a\u0096\2\u0287\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a)\3\2\2\2\u028b\u0289\3\2\2\2\u028c"+
		"\u0290\7G\2\2\u028d\u028f\7\7\2\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2"+
		"\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0293\u0294\5p9\2\u0294+\3\2\2\2\u0295\u0297\5\u0102\u0082"+
		"\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029c"+
		"\7D\2\2\u0299\u029b\7\7\2\2\u029a\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029f\u02ae\58\35\2\u02a0\u02a2\7\7\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02aa\7\33\2\2\u02a7\u02a9\7\7\2\2\u02a8"+
		"\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\5.\30\2\u02ae"+
		"\u02a3\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0\u02b2\7\7"+
		"\2\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\5p"+
		"9\2\u02b7-\3\2\2\2\u02b8\u02bc\7H\2\2\u02b9\u02bb\7\7\2\2\u02ba\u02b9"+
		"\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c9\5\u00a2R\2\u02c0\u02c4"+
		"\7I\2\2\u02c1\u02c3\7\7\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c7\u02c9\5\u00a2R\2\u02c8\u02b8\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c9"+
		"/\3\2\2\2\u02ca\u02ce\7\17\2\2\u02cb\u02cd\7\7\2\2\u02cc\u02cb\3\2\2\2"+
		"\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d2"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\5\62\32\2\u02d2\u02d1\3\2\2\2"+
		"\u02d2\u02d3\3\2\2\2\u02d3\u02e7\3\2\2\2\u02d4\u02d6\7\7\2\2\u02d5\u02d4"+
		"\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02de\7\34\2\2\u02db\u02dd\7"+
		"\7\2\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e4\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\5("+
		"\25\2\u02e2\u02e1\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02d7\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ec\3\2\2\2\u02e9\u02eb\7\7\2\2\u02ea"+
		"\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f0\7\20\2\2\u02f0"+
		"\61\3\2\2\2\u02f1\u02f5\5\64\33\2\u02f2\u02f4\7\7\2\2\u02f3\u02f2\3\2"+
		"\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f1\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc"+
		"\u02fe\7\34\2\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\63\3\2\2"+
		"\2\u02ff\u0307\5\u0126\u0094\2\u0300\u0302\7\7\2\2\u0301\u0300\3\2\2\2"+
		"\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306"+
		"\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0308\5\u00a2R\2\u0307\u0303\3\2\2"+
		"\2\u0307\u0308\3\2\2\2\u0308\u0310\3\2\2\2\u0309\u030b\7\7\2\2\u030a\u0309"+
		"\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0311\5&\24\2\u0310\u030c\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0319\3\2\2\2\u0312\u0314\7\7\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031a\7\n\2\2\u0319"+
		"\u0315\3\2\2\2\u0319\u031a\3\2\2\2\u031a\65\3\2\2\2\u031b\u031d\5\u0102"+
		"\u0082\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u032e\7?\2\2\u031f\u0321\7\7\2\2\u0320\u031f\3\2\2\2\u0321\u0324\3\2"+
		"\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0325\u0329\5T+\2\u0326\u0328\7\7\2\2\u0327\u0326\3\2\2"+
		"\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c"+
		"\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\7\t\2\2\u032d\u032f\3\2\2\2\u032e"+
		"\u0322\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0337\3\2\2\2\u0330\u0332\7\7"+
		"\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0338\5P"+
		")\2\u0337\u0333\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0340\3\2\2\2\u0339"+
		"\u033b\7\7\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f"+
		"\u0341\5\u0124\u0093\2\u0340\u033c\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u034a"+
		"\3\2\2\2\u0342\u0344\7\7\2\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348\u0349\7\u00ca\2\2\u0349\u034b\5h\65\2\u034a\u0345\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034f\3\2\2\2\u034c\u034e\7\7\2\2\u034d\u034c\3\2"+
		"\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0352\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0361\58\35\2\u0353\u0355\7\7"+
		"\2\2\u0354\u0353\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035d\7\33"+
		"\2\2\u035a\u035c\7\7\2\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2"+
		"\2\2\u0360\u0362\5T+\2\u0361\u0356\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u036a"+
		"\3\2\2\2\u0363\u0365\7\7\2\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366"+
		"\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2"+
		"\2\2\u0369\u036b\5l\67\2\u036a\u0366\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u0373\3\2\2\2\u036c\u036e\7\7\2\2\u036d\u036c\3\2\2\2\u036e\u0371\3\2"+
		"\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0372\u0374\5> \2\u0373\u036f\3\2\2\2\u0373\u0374\3\2\2"+
		"\2\u0374\67\3\2\2\2\u0375\u037e\7\13\2\2\u0376\u037b\5:\36\2\u0377\u0378"+
		"\7\n\2\2\u0378\u037a\5:\36\2\u0379\u0377\3\2\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037e\u0376\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\7\f\2\2\u03819\3\2\2\2\u0382\u0384\5\u0102\u0082\2\u0383\u0382"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0388\5<\37\2\u0386"+
		"\u0387\7\35\2\2\u0387\u0389\5|?\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2"+
		"\2\2\u0389;\3\2\2\2\u038a\u038b\5\u0126\u0094\2\u038b\u038c\7\33\2\2\u038c"+
		"\u038d\5T+\2\u038d=\3\2\2\2\u038e\u0398\5p9\2\u038f\u0393\7\35\2\2\u0390"+
		"\u0392\7\7\2\2\u0391\u0390\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0393\3\2\2\2\u0396"+
		"\u0398\5|?\2\u0397\u038e\3\2\2\2\u0397\u038f\3\2\2\2\u0398?\3\2\2\2\u0399"+
		"\u039b\5\u0102\u0082\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c"+
		"\3\2\2\2\u039c\u03a0\7@\2\2\u039d\u039f\7\7\2\2\u039e\u039d\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03ab\5\u0126\u0094\2\u03a4\u03a6\7\7\2"+
		"\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8"+
		"\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ac\5\30\r\2"+
		"\u03ab\u03a7\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03bb\3\2\2\2\u03ad\u03af"+
		"\7\7\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b7\7\33"+
		"\2\2\u03b4\u03b6\7\7\2\2\u03b5\u03b4\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03b7\3\2"+
		"\2\2\u03ba\u03bc\5\36\20\2\u03bb\u03b0\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03c4\3\2\2\2\u03bd\u03bf\7\7\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2"+
		"\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c3\u03c5\5&\24\2\u03c4\u03c0\3\2\2\2\u03c4\u03c5\3\2"+
		"\2\2\u03c5A\3\2\2\2\u03c6\u03c8\5\u0102\u0082\2\u03c7\u03c6\3\2\2\2\u03c7"+
		"\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cd\7F\2\2\u03ca\u03cc\7\7"+
		"\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d2\5\u0102"+
		"\u0082\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03db\7@\2\2\u03d4\u03d6\7\7\2\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03dc\5\u0126\u0094\2\u03db\u03d7\3\2\2\2\u03db\u03dc"+
		"\3\2\2\2\u03dc\u03eb\3\2\2\2\u03dd\u03df\7\7\2\2\u03de\u03dd\3\2\2\2\u03df"+
		"\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2"+
		"\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e7\7\33\2\2\u03e4\u03e6\7\7\2\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2"+
		"\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03ec\5\36\20\2\u03eb"+
		"\u03e0\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03f4\3\2\2\2\u03ed\u03ef\7\7"+
		"\2\2\u03ee\u03ed\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f5\5&"+
		"\24\2\u03f4\u03f0\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5C\3\2\2\2\u03f6\u03f8"+
		"\5\u0102\u0082\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3"+
		"\2\2\2\u03f9\u0401\t\3\2\2\u03fa\u03fc\7\7\2\2\u03fb\u03fa\3\2\2\2\u03fc"+
		"\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2"+
		"\2\2\u03ff\u03fd\3\2\2\2\u0400\u0402\5P)\2\u0401\u03fd\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0412\3\2\2\2\u0403\u0405\7\7\2\2\u0404\u0403\3\2\2\2\u0405"+
		"\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2"+
		"\2\2\u0408\u0406\3\2\2\2\u0409\u040d\5T+\2\u040a\u040c\7\7\2\2\u040b\u040a"+
		"\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\7\t\2\2\u0411\u0413\3\2"+
		"\2\2\u0412\u0406\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0417\3\2\2\2\u0414"+
		"\u0416\7\7\2\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2"+
		"\2\2\u0417\u0418\3\2\2\2\u0418\u041c\3\2\2\2\u0419\u0417\3\2\2\2\u041a"+
		"\u041d\5F$\2\u041b\u041d\5H%\2\u041c\u041a\3\2\2\2\u041c\u041b\3\2\2\2"+
		"\u041d\u0425\3\2\2\2\u041e\u0420\7\7\2\2\u041f\u041e\3\2\2\2\u0420\u0423"+
		"\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0424\u0426\5l\67\2\u0425\u0421\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u0435\3\2\2\2\u0427\u0429\7\7\2\2\u0428\u0427\3\2\2\2\u0429"+
		"\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2"+
		"\2\2\u042c\u042a\3\2\2\2\u042d\u0431\t\4\2\2\u042e\u0430\7\7\2\2\u042f"+
		"\u042e\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2"+
		"\2\2\u0432\u0434\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0436\5|?\2\u0435\u042a"+
		"\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0443\3\2\2\2\u0437\u043b\5J&\2\u0438"+
		"\u0439\5\u0128\u0095\2\u0439\u043a\5L\'\2\u043a\u043c\3\2\2\2\u043b\u0438"+
		"\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0444\3\2\2\2\u043d\u0441\5L\'\2\u043e"+
		"\u043f\5\u0128\u0095\2\u043f\u0440\5J&\2\u0440\u0442\3\2\2\2\u0441\u043e"+
		"\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0437\3\2\2\2\u0443"+
		"\u043d\3\2\2\2\u0443\u0444\3\2\2\2\u0444E\3\2\2\2\u0445\u0446\7\13\2\2"+
		"\u0446\u044b\5H%\2\u0447\u0448\7\n\2\2\u0448\u044a\5H%\2\u0449\u0447\3"+
		"\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044e\3\2\2\2\u044d\u044b\3\2\2\2\u044e\u044f\7\f\2\2\u044fG\3\2\2\2"+
		"\u0450\u0453\5\u0126\u0094\2\u0451\u0452\7\33\2\2\u0452\u0454\5T+\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454I\3\2\2\2\u0455\u0457\5\u0102"+
		"\u0082\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u0487\7c\2\2\u0459\u045b\5\u0102\u0082\2\u045a\u0459\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u0460\7c\2\2\u045d\u045f\7\7\2\2\u045e"+
		"\u045d\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2"+
		"\2\2\u0461\u0463\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0464\7\13\2\2\u0464"+
		"\u0473\7\f\2\2\u0465\u0467\7\7\2\2\u0466\u0465\3\2\2\2\u0467\u046a\3\2"+
		"\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046b\u046f\7\33\2\2\u046c\u046e\7\7\2\2\u046d\u046c\3"+
		"\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0472\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0474\5T+\2\u0473\u0468\3\2\2"+
		"\2\u0473\u0474\3\2\2\2\u0474\u0478\3\2\2\2\u0475\u0477\7\7\2\2\u0476\u0475"+
		"\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u0484\3\2\2\2\u047a\u0478\3\2\2\2\u047b\u0485\5p9\2\u047c\u0480\7\35"+
		"\2\2\u047d\u047f\7\7\2\2\u047e\u047d\3\2\2\2\u047f\u0482\3\2\2\2\u0480"+
		"\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483\3\2\2\2\u0482\u0480\3\2"+
		"\2\2\u0483\u0485\5|?\2\u0484\u047b\3\2\2\2\u0484\u047c\3\2\2\2\u0485\u0487"+
		"\3\2\2\2\u0486\u0456\3\2\2\2\u0486\u045a\3\2\2\2\u0487K\3\2\2\2\u0488"+
		"\u048a\5\u0102\u0082\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b"+
		"\3\2\2\2\u048b\u04ac\7d\2\2\u048c\u048e\5\u0102\u0082\2\u048d\u048c\3"+
		"\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0493\7d\2\2\u0490"+
		"\u0492\7\7\2\2\u0491\u0490\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2"+
		"\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0493\3\2\2\2\u0496"+
		"\u049b\7\13\2\2\u0497\u049a\5\u011a\u008e\2\u0498\u049a\5\u0114\u008b"+
		"\2\u0499\u0497\3\2\2\2\u0499\u0498\3\2\2\2\u049a\u049d\3\2\2\2\u049b\u0499"+
		"\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a0\3\2\2\2\u049d\u049b\3\2\2\2\u049e"+
		"\u04a1\5\u0126\u0094\2\u049f\u04a1\5<\37\2\u04a0\u049e\3\2\2\2\u04a0\u049f"+
		"\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a6\7\f\2\2\u04a3\u04a5\7\7\2\2\u04a4"+
		"\u04a3\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2"+
		"\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04aa\5> \2\u04aa\u04ac"+
		"\3\2\2\2\u04ab\u0489\3\2\2\2\u04ab\u048d\3\2\2\2\u04acM\3\2\2\2\u04ad"+
		"\u04af\5\u0102\u0082\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0"+
		"\3\2\2\2\u04b0\u04b4\7C\2\2\u04b1\u04b3\7\7\2\2\u04b2\u04b1\3\2\2\2\u04b3"+
		"\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2"+
		"\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04bf\5\u0126\u0094\2\u04b8\u04ba\7\7\2"+
		"\2\u04b9\u04b8\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be\u04c0\5P)\2\u04bf"+
		"\u04bb\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c4\3\2\2\2\u04c1\u04c3\7\7"+
		"\2\2\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4"+
		"\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04cb\7\35"+
		"\2\2\u04c8\u04ca\7\7\2\2\u04c9\u04c8\3\2\2\2\u04ca\u04cd\3\2\2\2\u04cb"+
		"\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04cb\3\2"+
		"\2\2\u04ce\u04cf\5T+\2\u04cfO\3\2\2\2\u04d0\u04d4\7-\2\2\u04d1\u04d3\7"+
		"\7\2\2\u04d2\u04d1\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4"+
		"\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7\u04e8\5R"+
		"*\2\u04d8\u04da\7\7\2\2\u04d9\u04d8\3\2\2\2\u04da\u04dd\3\2\2\2\u04db"+
		"\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04db\3\2"+
		"\2\2\u04de\u04e2\7\n\2\2\u04df\u04e1\7\7\2\2\u04e0\u04df\3\2\2\2\u04e1"+
		"\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2"+
		"\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e7\5R*\2\u04e6\u04db\3\2\2\2\u04e7\u04ea"+
		"\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ee\3\2\2\2\u04ea"+
		"\u04e8\3\2\2\2\u04eb\u04ed\7\7\2\2\u04ec\u04eb\3\2\2\2\u04ed\u04f0\3\2"+
		"\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0"+
		"\u04ee\3\2\2\2\u04f1\u04f2\7.\2\2\u04f2Q\3\2\2\2\u04f3\u04f5\5\u0102\u0082"+
		"\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f9\3\2\2\2\u04f6\u04f8"+
		"\7\7\2\2\u04f7\u04f6\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fc\u0511\5\u0126"+
		"\u0094\2\u04fd\u04ff\7\7\2\2\u04fe\u04fd\3\2\2\2\u04ff\u0502\3\2\2\2\u0500"+
		"\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u0500\3\2"+
		"\2\2\u0503\u0507\7\33\2\2\u0504\u0506\7\7\2\2\u0505\u0504\3\2\2\2\u0506"+
		"\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2"+
		"\2\2\u0509\u0507\3\2\2\2\u050a\u050e\5T+\2\u050b\u050d\7\7\2\2\u050c\u050b"+
		"\3\2\2\2\u050d\u0510\3\2\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f"+
		"\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0500\3\2\2\2\u0511\u0512\3\2"+
		"\2\2\u0512S\3\2\2\2\u0513\u0515\5V,\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u051a\3\2\2\2\u0516\u051b\5`\61\2\u0517\u051b\5X-\2\u0518"+
		"\u051b\5Z.\2\u0519\u051b\5\\/\2\u051a\u0516\3\2\2\2\u051a\u0517\3\2\2"+
		"\2\u051a\u0518\3\2\2\2\u051a\u0519\3\2\2\2\u051bU\3\2\2\2\u051c\u0525"+
		"\5\u011a\u008e\2\u051d\u0521\7x\2\2\u051e\u0520\7\7\2\2\u051f\u051e\3"+
		"\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u051c\3\2\2\2\u0524\u051d\3\2"+
		"\2\2\u0525\u0526\3\2\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"W\3\2\2\2\u0528\u0529\7\13\2\2\u0529\u052a\5T+\2\u052a\u052b\7\f\2\2\u052b"+
		"Y\3\2\2\2\u052c\u052f\5\\/\2\u052d\u052f\5X-\2\u052e\u052c\3\2\2\2\u052e"+
		"\u052d\3\2\2\2\u052f\u0533\3\2\2\2\u0530\u0532\7\7\2\2\u0531\u0530\3\2"+
		"\2\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0536\u0538\7+\2\2\u0537\u0536\3\2"+
		"\2\2\u0538\u0539\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"[\3\2\2\2\u053b\u053c\7\13\2\2\u053c\u053d\5\\/\2\u053d\u053e\7\f\2\2"+
		"\u053e\u054f\3\2\2\2\u053f\u0541\5d\63\2\u0540\u0542\5^\60\2\u0541\u0540"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u054b\3\2\2\2\u0543\u0545\7\7\2\2\u0544"+
		"\u0543\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2"+
		"\2\2\u0547\u0549\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054a\7\u00ca\2\2\u054a"+
		"\u054c\5h\65\2\u054b\u0546\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054f\3\2"+
		"\2\2\u054d\u054f\7i\2\2\u054e\u053b\3\2\2\2\u054e\u053f\3\2\2\2\u054e"+
		"\u054d\3\2\2\2\u054f]\3\2\2\2\u0550\u0552\7\r\2\2\u0551\u0553\5d\63\2"+
		"\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555"+
		"\7\16\2\2\u0555_\3\2\2\2\u0556\u055a\5b\62\2\u0557\u0559\7\7\2\2\u0558"+
		"\u0557\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b\u055d\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u0561\7\t\2\2\u055e"+
		"\u0560\7\7\2\2\u055f\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2"+
		"\2\2\u0561\u0562\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0564"+
		"\u0556\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u056a\5j"+
		"\66\2\u0567\u0569\7\7\2\2\u0568\u0567\3\2\2\2\u0569\u056c\3\2\2\2\u056a"+
		"\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056d\u0571\7#\2\2\u056e\u0570\7\7\2\2\u056f\u056e\3\2\2\2\u0570"+
		"\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2"+
		"\2\2\u0573\u0571\3\2\2\2\u0574\u0575\5T+\2\u0575a\3\2\2\2\u0576\u057a"+
		"\5X-\2\u0577\u057a\5Z.\2\u0578\u057a\5\\/\2\u0579\u0576\3\2\2\2\u0579"+
		"\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057ac\3\2\2\2\u057b\u058c\5f\64\2"+
		"\u057c\u057e\7\7\2\2\u057d\u057c\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d"+
		"\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u057f\3\2\2\2\u0582"+
		"\u0586\7\t\2\2\u0583\u0585\7\7\2\2\u0584\u0583\3\2\2\2\u0585\u0588\3\2"+
		"\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2\2\2\u0588"+
		"\u0586\3\2\2\2\u0589\u058b\5f\64\2\u058a\u057f\3\2\2\2\u058b\u058e\3\2"+
		"\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058de\3\2\2\2\u058e\u058c"+
		"\3\2\2\2\u058f\u0597\5\u0126\u0094\2\u0590\u0592\7\7\2\2\u0591\u0590\3"+
		"\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0596\3\2\2\2\u0595\u0593\3\2\2\2\u0596\u0598\5\u00a4S\2\u0597\u0593"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598g\3\2\2\2\u0599\u059c\5\u00acW\2\u059a"+
		"\u059c\5d\63\2\u059b\u0599\3\2\2\2\u059b\u059a\3\2\2\2\u059ci\3\2\2\2"+
		"\u059d\u05a0\7\13\2\2\u059e\u05a1\5<\37\2\u059f\u05a1\5T+\2\u05a0\u059e"+
		"\3\2\2\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a9\3\2\2\2\u05a2"+
		"\u05a5\7\n\2\2\u05a3\u05a6\5<\37\2\u05a4\u05a6\5T+\2\u05a5\u05a3\3\2\2"+
		"\2\u05a5\u05a4\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7\u05a2\3\2\2\2\u05a8\u05ab"+
		"\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab"+
		"\u05a9\3\2\2\2\u05ac\u05ad\7\f\2\2\u05adk\3\2\2\2\u05ae\u05b2\7K\2\2\u05af"+
		"\u05b1\7\7\2\2\u05b0\u05af\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2"+
		"\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5"+
		"\u05c6\5n8\2\u05b6\u05b8\7\7\2\2\u05b7\u05b6\3\2\2\2\u05b8\u05bb\3\2\2"+
		"\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b9"+
		"\3\2\2\2\u05bc\u05c0\7\n\2\2\u05bd\u05bf\7\7\2\2\u05be\u05bd\3\2\2\2\u05bf"+
		"\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2"+
		"\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c5\5n8\2\u05c4\u05b9\3\2\2\2\u05c5\u05c8"+
		"\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7m\3\2\2\2\u05c8"+
		"\u05c6\3\2\2\2\u05c9\u05cb\5\u011a\u008e\2\u05ca\u05c9\3\2\2\2\u05cb\u05ce"+
		"\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cf\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05cf\u05d3\5\u0126\u0094\2\u05d0\u05d2\7\7\2\2\u05d1\u05d0"+
		"\3\2\2\2\u05d2\u05d5\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u05d6\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d6\u05da\7\33\2\2\u05d7\u05d9\7"+
		"\7\2\2\u05d8\u05d7\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05da"+
		"\u05db\3\2\2\2\u05db\u05dd\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05de\5T"+
		"+\2\u05deo\3\2\2\2\u05df\u05e0\7\17\2\2\u05e0\u05e1\5t;\2\u05e1\u05e2"+
		"\7\20\2\2\u05e2q\3\2\2\2\u05e3\u05e4\7\17\2\2\u05e4\u05e5\5\u012c\u0097"+
		"\2\u05e5\u05e6\7\20\2\2\u05e6s\3\2\2\2\u05e7\u05e9\5\u012a\u0096\2\u05e8"+
		"\u05e7\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2"+
		"\2\2\u05eb\u05fb\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f8\5v<\2\u05ee\u05f0"+
		"\5\u012a\u0096\2\u05ef\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05ef\3"+
		"\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05f5\5v<\2\u05f4"+
		"\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\3\2\2\2\u05f6\u05ef\3\2"+
		"\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9"+
		"\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05ed\3\2\2\2\u05fb\u05fc\3\2"+
		"\2\2\u05fcu\3\2\2\2\u05fd\u0600\5z>\2\u05fe\u0600\5x=\2\u05ff\u05fd\3"+
		"\2\2\2\u05ff\u05fe\3\2\2\2\u0600w\3\2\2\2\u0601\u0603\5\u011a\u008e\2"+
		"\u0602\u0601\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602\3\2\2\2\u0604\u0605"+
		"\3\2\2\2\u0605\u060a\3\2\2\2\u0606\u0604\3\2\2\2\u0607\u0609\7\7\2\2\u0608"+
		"\u0607\3\2\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2"+
		"\2\2\u060b\u060d\3\2\2\2\u060c\u060a\3\2\2\2\u060d\u060e\5|?\2\u060ey"+
		"\3\2\2\2\u060f\u0611\5\u0118\u008d\2\u0610\u060f\3\2\2\2\u0611\u0614\3"+
		"\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0619\3\2\2\2\u0614"+
		"\u0612\3\2\2\2\u0615\u061a\5\26\f\2\u0616\u061a\5\66\34\2\u0617\u061a"+
		"\5D#\2\u0618\u061a\5N(\2\u0619\u0615\3\2\2\2\u0619\u0616\3\2\2\2\u0619"+
		"\u0617\3\2\2\2\u0619\u0618\3\2\2\2\u061a{\3\2\2\2\u061b\u0621\5~@\2\u061c"+
		"\u061d\5\u00ecw\2\u061d\u061e\5~@\2\u061e\u0620\3\2\2\2\u061f\u061c\3"+
		"\2\2\2\u0620\u0623\3\2\2\2\u0621\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622"+
		"}\3\2\2\2\u0623\u0621\3\2\2\2\u0624\u0635\5\u0080A\2\u0625\u0627\7\7\2"+
		"\2\u0626\u0625\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629"+
		"\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u062f\7\31\2\2"+
		"\u062c\u062e\7\7\2\2\u062d\u062c\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u062d"+
		"\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631\u062f\3\2\2\2\u0632"+
		"\u0634\5\u0080A\2\u0633\u0628\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633"+
		"\3\2\2\2\u0635\u0636\3\2\2\2\u0636\177\3\2\2\2\u0637\u0635\3\2\2\2\u0638"+
		"\u0649\5\u0082B\2\u0639\u063b\7\7\2\2\u063a\u0639\3\2\2\2\u063b\u063e"+
		"\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e"+
		"\u063c\3\2\2\2\u063f\u0643\7\30\2\2\u0640\u0642\7\7\2\2\u0641\u0640\3"+
		"\2\2\2\u0642\u0645\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644"+
		"\u0646\3\2\2\2\u0645\u0643\3\2\2\2\u0646\u0648\5\u0082B\2\u0647\u063c"+
		"\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a"+
		"\u0081\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u0658\5\u0084C\2\u064d\u0651"+
		"\5\u00eex\2\u064e\u0650\7\7\2\2\u064f\u064e\3\2\2\2\u0650\u0653\3\2\2"+
		"\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0654\3\2\2\2\u0653\u0651"+
		"\3\2\2\2\u0654\u0655\5\u0084C\2\u0655\u0657\3\2\2\2\u0656\u064d\3\2\2"+
		"\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u0083"+
		"\3\2\2\2\u065a\u0658\3\2\2\2\u065b\u0665\5\u0086D\2\u065c\u0660\5\u00f0"+
		"y\2\u065d\u065f\7\7\2\2\u065e\u065d\3\2\2\2\u065f\u0662\3\2\2\2\u0660"+
		"\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0663\3\2\2\2\u0662\u0660\3\2"+
		"\2\2\u0663\u0664\5\u0086D\2\u0664\u0666\3\2\2\2\u0665\u065c\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0085\3\2\2\2\u0667\u067e\5\u0088E\2\u0668\u066c"+
		"\5\u00f2z\2\u0669\u066b\7\7\2\2\u066a\u0669\3\2\2\2\u066b\u066e\3\2\2"+
		"\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u066c"+
		"\3\2\2\2\u066f\u0670\5\u0088E\2\u0670\u0672\3\2\2\2\u0671\u0668\3\2\2"+
		"\2\u0672\u0673\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u067f"+
		"\3\2\2\2\u0675\u0679\5\u00f4{\2\u0676\u0678\7\7\2\2\u0677\u0676\3\2\2"+
		"\2\u0678\u067b\3\2\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c"+
		"\3\2\2\2\u067b\u0679\3\2\2\2\u067c\u067d\5T+\2\u067d\u067f\3\2\2\2\u067e"+
		"\u0671\3\2\2\2\u067e\u0675\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0087\3\2"+
		"\2\2\u0680\u0691\5\u008aF\2\u0681\u0683\7\7\2\2\u0682\u0681\3\2\2\2\u0683"+
		"\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2"+
		"\2\2\u0686\u0684\3\2\2\2\u0687\u068b\7,\2\2\u0688\u068a\7\7\2\2\u0689"+
		"\u0688\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2"+
		"\2\2\u068c\u068e\3\2\2\2\u068d\u068b\3\2\2\2\u068e\u0690\5\u008aF\2\u068f"+
		"\u0684\3\2\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2\2\u0691\u0692\3\2"+
		"\2\2\u0692\u0089\3\2\2\2\u0693\u0691\3\2\2\2\u0694\u06a0\5\u008cG\2\u0695"+
		"\u0699\5\u0126\u0094\2\u0696\u0698\7\7\2\2\u0697\u0696\3\2\2\2\u0698\u069b"+
		"\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b"+
		"\u0699\3\2\2\2\u069c\u069d\5\u008cG\2\u069d\u069f\3\2\2\2\u069e\u0695"+
		"\3\2\2\2\u069f\u06a2\3\2\2\2\u06a0\u069e\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1"+
		"\u008b\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a3\u06ae\5\u008eH\2\u06a4\u06a8"+
		"\7%\2\2\u06a5\u06a7\7\7\2\2\u06a6\u06a5\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8"+
		"\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2\2\2\u06aa\u06a8\3\2"+
		"\2\2\u06ab\u06ad\5\u008eH\2\u06ac\u06a4\3\2\2\2\u06ad\u06b0\3\2\2\2\u06ae"+
		"\u06ac\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u008d\3\2\2\2\u06b0\u06ae\3\2"+
		"\2\2\u06b1\u06bd\5\u0090I\2\u06b2\u06b6\5\u00f6|\2\u06b3\u06b5\7\7\2\2"+
		"\u06b4\u06b3\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7"+
		"\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06ba\5\u0090I"+
		"\2\u06ba\u06bc\3\2\2\2\u06bb\u06b2\3\2\2\2\u06bc\u06bf\3\2\2\2\u06bd\u06bb"+
		"\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u008f\3\2\2\2\u06bf\u06bd\3\2\2\2\u06c0"+
		"\u06cc\5\u0092J\2\u06c1\u06c5\5\u00f8}\2\u06c2\u06c4\7\7\2\2\u06c3\u06c2"+
		"\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6"+
		"\u06c8\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u06c9\5\u0092J\2\u06c9\u06cb"+
		"\3\2\2\2\u06ca\u06c1\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc"+
		"\u06cd\3\2\2\2\u06cd\u0091\3\2\2\2\u06ce\u06cc\3\2\2\2\u06cf\u06db\5\u0094"+
		"K\2\u06d0\u06d2\7\7\2\2\u06d1\u06d0\3\2\2\2\u06d2\u06d5\3\2\2\2\u06d3"+
		"\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06d3\3\2"+
		"\2\2\u06d6\u06d7\5\u00fa~\2\u06d7\u06d8\5\u0094K\2\u06d8\u06da\3\2\2\2"+
		"\u06d9\u06d3\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06dc"+
		"\3\2\2\2\u06dc\u0093\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06e0\5\u00fc\177"+
		"\2\u06df\u06de\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e2"+
		"\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e4\u06e5\5\u0096L"+
		"\2\u06e5\u0095\3\2\2\2\u06e6\u06e9\5\u0098M\2\u06e7\u06e9\5\u00eav\2\u06e8"+
		"\u06e6\3\2\2\2\u06e8\u06e7\3\2\2\2\u06e9\u06ed\3\2\2\2\u06ea\u06ec\5\u00fe"+
		"\u0080\2\u06eb\u06ea\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u0097\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06fd\5\u009a"+
		"N\2\u06f1\u06fd\5\u00acW\2\u06f2\u06fd\5\u00bc_\2\u06f3\u06fd\5\u00c6"+
		"d\2\u06f4\u06fd\5\u00c8e\2\u06f5\u06fd\5\u00caf\2\u06f6\u06fd\5\u00da"+
		"n\2\u06f7\u06fd\5\u00c2b\2\u06f8\u06fd\5\u00e8u\2\u06f9\u06fd\5\u00e0"+
		"q\2\u06fa\u06fd\5\u00c4c\2\u06fb\u06fd\5\u0126\u0094\2\u06fc\u06f0\3\2"+
		"\2\2\u06fc\u06f1\3\2\2\2\u06fc\u06f2\3\2\2\2\u06fc\u06f3\3\2\2\2\u06fc"+
		"\u06f4\3\2\2\2\u06fc\u06f5\3\2\2\2\u06fc\u06f6\3\2\2\2\u06fc\u06f7\3\2"+
		"\2\2\u06fc\u06f8\3\2\2\2\u06fc\u06f9\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc"+
		"\u06fb\3\2\2\2\u06fd\u0099\3\2\2\2\u06fe\u06ff\7\13\2\2\u06ff\u0700\5"+
		"|?\2\u0700\u0701\7\f\2\2\u0701\u009b\3\2\2\2\u0702\u0704\5\u00a4S\2\u0703"+
		"\u0705\5\u00a2R\2\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0709"+
		"\3\2\2\2\u0706\u0708\5\u009eP\2\u0707\u0706\3\2\2\2\u0708\u070b\3\2\2"+
		"\2\u0709\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u0719\3\2\2\2\u070b\u0709"+
		"\3\2\2\2\u070c\u0710\5\u00a2R\2\u070d\u070f\5\u009eP\2\u070e\u070d\3\2"+
		"\2\2\u070f\u0712\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711"+
		"\u0719\3\2\2\2\u0712\u0710\3\2\2\2\u0713\u0715\5\u009eP\2\u0714\u0713"+
		"\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u0719\3\2\2\2\u0718\u0702\3\2\2\2\u0718\u070c\3\2\2\2\u0718\u0714\3\2"+
		"\2\2\u0719\u009d\3\2\2\2\u071a\u071c\5\u0122\u0092\2\u071b\u071a\3\2\2"+
		"\2\u071c\u071f\3\2\2\2\u071d\u071b\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u0721"+
		"\3\2\2\2\u071f\u071d\3\2\2\2\u0720\u0722\7\u0090\2\2\u0721\u0720\3\2\2"+
		"\2\u0721\u0722\3\2\2\2\u0722\u0726\3\2\2\2\u0723\u0725\7\7\2\2\u0724\u0723"+
		"\3\2\2\2\u0725\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727"+
		"\u0729\3\2\2\2\u0728\u0726\3\2\2\2\u0729\u072a\5\u00bc_\2\u072a\u009f"+
		"\3\2\2\2\u072b\u0734\7\r\2\2\u072c\u0731\5|?\2\u072d\u072e\7\n\2\2\u072e"+
		"\u0730\5|?\2\u072f\u072d\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f\3\2\2"+
		"\2\u0731\u0732\3\2\2\2\u0732\u0735\3\2\2\2\u0733\u0731\3\2\2\2\u0734\u072c"+
		"\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737\7\16\2\2"+
		"\u0737\u00a1\3\2\2\2\u0738\u0741\7\13\2\2\u0739\u073e\5\u00aaV\2\u073a"+
		"\u073b\7\n\2\2\u073b\u073d\5\u00aaV\2\u073c\u073a\3\2\2\2\u073d\u0740"+
		"\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0742\3\2\2\2\u0740"+
		"\u073e\3\2\2\2\u0741\u0739\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743\3\2"+
		"\2\2\u0743\u0744\7\f\2\2\u0744\u00a3\3\2\2\2\u0745\u0749\7-\2\2\u0746"+
		"\u0748\7\7\2\2\u0747\u0746\3\2\2\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2"+
		"\2\2\u0749\u074a\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u0749\3\2\2\2\u074c"+
		"\u0757\5\u00a6T\2\u074d\u074f\7\7\2\2\u074e\u074d\3\2\2\2\u074f\u0752"+
		"\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0753\3\2\2\2\u0752"+
		"\u0750\3\2\2\2\u0753\u0754\7\n\2\2\u0754\u0756\5\u00a6T\2\u0755\u0750"+
		"\3\2\2\2\u0756\u0759\3\2\2\2\u0757\u0755\3\2\2\2\u0757\u0758\3\2\2\2\u0758"+
		"\u075d\3\2\2\2\u0759\u0757\3\2\2\2\u075a\u075c\7\7\2\2\u075b\u075a\3\2"+
		"\2\2\u075c\u075f\3\2\2\2\u075d\u075b\3\2\2\2\u075d\u075e\3\2\2\2\u075e"+
		"\u0760\3\2\2\2\u075f\u075d\3\2\2\2\u0760\u0761\7.\2\2\u0761\u00a5\3\2"+
		"\2\2\u0762\u0764\5\u00a8U\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764"+
		"\u0765\3\2\2\2\u0765\u0768\5T+\2\u0766\u0768\7\21\2\2\u0767\u0763\3\2"+
		"\2\2\u0767\u0766\3\2\2\2\u0768\u00a7\3\2\2\2\u0769\u076b\5\u010c\u0087"+
		"\2\u076a\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076a\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u00a9\3\2\2\2\u076e\u0772\5\u0126\u0094\2\u076f\u0771\7"+
		"\7\2\2\u0770\u076f\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0775\3\2\2\2\u0774\u0772\3\2\2\2\u0775\u0779\7\35"+
		"\2\2\u0776\u0778\7\7\2\2\u0777\u0776\3\2\2\2\u0778\u077b\3\2\2\2\u0779"+
		"\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077d\3\2\2\2\u077b\u0779\3\2"+
		"\2\2\u077c\u076e\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077f\3\2\2\2\u077e"+
		"\u0780\7\21\2\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0784\3"+
		"\2\2\2\u0781\u0783\7\7\2\2\u0782\u0781\3\2\2\2\u0783\u0786\3\2\2\2\u0784"+
		"\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\3\2\2\2\u0786\u0784\3\2"+
		"\2\2\u0787\u0788\5|?\2\u0788\u00ab\3\2\2\2\u0789\u0793\7\u008c\2\2\u078a"+
		"\u0793\7\u0089\2\2\u078b\u0793\5\u00aeX\2\u078c\u0793\7\u008a\2\2\u078d"+
		"\u0793\7\u008b\2\2\u078e\u0793\7\u0092\2\2\u078f\u0793\7\u0085\2\2\u0790"+
		"\u0793\7\u008d\2\2\u0791\u0793\7\u0088\2\2\u0792\u0789\3\2\2\2\u0792\u078a"+
		"\3\2\2\2\u0792\u078b\3\2\2\2\u0792\u078c\3\2\2\2\u0792\u078d\3\2\2\2\u0792"+
		"\u078e\3\2\2\2\u0792\u078f\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0791\3\2"+
		"\2\2\u0793\u00ad\3\2\2\2\u0794\u0797\5\u00b0Y\2\u0795\u0797\5\u00b2Z\2"+
		"\u0796\u0794\3\2\2\2\u0796\u0795\3\2\2\2\u0797\u00af\3\2\2\2\u0798\u079d"+
		"\7\u0083\2\2\u0799\u079c\5\u00b4[\2\u079a\u079c\5\u00b6\\\2\u079b\u0799"+
		"\3\2\2\2\u079b\u079a\3\2\2\2\u079c\u079f\3\2\2\2\u079d\u079b\3\2\2\2\u079d"+
		"\u079e\3\2\2\2\u079e\u07a0\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u07a1\7\u009d"+
		"\2\2\u07a1\u00b1\3\2\2\2\u07a2\u07a9\7\u0084\2\2\u07a3\u07a8\5\u00b8]"+
		"\2\u07a4\u07a8\5\u00ba^\2\u07a5\u07a8\5\u00b0Y\2\u07a6\u07a8\7\u00a3\2"+
		"\2\u07a7\u07a3\3\2\2\2\u07a7\u07a4\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a6"+
		"\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa"+
		"\u07ac\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ac\u07ad\7\u00a2\2\2\u07ad\u00b3"+
		"\3\2\2\2\u07ae\u07af\t\5\2\2\u07af\u00b5\3\2\2\2\u07b0\u07b1\7\u00a1\2"+
		"\2\u07b1\u07b2\5|?\2\u07b2\u07b3\7\20\2\2\u07b3\u00b7\3\2\2\2\u07b4\u07b5"+
		"\t\6\2\2\u07b5\u00b9\3\2\2\2\u07b6\u07b7\7\u00a7\2\2\u07b7\u07b8\5|?\2"+
		"\u07b8\u07b9\7\20\2\2\u07b9\u00bb\3\2\2\2\u07ba\u07bc\5\u011a\u008e\2"+
		"\u07bb\u07ba\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be"+
		"\3\2\2\2\u07be\u07ee\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0\u07c4\7\17\2\2"+
		"\u07c1\u07c3\7\7\2\2\u07c2\u07c1\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2"+
		"\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7"+
		"\u07cb\5t;\2\u07c8\u07ca\7\7\2\2\u07c9\u07c8\3\2\2\2\u07ca\u07cd\3\2\2"+
		"\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07ce\3\2\2\2\u07cd\u07cb"+
		"\3\2\2\2\u07ce\u07cf\7\20\2\2\u07cf\u07ef\3\2\2\2\u07d0\u07d4\7\17\2\2"+
		"\u07d1\u07d3\7\7\2\2\u07d2\u07d1\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2"+
		"\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d7\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7"+
		"\u07db\5\u00be`\2\u07d8\u07da\7\7\2\2\u07d9\u07d8\3\2\2\2\u07da\u07dd"+
		"\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07de\3\2\2\2\u07dd"+
		"\u07db\3\2\2\2\u07de\u07e2\7#\2\2\u07df\u07e1\7\7\2\2\u07e0\u07df\3\2"+
		"\2\2\u07e1\u07e4\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3"+
		"\u07e5\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e5\u07e9\5t;\2\u07e6\u07e8\7\7\2"+
		"\2\u07e7\u07e6\3\2\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07ea"+
		"\3\2\2\2\u07ea\u07ec\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec\u07ed\7\20\2\2"+
		"\u07ed\u07ef\3\2\2\2\u07ee\u07c0\3\2\2\2\u07ee\u07d0\3\2\2\2\u07ef\u00bd"+
		"\3\2\2\2\u07f0\u07f2\5\u00c0a\2\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3\2\2"+
		"\2\u07f2\u0803\3\2\2\2\u07f3\u07f5\7\7\2\2\u07f4\u07f3\3\2\2\2\u07f5\u07f8"+
		"\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\3\2\2\2\u07f8"+
		"\u07f6\3\2\2\2\u07f9\u07fd\7\n\2\2\u07fa\u07fc\7\7\2\2\u07fb\u07fa\3\2"+
		"\2\2\u07fc\u07ff\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe"+
		"\u0800\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800\u0802\5\u00c0a\2\u0801\u07f6"+
		"\3\2\2\2\u0802\u0805\3\2\2\2\u0803\u0801\3\2\2\2\u0803\u0804\3\2\2\2\u0804"+
		"\u00bf\3\2\2\2\u0805\u0803\3\2\2\2\u0806\u0819\5H%\2\u0807\u0816\5F$\2"+
		"\u0808\u080a\7\7\2\2\u0809\u0808\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809"+
		"\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\3\2\2\2\u080d\u080b\3\2\2\2\u080e"+
		"\u0812\7\33\2\2\u080f\u0811\7\7\2\2\u0810\u080f\3\2\2\2\u0811\u0814\3"+
		"\2\2\2\u0812\u0810\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\3\2\2\2\u0814"+
		"\u0812\3\2\2\2\u0815\u0817\5T+\2\u0816\u080b\3\2\2\2\u0816\u0817\3\2\2"+
		"\2\u0817\u0819\3\2\2\2\u0818\u0806\3\2\2\2\u0818\u0807\3\2\2\2\u0819\u00c1"+
		"\3\2\2\2\u081a\u0829\7@\2\2\u081b\u081d\7\7\2\2\u081c\u081b\3\2\2\2\u081d"+
		"\u0820\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0821\3\2"+
		"\2\2\u0820\u081e\3\2\2\2\u0821\u0825\7\33\2\2\u0822\u0824\7\7\2\2\u0823"+
		"\u0822\3\2\2\2\u0824\u0827\3\2\2\2\u0825\u0823\3\2\2\2\u0825\u0826\3\2"+
		"\2\2\u0826\u0828\3\2\2\2\u0827\u0825\3\2\2\2\u0828\u082a\5\36\20\2\u0829"+
		"\u081e\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082e\3\2\2\2\u082b\u082d\7\7"+
		"\2\2\u082c\u082b\3\2\2\2\u082d\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e"+
		"\u082f\3\2\2\2\u082f\u0831\3\2\2\2\u0830\u082e\3\2\2\2\u0831\u0832\5&"+
		"\24\2\u0832\u00c3\3\2\2\2\u0833\u0835\7\r\2\2\u0834\u0836\5|?\2\u0835"+
		"\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u083b\3\2\2\2\u0837\u0838\7\n"+
		"\2\2\u0838\u083a\5|?\2\u0839\u0837\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839"+
		"\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\3\2\2\2\u083d\u083b\3\2\2\2\u083e"+
		"\u083f\7\16\2\2\u083f\u00c5\3\2\2\2\u0840\u0842\7H\2\2\u0841\u0843\7\u008f"+
		"\2\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u00c7\3\2\2\2\u0844"+
		"\u0855\7I\2\2\u0845\u0849\7-\2\2\u0846\u0848\7\7\2\2\u0847\u0846\3\2\2"+
		"\2\u0848\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084c"+
		"\3\2\2\2\u084b\u0849\3\2\2\2\u084c\u0850\5T+\2\u084d\u084f\7\7\2\2\u084e"+
		"\u084d\3\2\2\2\u084f\u0852\3\2\2\2\u0850\u084e\3\2\2\2\u0850\u0851\3\2"+
		"\2\2\u0851\u0853\3\2\2\2\u0852\u0850\3\2\2\2\u0853\u0854\7.\2\2\u0854"+
		"\u0856\3\2\2\2\u0855\u0845\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2"+
		"\2\2\u0857\u0859\7\u008f\2\2\u0858\u0857\3\2\2\2\u0858\u0859\3\2\2\2\u0859"+
		"\u00c9\3\2\2\2\u085a\u085d\5\u00ccg\2\u085b\u085d\5\u00d0i\2\u085c\u085a"+
		"\3\2\2\2\u085c\u085b\3\2\2\2\u085d\u00cb\3\2\2\2\u085e\u0862\7L\2\2\u085f"+
		"\u0861\7\7\2\2\u0860\u085f\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2"+
		"\2\2\u0862\u0863\3\2\2\2\u0863\u0865\3\2\2\2\u0864\u0862\3\2\2\2\u0865"+
		"\u0866\7\13\2\2\u0866\u0867\5|?\2\u0867\u086b\7\f\2\2\u0868\u086a\7\7"+
		"\2\2\u0869\u0868\3\2\2\2\u086a\u086d\3\2\2\2\u086b\u0869\3\2\2\2\u086b"+
		"\u086c\3\2\2\2\u086c\u086f\3\2\2\2\u086d\u086b\3\2\2\2\u086e\u0870\5\u00ce"+
		"h\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872\3\2\2\2\u0871"+
		"\u0873\7\34\2\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0884\3"+
		"\2\2\2\u0874\u0876\7\7\2\2\u0875\u0874\3\2\2\2\u0876\u0879\3\2\2\2\u0877"+
		"\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\3\2\2\2\u0879\u0877\3\2"+
		"\2\2\u087a\u087e\7M\2\2\u087b\u087d\7\7\2\2\u087c\u087b\3\2\2\2\u087d"+
		"\u0880\3\2\2\2\u087e\u087c\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0882\3\2"+
		"\2\2\u0880\u087e\3\2\2\2\u0881\u0883\5\u00ceh\2\u0882\u0881\3\2\2\2\u0882"+
		"\u0883\3\2\2\2\u0883\u0885\3\2\2\2\u0884\u0877\3\2\2\2\u0884\u0885\3\2"+
		"\2\2\u0885\u00cd\3\2\2\2\u0886\u0889\5p9\2\u0887\u0889\5|?\2\u0888\u0886"+
		"\3\2\2\2\u0888\u0887\3\2\2\2\u0889\u00cf\3\2\2\2\u088a\u088e\7N\2\2\u088b"+
		"\u088d\7\7\2\2\u088c\u088b\3\2\2\2\u088d\u0890\3\2\2\2\u088e\u088c\3\2"+
		"\2\2\u088e\u088f\3\2\2\2\u088f\u0895\3\2\2\2\u0890\u088e\3\2\2\2\u0891"+
		"\u0892\7\13\2\2\u0892\u0893\5|?\2\u0893\u0894\7\f\2\2\u0894\u0896\3\2"+
		"\2\2\u0895\u0891\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u089a\3\2\2\2\u0897"+
		"\u0899\7\7\2\2\u0898\u0897\3\2\2\2\u0899\u089c\3\2\2\2\u089a\u0898\3\2"+
		"\2\2\u089a\u089b\3\2\2\2\u089b\u089d\3\2\2\2\u089c\u089a\3\2\2\2\u089d"+
		"\u08a1\7\17\2\2\u089e\u08a0\7\7\2\2\u089f\u089e\3\2\2\2\u08a0\u08a3\3"+
		"\2\2\2\u08a1\u089f\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08ad\3\2\2\2\u08a3"+
		"\u08a1\3\2\2\2\u08a4\u08a8\5\u00d2j\2\u08a5\u08a7\7\7\2\2\u08a6\u08a5"+
		"\3\2\2\2\u08a7\u08aa\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9"+
		"\u08ac\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab\u08a4\3\2\2\2\u08ac\u08af\3\2"+
		"\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08b3\3\2\2\2\u08af"+
		"\u08ad\3\2\2\2\u08b0\u08b2\7\7\2\2\u08b1\u08b0\3\2\2\2\u08b2\u08b5\3\2"+
		"\2\2\u08b3\u08b1\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\3\2\2\2\u08b5"+
		"\u08b3\3\2\2\2\u08b6\u08b7\7\20\2\2\u08b7\u00d1\3\2\2\2\u08b8\u08c9\5"+
		"\u00d4k\2\u08b9\u08bb\7\7\2\2\u08ba\u08b9\3\2\2\2\u08bb\u08be\3\2\2\2"+
		"\u08bc\u08ba\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08bf\3\2\2\2\u08be\u08bc"+
		"\3\2\2\2\u08bf\u08c3\7\n\2\2\u08c0\u08c2\7\7\2\2\u08c1\u08c0\3\2\2\2\u08c2"+
		"\u08c5\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c6\3\2"+
		"\2\2\u08c5\u08c3\3\2\2\2\u08c6\u08c8\5\u00d4k\2\u08c7\u08bc\3\2\2\2\u08c8"+
		"\u08cb\3\2\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cf\3\2"+
		"\2\2\u08cb\u08c9\3\2\2\2\u08cc\u08ce\7\7\2\2\u08cd\u08cc\3\2\2\2\u08ce"+
		"\u08d1\3\2\2\2\u08cf\u08cd\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d2\3\2"+
		"\2\2\u08d1\u08cf\3\2\2\2\u08d2\u08d6\7#\2\2\u08d3\u08d5\7\7\2\2\u08d4"+
		"\u08d3\3\2\2\2\u08d5\u08d8\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d6\u08d7\3\2"+
		"\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d9\u08db\5\u00ceh\2\u08da"+
		"\u08dc\5\u0128\u0095\2\u08db\u08da\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08ed"+
		"\3\2\2\2\u08dd\u08e1\7M\2\2\u08de\u08e0\7\7\2\2\u08df\u08de\3\2\2\2\u08e0"+
		"\u08e3\3\2\2\2\u08e1\u08df\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u08e4\3\2"+
		"\2\2\u08e3\u08e1\3\2\2\2\u08e4\u08e8\7#\2\2\u08e5\u08e7\7\7\2\2\u08e6"+
		"\u08e5\3\2\2\2\u08e7\u08ea\3\2\2\2\u08e8\u08e6\3\2\2\2\u08e8\u08e9\3\2"+
		"\2\2\u08e9\u08eb\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb\u08ed\5\u00ceh\2\u08ec"+
		"\u08b8\3\2\2\2\u08ec\u08dd\3\2\2\2\u08ed\u00d3\3\2\2\2\u08ee\u08f2\5|"+
		"?\2\u08ef\u08f2\5\u00d6l\2\u08f0\u08f2\5\u00d8m\2\u08f1\u08ee\3\2\2\2"+
		"\u08f1\u08ef\3\2\2\2\u08f1\u08f0\3\2\2\2\u08f2\u00d5\3\2\2\2\u08f3\u08f7"+
		"\5\u00f2z\2\u08f4\u08f6\7\7\2\2\u08f5\u08f4\3\2\2\2\u08f6\u08f9\3\2\2"+
		"\2\u08f7\u08f5\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08fa\3\2\2\2\u08f9\u08f7"+
		"\3\2\2\2\u08fa\u08fb\5|?\2\u08fb\u00d7\3\2\2\2\u08fc\u0900\5\u00f4{\2"+
		"\u08fd\u08ff\7\7\2\2\u08fe\u08fd\3\2\2\2\u08ff\u0902\3\2\2\2\u0900\u08fe"+
		"\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0903\3\2\2\2\u0902\u0900\3\2\2\2\u0903"+
		"\u0904\5T+\2\u0904\u00d9\3\2\2\2\u0905\u0909\7O\2\2\u0906\u0908\7\7\2"+
		"\2\u0907\u0906\3\2\2\2\u0908\u090b\3\2\2\2\u0909\u0907\3\2\2\2\u0909\u090a"+
		"\3\2\2\2\u090a\u090c\3\2\2\2\u090b\u0909\3\2\2\2\u090c\u0916\5p9\2\u090d"+
		"\u090f\7\7\2\2\u090e\u090d\3\2\2\2\u090f\u0912\3\2\2\2\u0910\u090e\3\2"+
		"\2\2\u0910\u0911\3\2\2\2\u0911\u0913\3\2\2\2\u0912\u0910\3\2\2\2\u0913"+
		"\u0915\5\u00dco\2\u0914\u0910\3\2\2\2\u0915\u0918\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0916\u0914\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0920\3\2\2\2\u0918"+
		"\u0916\3\2\2\2\u0919\u091b\7\7\2\2\u091a\u0919\3\2\2\2\u091b\u091e\3\2"+
		"\2\2\u091c\u091a\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091f\3\2\2\2\u091e"+
		"\u091c\3\2\2\2\u091f\u0921\5\u00dep\2\u0920\u091c\3\2\2\2\u0920\u0921"+
		"\3\2\2\2\u0921\u00db\3\2\2\2\u0922\u0926\7P\2\2\u0923\u0925\7\7\2\2\u0924"+
		"\u0923\3\2\2\2\u0925\u0928\3\2\2\2\u0926\u0924\3\2\2\2\u0926\u0927\3\2"+
		"\2\2\u0927\u0929\3\2\2\2\u0928\u0926\3\2\2\2\u0929\u092d\7\13\2\2\u092a"+
		"\u092c\5\u011a\u008e\2\u092b\u092a\3\2\2\2\u092c\u092f\3\2\2\2\u092d\u092b"+
		"\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u0930\3\2\2\2\u092f\u092d\3\2\2\2\u0930"+
		"\u0931\5\u0126\u0094\2\u0931\u0932\7\33\2\2\u0932\u0933\5d\63\2\u0933"+
		"\u0937\7\f\2\2\u0934\u0936\7\7\2\2\u0935\u0934\3\2\2\2\u0936\u0939\3\2"+
		"\2\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u093a\3\2\2\2\u0939"+
		"\u0937\3\2\2\2\u093a\u093b\5p9\2\u093b\u00dd\3\2\2\2\u093c\u0940\7Q\2"+
		"\2\u093d\u093f\7\7\2\2\u093e\u093d\3\2\2\2\u093f\u0942\3\2\2\2\u0940\u093e"+
		"\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0943\3\2\2\2\u0942\u0940\3\2\2\2\u0943"+
		"\u0944\5p9\2\u0944\u00df\3\2\2\2\u0945\u0949\5\u00e2r\2\u0946\u0949\5"+
		"\u00e4s\2\u0947\u0949\5\u00e6t\2\u0948\u0945\3\2\2\2\u0948\u0946\3\2\2"+
		"\2\u0948\u0947\3\2\2\2\u0949\u00e1\3\2\2\2\u094a\u094e\7R\2\2\u094b\u094d"+
		"\7\7\2\2\u094c\u094b\3\2\2\2\u094d\u0950\3\2\2\2\u094e\u094c\3\2\2\2\u094e"+
		"\u094f\3\2\2\2\u094f\u0951\3\2\2\2\u0950\u094e\3\2\2\2\u0951\u0955\7\13"+
		"\2\2\u0952\u0954\5\u011a\u008e\2\u0953\u0952\3\2\2\2\u0954\u0957\3\2\2"+
		"\2\u0955\u0953\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u095a\3\2\2\2\u0957\u0955"+
		"\3\2\2\2\u0958\u095b\5H%\2\u0959\u095b\5F$\2\u095a\u0958\3\2\2\2\u095a"+
		"\u0959\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095d\7[\2\2\u095d\u095e\5|?"+
		"\2\u095e\u0962\7\f\2\2\u095f\u0961\7\7\2\2\u0960\u095f\3\2\2\2\u0961\u0964"+
		"\3\2\2\2\u0962\u0960\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0966\3\2\2\2\u0964"+
		"\u0962\3\2\2\2\u0965\u0967\5\u00ceh\2\u0966\u0965\3\2\2\2\u0966\u0967"+
		"\3\2\2\2\u0967\u00e3\3\2\2\2\u0968\u096c\7T\2\2\u0969\u096b\7\7\2\2\u096a"+
		"\u0969\3\2\2\2\u096b\u096e\3\2\2\2\u096c\u096a\3\2\2\2\u096c\u096d\3\2"+
		"\2\2\u096d\u096f\3\2\2\2\u096e\u096c\3\2\2\2\u096f\u0970\7\13\2\2\u0970"+
		"\u0971\5|?\2\u0971\u0975\7\f\2\2\u0972\u0974\7\7\2\2\u0973\u0972\3\2\2"+
		"\2\u0974\u0977\3\2\2\2\u0975\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0979"+
		"\3\2\2\2\u0977\u0975\3\2\2\2\u0978\u097a\5\u00ceh\2\u0979\u0978\3\2\2"+
		"\2\u0979\u097a\3\2\2\2\u097a\u00e5\3\2\2\2\u097b\u097f\7S\2\2\u097c\u097e"+
		"\7\7\2\2\u097d\u097c\3\2\2\2\u097e\u0981\3\2\2\2\u097f\u097d\3\2\2\2\u097f"+
		"\u0980\3\2\2\2\u0980\u0983\3\2\2\2\u0981\u097f\3\2\2\2\u0982\u0984\5\u00ce"+
		"h\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0988\3\2\2\2\u0985"+
		"\u0987\7\7\2\2\u0986\u0985\3\2\2\2\u0987\u098a\3\2\2\2\u0988\u0986\3\2"+
		"\2\2\u0988\u0989\3\2\2\2\u0989\u098b\3\2\2\2\u098a\u0988\3\2\2\2\u098b"+
		"\u098f\7T\2\2\u098c\u098e\7\7\2\2\u098d\u098c\3\2\2\2\u098e\u0991\3\2"+
		"\2\2\u098f\u098d\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0992\3\2\2\2\u0991"+
		"\u098f\3\2\2\2\u0992\u0993\7\13\2\2\u0993\u0994\5|?\2\u0994\u0995\7\f"+
		"\2\2\u0995\u00e7\3\2\2\2\u0996\u099a\7U\2\2\u0997\u0999\7\7\2\2\u0998"+
		"\u0997\3\2\2\2\u0999\u099c\3\2\2\2\u099a\u0998\3\2\2\2\u099a\u099b\3\2"+
		"\2\2\u099b\u099d\3\2\2\2\u099c\u099a\3\2\2\2\u099d\u09a7\5|?\2\u099e\u09a0"+
		"\t\7\2\2\u099f\u09a1\5|?\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1"+
		"\u09a7\3\2\2\2\u09a2\u09a7\7W\2\2\u09a3\u09a7\78\2\2\u09a4\u09a7\7X\2"+
		"\2\u09a5\u09a7\79\2\2\u09a6\u0996\3\2\2\2\u09a6\u099e\3\2\2\2\u09a6\u09a2"+
		"\3\2\2\2\u09a6\u09a3\3\2\2\2\u09a6\u09a4\3\2\2\2\u09a6\u09a5\3\2\2\2\u09a7"+
		"\u00e9\3\2\2\2\u09a8\u09b2\5d\63\2\u09a9\u09ad\7+\2\2\u09aa\u09ac\7\7"+
		"\2\2\u09ab\u09aa\3\2\2\2\u09ac\u09af\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ad"+
		"\u09ae\3\2\2\2\u09ae\u09b1\3\2\2\2\u09af\u09ad\3\2\2\2\u09b0\u09a9\3\2"+
		"\2\2\u09b1\u09b4\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3"+
		"\u09b6\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b5\u09a8\3\2\2\2\u09b5\u09b6\3\2"+
		"\2\2\u09b6\u09ba\3\2\2\2\u09b7\u09b9\7\7\2\2\u09b8\u09b7\3\2\2\2\u09b9"+
		"\u09bc\3\2\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bd\3\2"+
		"\2\2\u09bc\u09ba\3\2\2\2\u09bd\u09c1\t\b\2\2\u09be\u09c0\7\7\2\2\u09bf"+
		"\u09be\3\2\2\2\u09c0\u09c3\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c1\u09c2\3\2"+
		"\2\2\u09c2\u09c6\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c4\u09c7\5\u0124\u0093"+
		"\2\u09c5\u09c7\7=\2\2\u09c6\u09c4\3\2\2\2\u09c6\u09c5\3\2\2\2\u09c7\u00eb"+
		"\3\2\2\2\u09c8\u09c9\t\t\2\2\u09c9\u00ed\3\2\2\2\u09ca\u09cb\t\n\2\2\u09cb"+
		"\u00ef\3\2\2\2\u09cc\u09cd\t\13\2\2\u09cd\u00f1\3\2\2\2\u09ce\u09cf\t"+
		"\f\2\2\u09cf\u00f3\3\2\2\2\u09d0\u09d1\t\r\2\2\u09d1\u00f5\3\2\2\2\u09d2"+
		"\u09d3\t\16\2\2\u09d3\u00f7\3\2\2\2\u09d4\u09d5\t\17\2\2\u09d5\u00f9\3"+
		"\2\2\2\u09d6\u09d7\t\20\2\2\u09d7\u00fb\3\2\2\2\u09d8\u09e0\7\26\2\2\u09d9"+
		"\u09e0\7\27\2\2\u09da\u09e0\7\24\2\2\u09db\u09e0\7\25\2\2\u09dc\u09e0"+
		"\7\32\2\2\u09dd\u09e0\5\u011a\u008e\2\u09de\u09e0\5\u0118\u008d\2\u09df"+
		"\u09d8\3\2\2\2\u09df\u09d9\3\2\2\2\u09df\u09da\3\2\2\2\u09df\u09db\3\2"+
		"\2\2\u09df\u09dc\3\2\2\2\u09df\u09dd\3\2\2\2\u09df\u09de\3\2\2\2\u09e0"+
		"\u00fd\3\2\2\2\u09e1\u09f1\7\26\2\2\u09e2\u09f1\7\27\2\2\u09e3\u09e4\7"+
		"\32\2\2\u09e4\u09f1\7\32\2\2\u09e5\u09f1\5\u009cO\2\u09e6\u09f1\5\u00a0"+
		"Q\2\u09e7\u09e9\7\7\2\2\u09e8\u09e7\3\2\2\2\u09e9\u09ec\3\2\2\2\u09ea"+
		"\u09e8\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09ea\3\2"+
		"\2\2\u09ed\u09ee\5\u0100\u0081\2\u09ee\u09ef\5\u0096L\2\u09ef\u09f1\3"+
		"\2\2\2\u09f0\u09e1\3\2\2\2\u09f0\u09e2\3\2\2\2\u09f0\u09e3\3\2\2\2\u09f0"+
		"\u09e5\3\2\2\2\u09f0\u09e6\3\2\2\2\u09f0\u09ea\3\2\2\2\u09f1\u00ff\3\2"+
		"\2\2\u09f2\u09f6\7\t\2\2\u09f3\u09f4\7+\2\2\u09f4\u09f6\7\t\2\2\u09f5"+
		"\u09f2\3\2\2\2\u09f5\u09f3\3\2\2\2\u09f6\u0101\3\2\2\2\u09f7\u09fa\5\u011a"+
		"\u008e\2\u09f8\u09fa\5\u0104\u0083\2\u09f9\u09f7\3\2\2\2\u09f9\u09f8\3"+
		"\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09f9\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc"+
		"\u0103\3\2\2\2\u09fd\u0a07\5\u0106\u0084\2\u09fe\u0a07\5\u0108\u0085\2"+
		"\u09ff\u0a07\5\u010a\u0086\2\u0a00\u0a07\5\u010c\u0087\2\u0a01\u0a07\5"+
		"\u010e\u0088\2\u0a02\u0a07\5\u0110\u0089\2\u0a03\u0a07\5\u0112\u008a\2"+
		"\u0a04\u0a07\5\u0114\u008b\2\u0a05\u0a07\5\u0116\u008c\2\u0a06\u09fd\3"+
		"\2\2\2\u0a06\u09fe\3\2\2\2\u0a06\u09ff\3\2\2\2\u0a06\u0a00\3\2\2\2\u0a06"+
		"\u0a01\3\2\2\2\u0a06\u0a02\3\2\2\2\u0a06\u0a03\3\2\2\2\u0a06\u0a04\3\2"+
		"\2\2\u0a06\u0a05\3\2\2\2\u0a07\u0a0b\3\2\2\2\u0a08\u0a0a\7\7\2\2\u0a09"+
		"\u0a08\3\2\2\2\u0a0a\u0a0d\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0c\3\2"+
		"\2\2\u0a0c\u0105\3\2\2\2\u0a0d\u0a0b\3\2\2\2\u0a0e\u0a0f\t\21\2\2\u0a0f"+
		"\u0107\3\2\2\2\u0a10\u0a11\t\22\2\2\u0a11\u0109\3\2\2\2\u0a12\u0a13\t"+
		"\23\2\2\u0a13\u010b\3\2\2\2\u0a14\u0a15\t\24\2\2\u0a15\u010d\3\2\2\2\u0a16"+
		"\u0a17\t\25\2\2\u0a17\u010f\3\2\2\2\u0a18\u0a19\7}\2\2\u0a19\u0111\3\2"+
		"\2\2\u0a1a\u0a1b\t\26\2\2\u0a1b\u0113\3\2\2\2\u0a1c\u0a1d\t\27\2\2\u0a1d"+
		"\u0115\3\2\2\2\u0a1e\u0a1f\7\u0082\2\2\u0a1f\u0117\3\2\2\2\u0a20\u0a24"+
		"\7\u0090\2\2\u0a21\u0a23\7\7\2\2\u0a22\u0a21\3\2\2\2\u0a23\u0a26\3\2\2"+
		"\2\u0a24\u0a22\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0119\3\2\2\2\u0a26\u0a24"+
		"\3\2\2\2\u0a27\u0a2a\5\u011c\u008f\2\u0a28\u0a2a\5\u011e\u0090\2\u0a29"+
		"\u0a27\3\2\2\2\u0a29\u0a28\3\2\2\2\u0a2a\u0a2e\3\2\2\2\u0a2b\u0a2d\7\7"+
		"\2\2\u0a2c\u0a2b\3\2\2\2\u0a2d\u0a30\3\2\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e"+
		"\u0a2f\3\2\2\2\u0a2f\u011b\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a31\u0a35\5\u0120"+
		"\u0091\2\u0a32\u0a34\7\7\2\2\u0a33\u0a32\3\2\2\2\u0a34\u0a37\3\2\2\2\u0a35"+
		"\u0a33\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a38\3\2\2\2\u0a37\u0a35\3\2"+
		"\2\2\u0a38\u0a3c\7\33\2\2\u0a39\u0a3b\7\7\2\2\u0a3a\u0a39\3\2\2\2\u0a3b"+
		"\u0a3e\3\2\2\2\u0a3c\u0a3a\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3f\3\2"+
		"\2\2\u0a3e\u0a3c\3\2\2\2\u0a3f\u0a40\5\u0122\u0092\2\u0a40\u0a55\3\2\2"+
		"\2\u0a41\u0a49\7\u008f\2\2\u0a42\u0a44\7\7\2\2\u0a43\u0a42\3\2\2\2\u0a44"+
		"\u0a47\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a48\3\2"+
		"\2\2\u0a47\u0a45\3\2\2\2\u0a48\u0a4a\5\u00a4S\2\u0a49\u0a45\3\2\2\2\u0a49"+
		"\u0a4a\3\2\2\2\u0a4a\u0a52\3\2\2\2\u0a4b\u0a4d\7\7\2\2\u0a4c\u0a4b\3\2"+
		"\2\2\u0a4d\u0a50\3\2\2\2\u0a4e\u0a4c\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f"+
		"\u0a51\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a51\u0a53\5\u00a2R\2\u0a52\u0a4e"+
		"\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a55\3\2\2\2\u0a54\u0a31\3\2\2\2\u0a54"+
		"\u0a41\3\2\2\2\u0a55\u011d\3\2\2\2\u0a56\u0a57\5\u0120\u0091\2\u0a57\u0a58"+
		"\7\33\2\2\u0a58\u0a5a\7\r\2\2\u0a59\u0a5b\5\u0122\u0092\2\u0a5a\u0a59"+
		"\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d"+
		"\u0a5e\3\2\2\2\u0a5e\u0a5f\7\16\2\2\u0a5f\u0a6a\3\2\2\2\u0a60\u0a61\7"+
		"*\2\2\u0a61\u0a63\7\r\2\2\u0a62\u0a64\5\u0122\u0092\2\u0a63\u0a62\3\2"+
		"\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66"+
		"\u0a67\3\2\2\2\u0a67\u0a68\7\16\2\2\u0a68\u0a6a\3\2\2\2\u0a69\u0a56\3"+
		"\2\2\2\u0a69\u0a60\3\2\2\2\u0a6a\u011f\3\2\2\2\u0a6b\u0a6c\t\30\2\2\u0a6c"+
		"\u0121\3\2\2\2\u0a6d\u0a6f\5\u0124\u0093\2\u0a6e\u0a70\5\u00a4S\2\u0a6f"+
		"\u0a6e\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a72\3\2\2\2\u0a71\u0a73\5\u00a2"+
		"R\2\u0a72\u0a71\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73\u0123\3\2\2\2\u0a74"+
		"\u0a7f\5\u0126\u0094\2\u0a75\u0a77\7\7\2\2\u0a76\u0a75\3\2\2\2\u0a77\u0a7a"+
		"\3\2\2\2\u0a78\u0a76\3\2\2\2\u0a78\u0a79\3\2\2\2\u0a79\u0a7b\3\2\2\2\u0a7a"+
		"\u0a78\3\2\2\2\u0a7b\u0a7c\7\t\2\2\u0a7c\u0a7e\5\u0126\u0094\2\u0a7d\u0a78"+
		"\3\2\2\2\u0a7e\u0a81\3\2\2\2\u0a7f\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80"+
		"\u0125\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a82\u0a83\t\31\2\2\u0a83\u0127\3"+
		"\2\2\2\u0a84\u0a86\7\7\2\2\u0a85\u0a84\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87"+
		"\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a97\3\2\2\2\u0a89\u0a8b\7\7"+
		"\2\2\u0a8a\u0a89\3\2\2\2\u0a8b\u0a8e\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8c"+
		"\u0a8d\3\2\2\2\u0a8d\u0a8f\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8f\u0a93\7\34"+
		"\2\2\u0a90\u0a92\7\7\2\2\u0a91\u0a90\3\2\2\2\u0a92\u0a95\3\2\2\2\u0a93"+
		"\u0a91\3\2\2\2\u0a93\u0a94\3\2\2\2\u0a94\u0a97\3\2\2\2\u0a95\u0a93\3\2"+
		"\2\2\u0a96\u0a85\3\2\2\2\u0a96\u0a8c\3\2\2\2\u0a97\u0129\3\2\2\2\u0a98"+
		"\u0a99\t\32\2\2\u0a99\u012b\3\2\2\2\u0a9a\u0a9c\5\u012e\u0098\2\u0a9b"+
		"\u0a9a\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u0a9f\7\7"+
		"\2\2\u0a9e\u0a9b\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa0"+
		"\u0aa1\3\2\2\2\u0aa1\u012d\3\2\2\2\u0aa2\u0aa6\5\u0142\u00a2\2\u0aa3\u0aa6"+
		"\5\u0130\u0099\2\u0aa4\u0aa6\5\u0132\u009a\2\u0aa5\u0aa2\3\2\2\2\u0aa5"+
		"\u0aa3\3\2\2\2\u0aa5\u0aa4\3\2\2\2\u0aa6\u012f\3\2\2\2\u0aa7\u0aa9\5\u0136"+
		"\u009c\2\u0aa8\u0aa7\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aaa\3\2\2\2\u0aaa"+
		"\u0aac\5\u0144\u00a3\2\u0aab\u0aad\5\u0134\u009b\2\u0aac\u0aab\3\2\2\2"+
		"\u0aac\u0aad\3\2\2\2\u0aad\u0aaf\3\2\2\2\u0aae\u0ab0\5\u0142\u00a2\2\u0aaf"+
		"\u0aae\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0131\3\2\2\2\u0ab1\u0ab2\5\u0136"+
		"\u009c\2\u0ab2\u0ab3\7\33\2\2\u0ab3\u0133\3\2\2\2\u0ab4\u0ab7\5\u0138"+
		"\u009d\2\u0ab5\u0ab6\7\n\2\2\u0ab6\u0ab8\5\u0134\u009b\2\u0ab7\u0ab5\3"+
		"\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u0135\3\2\2\2\u0ab9\u0aba\5\u013e\u00a0"+
		"\2\u0aba\u0137\3\2\2\2\u0abb\u0abd\5\u013a\u009e\2\u0abc\u0abb\3\2\2\2"+
		"\u0abc\u0abd\3\2\2\2\u0abd\u0ac2\3\2\2\2\u0abe\u0ac3\5\u0140\u00a1\2\u0abf"+
		"\u0ac3\5\u013e\u00a0\2\u0ac0\u0ac3\5\u013c\u009f\2\u0ac1\u0ac3\7\21\2"+
		"\2\u0ac2\u0abe\3\2\2\2\u0ac2\u0abf\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac2\u0ac1"+
		"\3\2\2\2\u0ac3\u0ac6\3\2\2\2\u0ac4\u0ac5\t\33\2\2\u0ac5\u0ac7\5\u0140"+
		"\u00a1\2\u0ac6\u0ac4\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7\u0acd\3\2\2\2\u0ac8"+
		"\u0ac9\7\13\2\2\u0ac9\u0aca\5\u0138\u009d\2\u0aca\u0acb\7\f\2\2\u0acb"+
		"\u0acd\3\2\2\2\u0acc\u0abc\3\2\2\2\u0acc\u0ac8\3\2\2\2\u0acd\u0139\3\2"+
		"\2\2\u0ace\u0acf\7)\2\2\u0acf\u013b\3\2\2\2\u0ad0\u0ad1\7\u01f7\2\2\u0ad1"+
		"\u013d\3\2\2\2\u0ad2\u0ad3\7\u01f8\2\2\u0ad3\u013f\3\2\2\2\u0ad4\u0ad5"+
		"\7\u01f9\2\2\u0ad5\u0141\3\2\2\2\u0ad6\u0ad7\7\u01fa\2\2\u0ad7\u0143\3"+
		"\2\2\2\u0ad8\u0ad9\t\34\2\2\u0ad9\u0145\3\2\2\2\u01a1\u0149\u0150\u0157"+
		"\u015a\u015e\u0161\u0168\u016f\u0176\u0179\u017d\u0180\u0185\u018d\u0195"+
		"\u019a\u019d\u01a1\u01a4\u01a9\u01ab\u01b0\u01b8\u01bb\u01c5\u01c8\u01ce"+
		"\u01d5\u01d9\u01de\u01e2\u01e7\u01ee\u01f2\u01f7\u01fb\u0200\u0207\u020b"+
		"\u020e\u0214\u0217\u0221\u0224\u0229\u022c\u0233\u0238\u023f\u0246\u024c"+
		"\u0252\u025b\u0262\u026b\u0271\u0277\u0284\u0289\u0290\u0296\u029c\u02a3"+
		"\u02aa\u02ae\u02b3\u02bc\u02c4\u02c8\u02ce\u02d2\u02d7\u02de\u02e4\u02e7"+
		"\u02ec\u02f5\u02fa\u02fd\u0303\u0307\u030c\u0310\u0315\u0319\u031c\u0322"+
		"\u0329\u032e\u0333\u0337\u033c\u0340\u0345\u034a\u034f\u0356\u035d\u0361"+
		"\u0366\u036a\u036f\u0373\u037b\u037e\u0383\u0388\u0393\u0397\u039a\u03a0"+
		"\u03a7\u03ab\u03b0\u03b7\u03bb\u03c0\u03c4\u03c7\u03cd\u03d1\u03d7\u03db"+
		"\u03e0\u03e7\u03eb\u03f0\u03f4\u03f7\u03fd\u0401\u0406\u040d\u0412\u0417"+
		"\u041c\u0421\u0425\u042a\u0431\u0435\u043b\u0441\u0443\u044b\u0453\u0456"+
		"\u045a\u0460\u0468\u046f\u0473\u0478\u0480\u0484\u0486\u0489\u048d\u0493"+
		"\u0499\u049b\u04a0\u04a6\u04ab\u04ae\u04b4\u04bb\u04bf\u04c4\u04cb\u04d4"+
		"\u04db\u04e2\u04e8\u04ee\u04f4\u04f9\u0500\u0507\u050e\u0511\u0514\u051a"+
		"\u0521\u0524\u0526\u052e\u0533\u0539\u0541\u0546\u054b\u054e\u0552\u055a"+
		"\u0561\u0564\u056a\u0571\u0579\u057f\u0586\u058c\u0593\u0597\u059b\u05a0"+
		"\u05a5\u05a9\u05b2\u05b9\u05c0\u05c6\u05cc\u05d3\u05da\u05ea\u05f1\u05f4"+
		"\u05f8\u05fb\u05ff\u0604\u060a\u0612\u0619\u0621\u0628\u062f\u0635\u063c"+
		"\u0643\u0649\u0651\u0658\u0660\u0665\u066c\u0673\u0679\u067e\u0684\u068b"+
		"\u0691\u0699\u06a0\u06a8\u06ae\u06b6\u06bd\u06c5\u06cc\u06d3\u06db\u06e1"+
		"\u06e8\u06ed\u06fc\u0704\u0709\u0710\u0716\u0718\u071d\u0721\u0726\u0731"+
		"\u0734\u073e\u0741\u0749\u0750\u0757\u075d\u0763\u0767\u076c\u0772\u0779"+
		"\u077c\u077f\u0784\u0792\u0796\u079b\u079d\u07a7\u07a9\u07bd\u07c4\u07cb"+
		"\u07d4\u07db\u07e2\u07e9\u07ee\u07f1\u07f6\u07fd\u0803\u080b\u0812\u0816"+
		"\u0818\u081e\u0825\u0829\u082e\u0835\u083b\u0842\u0849\u0850\u0855\u0858"+
		"\u085c\u0862\u086b\u086f\u0872\u0877\u087e\u0882\u0884\u0888\u088e\u0895"+
		"\u089a\u08a1\u08a8\u08ad\u08b3\u08bc\u08c3\u08c9\u08cf\u08d6\u08db\u08e1"+
		"\u08e8\u08ec\u08f1\u08f7\u0900\u0909\u0910\u0916\u091c\u0920\u0926\u092d"+
		"\u0937\u0940\u0948\u094e\u0955\u095a\u0962\u0966\u096c\u0975\u0979\u097f"+
		"\u0983\u0988\u098f\u099a\u09a0\u09a6\u09ad\u09b2\u09b5\u09ba\u09c1\u09c6"+
		"\u09df\u09ea\u09f0\u09f5\u09f9\u09fb\u0a06\u0a0b\u0a24\u0a29\u0a2e\u0a35"+
		"\u0a3c\u0a45\u0a49\u0a4e\u0a52\u0a54\u0a5c\u0a65\u0a69\u0a6f\u0a72\u0a78"+
		"\u0a7f\u0a87\u0a8c\u0a93\u0a96\u0a9b\u0aa0\u0aa5\u0aa8\u0aac\u0aaf\u0ab7"+
		"\u0abc\u0ac2\u0ac6\u0acc";
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