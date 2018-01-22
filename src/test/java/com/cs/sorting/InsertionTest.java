package com.cs.sorting;

/**
  Insertion sort test.
 */
public class InsertionTest extends SortingAlgorithmTest {
  @Override
  public SortingAlgorithm getSortingAlgorithm() {
      return new Insertion();
  }
}
