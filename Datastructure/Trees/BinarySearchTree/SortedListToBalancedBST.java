public class SortedListToBalancedBST {

	// Sorted Linked List to Balanced BST


	public static Node sortedListToBalancedBST(ListNode lHead) {
		if(lHead == null) {
			return null;
		}

		Node tree = makeTree(lHead, getTail(lHead));
		Application.traverse(tree);
		return tree;
	}

	public static Node makeTree(ListNode lHead, ListNode lTail) {
		
		if(lHead == null) {
			return null;
		}
		if(lHead == lTail) {
			return new Node(lHead.getData());
		}
		ListNode prevMid = getPrevMidNode(lHead, lTail);
		ListNode mid = null;
		if(prevMid == null) {
			Node currNode = new Node(lHead.getData());
			if(lHead.getNext() != null) {
				currNode.setRChild(new Node(lHead.getNext().getData()));
			}
			return currNode;
		} else {
			mid = prevMid.getNext();
		}
		Node node = new Node(mid.getData());
		node.setLChild(makeTree(lHead, prevMid));
		node.setRChild(makeTree(mid.getNext(), lTail));
		return node;
	}

	public static ListNode getPrevMidNode(ListNode lHead, ListNode lTail) {
		if(lHead == null) {
			return null;
		}
		ListNode fir = lHead;
		ListNode sec = lHead;
		ListNode prevMid = null;
		while(fir != lTail && fir.getNext() != lTail) {
			fir = fir.getNext().getNext();
			prevMid = sec;
			sec = sec.getNext();
		}
		return prevMid;
	}

	public static ListNode getTail(ListNode lHead) {
		if(lHead == null) {
			return null;
		}
		ListNode curr = lHead;
		while(curr.getNext() != null) {
			curr = curr.getNext();
		}
		return curr;
	}


}