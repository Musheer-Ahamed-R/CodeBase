public class CountLeaf {

	// Program to count leaf nodes in a binary tree

	public static int countLeaf(Node root) {
		if(root == null) {
			return 0;
		}

		int leafInLeftTree = countLeaf(root.getLChild());
		int leafInRightTree = countLeaf(root.getRChild());

		int currentLeafNode = root.getLChild() == null && root.getRChild() == null ? 1 : 0;

		return leafInLeftTree + leafInRightTree + currentLeafNode;

	}




}