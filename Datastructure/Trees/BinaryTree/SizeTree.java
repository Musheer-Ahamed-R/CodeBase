import java.util.*;

public class SizeTree {

  // Write a program to Calculate Size of a tree

  // 1 -> Recursive Way     - O(n)
  // 2 -> Iterative Way     - O(n) 

  public static int getSizeRecur(Node root) {
    if(root == null) {
      return 0;
    }
    int lSize = getSizeRecur(root.getLChild());
    int rSize = getSizeRecur(root.getRChild());
    return lSize + rSize + 1;
  }

  public static int getSizeIter(Node root) {
    if(root == null) {
      return 0;
    }
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    int count = 0;
    while(!q.isEmpty()) {
      Node target = q.remove();
      count++;
      if(target.getLChild() != null) {
        q.add(target.getLChild());
      }
      if(target.getRChild() != null) {
        q.add(target.getRChild());
      }
    }
    return count;
  }

}
