public class Duplicates {

	public static void duplicates(Node head) {

		if(head == null) {
			return;
		}
		Application.print(head);
		Node curr = head;
		/*Node prev = null;
		while(curr != null) {
			if(prev == null) {
				prev = curr;
			} else {
				if(prev.getData() == curr.getData()) {
					prev.setNext(null);
				} else {
					prev.setNext(curr);
					prev = curr;
				}
			}
			curr = curr.getNext();
		}*/

		while(curr != null && curr.getNext() != null) {
			if(curr.getData() == curr.getNext().getData()) {
				curr.setNext(curr.getNext().getNext());
			} else {
				curr = curr.getNext();
			}
		}
		Application.print(head);


	}



}