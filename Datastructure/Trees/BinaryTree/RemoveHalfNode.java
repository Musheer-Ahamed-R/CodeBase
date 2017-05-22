public class RemoveHalfNode {

	public static Node removeHalfNode(Node root) {
		if(root == null) {
			return null;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			return root;
		}
		if(root.getLChild() == null || root.getRChild() == null) {
			if(root.getLChild() == null) {
				return removeHalfNode(root.getRChild());
			} else {
				return removeHalfNode(root.getLChild());
			}
		}
		root.setLChild(removeHalfNode(root.getLChild()));
		root.setRChild(removeHalfNode(root.getRChild()));
		
		return root;
	}
	
}