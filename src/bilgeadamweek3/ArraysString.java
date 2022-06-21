package bilgeadamweek3;

import java.util.Scanner;

public class ArraysString {

	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	public static void main(String[] args) {
		// sehirBul();
		// plakaEkle();
		// plakaDon();

//		for (int i = 0; i < iller.length; i++) {
//			System.out.println(sesliHarfSil()[i]);
//
//		}

		noktaEkle();
	}

	private static void sehirBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Harf giriniz: ");
		String string = scanner.nextLine();
		String ilString;

		System.out.print(string.toUpperCase().substring(0, 1) + " harfi ile baslayan iller: ");
		for (int i = 0; i < iller.length; i++) {

			if (iller[i].startsWith(string.toUpperCase().substring(0, 1))) {
				ilString = iller[i];
				System.out.print(ilString + ", ");
			}

		}

	}

	private static void plakaEkle() {
		String[] plakaIlString = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {

			if (i < 9) {
				plakaIlString[i] = "0" + (i + 1) + "-" + iller[i];

			} else {
				plakaIlString[i] = (i + 1) + "-" + iller[i];
			}
			System.out.print(plakaIlString[i] + ",");

		}
	}

	private static void plakaDon() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Il giriniz: ");
		String ilString = scanner.nextLine();
		int sayac = 0;
		for (String il : iller) {
			sayac++;
			if (il.toUpperCase().equals(ilString.toUpperCase())) {
				if (sayac < 10) {
					System.out.println("0" + sayac);
				} else {
					System.out.println(sayac);
				}

			}

		}
	}

	private static String[] sesliHarfSil() {
		String[] sesliString = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] sessizHarfStrings = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < sesliString.length; j++) {
				if (iller[i].contains(sesliString[j])) {
					sessizHarfStrings[i] = iller[i].replace(sesliString[j], "");
				}
			}
		}
		return sessizHarfStrings;

	}

	private static void noktaEkle() {
		String[] string = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {
			if (sesliHarfSil()[i].length() > 2) {
				string[i] = sesliHarfSil()[i].substring(0, 3) + "...";
			} else {
				string[i] = sesliHarfSil()[i] + "...";
			}
			System.out.println(string[i]);

		}
	}
}
