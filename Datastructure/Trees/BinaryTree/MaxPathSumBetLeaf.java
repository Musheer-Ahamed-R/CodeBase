public class MaxPathSumBetLeaf {

	// Find the maximum path sum between two leaves of a binary tree

	static int currMax = Integer.MIN_VALUE;
	public static int maxPathSumBetLeaf(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			return root.getData();
		}
		int maxLeft = maxPathSum(root.getLChild());
		int maxRight = maxPathSum(root.getRChild());
		currMax = Integer.max(currMax, root.getData() + maxLeft + maxRight);
		
		return Integer.max(maxLeft, maxRight) + root.getData();
	}

}