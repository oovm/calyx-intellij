// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilExpression extends PsiElement {

  @NotNull
  FutilLhs getLhs();

  @NotNull
  FutilRhs getRhs();

  @NotNull
  PsiElement getEq();

}
