import java.util.*;

public class Application {

   public static void main(String[] args) {

      String[] vertexArr = {"A", "B", "C", "D", "E"};
      AdjacencyMatrix adj = new AdjacencyMatrix(5, vertexArr);

      //adj.addEdge("A", "B");
      //System.out.println(Arrays.deepToString(adj.matrix));
      //adj.isEdge("A", "B");
      //adj.removeEdge("A", "B");
      //System.out.println(Arrays.deepToString(adj.matrix));



      AdjacencyList adjList = new AdjacencyList(5, vertexArr);
      adjList.addEdge("A", "B");
      System.out.println(Arrays.toString(adjList.adjList));
      adjList.removeEdge("A", "B");
      //System.out.println(Arrays.toString(adjList.adjList));
      //adjList.removeEdge("B", "A");



      // adjList.addEdge("A", "C");
      // adjList.addEdge("A", "D");
      // adjList.addEdge("A", "E");
      // adjList.addEdge("A", "B");

      System.out.println(Arrays.toString(adjList.adjList));







   }

}
