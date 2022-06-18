package bilgeadamweek2;

public class ArraysTwotoTwo {

	public static void main(String[] args) {
		int[] dizi = { 4, 1, 23, 4, 5, 11, 1, 2, 1, 1, 34, 55, 67, 8, 1, 4, 4, 4, 1, 2, 2 };
		boolean kontrol = false;

		for (int i = 1; i < dizi.length; i++) {

			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				kontrol = true;
				break;
			}

		}

		System.out.println(kontrol);

	}

}
