package com.cs.graphs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Stack;

/**
 * Depth first search test.
 */

public class DepthFirstTest {
  private DepthFirst dfs;

  private DepthFirst setup() {
    Graph graph = new Graph(5);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 0);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 2);

    return new DepthFirst(graph, 0);
  }

  @Test
  public void hasPathTo() {
    Graph graph = new Graph(5);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 0);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 2);

    DepthFirst dfs =  new DepthFirst(graph, 0);

    assertEquals(true, dfs.hasPathTo(0));
    assertEquals(true, dfs.hasPathTo(1));
    assertEquals(true, dfs.hasPathTo(2));
    assertEquals(true, dfs.hasPathTo(3));
    assertEquals(false, dfs.hasPathTo(4));
  }

  @Test
  public void pathTo() {
    Graph graph = new Graph(5);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 0);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 2);

    DepthFirst dfs =  new DepthFirst(graph, 0);

    Integer[] expected = {3, 2};
    Integer[] pathTo = dfs.pathTo(3);
    assertArrayEquals(expected, pathTo);

    expected = new Integer[0];
    pathTo = dfs.pathTo(4);
    assertArrayEquals(expected, pathTo);
  }
}
