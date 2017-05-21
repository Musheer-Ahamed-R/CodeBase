public class DeepestLeafNode {

	static Node result = null;
	static int maxLevel = 0;

	// Deepest left leaf node in a binary tree

	public static int deepestLeafNode(Node root, int level, char from) {
		
		if(root == null)  {
			return 0;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			if(from == 'R') {
				return -1;
			} else {
				if(level > maxLevel) {
					result = root;
					maxLevel = level;	
					return level;
				}
			}
		}
		int lRes = 0;
		int rRes = 0;
		if(root.getLChild() != null)
			lRes = deepestLeafNode(root.getLChild(), level + 1, 'L');
		if(root.getRChild() != null)
			rRes = deepestLeafNode(root.getRChild(), level + 1, 'R');
		
		return Integer.max(lRes, rRes);
	}

}