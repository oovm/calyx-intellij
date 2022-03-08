// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilWhileStatement extends PsiElement {

  @NotNull
  FutilWhile getWhile();

  @Nullable
  FutilWith getWith();

  @NotNull
  FutilBrace getBrace();

  @Nullable
  FutilIdentifier getIdentifier();

  @NotNull
  FutilNamespace getNamespace();

}
