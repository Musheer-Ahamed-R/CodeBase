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

      new FindString().finalAttempt(matrix, "GEEKS");

   }


}
