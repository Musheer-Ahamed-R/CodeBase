public class NthMinElemHeap {

   // Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element
   // in the given array. It is given that ll array elements are distinct.

   // 1 -> Using Sorting                                       -  O(n logn)
   // 2 -> Optimized Bubble Sorting                            -  O(n ^ 2)
   //       -> Make only k Bubbles
   //       -> This can also be achieved using Selection Sort
   // 3 -> Using Min Heap                                      -  O(n + klogn)
   //       -> Build a Heap from the Array. Then, remove Heap Root N Times and call BubbleDown. 
   // 4 -> Using Max heap                                      -  O(k + (n-k)*Logk)
   //       -> The Logic Behind this is that, the k Smallest will be Largest Element if we Consider the First k Elements in the SORTED Array.
   //       -> The Array Being Sorted is the Key to note Here. But, the Array need not be Necessarily Sorted.
   // 5 -> Using a Temp Array and Sorting First k Elements.    -  O(k + (n-k)*Logk), if we want the output sorted then O((n-k)*k + klogk)
   //       -> This is the same as above Method.
   //       -> The Array need not be Sorted(We can Just find the Maximum in the Temp Array).
   // 6 -> Using Modified Quick Select                         -  O(n^2), but O(n) on Average.
   //       -> The idea is, not to do complete quicksort, but stop at the point where pivot itself is k’th smallest element.
   //          Also, not to recur for both left and right sides of pivot, but recur for one of them according to the position of pivot.
   //          The worst case time complexity of this method is O(n2), but it works in O(n) on average.
   // 7 -> Using Randomized Modified Quick Select.             -  O(n^2), but expected time complexity is Θ(n).
   //       -> The idea is to randomly pick a pivot element. To implement randomized partition, we use a random function,
   //          rand() to generate index between l and r, swap the element at randomly generated index with the last element, and
   //          finally call the standard partition process which uses last element as pivot.

   public static void generateMinHeap(int[] a) {

      int lastParent = (a.length-1-1)/2;  // Parent of Last Child
      for(int i=lastParent;i>=0;i--) {
         bubbleDown(a, i, a.length);
      }

      for(int elem : a) {
         System.out.print(elem+" ");
      }
      int minElementCount = 1;
      while(minElementCount < 5) {        // 3rd Index
         swap(a, 0, a.length-minElementCount);
         bubbleDown(a, 0, a.length-minElementCount);
         minElementCount++;
      }
      System.out.println("----------");
      for(int elem : a) {
         System.out.println(elem);
      }
   }

   public static void bubbleDown(int[] a, int index, int size) {

      boolean isSmallest = false;
      while(!isSmallest) {
         int lChild = (2 * index) + 1;
         int rChild = (2 * index) + 2;
         int minIndex = index;
         if(lChild < size && a[minIndex] > a[lChild]) {
               minIndex = lChild;
         }
         if(rChild < size && a[minIndex] > a[rChild]) {
            minIndex = rChild;
         }
         if(index != minIndex) {
            swap(a, index, minIndex);
         } else {
            isSmallest = true;
         }
      }

   }

   public static void swap(int[] a, int first, int second) {

      int temp = a[first];
      a[first] = a[second];
      a[second] = temp;
   }


}
