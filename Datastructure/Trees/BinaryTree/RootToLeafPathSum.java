public class RootToLeafPathSum {

	// Sum of all the numbers that are formed from root to leaf paths

	public static int rootToLeafPathSum(Node root, int pathValues) {
		if(root == null) {
			return 0;
		}
		pathValues = pathValues * 10 + root.getData();
		if(root.getLChild() == null && root.getRChild() == null) {
			return Integer.valueOf(pathValues);
		}
		int lValue = rootToLeafPathSum(root.getLChild(), pathValues);
		int rValue = rootToLeafPathSum(root.getRChild(), pathValues);
		return lValue + rValue;
	}

}