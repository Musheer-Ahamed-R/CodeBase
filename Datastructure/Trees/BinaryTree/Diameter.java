public class Diameter {

	// Diameter of a Binary Tree

	public static Pair diameter(Node root) {

		if(root == null) {
			return new Pair(0, 0);
		}
		Pair leftPair = diameter(root.getLChild());
		Pair rightPair = diameter(root.getRChild());

		int maxDiameter = Integer.max(leftPair.diameter, rightPair.diameter);

		int height = Integer.max(leftPair.height, rightPair.height) + 1;
		int diameter = Integer.max((leftPair.height + rightPair.height + 1), maxDiameter);
		return new Pair(height, diameter);
	}


	public static void main(String[] args) {
		
		Node tree = new Node(1, null, null);

      tree.setLChild(new Node(2, null, null));
      tree.setRChild(new Node(3, null, null));

      tree.getLChild().setLChild(new Node(4, null, null));
      tree.getLChild().setRChild(new Node(5, null, null));
      //tree.getRChild().setLChild(new Node(6, null, null));
      tree.getRChild().setRChild(new Node(7, null, null));
//
      tree.getLChild().getLChild().setLChild(new Node(8, null, null));
      tree.getLChild().getLChild().setRChild(new Node(9, null, null));
      
      tree.getLChild().getRChild().setLChild(new Node(10, null, null));
      tree.getLChild().getRChild().setRChild(new Node(11, null, null));
      
      //tree.getRChild().getLChild().setLChild(new Node(12, null, null));
      //tree.getRChild().getLChild().setRChild(new Node(13, null, null));
      
      //tree.getRChild().getRChild().setLChild(new Node(14, null, null));
      //tree.getRChild().getRChild().setRChild(new Node(15, null, null));
      
      
       tree.getLChild().getLChild().getLChild().setLChild(new Node(16));
       tree.getLChild().getLChild().getLChild().setRChild(new Node(17));
       //tree.getLChild().getLChild().getRChild().setLChild(new Node(18));
       //tree.getLChild().getLChild().getRChild().setRChild(new Node(19));
      
       tree.getLChild().getRChild().getLChild().setLChild(new Node(20));
       tree.getLChild().getRChild().getLChild().setRChild(new Node(21));
       tree.getLChild().getRChild().getRChild().setLChild(new Node(22));
       tree.getLChild().getRChild().getRChild().setRChild(new Node(23));
      
       //tree.getRChild().getLChild().getLChild().setLChild(new Node(24));
       //tree.getRChild().getLChild().getLChild().setRChild(new Node(25));
       //tree.getRChild().getLChild().getRChild().setLChild(new Node(26));
       //tree.getRChild().getLChild().getRChild().setRChild(new Node(27));
      
       //tree.getRChild().getRChild().getLChild().setLChild(new Node(28));
       //tree.getRChild().getRChild().getLChild().setRChild(new Node(29));
       //tree.getRChild().getRChild().getRChild().setLChild(new Node(30));
       //tree.getRChild().getRChild().getRChild().setRChild(new Node(31));


       tree.getLChild().getLChild().getLChild().getLChild().setLChild(new Node(32));
       tree.getLChild().getLChild().getLChild().getLChild().setRChild(new Node(33));
       tree.getLChild().getRChild().getLChild().getRChild().setRChild(new Node(34));
       tree.getLChild().getRChild().getLChild().getRChild().getRChild().setRChild(new Node(34));

		Pair pair = Diameter.diameter(tree);
      	System.out.println(pair.diameter);
	}


}

class Pair {

	int height;
	int diameter;

	public Pair(int height, int diameter) {
		this.height = height;
		this.diameter = diameter;
	}
}