public class PrintCommonNodes {

	public static void printCommonNodes(Node root1, Node root2) {
		if(root1 == null || root2 == null) {
			return;
		}

		Node currNode1 = root1;
		Node currNode2 = root2;
		while(currNode1 != null && currNode2 != null) {


			if(currNode1.getLChild() == null) {
				// printing
				System.out.println(currNode1.getData());
				currNode1 = currNode1.getRChild();
			} else {
				Node pred = getInOrderPred(currNode1);
				if(pred.getRChild() == currNode1) {
					// printing
					System.out.println(currNode1.getData());
					pred.setRChild(null);
					currNode1 = currNode1.getRChild();
				} else {
					pred.setRChild(currNode1);
					currNode1 = currNode1.getLChild();
				}
			}
			if(currNode2.getLChild() == null) {
				// printing
				System.out.println(currNode2.getData());
				currNode2 = currNode2.getRChild();
			} else {
				Node pred = getInOrderPred(currNode2);
				if(pred.getRChild() == currNode2) {
					// printing
					System.out.println(currNode2.getData());
					pred.setRChild(null);
					currNode2 = currNode2.getRChild();
				} else {
					pred.setRChild(currNode2);
					currNode2 = currNode2.getLChild();
				}
			}
		}
	}

	public static Node getInOrderPred(Node root) {
		if(root == null) {
			return null;
		}
		Node curr = root.getLChild();
		while(curr != null && curr.getRChild() != null && curr.getRChild() != root) {
			curr = curr.getRChild();
		}
		return curr;
	}

}