import java.util.*;

public class PairWithSum {

   /** Given an array A[] and a number x, check for pair in A[] with sum as x */

   // 1 -> Using Two For Loops   -  O(n^2)
   // 2 -> Using a HashTable or a HashMap -  O(n)
   //       -> Here the Problem occurs if the Number to add is the Number itself. Handle this properly.

   // Complexity - O(n^2)
   public static void pairNoSum1(int[] a, int sum) {

      for(int i=0;i<a.length;i++) {
         int num = a[i];
         for(int j=i+1;j<a.length;j++) {
            if(num + a[j] == sum) {
               System.out.println("Pair Exists"+num+" -> "+a[j]);
            }
         }
      }
   }

   public static void pairNoSum2(int[] a, int sum) {

      Arrays.sort(a);
      for(int i=0, j=a.length-1;i<j;) {
         int tempSum = a[i] + a[j];
         if(tempSum == sum) {
            System.out.println(a[i]+"  "+a[j]);
            i++;
            j--;
         } else if(tempSum < sum) {
            i++;
         } else {
            j--;
         }
      }
   }

   /* It is enough to say whether a pair Exists or Not by Checking if the No obtained by Subtracting
      the Current No and Sum is Present in the Array. For that, a Simple way to Check Presence of an Element is
      to use a Hash Table*/
   // Complexity - O(n) -- NOT PREFFERED, Since we are using a Max Array
   // Space Complexity - O(R), R - Max Integer
   public static void pairNoSum3(int[] a, int sum) {

      int[] hashTable = new int[10000];
      for(int i=0;i<a.length;i++) {
         int temp = sum - a[i];
         if(temp >= 0 && hashTable[temp] == 1) {
            System.out.println("pair Found  "+a[i]+" -> "+temp);
         }
         hashTable[a[i]] = 1;                // This placement is important.
      }
   }

}
