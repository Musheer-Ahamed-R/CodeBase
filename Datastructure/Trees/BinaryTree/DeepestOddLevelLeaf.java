public class DeepestOddLevelLeaf {

	// Find depth of the deepest odd level leaf node

	public static int deepestOddLevelLeaf(Node root, int level) {
		if(root == null) {
			return 0;
		}

		if(root.getLChild() == null && root.getRChild() == null && level % 2 != 0) {
			return level;
		} else {
			int lVal = deepestOddLevelLeaf(root.getLChild(), level + 1);
			int rVal = deepestOddLevelLeaf(root.getRChild(), level + 1);
			
			return Integer.max(lVal, rVal);
		}
	}



}