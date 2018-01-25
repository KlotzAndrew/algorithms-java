package com.cs.sorting;

public class Heap extends SortingAlgorithm {
  /**
    Heap sort.
  **/
  public void sort(int[] array) {
    int total = array.length;

    for (int i = total / 2 - 1; i >= 0; i--) {
      heapify(array, total, i);
    }

    for (int i = total - 1; i >= 0; i--) {
      swap(array, i, 0);
      heapify(array, i, 0);
    }
  }

  private void heapify(int[] array, int total, int index) {
    int largestIndex = index;
    int leftIndex = index * 2 + 1;
    int rightIndex = index * 2 + 2;

    if (rightIndex < total && array[rightIndex] > array[largestIndex]) {
      largestIndex = rightIndex;
    }

    if (leftIndex < total && array[leftIndex] > array[largestIndex]) {
      largestIndex = leftIndex;
    }

    if (largestIndex != index) {
      swap(array, largestIndex, index);
      heapify(array, total, largestIndex);
    }
  }
}
