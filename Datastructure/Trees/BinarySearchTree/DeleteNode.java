public class DeleteNode {

   public static Node deleteNode(Node root, int data) {
      if(root == null) {
         return null;
      }
      if(root.getData() > data) {
         root.setLChild(deleteNode(root.getLChild(), data));
      } else if(root.getData() < data) {
         root.setRChild(deleteNode(root.getRChild(), data));
      } else {
         if(root.getLChild() == null && root.getRChild() == null) {
            return null;
         } else if(root.getRChild() == null || root.getLChild() == null) {
            return root.getRChild() != null ? root.getRChild() : root.getLChild();
         } else {
            Node minNode = FindMinimum.findMinIter(root.getRChild());
            deleteNode(root, minNode.getData());
            minNode.setLChild(root.getLChild());
            minNode.setRChild(root.getRChild());
            return minNode;
         }
      }
      return root;
   }



}
