import java.util.*;

public class DuplicateExpression {

	public static void duplicateExpression(String exp) {
		if(exp == null || exp.equals("")) {
			return;
		}
		Stack<Integer> stack = new Stack<>();
		int prevOpen = -1;
		int prevClosed = -1;	
		for(int i=0;i<exp.length();i++) {
			if(exp.charAt(i) == '(') {
				stack.push(i);
			} else if(exp.charAt(i) == ')') {
				Integer openIndex = stack.pop();
				if(prevClosed != -1 && (i - prevClosed == 1) && (prevOpen - openIndex == 1)) {
					System.out.println(exp.substring(prevOpen + 1, prevClosed));
				}
				prevClosed = i;
				prevOpen = openIndex;
			}
		}
	}

}