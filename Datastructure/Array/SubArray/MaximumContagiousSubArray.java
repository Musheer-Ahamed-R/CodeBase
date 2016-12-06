import java.util.*;

public class MaximumContagiousSubArray {

   // Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.

   // 1 -> Using Two Loops
   // 2 -> Using Deque to Store Only the Useful Elements.(This results in Descending Order of Elements in the Queue).

   public static void main(String[] args) {
      int[] a = {8, 5, 10, 7, 9, 4, 5, 12, 90, 13};
      int k = 4;


      ArrayDeque<Integer> aq = new ArrayDeque<>();

      aq.addLast(0);
      for(int i=0, j = 1, count = 2;j<a.length;j++, count++) {
         while(!aq.isEmpty() && a[aq.getLast()] < a[j]) {
            aq.removeLast();
         }
         aq.addLast(j);                // The Current Element has to added either it is minmum or maximum.

         if(count == k) {          // if End of the Window
            System.out.println(a[aq.getFirst()]);
            if(aq.getFirst() == i) {
               aq.removeFirst();
            }
            i++;                    // Updating Start for the Next Window
            count--;
         }
      }
   }


}
