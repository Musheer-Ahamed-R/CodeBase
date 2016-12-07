public class FixedPoint {

   // Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array,
   // if there is any Fixed Point present in array, else returns -1. Fixed Point in an array is an index i such that arr[i] is equal to i.
   // Note that integers in array can be negative.

   // 1 -> Using Linear Search      -  O(n)
   // 2 -> Using Binary Search      -  O(logn)

   public static void fixedPoint(int[] a) {

      int start = 0;
      int end = a.length-1;
      while(start < end) {
         int mid = (start + end)/2;
         if(a[mid] < 0) {
            start = mid+1;
         } else if(mid < a[mid]) {
            end = mid;
         } else if(mid > a[mid]) {
            start = mid + 1;
         } else if(a[mid] == mid) {
            System.out.println("The Fixed Point is at Index "+mid);
            return;
         }
      }
      if(a[start] == start) {
         System.out.println("The Fixed Point is at Index "+start);
      } else {
         System.out.println("The Fixed Point is NOT AVAILABLE");
      }

   }

}
