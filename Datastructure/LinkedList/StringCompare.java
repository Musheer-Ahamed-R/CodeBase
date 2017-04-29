public class StringCompare {

	// Compare two strings represented as linked lists


	public static int stringCompare(NodeChar head1, NodeChar head2) {

		NodeChar curr1 = head1;
		NodeChar curr2 = head2;
		while(curr1 != null && curr2 != null) {
			if(curr1.getData() == curr2.getData()) {
				curr1 = curr1.getNext();
				curr2 = curr2.getNext();
			} else {
				if(curr1.getData() > curr2.getData()) {
					return 1;
				} else {
					return -1;
				}
			}
		}
		if(curr1 != null) {
			return 1;
		} else if(curr2 != null) {
			return -1;
		}
		return 0;
	}


}