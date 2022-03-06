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

public class FutilAngleNode extends ASTWrapperPsiElement implements FutilAngle {

  public FutilAngleNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FutilVisitor visitor) {
    visitor.visitAngle(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FutilVisitor) accept((FutilVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getAngleL() {
    return findNotNullChildByType(ANGLE_L);
  }

  @Override
  @NotNull
  public PsiElement getAngleR() {
    return findNotNullChildByType(ANGLE_R);
  }

}
