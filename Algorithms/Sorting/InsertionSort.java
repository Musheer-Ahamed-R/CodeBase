import java.util.*;

public class InsertionSort {

   /*
   Algo - The Insertion Sort Algorithm has two parts at any time. The first part is Sorted Part(Sorted Among itself (i.e) not the whole array)
          and the second part which is the unsorted or the raw part)

        - This sorting Algorithm gets its name, because it can be used to insert a new Element to the array in the same way,
            so that the resultant array after insertion is sorted.(Priority Queue)

        - Its advantage over Bubble Sort is that, we only need to traverse till the element is less than any other element in the sorted section.

   */

   // Important - Always change the value of i after shifting the element at i.
   public static void insertionSort(int[] arr) {

      for(int i=1;i<arr.length;i++) {
         for(int j=i-1;j>=0;j--) {
            if(arr[i] < arr[j]) {
               Application.swap(arr, i, j);
               i = j;
            } else {
               break;
            }
         }
      }
      System.out.println(Arrays.toString(arr));

   }

}
