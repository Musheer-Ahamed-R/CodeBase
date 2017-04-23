public class Application {

   public static void main(String[] args) {

         Node head = new Node(1, null);
         head.setNext(new Node(2, null));
         head.getNext().setNext(new Node(3, null));
         head.getNext().getNext().setNext(new Node(4, null));
         //head.getNext().getNext().getNext().setNext(new Node(5, null));
         //head.getNext().getNext().getNext().getNext().setNext(new Node(6, null));
         //head.getNext().getNext().getNext().getNext().getNext().setNext(new Node(7, null));


         Node head2 = new Node(20, null);
         head2.setNext(new Node(3, null));
         head2.getNext().setNext(new Node(5, null));
         head2.getNext().getNext().setNext(new Node(1, null));
         head2.getNext().getNext().getNext().setNext(new Node(56, null));
         //head2.getNext().getNext().getNext().getNext().setNext(new Node(14, null));
         

         //print(head);
         /*while(head != null) {
            System.out.println(head.getData());
            head = head.getNext();
         }*/
         //SortLL.sortLL(head);
         //print(head);
         //SwapNodes.swapNodes(head, 12, 13);

         //Middle.middle(head);
      
         //GetFromLast.getFromLast(head, 7);

         //DeleteFromEnd.deleteFromEnd(head, 01);
         //Delete.delete(head, 7);

         //Reverse.reverse(head);
         //Reverse.reverseRecur(null, head);
         //Loop.loop(head);

         //MergeSorted.merge(head, head2);
         //Application.print(MergeSorted.mergeRecur(head, head2));

         //InsertInSorted.insertInSorted(head, 15);

         //Application.print(head);
         //DeleteWithParentRef.deleteWithParentRef(head);
         //Application.print(head);

         //Palindrome.palindrome(head);

         //System.out.println(Palindrome.palindromeRecur(head, head));

         //Duplicates.duplicates(head);
         
         // AddNumber.addNumberRecurMain(head);
         // OddEven.oddEven(head);
         //MergeAlternate.mergeAlternate(head, head2);

         //DeleteAtIndex.deleteAtIndex(head, 0);

         //ShiftNodes.shiftNodes(head, 7);

         //DeleteAlternate.deleteAlternte(head);
         //Application.print(DeleteAlternate.deleteAlternteRecur(head));

         //UnionAndIntersection.unionAndIntersection(head, head2);

         //PairwiseSwap.pairwiseSwap(head);

         Rearrange.rearrange(head);
      
   }
   
   public static void print(Node head) {

      while(head != null) {
         System.out.print(head.getData()+" ");
         head = head.getNext();
      }
      System.out.println();
   }


}
