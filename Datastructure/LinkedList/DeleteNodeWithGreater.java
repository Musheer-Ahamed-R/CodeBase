public class DeleteNodeWithGreater {

	// Delete nodes which have a greater value on right side

	// 1 -> Reversing the list and traversing form the end and checking data with max value.
	// 2 -> Recursion

	private static int max;

	public static void deleteNodeWithGreater(Node head) {

		Node reverse = Reverse.reverse(head);

		int max = reverse.getData();
		Node curr = reverse.getNext();
		Node prev = reverse;
		while(curr != null) {

			if(curr.getData() < max) {
				prev.setNext(curr.getNext());
			} else {
				max = curr.getData();
				prev = curr;
			}
			curr = curr.getNext();
		}
		head = Reverse.reverse(reverse);
		System.out.println("-----------");
		Application.print(head);

	}

	public static Node deleteNodeWithGreaterRecur(Node head) {

		if(head == null) {
			return null;
		}
		if(head.getNext() == null) {
			max = head.getData();
			return head;
		}

		head.setNext(deleteNodeWithGreaterRecur(head.getNext()));
		if(head.getData() < max) {
			return head.getNext();
		} else {
			max = head.getData();
			return head;
		}
	}

}