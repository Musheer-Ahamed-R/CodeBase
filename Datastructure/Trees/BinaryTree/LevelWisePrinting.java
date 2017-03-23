import java.util.*;
public class LevelWisePrinting {
	
	// Given a binary tree, print level order traversal in a way that nodes of all levels are printed in separate lines.

	// 1-> Using Level Order traversal		- O(n)

	public static void makeThreaded(Node root) {

		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			while(size-- > 0) {
				Node target = q.remove();	
				System.out.print(target+"  ");
				if(target.getLChild() != null) {
					q.add(target.getLChild());
				}
				if(target.getRChild() != null) {
					q.add(target.getRChild());
				}
			}
			System.out.println();
		}

	}

}