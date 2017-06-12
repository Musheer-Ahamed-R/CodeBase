public class ReverseOfSize {

	// Reverse a Linked List in groups of given size

	public static void reverseOfSize(Node head, int size) {

		if(head == null) {
			return;
		}
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node reverseHead = curr;
			Node tail = curr;
			curr = curr.getNext();
			for(int i=0;i<size-1 && curr != null;i++) {
				Node next = curr.getNext();
				curr.setNext(reverseHead);	
				reverseHead = curr;
				curr = next;
			}
			if(prev == null) {
				head = reverseHead;
			} else {
				prev.setNext(reverseHead);
			}
			prev= tail;
			tail.setNext(curr);
		}
		Application.print(head);
	}


}