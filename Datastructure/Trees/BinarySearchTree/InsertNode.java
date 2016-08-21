public class InsertNode {

   public static Node insertNode(Node root, int data) {
      if(root == null) {
         return new Node(data);
      }
      if(root.getData() <= data) {
         root.setRChild(insertNode(root.getRChild(), data));
      } else if(root.getData() > data) {
         root.setLChild(insertNode(root.getLChild(), data));
      }
      return root;
   }

}
