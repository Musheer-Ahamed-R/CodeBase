public class ConstructFromPreOrder {

	// Construct a special tree from given preorder traversal

	static int index = 0;
	public static Node constructFromPreOrder(int[] preOrder, char[] propArr) {

		if(index >= preOrder.length) {
			return null;
		}
		Node curr = new Node(preOrder[index]);
		if(propArr[index] == 'N') {
			index++;
			curr.setLChild(constructFromPreOrder(preOrder, propArr));
			index++;
			curr.setRChild(constructFromPreOrder(preOrder, propArr));
		}
		return curr;
	}


}