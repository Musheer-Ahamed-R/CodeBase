public class MergeReverse {

	// Merge two sorted linked lists such that merged list is in reverse order

	// How to solve without reverse, O(1) auxiliary space (in-place) and only one traversal of both	

	public static Node mergeReverse(Node head1, Node head2) {

		if(head1 == null) {
			return head2;
		}
		if(head1 == null) {
			return head1;
		}

		Node currFirst = head1;
		Node currSecond = head2;
		Node targetList = null;
		Node targetHead = null;

		Application.print(head1);
		Application.print(head2);

		while(currFirst != null && currSecond != null) {

			if(currFirst.getData() < currSecond.getData()) {
				Node next = currFirst.getNext();;
				currFirst.setNext(targetList);
				targetList = currFirst;
				currFirst = next;
			} else {
				Node next = currSecond.getNext();
				currSecond.setNext(targetList);
				targetList = currSecond;
				currSecond = next;
			}
		}

		// either of them will be null at this point
		Node curr = null;
		if(currFirst != null) {
			curr = currFirst;
		} else {
			curr = currSecond;
		}
		while(curr != null) {
			Node next = curr.getNext();
			curr.setNext(targetList);
			targetList = curr;
			curr = next;
		}
		Application.print(targetList);

		return targetList;

	}



}