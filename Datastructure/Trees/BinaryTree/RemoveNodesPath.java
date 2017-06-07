public class RemoveNodesPath {

	// Remove nodes on root to leaf paths of length < K

	public static boolean removeNodesPath(Node root, int val, int level) {
		if(root == null) {
			return true;
		}	
		if(root.getLChild() == null && root.getRChild() == null) {
			if(level < val) {
				return true;
			} else {
				return false;
			}
		}
		boolean lRemove = removeNodesPath(root.getLChild(), val, level + 1);
		boolean rRemove = removeNodesPath(root.getRChild(), val, level + 1);
		if(lRemove) {
			root.setLChild(null);
		}
		if(rRemove) {
			root.setRChild(null);
		}
		return lRemove && rRemove;
	}

	// Remove all nodes which don’t lie in any path with sum>= k


	public static boolean removeNodesPathSum(Node root, int val, int sum) {
		if(root == null) {
			return true;
		}	
		if(root.getLChild() == null && root.getRChild() == null) {
			if(sum < val) {
				return true;
			} else {
				return false;
			}
		}
		boolean lRemove = removeNodesPathSum(root.getLChild(), val, sum + root.getData());
		boolean rRemove = removeNodesPathSum(root.getRChild(), val, sum + root.getData());
		if(lRemove) {
			root.setLChild(null);
		}
		if(rRemove) {
			root.setRChild(null);
		}
		return lRemove && rRemove;
	}

}