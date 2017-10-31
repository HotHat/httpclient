grammar HttpClient;

@header {
package com.lyhux.syntax.httpclient;
}


// exp : keyword exp2 NEWLINE exp
//    | NEWLINE exp
start : expr EOF ;
expr : block expr
    | sign expr
    |
    ;

block : blockKeyword '{' body* '}';

sign  : signKeyword '=' STRING;

body : pair
     | block
     | sign
     ;


signKeyword : 'method'
             | 'url'
             | 'out'
             ;


blockKeyword : 'param'
        | 'header'
        | 'cookie'
        | 'body'
        | 'form-data'
        | 'form-urlencoded'
        | 'task'
        | 'raw'
        ;
pair : KEY ':' STRING ;

KEY : [a-zA-Z0-9_-]+ ;

STRING : '@'?'"' (ESC | ~["\\])* '"'  ;
fragment ESC     : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

// NEWLINE:'\r'? '\n';

WS : [ \t\n\r]+ -> skip;

COMMENT : '//' .*? '\r'? '\n' -> skip;
