package bilgeadamweek2;

public class ArraysMaxMin {

	public static void main(String[] args) {

		int[] dizi = { 10, -34, -456, 23, 3445, 6544, 3, 32, 5 };
		int max = dizi[0];
		int min = dizi[0];
		for (int i = 1; i < dizi.length; i++) {
			if (max < dizi[i]) {
				max = dizi[i];
			} else if (min > dizi[i]) {
				min = dizi[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}

}
