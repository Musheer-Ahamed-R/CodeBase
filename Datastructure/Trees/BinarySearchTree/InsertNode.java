public class InsertNode {

   public static Node insertNode(Node root, int data) {
      /*if(root == null) {
         return new Node(data);
      }
      if(root.getData() <= data) {
         root.setRChild(insertNode(root.getRChild(), data));
      } else if(root.getData() > data) {
         root.setLChild(insertNode(root.getLChild(), data));
      }
      return root;*/





      if(root == null) {
         return null;
      }
      /*if(root.getData() > data) {
         return insertNode(root.getLChild(), data);
      } else if(root.getData() < data) {
         return insertNode(root.getRChild(), data);
      } else {
         return root;
      }*/
      if(root == null) {
         Node node = new Node(data); 
         return root;
      }

      if(root.getData() > data) {
         root.setLChild(insertNode(root.getLChild(), data));
      } else if(root.getData() <= data) {
         root.setRChild(insertNode(root.getRChild(), data));
      } 
      return root;
   }

}
