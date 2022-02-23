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

public class FutilExportStatementNode extends ASTWrapperPsiElement implements FutilExportStatement {

  public FutilExportStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitExportStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FutilStringInline getStringInline() {
    return findNotNullChildByClass(FutilStringInline.class);
  }

  @Override
  @Nullable
  public FutilStringPrefix getStringPrefix() {
    return findChildByClass(FutilStringPrefix.class);
  }

  @Override
  @NotNull
  public PsiElement getExport() {
    return findNotNullChildByType(EXPORT);
  }

}
