package com.cs.sorting;

/**
  Quick sort test.
 */
public class HeapTest extends SortingAlgorithmTest {
  @Override
  public SortingAlgorithm getSortingAlgorithm() {
      return new Heap();
  }
}
