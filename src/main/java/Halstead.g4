lexer grammar Halstead;

OPERATOR: RESERVED | SCSPEC | TYPE_QUAL  | OPERATORS;

IGNORE: (COMMENT | INLINECOMMENT  | SHOULD_SKIP  | INCLUDE  | WHITESPACE)-> skip;
OPERAND:  TYPESPEC | IDENTIFIER | INT | FLOAT | CONSTANT | STRING ;

RESERVED: 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default' | 'delete' | 'while(' | 'else' | 'enum' | 'for('
                   | 'goto' | 'if(' | 'new' | 'operator' | 'private' | 'protected' | 'public' | 'return' | 'sizeof' | 'struct'
                   | 'switch(' | 'this' | 'union' | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast' | 'static_cast'
                   | 'dynamic_cast' | 'reinterpret_cast' | 'typeid' | 'template' | 'explicit' | 'true' | 'false' | 'typename';

fragment OPERATORS: '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='|'+'|'++'|'+='|','|'-'|'--'|'-='|'->'|'...'|'/'
                    |'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'
                    |'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';';

//(type qualifiers) Reservierte Wörter' | die Typen qualifizieren
fragment TYPE_QUAL: 'const'|'friend'|'volatile';




//(storage class specifiers) Reservierte Wörter' | die Speicherklassen beschreiben
fragment SCSPEC: 'auto' | 'extern' | 'inline' | 'register' | 'static' | 'typedef' | 'virtual' | 'mtuable';



fragment CONSTANT: LETTERBIG(LETTERBIG|DIGIT)* | DIGIT+ | FLOAT ;

fragment TYPESPEC: 'bool'| 'char'| 'double'| 'float'| 'int'| 'long'| 'short'| 'signed'| 'unsigned'| 'void';

fragment IDENTIFIER: LETTER(LETTER|DIGIT)*;

fragment FLOAT: DIGIT+ '.' DIGIT* | '.' DIGIT+ | '-' DIGIT+ '.' DIGIT* ;

fragment STRING : '"' .*? '"' | '\'' .*? '\'' ;
fragment INT : DIGIT+;
fragment INLINECOMMENT  : '//' ~[\r\n]*;
fragment COMMENT : '/*' .*? '*/';
fragment INCLUDE: ('#INCLUDE'.*? '\n' | '#include'.*? '\n');

fragment SHOULD_SKIP: (')' | '}'| ']' |':'|'do');

fragment DIGIT : [0-9] ;
fragment LETTER: [a-zA-Z_];
fragment LETTERBIG: [A-Z_];
fragment WHITESPACE : [ \t\r\n] ;