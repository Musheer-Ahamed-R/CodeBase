public class SpecificPair {

   // Given an n x n matrix mat[n][n] of integers, find the maximum value of mat(c, d) – mat(a, b) over all choices of indexes
   // such that both c > a and d > b.


   // 1 -> Using Four Loops         -  O(n^4)
   // 2 -> Using DP                 -  O(n^2)


   public static void specificPair(int[][] a) {


      int[][] maxUntilMatrix = new int[a.length][a[0].length];
      int maxValue = Integer.MIN_VALUE;

      for(int i=a.length-1;i>=0;i--) {
         for(int j=a.length-1;j>=0;j--) {
            maxUntilMatrix[i][j] = Integer.max(getValue(a, i, j), Integer.max(getValue(maxUntilMatrix, i+1, j), getValue(maxUntilMatrix, i, j+1)));
            maxValue = getMaxValue(maxValue, a[i][j], getValue(maxUntilMatrix, i+1, j+1));
         }
      }
      for(int i=0;i<a.length;i++) {
         for(int j=0;j<a[0].length;j++) {
            System.out.print(maxUntilMatrix[i][j]+"   ");
         }
         System.out.println();
      }
      System.out.println("The Max Value is "+maxValue);

   }

   public static int getValue(int[][] a, int i, int j) {
      if(i >= 0 && i < a.length && j>= 0 && j<a[0].length) {
         return a[i][j];
      }

      return Integer.MIN_VALUE;
   }

   public static int getMaxValue(int maxValue, int firstValue, int secondValue) {
      if(secondValue == Integer.MIN_VALUE) {
         return maxValue;
      }

      return Integer.max(maxValue, secondValue - firstValue);
   }

}
