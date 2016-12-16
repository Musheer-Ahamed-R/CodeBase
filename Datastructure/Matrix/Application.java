import java.util.*;

public class Application {

   public static void main(String[] args) {
      /*int[][] a = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                   {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                   {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                   {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                   {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                   {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                   {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                   {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                   {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};*/

       int[][] a = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                    {1, 1, 1, 0, 1, 1, 1, 0, 1, 1 },
                    {1, 0, 1, 0, 1, 1, 0, 1, 0, 1 },
                    {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                    {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                    {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                    {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                    {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};

      char[][] matrix = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                         {'G', 'E', 'E', 'K', 'S', 'S', 'K', 'E', 'E', 'G', 'E', 'E', 'K'},
                         {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};

      //FindString.finalAttempt(matrix, "GEEKS");

      System.out.println("Attention HERE !!!!!!!!!!!!!!!!!!!!!!!!!"+(ShortestPath.shortestPath(a, 0, 0, 2, 0, new HashSet<Cell>()) - 1));    // -1 is Done to negate the Increment Done by the Source Cell.
   }

}
