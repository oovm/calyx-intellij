// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilAnnotation extends PsiElement {

  @NotNull
  FutilAnnotationMark getAnnotationMark();

  @NotNull
  List<FutilKeySymbol> getKeySymbolList();

  @NotNull
  List<FutilValue> getValueList();

}
