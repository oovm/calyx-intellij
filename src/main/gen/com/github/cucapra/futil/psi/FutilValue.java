// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilValue extends PsiElement {

  @Nullable
  FutilAnnotation getAnnotation();

  @Nullable
  FutilNumberSuffix getNumberSuffix();

  @Nullable
  FutilRef getRef();

  @Nullable
  FutilStringInline getStringInline();

  @Nullable
  FutilStringMulti getStringMulti();

  @Nullable
  FutilStringPrefix getStringPrefix();

  @Nullable
  FutilTable getTable();

  @Nullable
  PsiElement getBoolean();

  @Nullable
  PsiElement getByte();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getDecimalBad();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getNull();

  @Nullable
  PsiElement getSign();

}
