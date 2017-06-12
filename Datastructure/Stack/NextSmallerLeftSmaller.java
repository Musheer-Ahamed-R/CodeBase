import java.util.*;


public class NextSmallerLeftSmaller {

	public static void nextSmallerRightSmaller(int[] arr) {

		Stack<Integer> stack = new Stack<>();

		int[] nextSmaller = new int[arr.length];
		int[] prevSmaller = new int[arr.length];

		Arrays.fill(nextSmaller, 0);
		//Arrays.fill(prevSmaller, 0);

		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				nextSmaller[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		stack.clear();
		// This is beased on the logic that the element greater than the previous element will not be considered when dealing with previous smaller element
		// because, either the previous element or the element lesser than that will only be considered
		for(int i=0; i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				prevSmaller[i] = arr[stack.peek()];
			} else {
				prevSmaller[i] = 0;
			}
			stack.push(i);
		}
		System.out.println(Arrays.toString(nextSmaller));
		System.out.println(Arrays.toString(prevSmaller));
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			max = Integer.max(Math.abs(nextSmaller[i] - prevSmaller[i]), max);
		}
		System.out.println(max);

	}


}