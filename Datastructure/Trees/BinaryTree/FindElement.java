import java.util.*;

public class FindElement {

  public static boolean isPresentrecur(Node root, int value) {
    if(root == null) {
      return false;
    }
    boolean isPresentInLeft = isPresentrecur(root.getLChild(), value);
    boolean isPresentInRight = isPresentrecur(root.getRChild(), value);
    return root.getData() == value || isPresentInLeft || isPresentInRight;
  }

  public static boolean isPresentIter(Node root, int value) {
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    boolean isFound = false;
    while(!q.isEmpty() && !isFound) {
      Node target = q.remove();
      if(target.getData() == value) {
        isFound = true;
      } else {
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
      }
    }
    return isFound;
  }


}
