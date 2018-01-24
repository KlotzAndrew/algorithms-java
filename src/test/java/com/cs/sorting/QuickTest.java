package com.cs.sorting;

/**
  Quick sort test.
 */
public class QuickTest extends SortingAlgorithmTest {
  @Override
  public SortingAlgorithm getSortingAlgorithm() {
      return new Quick();
  }
}
