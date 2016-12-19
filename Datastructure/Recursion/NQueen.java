import java.util.*;

public class NQueen{

   //

   // 1 -> Recursion       -  O(n!)   (n! because of Backtracking in Recursion)

   // The Column of the Current Cell Should Not be Equal to any of its Ancestors.
   // The Sum of Row and Col Index of the Current Cell Should Not be Equal to the Sum of Row and Col Index of any of its Ancestors
   // The Diff of Row and Col Index of the Current Cell Should Not be Equal to the Diff of Row and Col Index of any of its Ancestors
   // Pass Only the Psoitions to the Next Cell(i.e Don't Pass All the Invalid Cells)
   public static boolean nQueen(int noOfQueen, int row, int col, Set<Cell> inValidCells) {

      if(row == noOfQueen-1) {
         System.out.println("Success");
         return true;
      }
      Outer:
      for(int column=0;column<noOfQueen;column++) {
         Cell curretnCell = new Cell(row+1, column);


         for(Cell cell : inValidCells) {
            if(cell.colIndex == curretnCell.colIndex || (cell.rowIndex + cell.colIndex) == (curretnCell.rowIndex + curretnCell.colIndex)
                              || (cell.rowIndex - cell.colIndex) == (curretnCell.rowIndex - curretnCell.colIndex)) {
               continue Outer;
            }
         }
         inValidCells.add(curretnCell);
         boolean isAvailable = nQueen(noOfQueen, row+1, column, inValidCells);
         inValidCells.remove(curretnCell);
         if(isAvailable) {          // isAvailable is True ONLY if we have Reached the Desired Path. If Not Available, then Proceed with the Next Place in the Current Row
            System.out.println(curretnCell+" is Involved in the Correct Path");
            return isAvailable;
         }
      }

      return false;                  // If All the Columns Didn't return true, Then Queen Cannot be Accomadated in the Current Position
   }





}
