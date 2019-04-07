public class SortedArrToBalancedBST {

	// Sorted Array to Balanced BST

	public static Node sortedArrToBalancedBST(int[] arr) {
		if(arr == null) {
			return null;
		}

		Node tree = makeTree(arr, 0, arr.length-1);
		Application.traverse(tree);
		return tree;
	}

	public static Node makeTree(int[] a, int from, int to) {

		if(from > to) {
			return null;
		}
		if(from == to) {
			return new Node(a[from]);
		}
		int mid = (from + to) / 2;
		Node node = new Node(a[mid]);
		node.setLChild(makeTree(a, from, mid - 1));
		node.setRChild(makeTree(a, mid + 1, to));
		return node;
	}


}