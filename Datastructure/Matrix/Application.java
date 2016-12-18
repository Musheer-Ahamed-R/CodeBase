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

       int[][] a = {{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                    { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                    { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                    { 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 },
                    { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                    { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                    { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};

      //int[] b = {0, 0, 1, 1, 0, 0, 1, 1, 0};
      int[] b = {1, 0, 0, 1, 0, 0, 1, 1, 0};

      int[][] c = {{1, 1, 2},
                   {3, 4, 6},
                   {5, 3, 2}};

      char[][] matrix = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                         {'G', 'E', 'E', 'K', 'S', 'S', 'K', 'E', 'E', 'G', 'E', 'E', 'K'},
                         {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};


      //System.out.println("Attention HERE !!!!!!!!!!!!!!!!!!!!!!!!!"+(ShortestPath.shortestPathDfs(a, 0, 0, 5, 0, new HashSet<Cell>()) - 1));    // -1 is Done to negate the Increment Done by the Source Cell.

      //System.out.println(ShortestPath.shortestPathBfs(a, new CellWithDistance(0, 0, 0), new CellWithDistance(5, 0, 0)));

      //TicTacToe.isTicTacToeValid(b);
      //TicTacToe.isTicTacToeValidMain(b);

      SumException.sumException(c, new Cell[]{new Cell(0, 0), new Cell(1, 1), new Cell(0, 1)});
   }

}
