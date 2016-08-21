public class InsertNode {

   public static void insertNode(Node root, int data) {
      if(root == null) {
         return new Node(data);
      }
      if(root.getData() <= data) {
         root.setLChild(insertNode(root.getLChild()));
      } else if(root.getData() > data) {
         root.getRChild(insertNode(root.getRChild()));
      }
      return root;
   }

}
