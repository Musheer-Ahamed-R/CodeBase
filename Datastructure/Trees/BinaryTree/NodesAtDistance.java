public class NodesAtDistance {

	public static int nodesAtDistance(Node root, int data, int level) {
		if(root == null) {
			return -1;
		}
		if(root.getData() == data) {
			System.out.println(root.getData()+" Node Found");
			PrintNodesFromRoot.printNodesFromRoot(root, level);
			
			return level - 1;
		}
		int lLevel = nodesAtDistance(root.getLChild(), data, level);
		int rLevel = 0;
		if(lLevel >= 0) {
			if(lLevel == 0) {
				System.out.println(root.getData());
				return -1;
			} else {
				PrintNodesFromRoot.printNodesFromRoot(root.getRChild(), lLevel - 1);
				return lLevel - 1;
			}

		} else if((rLevel = nodesAtDistance(root.getRChild(), data, level)) >= 0) {
			if(rLevel == 0) {
				System.out.println(root.getData());
				return -1;
			} else {
				PrintNodesFromRoot.printNodesFromRoot(root.getLChild(), rLevel - 1);
				return rLevel - 1;
			}
		}
		return -1;
	}

}