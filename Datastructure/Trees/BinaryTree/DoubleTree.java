public class DoubleTree {

	// Double Tree

	public static void doubleTree(Node root) {
		if(root == null) {
			return;
		}
		Node lChild = root.getLChild();
		Node dupNode = new Node(root.getData());
		root.setLChild(dupNode);
		dupNode.setLChild(lChild);
		
		doubleTree(lChild);
		doubleTree(root.getRChild());
	}


}