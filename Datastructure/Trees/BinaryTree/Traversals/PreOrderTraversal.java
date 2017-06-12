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

    // Iterative approach can be solved using
    // 1 -> Morris PreOrder Traversal
    // 2 -> Single Stack - Adding the right Child then adding the left Child

    // Iterative Preorder Traversal
    public static void iterPreOrder2(Node root) {
      if(root == null) {
        return;
      }
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
