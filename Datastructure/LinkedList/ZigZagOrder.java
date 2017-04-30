public class ZigZagOrder {

	// Rearrange a Linked List in Zig-Zag fashion

	public static void zigZagOrder(Node head) {

		if(head == null) {
			return;
		}

		Node curr = head;
		Node prev = null;
		int order = 0;
		while(curr != null && curr.getNext() != null) {
			Node next = curr.getNext();
			if(order == 0) {
				if(curr.getData() > next.getData()) {
					Node nextOfNext = next.getNext();
					if(prev == null) {
						head = next;

					} else {
						prev.setNext(next);
					}
					next.setNext(curr);
					curr.setNext(nextOfNext);
					
					prev = next;		// curr remains same after shifting
				} else {
					prev = curr;
					curr = next;
				}
			} else {
				if(curr.getData() < next.getData()) {
					Node nextOfNext = next.getNext();
					if(prev == null) {
						head = next;

					} else {
						prev.setNext(next);
					}
					next.setNext(curr);
					curr.setNext(nextOfNext);

					prev = next;		// curr remains same after shifting
				} else {
					prev = curr;
					curr = next;
				}
			}
			order ^= 1;	
		}
		Application.print(head);
	}

}