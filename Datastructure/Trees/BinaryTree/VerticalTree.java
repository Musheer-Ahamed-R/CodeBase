import java.util.*;

public class VerticalTree {

  public static void printVerticalOrderIter(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node.VerticalDistance> q = new ArrayDeque<>();
    Map<Integer, List<Node>> verticalLevelMap = new HashMap<>();
    q.add(root.new VerticalDistance(0));
    while(!q.isEmpty()) {
      Node.VerticalDistance target = q.remove();
      Node targetNode = target.getNode();
      int verticalDistance = target.getVerticalDistance();
      if(verticalLevelMap.get(verticalDistance) == null) {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(targetNode);
        verticalLevelMap.put(verticalDistance, nodeList);
      } else {
        List<Node> nodeList = verticalLevelMap.get(verticalDistance);
        nodeList.add(targetNode);
        verticalLevelMap.put(verticalDistance, nodeList);
      }
      if(targetNode.getLChild() != null) {
        q.add(targetNode.getLChild().new VerticalDistance(verticalDistance - 1));
      }
      if(targetNode.getRChild() != null) {
        q.add(targetNode.getRChild().new VerticalDistance(verticalDistance + 1));
      }
    }
    for(Map.Entry<Integer, List<Node>> element : verticalLevelMap.entrySet()) {
      System.out.println(element.getKey()+" --> "+element.getValue());
    }
  }

  public static void sumVerticalOrderIter(Node root) {
    if(root == null) {
      return;
    }
    Queue<Node.VerticalDistance> q = new ArrayDeque<>();
    Map<Integer, Integer> verticalLevelMap = new HashMap<>();
    q.add(root.new VerticalDistance(0));
    while(!q.isEmpty()) {
      Node.VerticalDistance target = q.remove();
      Node targetNode = target.getNode();
      int verticalDistance = target.getVerticalDistance();
      if(verticalLevelMap.get(verticalDistance) == null) {
        verticalLevelMap.put(verticalDistance, targetNode.getData());
      } else {
        int data = verticalLevelMap.get(verticalDistance);
        verticalLevelMap.put(verticalDistance, data + targetNode.getData());
      }
      if(targetNode.getLChild() != null) {
        q.add(targetNode.getLChild().new VerticalDistance(verticalDistance - 1));
      }
      if(targetNode.getRChild() != null) {
        q.add(targetNode.getRChild().new VerticalDistance(verticalDistance + 1));
      }
    }
    for(Map.Entry<Integer, Integer> element : verticalLevelMap.entrySet()) {
      System.out.println(element.getKey()+" --> "+element.getValue());
    }
  }

  public static void printVerticalOrderRecur(Node root, int verticalLevel, Map<Integer, List<Node>> verticalLevelMap) {
    if(root == null) {
      return;
    }
    if(verticalLevelMap.get(verticalLevel) == null) {
      List<Node> nodeList = new ArrayList<>();
      nodeList.add(root);
      verticalLevelMap.put(verticalLevel, nodeList);
    } else {
      verticalLevelMap.get(verticalLevel).add(root);
    }
    printVerticalOrderRecur(root.getLChild(), verticalLevel - 1, verticalLevelMap);
    printVerticalOrderRecur(root.getRChild(), verticalLevel + 1, verticalLevelMap);
  }

  public static void sumVerticalOrderRecur(Node root, int verticalLevel, Map<Integer, Integer> verticalLevelSumMap) {
    if(root == null) {
      return;
    }
    if(verticalLevelSumMap.get(verticalLevel) == null) {
      verticalLevelSumMap.put(verticalLevel, root.getData());
    } else {
      int sum = verticalLevelSumMap.get(verticalLevel) + root.getData();
      verticalLevelSumMap.put(verticalLevel, sum);
    }
    sumVerticalOrderRecur(root.getLChild(), verticalLevel - 1, verticalLevelSumMap);
    sumVerticalOrderRecur(root.getRChild(), verticalLevel + 1, verticalLevelSumMap);
  }

}
