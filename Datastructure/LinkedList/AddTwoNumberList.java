public class AddTwoNumberList {

	// Add two numbers represented by linked lists

	// 1 -> Reverse the two list and find sum
	// 2 -> Without modyfying the list and without recursion
	// 3 -> Without modyfying the list and recursion

	public static void addTwoNumberList(Node head1, Node head2) {

		Node curr1 = Reverse.reverse(head1);
		Node curr2 = Reverse.reverse(head2);
		
		Node summedNode = null;
		Node summedNodeHead = null;
		int carry = 0;
		while(curr1 != null && curr2 != null) {
			int sum = curr1.getData() + curr2.getData() + carry;
			Node node = new Node(sum % 10, summedNode);
			carry = sum / 10;
			summedNode = node;
			curr1 = curr1.getNext();
			curr2 = curr2.getNext();
		}

		Node curr = null;
		if(curr1 != null) {
			curr = curr1;
		} else if(curr2 != null) {
			curr = curr2;
		}
		while(curr != null) {
			int sum = curr.getData() + carry;
			Node node = new Node(sum % 10, summedNode);
			carry = sum / 10;
			summedNode = node;
			curr = curr.getNext();
		}

		if(carry != 0) {
			Node node = new Node(carry, summedNode);
			summedNode = node;
		}
		System.out.println("--------------");
		Application.print(head1);
		Application.print(head2);
		Application.print(summedNode);

	}

	public static Node addTwoNumberListNoModify(Node head1, Node head2) {

		int count1 = Application.getLength(head1);
		int count2 = Application.getLength(head2);

		int diff = count1 - count2;
		if(diff < 0) {
		    Node temp = head1;
		    head1 = head2;
		    head2 = temp;
			diff = Math.abs(diff);
		}
		Node curr = head1;
		Node prev = null;
		int count = 0;

		System.out.println(diff);
		while(curr != null && count < diff) {
			prev = curr;
			curr = curr.getNext();
			count++;
		}
		
		Node carryNode = addTwoNumbers(curr, head2);
		Application.print(carryNode);
		prev.setNext(null);
		Node finalHead = AddNumber.addNumberRecurMain(head1, carryNode.getData());
		prev.setNext(carryNode.getNext());
		Application.print(finalHead);
		
		return finalHead;
	}

	public static Node addTwoNumberListNoModifyRecurMain(Node head1, Node head2) {
		int count1 = Application.getLength(head1);
		int count2 = Application.getLength(head2);

		int diff = count1 - count2;
		if(diff < 0) {
		    Node temp = head1;
		    head1 = head2;
		    head2 = temp;
			diff = Math.abs(diff);
		}
		Node mainNode = addTwoNumberListNoModifyRecur(head1, head2, diff, 0);
		Application.print(mainNode);

		return mainNode;
	}

	// This method assumes that the first node is greater than the second node
	public static Node addTwoNumberListNoModifyRecur(Node head1, Node head2, int diffCount, int varyCount) {
		if(head1 == null && head2 == null) {
			return new Node(0, null);
		}
		Node carryNode = null;
		Node returnNode = null;
		if(varyCount < diffCount) {
			carryNode = addTwoNumberListNoModifyRecur(head1.getNext(), head2, diffCount, ++varyCount);
			int sum = head1.getData() + carryNode.getData();
			carryNode.setData(sum % 10);
			returnNode = new Node(sum / 10, carryNode);
		} else {
			carryNode = addTwoNumberListNoModifyRecur(head1.getNext(), head2.getNext(), diffCount, ++varyCount);
			int sum = head1.getData() + head2.getData() + carryNode.getData();
			carryNode.setData(sum % 10);
			returnNode = new Node(sum / 10, carryNode);
		}

		return returnNode;
	}

	// This methid assunes that both the list are of the same size
	public static Node addTwoNumbers(Node head, Node head2) {
		
		if(head == null && head2 == null) {
			return new Node(0, null);
		}

		Node dummy = addTwoNumbers(head.getNext(), head2.getNext());
		int sum = head.getData() + head2.getData()  + dummy.getData();
		dummy.setData(sum%10);
		Node sampleNode = new Node(sum / 10, null);
		sampleNode.setNext(dummy);

		return sampleNode;
	}

}