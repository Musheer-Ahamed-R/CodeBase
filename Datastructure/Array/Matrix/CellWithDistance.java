public class CellWithDistance {

   public int rowIndex;
   public int colIndex;
   public int dist;

   public CellWithDistance(int rowIndex, int colIndex, int dist) {
      this.rowIndex = rowIndex;
      this.colIndex = colIndex;
      this.dist = dist;
   }

   @Override
   public String toString() {
      return this.rowIndex+", "+this.colIndex+"  "+dist;
   }

}
