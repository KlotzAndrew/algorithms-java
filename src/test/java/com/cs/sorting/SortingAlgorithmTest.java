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
    int[] input = { 6, 4, 5, 4, 3, 9, 2 };
    int[] expectedArray = { 2, 3, 4, 4, 5, 6, 9 };

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
