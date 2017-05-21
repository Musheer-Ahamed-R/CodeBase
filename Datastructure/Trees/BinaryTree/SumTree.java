public class SumTree {

	// Check if a given Binary Tree is SumTree


	public static boolean isSumTree(Node root) {
		
		if(root ==  null || isLeaf(root)) {
			return true;
		}
		if(isSumTree(root.getLChild()) && isSumTree(root.getRChild())) {
			Node leftC = root.getLChild();
			int leftVal = 0;
			if(leftC == null) {
				leftVal = 0;
			} else if (isLeaf(leftC)) {
				leftVal = leftC.getData();
			} else {
				leftVal = 2 * leftC.getData();
			}

			Node rightC = root.getRChild();
			int rightVal = 0;
			if(rightC == null) {
				rightVal = 0;
			} else if (isLeaf(rightC)) {
				rightVal = rightC.getData();
			} else {
				rightVal = 2 * rightC.getData();
			}
			if(root.getData() == leftVal + rightVal) {
				return true;
			}
		}

		return false;	
	}

	public static boolean isLeaf(Node root) {

		if(root.getLChild() == null && root.getRChild() == null) {
			return true;
		}
		return false;
	}

}