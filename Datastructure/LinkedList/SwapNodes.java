public class SwapNodes {


	// Swap nodes in a linked list without swapping data

	// Notes : 
	//	-> It may be assumed that all keys in linked list are distinct. (This is the most important point)
	// 	-> There are four switching needs to be done.
	//		 -> prevX -> currY	// if prevX is null, then head = currY
	//		 -> prevY -> currX	// if prevY is null, then head = currX
	//		 ->	currX -> currY.next
	// 		 -> currY -> currX.next
	//	-> In caseof adjacent pointers, currX->next will point to itself (As prevY is nothing but currX)

	public static void swapNodes(Node head, int data1, int data2) {

		Node tempHead = head;
		Node prevOne = null;
		Node currOne = null;
		Node prevTwo = null;	
		Node currTwo = null;	

		Node prev = null;
		int count = 0;
		while(tempHead != null) {

			if(tempHead.getData() == data1) {
				prevOne = prev;
				currOne = tempHead;
			} else if (tempHead.getData() == data2) {
				prevTwo = prev;
				currTwo = tempHead;
			}
			prev = tempHead;
			tempHead = tempHead.getNext();
		}

		// special case
		if(currOne == null || currTwo == null) {
			System.out.println("Both are NOT present");
		} else {
			System.out.println("Both are present");
			if(prevOne != null) {
				prevOne.setNext(currTwo);
			} else {
				head = currTwo;
			}
			if(prevTwo != null) {
				prevTwo.setNext(currOne);
			} else {
				head = currOne;
			}

			Node temp = currOne.getNext();
			currOne.setNext(currTwo.getNext());
			currTwo.setNext(temp);
			
		}
		Application.print(head);

	}


}