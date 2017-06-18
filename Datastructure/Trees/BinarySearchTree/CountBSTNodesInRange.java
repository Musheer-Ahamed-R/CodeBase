public class CountBSTNodesInRange {

	// Count BST nodes that lie in a given range
	// Print BST keys in the given range

	//	1 -> Using recursion 	-	Time Complexity O(h + k) (h - height, k - nodes in range)

	public static int countBSTNodesInRange(Node root, int from, int to) {
		if(root == null) {
			return 0;
		}
		 if (root.getData() > to) {
			return countBSTNodesInRange(root.getLChild(), from, to);
		} else if(root.getData() < from) {
			return countBSTNodesInRange(root.getRChild(), from, to);
		} else {
			int count = countBSTNodesInRange(root.getLChild(), from, to);
			System.out.print(root+" ");
			count += countBSTNodesInRange(root.getRChild(), from, to);

			return 1 + count; 
						
		}
	}

}