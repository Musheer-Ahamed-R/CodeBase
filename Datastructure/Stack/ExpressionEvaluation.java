import java.util.*;

public class ExpressionEvaluation {

	public static void evaluateExpression(String expression) {


		Stack<Integer> s = new Stack<>();
		for(int i=0;i<expression.length();i++) {
			char ch = expression.charAt(i);
			if(Character.isDigit(ch)) {
				s.push(Character.getNumericValue(ch));
			} else {
				int op2 = s.pop();
				int op1 = s.pop();
				int result = evaluate(op1, op2, ch);
				s.push(result);
			}
		}
		System.out.println(s.peek());
	}

	public static int evaluate(int op1, int op2, char operator) {
		if(operator == '*') {
			return op1 * op2;
		} else if(operator == '/') {
			return op1 / op2;
		}else if(operator == '+') {
			return op1 + op2;
		} else if(operator == '-') {
			return op1 - op2;
		} else {
			return 0;
		}
	}

}