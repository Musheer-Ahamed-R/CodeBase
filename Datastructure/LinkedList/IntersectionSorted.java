public class IntersectionSorted {

	// Intersection of two Sorted Linked Lists

	public static void intersectionSorted(Node head1, Node head2) {

		Node intersect = null;
		Node intersectHead = null;
		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1 != null && curr2 != null) {
			if(curr1.getData() < curr2.getData()) {
				curr1 = curr1.getNext();
			} else if(curr2.getData() < curr1.getData()) {
				curr2 = curr2.getNext();
			} else {
				if(intersect == null) {
					intersect = new Node(curr1.getData(), null);
					intersectHead = intersect;
				} else {
					if(intersect.getData() != curr1.getData()) {
						intersect.setNext(new Node(curr1.getData(), null));
						intersect = intersect.getNext();
					}
				}
				curr1 = curr1.getNext();
				curr2 = curr2.getNext();
			}
		}
		Application.print(intersectHead);
	}

	public static void intersectionSortedRecur(Node head1, Node head2, Node intersect) {
		
		if(head1 == null || head2 == null) {
			return;
		}
		
		if(head1.getData() < head2.getData()) {
			intersectionSortedRecur(head1.getNext(), head2, intersect);
		} else if(head2.getData() < head1.getData()) {
			intersectionSortedRecur(head1, head2.getNext(), intersect);
		} else {
			if(intersect.getData() != head1.getData()) {
				intersect.setNext(new Node(head1.getData(), null));
				intersectionSortedRecur(head1.getNext(), head2.getNext(), intersect.getNext());
			} else {
				intersectionSortedRecur(head1.getNext(), head2.getNext(), intersect);	
			} 

		}

	}	

}