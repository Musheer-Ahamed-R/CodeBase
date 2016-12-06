public class Reverse {

   public static void reverse(int[] a) {

      for(int i=0, j=a.length-1;i<a.length/2;i++, j--) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
      }
      for(int elem : a) {
         System.out.print(elem+"   ");
      }

   }

   public static void reverseRecursion(int[] a, int index) {
      if(index >= a.length) {
         return;
      }
      int elem = a[index];
      reverseRecursion(a, index+1);
      a[a.length-index-1] = elem;
   }



}
