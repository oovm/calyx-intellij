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
  // "comb"
  public static boolean COMB(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMB")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMB, "<comb>");
    r = consumeToken(b, "comb");
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // top_stat*
  static boolean Futil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Futil")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_stat(b, l + 1)) break;
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
  // "seq" | "par"
  public static boolean SEQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SEQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQ, "<seq>");
    r = consumeToken(b, "seq");
    if (!r) r = consumeToken(b, "par");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "while"
  public static boolean WHILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHILE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE, "<while>");
    r = consumeToken(b, "while");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "with"
  public static boolean WITH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WITH")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH, "<with>");
    r = consumeToken(b, "with");
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
  // AT SYMBOL?
  public static boolean annotation_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_mark")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && annotation_mark_1(b, l + 1);
    exit_section_(b, m, ANNOTATION_MARK, r);
    return r;
  }

  // SYMBOL?
  private static boolean annotation_mark_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_mark_1")) return false;
    consumeToken(b, SYMBOL);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L <<param>>* BRACE_R
  public static boolean brace(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "brace")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && brace_1(b, l + 1, _param);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, BRACE, r);
    return r;
  }

  // <<param>>*
  private static boolean brace_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "brace_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!_param.parse(b, l)) break;
      if (!empty_element_parsed_guard_(b, "brace_1", c)) break;
    }
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
  // COMB GROUP identifier <<brace inner_stat>>
  public static boolean comb_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comb_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMB_STATEMENT, "<comb statement>");
    r = COMB(b, l + 1);
    r = r && GROUP(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_stat);
    exit_section_(b, l, m, r, false, null);
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
  // COMPONENT component_name component_target <<brace inner_stat>>
  public static boolean component_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_STATEMENT, "<component statement>");
    r = COMPONENT(b, l + 1);
    r = r && component_name(b, l + 1);
    r = r && component_target(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_stat);
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
  // GROUP identifier <<brace inner_stat>>
  public static boolean group_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_STATEMENT, "<group statement>");
    r = GROUP(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_stat);
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
  // seq_stat
  //   | annotation? expression SEMICOLON
  static boolean inner_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_stat")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = seq_stat(b, l + 1);
    if (!r) r = inner_stat_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation? expression SEMICOLON
  private static boolean inner_stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inner_stat_1_0(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation?
  private static boolean inner_stat_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_stat_1_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // namespace slice?
  public static boolean lhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lhs")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace(b, l + 1);
    r = r && lhs_1(b, l + 1);
    exit_section_(b, m, LHS, r);
    return r;
  }

  // slice?
  private static boolean lhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lhs_1")) return false;
    slice(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && namespace_1(b, l + 1);
    exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  // (DOT identifier)*
  private static boolean namespace_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespace_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean namespace_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier <<brace inner_stat>>
  public static boolean normal_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normal_statement")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_stat);
    exit_section_(b, m, NORMAL_STATEMENT, r);
    return r;
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
  // value [QUESTION value]
  public static boolean rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs")) return false;
    if (!nextTokenIs(b, "<rhs>", NUMBER, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    r = value(b, l + 1);
    r = r && rhs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [QUESTION value]
  private static boolean rhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_1")) return false;
    rhs_1_0(b, l + 1);
    return true;
  }

  // QUESTION value
  private static boolean rhs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUESTION);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // group_statement
  //   | comb_statement
  //   | seq_statement
  //   | while_statement
  //   | normal_statement
  //   | identifier SEMICOLON
  static boolean seq_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seq_stat")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = group_statement(b, l + 1);
    if (!r) r = comb_statement(b, l + 1);
    if (!r) r = seq_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = normal_statement(b, l + 1);
    if (!r) r = seq_stat_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier SEMICOLON
  private static boolean seq_stat_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seq_stat_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SEQ <<brace seq_stat>>
  public static boolean seq_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "seq_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQ_STATEMENT, "<seq statement>");
    r = SEQ(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::seq_stat);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<bracket identifier COMMA>>
  public static boolean slice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bracket(b, l + 1, FutilParser::identifier, COMMA_parser_);
    exit_section_(b, m, SLICE, r);
    return r;
  }

  /* ********************************************************** */
  // import_statement SEMICOLON
  //   | component_statement
  static boolean top_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_stat")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = top_stat_0(b, l + 1);
    if (!r) r = component_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // import_statement SEMICOLON
  private static boolean top_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_statement(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // call | namespace | NUMBER BITS?
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "<value>", NUMBER, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = call(b, l + 1);
    if (!r) r = namespace(b, l + 1);
    if (!r) r = value_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NUMBER BITS?
  private static boolean value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && value_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BITS?
  private static boolean value_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2_1")) return false;
    consumeToken(b, BITS);
    return true;
  }

  /* ********************************************************** */
  // WHILE namespace [WITH identifier] <<brace inner_stat>>
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, "<while statement>");
    r = WHILE(b, l + 1);
    r = r && namespace(b, l + 1);
    r = r && while_statement_2(b, l + 1);
    r = r && brace(b, l + 1, FutilParser::inner_stat);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [WITH identifier]
  private static boolean while_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_2")) return false;
    while_statement_2_0(b, l + 1);
    return true;
  }

  // WITH identifier
  private static boolean while_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WITH(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  static final Parser COMMA_parser_ = (b, l) -> consumeToken(b, COMMA);
  static final Parser SEMICOLON_parser_ = (b, l) -> consumeToken(b, SEMICOLON);
}
