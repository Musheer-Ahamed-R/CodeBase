public class Vertex {

      String vertexName;
      boolean isVisited;
      boolean isGrey;

      public Vertex(String vertexName) {
         this.vertexName = vertexName;
      }

      public Vertex(String vertexName, boolean isVisited) {
         this.vertexName = vertexName;
         this.isVisited = isVisited;
      }

      public String toString() {
         return this.vertexName;
      }
}
