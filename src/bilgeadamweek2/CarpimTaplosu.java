package bilgeadamweek2;

import java.util.Scanner;

public class CarpimTaplosu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

}
