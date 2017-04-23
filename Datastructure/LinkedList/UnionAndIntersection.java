import java.util.*;

public class UnionAndIntersection {

	// Union and Intersection of two Linked Lists

	// 1 -> Using hashing technique
	// 2 -> Sort both list and merge. find union and intersection in this process


	// This method assumes that the same list does not contain duplicates
	public static void unionAndIntersection(Node head1, Node head2) {

		Set<Integer> set = new HashSet<>();
		
		Node unionList = head1;
		Node unionEnd = null;
		Node intersectionList = null;
		Node intersectionEnd = null;

		Node curr = head1;
		while(curr != null) {
			set.add(curr.getData());
			unionEnd = curr;
			curr = curr.getNext();
			
		}

		curr = head2;
		while(curr != null) {
			Node next = curr.getNext();
			if(set.contains(curr.getData())) {
				if(intersectionEnd == null) {
					intersectionList = curr;
					intersectionEnd = curr;
				} else {
					intersectionEnd.setNext(curr);
					intersectionEnd = intersectionEnd.getNext();
				}
				intersectionEnd.setNext(null);
			} else {
				unionEnd.setNext(curr);
				unionEnd = unionEnd.getNext();
				unionEnd.setNext(null);
			}
			curr = next;
		}
		Application.print(unionList);
		Application.print(intersectionList);

	}

}