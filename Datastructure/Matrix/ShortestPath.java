public class ShortestPath {

   // Given a MxN matrix where each element can either be 0 or 1. We need to find the shortest path between a given source cell to a destination cell.
   // The path can only be created out of a cell if its value is 1.

   private static int[] rows = {-1, -1, -1, 0, 1, 1,  1, 0};
   private static int[] cols = {-1,  0,  1, 1, 1, 0, -1, -1};

   public static int shortestPath(int[][] a, int rowIndex, int colIndex, int finalRow, int finalCol) {
      // System.out.println(rowIndex+"  "+colIndex+"  "+finalRow+"  "+finalCol);
      if(rowIndex < 0 || rowIndex >= a.length || colIndex < 0 || colIndex >= a[0].length) {
         return 0;
      }
      if(a[rowIndex][colIndex] == 0) {
         return 0;
      }
      if(rowIndex == finalRow && colIndex == finalCol) {
         return 1;
      }
      int path = 0;
      for(int i=0;i<rows.length;i++) {
         path = Integer.max(path, shortestPath(a, rowIndex + rows[i], colIndex + cols[i], finalRow, finalCol));
      }

      return path == 0 ? path : path + 1;
   }

}
