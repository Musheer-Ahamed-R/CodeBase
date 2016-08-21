public class SearchNode {

   public static void searchNode(Node root, int data) {
      if(root == null) {
         return;
      }
      if(root.getData() > data) {
         searchNode(root.getLChild());
      } else if(root.getData() < data) {
         searchNode(root.getRChild());
      } else {
         System.out.println("The Node is Found at "+root.getData());
      }
   }

}
