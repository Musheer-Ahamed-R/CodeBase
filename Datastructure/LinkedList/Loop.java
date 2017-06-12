public class Loop {

	// Detect and Remove Loop in a Linked List

	// 1 -> Using a derivation
	// 2 -> Using two loops, one starting from the head and moving one by one and other node is the node from the loop.(check if the 
	//		one of the loop nodes reaches the main node)

	// Derivation 
	// Distance traveled by fast pointer = 2 * (Distance traveled by slow pointer)
	// (m + n*x + k) = 2*(m + n*y + k)
	//  m + k = (x-2y)*n or m = (x-2y)*n - k

	// m -> no of nodes outside of the loop
	// n -> loop length
	// k -> point where the slow and fast pointer met initially
	// x and y are no of rotations(rotating the loop) made by each pointer before meeting



	public static void loop(Node head) {

		if(head == null) {
			return;
		}

		Node firstNode = head;
		Node secondNode = head;

		while(firstNode != null && firstNode.getNext() != null) {
			firstNode = firstNode.getNext().getNext();
			secondNode = secondNode.getNext();
			System.out.println(firstNode);
			System.out.println(secondNode);

			if(firstNode == secondNode) {

				secondNode = head;
				while(secondNode != firstNode) {
					secondNode = secondNode.getNext();
					firstNode = firstNode.getNext();
				}
				System.out.println("Loop found at "+secondNode.getData());
				break;
			}

		}

	}


}