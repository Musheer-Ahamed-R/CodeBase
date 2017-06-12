public class ShiftNodes {

	// Rotate a Linked List

	// 1 -> changing the link of the tail element to the head upto the kth element

	public static void shiftNodes(Node head, int shiftUpto) {

		Application.print(head);
		if(head == null || head.getNext() == null) {
			Application.print(head);
			return;
		}

		/*Node tail = head;
		int length = 1;
		while(tail != null && tail.getNext() != null) {
			length++;
			tail = tail.getNext();
		}
		if(length <= shiftUpto) {
			Application.print(head);
			return;
		}
		Node curr = head;
		int count = 0;
		while(curr != null && count < shiftUpto) {
			Node next = curr.getNext();
			tail.setNext(curr);
			curr.setNext(null);
			curr = next;
			tail = tail.getNext();
			count++;
		}*/

		





		/*Node curr = head;
		while(curr != null && count < shiftUpto - 1) {

			curr = curr.getNext();
			count++;
		}
		if(curr == null) {
			return;
		}
		Node firstPart = curr.getNext();
		curr.setNext(null);
		Node tail = firstPart;
		while(tail !=null && tail.getNext() != null) {
			tail = tail.getNext();
		}
		
		//firstPart.setNext(head);
		tail.setNext(head);
		head = firstPart;*/

		Node tail = head;
		int count = 0;
		Node secEnd = null;
		while(tail !=null && tail.getNext() != null) {
			if(count == shiftUpto -1) {
				secEnd = tail;
			}
			count++;	
			tail = tail.getNext();
		}
		if(secEnd == null) {
			System.out.println("------------");
			Application.print(head);
			return;
		}
		Node firstPart = secEnd.getNext();
		tail.setNext(head);
		secEnd.setNext(null);
		Application.print(firstPart);

	}

}