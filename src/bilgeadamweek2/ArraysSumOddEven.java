package bilgeadamweek2;

public class ArraysSumOddEven {

	public static void main(String[] args) {

		int[] dizi = { 2, 45, 43, 32, 12, -3, -45, -12, 34, 1, 0, 34 };
		int toplam = 0;

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i] % 2 == 0) {
				System.out.println(dizi[i] + " sayisi ciftir!");
				toplam += dizi[i];
			} else {
				System.out.println(dizi[i] + " sayisi tektir!");
				toplam += dizi[i];

			}

		}

		System.out.println("Dizideki tüm elemanlarin toplami: " + toplam);

	}

}
