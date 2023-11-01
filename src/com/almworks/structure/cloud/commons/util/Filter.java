package com.almworks.structure.cloud.commons.util;

import java.util.function.IntPredicate;

public class Filter {
  static Hierarchy filter(Hierarchy hierarchy, IntPredicate nodeIdPredicate) {
    int size = hierarchy.size();
    int[] filteredNodeIds = new int[size];
    int[] filteredDepths = new int[size];
    int filteredIndex = 0;

    for (int i = 0; i < size; i++) {
      int nodeId = hierarchy.nodeId(i);
      int depth = hierarchy.depth(i);

      if (nodeIdPredicate.test(nodeId)) {
        if (depth == 0 || nodeIdPredicate.test(hierarchy.nodeId(i - 1))) {
          filteredNodeIds[filteredIndex] = nodeId;
          filteredDepths[filteredIndex] = depth;
          filteredIndex++;
        }
      }
    }

    return new ArrayBasedHierarchy(
        Arrays.copyOf(filteredNodeIds, filteredIndex),
        Arrays.copyOf(filteredDepths, filteredIndex)
    );
  }
}