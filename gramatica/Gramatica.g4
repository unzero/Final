grammar Gramatica;

tokens { INDENT, DEDENT }



 /*
  * 
  * 
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * PROGRAMACION FUNCIONAL
  * 
  * 
  */
 matchFun: ;
 
















/*
 * 
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * PUNTOS DE ENTRADA BASICOS
 * 
 * 
 */


single_input: 
 |  import_stmt* stmt*
 ;

stmt
 : if_stmt 
 | while_stmt 
 | for_stmt 
 | try_stmt 
 | funcdef 
 | flow_stmt
 | assig_stmt
 | print_fun
 | func_call 
//| with_stmt 
// | classdef 
// | decorated
 ;
 
 
 
 
print_fun
 : 'print(' test ')' ';'
 ; 
 
 
 
 
 
 
 
 
 
 
 
 
/*
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * REGLAS PARA LOS IMPORT
 * 
 */

import_stmt
 : import_name 
 | import_from
 ;
 
import_name: IMPORT NAME ';'
;

import_from: FROM NAME IMPORT NAME ';'
;

















/*
 * 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * DEFINICION DE FUNCIONES 
 * 
 * 
 */


funcdef
 : DEF NAME '(' args? ')' ( '(' lambdaParamet ')' )? funcBody
 ;


//CUENTA CON VISITOR
funcBody
 : '{' stmt* '}'													#funcBodyNormal
 |  NAME MATCH '{' match_stmt+ '}'									#funcBodyMatch
 ;			

match_stmt
 : CASE test '=>' '{' stmt* '}' 
 ;

lambdaParamet
 :	NAME '=>' NAME
 ;

args
 : NAME sub_args*
 ;

sub_args
 : ',' NAME
 ;
 
//CUENTA CON VISITOR
func_call
 : NAME '(' parameters?  ')'	';'										
 ;
 
parameters
 : test sub_parameters*
 ;
 
sub_parameters
 : ',' test 
 ;

 
 
 

 
 
 
 

 
 
 
 
 
 
 /*
  * 
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * ESTRUCTURAS DE FLUJO Y CONTROL
  * 
  */
 
 

if_stmt
 : IF test ':' '{' stmt* '}' elif_stmt*  else_stmt?
 ;

elif_stmt
 : ELIF test ':' '{' stmt* '}'
 ;

else_stmt
 : ELSE ':' '{' stmt* '}' 
 ;

while_stmt
 : WHILE test '{' stmt*  '}'
 ;

return_stmt
 : RETURN test ';'
 ;


assig_stmt
 : NAME '=' test ';'										#assig_stmtVar
 | NAME'[' test ']' '=' test								#assig_stmtIterable
 ;

for_stmt
 : FOR NAME IN iterable '{' stmt*  '}'
 ;



/*
 * ESTA PARTE NO FUNCIONA BIEN, NO TIENEN USO ALGUNO
 */
flow_stmt
 : break_stmt 
 | continue_stmt 
 | return_stmt 
// | raise_stmt 
//| yield_stmt
 ;

break_stmt
 : BREAK ';'
 ;

continue_stmt
 : CONTINUE ';'
 ;






/*
 * TAMPOCO SE USA
 */
try_stmt
 : TRY ':' '{' stmt '}' ( ( except_clause ':' '{' stmt '}' )+ | FINALLY ':' '{' stmt '}' )
 ;
 
del_stmt
 : DEL del_stmt
 ;
 
except_clause
 : EXCEPT test 
 ;





/*
 * 
 * 
 * ITERABLE COMMANDS
 * 
 * 
 */
 
lambda_testset
 : lambda_test lambda_subset*
 ;
 
lambda_subset
 : ',' lambda_test 
 ; 

lambda_test
 : NAME '=>' test
 ; 


/*
 * 
 * 
 * ITERABLES ATOMIC ELEMENTS
 * 
 * 
 * 
 */

iterable
 : '[' list_element? ']'									#iterable_list
 | '{' map_element? '}'										#iterable_map
 | '(' test ',' test ')'									#iterable_tuple
 | GENERATE '{' test '}'											#iterable_generate
 | iterable FILTER '{' lambda_test '}'								#iterable_filter
 | iterable PARTITION '{' lambda_test '}'							#iterable_partition
 | NAME														#iterable_name
 ;

list_element
 : test sublist_element* 
 ;

sublist_element
 : ',' test 
 ;

map_element
 : test ':' test submap_element*
 ;
 
submap_element
 : ',' test ':' test 
 ;





 
