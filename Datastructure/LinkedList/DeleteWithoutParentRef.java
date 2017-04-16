public class DeleteWithoutParentRef {

	public static void deleteWithoutParentRef(Node head) {

		if(head == null) {
			return;
		}
		if(head.getNext() == null) {

			return;
		}
		Node nextNode = head.getNext();
		head.setData(nextNode.getData());
		head.setNext(nextNode.getNext());

	}

}