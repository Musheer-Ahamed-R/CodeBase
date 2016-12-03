public class PivotSearch {

   // Search an element in a sorted and rotated array

   // 1 -> Binary Search (Find the Pivot and Split it into Two Arrays)            -  O(log n)
   // 2 -> Binary Search (In a Single Traversal, Only Sorted case is Considered)  -  O(log n)
   //          If Left is Not-Sorted, then Right has to be Sorted.

   // Note :
   // It doesn’t look possible to search in O(Logn) time in all cases when duplicates are allowed. For example
   // consider searching 0 in {2, 2, 2, 2, 2, 2, 2, 2, 0, 2} and {2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}. It doesn’t look possible
   // to decide whether to recur for left half or right half by doing constant number of comparisons at the middle.

   public static void findPivotElem(int[] a, int elem) {

      int start = 0;
      int end = a.length-1;
      if(a[0] - a[a.length-1] < 0) {
         System.out.println("The Array is Not Rotated ");
         return;
      }
      boolean isFound = false;
      while(start <= end) {
         int mid = (start + end)/2;
         if(a[mid] == elem) {
            System.out.println("Elem Found");
            isFound = true;
            break;
         }

         // If Left is Not-Sorted, then Right has to be Sorted.
         if(a[mid] - a[start] > 0) {// Left Sorted
            if(elem > start && elem < mid) {
               end = mid - 1;
            } else {
               start = mid+1;
            }
         } else {
            if(elem > mid && elem < end) {
               start = mid + 1;
            } else {
               end = mid - 1;
            }
         }
      }
      if(!isFound) {
         System.out.println("Element Not Found");
      }

   }

}
