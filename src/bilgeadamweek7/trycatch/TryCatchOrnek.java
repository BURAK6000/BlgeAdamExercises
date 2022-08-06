package bilgeadamweek7.trycatch;

import java.util.InputMismatchException;

public class TryCatchOrnek {

	public static void main(String[] args) {
		String[] myarray = { "a", "10", "bc", null, "20" };

		// arrayDegeriDon(2, myarray);
		// arrayTopla(myarray);

		arrayTopla1(myarray);
	}

	public static void arrayDegeriDon(int n, String[] array) {
		try {
			System.out.println(array[n]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Belirtilen aralıklarda bir deger giriniz");
		} catch (InputMismatchException e) {
			System.out.println("Integer bir deger giriniz");
		}

		catch (Exception e) {

			System.out.println("Tanımlanamayan hata!");
		}
	}

	public static void arrayTopla(String[] array) {

		int toplam = 0;
		int i = 0;

		int hataSayisi = 0;

		while (i < array.length) {
			try {
				toplam += Integer.parseInt(array[i]); // int doner

				// toplam += Integer.valueOf(array[i]); // Integer doner wrapper class doner
				i++;

			} catch (Exception e) {
				// System.out.println(e.getMessage());
				i++;
				hataSayisi++;
			}

		}
		System.out.println("Hata Sayisi: " + hataSayisi);
		System.out.println("toplam " + toplam);

	}

	public static void arrayTopla1(String[] array) {

		int i = 0;

		while (i < array.length) {

			if (array[i] == null) {
				throw new NullPointerException("array[i] degeri Null degere karsılık geldi");
			}
			i++;
		}

	}

}
