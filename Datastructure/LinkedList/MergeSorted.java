public class MergeSorted {

	public static Node merge(Node head1, Node head2) {

		if(head1 == null) {
			return head2;
		}
		if(head1 == null) {
			return head1;
		}

		Node currFirst = head1;
		Node currSecond = head2;
		Node targetList = null;
		Node targetHead = null;

		//Application.print(head1);
		//Application.print(head2);

		while(currFirst != null && currSecond != null) {

			if(currFirst.getData() < currSecond.getData()) {

				if(targetList == null) {
					targetHead = currFirst;
				} else {
					targetList.setNext(currFirst);
				}
				targetList = currFirst;
				currFirst = currFirst.getNext();
				targetList.setNext(null);
			} else {

				if(targetList == null) {
					targetHead = currSecond;
				} else {
					targetList.setNext(currSecond);
				}
				targetList = currSecond;
				currSecond = currSecond.getNext();
				targetList.setNext(null);
			}
			//targetList = targetList.getNext();
		}

		// either of them will be null at this point
		if(currFirst != null) {
			targetList.setNext(currFirst);
		} else {
			targetList.setNext(currSecond);
		}
		//Application.print(targetHead);

		return targetHead;
	}

	public static Node mergeRecur(Node head1, Node head2) {


		if(head1 == null) {
			return head2;
		} 
		if(head2 == null) {
			return head1;
		}
		Node target = null;
		if(head1.getData() < head2.getData()) {
			target = head1;
			target.setNext(mergeRecur(head1.getNext(), head2));
		} else {
			target = head2;
			target.setNext(mergeRecur(head1, head2.getNext()));
		}
		
		return target;


	}


}