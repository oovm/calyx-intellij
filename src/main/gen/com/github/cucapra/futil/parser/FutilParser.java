// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.cucapra.futil.psi.FutilTypes.*;
import static com.github.cucapra.futil.psi.FutilParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FutilParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Futil(b, l + 1);
  }

  /* ********************************************************** */
  // "component"
  public static boolean COMPONENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMPONENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT, "<component>");
    r = consumeToken(b, "component");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // top_statement*
  static boolean Futil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Futil")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Futil", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "group"
  public static boolean GROUP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GROUP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP, "<group>");
    r = consumeToken(b, "group");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "import"
  public static boolean IMPORT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IMPORT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT, "<import>");
    r = consumeToken(b, "import");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ANGLE_L [<<param>> (<<sep>> <<param>>)* [<<sep>>]] ANGLE_R
  public static boolean angle(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "angle")) return false;
    if (!nextTokenIs(b, ANGLE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANGLE_L);
    r = r && angle_1(b, l + 1, _param, _sep);
    r = r && consumeToken(b, ANGLE_R);
    exit_section_(b, m, ANGLE, r);
    return r;
  }

  // [<<param>> (<<sep>> <<param>>)* [<<sep>>]]
  private static boolean angle_1(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "angle_1")) return false;
    angle_1_0(b, l + 1, _param, _sep);
    return true;
  }

  // <<param>> (<<sep>> <<param>>)* [<<sep>>]
  private static boolean angle_1_0(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "angle_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && angle_1_0_1(b, l + 1, _sep, _param);
    r = r && angle_1_0_2(b, l + 1, _sep);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<sep>> <<param>>)*
  private static boolean angle_1_0_1(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "angle_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!angle_1_0_1_0(b, l + 1, _sep, _param)) break;
      if (!empty_element_parsed_guard_(b, "angle_1_0_1", c)) break;
    }
    return true;
  }

  // <<sep>> <<param>>
  private static boolean angle_1_0_1_0(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "angle_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _sep.parse(b, l);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<sep>>]
  private static boolean angle_1_0_2(PsiBuilder b, int l, Parser _sep) {
    if (!recursion_guard_(b, l, "angle_1_0_2")) return false;
    _sep.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // [anno_item (COMMA anno_item)* [COMMA]]
  static boolean anno_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_inner")) return false;
    anno_inner_0(b, l + 1);
    return true;
  }

  // anno_item (COMMA anno_item)* [COMMA]
  private static boolean anno_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = anno_item(b, l + 1);
    r = r && anno_inner_0_1(b, l + 1);
    r = r && anno_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA anno_item)*
  private static boolean anno_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!anno_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "anno_inner_0_1", c)) break;
    }
    return true;
  }

  // COMMA anno_item
  private static boolean anno_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && anno_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean anno_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // key_symbol EQ anno_value | anno_value
  static boolean anno_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = anno_item_0(b, l + 1);
    if (!r) r = anno_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // key_symbol EQ anno_value
  private static boolean anno_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY_SYMBOL, EQ);
    r = r && anno_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // value | identi
  static boolean anno_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anno_value")) return false;
    boolean r;
    r = value(b, l + 1);
    if (!r) r = consumeToken(b, IDENTI);
    return r;
  }

  /* ********************************************************** */
  // annotation_mark
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_mark(b, l + 1);
    exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // AT SYMBOL
  public static boolean annotation_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_mark")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, SYMBOL);
    exit_section_(b, m, ANNOTATION_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L [<<param>> (<<sep>> <<param>>)* [<<sep>>]] BRACE_R
  public static boolean brace(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "brace")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && brace_1(b, l + 1, _param, _sep);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, BRACE, r);
    return r;
  }

  // [<<param>> (<<sep>> <<param>>)* [<<sep>>]]
  private static boolean brace_1(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "brace_1")) return false;
    brace_1_0(b, l + 1, _param, _sep);
    return true;
  }

  // <<param>> (<<sep>> <<param>>)* [<<sep>>]
  private static boolean brace_1_0(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "brace_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && brace_1_0_1(b, l + 1, _sep, _param);
    r = r && brace_1_0_2(b, l + 1, _sep);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<sep>> <<param>>)*
  private static boolean brace_1_0_1(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "brace_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!brace_1_0_1_0(b, l + 1, _sep, _param)) break;
      if (!empty_element_parsed_guard_(b, "brace_1_0_1", c)) break;
    }
    return true;
  }

  // <<sep>> <<param>>
  private static boolean brace_1_0_1_0(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "brace_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _sep.parse(b, l);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<sep>>]
  private static boolean brace_1_0_2(PsiBuilder b, int l, Parser _sep) {
    if (!recursion_guard_(b, l, "brace_1_0_2")) return false;
    _sep.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // BRACKET_L [<<param>> (<<sep>> <<param>>)* [<<sep>>]] BRACKET_R
  public static boolean bracket(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "bracket")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && bracket_1(b, l + 1, _param, _sep);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, BRACKET, r);
    return r;
  }

  // [<<param>> (<<sep>> <<param>>)* [<<sep>>]]
  private static boolean bracket_1(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "bracket_1")) return false;
    bracket_1_0(b, l + 1, _param, _sep);
    return true;
  }

  // <<param>> (<<sep>> <<param>>)* [<<sep>>]
  private static boolean bracket_1_0(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "bracket_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && bracket_1_0_1(b, l + 1, _sep, _param);
    r = r && bracket_1_0_2(b, l + 1, _sep);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<sep>> <<param>>)*
  private static boolean bracket_1_0_1(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "bracket_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bracket_1_0_1_0(b, l + 1, _sep, _param)) break;
      if (!empty_element_parsed_guard_(b, "bracket_1_0_1", c)) break;
    }
    return true;
  }

  // <<sep>> <<param>>
  private static boolean bracket_1_0_1_0(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "bracket_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _sep.parse(b, l);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<sep>>]
  private static boolean bracket_1_0_2(PsiBuilder b, int l, Parser _sep) {
    if (!recursion_guard_(b, l, "bracket_1_0_2")) return false;
    _sep.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // identifier <<parenthesis rhs COMMA>>
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && parenthesis(b, l + 1, FutilParser::rhs, COMMA_parser_);
    exit_section_(b, m, CALL, r);
    return r;
  }

  /* ********************************************************** */
  // escaped | NON_ESCAPE
  static boolean char_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_$")) return false;
    if (!nextTokenIs(b, "", ESCAPE, NON_ESCAPE)) return false;
    boolean r;
    r = escaped(b, l + 1);
    if (!r) r = consumeToken(b, NON_ESCAPE);
    return r;
  }

  /* ********************************************************** */
  // identifier <<parenthesis identifier SEMICOLON>>
  public static boolean component_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_name")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && parenthesis(b, l + 1, FutilParser::identifier, SEMICOLON_parser_);
    exit_section_(b, m, COMPONENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // COMPONENT component_name component_target <<brace inner_statement SEMICOLON>>
  public static boolean component_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_STATEMENT, "<component statement>");
    r = COMPONENT(b, l + 1);
    r = r && component_name(b, l + 1);
    r = r && component_target(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_statement, SEMICOLON_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TO <<parenthesis identifier SEMICOLON>>
  public static boolean component_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_target")) return false;
    if (!nextTokenIs(b, TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && parenthesis(b, l + 1, FutilParser::identifier, SEMICOLON_parser_);
    exit_section_(b, m, COMPONENT_TARGET, r);
    return r;
  }

  /* ********************************************************** */
  // ESCAPE (ESCAPE|NON_ESCAPE)
  public static boolean escaped(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ESCAPE);
    r = r && escaped_1(b, l + 1);
    exit_section_(b, m, ESCAPED, r);
    return r;
  }

  // ESCAPE|NON_ESCAPE
  private static boolean escaped_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped_1")) return false;
    boolean r;
    r = consumeToken(b, ESCAPE);
    if (!r) r = consumeToken(b, NON_ESCAPE);
    return r;
  }

  /* ********************************************************** */
  // lhs EQ rhs
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lhs(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && rhs(b, l + 1);
    exit_section_(b, m, EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP identifier <<brace inner_statement SEMICOLON>>
  public static boolean group_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_STATEMENT, "<group statement>");
    r = GROUP(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_statement, SEMICOLON_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT STRING
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, "<import statement>");
    r = IMPORT(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // group_statement
  //   | normal_statement
  //   | annotation? expression
  static boolean inner_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = group_statement(b, l + 1);
    if (!r) r = normal_statement(b, l + 1);
    if (!r) r = inner_statement_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation? expression
  private static boolean inner_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inner_statement_2_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation?
  private static boolean inner_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_statement_2_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // namesapce
  public static boolean lhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lhs")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namesapce(b, l + 1);
    exit_section_(b, m, LHS, r);
    return r;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean namesapce(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namesapce")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && namesapce_1(b, l + 1);
    exit_section_(b, m, NAMESAPCE, r);
    return r;
  }

  // (DOT identifier)*
  private static boolean namesapce_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namesapce_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namesapce_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namesapce_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean namesapce_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namesapce_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier <<brace inner_statement SEMICOLON>>
  public static boolean normal_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normal_statement")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_statement, SEMICOLON_parser_);
    exit_section_(b, m, NORMAL_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL | DECIMAL_BAD) [number_suffix] | [SIGN] BYTE
  static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL | DECIMAL_BAD) [number_suffix]
  private static boolean num_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    r = r && num_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // INTEGER | DECIMAL | DECIMAL_BAD
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    if (!r) r = consumeToken(b, DECIMAL_BAD);
    return r;
  }

  // [number_suffix]
  private static boolean num_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_2")) return false;
    consumeToken(b, NUMBER_SUFFIX);
    return true;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && consumeToken(b, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  /* ********************************************************** */
  // PARENTHESIS_L [<<param>> (<<sep>> <<param>>)* [<<sep>>]] PARENTHESIS_R
  public static boolean parenthesis(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "parenthesis")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && parenthesis_1(b, l + 1, _param, _sep);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, PARENTHESIS, r);
    return r;
  }

  // [<<param>> (<<sep>> <<param>>)* [<<sep>>]]
  private static boolean parenthesis_1(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "parenthesis_1")) return false;
    parenthesis_1_0(b, l + 1, _param, _sep);
    return true;
  }

  // <<param>> (<<sep>> <<param>>)* [<<sep>>]
  private static boolean parenthesis_1_0(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "parenthesis_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && parenthesis_1_0_1(b, l + 1, _sep, _param);
    r = r && parenthesis_1_0_2(b, l + 1, _sep);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<sep>> <<param>>)*
  private static boolean parenthesis_1_0_1(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parenthesis_1_0_1_0(b, l + 1, _sep, _param)) break;
      if (!empty_element_parsed_guard_(b, "parenthesis_1_0_1", c)) break;
    }
    return true;
  }

  // <<sep>> <<param>>
  private static boolean parenthesis_1_0_1_0(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _sep.parse(b, l);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<sep>>]
  private static boolean parenthesis_1_0_2(PsiBuilder b, int l, Parser _sep) {
    if (!recursion_guard_(b, l, "parenthesis_1_0_2")) return false;
    _sep.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // CITE symbol_path
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, CITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CITE, SYMBOL_PATH);
    exit_section_(b, m, REF, r);
    return r;
  }

  /* ********************************************************** */
  // call | value | num
  public static boolean rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    r = call(b, l + 1);
    if (!r) r = value(b, l + 1);
    if (!r) r = num(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [string_prefix] (string_inline|string_multi)
  static boolean str(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "str")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = str_0(b, l + 1);
    r = r && str_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [string_prefix]
  private static boolean str_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "str_0")) return false;
    consumeToken(b, STRING_PREFIX);
    return true;
  }

  // string_inline|string_multi
  private static boolean str_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "str_1")) return false;
    boolean r;
    r = string_inline(b, l + 1);
    if (!r) r = string_multi(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean string_inline(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_inline")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, STRING_INLINE, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTATION char* QUOTATION
  public static boolean string_multi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_multi")) return false;
    if (!nextTokenIs(b, QUOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTATION);
    r = r && string_multi_1(b, l + 1);
    r = r && consumeToken(b, QUOTATION);
    exit_section_(b, m, STRING_MULTI, r);
    return r;
  }

  // char*
  private static boolean string_multi_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_multi_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!char_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_multi_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [type_hint]
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    consumeToken(b, TYPE_HINT);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [table_item ([COMMA] table_item)* [COMMA]]
  static boolean table_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner")) return false;
    table_inner_0(b, l + 1);
    return true;
  }

  // table_item ([COMMA] table_item)* [COMMA]
  private static boolean table_inner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_item(b, l + 1);
    r = r && table_inner_0_1(b, l + 1);
    r = r && table_inner_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ([COMMA] table_item)*
  private static boolean table_inner_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!table_inner_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_inner_0_1", c)) break;
    }
    return true;
  }

  // [COMMA] table_item
  private static boolean table_inner_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_inner_0_1_0_0(b, l + 1);
    r = r && table_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean table_inner_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // [COMMA]
  private static boolean table_inner_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_inner_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // pair | value
  static boolean table_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_item")) return false;
    boolean r;
    r = consumeToken(b, PAIR);
    if (!r) r = value(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // import_statement
  //   | component_statement
  //   | SEMICOLON
  static boolean top_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_statement")) return false;
    boolean r;
    r = import_statement(b, l + 1);
    if (!r) r = component_statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // NULL | BOOLEAN
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "<value>", BOOLEAN, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BOOLEAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
  static final Parser SEMICOLON_parser_ = (b, l) -> consumeToken(b, SEMICOLON);
}
