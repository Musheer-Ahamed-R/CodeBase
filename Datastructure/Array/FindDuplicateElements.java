public class FindDuplicateElements {

   public static void findDuplicate(int[] a) {
      /*int result = 0;
      for(int i=0;i<a.length;i++) {
         System.out.println("The result is "+result+"         ");
         if((result ^ a[i]) == result - a[i]) {
            a[i] = -1;
            System.out.println("index "+i+" is already found");
         } else {
            result += a[i];
         }
      }
      for(int elem : a) {
         System.out.println(elem);
      }*/

      for(int i=0;i<a.length;i++) {
         if(a[Math.abs(a[i])] > 0) {
            a[Math.abs(a[i])] = -a[Math.abs(a[i])];
         } else {
            System.out.println("The Element is duplicate "+Math.abs(a[i]));
         }

      }
      /*for(int i=0;i<a.length;i++) {
         if(a[i] < 0) {
            System.out.println()
         }
      }*/
   }


}
