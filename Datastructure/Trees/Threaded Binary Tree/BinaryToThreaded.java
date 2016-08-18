public class BinaryToThreaded {

  public static void convertTreeToThreaded(Node root) {

    Node current = root;
    while(current != null) {
      if(current.getLChild() == null) {
        current = current.getRChild();
      } else {
        Node inPred = getInPred(current);
        if(inPred.getRChild() == null) {
          inPred.setThreaded(true);
          inPred.setRChild(current);
          current = current.getLChild();
        } else {
          current = current.getRChild();
        }
      }
    }
  }

  private static Node getInPred(Node current) {
    Node pred = current.getLChild();
    while(pred.getRChild() != null && pred.getRChild() != current) {
      pred = pred.getRChild();
    }
    return pred;
  }



}
