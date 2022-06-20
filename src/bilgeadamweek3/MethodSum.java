package bilgeadamweek3;

import java.util.Scanner;

public class MethodSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac sayi gireceksiniz 2 ya da 3:");
		int sayi = scanner.nextInt();
		if (sayi == 2 || sayi == 3) {
			if (sayi == 2) {
				System.out.print("Sayi1 giriniz: ");
				int n1 = scanner.nextInt();
				System.out.print("Sayi2 giriniz: ");
				int n2 = scanner.nextInt();
				toplamıBul(n1, n2);
			} else {
				System.out.print("Sayi1 giriniz: ");
				int n1 = scanner.nextInt();
				System.out.print("Sayi2 giriniz: ");
				int n2 = scanner.nextInt();
				System.out.print("Sayi3 giriniz: ");
				int n3 = scanner.nextInt();
				toplamıBul(n1, n2, n3);
			}
		}

	}

	private static void toplamıBul(int n1, int n2) {
		int toplam = n1 + n2;
		System.out.println("2 sayinin toplami: " + toplam);
	}

	private static void toplamıBul(int n1, int n2, int n3) {
		int toplam = n1 + n2 + n3;
		System.out.println("3 sayinin toplami: " + toplam);
	}
}
