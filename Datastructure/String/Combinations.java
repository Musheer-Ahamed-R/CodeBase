public class Combinations {

	// Given an array of numbers, print all the combinations of that 

	public static void combineMain() {
		String[] a = { "1", "4", "7" };
		Combinations.combninations("", a, 0);
	}

	public static void combninations (String str, String[] arr, int fromIndex) {
		if (str != null) {
			System.out.println(str);
		}

		for (int i = fromIndex; i < arr.length; i++) {
			combninations(str + arr[i], arr, i + 1);
		}
	}

}