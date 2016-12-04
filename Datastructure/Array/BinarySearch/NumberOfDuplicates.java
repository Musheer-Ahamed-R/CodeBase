public class NumberOfDuplicates {

   // Find the Number of Duplicates in a Sorted Array

   public static void findOccurenceCount(int[] a, int elem) {
      int start = findElem(a, elem, "Begin");
      int end = findElem(a, elem, "End");
      System.out.println("From "+start+" to "+end+" Count = "+(end-start+1)); // Since Index is Zero Based
   }


   public static int findElem(int[] a, int elem, String position) {

      int start = 0;
      int end = a.length-1;
      int index = -1;
      while(start < end) {
         int mid = (start + end)/2;
         if(a[mid] == elem) {
            index = mid;
            if("Begin".equals(position)) {
               end = mid;
            } else if("End".equals(position)){
               start = mid + 1;
            }
         } else if(a[mid] > elem) {
            end = mid;
         } else {
            start = mid + 1;
         }
      }
      if(a[start] == elem) {
         System.out.println("Element Found at "+start);
         return start;
      } else {
         System.out.println("Element Found at "+index);     // Here we are Considering Index because we are Moving away from the Element Once
                                                            // we FOUND It.(i.e to find the Begining or the End).
         return index;
      }
   }


}
