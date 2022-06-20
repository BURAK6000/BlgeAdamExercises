package bilgeadamweek3;

import java.util.Scanner;

public class MethodObebOkek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayi1 giriniz: ");

		int n1 = scanner.nextInt();

		System.out.println("Sayi1 giriniz: ");

		int n2 = scanner.nextInt();

		okekBul(n1, n2);

	}

	public static int obebBul(int n1, int n2) {

		int nObeb = 1;
		int min = 0;

		if (n1 == n2) {
			nObeb = n1;
		} else {
			min = n2;
			if (n1 < n2) {
				min = n1;
			}
			for (int i = 1; i <= min; i++) {
				if (n1 % i == 0 && n2 % i == 0) {
					nObeb *= i;
				}

			}
		}
		return nObeb;
	}

	public static void okekBul(int n1, int n2) {

		int okek;
		okek = (n1 * n2) / obebBul(n1, n2);
		System.out.println(n1 + " ve " + n2 + "'n OKEK degeri: " + okek);

	}

}
