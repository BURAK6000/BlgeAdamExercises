package bilgeadamweek2;

import java.util.Scanner;

public class BasamakToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int n = scanner.nextInt();
		int k = 0, sum = 0;

		do {
			k = n % 10;
			n = (n - k) / 10;
			sum += k;

		} while (n != 0);
		System.out.println("Basamak toplami: " + sum);

	}

}
