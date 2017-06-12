public class DeleteSomeAfterSome {

	// Delete N nodes after M nodes of a linked list
	
	public static Node deleteSomeAfterSome(Node head, int beforeCount, int deleteCount) {

		if(beforeCount == 0) {
			return null;
		}
		if(deleteCount == 0) {
			return head;
		}

		Application.print(head);
		Node curr = head;
		int count = 0;
		int alt = 0;
		Node beforeLast = null;
		
		/*while(curr != null) {
			if(alt == 0) {
				if(count < beforeCount) {
					if(count+1 == beforeCount) {
						count = 0;
						beforeLast = curr;
						alt ^= 1;
					} else {
						count++;
					}
				}
			} else {
				if(count < deleteCount) {
					if(count+1 == deleteCount) {
						count = 0;
						beforeLast.setNext(curr.getNext());
						alt ^= 1;
					} else {
						count++;
					}
				}
			}
			curr = curr.getNext();
		}
		if(alt == 1) {
			beforeLast.setNext(null);
		}*/

		while(curr != null) {
			//Node beforeLast = null;
			for(int i=0;i<beforeCount-1 && curr != null;i++) {
				curr = curr.getNext();
			}
			beforeLast = curr;
			if(beforeLast != null) {
				for(int i=0;i<=deleteCount && curr != null;i++) {	// here <= because the curr ended at the lastBefore node and not at the BEGINING of the deleteNode
					curr = curr.getNext();
				}
				beforeLast.setNext(curr);
			}

		}

		Application.print(head);
		return head;
	}

}