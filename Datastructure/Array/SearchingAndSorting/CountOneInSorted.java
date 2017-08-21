public class CountOneInSorted {

	public static void countOneInSorted(int[] a) {
		if(a==null) {
			return;
		}
		int start = 0;
		int end = a.length - 1;
		while(start < end) {
			int mid = (start + end) / 2;
			if(a[mid] == 1) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		System.out.print(start +" "+end);
	}

}