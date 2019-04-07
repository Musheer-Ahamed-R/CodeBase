import java.util.*;

public class ShortestPath {

   // Given a MxN matrix where each element can either be 0 or 1. We need to find the shortest path between a given source cell to a destination cell.
   // The path can only be created out of a cell if its value is 1.

   // 1 -> Using DFS                   -  O(?)
   // 2 -> Using BFS(Preffered)        -  O(M * N)

   // public static int[] rows = {-1, -1, -1, 0, 1, 1,  1, 0};
   // public static int[] cols = {-1,  0,  1, 1, 1, 0, -1, -1};
   public static int[] rows = {-1, 0, 1, 0};
   public static int[] cols = { 0, 1, 0, -1};
   static int[][] isChecked = new int[10][10];
   static boolean[][] isVisited = new boolean[10][10];     // Here Boolean cannot be used because we need Three States (Initial, Not Reachable, Reachale).
   static {
      for(int i=0;i<isChecked.length;i++) {
         Arrays.fill(isChecked[i], -1);
      }
   }


   // The Most Vital Part in case of DFS is to Avoid the Cell to Collide With Its Ancestors().
   // Destination cannot be Reached from the Current Only if the Path from Current Cell is Not Blocked its Ancestors.
   // BUT THIS IS NOT POSSIBLE AT ALL, Since from the Current Cell We can Always Reach its Previous Cell.
   // MEMOIZATION is Not Possible while finding the Shortest path
   public static int shortestPathDfs(int[][] a, int rowIndex, int colIndex, int finalRow, int finalCol, Set<Cell> path) {

      if(a[rowIndex][colIndex] == 0) {
         return 0;
      }
      if(rowIndex == finalRow && colIndex == finalCol) {
         return 1;
      }
      int pathDist = 0;
      Cell currentCell = new Cell(rowIndex, colIndex);
      path.add(currentCell);
      boolean isAlreadyVisited = false;
      for(int i=0;i<rows.length;i++) {
         Cell cell = new Cell(rowIndex+rows[i], colIndex+cols[i]);
         if(!isValid(a, cell.rowIndex, cell.colIndex)) {
            continue;
         }
         if(path.contains(cell)) {
            continue;
         }
         int tempPath = shortestPathDfs(a, rowIndex + rows[i], colIndex + cols[i], finalRow, finalCol, path);
         if(pathDist == 0) {
            pathDist = tempPath;
         } else if(tempPath != 0){
            pathDist = Integer.min(pathDist, tempPath);
         }
      }
      path.remove(currentCell);
      pathDist = pathDist == 0 ? pathDist : pathDist + 1;

      return pathDist;
   }

   public static int shortestPathBfs(int[][] a, CellWithDistance source, CellWithDistance dest) {
      Queue<CellWithDistance> q = new ArrayDeque<>();
      q.add(source);
      while(!q.isEmpty()) {
         CellWithDistance currentCell = q.remove();
         if(currentCell.rowIndex == dest.rowIndex && currentCell.colIndex == dest.colIndex) {
            System.out.println("HURREH");
            return currentCell.dist;
         }
         for(int i=0;i<rows.length;i++) {
            int childRow = currentCell.rowIndex+rows[i];
            int childCol = currentCell.colIndex+cols[i];
            if(isValid(a, childRow, childCol) && a[childRow][childCol] != 0 && !isVisited[childRow][childCol]) {
               CellWithDistance childCell = new CellWithDistance(childRow, childCol, currentCell.dist+1);
               isVisited[childRow][childCol] = true;
               q.add(childCell);
            }
         }
      }

      return -1;
   }

   public static boolean isValid(int[][] a, int rowIndex, int colIndex) {

      if(rowIndex >= 0 && rowIndex < a.length && colIndex >= 0 && colIndex < a[0].length)
         return true;

      return false;
   }
}
