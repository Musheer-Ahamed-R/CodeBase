public class DeleteAtIndex {

	public static void deleteAtIndex (Node head, int index) {

		Application.print(head);
		if(head == null) {
			Application.print(head.getNext());
			//return head;
		}
		if(index == 0) {
			head = head.getNext();
			Application.print(head);
			//return head.getNext();
		}

		Node curr = head;
		int count = 0;
		while(curr != null) {
			if(index == count+1) {
				Node next = curr.getNext();
				if(next == null) {
					curr.setNext(null);
				} else {
					curr.setNext(next.getNext());
				}
				break;
			}
			count++;
			curr = curr.getNext();
		}

		Application.print(head);
	}



}