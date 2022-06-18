package bilgeadamweek2;

import java.util.Scanner;

public class MukemmelSayi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		int sayac = 1;
		int ms = 0;
		while (n > sayac) {
			if (n % sayac == 0) {
				ms += sayac;
			}
			sayac++;

		}
		if (ms == n) {
			System.out.println(n + " mukemmel sayidir");
		} else {
			System.out.println(n + " mukemmel sayi degildir");
		}
	}

}
