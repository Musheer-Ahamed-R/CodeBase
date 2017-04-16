public class Reverse {

	// Write a function to reverse a linked list

	// Reversing a Linked list is same logic for both iterative and recursive implementation 

	public static void reverse(Node head) {
		
		if(head == null) {
			return;
		}

		Node prevNode = null;
		Node currNode = head;
		Application.print(head);
		while(currNode != null) {
			Node nextCurr = currNode.getNext();
			currNode.setNext(prevNode);
			prevNode = currNode;
			currNode = nextCurr;
		}
		head = prevNode;
		Application.print(head);
	}

	public static Node reverseRecur(Node prevNode, Node currNode) {

		if(currNode == null) {
			Application.print(prevNode);
			return prevNode;
		} 
		Node nextCurr = currNode.getNext();
		currNode.setNext(prevNode);
		prevNode = currNode;
		currNode = nextCurr;
		return reverseRecur(prevNode, currNode);
	}	
}