import java.util.*;

public class PostOrderTraversal {

  public static void recurPostOrder(Node root) {
    if(root == null) {
        return;
    }
    recurPostOrder(root.getLChild());
    recurPostOrder(root.getRChild());
    System.out.println(root.getData());
  }

  // Iterative approach can be solved using
  // 1 -> haing a Current node pointer, which is always one step ahead of the stack Top and it guides the flow
  // 2 -> Like Level Order Traversal using Stack, Excpet that we have to Print the Items in the Revese Oder(Opposite of Normal).
  // 3 -> using visited map.  (Not Ideal)


  public static void iterPostOrder(Node root) {
    Map<Node, String> visitedMap = new HashMap<>();

    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while(!stack.empty()) {
      Node target = stack.peek();
      if(target.getLChild() != null && visitedMap.get(target.getLChild()) == null) {
        stack.push(target.getLChild());
      } else {
          //In this case, the null check and visited check for the left child is already done in the if case above
          if(target.getRChild() == null || (visitedMap.get(target.getRChild()) != null)) {
            System.out.println(target.getData());
            visitedMap.put(target, "Visited");
            stack.pop();
          } else {
            stack.push(target.getRChild());
          }
      }
    }
  }

  // Warning : Here, there is no need to specifically use a Second Stack. We Could use a List and Print it in Reverse Order.
  public static void iterPostOrder2(Node root) {
    if(root == null) {
      return;
    }
    Stack<Node> s1 = new Stack<>();
    Stack<Node> s2 = new Stack<>();
    s1.push(root);
    while(!s1.empty()) {
      Node target = s1.pop();
      s2.push(target);
      if(target.getLChild() != null) {
        s1.push(target.getLChild());
      }
      if(target.getRChild() != null) {
        s1.push(target.getRChild());
      }
    }

    while(!s2.empty()) {
      System.out.println(s2.pop().getData());
    }

  }

  // Here the currentNode is always one step ahead of the stack Top and it guides the flow(Almost the same as in InOrder Traversal)
  // Here, in the first part of the second case, the Current Node Stays Null.
  public static void iterPostOrder3(Node root) {
    Node currentNode = root;
    Stack<Node> stack = new Stack<>();
    boolean isDone = false;
    Node prevNode = null;
    while(!isDone) {
      if(currentNode != null) {
        stack.push(currentNode);
        currentNode = currentNode.getLChild();
      } else{
          if(stack.empty()) {
            isDone = true;
          } else {
            Node target = stack.peek();
            // Its left child has to be null. Since that is how it is getting inserted
            // A Node(in PostOrder Traversal) will always have its right child before it
            if(target.getRChild() == null || target.getRChild() == prevNode) {
              System.out.println(target.getData());
              prevNode = stack.pop(); // currentNode stays null, since there is nothing to be added to the stack
            } else {
              currentNode = target.getRChild();
            }
          }
      }
    }
  }
}
