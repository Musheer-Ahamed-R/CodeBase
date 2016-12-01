import java.util.*;

public class Application {

   public static void main(String[] args) {
      // int[] arr = {1, 4, 3, 2};
      //
      // ArrayZigZag.zigZag(arr);
      //
      // System.out.println(Arrays.toString(arr));

      char[][] matrix = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                        {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K'},
                        {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};

      //new FindString().finalAttempt(matrix, "GEEKS");

      int[] a = {2, 1, 2, 4, 2};

      //int sum = 10;
      //PairNumberSum.pairNoSum1(a, sum);
      //PairNumberSum.pairNoSum2(a, sum);

      //MajorityElement.majorityElem1(a);
      //MajorityElement.boyerMooreAlgorithn(a);

      CountPairs.pairsCount(a, 4);
   }


}
