import java.util.*;

public class TrappingRainWater {

   // Given n non-negative integers representing an elevation map where the width of each bar is 1,
   // compute how much water it is able to trap after raining.

   // 1 -> Calculating the Rain Water(Units) that can be Trapped on EACH Tower(Element) and adding it to the Total Sum.
   //          -> A Tower cannot contain any Water if it Doesn't have any Tower on its Left AND Right which is Taller than Current Tower(Like a Trap).
   //          -> The Number of Units a Tower can Contain is Min(Max Tower on its Left and Max Tower on its Right) - Current Tower Height.

   // Note :
   //    -> The Previous Greatest Element

   // This can be Optimized by not using the rightGreatest Array and Computing its value on the go while calculating the No of Units.
   public static void trappingRainWater(int[] a) {

      int[] leftGreatest = new int[a.length];
      int[] rightGreatest = new int[a.length];

      int leftMaxValue = -1;
      for(int i=0;i<a.length;i++) {
         if(a[i] >= leftMaxValue) {
            leftMaxValue = a[i];
            leftGreatest[i] = -1;
         } else {
            leftGreatest[i] = leftMaxValue;
         }
      }
      //for(int elem : leftGreatest) {
         //System.out.println(elem);
      //}
      System.out.println("----------");
      int rightMax = -1;
      int noOfUnits = 0;
      for(int i=a.length-1;i>=0;i--) {
         if(a[i] >= rightMax) {
            rightMax = a[i];
            rightGreatest[i] = -1;
         } else {
            rightGreatest[i] = rightMax;
         }

         noOfUnits += Integer.max(Integer.min(rightGreatest[i], leftGreatest[i]) - a[i], 0);
      }
      System.out.println(noOfUnits);
      //Iterator<Integer> di = Arrays.asList(rightGreatest).listIterator();
      //for(int elem : rightGreatest) {
         //System.out.println(elem);
      //}




   }

}
