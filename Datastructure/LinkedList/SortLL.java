import java.util.Arrays;

public class SortLL {

   // Sort LinkedList with 0, 1 and 2's Node Values
   

   /*public static void sortLL(Node head) {
      Node[] nodeArray = new Node[3];

      while(head != null) {
         //System.out.println("----------------");
         int nodeData = head.getData();
         Node next = head.getNext();
         if(nodeArray[nodeData] == null) {
            nodeArray[nodeData] = head;
            head.setNext(null);
         } else {
	    Node tailNode = nodeArray[nodeData]; 	
            head.setNext(tailNode);
            nodeArray[nodeData] = head;
         }
         //System.out.println(Arrays.toString(nodeArray));
         //System.out.println("***********************"+head);
         head = next;
      }
	Node root = nodeArray[0];
	while(root != null) {

	        System.out.println(root);
		        root = root.getNext();
			}

      System.out.println(Arrays.toString(nodeArray));
      System.out.println("The root is"+root);
      nodeArray[0].setNext(nodeArray[1]);
      nodeArray[1].setNext(nodeArray[2]);
      while(root != null) {

	System.out.println(root);
	root = root.getNext();
      }
   }*/



}
