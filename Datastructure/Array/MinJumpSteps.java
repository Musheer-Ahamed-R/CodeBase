public class MinJumpSteps {


// INCOMPLETE 
   public static void minJump(int[] a) {


      for(int i=0;i<a.length;) {
         int currElem = i;
         int noOfAllowedSteps = a[i];
         int maxStep = -1;

         for(int j=i+1;j<=(currElem+noOfAllowedSteps) && j<a.length;j++) {
            System.out.println("000000");
            if(maxStep < a[j]) {
               maxStep = a[j];
               i = j;
            }
         }
         if(maxStep == -1 ){
            break;
         }
         //if(i + maxStep >= a.length-1) {
            //System.out.println("last Reached");
            //break;
         //}
         System.out.println("Step Taken is "+currElem+"  "+noOfAllowedSteps+"  "+i+"  "+maxStep);
      }
   }



}
