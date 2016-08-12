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
  
}