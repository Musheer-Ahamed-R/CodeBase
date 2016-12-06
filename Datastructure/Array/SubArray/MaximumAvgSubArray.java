public class MaximumAvgSubArray {

   // Given an Array and a Number k, print the Maximum Average Sub-Array of Size k.
   // Maximum Average Sub-Array of Sise k is a Sub-Array for which the Average is Maximum among all Possible Sub-Array of Size k in the Array.
   // Since k > 0 and the Maximum SUM Sub-Array of Size k will also be equal to the Maximum Average Sub-Array of Size k.

   // 1 -> Sliding Window Stratergy. Calculate the Sum for Each Window and update the Max


   public static void main(String[] args) {

      int[] a = {11, -8, 16, -7, 24, -2, 3};
      int k = 3;

      int currSum = 0;
      int maxSum = -1;
      int maxStart = 0, maxEnd = k-1;
      for(int i=0;i<k;i++) {
         currSum += a[i];
      }
      maxSum = currSum;                                // if Average is required, then divide the Sum by k 
      for(int i=1, j=k;j<a.length;i++, j++) {
         currSum -= a[i-1];
         currSum += a[j];
         if(currSum > maxSum) {
            maxSum = currSum;
            maxStart = i;
            maxEnd = j;
         }
      }
      System.out.println(maxStart+" "+maxEnd+" "+maxSum);
   }
}
