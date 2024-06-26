import java.util.*;

public class Application {

   public static void main(String[] args) {

      String[] vertexArr = {"A", "B", "C", "D", "E", "F", "G", "H"};
      Vertex[] vertex = new Vertex[]{new Vertex("A"), new Vertex("B"), new Vertex("C"), new Vertex("D"), new Vertex("E"), new Vertex("F"), new Vertex("G"), new Vertex("H")};
      AdjacencyMatrix adj = new AdjacencyMatrix(8, vertexArr);
      //                   OR
      //int[][] adjMatrix = new int[][]{{0, 1, 1, 1, 0}, {1, 0, 1, 0, 1}, {1, 1, 0, 0, 1}, {1, 0, 0, 0, 1}, {0, 1, 1, 1, 0}};
      int[][] adjMatrix = {{0, 0, 1, 0, 0, 0, 0, 0},
                           {0, 0, 1, 1, 0, 0, 0, 0},
                           {0, 0, 0, 0, 1, 0, 0, 0},
                           {0, 0, 0, 0, 0, 1, 0, 0},
                           {0, 0, 0, 0, 0, 1, 0, 1},
                           {0, 0, 0, 0, 0, 0, 1, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0},
                           {1, 0, 0, 0, 0, 0, 0, 0}};
      // adj.addEdge("A", "B");
      // adj.addEdge("A", "C");
      // adj.addEdge("B", "E");
      // adj.addEdge("D", "A");
      // adj.addEdge("E", "C");
      // adj.addEdge("C", "B");
      // adj.addEdge("D", "E");
      // System.out.println(Arrays.deepToString(adj.matrix));
      //adj.isEdge("A", "B");
      //adj.removeEdge("A", "B");
      //System.out.println(Arrays.deepToString(adj.matrix));



      // AdjacencyList adjList = new AdjacencyList(5, vertexArr);
      // adjList.addEdge("A", "B");
      // System.out.println(Arrays.toString(adjList.adjList));
      // adjList.removeEdge("A", "B");
      //System.out.println(Arrays.toString(adjList.adjList));
      //adjList.removeEdge("B", "A");



      // adjList.addEdge("A", "C");
      // adjList.addEdge("A", "D");
      // adjList.addEdge("A", "E");
      // adjList.addEdge("A", "B");

      //System.out.println(Arrays.toString(adjList.adjList));




      // Vertex[] vertex = {new Vertex("A"), new Vertex("B"), new Vertex("C"), new Vertex("D"), new Vertex("E")};
      //
      // BreadthFirstSearch bfs = new BreadthFirstSearch(5, vertex);
      //
      // bfs.addEdge("A", "B");
      // bfs.addEdge("A", "C");
      // bfs.addEdge("B", "E");
      // bfs.addEdge("D", "A");
      // bfs.addEdge("E", "C");
      // bfs.addEdge("C", "B");
      // bfs.addEdge("D", "E");
      //
      // System.out.println(Arrays.deepToString(bfs.matrix));
      //
      // bfs.bfs();


      // Vertex[] vertex = {new Vertex("A"), new Vertex("B"), new Vertex("C"), new Vertex("D"), new Vertex("E")};
      //
      // DepthFirstSearch dfs = new DepthFirstSearch(5, vertex);
      //
      // dfs.addEdge("A", "B");
      // dfs.addEdge("A", "C");
      // dfs.addEdge("B", "E");
      // dfs.addEdge("D", "A");
      // dfs.addEdge("E", "C");
      // dfs.addEdge("C", "B");
      // dfs.addEdge("D", "E");
      //
      // System.out.println(Arrays.deepToString(dfs.matrix));
      //
      // dfs.dfs();
      // for(Vertex v : dfs.vertices) {
      //    v.isVisited = false;
      // }
      // System.out.println();
      // System.out.println(dfs.vertices[0].vertexName);
      // dfs.vertices[0].isVisited = true;
      // dfs.dfsRecur(0);

      System.out.println(Arrays.toString(vertex));
      TopologicalSort.topoSort(adjMatrix, vertex, 0);

   }

}
