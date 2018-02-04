package com.cs.graphs;

import java.util.LinkedList;

/**
 * Graph.
 */

public class Graph {
  private int vertices;
  private int edges;

  private LinkedList<Integer>[] adj;

  Graph(Integer size) {
    vertices = size;
    adj = new LinkedList[size];
    for (int i = 0; i < size; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  void addEdge(int left, int right) {
    adj[left].add(right);
    edges++;
  }

  public int vertices() {
    return vertices;
  }

  public int edges() {
    return edges;
  }

  public int degree(int left) {
    return adj[left].size();
  }

  public Iterable<Integer> adj(int vertex) {
    return adj[vertex];
  }
}
