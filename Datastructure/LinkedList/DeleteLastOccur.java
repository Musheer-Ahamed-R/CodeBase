
public class DeleteLastOccur {

	// Delete last occurrence of an item from linked list


	public static void deleteLastOccur(Node head, int data) {

		if(head == null) {
			return;
		}
		Application.print(head);
		Node curr = head;
		Node prev = null;
		Node targetPrev = null;
		Node targetCurr = null;
		while(curr != null) {

			if(curr.getData() == data) {
				targetPrev = prev;
				targetCurr = curr;
			}
			prev = curr;
			curr = curr.getNext();
		}
		if(targetCurr != null) {
			if(targetPrev != null)
				targetPrev.setNext(targetCurr.getNext());
			else {
				head = head.getNext();
			}
		}
		Application.print(head);

	}



}