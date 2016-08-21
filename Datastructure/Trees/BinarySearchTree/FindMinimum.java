public class FindMinimum {

   public static Node findMinRecur(Node root) {
      if(root == null) {
         return null;
      } else if(root.getLChild() == null) {
         System.out.println("The minmum Node is "+root.getData());
         return root;
      }
      return findMinRecur(root.getLChild());
   }

   public static Node findMinIter(Node root) {
      if(root == null) {
         return null;
      }
      while(root.getLChild() != null) {
         root = root.getLChild();
      }
      System.out.println(root.getData());
      return root;
   }


}
