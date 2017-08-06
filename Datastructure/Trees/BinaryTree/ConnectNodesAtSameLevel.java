public class ConnectNodesAtSameLevel {

	// Connect nodes at same level
	// Connect nodes at same level using constant extra space

	public static void connectNodesAtSameLevel(Node root) {
		if(root == null) {
			return;
		}

		connect(root);
	}

	public static void traverseViaNeighbour(Node root) {



	}

	public static void connect(Node root) {
		if(root == null || isLeaf(root)) {
			return;
		}

		Node firstChildOfParNeighbours = getFirstChildOfParentNeighbours(root);
		if(root.getLChild() != null && root.getRChild() != null) {
			root.getLChild().setNextRight(root.getRChild());
			root.getRChild().setNextRight(firstChildOfParNeighbours);
		} else if(root.getLChild() != null) {
			root.getLChild().setNextRight(firstChildOfParNeighbours);
		} else {
			root.getRChild().setNextRight(firstChildOfParNeighbours);
		}
		connectNodesAtSameLevel(root.getRChild());
		connectNodesAtSameLevel(root.getLChild());
	}

	public static boolean isLeaf(Node root) {
		if(root.getLChild() == null && root.getRChild() == null) {
			return true;
		}
		return false;
	}

	public static Node getFirstChildOfParentNeighbours(Node root) {

		Node target = null;
		Node neighbour = root.getNextRight();
		while(neighbour != null) {
			if(neighbour.getLChild() != null || neighbour.getRChild() != null){
				target = neighbour.getLChild() != null ? neighbour.getLChild() : neighbour.getRChild();
				break;
			}

			neighbour = neighbour.getNextRight();	
		}
		return target;
	}

}