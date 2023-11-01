package com.almworks.structure.cloud.commons.util;

import org.junit.Assert;
import org.junit.Test;

public class FilterTest {
  @Test
  public void testFilter() {
    Hierarchy unfiltered = new ArrayBasedHierarchy(
      new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
      new int[] {0, 1, 2, 3, 1, 0, 1, 0, 1, 1, 2}
    );

    Hierarchy filteredActual = Filter.filter(unfiltered, nodeId -> nodeId % 3 != 0);

    Hierarchy filteredExpected = new ArrayBasedHierarchy(
      new int[] {1, 2, 5, 8, 10, 11},
      new int[] {0, 1, 1, 0, 1, 2}
    );

    Assert.assertEquals(filteredExpected.formatString(), filteredActual.formatString());
  }

  @Test
  public void testFilterWithDifferentPredicate() {
    Hierarchy unfiltered = new ArrayBasedHierarchy(
      new int[] {1, 2, 3, 4, 5, 6, 7},
      new int[] {0, 1, 2, 3, 1, 0, 1}
    );

    Hierarchy filteredActual = Filter.filter(unfiltered, nodeId -> nodeId % 2 == 0);

    Hierarchy filteredExpected = new ArrayBasedHierarchy(
      new int[] {2, 4, 6},
      new int[] {1, 3, 0}
    );

    Assert.assertEquals(filteredExpected.formatString(), filteredActual.formatString());
  }

  @Test
  public void testFilterWithEmptyHierarchy() {
    Hierarchy unfiltered = new ArrayBasedHierarchy(new int[0], new int[0]);

    Hierarchy filteredActual = Filter.filter(unfiltered, nodeId -> nodeId % 2 == 0);

    Hierarchy filteredExpected = new ArrayBasedHierarchy(new int[0], new int[0]);

    Assert.assertEquals(filteredExpected.formatString(), filteredActual.formatString());
  }
}
