package bilgeadamweek2;

import java.util.Scanner;

public class Factoriyel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.print("Sayi giriniz: ");
		int n = sc.nextInt();
		double fuc = 1;

		if (n < 0) {
			System.out.println("Pozitif bir sayi giriniz");
		}

		else {

			if (n == 0) {
				fuc = 1;
			}

			else {
				for (int i = 1; i <= n; i++) {

					fuc *= i;
				}
			}
		}
		System.out.println(n + " 'n faktoriyeli: " + fuc);
	}

}
