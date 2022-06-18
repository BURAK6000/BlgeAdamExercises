package bilgeadamweek2;

import java.util.Scanner;

public class CumleAyirma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kelime giriniz: ");

		String kelimeString = scanner.nextLine();

		for (int i = 0; i < kelimeString.length(); i++) {

			if (kelimeString.charAt(i) == ',') {
				System.out.println();

			} else {
				System.out.print(kelimeString.charAt(i));

			}

		}

	}

}
