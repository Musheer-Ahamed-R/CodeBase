import java.util.*;

public class ConnectLevel {

	// Connect nodes at same level

	// 1 -> Level Order Traversal		-	O(n)
	// 2 -> PreOrder Traversal 			-	O(n)
	//			-> This only works for complete Binary Tree

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