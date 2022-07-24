package bilgeadamweek6.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Test {

	List<Urun> urunListesi = new ArrayList<Urun>();

	public static void main(String[] args) {

		System.out.println(urunYarat());

		Test test = new Test();

		test.listeyeEkle(Optional.ofNullable(urunYarat()));

	}

	public void listeyeEkle(Optional<Urun> urun)

	{
		if (urun.isPresent()) {
			urunListesi.add(urun.get());

		}

		System.out.println("======= Urun Listesi ========");

		urunListesi.forEach(System.out::println);
	}

	public static Urun urunYarat() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("urun ismi giriniz: ");

		String isim = scanner.nextLine();
		System.out.print("urun fiyatı girin");

		double fiyat = scanner.nextDouble();

		scanner.nextLine();

		if (fiyat <= 0 || isim.equals("")) {

			return null;
		} else {
			return new Urun(isim, fiyat);

		}
	}

	public Optional<Urun> urunYarat2() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("urun ismi giriniz: ");

		String isim = scanner.nextLine();
		System.out.print("urun fiyatı girin");

		double fiyat = scanner.nextDouble();

		scanner.nextLine();

		if (fiyat <= 0 || isim.equals("")) {

			return Optional.ofNullable(null);
		} else {
			return Optional.of(new Urun(isim, fiyat));

		}

	}

}