/*
 * 
 * 
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * OPERACIONES BASICAS
 * 
 * 
 */
 
 /* 
test_ex
 : and_test ( OR and_test )?								#OrTest
 ;

and_test
 : not_test ( AND not_test )?								#AndTest
 ;

not_test					
 : NOT comparison 											#NotExpr
 | comparison												#NotComparison
 ;		

comparison
 : expr comp_op expr 										#ComparisonEval
 | '(' test ')'												#ComparisonTest
 | expr														#ComparisonExpr
 ;
 
expr_ex
 : or_expr ( '&' or_expr )?									#AndExpr
 ;

or_expr
 : xor_expr ( '|' xor_expr )?								#OrExpr
 ;

xor_expr
 : shift_expr ( '^' shift_expr )?							#XorExpr
 ;

shift_expr
 : arith_expr ( '<<' arith_expr )? 							#ShiftLeft
 | arith_expr ( '>>' arith_expr )?							#ShiftRight
 ; 
 
arith_expr
 : term ( '+' term )*										#ArithPlus
 | term ( '-' term  )?										#ArithMinus
 ;

term
 : power ( '*' power )?										#TermProduct
 | power ( '/' power )?										#TermDivision
 | power ( '%' power )?				  					  	#TermModule
 ;
 
power
 : atom_stmt ( '**' atom_stmt )?							#PowerEval
 ;
*/

test
 : test AND test 											#testAnd
 | test OR test												#testOr
 | NOT test 												#testNot
 | '(' test	')'												#testTest
 | expr comp_op expr										#testExprComp
 | expr	 													#testExpr
 ;

expr
 : expr '**' expr 											#exprPower
 | expr '*'  expr 											#exprMultiply
 | expr '/'  expr 											#exprDivision
 | expr '%'  expr 											#exprModule
 | expr '+'  expr 											#exprPlus
 | expr '-'  expr  											#exprMinus
 | expr '<<' expr 											#exprShiftLeft
 | expr '>>' expr 											#exprShiftRight
 | expr '&'  expr 											#exprAnd
 | expr '|'  expr 											#exprOr
 | expr '^'  expr 											#exprXor
 | atom														#exprAtom
 | '(' expr ')'												#exprExpr
 ;

atom
 : NAME 													#AtomName
 | number 													#AtomNumber
 | STRING 													#AtomString
 | '...' 													#atomDot
 | NONE														#atomNone
 | TRUE														#atomTrue
 | FALSE													#atomFalse
 | NAME '(' parameters?  ')'								#atomFuncCall
 | NAME '[' test ']'										#atomIterableAccess
 | iterable													#atomIterableDef
 // : '(' ( yield_expr | testlist_comp )? ')' 	
 // | '[' testlist_comp? ']'  
 // | '{' dictorsetmaker? '}' 
 ;
 
number
 : integer													#NumberInteger	
 | FLOAT_NUMBER												#NumberFloat
 | IMAG_NUMBER												#NumberComplex		
 ;
  
 
/*
 * 
 * 
/// # NB compile.c makes sure that the default except clause is last
/// except_clause: 'except' [test ['as' NAME]]
except_clause
 : EXCEPT ( test ( AS NAME )? )?
 ;
 
/// with_stmt: 'with' with_item (',' with_item)*  ':' stmt
with_stmt
 : WITH with_item ( ',' with_item )* ':' stmt
 ;

/// with_item: test ['as' expr]
with_item
 : test ( AS expr )?
 ;


/// test_nocond: or_test | lambdef_nocond
test_nocond
 : or_test 
 | lambdef_nocond
 ;

/// lambdef: 'lambda' [varargslist] ':' test
lambdef
 : LAMBDA varargslist? ':' test
 ;

/// lambdef_nocond: 'lambda' [varargslist] ':' test_nocond
lambdef_nocond
 : LAMBDA varargslist? ':' test_nocond
 ;

/// yield_stmt: yield_expr
yield_stmt
 : yield_expr
 ;

/// raise_stmt: 'raise' [test ['from' test]]
raise_stmt
 : RAISE ( test ( FROM test )? )?
 ;
 
/// dotted_name: NAME ('.' NAME)*
dotted_name
 : NAME ( '.' NAME )*
 ;

/// global_stmt: 'global' NAME (',' NAME)*
global_stmt
 : GLOBAL NAME ( ',' NAME )*
 ;

/// nonlocal_stmt: 'nonlocal' NAME (',' NAME)*
nonlocal_stmt
 : NONLOCAL NAME ( ',' NAME )*
 ;

/// assert_stmt: 'assert' test [',' test]
assert_stmt
 : ASSERT test ( ',' test )?
 ;
 
 */
 

 
 
 /*
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * NO PASAR
  * 
  */
  
 
 /*
  * 
  * 
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * DEFINICION DE TOKENS
  * 
  * 
  */
 
 
 comp_op
 : '<'
 | '>'
 | '=='
 | '>='
 | '<='
 | '<>'
 | '!='
 | IN
 | NOT IN
 | IS
 | IS NOT
 ;

