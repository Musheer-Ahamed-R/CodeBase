public class AlternateReverse {

	// Reverse alternate K nodes in a Singly Linked List

	public static void alternateReverse(Node head, int count) {

		if(head == null) {
			return;
		}
		int order = 0;
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			if(order == 0) {
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
			order ^= 1;
		}
		Application.print(head);
	}




}
