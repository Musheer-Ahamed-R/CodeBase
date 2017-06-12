public class AlternateSplit {

	// Alternating split of a given Singly Linked List

	public static void alternateSplit(Node head) {
		if(head == null || head.getNext() == null) {
			return;
		}

		Node firstList = head;
		Node firstHead = head;
		Node secondList = head.getNext();
		Node secondHead = head.getNext();
		Node curr = head.getNext().getNext();
		while(curr != null && curr.getNext() != null) {
			
			Node next = curr.getNext().getNext();
			firstList.setNext(curr);
			secondList.setNext(curr.getNext());
			firstList = firstList.getNext();
			firstList.setNext(null);
			secondList = secondList.getNext();
			secondList.setNext(null);
			curr = next;
		}
		if(curr != null) {
			firstList.setNext(curr);
		}
		Application.print(firstHead);
		Application.print(secondHead);

	}


}