import java.util.*;

public class TreeSum {

  public static int getSumRecur(Node root) {
    if(root == null) {
      return 0;
    }
    return root.getData()+ getSumRecur(root.getLChild()) + getSumRecur(root.getRChild());
  }

  public static int getSumIter(Node root) {
    if(root == null) {
      return 0;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int sum = 0;
    while(!q.isEmpty()) {
      Node target = q.remove();
      sum += target.getData();
      if(target.getLChild() != null) {
        q.add(target.getLChild());
      }
      if(target.getRChild() != null) {
        q.add(target.getRChild());
      }
    }
    return sum;
  }

}
