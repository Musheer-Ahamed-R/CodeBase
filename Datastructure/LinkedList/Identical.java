public class Identical {

	// Identical Linked Lists

	public static void identical(Node head1, Node head2) {

		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1 != null && curr2 != null) {

			if(curr1.getData() != curr2.getData()) {
				break;
			}
			curr1 = curr1.getNext();
			curr2 = curr2.getNext();
		}
		if(curr1 != null || curr2 != null) {
			System.out.println("Not Identical");
		} else {
			System.out.println("Identical");
		}

	}


}