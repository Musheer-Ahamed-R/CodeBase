public class MorrisTraversal {

  //This is done by making the Tree as Threaded and then making it as normal
  /*
    Algo -
      while curr != null
        if curr.left == null
          visit -> curr
          curr = curr.right
        else
          pred = inOrderPredecessor(curr)
          if pred.right == null           // Which it must be, unless we have changed it as in this case.
            pred.right = curr
            curr = curr.left
          else                            // This is a wierd part(because there is no node between a node and its predecessor) and it is actually pointing to the current node as changed previously in before case
            pred = null
            visit -> curr
            curr = curr.right

    Time Complexity - O(n). Yes O(n) only
    Space Complexity - O(1)

    Important - This Algo is exactly the same for both InOrder and PreOrder Traversals, except for the place where we print the values
  */
  public static void morrisInorder(Node root) {
    Node current = root;
    while(current != null) {
      if(current.getLChild() == null) {
        System.out.println(current.getData());
        current = current.getRChild();
      } else {
        Node pred = findInOrderPred(current);
        if(pred.getRChild() == null) {
          pred.setRChild(current);
          current = current.getLChild();
        } else {
          pred.setRChild(null);
          System.out.println(current);
          current = current.getRChild();
        }
      }
    }
  }

  public static void morrisPreOrder(Node root) {
    if(root == null) {
      return;
    }
    Node current = root;
    while(current != null) {
      if(current.getLChild() == null) {
        System.out.println(current);
        current = current.getRChild();
      } else{
        Node inPred = findInOrderPred(current);
        if(inPred.getRChild() == null) {
          System.out.println(current);
          inPred.setRChild(current);
          current = current.getLChild();
        } else {
          inPred.setRChild(null);
          current = current.getRChild();
        }
      }
    }
  }

  public static Node findInOrderPred(Node current) {
    Node pred = current.getLChild();          // The right most Node of the Left Subtree is the InOrder Predecessor of the Current Node
    while(pred.getRChild() != null && pred.getRChild() != current) {
      pred = pred.getRChild();
    }
    return pred;
  }

  /*private static Node findInOrderSucc(Node current) {
    Node succ = current.getLChild();
    if(curr.getRChild() != null succ.getRChild() != current) {
      succ
    }
  }*/

}
