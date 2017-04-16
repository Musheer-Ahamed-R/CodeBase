import java.util.*;

public class Palindrome {

	// 1 -> Function to check if a singly linked list is palindrome

	// 1 -> Using a Stack 	-	O(n)
	//			-> Entirely all elements in stack, then compare each
	//			-> from Mid into stack	
	// 2 -> Reversing after mid and comparing one by one with the head
	// 3 -> Using Recursion	



	public static void palindrome(Node head) {

		//System.out.println("The Mid is "+mid);
		if(head == null) {
			return;
		}
		
		Node curr = head;
		Stack<Node> stack = new Stack<>();
		while(curr != null) {
			stack.push(curr);
			curr = curr.getNext();
		}
		curr = head;
		while(curr != null) {
			if(stack.pop().getData() != curr.getData()) {
				System.out.println("Its not a palindrome");	
				return;
			}
			curr = curr.getNext();
		}
		System.out.println("Its a palindrome");
	}

	public static Node palindromeRecur(Node head1, Node head2) {

		if( head1 == null) {
			return head2;
		}

		Node tempNode = palindromeRecur(head1.getNext(), head2);
		if(tempNode == null || tempNode.getData() != head1.getData()) {
			return null;
		}

		if(tempNode.getNext() == null) {
			return new Node(-1, null);
		}
		return tempNode.getNext();
	}
}