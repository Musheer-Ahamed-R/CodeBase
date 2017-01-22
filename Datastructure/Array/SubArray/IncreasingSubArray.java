public class IncreasingSubArray {
	
	// Given an array of integers, count number of subarrays (of size more than one) that are strictly increasing.

	// 1 -> Using Brute Force 																							-	O(n^2)
	// 2 -> Using the fact that if at any Point a Number is not in order, 												-	O(n)	(Preffered)
	//		then All the SubArrays "Starting" from the Initial Poing to the Point just before the MisMatched Number
	//		will End at the MisMatching Number.
	// 3 -> The idea is based on fact that a sorted subarray of length ‘len’ adds len*(len-1)/2 						-	O(n)
	//		(Strivtly Increasing SubArrays)to result

	public static void strictlyIncreasing(int[] a) {
		
		for (int i=0; i<a.length; i++) {
			String subArrayStr = a[i]+", ";
			int prevVal = a[i];
			for (int j=i+1; j<a.length; j++) {
				if(a[j] > prevVal) {
					subArrayStr += a[j]+", ";
					prevVal = a[j];
					System.out.println(subArrayStr);
				} else {
					break;
				}
			}
		}

	}

	public static void strictlyIncreasing2(int[] a) {

		int prevVal = a[0];
		int fromIndex = 0;
		int count = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i] <= prevVal) {
				System.out.println("Stopping at index "+i+" with count "+count);
				for(int j=fromIndex;j<i;j++) {
					count += i-j-1;
				}
				fromIndex = i;
			}
			prevVal = a[i];
		}
		for (int i=fromIndex; i<a.length; i++) {
			count += a.length-i-1;
		}
		System.out.println(count);
	}



}