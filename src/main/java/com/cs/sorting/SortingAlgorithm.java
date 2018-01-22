package com.cs.sorting;

public abstract class SortingAlgorithm {
  public abstract void sort(int[] arrray);

  protected void swap(int[] array, int left, int right) {
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
  }
}
