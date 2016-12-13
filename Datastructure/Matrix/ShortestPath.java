public class ShortestPath {

   // Given a MxN matrix where each element can either be 0 or 1. We need to find the shortest path between a given source cell to a destination cell.
   // The path can only be created out of a cell if its value is 1.

   public static int[] rows = {-1, -1, -1, 0, 1, 1,  1, 0};
   public static int[] cols = {-1,  0,  1, 1, 1, 0, -1, -1};

   public static int shortestPath(int[][] a, int rowIndex, int colIndex, int finalRow, int finalCol, int fromRow, int fromCol) {
      System.out.println(rowIndex+"  "+colIndex);
      if(rowIndex < 0 || rowIndex >= a.length || colIndex < 0 || colIndex >= a[0].length) {
         return 0;
      }
      if(a[rowIndex][colIndex] == 0) {
         return 0;
      }
      if(rowIndex == finalRow && colIndex == finalCol) {
         //System.out.println("-------------------------------------------------------------------------");
         return 1;
      }
      int path = 0;
      for(int i=0;i<rows.length;i++) {
         if((rowIndex + rows[i]) == fromRow && (colIndex + cols[i]) == fromCol) {
            System.out.println("-------------------------------------------------------------------------");
            continue;
         }
         path = Integer.max(path, shortestPath(a, rowIndex + rows[i], colIndex + cols[i], finalRow, finalCol, rowIndex, colIndex));
      }

      return path == 0 ? path : path + 1;
   }

}
