public class MaxProdSubArray {

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

// ------------------NOT YET COMPLETE --------------------


   public static void maxProd(int[] a) {

      int currProd = a[0];
      int maxProd = currProd;
      for(int i=1;i<a.length;i++) {
         currProd = Integer.max(a[i], a[i] * currProd);
         if(maxProd < currProd) {
            maxProd = currProd;
         }
      }
      System.out.println(maxProd);

   }



}
