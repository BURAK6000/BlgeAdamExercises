package bilgeadamweek7.designpattern.factory;

import java.util.Scanner;

public class Restaurant {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();

		restaurant.menu();
	}

	public void menu() {
		System.out.println("1- Siparis Ver");
		System.out.println("2- Uygulamayi Sonlandir");

		System.out.println("Bir islem seciniz: ");

		int islem = scanner.nextInt();
		scanner.nextLine();
		boolean kontrol = false;
		do {
			switch (islem) {
			case 1:
				EPizzaTur tur = urunTuruSec();
				EPizzaBoyut boyut = urunBoyutuSec();
				EPizzaHamurTuru hamurTuru = urunHamurTipi();
				siparisVer(tur, boyut, hamurTuru);

				kontrol = false;
				break;
			case 2:

				kontrol = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + islem);
			}
		} while (kontrol);
	}

	public void siparisVer(EPizzaTur tur, EPizzaBoyut boyut, EPizzaHamurTuru hamutTuru) {

		try {

			Pizza pizza = PizzaFactory.getPizza(tur, boyut, hamutTuru);

			System.out.println(pizza.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public EPizzaTur urunTuruSec() {
		for (EPizzaTur tur : EPizzaTur.values()) {
			System.out.println(tur.ordinal() + 1 + " - " + tur);

		}
		int secim = secim();
		switch (secim) {
		case 1:
			return EPizzaTur.VEGAN;
		case 2:
			return EPizzaTur.TAVUKLU;

		default:
			throw new IllegalArgumentException("Unexpected value: " + secim);
		}

	}

	private int secim() {
		System.out.println("Lutfen urun turunu seciniz");
		int secim = scanner.nextInt();
		return secim;
	}

	public EPizzaBoyut urunBoyutuSec() {

		for (EPizzaBoyut tur : EPizzaBoyut.values()) {
			System.out.println(tur.ordinal() + 1 + " - " + tur);

		}
		int secim = secim();
		switch (secim) {
		case 1:
			return EPizzaBoyut.KUCUK;
		case 2:
			return EPizzaBoyut.ORTA;
		case 3:
			return EPizzaBoyut.BUYUK;

		default:
			throw new IllegalArgumentException("Unexpected value: " + secim);
		}
	}

	public EPizzaHamurTuru urunHamurTipi() {

		for (EPizzaHamurTuru tur : EPizzaHamurTuru.values()) {
			System.out.println(tur.ordinal() + 1 + " - " + tur);
		}
		int secim = secim();
		switch (secim) {
		case 1:
			return EPizzaHamurTuru.INCE;
		case 2:
			return EPizzaHamurTuru.KALIN;

		default:
			throw new IllegalArgumentException("Unexpected value: " + secim);
		}

	}
}
