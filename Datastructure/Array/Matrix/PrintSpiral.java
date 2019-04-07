public class PrintSpiral {

	// Print a given matrix in spiral form

	public static void print(int[][] a) {
		if(a == null) {
			return;
		}
		int top = 0;
		int bottom = a.length - 1;
		int left = 0;
		int right = a[0].length - 1;
		while(top <= bottom && left <= right) {
			for(int i = left;i<=right;i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			System.out.println();
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");	
			}
			right--;
			System.out.println();
			for(int i=right;i>=left && top <= bottom;i--) {
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			System.out.println();
			for(int i=bottom;i>=top && left <= right;i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
			System.out.println();
		}
	}
}