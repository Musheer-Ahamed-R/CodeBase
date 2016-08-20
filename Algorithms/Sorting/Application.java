import java.util.*;

public class Application {

   public static void main(String[] args) {
      int[] elements = {3, 2, 8, 12, 56, 1};

      //SelectionSort.selectionSort(elements);

      //BubbleSort.bubbleSort(elements);

      //BubbleSort.optimisedBubbleSort(elements);

      //QuickSort.quickSort(elements, 0, elements.length-1);

      


      System.out.println(Arrays.toString(elements));
   }

   public static void swap(int[] arr, int firIndex, int secIndex) {
      int temp = arr[secIndex];
      arr[secIndex] = arr[firIndex];
      arr[firIndex] = temp;
   }

}
