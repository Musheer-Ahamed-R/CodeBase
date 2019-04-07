public class SymmetricTree {

	// Symmetric Tree (Mirror Image of itself)

	public static void symmetricTree(Node root) {
		if(root == null) {
			return;
		}
		boolean isSymmetric = isSymmetricTree(root.getLChild(), root.getRChild());
		System.out.println(isSymmetric);
	}

	public static boolean isSymmetricTree(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		return root1.getData() == root2.getData() 
				&& isSymmetricTree(root1.getLChild(), root2.getRChild())
				&& isSymmetricTree(root1.getRChild(), root2.getLChild());
	}

}