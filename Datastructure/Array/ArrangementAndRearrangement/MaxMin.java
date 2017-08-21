public class MaxMin {

	public static void maxMin(int[] a, int start, int end) {
		if(start > end) {
			return;
		}
		if(start == end) {
			a[2*start] = a[start];
			return;
		}
		int fir = a[start];
		int sec = a[end];
		maxMin(a, start + 1, end -1);
		a[2*start] = fir;
		a[(2*start) + 1] = sec;
	}

	public static void assembleMaxMin(int[] a) {
		if(a == null) {
			return;
		}
		maxMin(a, 0, a.length-1);
		for(int elem : a) {
			System.out.print(elem + " ");
		}
	}

}