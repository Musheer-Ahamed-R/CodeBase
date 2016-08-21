public class SearchNode {

   public static boolean searchNode(Node root, int data) {
      if(root == null) {
         return false;
      }
      boolean isFound = false;
      if(root.getData() > data) {
         isFound = searchNode(root.getLChild(), data);
      } else if(root.getData() < data) {
         isFound = searchNode(root.getRChild(), data);
      } else {
         isFound = true;
         System.out.println("The Node is Found at "+root.getData());
      }
      return isFound;
   }

}
