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
  // statement*
  static boolean Futil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Futil")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
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
    r = key_symbol(b, l + 1);
    r = r && consumeToken(b, EQ);
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
  // annotation_mark <<paired anno_inner>>
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_mark(b, l + 1);
    r = r && paired(b, l + 1, FutilParser::anno_inner);
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
  // BRACKET_L <<param>> (<<sep>> <<param>>)* BRACKET_R
  public static boolean brackets(PsiBuilder b, int l, Parser _param, Parser _sep) {
    if (!recursion_guard_(b, l, "brackets")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && _param.parse(b, l);
    r = r && brackets_2(b, l + 1, _sep, _param);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, BRACKETS, r);
    return r;
  }

  // (<<sep>> <<param>>)*
  private static boolean brackets_2(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "brackets_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!brackets_2_0(b, l + 1, _sep, _param)) break;
      if (!empty_element_parsed_guard_(b, "brackets_2", c)) break;
    }
    return true;
  }

  // <<sep>> <<param>>
  private static boolean brackets_2_0(PsiBuilder b, int l, Parser _sep, Parser _param) {
    if (!recursion_guard_(b, l, "brackets_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _sep.parse(b, l);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
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
  // COMPONENT insert_dot string_inline
  public static boolean component_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_STATEMENT, "<component statement>");
    r = COMPONENT(b, l + 1);
    r = r && insert_dot(b, l + 1);
    r = r && string_inline(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EQ | COLON
  static boolean eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq")) return false;
    if (!nextTokenIs(b, "", COLON, EQ)) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
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
  // GROUP identifier <<brackets statement SEMICOLON>>
  public static boolean group_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_STATEMENT, "<group statement>");
    r = GROUP(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && brackets(b, l + 1, FutilParser::statement, SEMICOLON_parser_);
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
  // IMPORT string_inline
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, "<import statement>");
    r = IMPORT(b, l + 1);
    r = r && string_inline(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOT
  public static boolean insert_dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_dot")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    exit_section_(b, m, INSERT_DOT, r);
    return r;
  }

  /* ********************************************************** */
  // insert_star value
  public static boolean insert_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_item")) return false;
    if (!nextTokenIs(b, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = insert_star(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, INSERT_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // [insert_dot] pair
  public static boolean insert_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_PAIR, "<insert pair>");
    r = insert_pair_0(b, l + 1);
    r = r && pair(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [insert_dot]
  private static boolean insert_pair_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_pair_0")) return false;
    insert_dot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STAR
  public static boolean insert_star(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_star")) return false;
    if (!nextTokenIs(b, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    exit_section_(b, m, INSERT_STAR, r);
    return r;
  }

  /* ********************************************************** */
  // string_inline | key_symbol | INTEGER
  static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    r = string_inline(b, l + 1);
    if (!r) r = key_symbol(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean key_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_symbol")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, KEY_SYMBOL, r);
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
  // identifier <<brackets statement SEMICOLON>>
  public static boolean normal_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "normal_statement")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && brackets(b, l + 1, FutilParser::statement, SEMICOLON_parser_);
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
    number_suffix(b, l + 1);
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
  // SYMBOL
  public static boolean number_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_suffix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, NUMBER_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // symbol_path eq value
  public static boolean pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
    r = symbol_path(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  //   | BRACKET_L <<param>> BRACKET_R
  //   | BRACE_L <<param>> BRACE_R
  static boolean paired(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = paired_0(b, l + 1, _param);
    if (!r) r = paired_1(b, l + 1, _param);
    if (!r) r = paired_2(b, l + 1, _param);
    exit_section_(b, m, null, r);
    return r;
  }

  // PARENTHESIS_L <<param>> PARENTHESIS_R
  private static boolean paired_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACKET_L <<param>> BRACKET_R
  private static boolean paired_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // BRACE_L <<param>> BRACE_R
  private static boolean paired_2(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "paired_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CITE symbol_path
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, CITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CITE);
    r = r && symbol_path(b, l + 1);
    exit_section_(b, m, REF, r);
    return r;
  }

  /* ********************************************************** */
  // import_statement
  //   | component_statement
  //   | group_statement
  //   | normal_statement
  //   | SEMICOLON
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = import_statement(b, l + 1);
    if (!r) r = component_statement(b, l + 1);
    if (!r) r = group_statement(b, l + 1);
    if (!r) r = normal_statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
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
    string_prefix(b, l + 1);
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
  // SYMBOL
  public static boolean string_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_prefix")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, STRING_PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // key (DOT key)*
  public static boolean symbol_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_PATH, "<symbol path>");
    r = key(b, l + 1);
    r = r && symbol_path_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT key)*
  private static boolean symbol_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_path_1", c)) break;
    }
    return true;
  }

  // DOT key
  private static boolean symbol_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && key(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [type_hint] <<paired table_inner>>
  public static boolean table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    r = table_0(b, l + 1);
    r = r && paired(b, l + 1, FutilParser::table_inner);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_hint]
  private static boolean table_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_0")) return false;
    type_hint(b, l + 1);
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
    r = pair(b, l + 1);
    if (!r) r = value(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, TYPE_HINT, r);
    return r;
  }

  /* ********************************************************** */
  // NULL | BOOLEAN | num | ref | str | table | annotation
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = num(b, l + 1);
    if (!r) r = ref(b, l + 1);
    if (!r) r = str(b, l + 1);
    if (!r) r = table(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser SEMICOLON_parser_ = (b, l) -> consumeToken(b, SEMICOLON);
}
