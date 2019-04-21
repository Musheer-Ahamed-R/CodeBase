import java.util.LinkedList;

public class AdjacencyList {

      // It is very simple. i.e It is just having an array of linked list of Integers(nodes), 
      // where the index is the node itself(may be have a seperate map for storing the node index) 
      // and the elements in the linked list are its edges.

      // Method 2
      // Instead of using an array of Linked list, we can use a array/set of Set
      // In this way, checking if an edge exists becomes very easy.

      public String[] verticesArr;
      public LinkedList<Integer>[] adjList;
      public int vertexCount;

      public AdjacencyList(int vertexCount, String[] verticesArr) {
         this.vertexCount = vertexCount;
         this.verticesArr = verticesArr;
         this.adjList = new LinkedList<Integer>[vertexCount];
         for(int i=0;i<vertexCount;i++) {
            adjList[i] = new LinkedList(verticesArr[i]);
         }
      }

      public void addEdge(int source, int dest) {
         int fstIndex = getIndex(a);
         int secIndex = getIndex(b);

         if(fstIndex >= 0 && fstIndex < vertexCount && secIndex >= 0 && secIndex < vertexCount) {
            this.adjList[source].add(dest);
         }
      }

      // Below function no longer needed
      public void addBegining(Node node, String secVertex) {
         Node secNode = new Node(secVertex);
         Node currNext = node.getNext();
         node.setNext(secNode);
         secNode.setNext(currNext);
      }

      public void removeEdge(String fstVertex, String secVertex) {
         int fstIndex = getIndex(fstVertex);
         int secIndex = getIndex(secVertex);
         if(fstIndex >= 0 && fstIndex < vertexCount && secIndex >= 0 && secIndex < vertexCount) {
            deleteNode(fstIndex, secVertex);
            deleteNode(secIndex, fstVertex);
         }
      }

      public void deleteNode(int fstIndex, String secVertex) {

         Node list = adjList[fstIndex];
         Node prev = null;
         while(list != null && !list.getData().equals(secVertex)) {
            prev = list;
            list = list.getNext();
         }
         if(list == null) {
            System.out.println("Vertex Not found");
         } else if(prev != null){
            prev.setNext(list.getNext());
            list.setNext(null);
         }
      }

      // Use HashMap
      public int getIndex(String vertex) {
         for(int i=0;i<verticesArr.length;i++) {
            if(verticesArr[i].equals(vertex)) {
               return i;
            }
         }
         return -1;
      }




}
