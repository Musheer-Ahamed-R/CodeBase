import java.util.*;

public class TripletWithSum {

	public static void tripletWithSum(int[] arr, int sum) {

		Arrays.sort(arr);
		for(int i=0;i<arr.length - 2;i++) {
			
			for(int j=i+1, k=arr.length-1; j<k;) {
				int currSum = arr[i] + arr[j] + arr[k];
				if(currSum == sum) {
					System.out.println(arr[i] + " " + arr[j] + " "+ arr[k]);
					j++;
					k--;
				} else if(currSum < sum) {
					j++;
				} else {
					k--;
				}
			}
		}		
	}

}