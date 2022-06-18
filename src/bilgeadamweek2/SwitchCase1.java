package bilgeadamweek2;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {

		// Koç Burcu : 21 Mart - 20 Nisan
		//
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		//
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		//
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		//
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		//
		// Başak Burcu : 23 Ağustos - 22 Eylül
		//
		// Terazi Burcu : 23 Eylül - 22 Ekim
		//
		// Akrep Burcu : 23 Ekim - 21 Kasım
		//
		// Yay Burcu : 22 Kasım - 21 Aralık
		//
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		//
		// Balık Burcu : 20 Şubat - 20 Mart

		Scanner scanner = new Scanner(System.in);
		System.out.print("gun giriniz: ");
		int gun = scanner.nextInt();
		System.out.println();
		scanner.nextLine();

		System.out.print("ay giriniz: ");
		String ay = scanner.nextLine();

		switch (ay) {
		case "mart":
			if (gun >= 21) {
				System.out.println("Koc");
			} else {
				System.out.println("Balik");
			}
			break;
		case "nisan":
			if (gun >= 21) {
				System.out.println("Boga");
			} else {
				System.out.println("Koc");
			}
			break;
		case "mayis":
			if (gun >= 22) {
				System.out.println("Ikizler");
			} else {
				System.out.println("Boga");
			}
			break;
		case "haziran":
			if (gun >= 23) {
				System.out.println("Yengec");
			} else {
				System.out.println("Ikizler");
			}
			break;
		case "temmuz":
			if (gun >= 23) {
				System.out.println("Aslan");
			} else {
				System.out.println("Yengec");
			}
			break;
		case "agustos":
			if (gun >= 23) {
				System.out.println("Basak");
			} else {
				System.out.println("Aslan");
			}
			break;
		case "eylul":
			if (gun >= 23) {
				System.out.println("Terazi");
			} else {
				System.out.println("Basak");
			}
			break;
		case "ekim":
			if (gun >= 23) {
				System.out.println("Akrep");
			} else {
				System.out.println("Terazi");
			}
			break;
		case "kasim":
			if (gun >= 22) {
				System.out.println("Yay");
			} else {
				System.out.println("Akrep");
			}
			break;
		case "aralik":
			if (gun >= 22) {
				System.out.println("Oglak");
			} else {
				System.out.println("Yay");
			}
			break;
		case "ocak":
			if (gun >= 22) {
				System.out.println("Kova");
			} else {
				System.out.println("Oglak");
			}
			break;
		case "subat":
			if (gun >= 20) {
				System.out.println("Balik");
			} else {
				System.out.println("Kova");
			}
			break;
		}
	}

}
