public class PrintNodesFromRoot {

	// Print nodes at k distance from root

	public static void printNodesFromRoot(Node root, int level) {

		if(root == null) {
			return;
		}
		if(level == 0) {
			System.out.println(root.getData());
		}
		printNodesFromRoot(root.getLChild(), level - 1);
		printNodesFromRoot(root.getRChild(), level - 1);

	}



}