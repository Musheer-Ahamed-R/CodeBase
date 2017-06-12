public class DeleteFromEnd {

	public static void deleteFromEnd(Node head, int deleteIndex) {

		Node targetNode = null;
		Node prevTarget = null;
		Node currentNode = head;
		int counter = 0;
		
		Application.print(head);

		if(deleteIndex <= 0) {	// because of this, we need not check for the specific condition as we are checking in the below loop 
			System.out.println("The Index for deleting the node is not valid");
			return;
		}

		while(currentNode != null) {
			counter++;

			if(counter == deleteIndex) {
				targetNode = head;
			}
			if(counter > deleteIndex && targetNode != null) {
				prevTarget = targetNode;
				targetNode = targetNode.getNext();
			}
			currentNode = currentNode.getNext();
		}
		if(targetNode == null) {
			System.out.println("The Linked list is smaller or the count is smaller");
		} else {
			if(prevTarget == null) {
				head = head.getNext();
			} else {
				prevTarget.setNext(targetNode.getNext());
			}
		}
		Application.print(head);
	}

}