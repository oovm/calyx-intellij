// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.cucapra.futil.psi.impl.*;

public interface FutilTypes {

  IElementType ANGLE = new FutilElementType("ANGLE");
  IElementType ANNOTATION = new FutilElementType("ANNOTATION");
  IElementType ANNOTATION_MARK = new FutilElementType("ANNOTATION_MARK");
  IElementType BRACE = new FutilElementType("BRACE");
  IElementType BRACKET = new FutilElementType("BRACKET");
  IElementType CALL = new FutilElementType("CALL");
  IElementType COMPONENT = new FutilElementType("COMPONENT");
  IElementType COMPONENT_NAME = new FutilElementType("COMPONENT_NAME");
  IElementType COMPONENT_STATEMENT = new FutilElementType("COMPONENT_STATEMENT");
  IElementType COMPONENT_TARGET = new FutilElementType("COMPONENT_TARGET");
  IElementType EXPRESSION = new FutilElementType("EXPRESSION");
  IElementType GROUP = new FutilElementType("GROUP");
  IElementType GROUP_STATEMENT = new FutilElementType("GROUP_STATEMENT");
  IElementType IDENTIFIER = new FutilElementType("IDENTIFIER");
  IElementType IMPORT = new FutilElementType("IMPORT");
  IElementType IMPORT_STATEMENT = new FutilElementType("IMPORT_STATEMENT");
  IElementType LHS = new FutilElementType("LHS");
  IElementType NAMESPACE = new FutilElementType("NAMESPACE");
  IElementType NORMAL_STATEMENT = new FutilElementType("NORMAL_STATEMENT");
  IElementType PARENTHESIS = new FutilElementType("PARENTHESIS");
  IElementType RHS = new FutilElementType("RHS");
  IElementType SLICE = new FutilElementType("SLICE");
  IElementType VALUE = new FutilElementType("VALUE");

  IElementType ACCENT = new FutilElementType("^");
  IElementType ANGLE_L = new FutilElementType("<");
  IElementType ANGLE_R = new FutilElementType(">");
  IElementType AS = new FutilElementType("as");
  IElementType AT = new FutilElementType("@");
  IElementType BITS = new FutilElementType("Bits");
  IElementType BLOCK_COMMENT = new FutilElementType("BLOCK_COMMENT");
  IElementType BOOLEAN = new FutilElementType("BOOLEAN");
  IElementType BRACE_L = new FutilElementType("{");
  IElementType BRACE_R = new FutilElementType("}");
  IElementType BRACKET_L = new FutilElementType("[");
  IElementType BRACKET_R = new FutilElementType("]");
  IElementType CITE = new FutilElementType("$");
  IElementType COLON = new FutilElementType(":");
  IElementType COMMA = new FutilElementType(",");
  IElementType COMMENT = new FutilElementType("COMMENT");
  IElementType DOT = new FutilElementType(".");
  IElementType EQ = new FutilElementType("=");
  IElementType ESCAPE = new FutilElementType("\\");
  IElementType NON_ESCAPE = new FutilElementType("NON_ESCAPE");
  IElementType NULL = new FutilElementType("null");
  IElementType NUMBER = new FutilElementType("Number");
  IElementType PARENTHESIS_L = new FutilElementType("(");
  IElementType PARENTHESIS_R = new FutilElementType(")");
  IElementType QUESTION = new FutilElementType("?");
  IElementType QUOTATION = new FutilElementType("\"");
  IElementType SEMICOLON = new FutilElementType(";");
  IElementType STAR = new FutilElementType("*");
  IElementType STRING = new FutilElementType("String");
  IElementType SYMBOL = new FutilElementType("Symbol");
  IElementType TO = new FutilElementType("TO");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANGLE) {
        return new FutilAngleNode(node);
      }
      else if (type == ANNOTATION) {
        return new FutilAnnotationNode(node);
      }
      else if (type == ANNOTATION_MARK) {
        return new FutilAnnotationMarkNode(node);
      }
      else if (type == BRACE) {
        return new FutilBraceNode(node);
      }
      else if (type == BRACKET) {
        return new FutilBracketNode(node);
      }
      else if (type == CALL) {
        return new FutilCallNode(node);
      }
      else if (type == COMPONENT) {
        return new FutilComponentNode(node);
      }
      else if (type == COMPONENT_NAME) {
        return new FutilComponentNameNode(node);
      }
      else if (type == COMPONENT_STATEMENT) {
        return new FutilComponentStatementNode(node);
      }
      else if (type == COMPONENT_TARGET) {
        return new FutilComponentTargetNode(node);
      }
      else if (type == EXPRESSION) {
        return new FutilExpressionNode(node);
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
      else if (type == LHS) {
        return new FutilLhsNode(node);
      }
      else if (type == NAMESPACE) {
        return new FutilNamespaceNode(node);
      }
      else if (type == NORMAL_STATEMENT) {
        return new FutilNormalStatementNode(node);
      }
      else if (type == PARENTHESIS) {
        return new FutilParenthesisNode(node);
      }
      else if (type == RHS) {
        return new FutilRhsNode(node);
      }
      else if (type == SLICE) {
        return new FutilSliceNode(node);
      }
      else if (type == VALUE) {
        return new FutilValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
