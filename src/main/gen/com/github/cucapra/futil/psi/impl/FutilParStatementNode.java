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

public class FutilParStatementNode extends ASTWrapperPsiElement implements FutilParStatement {

  public FutilParStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitParStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FutilPar getPar() {
    return findChildByClass(FutilPar.class);
  }

  @Override
  @Nullable
  public FutilSeq getSeq() {
    return findChildByClass(FutilSeq.class);
  }

  @Override
  @NotNull
  public FutilBrace getBrace() {
    return findNotNullChildByClass(FutilBrace.class);
  }

  @Override
  @NotNull
  public PsiElement getBraceR() {
    return findNotNullChildByType(BRACE_R);
  }

}
