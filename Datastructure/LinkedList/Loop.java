public class Loop {

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