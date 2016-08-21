public class FindMaximum {

   public static Node findMaxRecur(Node root) {
      if(root == null) {
         return null;
      } else if(root.getRChild() == null) {
         System.out.println("The max Node is "+root.getData());
         return root;
      }
      return findMaxRecur(root.getRChild());
   }

   public static Node findMaxIter(Node root) {
      if(root == null) {
         return null;
      }
      while(root.getRChild() != null) {
         root = root.getRChild();
      }
      System.out.println(root.getData());
      return root;
   }

}
