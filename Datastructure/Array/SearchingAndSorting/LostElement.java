public class LostElement {

	public static void lostElement(int[] a, int[] b) {
		if(a == null) {
			return;
		}
		int start = 0;
		int end = a.length - 1;
		while(start < end) {
			int mid = (start + end) / 2;
			if(a[mid] == b[mid]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		System.out.println(a[start]);
	}

}