import java.util.*;

public class MergeSort {

   public static int[] mergeSort(int[] arr) {
      if(arr.length <= 1) {
         return arr;
      }
      int length = arr.length;
      int[] rArr = new int[arr.length/2];
      int[] lArr = new int[arr.length - rArr.length];

      for(int i=0;i<lArr.length;i++) {
         lArr[i] = arr[i];
      }
      for(int i=0;i<rArr.length;i++) {
         rArr[i] = arr[i+lArr.length];
      }

      lArr = mergeSort(lArr);
      rArr = mergeSort(rArr);
      return merge(lArr, rArr);
   }

   public static int[] merge(int[] lArr, int[] rArr) {

      int[] mergedArr = new int[lArr.length + rArr.length];
      for(int i=0,j=0, k=0;k<mergedArr.length;k++) {
         if(i >= lArr.length) {
            while(j < rArr.length) {
               mergedArr[k] = rArr[j];
               k++;
               j++;
            }
         } else if(j >= rArr.length) {
            while(i < lArr.length) {
               mergedArr[k] = lArr[i];
               k++;
               i++;
            }
         } else {
            if(lArr[i] <= rArr[j]) {
               mergedArr[k] = lArr[i];
               i++;
            } else {
               mergedArr[k] = rArr[j];
               j++;
            }
         }
      }
      return mergedArr;
   }



}
