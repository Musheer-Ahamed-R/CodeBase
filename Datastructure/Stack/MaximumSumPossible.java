public class MaximumSumPossible {

	// Find maximum sum possible equal sum of three stacks

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 2, 3};
  		int b[] = { 2, 3, 4};
  		int c[] = { 1, 4, 1, 1};

		int aSum = 0;
		int bSum = 0;
		int cSum = 0;
		for(int i=0;i<a.length;i++) {
			aSum += a[i];
		}
		for(int i=0;i<b.length;i++) {
			bSum += b[i];
		}
		for(int i=0;i<c.length;i++) {
			cSum += c[i];
		}
		int aTop = a.length-1;
		int bTop = b.length-1;
		int cTop = c.length-1;
		while(aTop >= 0 && bTop >= 0 && cTop >= 0) {
			int minSum = Integer.min(Integer.min(aSum, bSum), cSum);
			if((aSum == bSum) && (bSum == cSum)) {
				System.out.println("Hurrey" + aSum);
				break;
			} else {
				while(aTop >= 0 && aSum > minSum) {
					aSum -= a[aTop];
					aTop--;
				}
				while(bTop >= 0 && bSum > minSum) {
					bSum -= b[bTop];
					bTop--;
				}
				while(cTop >= 0 && cSum > minSum) {
					cSum -= c[cTop];
					cTop--;
				}	
			}
		}
	}


}