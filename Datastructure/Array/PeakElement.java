import java.util.*;

public class PeakElement {

   // Peak Element is the Element which is Greater or Equal to its Neighbours

   // 1 -> Stack           -  O(n)
   // 2 -> Binary Search(Only One Peak Element can be Found)   -  O(log n)

   public static void findPeakElement(int[] a) {

      Stack<Integer> stack = new Stack<>();
      for(int elem : a) {
         stack.push(elem);
      }
      int prev = 0;
      int curr = stack.pop();
      boolean isEnd = false;
      while(!isEnd) {
         int next = 0;
         if(!stack.isEmpty()) {
            next = stack.pop();
         } else {
            isEnd = true;
         }
         if(curr >= prev && curr >=next) {
            System.out.println(curr);
         }
         prev = curr;
         curr = next;
      }
   }

   // If the Left Neighbour is Greater than Current Element, then we are Sure to Find a Peak Element on the Left Side of the Current Element.
   // Same goes for Right Neighbour.
   public static void binarySearchPeakElem(int[] a) {
      int low = 0;
      int high = a.length-1;
      boolean isFound = false;
      while(low <= high) {
         int mid = (low + high)/2;
         if(isPeak(a, mid)) {
            isFound = true;
            System.out.println("The Peak Element is "+a[mid]);
            break;
         } else if(mid-1 >= 0 && a[mid-1] > a[mid]) {
            high = mid;
         } else if(mid + 1 <= a.length-1 && a[mid+1] > a[mid]) {
            low = mid + 1;
         }
      }
      if(!isFound) {
         if(isPeak(a, low)) {
            System.out.println("The Peak Element is "+a[low]);
         }
      }
   }

   public static boolean isPeak(int[] a, int index) {
      boolean isPeak = false;
      isPeak = (index - 1 < 0 ? true : ( a[index-1] <= a[index] ? true : false)) && (index + 1 > a.length-1 ? true : ( a[index+1] <= a[index] ? true : false));

      return isPeak;
   }


}
