public class CheckIfBST {

	// A program to check if a binary tree is BST or not

	// Note : 
	//		-> This can also be solved using Inorder Traversal
	public static boolean checkIfBST(Node root, int from, int to) {
		
		if(root == null) {
			return true;
		}
		if(root.getData() < from || root.getData() > to) {
			System.out.println(root.getData());
			return false;
		}
		return checkIfBST(root.getLChild(), from, root.getData()) && checkIfBST(root.getRChild(), root.getData() + 1, to);
	}


}