public class DeleteMiddlePoints {

	// Given a linked list of line segments, remove middle points

	public static void deleteMiddlePoints(NodeAxis head) {

		NodeAxis curr = head;
		while(curr != null && curr.getNext() != null) {
			NodeAxis next = curr.getNext();
			NodeAxis lastNode = null;
			if(curr.getXData() == next.getXData()) {
				lastNode = getLastNode(next, 'x', curr.getXData());
			} else if(curr.getYData() == next.getYData()) {
				lastNode = getLastNode(next, 'y', curr.getYData());
			} else {
				// the list is invalid since atleast either x or y must be same between two nodes
			}
			curr.setNext(lastNode);
			curr = curr.getNext();
		}
		while(head != null) {
        	System.out.println(head);
        	head = head.getNext();
        }
	}

	public static NodeAxis getLastNode(NodeAxis head, char axis, int value) {

		if(head == null || head.getNext() == null) {
			return head;
		}

		NodeAxis curr = head.getNext();
		NodeAxis prev = head;
		while(curr != null) {
			if(axis == 'x' && curr.getXData() != value) {
				break;
			} else if(axis == 'y' && curr.getYData() != value) {
				break;
			}
			prev = curr;
			curr = curr.getNext();
		}
		return prev;
	}


}