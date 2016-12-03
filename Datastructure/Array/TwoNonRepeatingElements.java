public class TwoNonRepeatingElements {

   // Given an array in which all numbers except two are repeated once. (i.e. we have 2n+2 numbers and n numbers are occurring twice and remaining two have occurred once).
   // Find those two numbers in the most efficient way.

   public static void findNonRepeatingElem(int[] a) {
      int result = 0;
      for(int i=0;i<a.length;i++) {
         result ^= a[i];
      }
      // Now the result will have (Num1 xor Num2)
      // Since a Set(1) bit represents two Opposite Bits. Finding Set Bit and Xor'ing Numbers with Bit Set at that Location will give us one Number and Doing the Opposite Will give us Second Number.

      int setBit = result & ~(result-1);     // This should be Remembered
      int x = 0;
      int y = 0;
      for(int i=0;i<a.length;i++) {
         if((a[i] & setBit) == 0) {
            x ^= a[i];
         } else {
            y ^= a[i];
         }
      }
      System.out.println(x+"  "+y);

   }


}
