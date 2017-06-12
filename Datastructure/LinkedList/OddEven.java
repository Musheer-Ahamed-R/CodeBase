public class OddEven {

	// Rearrange a linked list such that all even and odd positioned nodes are together

	// 1 -> Changing links
	// 2 -> Pushing odd elements to the front
	// 3 -> pushing odd elements to the tail

	public static void oddEven(Node head) {

		if(head == null || head.getNext() == null) {
			Application.print(head);
			return;
		}

		Node oddHead = head;
		Node evenHead = head.getNext();

		Node oddCurr = oddHead;
		Node evenCurr = evenHead;
		Node curr = head.getNext().getNext();
		int count = 0;
		while(curr != null) {
			if(count % 2 == 0) {
				oddCurr.setNext(curr);
				oddCurr = oddCurr.getNext();
			} else {
				evenCurr.setNext(curr);
				evenCurr = evenCurr.getNext();
			}
			count++;
			Node next = curr.getNext();
			curr.setNext(null);
			curr = next;
		}
		oddCurr.setNext(evenHead);
		Application.print(oddHead);
	}


}