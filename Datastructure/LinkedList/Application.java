public class Application {

   public static void main(String[] args) {
         Node head = new Node(0, null);
         head.setNext(new Node(1, null));
         head.getNext().setNext(new Node(0, null));
         head.getNext().getNext().setNext(new Node(0, null));
         head.getNext().getNext().getNext().setNext(new Node(2, null));
         System.out.println(head);
         /*while(head != null) {
            System.out.println(head.getData());
            head = head.getNext();
         }*/
         SortLL.sortLL(head);
   }


}
