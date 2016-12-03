public class PivotSearch {

   // Search an element in a sorted and rotated array

   public static void findPivotElem(int[] a, int elem) {

      int start = 0;
      int end = a.length-1;

      if(a[0] - a[a.length-1] < 0) {
         System.out.println("The Array is Not Rotated ");
         return;
      }
      while(start <= end) {
         int mid = (start + end)/2;
         if(a[mid] == elem) {
            System.out.println()
         }




      }

   }



}
