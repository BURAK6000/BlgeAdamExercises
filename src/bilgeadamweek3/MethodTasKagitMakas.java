package bilgeadamweek3;

import java.util.Random;
import java.util.Scanner;

public class MethodTasKagitMakas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] kotStrings = { "tas", "kagit", "makas" };

		do {
			System.out.print("Bir deger giriniz: ");
			int deger = scanner.nextInt();

		} while (true);

	}

	public static int rastgeleSayi() {
		Random random = new Random();

		int randomSayi = random.nextInt(3);
		return randomSayi;

	}

}
