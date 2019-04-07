import java.util.*;

public class NOrderStatistics {

	// K’th smallest element in BST using O(1) Extra Space
	// K’th Largest Element in BST when modification to BST is not allowed
	// Find k-th smallest element in BST (Order Statistics in BST)
	// Second largest element in BST

	public static int nOrderStatisticsRecur(Node root, int currCount, int elemVal) {
		if(root == null) {
			return currCount;
		}
		currCount = nOrderStatisticsRecur(root.getLChild(), currCount, elemVal);
		if(++currCount == elemVal) {
			System.out.println(root.getData());
			return currCount;
		}
		return nOrderStatisticsRecur(root.getRChild(), currCount, elemVal);
	}

	public static void nOrderStatisticsIter(Node root, int elemVal) {
		if(root ==  null) {
			return;
		}
		System.out.println("ITER");
		Node currNode = root;
		Stack<Node> s = new Stack<>();
		int currCount = 0;
		while(true) {
			if(currNode != null) {
				s.push(currNode);
				currNode = currNode.getLChild();
			} else {
				if(s.isEmpty()) {
					break;
				}
				Node temp = s.pop();
				//System.out.println(temp.getData());
				currCount++;
				if(currCount == elemVal) {
					System.out.println(temp.getData());
					break;
				}
				currNode = temp.getRChild();
			}
		}
	}	

	public static void nOrderStatisticsMorris(Node root, int elemVal) {
		if(root == null) {
			return;
		}
		Node currNode = root;
		int count = 0;
		System.out.println("MORR0");
		while(currNode != null) {
			if(currNode.getLChild() == null) {
				count++;
				if(count == elemVal) {
					System.out.println(currNode);
				}
				currNode = currNode.getRChild();
			} else {
				Node inOrderPred = getInOrderPred(currNode);
				if(inOrderPred.getRChild() == currNode) {
					count++;
					if(count == elemVal) {
						System.out.println(currNode);
					}
					inOrderPred.setRChild(null);
					currNode = currNode.getRChild();
				} else {
					inOrderPred.setRChild(currNode);
					currNode = currNode.getLChild();
				}
			}
		}

	}

	public static Node getInOrderPred(Node root) {
		
		if(root == null) {
			return root;
		}
		Node currNode = root.getLChild();
		while(currNode != null && currNode.getRChild() != null && currNode.getRChild() != root) {
			currNode = currNode.getRChild();
		}
		return currNode;
	}

}