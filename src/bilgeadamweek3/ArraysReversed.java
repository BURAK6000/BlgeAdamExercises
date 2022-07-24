package bilgeadamweek3;

public class ArraysReversed {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 6, 7, 12, 123, 1233344, 4455555 };

		reversedArr(arr);

	}

	private static void reversedArr(int[] arr) {

		int[] arrReversed = new int[arr.length];
		System.out.print("{");
		for (int i = arr.length - 1, j = 0; i >= 0; i--) {

			arrReversed[j] = arr[i];
			System.out.print(arrReversed[j] + ",");

		}
		System.out.println("}");
	}

}
