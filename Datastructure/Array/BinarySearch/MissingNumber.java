public class MissingNumber {

   public static void missingNo(int[] a) {

      int start = 0;
      int end = a.length-1;
      while(start < end) {
         int mid = (start+end)/2;
         if(mid+1 != a[mid]) {
            end = mid;
         } else {
            start = mid + 1;
         }
      }
      if(start+1 != a[start]) {
         System.out.println("The Missing Element is "+(start+1));
      } else {
         System.out.println("No Element is Missing");
      }

   }



}
