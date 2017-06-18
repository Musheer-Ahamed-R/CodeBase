import java.util.*;

public class Application {

   public static void main(String[] args) {

      /*Node tree = new Node(80);

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
      tree.getRChild().getRChild().setRChild(new Node(150));*/


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

      Node tree2 = new Node(6);

      tree2.setLChild(new Node(-13));
      tree2.setRChild(new Node(14));

      //tree.getLChild().setLChild(new Node(20));
      tree2.getLChild().setRChild(new Node(-8));
      tree2.getRChild().setLChild(new Node(13));
      tree2.getRChild().setRChild(new Node(15));

      //tree.getLChild().getLChild().setLChild(new Node(10));
      //tree.getLChild().getLChild().setRChild(new Node(30));
      //tree.getLChild().getRChild().setLChild(new Node(50));
      //tree.getLChild().getRChild().setRChild(new Node(70));

      tree2.getRChild().getLChild().setLChild(new Node(7));
      //tree.getRChild().getLChild().setRChild(new Node(110));
      //tree.getRChild().getRChild().setLChild(new Node(130));
      //tree.getRChild().getRChild().setRChild(new Node(150));

      int[] bstArr = {80, 40, 120, 20, 60, 100, 140, 10, 30, 50, 70, 90, 110, 130, 150};


      //boolean isFound = SearchNode.searchNode(tree, 150);
      //boolean isFound = SearchNode.searchNodeIter(tree, 150);

      //InsertNode.insertNode(tree, 200);
      //traverse(tree);

      //Node minNode = FindMinimum.findMin(tree);
      //FindMinimum.findMinIter(tree);

      //Node maxNode = FindMaximum.findMax(tree);
      //FindMaximum.findMaxIter(tree);
      //System.out.println(minNode);

      //DeleteNode.deleteNode(tree, 40);
      //traverse(tree);

      //int noOfNodes = CountBSTNodesInRange.countBSTNodesInRange(tree, 40, 150);
      //System.out.println(noOfNodes);
      
      //SortedOrderPrinting.sortedOrderPrinting(bstArr, 0);

      traverse(tree2);
      tree2 = RemoveKeysOutsideRange.removeKeysOutsideRange(tree2, -10, 13);
      traverse(tree2);
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
            //System.out.println("\t"+target.getData() +" L -> "+target.getLChild()+" R -> "+target.getRChild());
            System.out.print(target.getData()+" ");
            if(target.getLChild() != null) {
               q.add(target.getLChild());
            }
            if(target.getRChild() != null) {
               q.add(target.getRChild());
            }
            count--;
         }
         System.out.println();
      }
   }


}
