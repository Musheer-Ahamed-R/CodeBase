public class MergeAlternate {

	public static Node mergeAlternate(Node head1, Node head2) {

		if(head1 == null) {
			Application.print(head2);
			return head2;
		}
		if(head2 == null) {
			Application.print(head1);
			return head1;
		}

		Node curr1 = head1;
		Node curr2 = head2;

		while(curr1 != null && curr2 != null) {
			Node next1 = curr1.getNext();
			Node next2 = curr2.getNext();
			curr1.setNext(curr2);
			curr2.setNext(next1);	
			
			if(next1 == null) {
				curr2.setNext(next2);
			}

			curr1 = next1;
			curr2 = next2;

		}
		/*if(curr1 == null) {
			head1.setNext(curr2);
		} else if(curr2 == null) {
			head1.setNext(curr1);
		}*/

		Application.print(head1);
		return head1;
	}

}