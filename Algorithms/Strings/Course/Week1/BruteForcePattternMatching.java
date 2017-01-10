public class BruteForcePattternMatching {

   // Given a String and a pattern, Find the Position at which the Pattern Occurs in the Text.

   // 1 -> Brute-Force Algorithm       -  O(N * M)
   //                                     N - Length of the Text and M - Length of the Pattern.

   // Notes :
   //    -> This Approach Fails if the Size of the Text if Some Billions and the Number of Patterns to Match on the
   //       Text is Some Billions(Each Pattern can have Size upto a Billion(OOPS - Thats Crazy)).
   //    -> In case of Muliple String Matching, the Time Complexity becomes to O(N * M), Where M is the Total of the Length of all Patterns.

   public static void main(String[] args) {

      String text = "panamabananas";
      String pattern = "nana";

      int noOfSubStringToSearch = text.length()-pattern.length()+1;
      Outer:
      for(int i=0;i<noOfSubStringToSearch;i++) {
         int subStringLimit = i+pattern.length()-1;
         for(int j=i;j<=subStringLimit;j++) {
            if(text.charAt(j) != pattern.charAt(j-i)) {
               continue Outer;
            }
         }
         System.out.println("The SubString Starts at index "+i);
      }

   }

}
