public class FlattenList {

	// Flattening a Linked List

	
	public static void main(String[] args) {
		
		 DualNode head = new DualNode(5, null, null);
		 head.setRNode(new DualNode(10, null, null));
		 head.getRNode().setRNode(new DualNode(19, null, null));
		 head.getRNode().getRNode().setRNode(new DualNode(28, null, null));

		 head.setLNode(new DualNode(7, null, null));
		 head.getLNode().setLNode(new DualNode(8, null, null));
		 head.getLNode().getLNode().setLNode(new DualNode(30, null, null));


		 head.getRNode().setLNode(new DualNode(20, null, null));
		 
		 head.getRNode().getRNode().setLNode(new DualNode(22, null, null));
		 head.getRNode().getRNode().getLNode().setLNode(new DualNode(50, null, null));

		 head.getRNode().getRNode().getRNode().setLNode(new DualNode(35, null, null));
		 head.getRNode().getRNode().getRNode().getLNode().setLNode(new DualNode(40, null, null));
		 head.getRNode().getRNode().getRNode().getLNode().getLNode().setLNode(new DualNode(45, null, null));


         //head.setNext(new DualNode(31, null));
         //head.getNext().setNext(new DualNode(3, null));
         //head.getNext().getNext().setNext(new DualNode(90, null));
         //head.getNext().getNext().getNext().setNext(new DualNode(12, null));
         //head.getNext().getNext().getNext().getNext().setNext(new DualNode(8, null));
         //head.getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(1, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(8, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(9, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(10, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(11, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(12, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(13, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(14, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(15, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(16, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(17, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(18, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(19, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new DualNode(20, null));


		 //flattenList(head, 4);
		 flattenListRecur(head, head.getRNode());

	}



	public static void flattenList(DualNode head, int size) {

		DualNode[] dualNodes = new DualNode[size];
		DualNode currHead = head;
		for(int i=0;i<size && currHead != null;i++) {
			dualNodes[i] = currHead;
			currHead = currHead.getRNode();
		}
		
		for(int i=1;i<size;i++) {
			 merge(dualNodes[0], dualNodes[i]);
		}

	}

	public static void flattenListRecur(DualNode head1, DualNode head2) {
		if(head2 == null) {
			return;
		}
		merge(head1, head2);
		flattenListRecur(head1, head2.getRNode());
	}

	public static void merge(DualNode head1, DualNode head2) {

		DualNode curr1 = head1;
		DualNode prev1 = null;
		DualNode curr2 = head2;
		DualNode prev2 = null;
		while(curr1 != null && curr2 != null) {
			if(curr2.getData() < curr1.getData()) {
				DualNode next1 = curr1.getLNode();
				DualNode next2 = curr2.getLNode();
				if(prev1 == null) {
					curr2.setLNode(head1);
					head1 = curr2;
				} else {
					prev1.setLNode(curr2);
					curr2.setLNode(curr1);
				}
				prev1 = curr2;					// here curr2 will always be the first node
				curr2 = next2;
			} else {
				prev1 = curr1;
				curr1 = curr1.getLNode();
			}
		}
		if(curr2 != null) {
			prev1.setLNode(curr2);
		}
		print(head1);
		

	}

	public static void print(DualNode head) {
		
		DualNode dummy = head;
		while(dummy != null) {
			System.out.print(dummy.getData()+" ");
			dummy = dummy.getLNode();
		}
		System.out.println();
	}


}