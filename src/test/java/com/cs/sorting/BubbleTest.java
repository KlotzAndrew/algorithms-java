package com.cs.sorting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class BubbleTest extends TestCase {
  public void testMyInt() {
    int[] input = { 4, 3, 2, 1 };
    int[] expectedArray = { 1, 2, 3, 4 };

    Bubble sorter = new Bubble();

    sorter.sort(input);

    assertArrayEquals(expectedArray, input);
  }
}
