public class FindString {

   int[] row = new int[]{};
   int[] column = new int[]{};

   public boolean findString(char[][] matrix, int i, int j, String str, int charIndex, int direction) {
      if(i < 0 || j < 0 || j >= matrix[0].length || i >= matrix.length) {
         return false;
      }
      if(str.charAt(charIndex) == matrix[i][j]) {
         if(charIndex == str.length()-1) {
            return true;
         }
         charIndex++;
         switch(direction) {
            case 1 :
               return findString(matrix, i-1, j-1, str, charIndex, direction);
            case 2 :
               return findString(matrix, i, j-1, str, charIndex, direction);
            case 3 :
               return findString(matrix, i+1, j-1, str, charIndex, direction);
            case 4 :
               return findString(matrix, i+1, j, str, charIndex, direction);
            case 5 :
               return findString(matrix, i+1, j+1, str, charIndex, direction);
            case 6 :
               return findString(matrix, i, j+1, str, charIndex, direction);
            case 7 :
               return findString(matrix, i-1, j+1, str, charIndex, direction);
            case 8 :
               return findString(matrix, i-1, j, str, charIndex, direction);
         }
      }
      return false;
   }

   public void finalAttempt(char[][] matrix, String str) {
      for(int i=0;i<matrix.length;i++) {
         for(int j=0;j<matrix[i].length;j++) {
            if(matrix[i][j] == str.charAt(0)) {
               //System.out.println("Starting Searching at "+ i +" , "+j);
               boolean isFound = false;
               isFound = isFound || findString(matrix, i-1, j-1, str, 1, 1);
               isFound = isFound || findString(matrix, i, j-1, str, 1, 2);
               isFound = isFound || findString(matrix, i+1, j-1, str, 1, 3);
               isFound = isFound || findString(matrix, i+1, j, str, 1, 4);
               isFound = isFound || findString(matrix, i+1, j+1, str, 1, 5);
               isFound = isFound || findString(matrix, i, j+1, str, 1, 6);//
               isFound = isFound || findString(matrix, i-1, j+1, str, 1, 7);
               isFound = isFound || findString(matrix, i-1, j, str, 1, 8);
               if(isFound) {
                  System.out.println("Starting Index "+ i +" , "+j);
               }
            }
         }
      }



   }


   // public boolean findChar(char[][] matrix, int i, int j, String str, int charIndex) {
   //    boolean isFound = false;
   //    isFound = isFound || findString(matrix, i-1, j-1, str, charIndex);
   //    isFound = isFound || findString(matrix, i-1, j, str, charIndex);
   //    isFound = isFound || findString(matrix, i-1, j+1, str, charIndex);
   //    isFound = isFound || findString(matrix, i, j+1, str, charIndex);
   //    isFound = isFound || findString(matrix, i+1, j+1, str, charIndex);
   //    isFound = isFound || findString(matrix, i+1, j, str, charIndex);
   //    isFound = isFound || findString(matrix, i+1, j-1, str, charIndex);
   //    isFound = isFound || findString(matrix, i, j-1, str, charIndex);
   //
   //    return isFound;
   // }


}
