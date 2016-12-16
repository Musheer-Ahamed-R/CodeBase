import java.util.*;

public class ShortestPath {

   // Given a MxN matrix where each element can either be 0 or 1. We need to find the shortest path between a given source cell to a destination cell.
   // The path can only be created out of a cell if its value is 1.

   public static int[] rows = {-1, -1, -1, 0, 1, 1,  1, 0};
   public static int[] cols = {-1,  0,  1, 1, 1, 0, -1, -1};

   static boolean[][] isChecked = new boolean[9][9];

   public static int shortestPath(int[][] a, int rowIndex, int colIndex, int finalRow, int finalCol, Set<Cell> path) {
      System.out.println(rowIndex+"  "+colIndex);

      if(rowIndex == finalRow && colIndex == finalCol) {
         //System.out.println("-------------------------------------------------------------------------");
         return 1;
      }
      int pathDist = 0;
      Cell currentCell = new Cell(rowIndex, colIndex);
      path.add(currentCell);
      for(int i=0;i<rows.length;i++) {
         Cell cell = new Cell(rowIndex+rows[i], colIndex+cols[i]);
         System.out.println("Checking from "+currentCell+" to Cell "+cell);
         if(cell.rowIndex < 0 || cell.rowIndex >= a.length || cell.colIndex < 0 || cell.colIndex >= a[0].length) {
            continue;
         }
         if(a[cell.rowIndex][cell.colIndex] == 0) {
            continue;
         }
         if(path.contains(cell)) {
            System.out.println("---------------------ALREADY VISITED----------------------------------------------------"+cell);
            continue;
         }
         if(isChecked[cell.rowIndex][cell.colIndex]) {
            System.out.println("---------------------PATH LEADS NOWHERE----------------------------------------------------"+cell);
            continue;
         }
         System.out.println("Going from "+currentCell+" to Cell "+cell);
         pathDist = shortestPath(a, rowIndex + rows[i], colIndex + cols[i], finalRow, finalCol, path);
         if(pathDist > 0) {
            break;
         }
         //pathDist = Integer.min(pathDist, shortestPath(a, rowIndex + rows[i], colIndex + cols[i], finalRow, finalCol, path));
      }
      path.remove(currentCell);
      if(pathDist == 0) isChecked[rowIndex][colIndex] = true;
      return pathDist == 0 ? pathDist : pathDist + 1;
   }

}
