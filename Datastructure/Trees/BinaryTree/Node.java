public class Node {
  private int data;
  private Node rChild;
  private Node lChild;

  public Node(int data) {
    this(data, null, null);
  }

  public Node(int data, Node lChild, Node rChild) {
    this.data = data;
    this.lChild = lChild;
    this.rChild = rChild;
  }

  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getLChild() {
    return this.lChild;
  }

  public void setLChild(Node lChild) {
    this.lChild = lChild;
  }

  public Node getRChild() {
    return this.rChild;
  }

  public void setRChild(Node rChild) {
    this.rChild = rChild;
  }

  @Override
  public String toString() {
    return this.getData()+"";
  }

  public class VerticalDistance {
    /*private Node root;*/
    private int verticalDistance;

    /*public VerticalDistance(Node root) {
      this(root, Integer.MIN_VALUE);
    }

    public VerticalDistance(Node root, int verticalDistance) {
      this.root = root;
      this.verticalDistance = verticalDistance;
    }*/

    public VerticalDistance(int verticalDistance) {
      this.verticalDistance = verticalDistance;
    }

    /*public Node getRoot() {
      return this.root;
    }

    public void setRoot(Node root) {
      this.root = root;
    }*/

    public Node getNode() {
      return Node.this;
    }

    public int getVerticalDistance() {
      return this.verticalDistance;
    }

    public void setVerticalDistane(int verticalDistance) {
      this.verticalDistance = verticalDistance;
    }

  }

}
