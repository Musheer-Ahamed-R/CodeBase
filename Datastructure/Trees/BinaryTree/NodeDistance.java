public class NodeDistance {

	// Find distance between two given keys of a Binary Tree

	public static int nodeDistance(Node root, int data1, int data2) {
		if(root == null) {
			return 0;
		}
		int lDist = nodeDistance(root.getLChild(), data1, data2);
		int rDist = nodeDistance(root.getRChild(), data1, data2);
		if(data1 == root.getData() || data2 == root.getData()) {
			if(Integer.max(lDist, rDist) > 0) {
				System.out.println("Found at "+root);
				System.out.println(Integer.max(lDist, rDist));
				return 0;
			} else {
				return 1;
			}
		} else {
			if(lDist > 0 && rDist > 0) {
				System.out.println("Found at "+root);
				System.out.println((lDist + rDist));
				return 0;
			}
			if(lDist == 0 && rDist == 0) {
				return 0;
			} else {
				return Integer.max(lDist, rDist) + 1;
			}
		}
	}

}