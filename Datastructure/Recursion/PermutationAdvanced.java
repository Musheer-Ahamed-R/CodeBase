import java.util.*;

public class PermutationAdvanced {

   // Avoid Duplicate Permuted String(In case the Main String Itself has Duplicates(e.g AACD))
   // Get the Output in Lecxicograpically Sorted Order

   // 1 -> Recursion       -  O(n!)

   // Notes : 
   //    -> The number of combinations for AAABBC will be 6! / (3! * 2!) = 60

   public static void permutationAdvanced(Character[] charArray) {

      Map<Character, Integer> countMap = new TreeMap<>();
      for(int i=0; i<charArray.length; i++) {
         char ch = charArray[i];
         int count = countMap.get(ch) != null ? countMap.get(ch) : 0;
         countMap.put(ch, count + 1);
      }            
      System.out.println(countMap);
      Character[] resultArr = new Character[charArray.length];
      permute(countMap, resultArr, 0);
   }

   public static void permute(Map<Character, Integer> countMap, Character[] resultArr, int level) {

      if(level == resultArr.length) {
         System.out.println(Arrays.toString(resultArr));
         return;
      }
      for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
         Character ch = entry.getKey();
         int count = entry.getValue();
         if(count > 0) {
            countMap.put(ch, count - 1);
            resultArr[level] = ch;
            permute(countMap, resultArr, level + 1);
            countMap.put(ch, count);
         }
      }
   }


}
