public class Application {

   public static void main(String[] args) {

         Node head = new Node(1, null);
         head.setNext(new Node(2, null));
         head.getNext().setNext(new Node(3, null));
         head.getNext().getNext().setNext(new Node(4, null));
         head.getNext().getNext().getNext().setNext(new Node(5, null));
         head.getNext().getNext().getNext().getNext().setNext(new Node(6, null));
         head.getNext().getNext().getNext().getNext().getNext().setNext(new Node(7, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(8, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(9, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(10, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(11, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(12, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(13, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(14, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(15, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(16, null));
         head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(17, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(18, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(19, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(20, null));



         Node head2 = new Node(1, null);
         head2.setNext(new Node(2, null));
         head2.getNext().setNext(new Node(23, null));
         head2.getNext().getNext().setNext(new Node(11, null));
         head2.getNext().getNext().getNext().setNext(new Node(5, null));
         head2.getNext().getNext().getNext().getNext().setNext(new Node(23, null));
         head2.getNext().getNext().getNext().getNext().getNext().setNext(new Node(2, null));
         //head2.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(3, null));

         NodeChar headChar = new NodeChar('g', null);
         headChar.setNext(new NodeChar('e', null));
         headChar.getNext().setNext(new NodeChar('e', null));
         headChar.getNext().getNext().setNext(new NodeChar('k', null));
         headChar.getNext().getNext().getNext().setNext(new NodeChar('s', null));
         //headChar.getNext().getNext().getNext().getNext().setNext(new NodeChar('a', null));
         //head.getNext().getNext().getNext().getNext().getNext().setNext(new NodeChar('g', null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new NodeChar('g', null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(9, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(10, null));
         //head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(12, null));



         NodeChar headChar2 = new NodeChar('g', null);
         headChar2.setNext(new NodeChar('e', null));
         headChar2.getNext().setNext(new NodeChar('e', null));
         headChar2.getNext().getNext().setNext(new NodeChar('k', null));
         headChar2.getNext().getNext().getNext().setNext(new NodeChar('s', null));
         //headChar2.getNext().getNext().getNext().getNext().setNext(new NodeChar('b', null));
         //head2.getNext().getNext().getNext().getNext().getNext().setNext(new Node(2, null));
         //head2.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(3, null));
         
         NodeAxis headAxis = new NodeAxis(3, 1, null);
         headAxis.setNext(new NodeAxis(3, 3, null));
         headAxis.getNext().setNext(new NodeAxis(3, 5, null));
         headAxis.getNext().getNext().setNext(new NodeAxis(3, 7, null));
         headAxis.getNext().getNext().getNext().setNext(new NodeAxis(12, 7, null));
         //headAxis.getNext().getNext().getNext().getNext().setNext(new NodeAxis(20, 5, null));
         //headAxis.getNext().getNext().getNext().getNext().getNext().setNext(new NodeAxis(40, 5, null));
         //headAxis.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new NodeAxis('g', null));
         //headAxis.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new NodeAxis(9, null));
         //headAxis.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new NodeAxis(10, null));
         //headAxis.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new NodeAxis(12, null));


         //print(head);
         /*while(head != null) {
            System.out.println(head.getData());
            head = head.getNext();
         }*/
         //SortLL.sortLL(head2);
         //SortOnActualValue.sortOnActualValue1(head);
         //SortOnActualValue.sortOnActualValue2(head);
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
         //MergeReverse.mergeReverse(head, head2);

         //InsertInSorted.insertInSorted(head, 15);

         //Application.print(head);
         //DeleteWithParentRef.deleteWithParentRef(head);
         //Application.print(head);

         //Palindrome.palindrome(head);

         //System.out.println(Palindrome.palindromeRecur(head, head));

         //Duplicates.duplicates(head);
         
         //AddNumber.addNumberRecurMain(head, 1);
         //OddEven.oddEven(head);
         //OddEvenValue.oddEvenValue(head);
         //OddEvenValue.oddEvenValueTailPointer(head);
         //MergeAlternate.mergeAlternate(head, head2);

         //DeleteAtIndex.deleteAtIndex(head, 0);

         //ShiftNodes.shiftNodes(head, 7);

         //DeleteAlternate.deleteAlternte(head);
         //Application.print(DeleteAlternate.deleteAlternteRecur(head));

         //UnionAndIntersection.unionAndIntersection(head, head2);

         //PairwiseSwap.pairwiseSwap(head);

         //Rearrange.rearrange(head);

         //AddTwoNumberList.addTwoNumberList(head2, head);
         //Node summedList = AddTwoNumberList.addTwoNumberListNoModify(head, head2);
         
         //Application.print(head);
         //Application.print(head2);
         //AddTwoNumberList.addTwoNumberListNoModify(head, head2);
         //AddTwoNumberList.addTwoNumberListNoModifyRecurMain(head, head2);
         /*if(summedList.getData() == 0) {
            summedList = summedList.getNext();
         }*/
         //Application.print(summedList);
         //DeleteSomeAfterSome.deleteSomeAfterSome(head, 1, 1);

         //MoveLastToFirst.moveLastToFirst(head);
         //IntersectionSorted.intersectionSorted(head, head2);
         //Node dummy = new Node(-1, null);
         //IntersectionSorted.intersectionSortedRecur(head, head2, dummy);
         //Application.print(dummy.getNext());

         //Identical.identical(head, head2);

         //DeleteConstraint.deleteConstraint(head, 1);

         //AlternateSplit.alternateSplit(head2);

         //DeleteNodeWithGreater.deleteNodeWithGreater(head2);
         //Application.print(DeleteNodeWithGreater.deleteNodeWithGreaterRecur(head2));

         //System.out.println(StringCompare.stringCompare(headChar, headChar2));

         //DeleteLastOccur.deleteLastOccur(head2, 23);
         //ZigZagOrder.zigZagOrder(head);

         //SortAscDesc.sortAscDesc(head);

         //DeleteMiddlePoints.deleteMiddlePoints(headAxis);
         Application.print(head);
         AlternateReverse.alternateReverse(head, 2);
   }
   
   public static void print(Node head) {

      while(head != null) {
         System.out.print(head.getData()+" ");
         head = head.getNext();
      }
      System.out.println();
   }

   public static int getLength(Node head) {

      Node curr = head;
      int count = 0;
      while(curr != null) {
         curr = curr.getNext();
         count++;
      }
      return count;
   }

   public static void swap(Node node1, Node node2) {
      Node temp = node1;
      node1 = node2;
      node2 = temp;
   }


}
