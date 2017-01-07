public class QuickSelect {

   // Note : Here k is the Nth Element - 1(For Supporting Index based Search)
   public static void getMinValue(int[] a, int start, int end, int k) {
      if(start >= end) {
         if(start == end && start == k) {
            System.out.println("------------The Kth Largest Element is "+a[start]);
         }
         return;
      }

      int pivot = partition(a, start, end);
      if(k == pivot) {
         System.out.println("The Kth Largest Element is "+a[pivot]);
         return;
      }
      if(k < pivot) {
            getMinValue(a, start, pivot-1, k);
      } else {
         getMinValue(a, pivot+1, end, k);
      }
   }

   public static int partition(int[] a, int left, int right) {

      int partitionValue = a[right];
      int pivot = left;
      for(int i=left;i<=right;i++) {
         if(a[i] < partitionValue) {
            swap(a, pivot, i);
            pivot++;
         }
      }
      swap(a, pivot, right);

      return pivot;
   }

   public static void swap(int[] a, int firstIndex, int lastIndex) {

      int temp = a[firstIndex];
      a[firstIndex] = a[lastIndex];
      a[lastIndex] = temp;
   }

}
