public class LeftLeafSum {

	// Find sum of all left leaves in a given Binary Tree

	// This can also be achieved by checking if the left Child is leaf and return that value.(no need to pass isFrom param)
	public static int leftLeafSum(Node root, char isFrom) {
		if(root == null) {
			return 0;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			if(isFrom == 'L') {
				return root.getData();
			} else {
				return 0;
			}
		}
		return leftLeafSum(root.getLChild(), 'L') + leftLeafSum(root.getRChild(), 'R');
	}


}