/// integer        ::=  decimalinteger | octinteger | hexinteger | bininteger
integer
 : DECIMAL_INTEGER
 | OCT_INTEGER
 | HEX_INTEGER
 | BIN_INTEGER
 ;
  
/// decimalinteger ::=  nonzerodigit digit* | "0"+
DECIMAL_INTEGER
 : [-]? NON_ZERO_DIGIT DIGIT*
 | '0'+
 ;

/// octinteger     ::=  "0" ("o" | "O") octdigit+
OCT_INTEGER
 : '0' [oO] OCT_DIGIT+
 ;

/// hexinteger     ::=  "0" ("x" | "X") hexdigit+
HEX_INTEGER
 : '0' [xX] HEX_DIGIT+
 ;

/// bininteger     ::=  "0" ("b" | "B") bindigit+
BIN_INTEGER
 : '0' [bB] BIN_DIGIT+
 ;

/// floatnumber   ::=  pointfloat | exponentfloat
FLOAT_NUMBER
 : POINT_FLOAT
 | EXPONENT_FLOAT
 ;

/// imagnumber ::=  (floatnumber | intpart) ("j" | "J")
IMAG_NUMBER
 : ( FLOAT_NUMBER | INT_PART ) [jJ]
 ;

STRING
 : '\'' ( ~('\'') | '\\\''  )* '\''
 ;
 
 /// stringliteral   ::=  [stringprefix](shortstring | longstring)
/// stringprefix    ::=  "r" | "R"
STRING_LITERAL
 : [uU]? [rR]? ( SHORT_STRING | LONG_STRING )
 ;
 
 /// bytesliteral   ::=  bytesprefix(shortbytes | longbytes)
/// bytesprefix    ::=  "b" | "B" | "br" | "Br" | "bR" | "BR"
BYTES_LITERAL
 : [bB] [rR]? ( SHORT_BYTES | LONG_BYTES )
 ;
  
 
 /* 
 * fragments 
 */

/// shortstring     ::=  "'" shortstringitem* "'" | '"' shortstringitem* '"'
/// shortstringitem ::=  shortstringchar | stringescapeseq
/// shortstringchar ::=  <any source character except "\" or newline or the quote>
fragment SHORT_STRING
 : '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n'] )* '\''
 | '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n"] )* '"'
 ;

/// longstring      ::=  "'''" longstringitem* "'''" | '"""' longstringitem* '"""'
fragment LONG_STRING
 : '\'\'\'' LONG_STRING_ITEM*? '\'\'\''
 | '"""' LONG_STRING_ITEM*? '"""'
 ;

/// longstringitem  ::=  longstringchar | stringescapeseq
fragment LONG_STRING_ITEM
 : LONG_STRING_CHAR
 | STRING_ESCAPE_SEQ
 ;

/// longstringchar  ::=  <any source character except "\">
fragment LONG_STRING_CHAR
 : ~'\\'
 ;

/// stringescapeseq ::=  "\" <any source character>
fragment STRING_ESCAPE_SEQ
 : '\\' .
 ;

/// nonzerodigit   ::=  "1"..."9"
fragment NON_ZERO_DIGIT
 : [1-9]
 ;

/// digit          ::=  "0"..."9"
fragment DIGIT
 : [0-9]
 ;

/// octdigit       ::=  "0"..."7"
fragment OCT_DIGIT
 : [0-7]
 ;

/// hexdigit       ::=  digit | "a"..."f" | "A"..."F"
fragment HEX_DIGIT
 : [0-9a-fA-F]
 ;

/// bindigit       ::=  "0" | "1"
fragment BIN_DIGIT
 : [01]
 ;

/// pointfloat    ::=  [intpart] fraction | intpart "."
fragment POINT_FLOAT
 : INT_PART? FRACTION
 | INT_PART '.'
 ;

/// exponentfloat ::=  (intpart | pointfloat) exponent
fragment EXPONENT_FLOAT
 : ( INT_PART | POINT_FLOAT ) EXPONENT
 ;

/// intpart       ::=  digit+
fragment INT_PART
 : DIGIT+
 ;

