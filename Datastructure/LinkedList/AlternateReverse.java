public class AlternateReverse {

	// Reverse alternate K nodes in a Singly Linked List

	public static void alternateReverse(Node head, int count) {

		if(head == null) {
			return;
		}
		boolean order = true;
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			if(order) {
				Node tail = curr;
				Node reverseHead = curr;
				curr = curr.getNext();
				for(int i=0;i<count-1 && curr != null;i++) {
					Node next = curr.getNext();
					curr.setNext(reverseHead);
					reverseHead = curr;
					curr = next;
				}
				if(prev != null) {
					prev.setNext(reverseHead);
				} else {
					head = reverseHead;
				}
				tail.setNext(curr);
				prev = tail;
			} else {
				for(int i=0;i<count && curr != null;i++) {
					prev = curr;
					curr = curr.getNext();
				}
			}
			order = !order;
		}
		Application.print(head);
	}




}
