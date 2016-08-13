import java.util.*;

public class MaxElement {
  public static int recurGetMax(Node root) {
    if(root == null) {
      return 0;
    }
    int lMax = recurGetMax(root.getLChild());
    int rMax = recurGetMax(root.getRChild());
    return Integer.max(root.getData(), Integer.max(lMax, rMax));
  }

  public static int iterGetMax(Node root) {
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int max = Integer.MIN_VALUE;
    while(!q.isEmpty()) {
      Node target = q.remove();
      if(target.getData() > max) {
        max = target.getData();
      }
      if(target.getLChild() != null) {
        q.add(target.getLChild());
      }
      if(target.getRChild() != null) {
        q.add(target.getRChild());
      }
    }
    return max;
  }

}
