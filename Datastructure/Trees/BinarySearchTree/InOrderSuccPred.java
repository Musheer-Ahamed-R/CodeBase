public class InOrderSuccPred {

	// Inorder predecessor and successor for a given key in BST

	public static void inOrderSuccPred(Node root, int data) {
		if(root == null) {
			return;
		}
		Node currNode = root;
		Node leftParent = null;
		Node rightParent = null;
		int minRange = Integer.MIN_VALUE;
		int maxRange = Integer.MAX_VALUE;
		while(currNode != null) {
			
			if(currNode.getData() == data) {
				Node currBackUp = currNode;
				if(currNode.getRChild() == null) {
					if(leftParent != null) {	// it will be null for the last element(rightmost node) 
						System.out.println(leftParent.getData());
					}
				} else {
					currNode = currNode.getRChild();
					while(currNode != null && currNode.getLChild() != null) {
						currNode = currNode.getLChild();
					}
					System.out.println(currNode.getData());
				}
				currNode = currBackUp;
				if(currNode.getLChild() == null) {
					if(rightParent != null) {	// it will be null for the leftmost element 
						System.out.println(rightParent.getData());
					}
				} else {
					currNode = currNode.getLChild();
					while(currNode != null && currNode.getRChild() != null) {
						currNode = currNode.getRChild();
					}
					System.out.println(currNode);
				}
				break;
			} else if(currNode.getData() > data) {
				maxRange = currNode.getData();
				leftParent = currNode;
				currNode = currNode.getLChild();
			} else {
				minRange = currNode.getData();
				rightParent = currNode;
				currNode = currNode.getRChild();
			}
		}
		if(currNode == null) {
			System.out.println("The Range is "+minRange+" -> "+maxRange);
			System.out.println("The Range is "+leftParent+" -> "+rightParent);
		}
	}



}