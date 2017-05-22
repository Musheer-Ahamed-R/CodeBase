public class Ancestors {

	// Print Ancestors of a given node in Binary Tree

	public static boolean printAncestors(Node root, int data) {
		if(root == null) {
			return false;
		}
		if(root.getData() == data) {
			return true;
		}
		if(printAncestors(root.getLChild(), data) || printAncestors(root.getRChild(), data)) {
			System.out.println(root);
			return true;
		} else {
			return false;
		}

	}


}