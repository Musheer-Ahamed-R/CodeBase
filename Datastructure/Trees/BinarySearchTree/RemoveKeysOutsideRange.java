public class RemoveKeysOutsideRange {

	//Remove BST keys outside the given range

	
	public static Node removeKeysOutsideRange (Node root, int from, int to) {
		if(root == null) {
			return root;
		}
		if(root.getData() < from) {
			return removeKeysOutsideRange(root.getRChild(), from, to);
		}
		if(root.getData() > to) {
			return removeKeysOutsideRange(root.getLChild(), from, to);
		}
		root.setLChild(removeKeysOutsideRange(root.getLChild(), from, to));
		root.setRChild(removeKeysOutsideRange(root.getRChild(), from, to));
		return root;
	}


}