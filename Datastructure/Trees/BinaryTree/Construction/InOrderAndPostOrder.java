public class InOrderAndPostOrder {

	// Construct a Binary Tree from Postorder and Inorder

	// Notes :
	//	-> Here, the postEnd variable is Static because we need to keep track of the Root Index(int PostOrder) as it goes down the Tree.

	private static int postEnd = 14;
	public static Node constructTree(int[] inOrder, int inStart, int inEnd, int[] postOrder) {

		if(inStart > inEnd) {
			System.out.println("While returning "+postEnd);
			return null;
		}
		Node root = new Node(postOrder[postEnd]);
		System.out.println("The Root is "+postOrder[postEnd]);
		int rootIndex = getRootIndex(inOrder, inStart, inEnd, postOrder[postEnd--]);
		/*if(rootIndex == -1) {	// This is only necessary if we are going to check whether the Given PostOrder and InOrder Match
			return null;
		}*/
		root.setRChild(constructTree(inOrder, rootIndex + 1, inEnd, postOrder));
		root.setLChild(constructTree(inOrder, inStart, rootIndex - 1, postOrder));

		return root;
	}

	public static int getRootIndex(int[] inOrder, int inStart, int inEnd, int node) {

		for(int i=inStart;i<=inEnd;i++) {
			if(inOrder[i] == node) {
				return i;
			}
		}
		return -1;
	}
	
}