package com.cs.searching;

/**
 * Binary search.
 */

public class BinarySearchTree<K extends Comparable<K>, V> {
  private Node root;

  private class Node {
    private K key;
    private V value;
    private Node left;
    private Node right;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  public void put(K key, V value) {
    root = put(root, key, value);
  }

  private Node put(Node node, K key, V value) {
    if (node == null) {
      return new Node(key, value);
    }
    int cmp = key.compareTo(node.key);
    if (cmp < 0) {
      node.left = put(node.left, key, value);
    } else if (cmp > 0) {
      node.right = put(node.right, key, value);
    } else {
      node.value = value;
    }

    return node;
  }

  /**
  * Returns value for given key, otherwise null.
  */
  public V get(K key) {
    Node node = root;
    while (node != null) {
      int cmp = key.compareTo(node.key);
      if (cmp < 0) {
        node = node.left;
      } else if (cmp > 0)  {
        node = node.right;
      } else {
        return node.value;
      }
    }
    return null;
  }

  public void delete(K key) {
    { root = delete(root, key); }
  }

  private Node delete(Node node, K key) {
    if (node == null) {
      return null;
    }
    int cmp = key.compareTo(node.key);
    if (cmp < 0) {
      node.left = delete(node.left, key);
    } else if (cmp > 0) {
      node.right = delete(node.right, key);
    } else {
      if (node.right == null) {
        return node.left;
      }
      if (node.left == null) {
        return node.right;
      }

      Node ref = node;
      node = min(ref.right);
      node.right = deleteMin(ref.right);
      node.left = ref.left;
    }
    return node;
  }

  private Node min(Node node) {
    if (node.left == null) {
      return node;
    }
    return min(node);
  }

  private Node deleteMin(Node node) {
    node = min(node);
    return delete(node, node.key);
  }
}

