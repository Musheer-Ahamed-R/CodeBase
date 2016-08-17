import java.util.*;
public class InOrderTraversal {

    public static void recurInOrder(Node root) {
      if(root == null) {
        return;
      }
      recurInOrder(root.getLChild());
      System.out.println(root.getData());
      recurInOrder(root.getRChild());
    }

    // Iterative approach can be solved using
    // 1 -> Morris InOrder Traversal
    // 2 -> haing a Current node pointer, which is always one step ahead of the stack Top and it guides the flow
    // 3 -> using the visited map

    //The extra space complexity of Map can be eliminated using a Single Variable
    public static void iterInOrder(Node root) {
        //System.out.println("");
        Map<Node, String> visitorMap = new HashMap<>();

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
          Node target = stack.peek();
          if(target.getLChild() == null || visitorMap.get(target.getLChild()) != null) {
            stack.pop();
            visitorMap.put(target, "Visited");
            System.out.println("Node is "+target.getData());
            if(target.getRChild() != null) {
              stack.push(target.getRChild());
            }
          } else {
            stack.push(target.getLChild());
          }
        }
    }

    // Here the currentNode is always one step ahead of the stack Top and it guides the flow
    public static void iterInOrder2(Node root) {
      Node currentNode = root;
      Stack<Node> stack = new Stack<>();
      //stack.push(root);
      boolean isDone = false;
      while(!isDone) {
        if(currentNode != null) {
          stack.push(currentNode);
          currentNode = currentNode.getLChild();
        } else {
          if(stack.empty()) {
            isDone = true;
          } else {
            currentNode = stack.pop();
            System.out.println(currentNode.getData());
            currentNode = currentNode.getRChild();
          }
        }
      }
    }

}
