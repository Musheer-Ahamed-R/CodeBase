public class LargestBST {

	// Find the largest BST subtree in a given Binary Tree | Set 1

	static int maxValue = 0;

	public static Value largestBST(Node tree, char from) {

		if(tree == null) {
			return new Value(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
		}
		if(tree.getLChild() == null && tree.getRChild() == null) {
			maxValue = Integer.max(maxValue, 1);
			return new Value(tree.getData(), tree.getData(), 1, true);
		}
		if(tree.getLChild() == null) {
			Value rVal = largestBST(tree.getRChild(), 'R');
			if(rVal.isBST && rVal.minValue >= tree.getData()) {
				maxValue = Integer.max(maxValue, rVal.size + 1);
				return new Value(rVal.maxValue, tree.getData(), rVal.size + 1, true);
			} else {
				return new Value(0, 0, 0, false);
			}
		}
		if(tree.getRChild() == null) {
			Value lVal = largestBST(tree.getLChild(), 'L');
			if(lVal.isBST && lVal.maxValue <= tree.getData()) {
				maxValue = Integer.max(maxValue, lVal.size + 1);
				return new Value(tree.getData(), lVal.minValue, lVal.size + 1, true);
			} else {
				return new Value(0, 0, 0, false);
			}
		}

		Value lVal = largestBST(tree.getLChild(), 'L');
		Value rVal = largestBST(tree.getRChild(), 'R');
		if(lVal.isBST && lVal.maxValue <= tree.getData() && rVal.isBST && rVal.minValue >= tree.getData()) {
			maxValue = Integer.max(maxValue, rVal.size + lVal.size + 1);
			return new Value(rVal.maxValue, lVal.minValue, rVal.size + lVal.size + 1, true);
		} else {
			return new Value(0, 0, 0, false);
		}
	}
}

class Value {
	int maxValue;
	int minValue;
	int size;
	boolean isBST = false;

	public Value(int maxValue, int minValue, int size, boolean isBST) {
		this.maxValue = maxValue;
		this.minValue = minValue;
		this.size = size;
		this.isBST = isBST;
	}
}