import java.util.*;

public class TreeView {

  public static void leftView(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int level = 0;
    while(!q.isEmpty()) {
      int count = q.size();
      int length = count;
      while(count > 0) {
        Node target = q.remove();
        if(length == count) {
          System.out.println(target.getData());
        }
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
        count--;
      }
      level++;
    }
  }

  public static void rightView(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int level = 0;
    while(!q.isEmpty()) {
      int count = q.size();
      //int length = count;
      while(count > 0) {
        Node target = q.remove();
        if(count == 1) {
          System.out.println(target.getData());
        }
        if(target.getLChild() != null) {
          q.add(target.getLChild());
        }
        if(target.getRChild() != null) {
          q.add(target.getRChild());
        }
        count--;
      }
      level++;
    }
  }

  public static void topView(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node.VerticalDistance> q = new ArrayDeque<>();
    q.add(root.new VerticalDistance(0));
    Map<Integer, Node> topViewMap = new HashMap<>();
    while(!q.isEmpty()) {
      Node.VerticalDistance target = q.remove();
      Node targetNode = target.getNode();
      System.out.println(targetNode.getData()+" -->  "+target.getVerticalDistance());
      int verticalDistance = target.getVerticalDistance();
      if(targetNode.getLChild() != null) {
        q.add(targetNode.getLChild().new VerticalDistance(verticalDistance - 1));
      }
      if(targetNode.getRChild() != null) {
        q.add(targetNode.getRChild().new VerticalDistance(verticalDistance + 1));
      }
      topViewMap.putIfAbsent(verticalDistance, targetNode);
    }
    for(Map.Entry<Integer, Node> element : topViewMap.entrySet()) {
      System.out.println("Vertical Distance "+element.getKey()+" --> "+element.getValue().getData());
    }
  }

  public static void bottomView(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node.VerticalDistance> q = new ArrayDeque<>();
    q.add(root.new VerticalDistance(0));
    Map<Integer, Node> topViewMap = new HashMap<>();
    while(!q.isEmpty()) {
      Node.VerticalDistance target = q.remove();
      Node targetNode = target.getNode();
      System.out.println(targetNode.getData()+" -->  "+target.getVerticalDistance());
      int verticalDistance = target.getVerticalDistance();
      if(targetNode.getLChild() != null) {
        q.add(targetNode.getLChild().new VerticalDistance(verticalDistance - 1));
      }
      if(targetNode.getRChild() != null) {
        q.add(targetNode.getRChild().new VerticalDistance(verticalDistance + 1));
      }
      topViewMap.put(verticalDistance, targetNode);
    }
    for(Map.Entry<Integer, Node> element : topViewMap.entrySet()) {
      System.out.println("Vertical Distance "+element.getKey()+" --> "+element.getValue().getData());
    }
  }

}
