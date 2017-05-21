public class NodeLevel {

	// Get Level of a node in a Binary Tree

	public static int nodeLevel(Node root, int data) {

		if(root == null) {
			return 0;
		}
		if(root.getData() == data) {
			return 1;
		}
		int maxVal = Integer.max(nodeLevel(root.getLChild(), data), nodeLevel(root.getRChild(), data));

		return maxVal > 0 ? maxVal + 1 : 0;
	}

}