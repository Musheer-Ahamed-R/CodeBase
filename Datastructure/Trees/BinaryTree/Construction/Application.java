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
//
      tree.getLChild().getLChild().setLChild(new Node(8, null, null));
      tree.getLChild().getLChild().setRChild(new Node(9, null, null));
      tree.getLChild().getRChild().setLChild(new Node(10, null, null));
      tree.getLChild().getRChild().setRChild(new Node(11, null, null));
      tree.getRChild().getLChild().setLChild(new Node(12, null, null));
      tree.getRChild().getLChild().setRChild(new Node(13, null, null));
      tree.getRChild().getRChild().setLChild(new Node(14, null, null));
      tree.getRChild().getRChild().setRChild(new Node(15, null, null));
      
      //
     tree.getLChild().getLChild().getLChild().setLChild(new Node(16));
     tree.getLChild().getLChild().getLChild().setRChild(new Node(17));
     tree.getLChild().getLChild().getRChild().setLChild(new Node(18));
     tree.getLChild().getLChild().getRChild().setRChild(new Node(19));
    //
     tree.getLChild().getRChild().getLChild().setLChild(new Node(20));
     tree.getLChild().getRChild().getLChild().setRChild(new Node(21));
     tree.getLChild().getRChild().getRChild().setLChild(new Node(22));
     tree.getLChild().getRChild().getRChild().setRChild(new Node(23));
    //
     tree.getRChild().getLChild().getLChild().setLChild(new Node(24));
     tree.getRChild().getLChild().getLChild().setRChild(new Node(25));
     tree.getRChild().getLChild().getRChild().setLChild(new Node(26));
     tree.getRChild().getLChild().getRChild().setRChild(new Node(27));
    //
     tree.getRChild().getRChild().getLChild().setLChild(new Node(28));
     tree.getRChild().getRChild().getLChild().setRChild(new Node(29));
     tree.getRChild().getRChild().getRChild().setLChild(new Node(30));
     tree.getRChild().getRChild().getRChild().setRChild(new Node(31));

     int[] inOrder = new int[]{8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};
     int[] preOrder = new int[]{1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
     int[] postOrder = new int[]{8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1};

     int[] parentArr = {1, 5, 5, 2, 2, -1, 3};

     //Node constructTree = ConstructFromInOrderPreOrder.constructFromInOrderPreOrder(inOrder, preOrder, 0, inOrder.length-1);

     ConstructFromParentArr.constructFromParentArr(parentArr);
	}

  public static void levelOrder(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    while(!q.isEmpty()) {
      int count = q.size();
      while(count-- > 0) {
        Node target = q.remove();
        System.out.println(target.getData() +"  "+target.getNextRight());
        //System.out.println(target.getData() +"  ");
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
      }
      System.out.println();
    }
    
  }


}