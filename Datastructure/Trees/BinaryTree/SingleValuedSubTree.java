public class SingleValuedSubTree {

	// Find Count of Single Valued Subtrees

	static int count = 0;

	public static boolean singleValuedSubTree(Node root) {
		
		if(root == null) {
			return true;
		}
		if(root.getLChild() == null && root.getRChild() == null) {
			count++;
			return true;
		}
		boolean isLeftSingleValued = singleValuedSubTree(root.getLChild());
		boolean isRightSingleValued = singleValuedSubTree(root.getRChild());

		if(isLeftSingleValued && isRightSingleValued) {
		
			int currData = root.getData();
			boolean isCurrSingleValued = false;
			if(root.getLChild() != null) {
				isCurrSingleValued = currData == root.getLChild().getData();
			}
			if(root.getRChild() != null) {
				isCurrSingleValued = isCurrSingleValued && currData == root.getRChild().getData();
			}
			if(isCurrSingleValued) {
				count++;
			}
			return isCurrSingleValued;
		}
		return false;
	}



}