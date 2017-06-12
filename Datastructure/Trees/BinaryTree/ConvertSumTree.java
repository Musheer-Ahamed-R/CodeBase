public class ConvertSumTree {

	// Convert a given tree to its Sum Tree


	public static int convertSumTree(Node root) {
		if(root == null) {
			return 0;
		}
		int lSum = convertSumTree(root.getLChild());
		int rSum = convertSumTree(root.getRChild());

		int currSum = root.getData();
		root.setData(lSum + rSum);

		return currSum + root.getData();
	}


}