public class AddNumber {

	// Add 1 to a number represented as linked list

	// 1 -> Reverse the list and add the no
	// 2 -> Use recursive approach and add from the end

	public static int addNumberRecur(Node head, int no) {

		if(head == null) {
			return no;
		}
		int carry = addNumberRecur(head.getNext(), no);

		return addNumber(head, carry);
	}

	public static Node addNumberRecurMain(Node head, int no) {

		Application.print(head);
		System.out.println("The no to add is "+no);
		int carry = addNumberRecur(head, no);
		Node temp = null;
		if(carry > 0) {
			temp = new Node(carry, null);
			temp.setNext(head);
			head = temp;
		}
		Application.print(head);

		return head;
	}

	public static int addNumber(Node head, int no) {
		
		int data = head.getData()+no;
		head.setData(data % 10);
		
		return data / 10;
	}


}