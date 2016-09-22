public class Cycle {

   private static Map<Integer, Integer> pathMap = new HashMap<>();

   // If the Graph is UnDirected, then isVisited boolean alone is Enough to find the Cycle

   public static void dfsSearch(int[][] relationMatrix, Vertex[] vertices, int currentVertex, String graphType) {
      vertices[currentVertex].isGrey = true;
      vertices[currentVertex].isVisited = true;
      for(int i=0;i<relationMatrix[currentVertex].length;i++) {
         if(relationMatrix[currentVertex][i] == 1 && vertices[i].isGrey) {
            printCycle(currentVertex, i, vertices);
         }
         if(relationMatrix[currentVertex][i] == 1 && !vertices[i].isVisited) {
            pathMap.put(i, currentVertex);
            dfsSearch(relationMatrix, vertices, i);
         }
      }
      if(graphType.equals("Directed")) {
         vertices[currentVertex].isGrey = false;
      }
   }

   public static void topoSort(int[][] relationMatrix, Vertex[] vertices, int startVertex) {
      int i=startVertex;
      String graphType = "Directed";
      do {
         if(!vertices[i].isVisited) {
            dfsSearch(relationMatrix, vertices, i, graphType);
         }
         i = (++i)%vertices.length;
      }while(i!=startVertex);
   }


   public static void printCycle(int currentVertex, int cycleVertex, Vertex[] vertices) {
      int start = currentVertex;
      System.out.println("FOUND!!!!! at vertex "+vertices[cycleVertex]);
      while(start!=cycleVertex) {
         System.out.println("^^^^^^^^"+vertices[start]);
         start = pathMap.get(start);
      }
   }

}
