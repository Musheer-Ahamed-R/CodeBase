public class RootToLeafSum {

	// Root to leaf path sum equal to a given number


	public static boolean rootToLeafSum(Node root, int sum, int reqSum) {
		if(root == null) {
			return false;
		}
		sum += root.getData();
		if(root.getLChild() == null && root.getRChild() == null) {
			if(sum == reqSum) {
				return true;
			} else {
				return false;
			}
		}
		return rootToLeafSum(root.getLChild(), sum, reqSum) || rootToLeafSum(root.getRChild(), sum, reqSum);
	}

}