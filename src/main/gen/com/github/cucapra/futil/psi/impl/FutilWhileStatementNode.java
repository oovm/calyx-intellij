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

public class FutilWhileStatementNode extends ASTWrapperPsiElement implements FutilWhileStatement {

  public FutilWhileStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitWhileStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FutilWhile getWhile() {
    return findNotNullChildByClass(FutilWhile.class);
  }

  @Override
  @Nullable
  public FutilWith getWith() {
    return findChildByClass(FutilWith.class);
  }

  @Override
  @NotNull
  public FutilBrace getBrace() {
    return findNotNullChildByClass(FutilBrace.class);
  }

  @Override
  @Nullable
  public FutilIdentifier getIdentifier() {
    return findChildByClass(FutilIdentifier.class);
  }

  @Override
  @NotNull
  public FutilNamespace getNamespace() {
    return findNotNullChildByClass(FutilNamespace.class);
  }

}
