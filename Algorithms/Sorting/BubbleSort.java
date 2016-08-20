import java.util.*;

public class BubbleSort {

   /*
      1-> The Greatest element will BUBBLE up to the end of the array
   */


   public static void bubbleSort(int[] arr) {

      for(int i=0;i<arr.length-1;i++) {
         for(int j=0;j<arr.length-1-i;j++) {
            if(arr[j] > arr[j+1]) {
               Application.swap(arr, j, j+1);
            }
         }
      }
      System.out.println(Arrays.toString(arr));
   }

   public static void optimisedBubbleSort(int[] arr) {

      for(int i=0;i<arr.length-1;i++) {
         boolean isSorted = true;
         for(int j=0;j<j-1-i;j++) {
            if(arr[j] > arr[j+1]) {
               Application.swap(arr, j, j+1);
               isSorted = false;
            }
         }
         if(isSorted) {
            break;
         }
      }
      System.out.println(Arrays.toString(arr));
   }

}
