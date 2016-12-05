import java.util.*;

public class MinDifference {

   // Find minimum difference between any two elements

   // 1 -> Brute Force Aproach         -  O(n^2)
   // 2 -> Sort and then Find the diff -  O(nLog n)

   public static void minDiff(int[] a) {

      Arrays.sort(a);
      int diff = 10000;
      for(int i=0;i<a.length-1;i++) {
         if(a[i+1] - a[i] < diff) {
            diff = a[i+1] - a[i];
         }
      }
      System.out.println(diff);
   }

}
