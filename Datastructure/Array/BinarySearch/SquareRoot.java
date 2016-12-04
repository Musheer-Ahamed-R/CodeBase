public class SquareRoot {


   // Code Incomplete
   public static void findSqrt(int a) {

      int start = 0;
      int end = a;
      int prevMid = 0;
      while(start < end) {
         int mid = (start+end)/2;
         int doubleMid = mid * mid;
         if(doubleMid == a) {
            System.out.println("The Sqrt is "+mid);
         } else if(doubleMid > a) {
            end = mid;
         } else {
            start = mid + 1;
         }
         prevMid = mid;
      }


   }

}
