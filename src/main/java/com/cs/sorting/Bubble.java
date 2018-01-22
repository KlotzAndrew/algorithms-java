package com.cs.sorting;

public class Bubble extends SortingAlgorithm {
  /**
    bubble sort.
  **/
  public void sort(int[] array) {
    int length = array.length;
    boolean swaped = true;

    while (swaped) {
      swaped = false;
      for (int i = 0; i < length - 1; i++) {
        for (int j = 0; j < length - i - 1; j++) {
          if (array[j] > array[j + 1]) {
            swap(array, j, j + 1);
            swaped = true;
          }
        }
      }
    }
  }
}
