public class ReachStairs {

   // Count ways to reach the n’th stair



   // 1 -> Recursive Algorithm            -  Exponential
   // 2 -> Dynamic Programming            -  O(N * M)

   // Notes :
   //    -> This is Similar to the Fibonacci Series. But, the Only Difference is for Find Number of Ways to N,
   //       we have to calculate Number of Ways for N+1.
   //    -> This Follows FIbonbacci Series, because for e.g
   //    -> Number of Ways to reach 2 is (1, 1) and (2)
   //    -> Number of Ways to reach 3 is (1, 1, 1) , (1, 2) and (2, 1)
   //    -> Now, the Number of Ways to Reach 4 will {(1, 1, 2), (2, 2)} + {(1, 1, 1, 1) , (1, 2, 1) and (2, 1, 1)}

   public static int getNumberOfWays(int noOfStaircase, int noOfSteps) {
      if(noOfStaircase <= 0) {
         return 0;
      }
      if(noOfStaircase == 1) {
         return 1;
      }
      int result = 0;
      for(int i=1;i<=noOfSteps && i <= noOfStaircase;i++) {
         result += getNumberOfWays(noOfStaircase-i, noOfSteps);
      }

      return result;
   }

   public static void getNumberOfWaysDynamic(int noOfStairs, int noOfSteps) {

      int[] a = new int[noOfStairs+1];
      a[0] = 0;
      a[1] = 1;
      for(int i=2;i<a.length;i++) {
         for(int j=1;j<=noOfSteps && j <= i;j++) {
            a[i] += a[i-j];
         }
      }
      for(int elem : a) {
         System.out.print(elem+"  ");
      }

   }

}
