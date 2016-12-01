public class LostElement {

   // 1 -> using two loop and a Boolean Array   -  O(n^2)
   // 2 -> using HashTable/HashMap  -  O(n)
   // 3 ->

   public static void lostElement1(int[] a, int[] b) {
      boolean[] isFound = new boolean[b.length];

      for(int i=0;i<a.length;i++) {
         boolean isMissing = false;
         for(int j=0;j<b.length;j++) {
            if(a[i] == b[j] && !isFound[j]) {
               isFound[j] = true;
               isMissing = true;
               break;
            }
         }
         if(!isMissing) {
            System.out.println("The Missing Element is "+a[i]);
         }
      }
   }



   public static void lostElement2(int[] a, int[] b) {
      int[] occurenceMap = new int[1000];

      for(int i=0;i<b.length;i++) {  // Considering a to be largest array
         occurenceMap[b[i]]++;
      }
      for(int i=0;i<a.length;i++) {
         if(occurenceMap[a[i]] > 0) {
            occurenceMap[a[i]]--;
         } else {
            System.out.println("The Missing Element is "+a[i]);
         }
      }
   }



}
