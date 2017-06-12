public class NodeChar {

   private char data;
   private NodeChar next;

   public NodeChar(char data, NodeChar next) {
      this.data = data;
      this.next = next;
   }

   public void setData(char data) {
      this.data = data;
   }
   public char getData() {
      return this.data;
   }
   public void setNext(NodeChar next) {
      this.next = next;
   }
   public NodeChar getNext() {
      return this.next;
   }

   public String toString() {
      return this.getData()+"  ";
   }

}