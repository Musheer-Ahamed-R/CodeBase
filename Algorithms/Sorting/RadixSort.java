import java.util.*;

public class RadixSort {

   /*
   Radix Sort  Constraints -
            1 -> All the elements should have the same number of digits
            2 -> All the DIGITS(not numbers) should be within a range

   Implementation - We First Sort LSB(last digit) and continue all the way through to the MSB(first digit).
   */

   public static void radixSort(int[] arr) {
      List<Queue<Integer>> bucket = new ArrayList<>(10);      // In case of Decimal Numbers only 10 digits are possible

      for(int i=0;i<10;i++) {
         bucket.add(new ArrayDeque<>());
      }

      int digCount = String.valueOf(arr[0]).length();

      for(int i=digCount-1;i>=0;i--) {
         for(int j=0;j<arr.length;j++) {
            String num = arr[j]+"";
            bucket.get(Character.getNumericValue(num.charAt(i))).add(arr[j]);
         }
         //System.out.println(bucket);
         for(int j=0, k=0;j<bucket.size();j++) {
            Queue<Integer> q = bucket.get(j);
            while(!q.isEmpty()) {
               arr[k] = q.remove();
               k++;
            }
         }
      }
      System.out.println(Arrays.toString(arr));

   }

}
