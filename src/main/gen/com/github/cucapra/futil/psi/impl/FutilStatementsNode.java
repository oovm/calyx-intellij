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

public class FutilStatementsNode extends ASTWrapperPsiElement implements FutilStatements {

  public FutilStatementsNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitStatements(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FutilComponentStatement getComponentStatement() {
    return findChildByClass(FutilComponentStatement.class);
  }

  @Override
  @Nullable
  public FutilGroupStatement getGroupStatement() {
    return findChildByClass(FutilGroupStatement.class);
  }

  @Override
  @Nullable
  public FutilImportStatement getImportStatement() {
    return findChildByClass(FutilImportStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
