grammar furlang;

//Kořenové pravidlo
root:	(expr NEWLINE)*;

//Výrazy
expr:	expr ('*') expr
    |	expr ('+') expr
    |   expr ('%') expr 
    |	'(' expr ')'
    |   TYPE
    ;

//Datové typy
TYPE            : INT
                | BINARY
                | STRING
                | ANIMAL
                | COMMENT
                | BINDEC
                | DECBIN
                | FURRY
                ;

//Funkce
BINDEC          : 'bindec(' BINARY ')';
DECBIN          : 'decbin(' INT ')';
FURRY           : 'furry(' INT ')';

//Int
NON_ZERO_DIGIT  : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
DIGIT           : '0' | NON_ZERO_DIGIT;
INT_DEFAULT     : NON_ZERO_DIGIT DIGIT*;
INT             : INT_DEFAULT | BINDEC;

//Binary
BINARY_DEFAULT  : 'b' ('0'|'1') ('0'|'1')+;
BINARY          : BINARY_DEFAULT | DECBIN;

//String
STRING          : '"' (~["])* '"';

//Furry
ANIMALLIST     : 'Pes' | 'Kočka' | 'Mýval' | 'Vlk' | 'Liška' | 'Lev' | 'Drak' | 'Jelen' | 'Kůň' | 'Protogen';
ANIMALS        : ANIMALLIST | ANIMALLIST ANIMALS;
ANIMAL         : 'f' ANIMALS;

//Komentář
COMMENT         : '#!' (~[!#])* '!#';

//Newline a mezery
NEWLINE         : [\r\n]+ ;
WS              : [ \t]+ -> skip ; // skip spaces, tabs, newlines
