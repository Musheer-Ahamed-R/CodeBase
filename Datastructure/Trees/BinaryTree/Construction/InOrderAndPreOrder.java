public class InOrderAndPreOrder {


	// Construct Tree from given Inorder and Preorder traversals

	// Notes :
	//	-> Here, the preStart variable is Static because we need to keep track of the Root Index(in PreOrder) as it goes down the Tree.

	// Time Complexity - O(n^2). 
	// The Time Complexity can be reduced to O(n) using a Map for Finding the Root Index.

	private static int preStart = 0;
	public static Node constructTree(int[] inOrder, int inStart, int inEnd, int[] preOrder) {

		if(inStart > inEnd) {
			System.out.println("While returning "+preStart);
			return null;
		}
		Node root = new Node(preOrder[preStart]);
		System.out.println("The Root is "+preOrder[preStart]);
		int rootIndex = getRootIndex(inOrder, inStart, inEnd, preOrder[preStart++]);
		/*if(rootIndex == -1) {	// This is only necessary if we are going to check whether the Given PreOrder and InOrder Match
			return null;
		}*/
		root.setLChild(constructTree(inOrder, inStart, rootIndex - 1, preOrder));
		root.setRChild(constructTree(inOrder, rootIndex + 1, inEnd, preOrder));
		
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
