public class LargestNoLessThanNo {

	// Largest number in BST which is less than or equal to N

	public static Node largestNoLessThanNo (Node tree, int val) {
		
		if(tree == null) {
			return null;
		}
		Node currNode = null;
		if(tree.getData() == val) {
			return tree;
		} else if(tree.getData() > val) {
			currNode = largestNoLessThanNo(tree.getLChild(), val);
		} else {
			currNode = largestNoLessThanNo(tree.getRChild(), val);
		}
		if(currNode == null) {
			if(tree.getData() < val) {
				return tree;
			} else {
				return null;
			}
		} else {
			return currNode;
		}
	}

}