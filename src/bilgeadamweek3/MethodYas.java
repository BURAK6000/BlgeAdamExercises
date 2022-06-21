package bilgeadamweek3;

import java.util.Scanner;

public class MethodYas {

	public static void main(String[] args) {

		yuzYilYas();

	}

	private static void yuzYilYas() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Dogum yilinizi giriniz: ");
		int dy = scanner.nextInt();

		int yuzyil = (dy / 100) + 1;
		int dYuzyil = (2022 / 100) + 1;
		int yas = 2022 - dy;

		System.out.println("Yasadiginiz yuzyil: " + dYuzyil);
		System.out.println("Dogdugunuz yuzyil: " + yuzyil);
		System.out.println("Yasiniz: " + yas);

	}

}
