import java.util.*;

public class Application {

   public static void main(String[] args) {
      int[] elements = {32, 2, 3, 67, 56, 3, 1, 10};

      //SelectionSort.selectionSort(elements);

      //BubbleSort.bubbleSort(elements);

      //BubbleSort.optimisedBubbleSort(elements);

      //QuickSort.quickSort(elements, 0, elements.length-1);

      //InsertionSort.insertionSort(elements);

      //int[] mergedArr = MergeSort.merge(new int[]{32}, new int[]{2});

      int[] mergedArr = MergeSort.mergeSort(elements);
      System.out.println(Arrays.toString(mergedArr));
   }

   public static void swap(int[] arr, int firIndex, int secIndex) {
      int temp = arr[secIndex];
      arr[secIndex] = arr[firIndex];
      arr[firIndex] = temp;
   }

}
