import java.util.*;

public class NextSmallerOfNextGreater {

	// Find next Smaller of next Greater in an array

	// 1 -> Find the Next Greater and the Next Smaller for all the Elements 

	public static void nextSmallerOfNextGreater(int[] elem) {

		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		
		int[] nextGreater = new int[elem.length];
		int[] nextSmaller = new int[elem.length];

		Arrays.fill(nextGreater, -1);
		Arrays.fill(nextSmaller, -1);

		for(int i=0;i<elem.length;i++) {

			while(!stack1.isEmpty() && elem[stack1.peek()] < elem[i]) {
				nextGreater[stack1.pop()] = i;
			}
			stack1.push(i);
		}		

		for(int i=0;i<elem.length;i++) {

			while(!stack2.isEmpty() && elem[stack2.peek()] > elem[i]) {
				nextSmaller[stack2.pop()] = i;
			}
			stack2.push(i);
		}

		for(int i=0;i<elem.length;i++) {
			
			if(nextGreater[i] != -1 && nextSmaller[nextGreater[i]] != -1) {
				System.out.println(elem[i]+" "+elem[nextSmaller[nextGreater[i]]]);
			} else {
				System.out.println(elem[i]+" "+-1);
			}
		}

	}

}