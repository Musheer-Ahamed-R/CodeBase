import java.util.*;

public class ConstructFromParentArr {

	// Construct Binary Tree from given Parent Array representation

	public static void constructFromParentArr(int[] parentArr) {
		if(parentArr == null || parentArr.length == 0) {
			return;
		}
		Map<Integer, Node> nodeMap = new HashMap<>();
		for(int i=0; i<parentArr.length;i++) {
			nodeMap.put(i, new Node(i));
		}
		Node root = null;
		for(int i=0; i<parentArr.length;i++) {
			Node currNode = nodeMap.get(i);
			if(parentArr[i] == -1) {
				root = nodeMap.get(i);
			} else {
				Node parentNode = nodeMap.get(parentArr[i]);
				if(parentNode.getLChild() == null) {
					parentNode.setLChild(currNode);
				} else {
					parentNode.setRChild(currNode);
				}
			}
		}
		Application.levelOrder(root);
	}

}