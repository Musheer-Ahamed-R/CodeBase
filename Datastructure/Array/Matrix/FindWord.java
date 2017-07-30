public class FindWord {

	// Search a Word in a 2D Grid of characters

	static int[] xPoints = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] yPoints = {-1,  0,  1, 1, 1, 0, -1, -1};

	public static void findWord(char[][] ch, String word) {
		if(ch == null || word == null) {
			return;
		}
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				if(ch[i][j] == word.charAt(0)) {
					//System.out.println("initial found at "+i+", "+j);
					for(int k=0;k<xPoints.length;k++) {
						Cell cell = findWord(ch, i + xPoints[k], j + yPoints[k], word, 1, k);
						if(cell != null) {
							System.out.println("elem found at "+i+", "+j+"  -> "+cell.x+", "+cell.y);
						}
					}
				}
			}
		}
	}

	private static Cell findWord(char[][] ch, int fromX, int fromY, String word, int wordIndex, int direction) {

		if(fromX >= ch.length || fromX < 0 || fromY >= ch[fromX].length || fromY < 0) {
			return null;
		}
		if(wordIndex >= word.length()) {
			return null;
		}
		if(ch[fromX][fromY] == word.charAt(wordIndex)) {
			if(wordIndex == word.length() - 1) {
				return new Cell(fromX, fromY);
			} else {
				return findWord(ch, fromX + xPoints[direction], fromY + yPoints[direction], word, wordIndex + 1, direction);
			}
		} else {
			return null;
		}
	}

}