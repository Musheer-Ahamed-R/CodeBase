import java.util.*;

public class LongestValidString {

	// Given a string consisting of opening and closing parenthesis, find length of the longest valid parenthesis substring.


	// 1 -> Using stack 		- O(n)
	//		Note : 
	//			-> In this method, whenever there is a close brace, 
	//				and stack is not empty diff from peek and i
	//				if stack is empty, prev elem to valid



	public static void longestValidString(String str) {

		Stack<Integer> stack = new Stack<>();
		int validFrom = 0;	
		int maxCount = 0;	
		for(int i=0;i<exp.;length();i++) {
			if(exp.charAt(i) == '(') {
				stack.push(i);
			} else if(exp.charAt(i) == ')') {
				if(stack.isEmpty()) {
					maxCount = Integer.max(maxCount, i-1 - validFrom);
					validFrom = i+1;	
				} else {
					stack.pop();
					maxCount = Integer.max(maxCount, stack.peek());
				
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