package com.cs.graphs;

import java.util.Stack;

/**
 * Depth first search.
 */

public class DepthFirst {
  private boolean[] marked;
  private int[] edgeTo;
  private int source;

  DepthFirst(Graph graph, int source) {
    this.edgeTo = new int[graph.vertices()];
    this.marked = new boolean[graph.vertices()];

    dfs(graph, source);
  }

  private void dfs(Graph graph, int source) {
    marked[source] = true;
    for (int adj : graph.adj(source)) {
      if (!marked[adj]) {
        edgeTo[adj] = source;
        dfs(graph, adj);
      }
    }
  }

  Integer[] pathTo(int target) {
    if (!hasPathTo(target)) {
      return new Integer[0];
    }

    Stack<Integer> path = new Stack<Integer>();
    for (int x = target; x != source; x = edgeTo[x]) {
      path.push(x);
    }
    return path.toArray(new Integer[path.size()]);
  }

  boolean hasPathTo(int target) {
    return marked[target];
  }
}
