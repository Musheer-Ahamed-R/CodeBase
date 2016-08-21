import java.util.*;

public class PrintBinaryTree {

   public static void printTree(Node root) {
      int treeWidth = 4;
      int spacing = (treeWidth & 1) == 1 ? (treeWidth / 2) + 1 : treeWidth/2;

      String fourSpace = "    ";
      Queue<Node> q = new ArrayDeque<>();
      q.add(root);


      while(!q.isEmpty()) {
         for(int i=0;i<spacing;i++) {
            System.out.print(fourSpace);
         }
         int count = q.size();
         int alternate = 0;
         while(count > 0) {
            Node target = q.remove();
            if(alternate == 1) {
               System.out.print(fourSpace+fourSpace);
            }
            alternate ^= 1;
            System.out.print(target.getData());
            if(target.getLChild() != null) {
               q.add(target.getLChild());
            }
            if(target.getRChild() != null) {
               q.add(target.getRChild());
            }
            count--;
         }
         spacing--;
         System.out.println();
      }

   }


}
