public class TicTacToe {

   // A Tic-Tac-Toe board is given after some moves are played.
   // Find out if the given board is valid, i.e., is it possible to reach this board position after some moves or not.



   // Notes :
   //    -> Count of X and O should be equal or X having 1 Count gteater than O
   //    -> Both Cannot win(X winning in Row wise and O Winning in Column wise is Not Possible)
   //    -> If X Wins, then X Count Should be One Greater the O
   //    -> If O Wins, then O Count Should Equal to X
   //    -> Checking for Multiple Wins is Not Necessary, Since in that case the Board will become Invalid in the First Case itself.

   static int[][] checkArray = {{0, 1, 2},
                                {3, 4, 5},
                                {6, 7, 8},
                                {0, 3, 6},
                                {1, 4, 7},
                                {2, 5, 8},
                                {0, 4, 8},
                                {2, 4, 6}};

   public static void isTicTacToeValidMain(int[] a) {

      int totalXCount = 0;
      int totalYCount = 0;
      for(int i=0;i<a.length;i++) {
         if(a[i] == 0)  totalXCount++;
         if(a[i] == 1)  totalYCount++;
      }
      if(totalXCount - totalYCount == 1 || totalXCount - totalYCount != 0) {
         boolean isValid = false;
         isValid = isTicTacToeValid2(a, 0, 2, totalXCount, totalYCount);
         isValid = isValid && isTicTacToeValid2(a, 3, 5, totalXCount, totalYCount);
         isValid = isValid && isTicTacToeValid2(a, 6, 7, totalXCount, totalYCount);
      } else {
         System.out.println("Invalid");
      }
   }

   public static boolean isTicTacToeValid2(int[] a, int start, int to, int totalXCount, int totalYCount) {

      int xCount = 0;
      int yCount = 0;
      int xWins = 0;
      int yWins = 0;
      for(int i=start;i<=to;i++) {

         if(a[checkArray[i][0]] == 0) {
            xCount++;
         } else if(a[checkArray[i][0]] == 1) {
            yCount++;
         }
         if(a[checkArray[i][1]] == 0) {
            xCount++;
         } else if(a[checkArray[i][0]] == 1) {
            yCount++;
         }
         if(a[checkArray[i][2]] == 0) {
            xCount++;
         } else if(a[checkArray[i][0]] == 1) {
            yCount++;
         }
         if(xCount == 3) {
            xWins++;
         } else if(yCount == 3) {
            yWins++;
         }
         if(xWins == 1) {
            if(totalXCount - totalYCount != 1) {
               System.out.println("Invalid first");
               return false;
            } else
               return true;
         } else if(yWins == 1) {
            if(totalXCount - totalYCount != 0) {
               System.out.println("Invalid second");
               return false;
            } else
               return true;
         } else if(xWins == yWins && xWins == 1) {
            System.out.println("Invalid third");
            return false;
         }
         xCount = yCount = 0;
      }


      return true;
   }



}
