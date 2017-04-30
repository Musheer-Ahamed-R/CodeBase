public class SortAscDesc {

	// Sort a linked list that is sorted alternating ascending and descending orders?

	public static void sortAscDesc(Node head) {

		if(head == null && head.getNext() != null) {
			return;
		}
		Application.print(head);
		Node firstList = head;
		Node firstHead = head;
		//Node secondList = head.getNext();
		Node secondHead = head.getNext();
		Node curr = head.getNext().getNext();
		secondHead.setNext(null);
		while(curr != null && curr.getNext() != null) {
			
			Node next = curr.getNext().getNext();
			firstList.setNext(curr);
			

			curr.getNext().setNext(secondHead);
			secondHead = curr.getNext();
			//secondList.setNext(curr.getNext());
			

			firstList = firstList.getNext();
			firstList.setNext(null);
			

			curr = next;
		}
		if(curr != null) {
			firstList.setNext(curr);
		}

		//secondHead = Reverse.reverse(secondHead);

		Application.print(firstHead);
		Application.print(secondHead);


		Node mergedHead = MergeSorted.merge(firstHead, secondHead);
	}



}