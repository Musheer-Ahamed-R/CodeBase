public class CountPairs {

   // 1 -> Using Two Loops  -  O(n^2)
   // 2 -> Using HashTable or HashMap  -  O(n)
   //       -> Here the Problem occurs if the Number to add is the Number itself. Handle this properly.
   public static void pairsCount(int[] a, int sum) {
      int[] countArr = new int[10000];
      for(int i=0;i<a.length;i++) {
         countArr[a[i]]++;
      }
      int count = 0;
      for(int i=0;i<a.length;i++) {
         int temp = sum - a[i];
         count += countArr[temp];
         if(temp == a[i]) {
            count--;
         }
      }
      System.out.println("The Number of Pairs is "+count/2);
   }


}
