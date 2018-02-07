package com.cs.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Breadth first search.
 */

public class BreadthFirst {
  private static final int INFINITY = Integer.MAX_VALUE;
  private boolean[] marked;
  private int[] edgeTo;
  private int[] distTo;
  private int source;

  BreadthFirst(Graph graph, int source) {
    source = source;
    marked = new boolean[graph.vertices()];
    edgeTo = new int[graph.vertices()];
    distTo = new int[graph.vertices()];

    for (int v = 0;  v < graph.vertices(); v++) {
      distTo[v] = INFINITY;
    }

    bfs(graph, source);
  }

  private void bfs(Graph graph, int source) {
    Queue<Integer> queue = new LinkedList<>();
    distTo[source] = 0;
    marked[source] = true;
    queue.add(source);

    while (!queue.isEmpty()) {
      int vertex = queue.remove();
      for (int adj: graph.adj(vertex)) {
        if (!marked[adj]) {
          edgeTo[adj] = vertex;
          distTo[adj] = distTo[vertex] + 1;
          marked[adj] = true;
          queue.add(adj);
        }
      }
    }
  }

  boolean hasPathTo(int vertex) {
    return marked[vertex];
  }

  int distTo(int vertex) {
    return distTo[vertex];
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
}
