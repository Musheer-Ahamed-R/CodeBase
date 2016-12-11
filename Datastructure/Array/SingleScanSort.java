public class SingleScanSort {

   // Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. The functions should put all 0s first,
   // then all 1s and all 2s in last.
   // Note :
   //    -> This is Done in a Single Scan.


   // 1 -> ALGO Dutch National Algorithm.
   //          -> i is the place where the Next Red Ball can be placed.
   //          -> j is the place where the Next White Ball can be placed.
   //          -> k is the place where the Next Blue Ball can be placed.

   public static void singleScanSort(int[] a) {
      int i=0;
      int j=0;
      int k = a.length-1;
      while(j<=k) {
         if(a[j] == 0) {
            Swap.swap(a, i, j);
            i++;
            j++;              // (Not Necessary). Here j++ because the value being swapped HAS to be White(the Place between i(Inclusive) and j(exclusive) is always White.
         } else if(a[j] == 1) {
            j++;
         } else if(a[j] == 2) {
            Swap.swap(a, j, k);
            k--;
         }
      }
      for(int elem : a) {
         System.out.print(elem+"  ");
      }


   }





}
