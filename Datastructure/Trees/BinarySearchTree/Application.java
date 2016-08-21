import java.util.*;

public class Application {

   public static void main(String[] args) {

      Node tree = new Node(80);

      tree.setLChild(new Node(40));
      tree.setRChild(new Node(120));

      tree.getLChild().setLChild(new Node(20));
      tree.getLChild().setRChild(new Node(60));
      tree.getRChild().setLChild(new Node(100));
      tree.getRChild().setRChild(new Node(140));

      tree.getLChild().getLChild().setLChild(new Node(10));
      tree.getLChild().getLChild().setRChild(new Node(30));
      tree.getLChild().getRChild().setLChild(new Node(50));
      tree.getLChild().getRChild().setRChild(new Node(70));

      tree.getRChild().getLChild().setLChild(new Node(90));
      tree.getRChild().getLChild().setRChild(new Node(110));
      tree.getRChild().getRChild().setLChild(new Node(130));
      tree.getRChild().getRChild().setRChild(new Node(150));


      // tree.getLChild().getLChild().getLChild().setLChild();
      // tree.getLChild().getLChild().getLChild().setRChild();
      // tree.getLChild().getLChild().getRChild().setLChild();
      // tree.getLChild().getLChild().getRChild().setRChild();
      // tree.getLChild().getRChild().getLChild().setLChild();
      // tree.getLChild().getRChild().getLChild().setRChild();
      // tree.getLChild().getRChild().getRChild().setLChild();
      // tree.getLChild().getRChild().getRChild().setRChild();
      //
      // tree.getRChild().getLChild().getLChild().setLChild();
      // tree.getRChild().getLChild().getLChild().setRChild();
      // tree.getRChild().getLChild().getRChild().setLChild();
      // tree.getRChild().getLChild().getRChild().setRChild();
      // tree.getRChild().getRChild().getLChild().setLChild();
      // tree.getRChild().getRChild().getLChild().setRChild();
      // tree.getRChild().getRChild().getRChild().setLChild();
      // tree.getRChild().getRChild().getRChild().setRChild();




      //boolean isFound = SearchNode.searchNode(tree, 150);

      //InsertNode.insertNode(tree, 200);
      //traverse(tree);

      //Node minNode = FindMinimum.findMin(tree);

      //Node maxNode = FindMaximum.findMax(tree);


      //System.out.println(minNode);

   }

   public static void traverse(Node root) {
      if(root == null) {
         return;
      }
      Queue<Node> q = new ArrayDeque<>();
      q.add(root);
      while(!q.isEmpty()) {
         int count = q.size();
         while(count > 0) {
            Node target = q.remove();
            System.out.println("\t"+target.getData() +" L -> "+target.getLChild()+" R -> "+target.getRChild());
            if(target.getLChild() != null) {
               q.add(target.getLChild());
            }
            if(target.getRChild() != null) {
               q.add(target.getRChild());
            }
            count--;
         }
         System.out.println("-----------------------");
      }
   }


}
