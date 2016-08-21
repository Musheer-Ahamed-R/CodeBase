public class FindMinimum {

   public static Node findMin(Node root) {
      if(root == null) {
         return null;
      } else if(root.getLChild() == null) {
         System.out.println("The minmum Node is "+root.getData());
         return root;
      }
      return findMin(root.getLChild());
   }


}
