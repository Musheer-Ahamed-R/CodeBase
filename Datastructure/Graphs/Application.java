import java.util.*;

public class Application {

   public static void main(String[] args) {

      String[] vertexArr = {"A", "B", "C", "D", "E"};
      AdjacencyMatrix adj = new AdjacencyMatrix(5, vertexArr);

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




      Vertex[] vertex = {new Vertex("A"), new Vertex("B"), new Vertex("C"), new Vertex("D"), new Vertex("E")};

      BreadthFirstSearch bfs = new BreadthFirstSearch(5, vertex);

      bfs.addEdge("A", "B");
      bfs.addEdge("A", "C");
      bfs.addEdge("B", "E");
      bfs.addEdge("D", "A");
      bfs.addEdge("E", "C");
      bfs.addEdge("C", "B");
      bfs.addEdge("D", "E");

      System.out.println(Arrays.deepToString(bfs.matrix));

      bfs.bfs();

   }

}
