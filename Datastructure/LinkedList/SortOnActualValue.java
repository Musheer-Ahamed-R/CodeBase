public class SortOnActualValue {

	// Sort linked list which is already sorted on absolute values

	// 1 -> Moving elements to the Front									-	O(n)	// preffered
	// 2 -> Moving elements to the last and then reversing and then joining	-	O(n)

	public static void sortOnActualValue1(Node head) {

		if(head == null) {
			return;
		}
		Node prev = head;
		Node curr = head.getNext();
		while(curr != null) {
			
			if(curr.getData() < 0) {
				prev.setNext(curr.getNext());
				curr.setNext(head);
				head = curr;
			} else {
				prev = curr;
			}
			curr = prev.getNext();
		}
		Application.print(head);

	}

	public static void sortOnActualValue2(Node head) {

		if(head == null) {
			return;
		}

		Node curr = head;
		while(curr != null && curr.getNext() != null) {
			curr = curr.getNext();
		}
		Node tail = curr;
		Node tailHead = tail;
		curr = head;
		Node prev = new Node(-1, null);
		Node currHead = null;
		while(curr != tailHead) {
			Node next = curr.getNext();
			if(curr.getData() >= 0) {
				tail.setNext(curr);
				curr.setNext(null);
				prev.setNext(next);
				tail = curr;
			} else {
				if(currHead == null) {
					currHead = curr;
				}
				prev = curr;
			}
			curr = next;
		}
		Node head2 = tailHead.getNext();
		if(tailHead.getData() >= 0) {
			prev.setNext(null);
			tail.setNext(tailHead);
		}
		tailHead.setNext(null);

		Node first = currHead;
		currHead = Reverse.reverse(currHead);
		first.setNext(head2);
		Application.print(currHead);
	}


}