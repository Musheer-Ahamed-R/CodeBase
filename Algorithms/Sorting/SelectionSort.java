import java.util.*;

public class SelectionSort {

   /*
      1 -> We move the lowest element in the current Iteration to the Start of the Iteration

   */

   public static void selectionSort(int[] arr) {
      for(int i=0;i<arr.length-1;i++) {
         int minIndex = i;
         for(int j=i+1;j<arr.length;j++) {
            if(arr[minIndex] > arr[j]) {
               minIndex = j;
            }
         }
         Application.swap(arr, i, minIndex);
      }
      System.out.println(Arrays.toString(arr));
   }



}
