import java.util.*;

public class MaxDiff {

	public static void maxDiff(int[] arr) {
		if(arr == null) {
			return;
		}
		Stack<Integer> stack = new Stack<>();
		int maxDiff = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				int currInd = stack.pop();
				int diff = Math.abs(arr[i] - (!stack.isEmpty() ? arr[stack.peek()] : 0));
				maxDiff = Integer.max(maxDiff, diff);
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			int currInd = stack.pop();
			int diff = !stack.isEmpty() ? arr[stack.peek()] : 0;
			maxDiff = Integer.max(maxDiff, diff);
		}
		System.out.println(maxDiff);
	}


}