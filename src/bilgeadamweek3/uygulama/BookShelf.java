package bilgeadamweek3.uygulama;

import java.util.Scanner;

public class BookShelf {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kitaplik boyutu giriniz: ");
		int kitaplikBoyut = scanner.nextInt();
		scanner.nextLine();
		boolean kontrol = true;
		String[] bookcaseStrings = new String[kitaplikBoyut];
		int k = 0;
		do {
			System.out.println("=========== Kitaplik ===========");
			System.out.println("1-Kitap Ekle ");
			System.out.println("2-Yazar Bul ");
			System.out.println("3-Kitap Bul ");
			System.out.println("4-Yazar Listele ");
			System.out.println("5-Kitap Listele ");
			System.out.println("0- Cikis ");
			System.out.print("Seciminiz: ");
			int n1 = scanner.nextInt();
			switch (n1) {
			case 1:
				if (k <= bookcaseStrings.length) {
					kitapEkle(k, bookcaseStrings);
					k++;
				}
				break;
			case 2:
				yazarBul(bookcaseStrings);
				break;
			case 3:
				kitapBul(bookcaseStrings);
				break;
			case 4:
				yazarListele(bookcaseStrings);
				break;
			case 5:
				kitapListele(bookcaseStrings);
				break;
			case 0:
				kontrol = false;
				System.out.println("Sistemden cikis yaptiniz !!!");
				break;
			default:
				break;
			}
		} while (kontrol);
	}

	public static String[] kitapEkle(int k, String[] bookcaseStrings) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Yazar ismi ekle: ");
		String yazarIsmiString = scanner.nextLine().trim().toUpperCase();
		System.out.print("Kitap ismi ekle: ");
		String kitapIsmiString = scanner.nextLine().trim().toUpperCase();

		bookcaseStrings[k] = yazarIsmiString + "," + kitapIsmiString;

		return bookcaseStrings;

	}

	public static void yazarBul(String[] bookcaseStrings) {
		Scanner scanner = new Scanner(System.in);
		Boolean kontrol1 = false;

		System.out.print("Yazar ismi ekle: ");
		String yazarIsmiString = scanner.nextLine().trim().toUpperCase();

		for (int i = 0; i < bookcaseStrings.length; i++) {
			if (bookcaseStrings[i] != null) {

				if (yazarIsmiString.equals(bookcaseStrings[i].substring(0, bookcaseStrings[i].indexOf(",")))) {
					kontrol1 = true;
					break;
				}

			}
		}
		if (kontrol1) {
			System.out.println("Yazar  bulundu...");

		} else {
			System.out.println("Yazar bulunamadi !!!");

		}

	}

	public static void kitapBul(String[] bookcaseStrings) {
		Scanner scanner = new Scanner(System.in);
		Boolean kontrol1 = false;

		System.out.print("Kitap ismi ekle: ");
		String kitapIsmiString = scanner.nextLine().trim().toUpperCase();
		for (int i = 0; i < bookcaseStrings.length; i++) {
			if (bookcaseStrings[i] != null) {
				if (kitapIsmiString.equals(bookcaseStrings[i].substring(bookcaseStrings[i].indexOf(",") + 1))) {
					kontrol1 = true;
					break;
				}
			}

		}
		if (kontrol1) {
			System.out.println("Kitap bulundu...");

		} else {
			System.out.println("Kitap bulunamadi !!!");

		}

	}

	public static String[] yazarListele(String[] bookcaseStrings) {

		for (int i = 0; i < bookcaseStrings.length; i++) {
			if (bookcaseStrings[i] != null) {
				System.out.println(
						i + " 'nci yazar: " + bookcaseStrings[i].substring(0, bookcaseStrings[i].indexOf(",")));
			}
		}
		return bookcaseStrings;

	}

	public static String[] kitapListele(String[] bookcaseStrings) {

		for (int i = 0; i < bookcaseStrings.length; i++) {
			if (bookcaseStrings[i] != null) {
				System.out.println(
						i + " 'nci kitap: " + bookcaseStrings[i].substring(bookcaseStrings[i].indexOf(",") + 1));
			}

		}
		return bookcaseStrings;

	}
}
