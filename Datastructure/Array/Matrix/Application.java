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

        boolean[][] visitedArr = new boolean[9][10];          

		//CountSortedRows.countSortedRows(a);
		visitedArr[0][0] = true;	
		//System.out.println(ShortestPath.shortestPath(a, visitedArr, 0, 0, 3, 4, 0));		
		ShortestPath.shortestPathBFS(a, visitedArr, 0, 0, 3, 4);
	}

}