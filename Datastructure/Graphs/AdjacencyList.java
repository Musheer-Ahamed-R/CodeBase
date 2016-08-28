public class AdjacencyList {

      public String[] verticesArr;
      public Node[] adjList;
      public int vertexCount;

      public AdjacencyList(int vertexCount, String[] verticesArr) {
         this.vertexCount = vertexCount;
         this.verticesArr = verticesArr;
         this.adjList = new Node[vertexCount];
         for(int i=0;i<vertexCount;i++) {
            adjList[i] = new Node(verticesArr[i]);
         }
      }

      public void addEdge(String a, String b) {
         int fstIndex = getIndex(a);
         int secIndex = getIndex(b);

         if(fstIndex >= 0 && fstIndex < vertexCount && secIndex >= 0 && secIndex < vertexCount) {
            Node fstNode = adjList[fstIndex];
            addBegining(fstNode, b);
            Node secNode = adjList[secIndex];
            addBegining(secNode, a);
         }
      }

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

      public int getIndex(String vertex) {
         for(int i=0;i<verticesArr.length;i++) {
            if(verticesArr[i].equals(vertex)) {
               return i;
            }
         }
         return -1;
      }




}
