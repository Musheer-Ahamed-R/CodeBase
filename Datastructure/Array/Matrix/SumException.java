public class SumException {

   // Find sum of all elements in a matrix except the elements in row and/or column of given cell?


   // 1 -> Using Three Loops
   // 2 -> Calculate Total Sum. Then for Eacg Cell the Desired Sum is "sum - a[i][] - a[][j] + a[i][j]"


   public static void sumException(int[][] a, Cell[] cells) {

      int totalSum = 0;
      for(int i=0;i<a.length;i++) {
         for(int j=0;j<a[i].length;j++) {
            totalSum += a[i][j];
         }
      }

      for(int i=0;i<cells.length;i++) {
         int rowIndex = cells[i].rowIndex;
         int colIndex = cells[i].colIndex;

         int rowSum = 0;
         for(int j=0;j<a[rowIndex].length;j++) {
            rowSum += a[rowIndex][j];
         }
         int colSum = 0;
         for(int j=0;j<a.length;j++) {
            colSum += a[j][colIndex];
         }
         System.out.println("The Required Sum is "+(totalSum - rowSum - colSum + a[rowIndex][colIndex]));
      }
   }


}
