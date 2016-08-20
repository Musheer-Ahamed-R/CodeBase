public class QuickSort {


   public static void quickSort(int[] arr, int start, int end) {
      if(start >= end) {
         return;
      }

      int pIndex = sortBasedOnPivot(arr, start, end);
      quickSort(arr, start, pIndex - 1);
      quickSort(arr, pIndex + 1, end);
   }

   // Here, we say that the start point is the position of the pivot after rearranging(i.e no elements are less than the pivot)
   // and we increment the pivot index if we found any element which is less than or equal to the pivot
   // and we finally swap the last element(pivot, in this case) and the element at the pivot index.
   public static int sortBasedOnPivot(int[] arr, int start, int end) {

      int pivot = arr[end];
      int pIndex = start;
      for(int j=start;j<end;j++) {
         if(arr[j] <= pivot) {
            Application.swap(arr, pIndex, j);
            pIndex++;
         }
      }
      Application.swap(arr, pIndex, end);

      return pIndex;
   }



}
