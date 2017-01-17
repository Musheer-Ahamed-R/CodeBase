import java.util.*;

public class MaxPairwiseProduct {

   private static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {

      int[] a = {7};

      int firstMax = -1;
      int secondMax = -1;
      for(int i=0;i<a.length;i++) {
         if(a[i] > firstMax) {
            secondMax = firstMax;
            firstMax = a[i];
         } else if(a[i] > secondMax) {
            secondMax = a[i];
         }
      }
      System.out.println(firstMax+"--"+secondMax);
   }



}
