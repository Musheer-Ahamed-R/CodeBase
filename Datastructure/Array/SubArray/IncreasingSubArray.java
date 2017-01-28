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

	// We keep on moving till we find an Element which is Lesser than or equal to the Previous Element. At that point we stop and Count the Number of SubArrays for Each Element(Strictly Increasing SubArrays).
	public static void strictlyIncreasing2(int[] a) {

		int fromIndex = 0;
		int count = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i] <= a[i-1]) {
				System.out.println("Stopping at index "+i+" with count "+count);
				for(int j=fromIndex;j<i;j++) {
					count += i-j-1;
				}
				fromIndex = i;
			}
		}
		for (int i=fromIndex; i<a.length; i++) {
			count += a.length-i-1;
		}
		System.out.println(count);
	}

	// The idea is based on fact that a sorted subarray of length ‘len’ adds len*(len-1)/2 to result.
	public static void strictlyIncreasing3(int[] a) {

		int length = 1;
		int count= 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1] > a[i]) {
				length++;
			} else {
				count += ((length - 1) * length )/2;
				length = 1;
			}
		}
		if(length > 1) {
			count += ((length - 1) * length )/2;
		}
		System.out.println(count);
	}



}