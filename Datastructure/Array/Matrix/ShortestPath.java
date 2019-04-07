import java.util.*;

public class ShortestPath {

	// Shortest path in a Binary Maze

	//static int[] xPoints = {-1, -1, -1, 0, 1, 1, 1, 0};
	//static int[] yPoints = {-1,  0,  1, 1, 1, 0, -1, -1};

	static int[] xPoints = {-1, 0, 1, 0};
	static int[] yPoints = {0,  1, 0, -1};

	public static int shortestPathDFS(int[][] a, boolean[][] visitedArrr, int fromX, int fromY, int toX, int toY, int pathLength) {
		if(a == null) {
			return 0;
		}
		if(fromX == toX && fromY == toY) {
			System.out.println("actieved");
			return pathLength;
		}
		for(int i=0;i<xPoints.length;i++) {
			int tempX = fromX + xPoints[i];
			int tempY = fromY + yPoints[i];
			if(tempX >= a.length || tempX < 0 || tempY >= a[tempX].length || tempY < 0) {
				continue;
			} else if(a[tempX][tempY] == 0 || visitedArrr[tempX][tempY]) {
				continue;
			}
			visitedArrr[tempX][tempY] = true;
			int actualPathLength = shortestPathDFS(a, visitedArrr, tempX, tempY, toX, toY, pathLength + 1);
			if(actualPathLength > 0) {
				return actualPathLength;
			}
		}
		return 0;
	} 

	public static void shortestPathBFS(int[][] a, boolean[][] visitedArrr, int fromX, int fromY, int toX, int toY) {

		Queue<Cell> q = new ArrayDeque<>();
		q.add(new Cell(fromX, fromY));
		int count = 0;
		Outer:
		while(!q.isEmpty()) {
			int size = q.size();
			while(size > 0) {
				Cell cell = q.remove();
				for(int i=0;i<xPoints.length;i++) {
					int tempX = cell.x + xPoints[i];
					int tempY = cell.y + yPoints[i];
					if(tempX >= a.length || tempX < 0 || tempY >= a[tempX].length || tempY < 0) {
						continue;
					} else if(a[tempX][tempY] == 0 || visitedArrr[tempX][tempY]) {
						continue;
					}
					visitedArrr[tempX][tempY] = true;
					if(tempX == toX && tempY == toY) {
						System.out.println("actieved"+(count+1));
						break Outer;	
					}
					System.out.println("adding/calling "+tempX+" "+tempY);
					q.add(new Cell(tempX, tempY));
				}
				size--;
			}
			count++;
		}
	}
}

