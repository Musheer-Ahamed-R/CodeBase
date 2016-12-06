public class FlipZero {

   // Find zeroes to be flipped so that number of consecutive 1’s is maximized

   // 1 -> Using Two Loops(Just like Finding SubArray)
   // 2 -> Using Sliding Window
   //          Keep on Moving Towards Right. If a Zero Element is Found Increment Zero Count
   //          if Zero Count beomes greater than the given value, then move the start to Next of the First Zero Found from Start.
   //          During each Iteration Check if the Width is the Best Width(width - Difference between Start and End)

   public static void flipZeroint(int[] A, int m) {

      int wL = 0, wR = 0;
      int nZero = 0;
      int bestWindowWidth = -1,  bestWL = -1, bestWR = -1;

      while(wR < A.length) {
      	//expand to the right, update '0' count:
      	if (nZero <= m){                      // <= because otherwise nZero will not become > m
      		wR++;
            if(wR >= A.length) break;
      		if (A[wR] == 0) nZero++;
      	}

      	//shrink from left, update '0' count:
      	if (nZero > m) {
            while(wL < wR && A[wL] !=0) {       // wL < wR condition is not required since there must be N+1 zeros between wL and wR
               wL++;
            }
            nZero--;
            wL++;
      	}

      	//update best window:
      	if (wR - wL > bestWindowWidth){
      		bestWindowWidth = wR - wL;
            System.out.println(wR+" "+wL+" "+bestWindowWidth);
      		bestWR = wR;
      		bestWL = wL;
      	}
      }
      System.out.println("------------------");
      System.out.println(bestWL+" "+bestWR+" "+bestWindowWidth);

   }



}
