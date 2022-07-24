package bilgeadamweek5.collections.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sepet {

	List<String> myList = new ArrayList<String>();

	Random random = new Random();

	String product[] = { "Cips", "Kola", "Şeker", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt" };

	public static void main(String[] args) {
		Sepet sepet = new Sepet();
		sepet.menu();

	}

	public void menu() {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------------");
			System.out.println("1-Ürün Listesi Göster");
			System.out.println("2-Ürün Ekle");
			System.out.println("3-Sepeti Göster");
			System.out.println("----------------");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				urunleriGoster(product);
				break;
			case 2:

				urunEkle();

				break;
			case 3:
				sepetiGoster();

				break;

			default:
				break;
			}

		} while (input != 0);

	}

	private void urunleriGoster(String[] urunler) {

		for (int i = 0; i < urunler.length; i++) {

			System.out.println(i + 1 + "- " + urunler[i]);

		}

	}

	private List<String> urunEkle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Urun kodunu giriniz: ");
		int n = scanner.nextInt();

		myList.add(product[n]);

		return myList;

	}

	public void sepetiGoster() {

		myList.forEach(s -> System.out.println(s));

	}

}
