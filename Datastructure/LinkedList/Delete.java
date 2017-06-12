public class Delete {

	public static void delete(Node head, int nodeIndex) {

		Node currNode = head;
		Node prevNode = null;
		int count = 0;
		Application.print(head);
		while(currNode != null) {
			count++;
			if(count == nodeIndex) {
				if(prevNode == null) {
					head = head.getNext();
				} else {
					prevNode.setNext(currNode.getNext());
				}
			}
			prevNode = currNode;
			currNode = currNode.getNext();
		}
		Application.print(head);

	}


}