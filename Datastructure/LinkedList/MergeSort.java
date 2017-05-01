public class MergeSort {

	// Merge Sort for Linked Lists	

	public static Node merge(Node head) {

		if(head == null || head.getNext() == null) {
			return head;
		}

		Node mid = head;
		Node curr = head;
		while(curr != null && curr.getNext() != null && curr.getNext().getNext() != null) {
			mid = mid.getNext();
			curr = curr.getNext().getNext();
		}

		Node first = head;
		Node second = mid.getNext();
		mid.setNext(null);
		first = merge(first);
		second = merge(second);

		return MergeSorted.merge(first, second);
	}


}