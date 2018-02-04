package com.cs.graphs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;

/**
 * Graph test.
 */

public class GraphTest {

  @Test
  public void canAddEdgeTest() {
    Graph graph = new Graph(4);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);

    assertEquals(graph.vertices(), 4);
    assertEquals(graph.edges(), 6);
    assertEquals(graph.degree(0), 2);
    assertEquals(graph.degree(1), 1);
    assertEquals(graph.degree(2), 2);
    assertEquals(graph.degree(3), 1);
  }
}
