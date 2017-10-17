import java.util.*;
public class ZigZag {

   // Convert array into Zig-Zag fashion

   // 1 -> Sort and Then Swap the ALternate Elements
   // 2 -> Swap the Elements if the Elements are not in Order(ZigZag Order).
   //          The Neighbouring Element can be either be largeer or smaller than the Current Element.

   public static void zigZag(int[] arr) {

      for(int i=0, k=0;i<arr.length-1;i++) {
         if(k==0) {
            if(arr[i] < arr[i+1]) {
               Swap.swap(arr, i, i+1);
            }
         } else {
            if(arr[i] > arr[i+1]) {
               Swap.swap(arr, i, i+1);
            }
         }
         k ^= 1;
      }
      for(int elem : arr) {
         System.out.print(elem+" ");
      }
   }

}