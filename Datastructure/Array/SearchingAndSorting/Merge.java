public class Merge {

	public static void merge(int[] a, int[] b) {
		if(a == null || b == null) {
			return;
		}
		int i = 0;
		int j = 0;
		int k=0;
		int[] merge = new int[a.length + b.length];
		while(true) {
			if(i == a.length) {
				for(;j<b.length;k++, j++) {
					merge[k] = b[j];
				}
				break;
			}
			if(j == b.length) {
				for(;i<a.length;k++, i++) {
					merge[k] = a[i];
				}
				break;
			}
			if(a[i] <= b[j]) {
				merge[k] = a[i];
				i++;
			} else {
				merge[k] = b[j];
				j++;
			}
			k++;
		}
		for(int elem : merge) {
			System.out.print(elem + " ");
		}
	}

}