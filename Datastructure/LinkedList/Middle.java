public class Middle {

	// Find the middle of a given linked list in C and Java

	// 1 -> Traverse, find the length, then traverse till the middle 		-	O(n)
	// 2 -> One Node Traverses twice and other Node traverses single Node, 	-	O(n)	(Preffered)
	// if the first node reaches the end(null), then the second node is at the middle	
	// 3 -> while traversing increment the counter and change mid to mid->next whenever the counter is odd.

	// Notes
	// 1 -> We do not have the length of the liked list
	// 2 -> 

	public static void middle(Node head) {

		if(head == null) {
			return;
		}

		Node firstNode = head;
		Node secondNode = head;

		while(firstNode != null && firstNode.getNext() != null && firstNode.getNext().getNext()) {
			firstNode = firstNode.getNext().getNext();
			secondNode = secondNode.getNext();
		}

		System.out.println(secondNode);

	}

}