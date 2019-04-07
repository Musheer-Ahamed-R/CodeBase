public class ConstructFromInOrderPreOrder {

	// Construct Tree from given Inorder and Preorder traversals

	// 1 -> Using the Property of PreOrder(Left Child is IMMEDIATELY after current node) 			-	O(n^2) (Worst case skewed tree)
	//		and InOrder(A Node will have all of its left child on its and left and vice versa).

	// Notes : 
	// 	-> The Time Complexity can be reduced to O(n) using a Map for Finding the Root Index.

	static int preIndex = 0;

	public static Node constructFromInOrderPreOrder(int[] inOrder, int[] preOrder, int inStart, int inEnd) {

		if(inStart > inEnd) {
			return null;
		}
		Node currNode = null;
		int i = inStart;
		while(i<=inEnd) {
			if(preOrder[preIndex] == inOrder[i]) {
				currNode = new Node(preOrder[preIndex++]);
				break;
			}
			i++;
		}
		currNode.setLChild(constructFromInOrderPreOrder(inOrder, preOrder, inStart, i-1));
		currNode.setRChild(constructFromInOrderPreOrder(inOrder, preOrder, i+1, inEnd));
		System.out.print(currNode+" ");
		return currNode;
	}



}