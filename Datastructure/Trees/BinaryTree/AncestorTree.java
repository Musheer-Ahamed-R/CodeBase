public class AncestorTree {

  // Lowest Common Ancestor in a Binary Tree | Set 1

  //This is valid if the second node is not a Child of the first node.Since, we dont iterate after we found either of the nodes
  public static boolean printLCA(Node root, int data1, int data2) {
    if(root == null) {
      return false;
    }
    if(root.getData() == data1 || root.getData() == data2) {
      return true;
    }
    boolean isLeftPresent = printLCA(root.getLChild(), data1, data2);
    boolean isRightPresent = printLCA(root.getRChild(), data1, data2);
    if(isLeftPresent && isRightPresent) {
      System.out.println("The Lowest Common Ancestor is "+root.getData());
    }
    return isLeftPresent || isRightPresent;
  }

  public static int printLCA2(Node root, int data1, int data2) {
    if(root == null) {
      return 0;
    }
    int leftValue = printLCA2(root.getLChild(), data1, data2);
    int rightValue = printLCA2(root.getRChild(), data1, data2);
    
    if(leftValue + rightValue == 2) {
      System.out.println("The Lowest Common Ancestor is "+root.getData());
      return 0; // Since only the Lowest Common Ancestor is Required
    }
    if(root.getData() == data1 || root.getData() == data2) {
      return Integer.max(leftValue, rightValue) + 1;
    } else {
      return Integer.max(leftValue, rightValue);
    }
  }

}
