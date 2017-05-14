import java.util.*;

public class LevelOrderTraversal {

  

  public static void levelOrder(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    while(!q.isEmpty()) {
      Node target = q.remove();
      System.out.println(target.getData());
      if(target.getLChild() != null) {
        q.add(target.getLChild());
      }
      if(target.getRChild() != null) {
        q.add(target.getRChild());
      }
    }
  }


}
