// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilValue extends PsiElement {

  @Nullable
  FutilCall getCall();

  @Nullable
  FutilNamespace getNamespace();

  @Nullable
  PsiElement getBits();

  @Nullable
  PsiElement getNumber();

}
