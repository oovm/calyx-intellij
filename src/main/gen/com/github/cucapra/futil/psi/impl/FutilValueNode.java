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

public class FutilValueNode extends ASTWrapperPsiElement implements FutilValue {

  public FutilValueNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitValue(this);
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
  public FutilNumberSuffix getNumberSuffix() {
    return findChildByClass(FutilNumberSuffix.class);
  }

  @Override
  @Nullable
  public FutilRef getRef() {
    return findChildByClass(FutilRef.class);
  }

  @Override
  @Nullable
  public FutilStringInline getStringInline() {
    return findChildByClass(FutilStringInline.class);
  }

  @Override
  @Nullable
  public FutilStringMulti getStringMulti() {
    return findChildByClass(FutilStringMulti.class);
  }

  @Override
  @Nullable
  public FutilStringPrefix getStringPrefix() {
    return findChildByClass(FutilStringPrefix.class);
  }

  @Override
  @Nullable
  public FutilTable getTable() {
    return findChildByClass(FutilTable.class);
  }

  @Override
  @Nullable
  public PsiElement getBoolean() {
    return findChildByType(BOOLEAN);
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
  public PsiElement getNull() {
    return findChildByType(NULL);
  }

  @Override
  @Nullable
  public PsiElement getSign() {
    return findChildByType(SIGN);
  }

}
