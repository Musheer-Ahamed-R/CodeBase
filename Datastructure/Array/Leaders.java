import java.util.*;

public class Leaders {

   // Given an Array of Integers. Print all the Leaders in the Array.
   // A Leader is an Element which is larger than All the Elements in the Array.

   // Stack                -  O(n)
   // Iterating from Right -  O(n)  // Preffered

   public static void leaders1(int[] a) {

      Stack<Integer> stack = new Stack<>();

      for(int i=0;i<a.length;i++) {
         while(!stack.isEmpty() && a[i] > stack.peek()) {
            System.out.println(stack.pop());
         }
         stack.push(a[i]);
      }

      for(int elem : stack) {
         System.out.println("The Leaders in the Array are "+elem);
      }

   }

   public static void leaders2(int[] a) {

      int currentLeader = a[a.length-1];
      System.out.println(currentLeader);
      for(int i=a.length-2;i>=0;i--) {
         if(a[i] >= currentLeader) {
            currentLeader = a[i];
            System.out.println(currentLeader);
         }
      }
   }



}
