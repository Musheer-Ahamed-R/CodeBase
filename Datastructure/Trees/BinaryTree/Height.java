public class Height {

	// Write a Program to Find the Maximum Depth or Height of a Tree

	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		return Integer.max(height(root.getLChild()), height(root.getRChild())) + 1;
	}




}