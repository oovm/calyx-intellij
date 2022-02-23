// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.cucapra.futil.psi.FutilTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.cucapra.futil.psi.*;

public class FutilExpressionNode extends ASTWrapperPsiElement implements FutilExpression {

  public FutilExpressionNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FutilAnnotation getAnnotation() {
    return findChildByClass(FutilAnnotation.class);
  }

  @Override
  @Nullable
  public FutilExportStatement getExportStatement() {
    return findChildByClass(FutilExportStatement.class);
  }

  @Override
  @Nullable
  public FutilIncludeStatement getIncludeStatement() {
    return findChildByClass(FutilIncludeStatement.class);
  }

  @Override
  @Nullable
  public FutilInheritStatement getInheritStatement() {
    return findChildByClass(FutilInheritStatement.class);
  }

  @Override
  @Nullable
  public FutilInsertItem getInsertItem() {
    return findChildByClass(FutilInsertItem.class);
  }

  @Override
  @Nullable
  public FutilInsertPair getInsertPair() {
    return findChildByClass(FutilInsertPair.class);
  }

  @Override
  @Nullable
  public FutilScope getScope() {
    return findChildByClass(FutilScope.class);
  }

  @Override
  @Nullable
  public PsiElement getBackTop() {
    return findChildByType(BACK_TOP);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
