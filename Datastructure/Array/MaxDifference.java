public class MaxDifference {

   // Maximum difference between two elements such that larger element appears after the smaller number

   // In this method,we take the difference with the minimum element found so far. So we need to keep track of 2 things:
   // 1) Maximum difference found so far (max_diff).
   // 2) Minimum number visited so far (min_element).

   public static void maximumDifference(int[] a) {

      int minElem = a[0];
      int diff = -1000;
      for(int i=1;i<a.length;i++) {
         if(a[i] < minElem) {
            minElem = a[i];
         } else {
            int tempDiff = a[i] - minElem;
            if(tempDiff > diff) {
               diff = tempDiff;
            }
         }
      }
      System.out.println(diff);
   }



}
