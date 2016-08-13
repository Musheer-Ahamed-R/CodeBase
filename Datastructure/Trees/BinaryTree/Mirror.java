public class Mirror {

  public static void convertToMirror(Node root) {
    if(root == null) {
      return;
    }

    convertToMirror(root.getLChild());
    convertToMirror(root.getRChild());

    Node left = root.getLChild();
    Node right = root.getRChild();
    root.setLChild(right);
    root.setRChild(left);
  }

  public static boolean isMirror(Node root1, Node root2) {
    if(root1 == null && root2 == null) {
      return true;
    } else if((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
      return false;
    }
    boolean isLeftMirror = isMirror(root1.getLChild(), root2.getRChild());
    boolean isRightMirror = isMirror(root1.getRChild(), root2.getLChild());

    return root1.getData() == root2.getData() && isLeftMirror && isRightMirror;
  }

}
