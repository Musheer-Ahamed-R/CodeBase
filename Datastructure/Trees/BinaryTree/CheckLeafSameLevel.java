public class CheckLeafSameLevel {

	// Check if all leaves are at same level

	// Notes : 
	//	-> This can also be solved by finding the first leaf node and compararing its value with all other leaf nodes.
	//	   (That value is stored in an object).


	public static int checkLeafSameLevel(Node root, int level) {
		if(root == null) {
			return 0;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			return level;
		}
		int lVal = checkLeafSameLevel(root.getLChild(), level + 1);
		int rVal = checkLeafSameLevel(root.getRChild(), level + 1);
		
		if(lVal == -1 || rVal == -1) {
			return -1;
		}
		if(lVal != 0 && rVal != 0) {
			if(lVal != rVal) {
				return -1;
			} else {
				return lVal;
			}
		} else {
			return Integer.max(lVal, rVal);
		}

	}

}