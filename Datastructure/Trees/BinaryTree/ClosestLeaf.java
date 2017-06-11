public class ClosestLeaf {

	// Find the closest leaf in a Binary Tree
	// INCOMPLETE

	public static void closestLeaf(Node root, int data) {
		if(root == ) {


		}
		if(root.getData() == data) {
			return findClosestDown(root);
		}
		int lData = closestLeaf(root.getLChild());
		int rData = 0;
		if(lData >= 0) {
			int currData = findClosestDown(root.getRChild());
			return min
		} else if((rData = closestLeaf(root.getRChild()) >= 0){

		}
		return -1;
	}



}