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
      s.push(target);              // This is enough, because the order we pull, is the order in which we push elements into the queue.
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
