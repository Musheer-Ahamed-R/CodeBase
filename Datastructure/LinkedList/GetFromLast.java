public class GetFromLast {

	public static void getFromLast(Node head, int nodeIndex) {

		Node currentNode = head;
		Node targetNode = null;
		int counter = 0;
		while(currentNode != null) {

			currentNode = currentNode.getNext();
			counter++;
			if(counter >= nodeIndex) {
				targetNode = targetNode == null ? head : targetNode.getNext();
			}
		}
		System.out.println(targetNode);
	}


}