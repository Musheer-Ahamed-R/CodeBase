import java.util.*;

public class Balancedparamthesis {

	// Check for balanced parentheses in an expression

	// 1 -> The last Open Paranthesis is the One that will be get Closed First..	-	O(n)


	public static void isBalanced(String str) {

		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if(ch == ')' || ch == '}' || ch == ']') {
				if(stack.isEmpty()) {
					System.out.println("The String is not balanced");
					return;
				}
				char peekChar = stack.peek();
				if((ch == ')' && peekChar == '(') || (ch == '}' && peekChar == '{') || (ch == ']' && peekChar == '[')) {
					stack.pop();
				} else {
					System.out.println("The String is not balanced");
					return;
				}
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("The String is not balanced");
		} else {
			System.out.println("The String is balanced");
		}
	}

}