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

        int[][] b = {{10, 20, 30, 40, 50},
                     {80, 90, 100, 110, 120},
                     {150, 160, 170, 180, 190},
                     {220, 230, 240, 250, 260},
                     {290, 300, 310, 320, 330},
                     {360, 370, 380, 390, 400}};             

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
        PrintDiagnally.printDiagnally(b);
    }

}