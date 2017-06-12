import java.util.Arrays;

public class SortLL {

   // Sort a linked list of 0s, 1s and 2s


   

   public static void sortLL(Node head) {
       
      int zeroCount = 0;
      int oneCount = 0;
      int twoCount = 0;
      Node curr = head;
      while(curr != null) {
         switch(curr.getData()) {
            case 0 : 
               zeroCount++; break;
            case 1 : 
               oneCount++; break;
            case 2 : 
               twoCount++; break;  
         }
         curr = curr.getNext();
      }

      /*Node newList = null;
      Node newListHead = null;
      for(int i=0;i<zeroCount;i++) {
         Node node = new Node(0, null);
         if(newList == null) {
            newList = node;
            newListHead = node;
         } else {
            newList.setNext(node);
            newList = newList.getNext();
         }
      }
      for(int i=0;i<oneCount;i++) {
         Node node = new Node(1, null);
         if(newList == null) {
            newList = node;
            newListHead = node;
         } else {
            newList.setNext(node);
            newList = newList.getNext();
         }
      }
      for(int i=0;i<twoCount;i++) {
         Node node = new Node(2, null);
         if(newList == null) {
            newList = node;
            newListHead = node;
         } else {
            newList.setNext(node);
            newList = newList.getNext();
         }
      }*/
      
      Node newListHead = new Node(-1, null);
      Node newList = formLink(newListHead, 0, zeroCount);
      newList = formLink(newList, 1, oneCount);
      newList = formLink(newList, 2, twoCount);
      newListHead = newListHead.getNext();
      Application.print(newListHead);
   }

   public static Node formLink(Node head, int data, int count) {

      Node curr = head;
      for(int i=0;i<count;i++) {
         Node node = new Node(data, null);
         if(curr == null) {
            curr = node;
            head = curr;
         } else {
            curr.setNext(node);
            curr = curr.getNext();
         }
      }
      return curr;
   }



}
