import java.util.*;

public class Application {

   public static void main(String[] args) {
      int[] elements = {32, 23, 39, 67, 56, 31, 13, 10};

      //int[] elements = new int[]{5, -3, 1, 5, 2, 8, 1, -4, 9, -2, 4, 7};

      //SelectionSort.selectionSort(elements);

      //BubbleSort.bubbleSort(elements);

      //BubbleSort.optimisedBubbleSort(elements);

      //QuickSort.quickSort(elements, 0, elements.length-1);

      //InsertionSort.insertionSort(elements);

      //int[] mergedArr = MergeSort.mergeSort(elements);

      //CountingSort.countingSort(elements);
      //CountingSort.handleNegative(elements);

      RadixSort.radixSort(elements);

      //System.out.println(Arrays.toString(mergedArr));
   }

   public static void swap(int[] arr, int firIndex, int secIndex) {
      int temp = arr[secIndex];
      arr[secIndex] = arr[firIndex];
      arr[firIndex] = temp;
   }

}
