public class Permutation {

   public static int count = 0;

   // 1 -> Permutation           -  O(?)

   // The Idea behind this is to ADD each Character in SUFFIX as FIRST CHARACTER AFTER the PREFIX. This is Continued Recursively to all the Remaining Characters till There is
   // No Charcter Left to be added as the First Chatcter to the PREFIX(Here Prefix is Important Since we are Doing this Recursively).
   // e.g For String BELT
   // We make Each Chacter as a First Character.(i.e B ELT || E BLT || L BET || T BEL)
   // Lets Assume we have made "B" as First Chatcter of BELT(B ELT) and entered into Recursion With that as Prefix
   // The Remaining Characters ELT. In this, Each Charcter is Made the First Charcater after the Prefix("B")(i.e BE LT || BL ET || BT EL).
   // This Goes on.

   public static void permutation(String prefix, String suffix) {
      if(suffix.equals("")) {
         count++;
         System.out.println(prefix);
         return;
      }

      for(int i=0;i<suffix.length();i++) {
         permutation(prefix+suffix.charAt(i), suffix.substring(0, i)+suffix.substring(i+1, suffix.length()));
      }
   }


}
