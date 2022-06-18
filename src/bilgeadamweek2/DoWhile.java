package bilgeadamweek2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int k = 1, sum = 0, n;
		double average = 0.0;
		double l = 1.0;
		do {
			System.out.print("Sayi giriniz: ");
			n = scanner.nextInt();
			sum += n;
			average = (sum / l);
			k++;
			l = k - 1;

		} while (n != 0);

		System.out.println("Toplam: " + sum);
		System.out.println("Ortalama: " + average);

	}

}
