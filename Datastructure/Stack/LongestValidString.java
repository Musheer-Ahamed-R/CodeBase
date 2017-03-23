import java.util.*;

public class LongestValidString {

	// Given a string consisting of opening and closing parenthesis, find length of the longest valid parenthesis substring.


	// 1 -> Using stack 		- O(n)
	//		Note : 
	//			-> In this method, the Top of the Stack is ALWAYS the Point AFTER which the String is Valid




	public static void longestValidString(String str) {

		int maxCount = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(') {
				stack.push(i);
			} else if(str.charAt(i) == ')') {
				stack.pop();
				if(stack.isEmpty()) {			// This is the Point from where the String becomes Invalid.
					stack.push(i);
				} else {						// This case only happens when the String has some valid Substring. 
					maxCount = Integer.max(maxCount, i - stack.peek());
				}
			}
		}
		System.out.println(maxCount);
	}

	// This fails in case where the String is like (()()(()()
	/*public static void longestValidString(String str) {

		int maxCount = 0;
		int count = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else {
				if(stack.isEmpty()) {
					if(maxCount < count) {
						maxCount = count;
					}
					count = 0;
				} else {
					stack.pop();
					count += 2;
				}
			}
		}
		if(maxCount < count) {
			maxCount = count;
		}	
		System.out.println(maxCount);
	}*/

}