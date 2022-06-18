package bilgeadamweek2;

public class Arrays1vs4 {
	public static void main(String[] args) {
		int[] dizi = { 4, 1, 23, 4, 5, 11, 1, 1, 1, 34, 55, 67, 8, 1, 4, 4, 4, 1, 1, 1, 56 };
		int s1 = 0, s4 = 0;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == 1) {
				s1++;
			} else if (dizi[i] == 4) {
				s4++;
			}

		}
		System.out.println("Dizideki 1 elemani sayisi: " + s1);
		System.out.println("Dizideki 4 elemani sayisi: " + s4);
		System.out.println(s1 > s4 ? true : false);

	}

}
