public class Distinct {

   // Given an integer array, print all distinct elements in array.
   // The given array may contain duplicates and the output should print every element only once. The given array is not sorted.


   // 1 -> Using Two Loops             -  O(n^2)
   // 2 -> Sort and then Traverse      -  O(nlog n)
   // 3 -> Use Hashing                 -  O(n)

   public static void printDuplicate(int[] a) {

      int[] hashTable = new int[1000];
      for(int i=0;i<a.length;i++) {
         if(hashTable[a[i]] == 0) {
            hashTable[a[i]] = 1;
            System.out.print(a[i]+"  ");
         }
      }

   }


}
