public class DeleteConstraint {

	// Delete a given node in Linked List under given constraints

	public static void deleteConstraint(Node head, int data) {

		if(head == null) {
			return;
		}

		Node curr = head;
		Node prev = null;
		while(curr != null) {
			if(curr.getData() == data) {
				if(prev == null) {
					Node next = curr.getNext();
					curr.setData(next.getData());
					curr.setNext(next.getNext());
				} else {
					prev.setNext(curr.getNext());
				}
				break;
			}
			prev = curr;	
			curr = curr.getNext();
		}
		Application.print(head);
	}

}