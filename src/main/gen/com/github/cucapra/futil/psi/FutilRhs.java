// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilRhs extends PsiElement {

  @Nullable
  FutilCall getCall();

  @Nullable
  FutilValue getValue();

  @Nullable
  PsiElement getByte();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getDecimalBad();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getSign();

  @Nullable
  PsiElement getNumberSuffix();

}
