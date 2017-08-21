public class RemoveOddParent {

	public static void removeOddParent(Node root) {
		if(root == null) {
			return;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			return;
		}
		removeOddParent(root.getLChild());
		removeOddParent(root.getRChild());
		
		if(root.getData()%2 == 0) {
			return;
		}
		// root is odd
		if(root.getLChild() != null && root.getLChild().getData() % 2 == 0) {
			bringOddDown(root);
		} else if(root.getRChild() != null && root.getRChild().getData() % 2 == 0) {
			bringOddDown(root);
		}
	}

	public static void bringOddDown(Node root) {
		if(root == null) {
			return;
		}
		int data = root.getData();
		if(root.getLChild() != null && root.getLChild().getData() % 2 == 0) {
			Node lChild = root.getLChild();
			root.setData(lChild.getData());
			lChild.setData(data);
			bringOddDown(lChild);
		} else if(root.getRChild() != null && root.getRChild().getData() % 2 == 0) {
			Node rChild = root.getRChild();
			root.setData(rChild.getData());
			rChild.setData(data);
			bringOddDown(rChild);
		}
	}



}