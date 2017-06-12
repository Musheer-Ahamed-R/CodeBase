public class Rearrange {

	// Rearrange a given linked list in-place.

	public static void rearrange(Node head) {
		if(head == null) {
			return;
		}

		Node curr = head;
		Node alternateHead = null;

		Node middle = Middle.middle(head);
		alternateHead = middle.getNext();
		middle.setNext(null);

		Application.print(head);
		Application.print(alternateHead);

		alternateHead = Reverse.reverse(alternateHead);

		curr = head;
		while(curr != null && alternateHead != null) {
			Node next = curr.getNext();
			Node alternateNext = alternateHead.getNext();
			curr.setNext(alternateHead);
			alternateHead.setNext(next);
			alternateHead = alternateNext;
			curr = next;
		}
		Application.print(head);
	}



}