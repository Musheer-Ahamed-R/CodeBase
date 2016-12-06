public class MaximumAverageSubArray {

   // Given an Array and a Number k, print the Maximum Average Sub-Array of Size k.
   // Maximum Average Sub-Array of Sise k is a Sub-Array for which the Average is Maximum among all Possible Sub-Array of Size k in the Array.
   // Since k > 0 and the Maximum SUM Sub-Array of Size k will also be equal to the Maximum Average Sub-Array of Size k.

   public static void maxAverage(int[] a, int k) {

      int currSum = 0;
      int maxSum = -1;
      int maxStart = -1, maxEnd = -1;
      for(int i=0;i<k;i++) {
         currSum += a[i];
      }
      maxSum = currSum;
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
