
# Scoop Language
A small language I made for university. Uses stricter typing than python and is focussed on functions (referred to as SCOPEs). There are a couple of programs in the input folder of the project and more examples are welcome to be merged.
## Variable Declarations
Variables declarations and assignments are statically typed at assignment. This means that once a variable is assigned a value in its scope it cannot be assigned a value of a different type. Variables are declared in the scope in which the compiler is currently at. The ` := ` symbol is used for variable assignment and must be surrounded with a space on either side.
## Variable Operations
Variables can be directly operated on with any of the valid operations in Scoop. This is done by specifying the label of the variable to operate on and a = preceeded by the operator.
e.g. thisVar ^= 2 brings thisVar to the power of two.
## Expressions
Expressions in Scoop are defined in reverse polish notation. Non-operator tokens (excluding the first one) are preceded by a comma. Expressions are validity checked at compile-time. Below are some examples:

    a,2+
    a,v+,2*
    3,4,2*,1,5-,2,3^^/+

## Loops
Scoop supports both bounded and unbounded loops. A loop is keyworded by the word `ITERATE`, a space, a numeric variable assignment or an existing variable, a comma, a Boolean statement, a comma, and an optional assignment. Below are some examples:

    ITERATE a := 0,a<10,a := a,1+
    ITERATE a,a<10,a := a,1+
    ITERATE a,a<10

## Scoping
Variables are accessible at proper scopes through the use of a stack of scopes that contain variable assignments.
## Functions
Functions are implemented as a type of scope. The `SCOPE` keyword is used to move from a global to a function scope (it cannot be used while in the scope of another function). The `SCOPE` keyword should be followed by a space, a label for the scope that can be called by putting parameters inbetween braces and then putting the label of the function, a list of comma separated input parameters(a label and a non-void data type) surrounded by braces, and the return type. Below are some examples:

    SCOPE entryPoint{} VOID
    SCOPE we{b INTEGER,c STRING} STRING

And running examples for the above:

    {}entryPoint
    {a;”value”}we

## Types
The valid data types are as follows:
- DECIMAL
- INTEGER
- BOOLEAN
- STRING

Strings are limited to letters, numbers, spaces, and periods.
There is a return type known as `VOID` to mark methods that do not return anything.
## Comments
Commenting is possible in Scoop. A comment is any text surrounded by pairs of hyphens. Comments are ignored at compile-time.

    --  This is 1 example of a comment --

## Control Flow
If statements, else if statements, and else (otherwise) statements are available in Scoop. They support complex Boolean logic as conditions.

    IF a=={2}someFunc THEN
           a := "a"
    ELSE IF a=="g" OR a!=”c” THEN
           a := "b"
    OTHERWISE
           a := “c”
    DONE

There are also `SAFE` blocks. Safe blocks will not terminate the program in the event of a runtime error but will instead perform the actions in the `ONFAIL` block.
## Recursion
Recursion is possible in scoop by calling a `RUN` action on a method from within the method. The compiled python is limited to the python interpreter’s configured recursion limit (1000 calls by default usually).
## Error handling
The compiler detects type errors in assignments, calculations, operations, Boolean expressions, function calls, return statements etc. Other logical (non-type) errors are also handled properly within the compiler.
## Operators
The operators supported are:
- Addition(+)
- Subtraction(-)
- Division(/)
- Multiplication(*)
- Modulo(%)
- Power(^)
## Compiler
The compiler for Scoop works by building an intermediary model of the language code provided, and then parses this model into valid Python. If an entry point function is defined, it will insert a call to it automatically so that it will start with this function, much like the main method in Java.
## Non-Tab-Delimited
Unlike in Python, Scoop is not tab delimited. It is instead scoped by keywords as defined in the scoping section.
