import java.util.*;

public class RootToLeafPath {

	// Given a binary tree, print out all of its root-to-leaf paths one per line
	// Given a binary tree, print all root-to-leaf paths

	// This camn also be achieved using an array, with a variable having the current size of the array
	// (This is used for replacing value at that index and printing upto that index).

	static List<Node> pathNodes = new ArrayList<>();
	public static void rootToLeafPath(Node root) {
		if(root == null) {
			return;
		}
		pathNodes.add(root);
		if(root.getLChild() == null && root.getRChild() == null) {
			System.out.println(pathNodes);
		} else {
			rootToLeafPath(root.getLChild());
			rootToLeafPath(root.getRChild());
		}
		pathNodes.remove(pathNodes.size() - 1);
	}


}