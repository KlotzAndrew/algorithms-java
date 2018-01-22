package com.cs.sorting;

public class Insertion extends SortingAlgorithm {
  /**
    Inserition sort.
  **/
  public void sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int key = array[i];
      int inner = i;

      while (inner > 0 && array[inner - 1] > key) {
        array[inner] = array[inner - 1];
        inner--;
      }
      array[inner] = key;
    }
  }
}
