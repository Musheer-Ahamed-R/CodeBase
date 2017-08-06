import java.util.*;

public class MergeBST {

	// Merge two BSTs with limited extra space

	public static void mergeBST(Node root1, Node root2) {
		if(root1 == null || root2 == null) {
			return;
		}

		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();

		Node currNode1 = root1;
		Node currNode2 = root2;
		while(true) {
			while(currNode1 != null) {
				s1.push(currNode1);
				currNode1 = currNode1.getLChild();
			}
			while(currNode2 != null) {
				s2.push(currNode2);
				currNode2 = currNode2.getLChild();
			}
			if(s1.isEmpty() || s2.isEmpty()) {
				if(s1.isEmpty() && s2.isEmpty()) {
					break;
				}
				if(s1.isEmpty()) {
					s1 = s2;
				}
				currNode1 = s1.pop();
				System.out.println(currNode1);
				currNode1 = currNode1.getRChild();
				while(true) {
					if(currNode1 != null) {
						s1.push(currNode1);
						currNode1 = currNode1.getLChild();
					} else {
						if(s1.isEmpty()) {
							break;
						}
						currNode1 = s1.pop();
						System.out.println(currNode1);
						currNode1 = currNode1.getRChild();
					}
				}
				break;
			}
			Node node1 = s1.pop();
			Node node2 = s2.pop();
			if(currNode1 == null && currNode2 == null) {
				if(node1.getData() == node2.getData()) {
					System.out.println(node1.getData());
					currNode1 = node1.getRChild();
					currNode2 = node2.getRChild();
				} else if(node1.getData() < node2.getData()) {
					System.out.println(node1.getData());
					currNode1 = node1.getRChild();
					s2.push(node2);
				} else {
					System.out.println(node2.getData());
					currNode2 = node2.getRChild();
					s1.push(node1);
				}
			}
		}
	}

	public static Node getInOrderPred(Node root) {
		if(root == null) {
			return null;
		}
		Node curr = root.getLChild();
		while(curr != null && curr.getRChild() != null && curr.getRChild() != root) {
			curr = curr.getRChild();
		}
		return curr;
	}

}