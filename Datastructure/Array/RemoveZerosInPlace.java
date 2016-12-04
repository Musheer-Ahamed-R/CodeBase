public class RemoveZerosInPlace {

   public static void removeZerosInPlace(int[] a) {


      //int last

      for(int i=0;i<a.length;i++) {

         if(a[i] == 0) {
            int nonZeroIndex = i+1;
            while(nonZeroIndex < a.length && a[nonZeroIndex] == 0) {
               nonZeroIndex++;
            }
            if(nonZeroIndex < a.length) {
               int temp = a[i];
               a[i] = a[nonZeroIndex];
               a[nonZeroIndex] = temp;
            }
         }

      }
      for(int elem : a) {
         System.out.println(elem);
      }

   }



}
