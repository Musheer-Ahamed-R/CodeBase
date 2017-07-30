public class LCA {

	// Lowest Common Ancestor

	public static Node lCA(Node root, int data1, int data2) {
		if(root == null) {
			return null;
		}
		Node currNode = root;
		while(currNode != null) {
			int currData = currNode.getData();
			if(currData == data1 || currData == data2) {
				break;
			} else if(currData > data1) {
				if(currData < data2) {
					break;
				} else {
					currNode = currNode.getLChild();
				}
			} else if(currData < data1) {
				if(currData > data2) {
					break;
				} else {
					currNode = currNode.getRChild();
				}
			} 
		}
		System.out.println(currNode.getData());
		return currNode;
	}


}