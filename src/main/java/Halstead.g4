lexer grammar Halstead;

IGNORE: (COMMENT | INLINECOMMENT | SHOULD_SKIP | INCLUDE | WHITESPACE)-> skip;

OPERATOR: SCSPEC | TYPE_QUAL | RESERVED | OPERATORS;

OPERAND:  IDENTIFIER | TYPESPEC | CONSTANT | INT | FLOAT | STRING ;

//(storage class specifiers) Reservierte Wörter' | die Speicherklassen beschreiben
fragment SCSPEC: 'auto' | 'extern' | 'inline' | 'register' | 'static' | 'typedef' | 'virtual' | 'mtuable';

//(type qualifiers) Reservierte Wörter', die Typen qualifizieren
fragment TYPE_QUAL: 'const'|'friend'|'volatile';

//Andere reservierte Wörter der C++ Programmiersprache
fragment RESERVED: 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default' | 'delete' | 'while(' | 'else' | 'enum' | 'for('
                   | 'goto' | 'if(' | 'new' | 'operator' | 'private' | 'protected' | 'public' | 'return' | 'sizeof' | 'struct'
                   | 'switch(' | 'this' | 'union' | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast' | 'static_cast'
                   | 'dynamic_cast' | 'reinterpret_cast' | 'typeid' | 'template' | 'explicit' | 'true' | 'false' | 'typename';

fragment OPERATORS: '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='|'+'|'++'|'+='|','|'-'|'--'|'-='|'->'|'...'|'/'
                    |'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'
                    |'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';';

//alle Identifier, die keine reservierten Wörter sind.
fragment IDENTIFIER: LETTER(LETTER|DIGIT)*;

//Reservierte Wörter, die Typen spezifizieren
fragment TYPESPEC: 'bool'| 'char'| 'double'| 'float'| 'int'| 'long'| 'short'| 'signed'| 'unsigned'| 'void';

//Zeichenkonstanten, numerische oder String-Konstanten.
fragment CONSTANT: LETTERBIG(LETTERBIG|DIGIT)* | DIGIT+ | FLOAT ;
fragment LETTERBIG: [A-Z_];
fragment LETTER: [a-zA-Z_];

fragment INT : DIGIT+;
fragment DIGIT : [0-9];

fragment FLOAT: DIGIT* '.' DIGIT* ;

fragment STRING : '"' .*? '"' | '\'' .*? '\'' ;


fragment COMMENT : '/*' .*? '*/';
fragment INLINECOMMENT  : '//' ~[\r\n]*;
fragment SHOULD_SKIP: (')' | '}'| ']' |':'|'do');
fragment INCLUDE: ('#INCLUDE'.*? '\n' | '#include'.*? '\n');
fragment WHITESPACE : [ \t\r\n] ;