import java.util.*;

public class CheckCousins {

	// Check if two nodes are cousins in a Binary Tree

	public static boolean checkCousins(Node root, int data1, int data2) {
		if(root == null) {
			return false;
		}	
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		int level = 1;
		int firstLevel = -1;
		int secondLevel = -1;
		while(!q.isEmpty()) {
			int count = q.size();
			while(count > 0) {
				Node target = q.remove();

				if(target.getLChild() != null) {
					q.add(target.getLChild());
					if(target.getLChild().getData() == data1) {
						firstLevel = level + 1;
					} else if(target.getLChild().getData() == data2) {
						secondLevel = level + 1;
					}
					if(target.getRChild() != null && (target.getLChild().getData() == data1 && target.getRChild().getData() == data2) 
						|| (target.getLChild().getData() == data2 && target.getRChild().getData() == data1)) {

						System.out.println("Noooooo they are not cousins");
						return false;
					}
				}

				if(target.getRChild() != null) {
					q.add(target.getRChild());
					if(target.getRChild().getData() == data1) {
						firstLevel = level + 1;
					} else if(target.getRChild().getData() == data2) {
						secondLevel = level + 1;
					}
				}
				count--;
			}
			level++;
		}
		if(secondLevel != -1 && firstLevel != -1 && firstLevel == secondLevel) {
			System.out.println("Yesssss They are cousins");
			return true;
		} else {
			System.out.println("Noooooo --  they are not cousins");
			return false;
		}

	}

}