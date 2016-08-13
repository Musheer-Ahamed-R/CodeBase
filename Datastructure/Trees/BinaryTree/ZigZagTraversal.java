import java.util.*;

public class ZigZagTraversal {

  // This works and this should be preffered, also, the Two Stack approach is also easy to implement
  // Here the Stack is only used to PRINT the nodes in reverse order.
  // Here the original order(for next Traversal) along with the reversed order is necessary. Thus, the nodes are added to both Stack and queue.
  public static void zigZagTraversal(Node root) {
    Stack<Node> s = new Stack<>();
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int level = 0;
    while(!q.isEmpty()) {
      int count = q.size();
      while(count > 0) {
        if(level == 0) {
          Node target = q.remove();
          System.out.print(target.getData());
          if(target.getLChild() != null) {
            s.push(target.getLChild());
            q.add(target.getLChild());
          }
          if(target.getRChild() != null) {
            s.push(target.getRChild());
            q.add(target.getRChild());
          }
        } else {
          Node target = q.remove();
          System.out.print(s.pop().getData());
          if(target.getLChild() != null) {
            q.add(target.getLChild());
          }
          if(target.getRChild() != null) {
            q.add(target.getRChild());
          }
        }
        count--;
      }
      level = level ^ 1;
      System.out.println();
    }
  }

  public static void zigZagTraversal2(Node root) {
    if(root == null) {
      return;
    }
    Stack<Node> s1 = new Stack<>();
    Stack<Node> s2 = new Stack<>();
    s1.push(root);
    int level = 0;
    while(!s1.empty() || !s2.empty()) {
      if(level == 0) {
        int count = s1.size();
        while(count > 0) {
          Node target = s1.pop();
          System.out.print(target.getData()+"  ");
          if(target.getRChild() != null) {
            s2.push(target.getRChild());
          }
          if(target.getLChild() != null) {
            s2.push(target.getLChild());
          }
          count--;
        }
      } else {
        int count = s2.size();
        while(count > 0) {
          Node target = s2.pop();
          System.out.print(target.getData()+"  ");
          if(target.getLChild() != null) {
            s1.push(target.getLChild());
          }
          if(target.getRChild() != null) {
            s1.push(target.getRChild());
          }
          count--;
        }
      }
      level = level ^ 1;
      System.out.println();
    }

  }

}
