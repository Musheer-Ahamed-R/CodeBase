public class BTToBST {

	// Binary Tree to Binary Search Tree Conversion

	static int index = 0;
	int[] inTrav = null;
	public static void convertToBST(Node root) {
		if(root == null) {
			return;
		}
		inTrav = getInOrderTrav(root);
	}
	 
	public static void postTraverse(Node root) {

		if(root == null) {
			return;
		}

		postTraverse(root.getLChild());
		root.setData(inTrav[index++]);
		postTraverse(root.getLChild());
	}

}