/// fraction      ::=  "." digit+
fragment FRACTION
 : '.' DIGIT+
 ;

/// exponent      ::=  ("e" | "E") ["+" | "-"] digit+
fragment EXPONENT
 : [eE] [+-]? DIGIT+
 ;

/// shortbytes     ::=  "'" shortbytesitem* "'" | '"' shortbytesitem* '"'
/// shortbytesitem ::=  shortbyteschar | bytesescapeseq
fragment SHORT_BYTES
 : '\'' ( SHORT_BYTES_CHAR_NO_SINGLE_QUOTE | BYTES_ESCAPE_SEQ )* '\''
 | '"' ( SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE | BYTES_ESCAPE_SEQ )* '"'
 ;
    
/// longbytes      ::=  "'''" longbytesitem* "'''" | '"""' longbytesitem* '"""'
fragment LONG_BYTES
 : '\'\'\'' LONG_BYTES_ITEM*? '\'\'\''
 | '"""' LONG_BYTES_ITEM*? '"""'
 ;

/// longbytesitem  ::=  longbyteschar | bytesescapeseq
fragment LONG_BYTES_ITEM
 : LONG_BYTES_CHAR
 | BYTES_ESCAPE_SEQ
 ;

/// shortbyteschar ::=  <any ASCII character except "\" or newline or the quote>
fragment SHORT_BYTES_CHAR_NO_SINGLE_QUOTE
 : [\u0000-\u0009]
 | [\u000B-\u000C]
 | [\u000E-\u0026]
 | [\u0028-\u005B]
 | [\u005D-\u007F]
 ; 

fragment SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE
 : [\u0000-\u0009]
 | [\u000B-\u000C]
 | [\u000E-\u0021]
 | [\u0023-\u005B]
 | [\u005D-\u007F]
 ; 

/// longbyteschar  ::=  <any ASCII character except "\">
fragment LONG_BYTES_CHAR
 : [\u0000-\u005B]
 | [\u005D-\u007F]
 ;

/// bytesescapeseq ::=  "\" <any ASCII character>
fragment BYTES_ESCAPE_SEQ
 : '\\' [\u0000-\u007F]
 ;


  
/*
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * 
 */

DOT : '.';
ELLIPSIS : '...';
STAR : '*';
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
COMMA : ',';
COLON : ':';
SEMI_COLON : ';';
POWER : '**';
ASSIGN : '=';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
OR_OP : '|';
XOR : '^';
AND_OP : '&';
LEFT_SHIFT : '<<';
RIGHT_SHIFT : '>>';
ADD : '+';
MINUS : '-';
DIV : '/';
MOD : '%';
IDIV : '//';
NOT_OP : '~';






MATCH : 'match';
CASE : 'case';
GENERATE : 'generate' ;
PARTITION : 'partition';
FILTER : 'filter';










AT : '@';
ARROW : '->';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MULT_ASSIGN : '*=';
AT_ASSIGN : '@=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
LEFT_SHIFT_ASSIGN : '<<=';
RIGHT_SHIFT_ASSIGN : '>>=';
POWER_ASSIGN : '**=';
IDIV_ASSIGN : '//=';
DEF : 'def';
RETURN : 'return';
RAISE : 'raise';
FROM : 'from';
IMPORT : 'import';
AS : 'as';
GLOBAL : 'global';
NONLOCAL : 'nonlocal';
ASSERT : 'assert';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
TRY : 'try';
FINALLY : 'finally';
WITH : 'with';
EXCEPT : 'except';
LAMBDA : 'lambda';
OR : 'or';
AND : 'and';
NOT : 'not';
IS : 'is';
NONE : 'None';
TRUE : 'True';
FALSE : 'False';
CLASS : 'class';
YIELD : 'yield';
DEL : 'del';
PASS : 'pass';
CONTINUE : 'continue';
BREAK : 'break';

/*
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * PALABRAS RESERVADAS DEL SISTEMA
 * 
 */


NAME
 : ID_START ID_CONTINUE*
 ;
 
SKIP
 : ( SPACES | COMMENT | CARRYS | EOFS) -> skip
 ;

UNKNOWN_CHAR
 : .
 ;

fragment SPACES
 : [ \t]+
 ;

fragment COMMENT
 : '#' ~[\r\n]*
 ;

fragment CARRYS
 : [\r\n]
 ;

fragment EOFS
 : '<EOF>'
 ;

fragment ID_START
 : '_'
 | [A-Z]
 | [a-z]
 ;
 
fragment ID_CONTINUE
 : ID_START
 | [0-9]
 ;


