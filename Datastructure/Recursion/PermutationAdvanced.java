public class PermutationAdvanced {

   // Avoid Duplicate Permuted String(In case the Main String Itself has Duplicates(e.g AACD))
   // Get the Output in Lecxicograpically Sorted Order

   // 1 -> Recursion       -  O(n!)

   public static void permutationAdvanced(char[] outputArray, int[] countArray, char from, int recursionLevel) {

      for(int i=0;i<countArray.length;i++) {        // Find the First Non-Zero Count
         if(countArray[i] > 0) {
            outputArray[recursionLevel] = CHARACTER
            permutationAdvanced(outputArray, recursionLevel+1);
         }
      }

   }


}
