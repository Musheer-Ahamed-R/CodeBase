public class CountOne {

   // Count 1’s in a sorted binary array

   // 1 -> Using Linear Search/Traversing
   // 2 -> Using Binary Search
   // 3 -> Using Sum

   public static void binarySearch(int[] a) {

      int low = 0;
      int high = a.length-1;
      while(low < high) {
         int mid = (low + high)/2;
         if(a[mid] == 0) {
            high = mid;
         } else {
            low = mid + 1;
         }
         System.out.println("---------");
      }
      if(a[low] == 0) {
         low--;
      }
      System.out.println(low+1);
   }



}
