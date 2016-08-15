import java.util.*;

public class GenericTreeNode {

  private int data;
  private List<GenericTreeNode> children = new ArrayList<>();

  public GenericTreeNode(int data) {
    this(data, null);
  }

  public GenericTreeNode(int data, List<GenericTreeNode> children) {
    this.data = data;
    this.children = children != null ? children : this.children;
  }

  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public List<GenericTreeNode> getChildren() {
    return this.children;
  }

  public void setChildren(List<GenericTreeNode> children) {
    this.children = children;
  }

  /*
    The Generic N-Ary Tree could be implemented in another way, where each Node has a Data and two nodes, where one is firstChild and the other is the Sibilings.
    Here the sibilings of the firstChild node along with the firstChild form the childen of a node. But, this seems to be confusing.
    Many more methods could be added/implemented, but it seems unnecessary at the moment.

  */

  public String toString() {
    return this.getData()+"";
  }

}
