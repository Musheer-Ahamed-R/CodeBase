import java.util.*;

public class ReverseStack {

	// Reverse a stack using recursion

	// 1 -> Using Recursion to reach the Last Element and from there add the element to the Top of the Stack using recursion 	- O(n^2)

	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int data = s.pop();
		reverseStack(s);
		addElem(s, data);
	}

	public static void addElem(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int popData = s.pop();
		addElem(s, data);
		s.push(popData);
	}

}