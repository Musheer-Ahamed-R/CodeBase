import java.util.*;

public class FirstRepeating {

   // Given an array of integers, find the first repeating element in it. We need to find the element that occurs more than once
   // and whose index of first occurrence is smallest.

   // 1 -> Two Loops                   -  O(n^2)
   // 2 -> Sorting                     -  O(nlog n)
   // 3 -> Hashing                     -  O(n)


   public static void firstRepeating(int[] a) {

      HashSet<Integer> set = new HashSet<>();
      int minIndex = -1;
      for(int i=a.length-1;i>=0;i--) {
         if(!set.contains(a[i])) {
            set.add(a[i]);
         } else {
            minIndex = i;
         }
      }
      if(minIndex != -1) System.out.println("First repeating Number is "+a[minIndex]);
   }

   public static void firstRepeating2(int[] a) {

      HashMap<Integer, Integer> map = new HashMap<>();
      int minIndex = 1000;
      for(int i=0;i<a.length;i++) {
         if(!map.containsKey(a[i])) {
            map.put(a[i],  i);
         } else {
            if(minIndex > map.get(a[i])) {
               minIndex = map.get(a[i]);
            }
         }
      }
      if(minIndex != 1000) System.out.println("First repeating Number is "+a[minIndex]);
   }

}
