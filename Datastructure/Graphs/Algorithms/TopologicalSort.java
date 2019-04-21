import java.util.*;

public class TopologicalSort {

   // Only difference from normal DFS is we should be populating the element in stack at the end

   private static Stack<Vertex> stack = new Stack<>();

   public static void dfsSearch(int[][] relationMatrix, Vertex[] vertices, int currentVertex) {
      vertices[currentVertex].isVisited = true;
      for(int i=0;i<relationMatrix[currentVertex].length;i++) {
         if(relationMatrix[currentVertex][i] == 1 && !vertices[i].isVisited) {
            pathMap.put(i, currentVertex);
            dfsSearch(relationMatrix, vertices, i);
         }
      }
      stack.push(vertices[currentVertex]);
   }

   public static void topoSort(int[][] relationMatrix, Vertex[] vertices, int startVertex) {
      int i=startVertex;
      do {
         if(!vertices[i].isVisited) {
            dfsSearch(relationMatrix, vertices, i);
         }
         i = (++i)%vertices.length;
      }while(i!=startVertex);

      while(!stack.isEmpty()) {
         System.out.println(stack.pop().vertexName);
      }
   }

}
