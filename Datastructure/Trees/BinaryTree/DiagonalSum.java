import java.util.*;

public class DiagonalSum {

	// Diagonal Sum of a Binary Tree

	public static void diagonalSum(Node root, int currDiag, HashMap<Integer, Integer> diagSum) {
		if(root == null) {
			return;
		}
		diagonalSum(root.getLChild(), currDiag + 1, diagSum);
		diagonalSum(root.getRChild(), currDiag, diagSum);
		if(diagSum.get(currDiag) == null) {
			diagSum.put(currDiag, root.getData());
		} else {
			diagSum.put(currDiag, diagSum.get(currDiag) + root.getData());
		}

	}


}