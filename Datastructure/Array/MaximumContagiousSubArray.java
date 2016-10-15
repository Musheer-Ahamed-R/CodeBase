import java.util.*;

public class MaximumContagiousSubArray {

   public static void main(String[] args) {
      int[] array = new int[]{8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
      int k = 4;
      ArrayDeque<Integer> deque = new ArrayDeque<>();
      int count = 0;

      for(int i=0;i<k;i++) {
         if(deque.isEmpty() || array[i] > deque.peekLast()) {
            deque.add(array[i]);
         }
      }

      for(int i=k;i<array.length;i++) {
         System.out.println(deque.peekLast());
         //while(!deque.isEmpty() && deque.peekFirst() <= (i - k)) {
            deque.pollFirst();
            //count--;
         //}
         /*if(count == 5) {
            deque.pollFirst();

         }*/
         System.out.println(deque);
         if(deque.isEmpty() || array[i] > deque.peekLast()) {
            deque.add(array[i]);
            //count++;
         }
      }
   }


}
