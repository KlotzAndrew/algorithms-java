package com.cs.sorting;

public class Bubble {
  /**
    bubble sort.
  **/
  public void sort(int[] numbers) {
    int length = numbers.length;
    boolean swaped = true;

    while (swaped) {
      swaped = false;
      for (int i = 0; i < length - 1; i++) {
        for (int j = 0; j < length - i - 1; j++) {
          if (numbers[j] > numbers[j + 1]) {
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
            swaped = true;
          }
        }
      }
    }
  }
}
