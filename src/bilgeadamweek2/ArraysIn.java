package bilgeadamweek2;

import java.util.Scanner;

public class ArraysIn {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] dizi = { "Turkiye", "Japonya", "Mogolistan", "Danimarka" };
		System.out.print("Ulke ismi giriniz: ");
		String string = scanner.nextLine();

		String kontrolString = "Deger Bulunamadi!";
		for (int i = 0; i < dizi.length; i++) {
			if (string.equals(dizi[i])) {
				kontrolString = "Deger Bulundu";
				break;
			}
		}
		System.out.println(kontrolString);
	}

}
