import java.util.*;

public class ReverseLevelOrder {

  /*
    4567
    32
    1
  */

  public static void reverseLevelOrder(Node root) {
    Queue<Node> q = new ArrayDeque<>();
    Stack<Node> s = new Stack<>();
    q.add(root);
    while(!q.isEmpty()) {
      Node target = q.remove();
      s.push(target);              //
      if(target.getRChild() != null) {
        q.add(target.getRChild());
      }
      if(target.getLChild() != null) {
        q.add(target.getLChild());
      }
    }
    while(!s.empty()) {
      System.out.println(s.pop().getData());
    }
  }
}
