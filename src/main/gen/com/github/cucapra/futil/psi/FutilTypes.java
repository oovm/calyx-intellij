// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.cucapra.futil.psi.impl.*;

public interface FutilTypes {

  IElementType ANNOTATION = new FutilElementType("ANNOTATION");
  IElementType ANNOTATION_MARK = new FutilElementType("ANNOTATION_MARK");
  IElementType BRACKETS = new FutilElementType("BRACKETS");
  IElementType COMPONENT = new FutilElementType("COMPONENT");
  IElementType COMPONENT_STATEMENT = new FutilElementType("COMPONENT_STATEMENT");
  IElementType ESCAPED = new FutilElementType("ESCAPED");
  IElementType GROUP = new FutilElementType("GROUP");
  IElementType GROUP_STATEMENT = new FutilElementType("GROUP_STATEMENT");
  IElementType IDENTIFIER = new FutilElementType("IDENTIFIER");
  IElementType IMPORT = new FutilElementType("IMPORT");
  IElementType IMPORT_STATEMENT = new FutilElementType("IMPORT_STATEMENT");
  IElementType INSERT_DOT = new FutilElementType("INSERT_DOT");
  IElementType INSERT_ITEM = new FutilElementType("INSERT_ITEM");
  IElementType INSERT_PAIR = new FutilElementType("INSERT_PAIR");
  IElementType INSERT_STAR = new FutilElementType("INSERT_STAR");
  IElementType KEY_SYMBOL = new FutilElementType("KEY_SYMBOL");
  IElementType NAMESAPCE = new FutilElementType("NAMESAPCE");
  IElementType NORMAL_STATEMENT = new FutilElementType("NORMAL_STATEMENT");
  IElementType NUMBER_SUFFIX = new FutilElementType("NUMBER_SUFFIX");
  IElementType PAIR = new FutilElementType("PAIR");
  IElementType REF = new FutilElementType("REF");
  IElementType STRING_INLINE = new FutilElementType("STRING_INLINE");
  IElementType STRING_MULTI = new FutilElementType("STRING_MULTI");
  IElementType STRING_PREFIX = new FutilElementType("STRING_PREFIX");
  IElementType SYMBOL_PATH = new FutilElementType("SYMBOL_PATH");
  IElementType TABLE = new FutilElementType("TABLE");
  IElementType TYPE_HINT = new FutilElementType("TYPE_HINT");
  IElementType VALUE = new FutilElementType("VALUE");

  IElementType ACCENT = new FutilElementType("^");
  IElementType ANGLE_L = new FutilElementType("<");
  IElementType ANGLE_R = new FutilElementType(">");
  IElementType AS = new FutilElementType("as");
  IElementType AT = new FutilElementType("@");
  IElementType BACK_TOP = new FutilElementType("BACK_TOP");
  IElementType BLOCK_COMMENT = new FutilElementType("BLOCK_COMMENT");
  IElementType BOOLEAN = new FutilElementType("BOOLEAN");
  IElementType BRACE_L = new FutilElementType("{");
  IElementType BRACE_R = new FutilElementType("}");
  IElementType BRACKET_L = new FutilElementType("[");
  IElementType BRACKET_R = new FutilElementType("]");
  IElementType BYTE = new FutilElementType("BYTE");
  IElementType CITE = new FutilElementType("$");
  IElementType COLON = new FutilElementType(":");
  IElementType COMMA = new FutilElementType(",");
  IElementType COMMENT = new FutilElementType("COMMENT");
  IElementType DECIMAL = new FutilElementType("DECIMAL");
  IElementType DECIMAL_BAD = new FutilElementType("DECIMAL_BAD");
  IElementType DOT = new FutilElementType(".");
  IElementType EQ = new FutilElementType("=");
  IElementType ESCAPE = new FutilElementType("\\");
  IElementType IDENTI = new FutilElementType("identi");
  IElementType INTEGER = new FutilElementType("INTEGER");
  IElementType NON_ESCAPE = new FutilElementType("NON_ESCAPE");
  IElementType NULL = new FutilElementType("null");
  IElementType PARENTHESIS_L = new FutilElementType("(");
  IElementType PARENTHESIS_R = new FutilElementType(")");
  IElementType QUOTATION = new FutilElementType("\"");
  IElementType SEMICOLON = new FutilElementType(";");
  IElementType SIGN = new FutilElementType("SIGN");
  IElementType STAR = new FutilElementType("*");
  IElementType STRING = new FutilElementType("STRING");
  IElementType SYMBOL = new FutilElementType("SYMBOL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new FutilAnnotationNode(node);
      }
      else if (type == ANNOTATION_MARK) {
        return new FutilAnnotationMarkNode(node);
      }
      else if (type == BRACKETS) {
        return new FutilBracketsNode(node);
      }
      else if (type == COMPONENT) {
        return new FutilComponentNode(node);
      }
      else if (type == COMPONENT_STATEMENT) {
        return new FutilComponentStatementNode(node);
      }
      else if (type == ESCAPED) {
        return new FutilEscapedNode(node);
      }
      else if (type == GROUP) {
        return new FutilGroupNode(node);
      }
      else if (type == GROUP_STATEMENT) {
        return new FutilGroupStatementNode(node);
      }
      else if (type == IDENTIFIER) {
        return new FutilIdentifierNode(node);
      }
      else if (type == IMPORT) {
        return new FutilImportNode(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new FutilImportStatementNode(node);
      }
      else if (type == INSERT_DOT) {
        return new FutilInsertDotNode(node);
      }
      else if (type == INSERT_ITEM) {
        return new FutilInsertItemNode(node);
      }
      else if (type == INSERT_PAIR) {
        return new FutilInsertPairNode(node);
      }
      else if (type == INSERT_STAR) {
        return new FutilInsertStarNode(node);
      }
      else if (type == KEY_SYMBOL) {
        return new FutilKeySymbolNode(node);
      }
      else if (type == NAMESAPCE) {
        return new FutilNamesapceNode(node);
      }
      else if (type == NORMAL_STATEMENT) {
        return new FutilNormalStatementNode(node);
      }
      else if (type == NUMBER_SUFFIX) {
        return new FutilNumberSuffixNode(node);
      }
      else if (type == PAIR) {
        return new FutilPairNode(node);
      }
      else if (type == REF) {
        return new FutilRefNode(node);
      }
      else if (type == STRING_INLINE) {
        return new FutilStringInlineNode(node);
      }
      else if (type == STRING_MULTI) {
        return new FutilStringMultiNode(node);
      }
      else if (type == STRING_PREFIX) {
        return new FutilStringPrefixNode(node);
      }
      else if (type == SYMBOL_PATH) {
        return new FutilSymbolPathNode(node);
      }
      else if (type == TABLE) {
        return new FutilTableNode(node);
      }
      else if (type == TYPE_HINT) {
        return new FutilTypeHintNode(node);
      }
      else if (type == VALUE) {
        return new FutilValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
