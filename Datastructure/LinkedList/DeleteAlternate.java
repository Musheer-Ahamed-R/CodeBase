public class DeleteAlternate {

	// Delete alternate nodes of a Linked List

	public static void deleteAlternte(Node head) {

		if(head == null) {
			return;
		}

		Node curr = head;
		while(curr != null && curr.getNext() != null) {
			curr.setNext(curr.getNext().getNext());
			curr = curr.getNext();
		}
		Application.print(head);
	}

	public static Node deleteAlternteRecur(Node head) {
		
		if(head == null) {
			return null;
		}

		if(head.getNext() != null) {
			head.setNext(deleteAlternteRecur(head.getNext().getNext()));
		}

		return head;
	}	

 }