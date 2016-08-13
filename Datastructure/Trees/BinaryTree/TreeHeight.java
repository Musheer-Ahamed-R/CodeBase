import java.util.*;

public class TreeHeight {

  public static int heightRecur(Node root) {
    if(root == null) {
      return -1;
    }
    int lHeight = heightRecur(root.getLChild());
    int rheight = heightRecur(root.getRChild());
    return Integer.max(lHeight, rheight) + 1;
  }

  public static int heightIter(Node root) {
    if(root == null) {
      return -1;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int height = -1;
    while(!q.isEmpty()) {
      int count = q.size();
      while(count > 0) {
        Node target = q.remove();
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
        count--;
      }
      height++;
    }
    return height;
  }


}
