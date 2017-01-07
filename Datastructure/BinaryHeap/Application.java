import java.util.*;

public class Application {

   public static void main(String[] args) {
      int[] arr = new int[12];

      arr[0] = 8;
      arr[1] = 2;
      /*arr[2] = 10;
      arr[3] = 3;
      arr[4] = 15;
      arr[5] = 6;
      arr[6] = 30;
      arr[7] = 19;
      arr[8] = 32;
      arr[9] = 4;
      arr[10] = 11;
      arr[11] = 0;*/

      Heap h = new Heap(2, 1);
      /*h.setArr(arr);
      h.bubbleDown(0);
      for(int elem : arr) {
         System.out.println(elem+"  ");
      }*/
      buildHeap(arr);
      //heapSort(arr);
   }

   /*
     Build the Heap and then DESTROY it(call delete n times)
   */
   public static void heapSort(int[] arr) {

      Heap heap = buildHeap(arr);
      for(int i=heap.getCount();i>0;i--) {
         heap.delete();
      }
      System.out.println("-------------------");
      System.out.println(Arrays.toString(heap.getArr()));
   }

   public static Heap buildHeap(int[] arr) {
      Heap heap = new Heap(2, 0);
      heap.setArr(arr);
      heap.setCount(arr.length);
      int lastNonLeaf = ((heap.getCount()-1)-1)/2;
      for(int i=lastNonLeaf;i>=0;i--) {
         heap.bubbleDown(i);
      }
      System.out.println(Arrays.toString(arr));
      return heap;
   }

   public static void swap(int[] arr, int index1, int index2) {
      int temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
   }

}
