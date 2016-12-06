import java.util.*;

public class NextPrevGreaterSmaller {

   // Print the Next Greater Elements(NGT) for all the Elements in the Array or null if not present.
   // Print the Next Smaller Elements(NGT) for all the Elements in the Array or null if not present.
   // Print the Prev Greater Elements(NGT) for all the Elements in the Array or null if not present.
   // Print the Prev Smaller Elements(NGT) for all the Elements in the Array or null if not present.

   // 1 -> Using Two Loops    -  O(n)
   // 2 -> Using Stack and Maintaining the Elements in Sorted Order

   // The Idea in this method is to keep the Elements in the Stack in Sorted Order.

   // Note :
   //    -> This is Different from Great(est) Element on its Left, because this Problem Considers only the Previous Greater Element and
   //       Not the Overall Greatest Element.(Which is easier to Solve).


   public static void printNextGreater(int[] a) {

      Stack<Integer> stack = new Stack<>();

      for(int i=0;i<a.length;i++) {
         while(!stack.isEmpty() && stack.peek() <= a[i]) {
            System.out.println("The Next Greater Element for the "+stack.pop()+"  is "+a[i]);
         }
         //if(stack.isEmpty() || stack.peek() > a[i]) {
            stack.push(a[i]);
         //}
      }
      for(int elem : stack) {
         System.out.println("The Next Greater Element for the "+elem+"  is "+null);
      }

   }

   public static void printPrevGreater(int[] a) {

      Stack<Integer> stack = new Stack<>();

      for(int i=a.length-1;i>=0;i--) {
         while(!stack.isEmpty() && stack.peek() <= a[i]) {
            System.out.println("The Next Greater Element for the "+stack.pop()+"  is "+a[i]);
         }
         //if(stack.isEmpty() || stack.peek() > a[i]) {
            stack.push(a[i]);
         //}
      }
      for(int elem : stack) {
         System.out.println("The Next Greater Element for the "+elem+"  is "+null);
      }

   }

   public static void printNextSmallest(int[] a) {

      Stack<Integer> stack = new Stack<>();

      for(int i=0;i<a.length;i++) {
         while(!stack.isEmpty() && stack.peek() >= a[i]) {
            System.out.println("The Next Greater Element for the "+stack.pop()+"  is "+a[i]);
         }
         //if(stack.isEmpty() || stack.peek() > a[i]) {
            stack.push(a[i]);
         //}
      }
      for(int elem : stack) {
         System.out.println("The Next Greater Element for the "+elem+"  is "+null);
      }

   }

   public static void printPrevSmallest(int[] a) {

      Stack<Integer> stack = new Stack<>();

      for(int i=a.length-1;i>=0;i--) {
         while(!stack.isEmpty() && stack.peek() >= a[i]) {
            System.out.println("The Next Greater Element for the "+stack.pop()+"  is "+a[i]);
         }
         //if(stack.isEmpty() || stack.peek() > a[i]) {
            stack.push(a[i]);
         //}
      }
      for(int elem : stack) {
         System.out.println("The Next Greater Element for the "+elem+"  is "+null);
      }

   }

}
