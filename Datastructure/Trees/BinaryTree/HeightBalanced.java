public class HeightBalanced {

	// How to determine if a binary tree is height-balanced?

	public static int heightBalanced(Node root) {
		if(root == null) {
			return 0;
		}
		int lHeight = heightBalanced(root.getLChild());
		int rHeight = heightBalanced(root.getRChild());
		if(lHeight == -1 || rHeight == -1 || Math.abs(lHeight -rHeight) > 1) {
			System.out.println("Height Not balanced at "+ root);
			return -1;
		} else {
			return Integer.max(lHeight, rHeight) + 1;
		}

	}



}