public class EggDropping {

   // Given a Certain Number of Floors and a Certain Number of Eggs. What is Minimum Number of Attempts required to Find from Which Floor the Egg Will Start Breaking.

   // 1 -> Using DP           -  O(n * k^2)
   // 2 -> Using Recursion    -  O(?)

   public static void eggDropping(int totalEggs, int totalFloors) {

      int[][] a = new int[totalEggs][totalFloors];


      for(int i=0;i<a[0].length;i++) {
         a[0][i] = i+1;
      }

      for(int eggs=2;eggs<=totalEggs;eggs++) {

         for(int floors=1;floors<=totalFloors;floors++) {
            int minValue = 10000;
            if(eggs > floors) {
               minValue = a[(eggs-1)-1][(floors-1)];
            } else {
               for(int floorTrail=1;floorTrail <= floors;floorTrail++) {
                  int value = 0;
                  int breakValue = 0;
                  int unBreakValue = 0;
                  if((floorTrail -1) > 0) {
                     breakValue = a[(eggs-1)-1][(floorTrail-1)-1];
                  }
                  if((floorTrail +1) <= floors) {
                     unBreakValue = a[(eggs-1)][floors - floorTrail - 1];
                  }
                  value = 1 + Integer.max(breakValue, unBreakValue);
                  minValue = Integer.min(minValue, value);
               }
            }
            a[(eggs-1)][(floors-1)] = minValue;
         }

      }

      for(int[] row : a) {
         for(int value : row) {
            System.out.print(value+"  ");
         }
         System.out.println();
      }


   }

   public static int eggDroppingRecur(int totalEggs, int totalFloors) {

      if(totalEggs == 1) {
         return totalFloors;
      }
      if(totalFloors <= 1 ) {
         return totalFloors;
      }
      int min = Integer.MAX_VALUE;
      for(int i=1;i<totalFloors;i++) {
         int value = 1 + Integer.max(eggDroppingRecur(totalEggs-1, i-1), eggDroppingRecur(totalEggs, totalFloors-i));
         min = Integer.min(min, value);
      }

      return min;
   }

}
