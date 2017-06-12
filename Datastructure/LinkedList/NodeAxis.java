public class NodeAxis {

   private int xData;
   private int yData;
   private NodeAxis next;

   public NodeAxis(int xData, int yData, NodeAxis next) {
      this.xData = xData;
      this.yData = yData;
      this.next = next;
   }

   public void setXData(int data) {
      this.xData = data;
   }
   public int getXData() {
      return this.xData;
   }
   public void setYData(int data) {
      this.yData = data;
   }
   public int getYData() {
      return this.yData;
   }
   public void setNext(NodeAxis next) {
      this.next = next;
   }
   public NodeAxis getNext() {
      return this.next;
   }

   public String toString() {
      return this.getXData()+"  "+this.getYData();
   }

}
