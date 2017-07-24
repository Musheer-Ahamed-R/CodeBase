import java.util.*;

public class DiffWithSum {

	// Find a pair with the given difference

	public static void diffWithSum(int[] a, int diff) {
		Arrays.sort(a);
		for(int i=0, j=1;i<j && j<a.length;) {
			int currDiff = a[j] - a[i];
			if(currDiff == diff) {
				System.out.println(a[i]+"  "+a[j]);
				i++;
			} else if(currDiff > diff) {
				i++;
			} else {
				j++;
			}
		}
	}


}