public class Rotate {

	// Turn an image by 90 degree
	// Rotate a matrix by 90 degree without using any extra space

	// 1-> Extra space
	// 2 -> Find transpose of a matric and then reverse column/row for anti-clockwise or clockwise respectively


	public static void rotate(int[][] a) {
		if(a == null) {
			return;
		}
		int[][] b = new int[a[0].length][a.length];
		for(int i=0, k=a.length-1;i<a.length;i++,k--) {
			for(int j=0; j<a[i].length; j++) {
				b[j][k] = a[i][j];
			}
		}
		for(int[] arr : b) {
			for(int elem : arr) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
	}


}