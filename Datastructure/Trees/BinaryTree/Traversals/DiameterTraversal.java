import java.util.*;

public class DiameterTraversal {

	// Diagonal Traversal of Binary Tree

	public static void diameterTraversal(Node root) {
		if(root == null) {
			return;
		}
		HashMap<Integer, List<Node>> diaNodes = new HashMap<>();
		traverse(root, 0, diaNodes);
		System.out.println(diaNodes);
	}

	public static void traverse(Node root, int currD, HashMap<Integer, List<Node>> diaNodes) {
		if(root == null) {
			return;
		}
		List<Node> nodeList = diaNodes.get(currD) == null ? new ArrayList<Node>() : diaNodes.get(currD);
		nodeList.add(root);
		diaNodes.put(currD, nodeList);
		traverse(root.getLChild(), currD + 1, diaNodes);
		traverse(root.getRChild(), currD, diaNodes);
	} 

}