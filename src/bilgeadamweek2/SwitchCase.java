package bilgeadamweek2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("1-7 arasinda sayi giriniz: ");

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
		default:
			System.out.println("Belirtilen araliklarda sayi giriniz.!");
			break;
		}

	}

}
