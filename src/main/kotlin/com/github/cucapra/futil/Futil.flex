package com.github.cucapra.futil;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.cucapra.futil.psi.FutilTypes.*;

%%

%{
  public _FutilLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _FutilLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT=("//"|#)[^\r\n]*
BLOCK_COMMENT=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
BOOLEAN=true|false
SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
STRING=\"([^\"\\]|\\.)*\"
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=[0-9]+\.[0-9]+([eE][+-][0-9]+)?
SIGN=[+-]
BACK_TOP=[-][-][-]+
NON_ESCAPE=[^\\]

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "@include"           { return INCLUDE; }
  "@inherit"           { return INHERIT; }
  "@import"            { return IMPORT; }
  "@export"            { return EXPORT; }
  "as"                 { return AS; }
  "null"               { return NULL; }
  "("                  { return PARENTHESIS_L; }
  ")"                  { return PARENTHESIS_R; }
  "["                  { return BRACKET_L; }
  "]"                  { return BRACKET_R; }
  "{"                  { return BRACE_L; }
  "}"                  { return BRACE_R; }
  "^"                  { return ACCENT; }
  "<"                  { return ANGLE_L; }
  ">"                  { return ANGLE_R; }
  "\""                 { return QUOTATION; }
  "\\"                 { return ESCAPE; }
  "="                  { return EQ; }
  "nan"                { return NAN; }
  ":"                  { return COLON; }
  ";"                  { return SEMICOLON; }
  ","                  { return COMMA; }
  "$"                  { return CITE; }
  "."                  { return DOT; }
  "*"                  { return STAR; }
  "@"                  { return AT; }
  "DECIMAL_BAD"        { return DECIMAL_BAD; }

  {COMMENT}            { return COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {BOOLEAN}            { return BOOLEAN; }
  {SYMBOL}             { return SYMBOL; }
  {STRING}             { return STRING; }
  {BYTE}               { return BYTE; }
  {INTEGER}            { return INTEGER; }
  {DECIMAL}            { return DECIMAL; }
  {SIGN}               { return SIGN; }
  {BACK_TOP}           { return BACK_TOP; }
  {NON_ESCAPE}         { return NON_ESCAPE; }

}

[^] { return BAD_CHARACTER; }
