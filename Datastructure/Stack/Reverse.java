import java.util.*;

public class Reverse {

	public static void reverse(String str) {

		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		//System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}



}