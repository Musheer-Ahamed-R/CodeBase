public class MajorityElement {

   /*
      Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
      Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE
   */


   // This can be solved using Three Techniques
   // 1 -> Using Two Loops - O(n^2)
   // 2 -> Sort, then make a Linear Traversal for finding Max Element - O(nlog n)
   // 3 -> Boyer Moore Voting Algorithm   -  O(n)
           //  - Iterate Over the Array Once and Find a CANDIDATE for the Majority Element.(The Candidate is ALMOST FOUND in this Step).
           //  - Check if that is the Majority Element, else No Majority Element
   // 4 -> Using a HashTable(Array) or a HashMap   -  O(n)


   // O(n) -- NOT PREFFERED, Since we are using a Max Array
   public static void majorityElem1(int[] a) {

      int[] maxArray = new int[10000];
      for(int i=0;i<a.length;i++) {
         maxArray[a[i]]++;
      }
      boolean isFound = false;
      for(int i=0;i<maxArray.length;i++) {
         if(maxArray[i] > a.length/2) {
            isFound = true;
            System.out.println("Max Element is "+i);
         }
      }
      if(!isFound) {
         System.out.println("Max Element is Not Found");
      }
   }

   // Complexity - O(n^2)
   public static void majorityElem2(int[] a) {

      boolean isFound = false;
      for(int i=0;i<a.length;i++) {
         int count = 0;
         for(int j=0;j<a.length;j++) {
            if(a[i] == a[j]) {
               count++;
            }
         }
         if(count > a.length/2) {
            isFound = true;
            System.out.println("Max Element is "+a[i]);
            break;
         }
      }
      if(!isFound) {
         System.out.println("Not Found");
      }

   }



   /* Boyer Moore Voting Algorithm*/
   // This algorithm gives Fail Play to the Candidate.(i.e If candidate is not the Current Element, it does not LOSE ITS STATUS,
   // but it gets reduced.
   public static void boyerMooreAlgorithn(int[] a) {

      int count = 0;
      int candidate  = 0;
      for(int i=0;i<a.length;i++) {
         if(count == 0) {
            candidate = a[i];
            count = 1;
         } else {
            if(candidate == a[i]) {
               count++;
            } else {
               count--; // DO NOT CHANGE the Candidate if the Count becomes 0 here.
            }
         }
      }
      if(count == 0) {  // If there Exists any Majority Element, then Count can never be Zero.
         System.out.println("No Majority Element Found");
      }
      // This is required because Candidate obtained from above Step may not be the Majority Element. If not, then there is no Majority Element.
      int actualCount = 0;
      for(int i=0;i<a.length;i++) {
         if(candidate == a[i]) {
            actualCount++;
         }
      }
      if(actualCount > a.length/2) {
         System.out.println("The Candidate is "+candidate);
      } else {
         System.out.println("No Majority Element Found");
      }
   }

}
