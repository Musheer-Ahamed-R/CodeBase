import java.util.*;

public class MaxWidth {

	// Maximum width of a binary tree

	public static void maxWidth(Node root) {

		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		int maxWidth = 0;
		while(!q.isEmpty()) {
			int count = q.size();
			maxWidth = Integer.max(count, maxWidth);
			while(count > 0) {
				Node target = q.remove();
				if(target.getLChild() != null) {
					q.add(target.getLChild());
				}
				if(target.getRChild() != null) {
					q.add(target.getRChild());
				}
				count--;
			}
		}

		System.out.println(maxWidth);
	}



}