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



  public static void iterPostOrder(Node root) {
    Map<Node, String> visitedMap = new HashMap<>();

    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while(!stack.empty()) {
      Node target = stack.peek();
      if(target.getLChild() != null && visitedMap.get(target.getLChild()) == null) {
        stack.push(target.getLChild());
      } else {
          //I this case the null check and visited check for the left child is already done in the if case above
          if(target.getRChild() == null || (visitedMap.get(target.getLChild()) != null && visitedMap.get(target.getRChild()) != null)) {
            System.out.println(target.getData());
            visitedMap.put(target, "Visited");
            stack.pop();
          } else if(target.getRChild() != null){
            stack.push(target.getRChild());
          }
      }
    }
  }

  

}
