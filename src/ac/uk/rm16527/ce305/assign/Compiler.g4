grammar Compiler;

ADD: '+';
SUB: '-';
DIV: '/';
MUL: '*';
MOD: '%';
POW: '^';
POINT : '.';
EQ: ' := ';
LESSEQ: '<=';
LESS: '<';
GREATEREQ: '>=';
GREATER: '>';
SAME: '==';
NOTSAME: '!=';
OR: ' OR ';
AND: ' AND ';
QUOTE: '"';
LOFPARAM: '{'; /* Left bracket of parmeters in scope (and running of scopes) */
ROFPARAM: '}'; /* Right bracket of parmeters in scope (and running of scopes) */
TRUE: 'TRUE';
FALSE: 'FALSE';
TYPES: ('INTEGER'|'DECIMAL'|'STRING'|'BOOLEAN'); /* Data types that are not void */
VOID: 'VOID'; /* Nil return type */
OTHERWISE: 'OTHERWISE';
SAFE: 'SAFE';
DESCOPE: 'DONE'; /* Scope terminator, a keyword action */
NUMBER : [0-9]+;
UPPER: [A-Z]+;
LOWER: [a-z]+;
WS: [ \t\r\n] + -> skip;

/* Visitor entry-point for building application */
start: (assign|operatorAssign|scope|iterate|run|print|result|ifStatement|elif|elseStatement|safe|onFail|comment|done)+;

/* Actions for start to run */
assign: label EQ returnable; /* Assigning reals to VAR labels */
operatorAssign: label' 'operator'= 'returnable; /* Operates on existingly assigned variables */
scope: 'SCOPE 'label LOFPARAM parameters ROFPARAM ' 'allTypes; /* Defines functions known as Scopes */
iterate: 'ITERATE ' (assign|label) ',' (booleanStatement) (',' assign)?; /* Functions as either while or for loop */
run: LOFPARAM (returnable (';' returnable)*)? ROFPARAM label; /* Runs SCOPE functions*/
print: 'print 'returnable?; /* Print any returnable */
result: 'RESULT'(' 'returnable)?; /* Return any returnable from the current function SCOPE */
ifStatement: 'IF 'booleanStatement' THEN'; /* If statement */
elif: 'ELSE 'ifStatement; /* Else if statement */
elseStatement: OTHERWISE; /* Else statement */
safe: SAFE; /* Start of try catch block equivalent (try) */
onFail: 'ONFAIL'; /* catch equivalent */
comment:' '*'--'(stringValidContent)*'--'; /* Comments */
done: DESCOPE; /* Ends scopes of if, else if, else, scopes, and safe */


/* Rule groups and types */
boolJoiner: (OR|AND);
boolOperator: (NOTSAME|SAME|LESSEQ|LESS|GREATEREQ|GREATER);
boolVariable: (TRUE|FALSE);
allTypes: (TYPES|VOID); /* All data type names including no data */
operator: (ADD|SUB|DIV|MUL|MOD|POW); /* Any mathematical operators */
label: LOWER (LOWER|UPPER|NUMBER)*; /* Label format for scopes and variables */
real : (SUB)?NUMBER (POINT NUMBER)?; /* Numbers, be they decimal or integer */
string: STRING;
stringValidContent: (' '|UPPER|LOWER|NUMBER|'.');
value: (real|label); /* Something that comes out as a real */
calc: (value|run) ((','(value|run))|operator)*; /* Reverse Polish Notation calculation, every value after first is preceeded by a comma. operators never are. */
returnable: (value|run|calc|string); /* Non-void actual data or things that produce it */
parameters: (label' 'TYPES(','label' 'TYPES)*)?; /* Format for scope signature paramater declarations */
booleanStatement: boolGroups (boolJoiner boolGroups)*;
boolGroups: (boolVariable|label|(returnable boolOperator returnable));

STRING : '"' ( '\\"' | . )*? '"' ;
COMMENT : '--' .? '--' -> skip ; /* .? matches anything until the first */