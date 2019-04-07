public class BoundaryTraveresal {

	public static void boundaryTraveresal(Node root) {
		if(root == null) {
			return;
		}
	}

	static int leftLevel = 0;
	static int rightLevel = 0;
	
	public static void traverse(Node root, int lLevel, rLevel) {
		if(root == null) {
			return;
		}
		if(leftLevel == rightLevel && leftLevel == level) {
			System.out.println(root.getData());
			leftLevel++;
			rightLevel++;
		}
		if(leftLevel == lLevel) {
			System.out.println(root.getData());
			leftLevel++;
		}
		if(rightLevel == rLevel) {
			System.out.println(root.getData());
			rightLevel++;
		}
		traverse(root.getLChild(), root.getRChild(), lLevel + 1, rLevel + 1);
		traverse(root.getRChild(), root.getLChild(), lLevel + 1, rLevel + 1);
	}


}