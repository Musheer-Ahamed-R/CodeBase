import java.util.*;

public class Application {

   public static void main(String[] args) {
      AVLNode root = null;
      root = Insertion.insert(root, -10);
      root = Insertion.insert(root, 2);
      root = Insertion.insert(root, 13);
      root = Insertion.insert(root, -13);
      root = Insertion.insert(root, -15);
      root = Insertion.insert(root, 15);
      root = Insertion.insert(root, 17);
      root = Insertion.insert(root, 20);

      inOrderTraversal(root);
   }

   public static void inOrderTraversal(AVLNode root) {
      if(root == null) {
         return;
      }
      inOrderTraversal(root.getLChild());
      System.out.println(root.getData());
      inOrderTraversal(root.getRChild());
   }

   public static void levelTraversal(AVLNode root) {
      if(root == null) {
         return;
      }
      Queue<AVLNode> q = new ArrayDeque<>();
      q.add(root);
      while(!q.isEmpty()) {
         int size = q.size();
         while(size > 0) {
            AVLNode target = q.remove();
            System.out.print("\t"+target.getData());
            if(target.getLChild() != null) {
               q.add(target.getLChild());
            }
            if(target.getRChild() != null) {
               q.add(target.getRChild());
            }
            size--;
         }
         System.out.println();
      }
   }

}
