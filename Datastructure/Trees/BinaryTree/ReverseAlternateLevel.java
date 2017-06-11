public class ReverseAlternateLevel {

	// Reverse alternate levels of a perfect binary tree

	public static void reverseAlternateLevel(Node node1, Node node2, int level) {
		if(node1 == null && node2 == null) {
			return;
		}
		if(level %2 == 0) {
			int temp = node2.getData();

			node2.setData(node1.getData());
			node1.setData(temp);
		}
		reverseAlternateLevel(node1.getLChild(), node2.getRChild(), level + 1);
		reverseAlternateLevel(node1.getRChild(), node2.getLChild(), level + 1);
	}


}