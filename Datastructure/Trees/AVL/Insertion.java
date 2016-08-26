public class Insertion {

   public static AVLNode insert(AVLNode root, int data) {
      if(root == null) {
         return new AVLNode(data);
      }
      if(root.getData() >= data) {
         root.setLChild(insert(root.getLChild(), data));
      } else {
         root.setRChild(insert(root.getRChild(), data));
      }
      /*
      1 -> We are not going to consider the height of the Current Node for Balance Checking. Thus, the height of the Current Node is
           set in the end(if balanced) or while balancing the Node.
      2 -> Go for Single Rotation(i.e Left Left or Right Rigth rotation), even if Double Rotation is also Available.
      */
      int balance = Height.height(root.getLChild()) - Height.height(root.getRChild());
      if(balance > 1) {
         if(Height.height(root.getLChild().getLChild()) >= Height.height(root.getLChild().getRChild())) {
            return rightRotation(root);
         } else {
            return leftRightRotation(root);
         }
      } else if(balance < -1) {
         if(Height.height(root.getRChild().getRChild()) >= Height.height(root.getRChild().getLChild())) {
            return leftRotation(root);
         } else {
            return rightLeftRotation(root);
         }
      }
      root.setHeight(Integer.max(Height.height(root.getLChild()), Height.height(root.getRChild())) + 1);
      return root;
   }

   public static AVLNode leftRotation(AVLNode root) {

      AVLNode newRoot = root.getRChild();
      root.setRChild(newRoot.getLChild());
      newRoot.setLChild(root);
      root.setHeight(Integer.max(Height.height(root.getLChild()), Height.height(root.getRChild())) + 1);
      newRoot.setHeight(Integer.max(Height.height(newRoot.getLChild()), Height.height(newRoot.getRChild())) + 1);
      return newRoot;
   }

   public static AVLNode rightRotation(AVLNode root) {

      AVLNode newRoot = root.getLChild();
      root.setLChild(newRoot.getRChild());
      newRoot.setRChild(root);
      root.setHeight(Integer.max(Height.height(root.getLChild()), Height.height(root.getRChild())) + 1);
      newRoot.setHeight(Integer.max(Height.height(newRoot.getLChild()), Height.height(newRoot.getRChild())) + 1);
      return newRoot;
   }

   public static AVLNode leftRightRotation(AVLNode root) {
      AVLNode lNode = root.getLChild();
      root.setLChild(leftRotation(lNode));
      return rightRotation(root);
   }

   public static AVLNode rightLeftRotation(AVLNode root) {
      AVLNode rNode = root.getRChild();
      root.setRChild(rightRotation(rNode));
      return leftRotation(root);
   }

}
