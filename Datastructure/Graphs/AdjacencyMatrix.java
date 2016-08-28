public class AdjacencyMatrix {

   public int[][] matrix;
   public String[] vertexArr;
   public int vertexCount;

   /*


   */

   public AdjacencyMatrix(int vertexCount) {
      this.vertexCount = vertexCount;
      this.matrix = new int[vertexCount][vertexCount];
      this.vertexArr = new String[vertexCount];
   }

   public AdjacencyMatrix(int vertexCount, String[] vertexArr) {
      this(vertexCount);
      this.vertexArr = vertexArr;
   }

   public void addEdge(String a, String b) {
      int firIndex = getIndex(a);
      int secIndex = getIndex(b);
      if(firIndex >= 0 && firIndex < this.vertexCount && secIndex >= 0 && secIndex < this.vertexCount) {
         this.matrix[firIndex][secIndex] = 1;
         this.matrix[secIndex][secIndex] = 1;
      }
   }

   public void removeEdge(String a, String b) {
      int firIndex = getIndex(a);
      int secIndex = getIndex(b);
      if(firIndex >= 0 && firIndex < this.vertexCount && secIndex >= 0 && secIndex < this.vertexCount) {
         this.matrix[firIndex][secIndex] = 0;
         this.matrix[firIndex][secIndex] = 0;
      }
   }

   public boolean isEdge(String a, String b) {
      int firIndex = getIndex(a);
      int secIndex = getIndex(b);
      if(firIndex >= 0 && firIndex < this.vertexCount && secIndex >= 0 && secIndex <this.vertexCount) {
         if(this.matrix[firIndex][secIndex] == 1) {
            System.out.println("Edge available");
            return true;
         }
      }
      System.out.println("Edge NOT available");
      return false;
   }

   public int getIndex(String a) {
      for(int i=0;i<this.vertexArr.length;i++) {
         if(vertexArr[i].equals(a)) {
            return i;
         }
      }
      return -1;
   }

}
