public class AddNumber {

	public static int addNumberRecur(Node head, int no) {

		if(head == null) {
			return no;
		}

		if(head.getNext() == null) {
			return addNumber(head, no);
		}
		int carry = addNumberRecur(head.getNext(), no);

		return addNumber(head, carry);
	}

	public static void addNumberRecurMain(Node head) {

		Application.print(head);
		int carry = addNumberRecur(head, 5);
		Node temp = null;
		if(carry > 0) {
			temp = new Node(carry, null);
			temp.setNext(head);
			Application.print(temp);
		}
		
		Application.print(head);
	}

	public static int addNumber(Node head, int no) {
		
		int data = head.getData()+no;
		head.setData(data % 10);
		
		return data / 10;
	}


}