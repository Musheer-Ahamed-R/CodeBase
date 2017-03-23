
import java.util.*;

public class SortStack {

	public static void sortStack(Stack<Integer> s) {
		
		if(s.isEmpty()) {
			return;
		}
		int data = s.pop();
		sortStack(s);
		sortElem(s, data);
	}

	public static void sortElem(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int popData = s.pop();
		if(data >= popData) {
			s.push(popData);
			s.push(data);
		} else {
			sortElem(s, data);
			s.push(popData);
		}
	}

}