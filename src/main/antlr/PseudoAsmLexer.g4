lexer grammar PseudoAsmLexer;

import UnicodeClasses;

DelimitedComment
    : '/*' ( DelimitedComment | . )*? '*/'
      -> channel(HIDDEN)
    ;

LineComment
    : '//' ~[\u000A\u000D]*
      -> channel(HIDDEN)
    ;

WS
    : [\u0020\u0009\u000C]
      -> skip
    ;

NL: '\u000A' | '\u000D' '\u000A' ;

DOT: '.' ;
HASH: '#' ;
LANGLE: '<' ;
RANGLE: '>' ;
LPAREN: '(' ;
RPAREN: ')' ;
LSQUARE: '[' ;
RSQUARE: ']' ;
ASSIGNMENT: '=' ;
COMMA: ',' ;
QUEST: '?' ;
AT: '@' ;
ARROW: '->' ;
MOD: '%' ;
DOLLAR: '$' ;

QUOTE_OPEN: '"' -> pushMode(LineString) ;
TRIPLE_QUOTE_OPEN: '"""' -> pushMode(MultiLineString) ;


fragment HexDigit
    : [0-9a-fA-F]
    ;

fragment UniCharacterLiteral
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment DecDigit
    : UNICODE_CLASS_ND
    ;

fragment DecDigitNoZero
    : UNICODE_CLASS_ND_NoZeros
    ;

fragment UNICODE_CLASS_ND_NoZeros
	: '\u0031'..'\u0039'
	| '\u0661'..'\u0669'
	| '\u06f1'..'\u06f9'
	| '\u07c1'..'\u07c9'
	| '\u0967'..'\u096f'
	| '\u09e7'..'\u09ef'
	| '\u0a67'..'\u0a6f'
	| '\u0ae7'..'\u0aef'
	| '\u0b67'..'\u0b6f'
	| '\u0be7'..'\u0bef'
	| '\u0c67'..'\u0c6f'
	| '\u0ce7'..'\u0cef'
	| '\u0d67'..'\u0d6f'
	| '\u0de7'..'\u0def'
	| '\u0e51'..'\u0e59'
	| '\u0ed1'..'\u0ed9'
	| '\u0f21'..'\u0f29'
	| '\u1041'..'\u1049'
	| '\u1091'..'\u1099'
	| '\u17e1'..'\u17e9'
	| '\u1811'..'\u1819'
	| '\u1947'..'\u194f'
	| '\u19d1'..'\u19d9'
	| '\u1a81'..'\u1a89'
	| '\u1a91'..'\u1a99'
	| '\u1b51'..'\u1b59'
	| '\u1bb1'..'\u1bb9'
	| '\u1c41'..'\u1c49'
	| '\u1c51'..'\u1c59'
	| '\ua621'..'\ua629'
	| '\ua8d1'..'\ua8d9'
	| '\ua901'..'\ua909'
	| '\ua9d1'..'\ua9d9'
	| '\ua9f1'..'\ua9f9'
	| '\uaa51'..'\uaa59'
	| '\uabf1'..'\uabf9'
	| '\uff11'..'\uff19'
	;

FloatLiteral
    : (DoubleLiteral | IntegerLiteral) [fF]
    ;

DoubleLiteral
    : ( (DecDigitNoZero DecDigit*)? '.'
      | (DecDigitNoZero (DecDigit | '_')* DecDigit)? '.')
     ( DecDigit+
      | DecDigit (DecDigit | '_')+ DecDigit
      | DecDigit+ [eE] ('+' | '-')? DecDigit+
      | DecDigit+ [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
      | DecDigit (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit+
      | DecDigit (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
     )
    ;


IntegerLiteral
    : ('0'
      | DecDigitNoZero DecDigit*
      | DecDigitNoZero (DecDigit | '_')+ DecDigit
      | DecDigitNoZero DecDigit* [eE] ('+' | '-')? DecDigit+
      | DecDigitNoZero DecDigit* [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
      | DecDigitNoZero (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit+
      | DecDigitNoZero (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
      )
    ;

Identifier
    : (Letter | '_') (Letter | '_' | DecDigit)*
    | '`' ~('`')+ '`'
    ;

fragment Letter
    : UNICODE_CLASS_LL
    | UNICODE_CLASS_LM
    | UNICODE_CLASS_LO
    | UNICODE_CLASS_LT
    | UNICODE_CLASS_LU
    | UNICODE_CLASS_NL
    ;


mode LineString ;

QUOTE_CLOSE
    : '"' -> popMode
    ;

LineStrText
    : ~('\\' | '"' | '$')+ | '$'
    ;

LineStrEscapedChar
    : '\\' .
    | UniCharacterLiteral
    ;

mode MultiLineString ;

TRIPLE_QUOTE_CLOSE
    : MultiLineStringQuote? '"""' -> popMode
    ;

MultiLineStringQuote
    : '"'+
    ;


MultiLineStrText
    :  ~('\\' | '"' | '$')+ | '$'
    ;

MultiLineStrEscapedChar
    : '\\' .
    ;

MultiLineNL: NL -> skip ;

StrExpr_TRIPLE_QUOTE_OPEN: TRIPLE_QUOTE_OPEN -> pushMode(MultiLineString), type(TRIPLE_QUOTE_OPEN) ;
StrExpr_QUOTE_OPEN: QUOTE_OPEN -> pushMode(LineString), type(QUOTE_OPEN) ;

