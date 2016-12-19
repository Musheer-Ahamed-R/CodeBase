public class Cell {

   public int rowIndex;
   public int colIndex;

   public Cell(int rowIndex, int colIndex) {
      this.rowIndex = rowIndex;
      this.colIndex = colIndex;
   }

   @Override
	public boolean equals(Object cell) {
      Cell ce = (Cell)cell;
		if(this.rowIndex == ce.rowIndex && this.colIndex == ce.colIndex)
         return true;
		else
         return false;
	}

   @Override
	public int hashCode() {
		return (this.rowIndex + this.colIndex)%32;
	}

   @Override
   public String toString() {
      return this.rowIndex+", "+this.colIndex;
   }

}
