package com.cs.graphs;

/**
 * Breadth first test.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class BreadthFirstTest {

  @Test
  public void hasPathTo() {
    Graph graph = new Graph(5);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 0);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 2);

    BreadthFirst bfs =  new BreadthFirst(graph, 0);

    assertEquals(true, bfs.hasPathTo(0));
    assertEquals(true, bfs.hasPathTo(1));
    assertEquals(true, bfs.hasPathTo(2));
    assertEquals(true, bfs.hasPathTo(3));
    assertEquals(false, bfs.hasPathTo(4));
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

    BreadthFirst bfs =  new BreadthFirst(graph, 0);

    Integer[] expected = {3, 2};
    Integer[] pathTo = bfs.pathTo(3);
    assertArrayEquals(expected, pathTo);

    expected = new Integer[0];
    pathTo = bfs.pathTo(4);
    assertArrayEquals(expected, pathTo);
  }

  @Test
  public void distTo() {
    Graph graph = new Graph(5);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 0);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 2);

    BreadthFirst bfs =  new BreadthFirst(graph, 0);

    assertEquals(0, bfs.distTo(0));
    assertEquals(1, bfs.distTo(2));
    assertEquals(2, bfs.distTo(3));
    assertEquals(Integer.MAX_VALUE, bfs.distTo(4));
  }
}
