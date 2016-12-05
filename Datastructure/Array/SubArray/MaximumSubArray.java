public class MaximumSubArray {

   // Given an Array, we have to find the SubArray Whose Sum is Maximum among all Possible SubArrays.
   // This Sub-Array will be Referred to as MAximum Sum Sub-Array(MSS).

   // SubArray is Defined as a Continious part of the Given Array.

   // 1 -> Using Two Loops (Brute Force)           -  O(n^2)
   // 2 -> ALGO Kadane's ALgorithm                 -  O(n)     Preffered
   //          This Algo says that the Maximum Sub-Array ""ENDING"" at the Current Index, is the
   //          Maximum of Element Itself or Element + Maximum SubArray "Ending" at the Previous Index.
   //          This Algo ONLY Considers the Maximum Sub-Array ""ENDING"" at the Current Element. (i.e Each Element will have
   //          its own Maximum Sub-Array Ending at the Element itself. Maximum of those will give the desired Result.
   //          Highest amongst that will be Maximum SubArray.
   //     Note :
   //       -> This Algorithm works like Dynamic Programming, thus it is Better to Understand from the Start.
   //          Refer - https://youtu.be/86CQq3pKSUw

   public static void maximumSumSubArray(int[] a) {

      int maxSum = -1000;
      int startIndex = 0;
      int endIndex = 0;

      for(int i=0;i<a.length;i++) {
         int sum = a[i];
         if(sum > maxSum) {
            maxSum = sum;
            startIndex = i;
            endIndex = i;
         }
         for(int j=i+1;j<a.length;j++) {        // j = i + 1, because the Values before j have already been considered in the Previous Iteration.
            sum += a[j];
            if(sum > maxSum) {
               maxSum = sum;
               startIndex = i;
               endIndex = j;
            }
         }
      }
      System.out.println("The Max Sub Array is "+maxSum+" from index "+startIndex+"  -> "+endIndex);
   }

   public static void kadaneMaximumSubArray(int[] a) {

      int currentMax = a[0];
      int globalMax = a[0];
      for(int i=1;i<a.length;i++) {
         currentMax = Integer.max(a[i], currentMax+a[i]);
         if(currentMax > globalMax) {
            globalMax = currentMax;
         }
      }
      System.out.println("Kadane's Solution "+globalMax);
   }

}
