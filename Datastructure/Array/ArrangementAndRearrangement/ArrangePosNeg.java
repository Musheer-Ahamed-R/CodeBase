public class ArrangePosNeg {

	public static void arrangePosNeg(int[] a) {
		if(a == null) {
			return;
		}
		boolean isPos = true;
		int posFrom = 0;
		int negFrom = 0;
		for(int i=0;i<a.length;i++) {
			if(isPos) {
				if(a[i] < 0) {
					int index  = getIndex(a, isPos, posFrom);
					if(index == -1) {
						break;
					} else {
						swap(a, i, index);
						posFrom = index + 1;
					}
				} else {
					posFrom = i + 2;
				}
			} else {
				if(a[i] > 0) {
					int index  = getIndex(a, isPos, negFrom);
					if(index == -1) {
						break;
					} else {
						swap(a, i, index);
						negFrom = index + 1;
					}
				} else {
					negFrom = i + 2;
				}
			}
			isPos = !isPos;
		}
		for(int elem : a) {
			System.out.print(elem +" ");
		}
	}

	public static int getIndex(int[] a, boolean isPositive, int from) {

		for(int i=from;i<a.length;i++) {
			if((isPositive && a[i] >= 0) || (!isPositive && a[i] < 0)) {
				return i;
			}
		}
		return -1;
	}

	public static void swap(int[] a, int fir, int sec) {
		if(a == null) {
			return;
		}
		int temp = a[fir];
		a[fir] = a[sec];
		a[sec] = temp;
	}

}