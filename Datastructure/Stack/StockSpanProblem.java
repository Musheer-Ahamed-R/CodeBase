import java.util.*;

public class StockSpanProblem {


	public static void stockSpan(int[] arr) {

		Stack<Integer> s = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(s.isEmpty()) {
				s.push(i);
			} else {
				while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
					int peek = s.pop();
					arr[peek] = peek - i;
				}
				s.push(i);
			}
		}
		while(!s.isEmpty()) {
			int index = s.pop();
			arr[index] = index + 1;
		}
		for(int elem : arr) {
			System.out.print(elem+" ");
		}
	}



}


