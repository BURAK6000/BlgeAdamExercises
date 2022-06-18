package bilgeadamweek2;

public class ArraysMinMinus {

	public static void main(String[] args) {
		int[] array = { 4, 6, 64, 67, 78, 65, 54, 45, 2, 44 };
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			for (int k = i + 1; k < array.length; k++) {

				int fark = Math.abs(array[i] - array[k]);

				if (fark < min) {
					min = fark;
				}
			}
		}
		System.out.println("max fark: " + min);
	}

}
