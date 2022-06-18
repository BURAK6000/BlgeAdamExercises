package bilgeadamweek2;

import java.util.Scanner;

public class BesSayi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int sayac = 1;

		int max = -1;
		int min = 101;
		do {
			System.out.print("Enter a number: ");
			n = scanner.nextInt();
			if (n >= 0 && n <= 100) {

				if (min >= n) {
					min = n;
				} else if (max <= n) {
					max = n;
				}
				sayac++;
			} else {
				System.out.println("0 ile 100 arasinda sayi giriniz");
			}
		} while (sayac <= 5);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
