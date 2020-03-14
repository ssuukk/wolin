parser grammar MegaAsmParser;

options { tokenVocab = MegaAsmLexer; }

pseudoAsmFile
    : NL* (linia NL*)* EOF
    ;

referencer
    : (REFERENCE | DEREFERENCE);

operand
	: referencer* value typeName*;

value
    : (addressed | immediate | floatimmediate | stringimmediate );

addressed
    : (absAddress | identifier) (LPAREN index RPAREN)*;

index
    : (IntegerLiteral);

immediate
    : HASH (IntegerLiteral | identifier);

floatimmediate
    : MOD (DoubleLiteral);

stringimmediate
    : DOLLAR (lineStringLiteral);

absAddress
    : IntegerLiteral;

typeName
    : COLON (identifier) referencer*
    ;

instrukcja
    : simpleIdentifier
    ;

linia
    : instrukcja (target ASSIGNMENT (arg (Operator arg)*))* (ARROW assemblerBody)* NL
    | instrukcja arg (COMMA arg)* (ARROW assemblerBody)* NL
    ;

target
    : operand
    ;

arg
    : operand
    ;


identifier
    : simpleIdentifier (NL* DOT simpleIdentifier*)*
    ;

simpleIdentifier
    : Identifier
    ;


//semi: NL+ | NL* SEMICOLON NL*;

//anysemi: NL | SEMICOLON;

assemblerBody
    : multiLineStringLiteral
    ;

multiLineStringLiteral
    : TRIPLE_QUOTE_OPEN (multiLineStringContent | MultiLineStringQuote)* TRIPLE_QUOTE_CLOSE
    ;

multiLineStringContent
    : MultiLineStrText
    ;

lineStringLiteral
    : QUOTE_OPEN (lineStringContent)* QUOTE_CLOSE
    ;

lineStringContent
    : LineStrText
    | LineStrEscapedChar
    ;