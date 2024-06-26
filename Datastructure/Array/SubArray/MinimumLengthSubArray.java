import java.util.*;

public class MinimumLengthSubArray {

   // Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number.

   // SubArray is Defined as a Continious part of the Given Array.

   // 1 -> Using Two Loops(Brute Force)                  -  O(n^2)
   // 2 -> Sliding Window Method. Using a Single Loops   -  O(n)
   //      and Eliminating the First Element(s) if sum
   //      becomes greater than the Required Sum
   // 3 -> Storing Sum Upto It in a Map and Checking it.
   //          -> Each Element has a SUM(Not Sub-Array) "UPTO IT".(Kadane's Algorithm Stores the Maximum "Sub-Array" ending upto Current Element).
   //          -> That "ENDING SUM" is Maintained in a Map.
   //          -> Sum = Curr_Sum - x. (Because Curr_Sum is total Sum and Subtracting it with a Value will Give Sum. That Value is the Ending Value,
   //             thus we can form Sub-Array after the index Containing that Value)
   //             x = Curr_Sum - Sum
   //             If the x value is Available in Map, then we form a SubArray after the Index containing the Value(x).
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

      if(sum == reqSum) {
         System.out.println("Sum Found at FIRST INCEX");
      }
      for(int i=1;i<a.length;i++) {
         sum += a[i];
         while(reqSum < sum && start <= i) {   // (i-1), because only elements till i-1 has been added in the Sum.(Current Element is added atlast).
            sum -= a[start];
            start++;                           // Start index could go beyond the Current i value. But, it is not a Problem as it will be matched in the Next Iteration.
         }
         System.out.println(sum);
         if(reqSum == sum) {                 // This MUST be Before ADDING the Current Element because we dont want the sum to greater while comparing.
            if(start > i) {
               start --;
            }
            System.out.println("The Sum "+reqSum+" is Found at "+start+" -> "+i);
            return;
         }
      }
      System.out.println("No SubArray Found");
   }

   public static void minimumLengthSubArray3(int[] a, int reqSum) {
      Map<Integer, Integer> map = new HashMap<>();

      int currSum = 0;
      for(int i=0;i<a.length;i++) {
         currSum += a[i];
         if(currSum == reqSum) {
            System.out.println("Found from 0 -> "+i);
            return;
         }
         if(map.get(currSum - reqSum) != null) {
            System.out.println("Found from----- "+(map.get(currSum - reqSum)+1) +" -> "+i);
         }
         map.put(currSum, i);
      }

   }


}
