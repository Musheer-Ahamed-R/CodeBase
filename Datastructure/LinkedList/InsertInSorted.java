public class InsertInSorted {

	public static Node insertInSorted(Node head, int data) {

		Application.print(head);	
		
		Node currNode = head;
		Node prev = null;
		while(currNode != null && currNode.getData() <= data) {
			prev = currNode;
			currNode = currNode.getNext();
		}
		Node insertNode = new Node(data, currNode);
		if(prev == null) {
			head = insertNode;
		} else {
			prev.setNext(insertNode);	
		}

		Application.print(head);
		return head;
	}

}