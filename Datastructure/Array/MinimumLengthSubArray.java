public class MinimumLengthSubArray {

   // Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

   // SubArray is Defined as a Continious part of the Given Array.

   // 1 -> Using Two Loops(Brute Force)               -  O(n^2)
   // 2 -> Using a Single Loops and Eliminating the   -  O(n)
   //      First Element if sum becomes greater
   //      than the Required Sum
   // Note :
   //    -> The Second Method Does Not Support Negative Values.

   public static void minimumLengthSubArray(int[] a, int reqSum) {

      int minStartIndex = 0;
      int minEndIndex = 1000;
      for(int i=0;i<a.length;i++) {
         int sum = a[i];
         if(sum == reqSum) {
            minStartIndex = i;
            minEndIndex = i;
            System.out.println("The Required sum is found at SINGLE INDEX -> "+i);
            continue;
         }
         for(int j=i+1;j<a.length && (j-i < (minEndIndex - minStartIndex));j++) {      // j = i + 1, because the Values before j have already been considered in the Previous Iteration.
            sum += a[j];
            if(sum == reqSum) {
               //System.out.println("The Required SubArray is From "+i+" -> "+j);
               if((minEndIndex - minStartIndex) > (j - i) ) {
                  minStartIndex = i;
                  minEndIndex = j;
               }
            }
         }
      }
      if(minEndIndex != 1000) {
         System.out.println("The Required SubArray is From "+minStartIndex+" -> "+minEndIndex);
      } else {
         System.out.println("The Required SubArray is NOT FOUND");
      }
   }

   public static void minimumLengthSubArray2(int[] a, int reqSum) {

      int sum = a[0];
      int start = 0;
      int end = 0;

      if(sum == reqSum) {
         System.out.println("Sum Found at FIRST INCEX");
      }

      for(int i=1;i<a.length;i++) {
         sum += a[i];
         while(reqSum < sum && start <= i) {   // (i-1), because only elements till i-1 has been added in the Sum.(Current Element is added atlast).
                                                   // start < (i-1), so that the start value is maintained for Printing Below.
            sum -= a[start];
            start++;
         }
         if(reqSum == sum) {                 // This is Before adding the Current Element because for Considering the First Element too.
            if(start > i) {
               start --;
            }
            System.out.println("The Sum "+reqSum+" is Found at "+start+" -> "+(i));
            end = i-1;
            return;
         }
      }







      /*for(int i=1;i<=a.length;i++) {               // <= a.length, because to check the sum after adding the last Element

                                             // This check MUST be after removing the Making the Sum Lesser than the Required Sum.(i.e After Removing Front Elements)
         if(reqSum == sum) {                 // This is Before adding the Current Element because for Considering the First Element too.
            if(start = i) {
               start --;
            }
            System.out.println("The Sum "+reqSum+" is Found at "+start+" -> "+(i-1));
            end = i-1;
            return;
         }
         if(i<a.length) {
            sum += a[i];
         }
      }*/
      System.out.println("No SubArray Found");
   }


}
