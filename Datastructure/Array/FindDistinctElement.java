public class FindDistinctElement {

   // Given an array of integers. All numbers occur twice except one number which occurs once.
   // Find the number in O(n) time & constant extra space.

   // 1 -> Using Two Loops          - O(n^2)
   // 2 -> using HashTable/HashMap  - O(n)
   // 3 -> using XOR                - O(n)      -- Preffered
   //       -> XOR is both Commutative and ASSOCIATIVE
   //       -> XOR of a number with itself is 0.
   //       -> XOR with a Number and 0 returns the Number itself

   public static void findUsingXor(int[] a) {
      int result = 0;
      for(int i=0;i<a.length;i++) {
         result ^= a[i];
      }
      System.out.println(result);
   }



}
