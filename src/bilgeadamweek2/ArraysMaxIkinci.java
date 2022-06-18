package bilgeadamweek2;

public class ArraysMaxIkinci {

	public static void main(String[] args) {

		int[] dizi = { 4, 1, 23, 4, 5, 11, 1, 1, 1, 34, 55, 67, 8, 1, 4, 4, 4, 1, 1, 1, 56 };

		int max = dizi[0];
		int max2 = dizi[0];

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] > max) {
				max2 = max;
				max = dizi[i];

			} else if (dizi[i] > max2) {
				max2 = dizi[i];
			}
		}

//		for (int i = 0; i < dizi.length; i++) {
//			if(dizi[i] <max && dizi[i]>max2) {
//				max2 = dizi[i];
//			}
//		}

		System.out.println("Dizideki en buyuk ikinci sayi: " + max2);

	}

}
