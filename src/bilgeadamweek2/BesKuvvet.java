package bilgeadamweek2;

import java.util.Scanner;

public class BesKuvvet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double n = scanner.nextDouble();

		while (n > 5) {
			n = n / 5;
		}

		if (n == 1) {
			System.out.println("number is power of 5");
		} else {
			System.out.println("number is not power of 5");
		}

	}

}
