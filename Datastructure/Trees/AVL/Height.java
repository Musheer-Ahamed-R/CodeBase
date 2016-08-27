public class Height {

   public static int height(AVLNode root) {
      if(root == null) {
         return -1;
      } else {
         // This is not necessary in case of Insertion, Since we modify the height of the Node from the bottom.
         int lHeight = height(root.getLChild());
         int rHeight = height(root.getRChild());
         return rHeight >= lHeight ? rHeight + 1 : lHeight + 1;
      }
   }



}
