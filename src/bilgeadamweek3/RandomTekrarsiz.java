package bilgeadamweek3;

import java.util.Arrays;
import java.util.Random;

public class RandomTekrarsiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dizi = new int[52];

		dizi = tekrarsızRandom(52);

		Arrays.sort(dizi);

		for (int i : dizi) {
			System.out.println(i);

		}

	}

	public static int[] tekrarsızRandom(int n) {

		Random random = new Random();
		int[] randomSayiTekrarsiz = new int[n];

		int randomSayi;

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
