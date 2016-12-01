public class LostElement {

   // Find lost element from a duplicated array

   // 1 -> using two loop and a Boolean Array   -  O(n^2)
   // 2 -> using HashTable/HashMap  -  O(n)
   // 3 -> XOR             - O(n)   // Recommended
   //       -> XOR is both Commutative and Associative
   //       -> XOR with a Number and 0 returns the Number itself
   // 4 -> sum             - O(n)   // Recommended

   // If the Two Input arrays are Exact Duplicate of Each Other
   // 1 -> Linear Search   - O(n)
   // 2 -> Binary Search   - O(log n)
   // 3 -> XOR             - O(n)   // Recommended
   //       -> XOR is both Commutative and ASSOCIATIVE
   //       -> XOR of a number with itself is 0.
   //       -> XOR with a Number and 0 returns the Number itself
   // 4 -> sum             - O(n)   // Recommended

   public static void lostElement1(int[] a, int[] b) {
      boolean[] isFound = new boolean[b.length];

      for(int i=0;i<a.length;i++) {
         boolean isMissing = false;
         for(int j=0;j<b.length;j++) {
            if(a[i] == b[j] && !isFound[j]) {
               isFound[j] = true;
               isMissing = true;
               break;
            }
         }
         if(!isMissing) {
            System.out.println("The Missing Element is "+a[i]);
         }
      }
   }



   public static void lostElement2(int[] a, int[] b) {
      int[] occurenceMap = new int[1000];

      for(int i=0;i<b.length;i++) {  // Considering a to be largest array
         occurenceMap[b[i]]++;
      }
      for(int i=0;i<a.length;i++) {
         if(occurenceMap[a[i]] > 0) {
            occurenceMap[a[i]]--;
         } else {
            System.out.println("The Missing Element is "+a[i]);
         }
      }
   }

   public static void binarySearch(int[] a, int[] b) {

      int low = 0;
      int high = a.length-1;
      while(low < high) {
         int mid = (low+high) / 2;
         if(a[mid] == b[mid]) {
            low = mid+1;
         } else {
            high = mid;
         }
      }
      System.out.println(a[low]);
   }

   public static void usingXor(int[] a, int[] b) {
      int result = 0;
      for(int i=0;i<a.length;i++) {
         result ^= a[i];
      }
      for(int i=0;i<b.length;i++) {
         result ^= b[i];
      }
      System.out.println(result);
   }

   public static void usingSumDiff(int[] a, int[] b) {
      int firstSum = 0;
      for(int i=0;i<a.length;i++) {
         firstSum += a[i];
      }
      int secondSum = 0;
      for(int i=0;i<b.length;i++) {
         secondSum += b[i];
      }
      System.out.println(firstSum - secondSum);
   }


}
