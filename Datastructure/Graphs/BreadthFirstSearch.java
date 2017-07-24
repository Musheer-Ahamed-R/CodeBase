import java.util.*;

public class BreadthFirstSearch {

   public Vertex[] vertices;
   public int[][] matrix;
   public int vertexCount;

   public BreadthFirstSearch(int vertexCount, Vertex[] vertices) {
      this.vertexCount = vertexCount;
      this.vertices = vertices;
      this.matrix = new int[vertexCount][vertexCount];
   }

   /*
      Adding the Vertex Index to the Queue, Instead of the Vertex itself is VERY IMPORTANT.
   */
   public void bfs() {

      Queue<Integer> q = new ArrayDeque<>();
      q.add(0);
      this.vertices[0].isVisited = true;
      System.out.println("Vertex -> "+vertices[vertexIndex].vertexName);
      // The Vertices that are not reacheable from first Vertex cannot be Traversed in a Single Traversal(logical). Instead, we can use a
      // Seperate for loop for Iterating Over those Vertices.
      while(!q.isEmpty()) {
         int vertexIndex = q.remove();
         for(int i=0;i<vertexCount;i++) {
            if(matrix[vertexIndex][i] == 1 && !vertices[i].isVisited) {
               System.out.println("Vertex -> "+vertices[vertexIndex].vertexName);
               vertices[i].isVisited = true;    // Important, because if we are going to add visited to a Vertex when removing it, there will be duplicates in the Queue.
               q.add(i);
            }
         }
      }

   }

   public void addEdge(String a, String b) {
      int firIndex = getIndex(a);
      int secIndex = getIndex(b);
      if(firIndex >= 0 && firIndex < this.vertexCount && secIndex >= 0 && secIndex < this.vertexCount) {
         this.matrix[firIndex][secIndex] = 1;
         this.matrix[secIndex][firIndex] = 1;
      }
   }

   public int getIndex(String a) {
      for(int i=0;i<this.vertices.length;i++) {
         if(vertices[i].vertexName.equals(a)) {
            return i;
         }
      }
      return -1;
   }
}
