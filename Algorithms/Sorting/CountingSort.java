import java.util.*;

public class CountingSort {

   // This Sorting Algorithm is a Specialised version of Bucket Sort
   // Note :
   //    -> This Sorting Algorithm DOES NOT STORE THE COUNT, but Instead the Index UPTO WHICH the Element will get Stored in the NEW Sorted Array.

   public static void countingSort(int[] arr) {

      // The size of the count array must be known before hand(i.e no element value should exceed the max Index of the count array).
      int[] count = new int[10];

      for(int i=0;i<arr.length;i++) {
         count[arr[i]]++;
      }
      for(int i=1;i<count.length;i++) {
         count[i] += count[i-1];
      }
      int[] sortedArray = new int[arr.length];
      for(int i=0;i<arr.length;i++) {
         sortedArray[count[arr[i]]-1] = arr[i];
         count[arr[i]]--;
      }
      System.out.println(Arrays.toString(sortedArray));
   }

   // This is the same as the normal case, but here we find the min and max value in the array, find size of the count array form that,
   // then substitute a[i] with a[i] - min. Here, if min is negative, then -(min) will give positive value.
	public static void handleNegative(int[] arr) {
		int max = findMax(arr);
		int min = findMin(arr);
		int size = max - min + 1;         // adding 1 for managing 0

      int[] count = new int[size];

      for(int i=0;i<arr.length;i++) {
         count[arr[i]-min]++;
      }
      for(int i=1;i<count.length;i++) {
         count[i] += count[i-1];
      }
      int[] sortedArray = new int[arr.length];
      for(int i=0;i<arr.length;i++) {
         sortedArray[count[arr[i]-min]-1] = arr[i];
         count[arr[i]-min]--;
      }
      System.out.println(Arrays.toString(sortedArray));

	}

   public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}


}
