public class UnionAndIntersection {

   // 1 -> Given two sorted arrays, find their union and intersection.
   // 2 -> Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
   //          -> This is the same as the above Question. We Find Insertion of First Two Arrays. Store it in a Temp Array.
   //             Then find Insertion between Temp Array and the Third Array.
   // 1 -> Using a Single Loop and Keeping Seperate Pointers for each Array.     -  O(n)



   public static void unionAndIntersection(int[] a, int[] b) {



      for(int i=0,j=0;i<a.length || j<b.length;) {
         if(i >= a.length) {
            while(j < b.length) {
               System.out.println("Union Point "+b[j++]);
            }
         } else if(j >= b.length) {
            while(i < a.length) {
               System.out.println("Union Point "+a[i++]);
            }
         } else {
            if(a[i] < b[j]) {
               System.out.println("Union Point "+a[i]);
               i++;
            } else if(a[i] > b[j]) {
               System.out.println("Union Point "+b[j]);
               j++;
            } else {
               System.out.println("Union Point "+a[i]);
               System.out.println("Intersection Point"+a[i]);
               i++;
               j++;
            }
         }
      }
   }




}
