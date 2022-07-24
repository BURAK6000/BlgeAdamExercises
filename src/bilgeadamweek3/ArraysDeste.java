package bilgeadamweek3;

import java.util.Arrays;
import java.util.Random;

public class ArraysDeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kartTurleri[] = { "Kupa", "Maca", "Karo", "Sinek" };
		String kartNumaralari[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String deste[] = new String[52];
//		for (int i = 0; i < deste.length; i++) {
//			deste[i] = arraysDeste(kartTurleri, kartNumaralari)[i];
//			System.out.print(deste[i] + " , ");
//		}

		int deste1[] = new int[52];
		deste1 = tekrarsızRandom(52);
		Arrays.sort(deste1);

		for (int num : deste1) {
			System.out.println(num);
		}
	}

	public static String[] arraysDeste(String[] arr, String[] arr2) {
		String[] desteStrings = new String[(arr.length * arr2.length)];
		int i = 0;
		int k = 0;
		while (i < arr.length) {

			int j = 0;
			while (j < arr2.length) {
				desteStrings[k] = arr[i] + " " + arr2[j];
				j++;
				k++;
			}
			i++;
		}
		return desteStrings;
	}

	public static int[] tekrarsızRandom(int n) {
		Random random = new Random();
		String[] karisikDesteStrings = new String[n];
		int[] randomSayiTekrarsiz = new int[n];

		int randomSayi = random.nextInt(n);

		for (int i = 0; i < n; i++) {
			randomSayi = random.nextInt(n);

			boolean kontrol = true;

			for (int j = 0; j < i; j++) {

				if (randomSayiTekrarsiz[j] == randomSayi) {
					i--;
					kontrol = false;
					break;
				}
			}
			if (kontrol) {
				randomSayiTekrarsiz[i] = randomSayi;
			}
		}
		return randomSayiTekrarsiz;

	}

}
