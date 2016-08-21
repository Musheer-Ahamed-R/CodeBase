//Convert array into Zig-Zag fashion

public class ArrayZigZag {

   public static void zigZag(int[] arr) {

      for(int i=0, k=0;i<arr.length-1;i++) {
         if(k==0) {
            if(arr[i] > arr[i+1]) {
               Swap.swap(arr, i, i+1);
            }
         } else {
            if(arr[i] < arr[i+1]) {
               Swap.swap(arr, i, i+1);
            }
         }
         k ^= 1;
      }

   }




}
