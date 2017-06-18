public class SortedOrderPrinting {

	// Sorted order printing of a given array that represents a BST

	public static void sortedOrderPrinting(int[] bstArr, int currIndex) {
		if(currIndex >= bstArr.length) {
			return;
		}
		sortedOrderPrinting(bstArr, (2 * currIndex) + 1);
		System.out.print(bstArr[currIndex]+" ");
		sortedOrderPrinting(bstArr, (2 * currIndex) + 2);
	}

}