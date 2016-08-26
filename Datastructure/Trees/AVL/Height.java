public class Height {

   public static int height(AVLNode root) {
      if(root == null) {
         return -1;
      } else {
         return root.getHeight();
      }
   }



}
