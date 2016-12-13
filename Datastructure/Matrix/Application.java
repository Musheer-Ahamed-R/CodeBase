public class Application {

   public static void main(String[] args) {
      int[][] a = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                   {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                   {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                   {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                   {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                   {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                   {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                   {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                   {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};

      System.out.println(ShortestPath.shortestPath(a, 0, 0, 2, 0, -1, -1) - 1);    // -1 is Done to negate the Increment Done by the Source Cell.
   }

}
