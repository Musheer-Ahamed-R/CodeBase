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

        int[][] b = {{1, 2, 3, 4, 5},
                     {6, 7, 8, 9, 10},
                     {11, 12, 13, 14, 15},
                     {16, 17, 18, 19, 20},
                     {21, 22, 23, 24, 25}};            

        int[][] c = {{1, 2, 3, 4}, 
                     {5, 6, 7, 8}, 
                     {9, 10, 11, 12}, 
                     {13, 14, 15, 16}};             

        int[][] d = {{1, 2},
                     {3, 4}};             


        boolean[][] visitedArr = new boolean[9][10];          

        char[][] ch = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                         {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K'},
                         {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};
        String word = "EEE";


		//CountSortedRows.countSortedRows(a);
		//visitedArr[0][0] = true;	
		//System.out.println(ShortestPath.shortestPath(a, visitedArr, 0, 0, 3, 4, 0));		
		//ShortestPath.shortestPathBFS(a, visitedArr, 0, 0, 3, 4);
	
        //FindWord.findWord(ch, word);
        //PrintDiagnally.printDiagnally(b);
    
        Rotate.rotate(d);
    }

}