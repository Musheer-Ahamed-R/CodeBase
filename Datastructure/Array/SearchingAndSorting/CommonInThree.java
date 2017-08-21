public class CommonInThree {

	// Find common elements in three sorted arrays

	public static void commonInThree(int[] a, int[] b, int[] c) {
		if(a == null) {
			return;
		}
		int i = 0;
		int j = 0;
		int k = 0;
		while(true) {
			if(i == a.length || j == b.length || k == c.length) {
				break;
			}
			if(a[i] == b[j] && a[i] == c[k]) {
				System.out.println(a[i]);
				i++;
				j++;
				k++;
			} else {
				int max = Integer.max(Integer.max(a[i], b[j]), c[k]);
				if(a[i] < max) {
					i++;
				}
				if(b[j] < max) {
					j++;
				}
				if(c[k] < max) {
					k++;
				}
			}
		}
	}


}