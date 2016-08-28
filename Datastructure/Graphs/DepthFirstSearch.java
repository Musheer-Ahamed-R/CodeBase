import java.util.*;

public class DepthFirstSearch {

   public Vertex[] vertices;
   public int[][] matrix;
   public int vertexCount;

   public DepthFirstSearch(int vertexCount, Vertex[] vertices) {
      this.vertexCount = vertexCount;
      this.vertices = vertices;
      this.matrix = new int[vertexCount][vertexCount];
   }

   /*
      Adding the Vertex INDEX to the Stack, Instead of the Vertex itself is VERY IMPORTANT.
      We are making Recursive Call inside a FOR LOOP in case of Recursive Depth First Search.
      This is because in case of Tree, we have to make just Two Recursive Calls. But, incase of Graphs we Could have to have to make
      N(Number of Vertices) Recursive Calls altogether. Thus, a Recursive Call in a For Loop is NO BIG DEAL in case of Graphs.
   */

   public void dfs() {
      Stack<Integer> stack = new Stack<>();
      stack.push(0);
      vertices[0].isVisited = true;
      System.out.println("Vertex -> "+vertices[0].vertexName);
      while(!stack.empty()) {
         boolean isDone = true;
         int currentVertex = stack.peek();
         //System.out.println(vertices[currentVertex].vertexName);
         for(int i=0;i<vertexCount;i++) {
            if(this.matrix[currentVertex][i] == 1 && !vertices[i].isVisited) {
               vertices[i].isVisited = true;
               System.out.println("Vertex -> "+vertices[i].vertexName);
               stack.push(i);
               isDone = false;
               break;
            }
         }
         if(isDone) {
            //System.out.println("Popping -> "+stack.peek());
            stack.pop();
         }
      }
   }

   public void dfsRecur(int index) {

      // This For Loop is also the "Base Case" for the Method Call
      for(int i=0;i<vertexCount;i++) {
         if(this.matrix[index][i] == 1 && !vertices[i].isVisited) {
            System.out.println("Vertex -> "+vertices[i].vertexName);
            vertices[i].isVisited = true;
            dfsRecur(i);
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
