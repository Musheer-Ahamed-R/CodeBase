public class PairwiseSwap {

	// Pairwise swap elements of a given linked list

	// 1 -> Keeping a hold for the previous node and swap the curr and next nodes
	// 2 -> Swap the DATA of the current and next node


	public static void pairwiseSwap(Node head) {

		if(head == null) {
			return;
		}
		Node curr = head;
		Node prev = null;
		while(curr != null && curr.getNext() != null) {
			Node next = curr.getNext().getNext();	// Be very careful with tihs
			if(prev == null) {
				head = curr.getNext();
				head.setNext(curr);
				curr.setNext(next);
			} else {
				prev.setNext(curr.getNext());
				curr.getNext().setNext(curr);
				curr.setNext(next);
			}
			prev = curr;
			curr = curr.getNext();
		}
		Application.print(head);
	}

}