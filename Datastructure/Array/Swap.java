public class Swap {

   public static void swap(int[] arr, int firIndex, int secIndex) {
      int temp = arr[secIndex];
      arr[secIndex] = arr[firIndex];
      arr[firIndex] = temp;
   }

}
