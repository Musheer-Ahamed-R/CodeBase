import java.util.*;

public class InfixToPostfix {


	// Note : 
	//	-> Incase of Infix we have to deal with Operator Precedence and Other Stuffs, but in case of prefix or postfix, a operator will only have two operands.i.e There will be no ambiguity
	//	-> This Prefix or Postfix is used by the Computrer language.
	//  -> The Order of Operands WILL NOT CHANGE, whereas, the order of the Operator may change.

	// The Logic is we push operators to the stack. But before that, if the top of the stack has higher precedence or it is NOT (, then we push that and add it our expression. 
	// Otherwise, we push the operator to the stack.
	// If we find a (, then we just add it to the stack().
	// if we find ), then we pop all operands from the stack untill we find a (.

	public static void infixToPostfix(String expression) {

		Stack<Character> s = new Stack<>();
		StringBuilder prefixExpression = new StringBuilder("");
		for(int i=0;i<expression.length();i++) {
			char ch = expression.charAt(i);
			if(Character.isLetter(ch)) {
				prefixExpression.append(ch);
			} else {
				if(ch == ')') {
					if(!s.isEmpty()) {
						while(s.peek() != '(') {
							prefixExpression.append(s.pop());
						}
						s.pop();		
					}
				} else {
					while(!s.isEmpty()) {
						if(s.peek() != '(' && isHigherPrecedence(s.peek(), ch)) {
							char peekChar = s.pop();
							prefixExpression.append(peekChar);
						} else {
							break;
						}
					}
					s.push(ch);
				}
			}
		}
		while(!s.isEmpty()) {
			prefixExpression.append(s.pop());
		}
		System.out.println(prefixExpression);
	}

	public static boolean isHigherPrecedence(char ch1, char ch2) {
		if(getPrecedence(ch1) >= getPrecedence(ch2)) {
			return true;
		} else {
			return false;
		}
	}

	public static int getPrecedence(char ch) {
		if(ch == '(') {
			return 4;
		} else if(ch == '^') {
			return 3;
		} else if(ch == '*' || ch == '/') {
			return 2;
		} else if(ch == '+' || ch == '-') {
			return 1;
		}
		return -1;
	}	

}