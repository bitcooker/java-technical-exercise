package com.almworks.structure.cloud.commons.util;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Hierarchy {
  int size();

  int nodeId(int index);

  int depth(int index);

  default String formatString() {
    return IntStream.range(0, size()).mapToObj(i -> "" + nodeId(i) + ":" + depth(i)).collect(Collectors.joining(", ", "[", "]"));
  }
}