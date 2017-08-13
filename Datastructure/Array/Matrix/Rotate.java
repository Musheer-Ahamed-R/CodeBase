public class Rotate {

	public static void rotate(int[][] a) {
		if(a == null) {
			return;
		}

		for(int i=0;i<a.length/2;i++) {
			int k = a.length - 1 - i;
			for(int j=0;j<a.length - (2 * i) - 1;j++) {
				int temp = a[i][i + j];
				a[i][i + j] = a[k - j][i];
				a[k-j][i] = a[k][k-j];
				a[k][k-j] = a[i+j][k];
				a[i+j][k] = temp;
			}
		}
		for(int[] arr : a) {
			for(int elem : arr) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}


}