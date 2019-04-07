public class Application {

	public static void main(String[] args) {
		int[] a = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};	
		int[] c = { 2, -1, 7, -1, -1, 10, -1 };
		int[] d = { 5, 8, 12, 14 };
		//ArrangePosNeg.arrangePosNeg(a);
		//MaxMin.assembleMaxMin(b);
		MergeIntoGreaterArray.mergeArray(c, d);
	}

}