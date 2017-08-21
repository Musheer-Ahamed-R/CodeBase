public class FloorAndCeil {

	public static void findFloorAndCeil(int[] a, int elem) {

		// cover the edge case(first and last element), seperate for floor and ceil 

		int start = 0;
		int end = a.length - 1;
		while(start < end) {
			int mid = (start + end) / 2;
			if(a[mid] == elem) {
				System.out.println(elem+" index" +mid);
			} else if(a[mid] < elem) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		System.out.println(start);
	}

}