import java.util.*;

public class NextGreater {

	public static void nextGreater(int[] arr) {

		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(stack.isEmpty()) {
				stack.push(arr[i]);
			} else {
				while(!stack.isEmpty() && stack.peek() <= arr[i]) {
					System.out.println(stack.pop() +" --> "+arr[i]);
				}
				stack.push(arr[i]);
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" --> "+-1);
		}
	}

}