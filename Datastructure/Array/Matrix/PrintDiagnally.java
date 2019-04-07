public class PrintDiagnally {

	public static void printDiagnally(int[][] a) {
		if(a == null) {
			return;
		}
		int minSize = Integer.min(a.length, a[0].length);
		int maxSize = Integer.max(a.length, a[0].length);
		int diagonalRows = (2 * (minSize - 1)) + Math.abs(a.length - a[0].length) + 1;
		int diagonalElem = 1;
		int rowIndex = 0;
		int colIndex = 0;
		for(int row = 0;row<diagonalRows;row++) {
			int tempRow = rowIndex; 
			int tempCol = colIndex;
			for(int i=0;i<diagonalElem;i++, tempRow--, tempCol++) {
				System.out.print(a[tempRow][tempCol]+" ");
			}
			System.out.println();
			if(row < minSize - 1) {
				diagonalElem++;	
			} else if(row >= maxSize - 1) {
				diagonalElem--;
			}
			if(rowIndex < a.length - 1) {
				rowIndex++;
			} else {
				colIndex++;
			}
		}
	}


}