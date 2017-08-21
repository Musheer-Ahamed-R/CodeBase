public class OddOccurence {

   // Find the Number Occurring Odd Number of Times

   // 1 -> Using XOR    -  O(n)

   // All Numbers in an Array Occurer "N" Number of Times, except for One Element. Find that Element.

   // 1 -> Using Bit Manipulation   -  O(nk + k)   ~  O(n)  (Not Sure abt this)  k - 32(Number of Bits in Integer)

   public static void oddOccurence(int[] a, int numberOfOccurences) {

      int[] countBits = new int[32];
      for(int i=0;i<a.length;i++) {
         int input = a[i];
         for(int j=countBits.length-1; j>=0; j--, input >>= 1) {
            int bit = input & 1;
            if(bit == 1) {
               countBits[j]++;
            }
         }
      }
      for(int i=0;i<countBits.length;i++) {
         countBits[i] = countBits[i] % numberOfOccurences;
         System.out.print(countBits[i]+"  ");
      }
   }

}
