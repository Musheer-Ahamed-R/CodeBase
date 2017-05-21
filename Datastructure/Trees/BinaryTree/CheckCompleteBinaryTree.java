import java.util.*;

public class CheckCompleteBinaryTree {

	// Check whether a given Binary Tree is Complete or not

	public static void checkCompleteBinaryTree(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		boolean checkNodeExists = false;
		boolean isBinary = true;
		while(!q.isEmpty()) {
			Node target = q.remove();
			System.out.println(target);
			if(target.getLChild() == null) {
				checkNodeExists = true;	
			} else {
				if(checkNodeExists) {
					System.out.println("No it is NOT a COmplete Binary Tree "+target);
					isBinary = false;
					break;
				} else {
					q.add(target.getLChild());
				}
			}
			if(target.getRChild() == null) {
				checkNodeExists = true;	
			} else {
				if(checkNodeExists) {
					System.out.println("No it is NOT a COmplete Binary Tree "+target);
					isBinary = false;
					break;
				} else {
					q.add(target.getRChild());
				}
			}
		}
		if(isBinary) {
			System.out.println("IT IS a COmplete Binary Tree");
		}


	}


}