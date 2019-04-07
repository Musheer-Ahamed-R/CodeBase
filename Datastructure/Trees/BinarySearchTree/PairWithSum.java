import java.util.*;

public class PairWithSum {

	// Find a pair with given sum in a Balanced BST

	public static void pairWithSum(Node root, int sum) {
		if(root == null) {
			return;
		}
		Node ascNode = root;
		Node descNode = root;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		while(true) {
			while(ascNode != null) {
				s1.push(ascNode);
				ascNode = ascNode.getLChild();
			}
			while(descNode != null) {
				s2.push(descNode);
				descNode = descNode.getRChild();
			}
			if(s1.peek().getData() > s2.peek().getData()) {
				break;
			}
			int tempSum = s1.peek().getData() + s2.peek().getData();
			if(tempSum == sum) {
				System.out.println(s1.pop().getData() +"  "+s2.pop().getData());
				break;
			} else if(tempSum > sum) {
				Node temp = s2.pop();
				descNode = temp.getLChild();
			} else {
				Node temp = s1.pop();
				ascNode = temp.getRChild();
			}
		}
	}


}