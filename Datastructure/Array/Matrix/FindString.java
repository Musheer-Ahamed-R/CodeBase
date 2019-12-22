public class FindString {

   // Question

   // Solution is Complete but thw Question and Time Cokplexity are INCOMPLETE
   //    Notes :


   public static int[] rows = {-1, -1, -1, 0, 1, 1,  1, 0};
   public static int[] cols = {-1,  0,  1, 1, 1, 0, -1, -1};

   public static boolean findString(char[][] matrix, int i, int j, String str, int charIndex, int rowDir, int colDir) {
      if(i < 0 || j < 0 || j >= matrix[0].length || i >= matrix.length) {
         return false;
      }
      if(str.charAt(charIndex) == matrix[i][j]) {
         if(charIndex == str.length()-1) {
            return true;
         }

         return findString(matrix, i+rowDir, j+colDir, str, ++charIndex, rowDir, colDir);
      }
      return false;
   }

   public static void finalAttempt(char[][] matrix, String str) {
      for(int i=0;i<matrix.length;i++) {
         for(int j=0;j<matrix[i].length;j++) {
            if(matrix[i][j] == str.charAt(0)) {
               boolean isFound = false;
               for(int k=0; k<rows.length;k++) {
                  isFound = findString(matrix, i + rows[k], j + cols[k], str, 1, rows[k], cols[k]);
                  if(isFound) {
                     System.out.println("Starting Index "+ i +" , "+j);
                     break;
                  }
               }
            }
         }
      }
   }

}
