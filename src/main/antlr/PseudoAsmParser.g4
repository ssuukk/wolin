parser grammar PseudoAsmParser;

options { tokenVocab = PseudoAsmLexer; }

pseudoAsmFile
    : NL* (linia NL*)* EOF
    ;

jocker
    : QUEST simpleIdentifier;

referencer
    : (REFERENCE | DEREFERENCE);

operand
	: referencer* value name* typeName*;

value
    : (addressed | immediate | floatimmediate | stringimmediate );

addressed
    : (jocker | absAddress | identifier) (LPAREN index RPAREN)*;

index
    : (jocker | IntegerLiteral);

immediate
    : HASH (jocker | IntegerLiteral);

floatimmediate
    : MOD (jocker | DoubleLiteral);

stringimmediate
    : DOLLAR (jocker | lineStringLiteral);

absAddress
    : IntegerLiteral;

name
    : LANGLE identifier RANGLE
    ;

typeName
    : LSQUARE (jocker | identifier referencer*) RSQUARE
    ;

instrukcja
    : simpleIdentifier
    ;

linia
    : instrukcja (target ASSIGNMENT (arg (COMMA arg)*))* (ARROW assemblerBody)* NL
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