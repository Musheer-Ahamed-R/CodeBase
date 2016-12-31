public class Median {


   // 1 -> Using Binary Search                           -  O(logn)
   // 2 -> Using Recursion(Same Logic as Binary Search)  -  O(logn)

   //    -> If the Number of Elements is 2, then the Median will be Average of - Max(a1, b1) and Min(a2, b2)
   //    -> If Number of Elements > 2
   //    -> If the Median of First and Second Array is Same, then return the Medain(i.e Avg - Medain1 and Medain2 will be either Median1 or Median2, Since Same)
   //    -> If the Median1 < Median 2, then Consider the Elements after Median1 and Before Median2
   //    -> If the Median1 > Median 2, then Consider the Elements Upto Median1 and after Median2
   // Notes :
   //    -> In case of Even Elements, Consider both the Numbers Forming the Median
   //    -> ALWAYS AT ANY POINT, the NUMBER OF ELEMENTS IN BOTH ARRAY Should be Same.
   //    -> If the Number of Elements is Even Numbered, Then it can become Odd Numbered through the Iterations and wise versa.



   public static void median(int[] a, int[] b) {


      int aStart = 0;
      int bStart = 0;
      int aEnd = a.length-1;
      int bEnd = a.length-1;
      while(aStart < aEnd && bStart < bEnd) {
         int median1 = 0;
         int median2 = 0;
         int median1Index = 0;
         int median2Index = 0;

         System.out.println("---------------------"+aStart+" "+aEnd+" "+bStart+" "+bEnd);
         if(aEnd - aStart == 1 && bEnd - bStart == 1) {
            System.out.println("-----"+Integer.max(a[aStart], b[bStart])+"  "+ Integer.min(a[aEnd], b[bEnd]));
            break;
         }
         if((aEnd - aStart)%2 == 0) {
            median1Index = aStart + ((aEnd-aStart)/2);
            median1 = a[median1Index];
            median2Index = bStart + ((bEnd-bStart)/2);
            median2 = b[median2Index];
         } else {
            median1Index = aStart + ((aEnd-aStart)/2);
            median1 = ((a[median1Index] + a[median1Index + 1]) / 2);
            median2Index = bStart + ((bEnd-bStart)/2);
            median2 = ((b[median2Index] + b[median2Index + 1]) / 2);
         }

         if(median1 == median2) {
            System.out.println(median1);
            break;
         } else if(median1 < median2) {
            if((aEnd - aStart) %2 == 0) { // Odd Number of Elements
               bEnd = median2Index;
               aStart = median1Index;
            } else {
               aStart = median1Index;
               bEnd = median2Index + 1;
            }
         } else {
            if((aEnd - aStart) %2 == 0) { // Odd Number of Elements
               aEnd = median1Index;
               bStart = median2Index;
            } else {
               aEnd = median1Index + 1;
               bStart = median2Index;
            }
         }
      }




   }


}
