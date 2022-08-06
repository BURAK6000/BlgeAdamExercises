package bilgeadamweek7.trycatch;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = 0;

		LocalDate localDate = null;

		boolean kontrol = false;

		do {
			try {

//			System.out.print("Sayi giriniz: ");
//			int sayi = scanner.nextInt();
//			scanner.nextLine();
//			
//			System.out.print("Tarih giriniz: ");
//			String localDate = scanner.nextLine();
//
//			LocalDate localDate2 = LocalDate.parse(localDate);

				n = sayiKontrolu(scanner);

				localDate = tarihKontrolu(scanner);

				yasHesapla(localDate, n);

				kontrol = false;
			} catch (Exception e) {
				System.out.println("xxxaa");

				kontrol = true;
			}

		} while (kontrol);

	}

	public static void yasHesapla(LocalDate localDate, int n) {

		int localDate1 = (LocalDate.now().minusYears(localDate.getYear())).getYear() - n;

		// int localdate2 = (int) localDate.until(localDate.now().minusYears(n),
		// ChronoUnit.YEARS); // yukaridaki ile ayni
		// sonucu verir.

		System.out.println(n + " yil onceki yas: " + localDate1);

	}

	public static int sayiKontrolu(Scanner scanner) {

		int sayi = 0;
		try {
			System.out.print("Sayi giriniz: ");

			sayi = scanner.nextInt();

		}

		catch (InputMismatchException e) {
			System.out.println("Belirtilen aralıklarda sayi giriniz ");
		} catch (Exception e) {

			System.out.println("Tanımlanamayan sorun");
			System.out.println(e);
			// TODO: handle exception
		} finally {
			scanner.nextLine();
		}
		return sayi;
	}

	public static LocalDate tarihKontrolu(Scanner scanner) {
		LocalDate localDate2 = null;
		try {
			System.out.print("Tarih giriniz: ");
			String localDate = scanner.nextLine();

			localDate2 = LocalDate.parse(localDate);

		} catch (DateTimeParseException e) {
			System.out.println("Tarih formatini dogru giriniz!");

		} catch (NullPointerException e) {
			System.out.println("Null deger?????");

		}

		return localDate2;

	}
}
