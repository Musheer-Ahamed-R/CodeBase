
import java.util.*;

public class Clone {

	// Clone a linked list with next and random pointer

	// 1 -> Hashing

	public static void clone(Node head) {

		Node curr = head;
		Node dummyHead = null;
		Node dummyNode = null;

		Map<Node, Node> map = new HashMap<>();
		while(curr != null) {

			Node node = new Node(curr.getData(), null);
			if(dummyHead == null) {
				dummyHead = node;
				dummyNode = node;
			} else {
				dummyNode.setNext(node);
				dummyNode = dummyNode.getNext();
			}
			map.put(curr, node);
			curr = curr.getNext();
		}
		curr = head;
		while(curr != null && dummyNode != null) {
			Node nextArr = curr.getRNext();
			dummyNode.setLNext(map.get(nextArr));
			curr = curr.getNext();
			dummyNode = dummyNode.getNext();
		}

	}



}