package bilgeadamweek2;

import java.util.Scanner;

public class OrtalamaAl {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Sayi giriniz: ");
		int n = scanner.nextInt();

		double toplam = 0;
		int sayac = 1;

		toplam += n;

		while (true) {
			System.out.println("sayi giriniz: ");
			int n2 = scanner.nextInt();
			if (n2 == n) {
				System.out.println("ortalama: " + toplam / sayac);
				break;
			} else {
				toplam += n2;
				sayac++;
				n = n2;
			}

		}

	}

}
