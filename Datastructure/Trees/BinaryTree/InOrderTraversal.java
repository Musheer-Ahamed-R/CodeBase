public class InOrderTraversal {

    public static void recurInOrder(Node root) {
      if(root == null) {
        return;
      }
      recurInOrder(root.getLChild());
      System.out.println(root.getData());
      recurInOrder(root.getRChild());
    }

    public static void main(String[] args) {
        
    }



}
