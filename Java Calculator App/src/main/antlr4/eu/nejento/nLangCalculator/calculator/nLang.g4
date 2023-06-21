grammar nLang;

root:	(expr NEWLINE)*;

expr:	left=expr (operator='*') right=expr     #opexpr
    |	left=expr (operator='+') right=expr     #opexpr
    |   left=expr (operator='%') right=expr     #opexpr
    |	'(' expr ')'                            #parexpr
    |   TYPE                                    #leafexpr
    ;

//Datové typy
TYPE            : INT
                | BINARY
                | STRING
                | COMMENT
                | BINDEC
                | DECBIN
                ;

//Funkce
BINDEC          : 'bindec(' BINARY ')';
DECBIN          : 'decbin(' INT ')';

//Int
NON_ZERO_DIGIT  : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
DIGIT           : '0' | NON_ZERO_DIGIT;
INT_DEFAULT     : NON_ZERO_DIGIT DIGIT*;
INT             : INT_DEFAULT | BINDEC;

//Binary
BINARY_DEFAULT  : 'b' ('0'|'1')+;
BINARY          : BINARY_DEFAULT | DECBIN;

//String
STRING          : '"' (~["])* '"';

//Komentář
COMMENT         : '#!' (~[!#])* '!#';


NEWLINE         : [\r\n]+ ;
WS              : [ \t]+ -> skip ; // skip spaces, tabs, newlines