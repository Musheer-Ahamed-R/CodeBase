import java.util.*;

public class CelebrityProblem {

	// In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party. 
	// We can only ask questions like “does A know B? “. Find the stranger (celebrity) in minimum number of questions.

	// 1 -> 


	public static void findCelebrity(int[][] knowsArray) {

		int celebrity = 0;
		for(int i=1;i<knowsArray.length;i++) {
			if(isKnows(knowsArray, celebrity, i)) {
				celebrity = i;
			}
		}
		System.out.println("The Suspected Celebrity is "+celebrity);

		for(int i=0;i<knowsArray.length;i++) {
			if(i != celebrity && (isKnows(knowsArray, celebrity, i) || !isKnows(knowsArray, i, celebrity))) {
				System.out.println("There is no celebrity");
				return;
			}
		}
		System.out.println("The Celebrity is "+celebrity);
	}

	public static boolean isKnows(int[][] knowsArray, int a, int b) {
		if(knowsArray[a][b] == 1) {
			return true;
		}
		return false;
	}

	// Here Character is used to just for Practice Purpose. Integer Index should be used in this case.
	public static void findCelebrity2(int[][] knowsArray, List<Character> celebrities) {
		Stack<Character> stack = new Stack<>();

		for(Character ch : celebrities) {
			stack.push(ch);
		}
		while(stack.size() > 1) {
			int firstIndex = stack.pop() - 'A';
			int secondIndex = stack.pop() - 'A';
			if(isKnows(knowsArray, firstIndex, secondIndex)) {
				stack.push((char)(secondIndex + (int)'A'));
			} else {
				stack.push((char)(firstIndex + (int)'A'));
			}
		}
		System.out.println("The Suspected Celebrity is "+stack.peek());
		int celebrity = stack.peek() - 'A';
		for(int i=0;i<knowsArray.length;i++) {
			if(i != celebrity && (isKnows(knowsArray, celebrity, i) || !isKnows(knowsArray, i, celebrity))) {
				System.out.println("There is no celebrity");
				return;
			}
		}
		System.out.println("The Celebrity is "+stack.peek());

	}

}