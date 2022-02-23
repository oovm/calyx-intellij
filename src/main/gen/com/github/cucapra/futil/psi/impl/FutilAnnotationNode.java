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

public class FutilAnnotationNode extends ASTWrapperPsiElement implements FutilAnnotation {

  public FutilAnnotationNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FutilAnnotationMark getAnnotationMark() {
    return findNotNullChildByClass(FutilAnnotationMark.class);
  }

  @Override
  @NotNull
  public List<FutilKeySymbol> getKeySymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FutilKeySymbol.class);
  }

  @Override
  @NotNull
  public List<FutilPredefinedSymbol> getPredefinedSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FutilPredefinedSymbol.class);
  }

  @Override
  @NotNull
  public List<FutilValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FutilValue.class);
  }

  @Override
  @Nullable
  public PsiElement getBraceL() {
    return findChildByType(BRACE_L);
  }

  @Override
  @Nullable
  public PsiElement getBraceR() {
    return findChildByType(BRACE_R);
  }

  @Override
  @Nullable
  public PsiElement getBracketL() {
    return findChildByType(BRACKET_L);
  }

  @Override
  @Nullable
  public PsiElement getBracketR() {
    return findChildByType(BRACKET_R);
  }

  @Override
  @Nullable
  public PsiElement getParenthesisL() {
    return findChildByType(PARENTHESIS_L);
  }

  @Override
  @Nullable
  public PsiElement getParenthesisR() {
    return findChildByType(PARENTHESIS_R);
  }

}
