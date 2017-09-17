public class ConnectNodesAtSameLevel {

	// Connect nodes at same level
	// Connect nodes at same level using constant extra space

	// 1 -> Level Order Traversal		-	O(n)
	// 2 -> PreOrder Traversal 			-	O(n)
	//			-> This only works for complete Binary Tree


	public static void connectNodesAtSameLevel(Node root) {
		if(root == null) {
			return;
		}

		connect(root);
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

	public static void connectLevel(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);

		while(!q.isEmpty()) {
			int count = q.size();
			Node prevNodeToConnect = null;
			Node firstNode = q.peek();
			while(count > 0) {
				Node target = q.remove();
				if(prevNodeToConnect == null) {
					prevNodeToConnect = target;
				} else {
					prevNodeToConnect.setNextRight(target);
					prevNodeToConnect = target;
				}
				if(target.getLChild() != null) {
					q.add(target.getLChild());
				} 
				if(target.getRChild() != null) {
					q.add(target.getRChild());
				}  
				count--;
			}
			Node temp = firstNode;
			while(temp != null) {
				System.out.print(temp.getData()+"  ");
				temp = temp.getNextRight();
			}
			System.out.println();
		}
	}


}