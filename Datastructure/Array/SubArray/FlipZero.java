public class FlipZero {

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
            while(wL < wR && A[wL] !=0) {
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
