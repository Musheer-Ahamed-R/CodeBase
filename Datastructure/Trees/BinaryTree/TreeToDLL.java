public class TreeToDLL {

	// Convert a given Binary Tree to Doubly Linked List

	static Node curr = null;

	public static void treeToDLL(Node root) {
		if(root == null) {
			return;
		}
		treeToDLL(root.getLChild());
		if(curr != null) {
			curr.setRChild(root);
			root.setLChild(curr);		
		}
		curr = root;
		treeToDLL(root.getRChild());
	}

	public static void print(Node head) {
		if(head == null) {
			return;
		}
		while(head != null) {
			System.out.print(head.getData()+"  ");
			head = head.getLChild();
		}
	}


}