public class ConvertChildrenSum {

	// Convert an arbitrary Binary Tree to a tree that holds Children Sum Property

	public static void convertChildrenSum(Node root) {
		if(root == null) {
			return;
		}

		if(root.getLChild() == null && root.getRChild() == null) {
			return;
		}

		int currData = root.getData();
		int childSum = getChildData(root);

		if(currData > childSum) {
			if(root.getLChild() != null) {
				root.getLChild().setData(root.getLChild().getData() + currData - childSum);
			} else {
				root.getRChild().setData(root.getRChild().getData() + currData - childSum);
			}
		}
		convertChildrenSum(root.getLChild());
		convertChildrenSum(root.getRChild());

		System.out.println(root.getData());
		System.out.println(getChildData(root));

		root.setData(getChildData(root));
	}

	public static int getChildData(Node root) {
		if(root == null) {
			return 0;
		}
		int sum = 0;
		if(root.getLChild() != null) {
			sum += root.getLChild().getData();
		}
		if(root.getRChild() != null) {
			sum += root.getRChild().getData();
		}
		return sum;
	}


}