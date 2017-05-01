public class MaximumSum {

	// Construct a Maximum Sum Linked List out of two Sorted Linked Lists having some Common nodes
	// INCOMPLETE
	public static void maximumSum(Node head1, Node head2) {

		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1 != null && curr2 != null) {
			if(curr1.getData() < curr2.getData()) {
				while(curr1 != null && curr1.getData() < curr2.getData()) {
					curr1 = curr1.getNext();
				}
			} else if(curr2.getData() < curr1.getData()) {
				while(curr2 != null && curr2.getData() < curr1.getData()) {
					curr2 = curr2.getNext();
				}
			} else {
				Node next1 = curr1.getNext();
				Node next2 = curr2.getNext();
				if(next1 != null && next2 == null) {
					curr2.setNext(next1);
				} else if(next2 != null && next1 == null) {
					curr1.setNext(next2);
				} else {
					if(next1.getData() > next2.getData()) {
						next2.setData(next1.getData());
					} else if(next2.getData() > next1.getData()) {
						next1.setData(next2.getData());	
					}
					// else the next data is also same so proceed	
				}
				curr1 = next1.getNext();
				curr2 = next2.getNext();
			}
		}		
		Application.print(head1);
		Application.print(head2);
	}



}