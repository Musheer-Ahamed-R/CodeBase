public class MoveLastToFirst {

	// Move last element to front of a given Linked List

	public static void moveLastToFirst(Node head) {
		if(head == null || head.getNext() == null) {
			return;
		}

		Node curr = head;
		Node prev = null;
		while(curr != null && curr.getNext() != null) {
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(null);
		curr.setNext(head);
		head = curr;

		Application.print(head);
	}
}