package com.cs.sorting;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public abstract class SortingAlgorithmTest {
  private SortingAlgorithm sortingAlgorithm;

  public abstract SortingAlgorithm getSortingAlgorithm();

  @Before
  public void setup() {
    sortingAlgorithm = getSortingAlgorithm();
  }

  @Test
  public void testSortArray() {
    int[] input = { 4, 4, 3, 2, 1, 0 };
    int[] expectedArray = { 0, 1, 2, 3, 4, 4 };

    sortingAlgorithm.sort(input);

    assertArrayEquals(expectedArray, input);
  }

  @Test
  public void testKeepArraySorted() {
    int[] input = { 0, 1, 2, 3, 4, 4 };

    sortingAlgorithm.sort(input);

    assertArrayEquals(input, input);
  }
}
