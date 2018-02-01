package com.cs.searching;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Binary search test.
 */

public class BinarySearchTreeTest {

  @Test
  public void putsAndGets() {
    BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();

    String inputKeys[] = {"a", "c", "b", "d", "e"};
    Integer inputValues[] = {10, 21, 32, 43, 54};

    for (int i = 0; i < inputKeys.length; i++) {
      bst.put(inputKeys[i], inputValues[i]);
    }

    Integer result[] = new Integer[inputKeys.length];

    for (int i = 0; i < inputKeys.length; i++) {
      result[i] = bst.get(inputKeys[i]);
    }

    assertArrayEquals(inputValues, result);
  }

  @Test
  public void getsNull() {
    BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();

    Integer value = bst.get("x");

    assert(value == null);

    String inputKeys[] = {"a", "c", "b", "d", "e"};
    Integer inputValues[] = {10, 21, 32, 43, 54};

    for (int i = 0; i < inputKeys.length; i++) {
      bst.put(inputKeys[i], inputValues[i]);
    }

    value = bst.get("y");

    assert(value == null);
  }

  @Test
  public void deleteKey() {
    BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();

    String inputKeys[] = {"a", "c", "b", "d", "e"};
    Integer inputValues[] = {10, 21, 32, 43, 54};
    Integer expectedValues[] = {10, 21, 32, 43};

    for (int i = 0; i < inputKeys.length; i++) {
      bst.put(inputKeys[i], inputValues[i]);
    }

    bst.delete(inputKeys[4]);

    Integer result[] = new Integer[inputKeys.length - 1];

    for (int i = 0; i < inputKeys.length - 1; i++) {
      result[i] = bst.get(inputKeys[i]);
    }

    assertArrayEquals(expectedValues, result);
  }

  @Test
  public void deleteRootKey() {
    BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();

    String inputKeys[] = {"b", "a", "c"};
    Integer inputValues[] = {10, 21, 32};
    Integer expectedValues[] = {21, 32};

    for (int i = 0; i < inputKeys.length; i++) {
      bst.put(inputKeys[i], inputValues[i]);
    }

    bst.delete(inputKeys[0]);

    Integer result[] = new Integer[expectedValues.length];

    for (int i = 0; i < inputKeys.length - 1; i++) {
      result[i] = bst.get(inputKeys[i + 1]);
    }

    assertArrayEquals(expectedValues, result);
  }
}
