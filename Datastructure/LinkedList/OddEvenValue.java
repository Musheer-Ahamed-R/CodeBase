public class OddEvenValue {

	// Segregate even and odd nodes in a Linked List

	// Notes : 
	//		-> Maintain two list, one for odd and one for even
	//		-> Move to the end of the list and move all the odd nodes to the end 	-	O(n)	// Preffered

	public static void oddEvenValueTailPointer(Node head) {

		if(head == null) {
			return;
		}
		Node curr = head;
		while(curr != null && curr.getNext() != null) {
			curr = curr.getNext();
		}
		Node tail = curr;
		Node currTail = tail;
		curr = head;
		Node prev = null;
		Node finalHead = null;
		System.out.println(tail);
		while(curr != tail) {
			System.out.println(curr);
			Node next = curr.getNext();	
			if((curr.getData() & 1) == 0) {	// even node
				currTail.setNext(curr);
				currTail = currTail.getNext();
				curr.setNext(null);
				if(prev != null) {
					prev.setNext(next);
				}
			} else {
				if(finalHead == null) {
					finalHead = curr;
				}
				prev = curr;
			}
			curr = next;
		}
		Application.print(finalHead);
		if(curr != null && (curr.getData() & 1) == 0) {
			Node next = curr.getNext();	
			curr.setNext(null);
			prev.setNext(next);
			currTail.setNext(curr);
		}
		Application.print(finalHead);
	}


	public static void oddEvenValue(Node head) {

		Node curr = head;
		Node oddHead = null;
		Node oddCurr = null;
		Node evenHead = null;
		Node evenCurr = null;

		while(curr != null) {
			Node next = curr.getNext();
			if(curr.getData() % 2 == 0) {
				if(evenCurr == null) {
					evenCurr = curr;
					evenHead = curr;
				} else {
					evenCurr.setNext(curr);
					evenCurr = evenCurr.getNext();
				}
				evenCurr.setNext(null);
			} else {
				if(oddCurr == null) {
					oddCurr = curr;
					oddHead = curr;
				} else {
					oddCurr.setNext(curr);
					oddCurr = oddCurr.getNext();
				}
				oddCurr.setNext(null);
			}
			curr = next;
		}
		if(evenCurr != null) {
			evenCurr.setNext(oddHead);	
			head = evenHead;
		}
		Application.print(head);
	}

}