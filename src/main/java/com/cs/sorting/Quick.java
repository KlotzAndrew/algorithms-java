package com.cs.sorting;

import java.util.Arrays;
import java.util.Collections;

public class Quick extends SortingAlgorithm {
  /**
    Quick sort.
  **/
  public void sort(int[] array) {
    Collections.shuffle(Arrays.asList(array));
    quickSort(array, 0, array.length - 1);
  }

  private void quickSort(int[] array, int left, int right) {
    if (right <= left) {
      return;
    }

    int pivotIndex = partition(array, left, right);
    quickSort(array, left, pivotIndex - 1);
    quickSort(array, pivotIndex + 1, right);
  }

  private int partition(int[] array, int left, int right) {
    int low = left;
    int high = right + 1;
    int pivot = array[low];
    while (true) {
      while (array[++low] < pivot) {
        if (low == right) {
          break;
        }
      }

      while (array[--high] > pivot) {
        if (high == left) {
          break;
        }
      }

      if (low >= high) {
        break;
      }

      swap(array, low, high);
    }
    swap(array, left, high);

    return high;
  }
}
