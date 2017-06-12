public class InsertionSort {

	public static void insertionSort(Node head) {

		if(head == null) {
			return;
		}
		Node curr = head.getNext();
		Node orderedHead = head;
		orderedHead.setNext(null);
		while(curr != null) {
			Node next = curr.getNext(); 
			Node node = curr;
			Node orderCurr = orderedHead;
			Node prevOrder = null;
			while(orderCurr != null && curr.getData() > orderCurr.getData()) {
				prevOrder = orderCurr;
				orderCurr = orderCurr.getNext();
			}
			curr.setNext(orderCurr);
			if(prevOrder == null) {
				orderedHead = curr;
			} else {
				prevOrder.setNext(curr);
			}
			curr = next;
			Application.print(orderedHead);
		}

		Application.print(orderedHead);
	}


}