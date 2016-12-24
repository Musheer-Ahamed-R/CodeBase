public class MoveZerosInPlace {

   // 1 -> Iterative (Using Two For Loops)              -   O(n)(Not Sure)
   // 2 -> Iterative (Using Single For Loop)            -   O(n)  Preffered
   // 2 -> Use a New Array to store Non-Zero Elements   -   O(n)
   // 3 -> Use a Queue                                  -   O(n)


   public static void removeZerosInPlaceSimpleSolution(int[] a) {

      int count = 0;
      for(int i=0;i<a.length;i++) {
         if(a[i] != 0) {
            a[count++] = a[i];
         }
      }
      while(count < a.length) {
         a[count++] = 0;
      }
      for(int elem : a) {
         System.out.print(elem+"  ");
      }
   }


   public static void removeZerosInPlace(int[] a) {

      int lastNonZero = -1;
      int count = 0;
      for(int i=0;i<a.length;i++) {
         if(a[i] == 0) {
            int nonZeroIndex = (lastNonZero != -1 ? lastNonZero : i)+1;
            while(nonZeroIndex < a.length && a[nonZeroIndex] == 0) {
               nonZeroIndex++;
               count++;
            }
            if(nonZeroIndex < a.length) {
               int temp = a[i];
               a[i] = a[nonZeroIndex];
               a[nonZeroIndex] = temp;
            }
         } else {
            count++;
         }
      }
      System.out.println("The Count is "+count);
      for(int elem : a) {
         System.out.println(elem);
      }

   }
}
