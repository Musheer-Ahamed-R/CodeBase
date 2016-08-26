public class AVLNode {

   private int data;
   private AVLNode rChild;
   private AVLNode lChild;
   private int height;

   public AVLNode(int data) {
      this(data, -1);
   }

   public AVLNode(int data, int height) {
      this.data = data;
      this.height = height;
   }

   public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public AVLNode getLChild() {
    return this.lChild;
  }

  public void setLChild(AVLNode lChild) {
    this.lChild = lChild;
  }

  public AVLNode getRChild() {
    return this.rChild;
  }

  public void setRChild(AVLNode rChild) {
    this.rChild = rChild;
  }

   public int getHeight() {
      return this.height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   @Override
   public String toString() {
     return this.getData()+"";
   }

}
