import java.util.*;

public class Application {

  public static void main(String[] args) {

    Node tree = new Node(1, null, null);

    tree.setLChild(new Node(2, null, null));
    tree.setRChild(new Node(3, null, null));

    tree.getLChild().setLChild(new Node(4, null, null));
    tree.getLChild().setRChild(new Node(5, null, null));
    tree.getRChild().setLChild(new Node(6, null, null));
    tree.getRChild().setRChild(new Node(7, null, null));

  	// tree.getLChild().getLChild().setLChild(new Node(8, null, null));
  	// tree.getLChild().getLChild().setRChild(new Node(9, null, null));
  	// tree.getLChild().getRChild().setLChild(new Node(10, null, null));
    // tree.getLChild().getRChild().setRChild(new Node(11, null, null));
  	// tree.getRChild().getLChild().setLChild(new Node(12, null, null));
  	// tree.getRChild().getLChild().setRChild(new Node(13, null, null));
  	// tree.getRChild().getRChild().setLChild(new Node(14, null, null));
  	// tree.getRChild().getRChild().setRChild(new Node(15, null, null));
    //
    //
		// tree.getLChild().getLChild().getLChild().setLChild(new Node(16));
		// tree.getLChild().getLChild().getLChild().setRChild(new Node(17));
		// tree.getLChild().getLChild().getRChild().setLChild(new Node(18));
		// tree.getLChild().getLChild().getRChild().setRChild(new Node(19));
    //
		// tree.getLChild().getRChild().getLChild().setLChild(new Node(20));
		// tree.getLChild().getRChild().getLChild().setRChild(new Node(21));
		// tree.getLChild().getRChild().getRChild().setLChild(new Node(22));
    // tree.getLChild().getRChild().getRChild().setRChild(new Node(23));
    //
		// tree.getRChild().getLChild().getLChild().setLChild(new Node(24));
		// tree.getRChild().getLChild().getLChild().setRChild(new Node(25));
		// tree.getRChild().getLChild().getRChild().setLChild(new Node(26));
		// tree.getRChild().getLChild().getRChild().setRChild(new Node(27));
    //
		// tree.getRChild().getRChild().getLChild().setLChild(new Node(28));
		// tree.getRChild().getRChild().getLChild().setRChild(new Node(29));
		// tree.getRChild().getRChild().getRChild().setLChild(new Node(30));
		// tree.getRChild().getRChild().getRChild().setRChild(new Node(31));


    BinaryToThreaded.convertTreeToThreaded(tree);
    levelOrder(tree);

  }

  private static void levelOrder(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    while(!q.isEmpty()) {
      Node target = q.remove();
      System.out.println(target.getData()+" is Threaded"+target.isThreaded());
      if(target.getLChild() != null) {
        q.add(target.getLChild());
      }
      if(target.getRChild() != null && !target.isThreaded()) {
        q.add(target.getRChild());
      }
    }
  }


}
