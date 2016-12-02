public class FindDuplicateElements {

   // Find the two repeating elements in a given array

   // Note that this method modifies the original array and may not be a recommended method if we are not allowed to modify the array.

   // 1 -> Using Array Index itself as Element Index  - O(n)

   public static void findDuplicate(int[] a) {

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
