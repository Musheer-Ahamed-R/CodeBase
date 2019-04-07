public class Frequency {

	// Count frequencies of all elements in array in O(1) extra space and O(n) time

	public static void findFrequency(int[] a) {
		if(a == null) {
			return;
		}
		for(int i=0; i<a.length; ) {
			int val = a[i];
			if(val <= 0) {
				i++;
				continue;
			}
			int valIndex = val - 1;
			if (a[valIndex] <= 0) {
				a[valIndex] = a[valIndex] - 1;
				a[i] = 0;
				i++;
			} else {
				swap(a, valIndex, i);
				a[valIndex] = -1;
			}
		}
		int index = 1;
		for(int elem : a) {
			System.out.println("Index " + (index++) +" " +elem);
		}
	}

	public static void swap(int[] a, int fir, int sec) {
		int temp = a[fir];
		a[fir] = a[sec];
		a[sec] = temp;
	}

}