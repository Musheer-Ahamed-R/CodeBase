public class DualNode {

   private int data;
   private DualNode nextR;
   private DualNode nextL;

   public DualNode(int data, DualNode nextR, DualNode nextL) {
      this.data = data;
      this.nextR = nextR;
      this.nextL = nextL;
   }

   public void setData(int data) {
      this.data = data;
   }
   public int getData() {
      return this.data;
   }
   public void setRNode(DualNode nextR) {
      this.nextR = nextR;
   }
   public DualNode getRNode() {
      return this.nextR;
   }
   public void setLNode(DualNode nextL) {
      this.nextL = nextL;
   }
   public DualNode getLNode() {
      return this.nextL;
   }

   public String toString() {
      return this.getData()+"  ";
   }


}