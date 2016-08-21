public class SearchNode {

   public static boolean searchNodeRecur(Node root, int data) {
      if(root == null) {
         return false;
      }
      boolean isFound = false;
      if(root.getData() > data) {
         isFound = searchNodeRecur(root.getLChild(), data);
      } else if(root.getData() < data) {
         isFound = searchNodeRecur(root.getRChild(), data);
      } else {
         isFound = true;
         System.out.println("The Node is Found at "+root.getData());
      }
      return isFound;
   }

   public static boolean searchNodeIter(Node root, int data) {
      if(root == null) {
         return false;
      }
      boolean isFound = false;
      while(root != null) {
         if(root.getData() == data) {
            System.out.println("Hurreh!! The Node "+root.getData()+" is Found");
            root = null;
         } else if(root.getData() > data) {
            root = root.getLChild();
         } else {
            root = root.getRChild();
         }
      }
      return isFound;
   }

}
