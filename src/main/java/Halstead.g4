lexer grammar Halstead;

//OPERAND: IDENTIFIER | TYPESPEC | CONSTANT;




OPERATOR: SCSPEC | TYPE_QUAL | RESERVED | OPERATORS;

IGNORE: (SHOULD_SKIP | INCLUDE | COMMENTS | WHITESPACE ) ->skip;


//(storage class specifiers) Reservierte Wörter' | die Speicherklassen beschreiben
fragment SCSPEC: 'auto' | 'extern' | 'inline' | 'register' | 'static' | 'typedef' | 'virtual' | 'mtuable';

//(type qualifiers) Reservierte Wörter' | die Typen qualifizieren
fragment TYPE_QUAL: 'const'|'friend'|'volatile';

//RESERVED – Andere reservierte Wörter der C++ Programmiersprache
fragment RESERVED: 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default' | 'delete' | 'while(' | 'else' | 'enum' | 'for('
                   | 'goto' | 'if(' | 'new' | 'operator' | 'private' | 'protected' | 'public' | 'return' | 'sizeof' | 'struct'
                   | 'switch(' | 'this' | 'union' | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast' | 'static_cast'
                   | 'dynamic_cast' | 'reinterpret_cast' | 'typeid' | 'template' | 'explicit' | 'true' | 'false' | 'typename';


fragment OPERATORS: '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='|'+'|'++'|'+='|','|'-'|'--'|'-='|'->'|'...'|'/'
                    |'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'|'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';';


fragment SHOULD_SKIP: (')' | '}'| ']' |':'|'do');

fragment INCLUDE: '#include'.*? '\n';

fragment COMMENTS: ('//'.*? '\n'| '/*'.* '*/');

fragment WHITESPACE : [ \t\r\n];
