public class Pivot {

   // Given a Sorted Array which is Rotated  any Number of Times. Find the Pivot Index(Minumum Element Index)

   // 1 -> Iterate and Find if a[i] < a[i+1], else return 0(Not Rotated at all)     -  O(n)
   // 2 -> Binary Search

   public static int findPivot(int[] a) {

      int low = 0;
      int high = a.length-1;

      if(a[0] - a[a.length-1] < 0) {
         System.out.println("The Array is Not Rotated ");
         return 0;
      }
      while(low <= high) {
         int mid = (low + high)/2;
         if(a[mid] - a[mid+1] > 0) {   // Here only checking for (mid - 1) may not give the Correct Result
            System.out.println("The Pivot Index is "+(mid+1));
            return mid+1;
         } else if(a[mid] - a[low] < 0) {
            high = mid-1;
         } else {
            low = mid+1;
         }
      }
      return -1;
   }

}
