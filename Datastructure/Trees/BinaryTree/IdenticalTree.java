public class IdenticalTree {

	public static boolean isIdentical(Node root1, Node root2) {
		
		if(root1 == null && root1 == null) {
			return true;
		} else if(root1 == null || root2 == null) {
			return false;
		}
		boolean isIdentical = false;
		isIdentical = isIdentical(root1.getLChild(), root2.getLChild());
		isIdentical = isIdentical && isIdentical(root1.getRChild(), root2.getRChild());

		return isIdentical && root1.getData() == root2.getData();
	}


}