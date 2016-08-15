import java.util.*;

public class MaxLevel {

  public static void printMaxLevel(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    List<Node> maxLevel = new ArrayList<>();
    int maxSum = 0;
    while(!q.isEmpty()) {
      int count = q.size();
      int levelSum = 0;
      List<Node> levelNodes = new ArrayList<>();
      while(count >0) {
        Node target = q.remove();
        levelSum += target.getData();
        levelNodes.add(target);
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
        count--;
      }
      if(maxSum < levelSum) {
        maxSum = levelSum;
        maxLevel = levelNodes;
      }
    }
    System.out.println("The Max Sum is "+maxSum);
    for(Node element : maxLevel) {
      System.out.print(element.getData()+" , ");
    }
  }


}
