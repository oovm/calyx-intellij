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

public class FutilRhsNode extends ASTWrapperPsiElement implements FutilRhs {

  public FutilRhsNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitRhs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FutilCall getCall() {
    return findChildByClass(FutilCall.class);
  }

  @Override
  @Nullable
  public FutilValue getValue() {
    return findChildByClass(FutilValue.class);
  }

  @Override
  @Nullable
  public PsiElement getByte() {
    return findChildByType(BYTE);
  }

  @Override
  @Nullable
  public PsiElement getDecimal() {
    return findChildByType(DECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getDecimalBad() {
    return findChildByType(DECIMAL_BAD);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getSign() {
    return findChildByType(SIGN);
  }

  @Override
  @Nullable
  public PsiElement getNumberSuffix() {
    return findChildByType(NUMBER_SUFFIX);
  }

}
