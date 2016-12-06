public class UnSortedArrayToCompleteSorted {

   // Given an Sorted Array, find the Minimum/Shortest Sub-Array which upon Sorting will result in a Complete Sorted Array.

   // Using Multiple Loops(Simple Logic)           -  O(n)    

   public static void subArrayToSort(int[] a) {

      int start = 0;
      int end = 0;
      for (int i=0; i<a.length-1; i++) {
         if(a[i] > a[i+1]) {
            start = i;
            break;
         }
      }

      for(int i=a.length-1;i>0;i--) {
         if(a[i] < a[i-1]) {
            end = i;
            break;
         }
      }
      int minValue = 1000;
      int maxValue = -1000;
      for(int i=start;i<=end;i++) {
         if(a[i] < minValue) {
            minValue = a[i];
         }
         if(a[i] > maxValue) {
            maxValue = a[i];
         }
      }

      for(int i=0;i<start;i++) {
         if(a[i] > minValue) {
            start = i;
            break;
         }
      }
      for(int i=a.length-1;i>end;i--) {
         if(a[i] < maxValue) {
            end = i;
            break;
         }
      }
      System.out.println(a[start]+" "+a[end]+" "+minValue+" "+maxValue);

   }
}
