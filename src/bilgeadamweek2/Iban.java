package bilgeadamweek2;

import java.util.Scanner;

public class Iban {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kelime giriniz: ");

		String kelimeString = scanner.nextLine();

		if (kelimeString.charAt(0) == 'T') {
			System.out.println("Yurt Ici Islemler");

			if (kelimeString.charAt(kelimeString.length() - 1) == '1') {
				System.out.println("Ziraat Bankasi");
			}
			if (kelimeString.charAt(kelimeString.length() - 1) == '2') {
				System.out.println("Garanti Bankasi");
			}
			if (kelimeString.charAt(kelimeString.length() - 1) == '3') {
				System.out.println("Is Bankasi");
			}
		} else if (kelimeString.charAt(0) == 'O') {

			System.out.println("Yurt Disi Islemler");
			if (kelimeString.charAt(kelimeString.length() - 1) == '0'
					&& kelimeString.charAt(kelimeString.length() - 2) == '0'
					&& kelimeString.charAt(kelimeString.length() - 3) == '0'
					&& kelimeString.charAt(kelimeString.length() - 4) == '2') {
				System.out.println("Kıta ici islemler");
				System.out.println(kelimeString.replace('O', 'K').replace('T', 'I').replace('H', ' '));
			} else {
				System.out.println("Kıta disi islemler");
				System.out.println(kelimeString.replace('O', 'K').replace('T', 'D').replace('H', ' '));
			}
		}
	}
}
