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
  @NotNull
  public FutilLhs getLhs() {
    return findNotNullChildByClass(FutilLhs.class);
  }

  @Override
  @NotNull
  public FutilRhs getRhs() {
    return findNotNullChildByClass(FutilRhs.class);
  }

  @Override
  @NotNull
  public PsiElement getEq() {
    return findNotNullChildByType(EQ);
  }

}