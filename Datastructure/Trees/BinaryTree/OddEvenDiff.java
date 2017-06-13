public class OddEvenDiff {
	
	// Difference between sums of odd level and even level nodes of a Binary Tree

	public static int findOddEvenDiff(Node root, boolean findDiff) {
		if(root == null) {
			return 0;
		}
		int diff = 0;
		if(findDiff) {
			int childSum = root.getLChild() != null ? root.getLChild().getData() : 0;
			childSum += root.getRChild() != null ? root.getRChild().getData() : 0;

			diff = root.getData() - childSum;
 		}
 		return diff + findOddEvenDiff(root.getLChild(), !findDiff) + findOddEvenDiff(root.getRChild(), !findDiff);
	}



}