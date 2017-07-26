import java.util.*;

public class CountSortedRows {

	// Count all sorted rows in a matrix

	public static void countSortedRows(int[][] a) {
		if(a == null) {
			return;
		}
		int count = 0;
		for(int i=0;i<a.length;i++) {
			boolean isIncreasing = true;
			if(a[i].length > 2) {
				if(a[i][1] < a[i][0]) {
					isIncreasing = false;
				}
			} else {
				count++;
				continue;
			}
			int j=1;
			while(j<a[i].length-1) {
				if(isIncreasing) {
					if(a[i][j] > a[i][j+1]) {
						break;
					} 
				} else {
					if(a[i][j] < a[i][j+1]) {
						break;
					}	
				}
				j++;
			}
			if(j == a[i].length-1) {
				count++;
				System.out.println(Arrays.toString(a[i]));
			}
			
		}
		System.out.println(count);
	}



}