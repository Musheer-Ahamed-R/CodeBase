public class RotateBy180 {

	// Rotate a Matrix by 180 degree

	// 1-> Extra space
    // 2 -> Find transpose of a matric
    //      reverse column/row for anti-clockwise or clockwise respectively
    //      again find transpose of that matric and then            
    //      reverse column/row for anti-clockwise or clockwise respectively

	public static void rotate(int[][] a) {
		if(a == null) {
			return;
		}
		int[][] b = new int[a.length][a[0].length];
		for(int i=0, k=a.length-1;i<a.length;i++,k--) {
			for(int j=0,l=a[i].length-1; j<a[i].length; j++,l--) {
				b[k][l] = a[i][j];
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