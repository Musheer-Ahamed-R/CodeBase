public class FindMaximum {

   public static Node findMax(Node root) {
      if(root == null) {
         return null;
      } else if(root.getRChild() == null) {
         System.out.println("The max Node is "+root.getData());
         return root;
      }
      return findMax(root.getRChild());
   }


}
