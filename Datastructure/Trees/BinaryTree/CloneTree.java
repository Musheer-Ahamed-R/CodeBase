public class CloneTree {

	// Clone a Binary Tree with Random Pointers

	public static Node modifyTree(Node root) {
		if(root == null) {
			return null;
		}
		Node cloneNode = new Node(root.getData());
		Node leftNode = root.getLChild();
		Node rightNode = root.getRChild();
		Node clonedLeft = modifyTree(root.getLChild());
		Node clonedRight = modifyTree(root.getRChild());

		root.setLChild(cloneNode);
		cloneNode.setLChild(leftNode);
		cloneNode.setRChild(clonedRight);

		return cloneNode;
	}

	public static Node getClonedTree(Node root) {
		if(root == null) {
			return null;
		}
		Node clonedNode = root.getLChild();
		root.setLChild(clonedNode.getLChild());

		Node clonedLeft = getClonedTree(root.getLChild());
		Node clonedRight = getClonedTree(root.getRChild());

		clonedNode.setLChild(clonedLeft);
		return clonedNode;
	}

	public static void copyRandom(Node root, Node clonedRoot) {

		if(root == null) {
			return;
		}
		if(root.getNextRight() != null) {
			clonedRoot.setNextRight(root.getNextRight().getLChild());
		}
		if(root.getLChild() != null && root.getLChild().getLChild() != null) {
			copyRandom(root.getLChild().getLChild(), clonedRoot.getLChild().getLChild());
		}
		copyRandom(root.getRChild(), clonedRoot.getRChild());
	}

	public static void cloneTree(Node root) {

		modifyTree(root);
		copyRandom(root, root.getLChild());
		Node clonedTree = getClonedTree(root);	
				
		Application.levelOrder(root);
		System.out.println("----------------------------");
		Application.levelOrder(clonedTree);
	}

}