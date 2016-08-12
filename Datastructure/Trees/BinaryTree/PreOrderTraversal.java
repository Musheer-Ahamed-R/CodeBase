import java.util.*;

public class PreOrderTraversal {

    public static final List<Integer> list1 = new ArrayList<>();
    public static final List<Integer> list2 = new ArrayList<>();
    public static final List<Integer> list3 = new ArrayList<>();

    public static void recurPreOrder(Node root) {
      if(root == null) {
        return;
      }
      System.out.println("Node "+root.getData());
      recurPreOrder(root.getLChild());
      recurPreOrder(root.getRChild());
    }

    //This can be bettered by using a Single Stack instead of a Queue and a Stack
    public static void iterPreOrder(Node root) {
      Queue<Node> q = new ArrayDeque<>();
      Stack<Node> s = new Stack<>();
        q.add(root);
          while(!q.isEmpty()) {
            Node target = q.poll();
            System.out.println(target.getData());
            if(target.getLChild() != null) {
              q.add(target.getLChild());
            }
            if(target.getRChild() != null) {
              s.add(target.getRChild());
            }
            if(q.isEmpty() && !s.isEmpty()) {
              q.add(s.pop());
            }
        }
    }

    public static void iterPreOrder2(Node root) {

      Stack<Node> stack = new Stack<>();
      stack.push(root);
      while(!stack.empty()) {
        Node target = stack.pop();
        System.out.println("Node is "+target.getData());
        if(target.getRChild() != null) {
          stack.push(target.getRChild());
        }
        if(target.getLChild() != null) {
          stack.push(target.getLChild());
        }
      }
    }


}
