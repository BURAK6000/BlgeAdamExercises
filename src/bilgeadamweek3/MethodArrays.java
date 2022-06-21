package bilgeadamweek3;

import java.util.Random;
import java.util.Scanner;

public class MethodArrays {

	public static void main(String[] args) {

		arrayAverage();

	}

	private static double randomSayi() {
		Random random = new Random();
		double number = random.nextDouble() * 500;
		return number;
	}

	private static void arrayAverage() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dizi boyutu giriniz: ");
		int boyut = scanner.nextInt();
		double[] dizi = new double[boyut];
		double sum = 0, average;
		System.out.print("Dizinin elemanlari: ");

		for (int i = 0; i < boyut; i++) {
			dizi[i] = randomSayi();
			System.out.print(dizi[i] + ",");
			sum += dizi[i];

		}
		System.out.println();
		average = sum / boyut;
		System.out.println("Ortalama: " + average);

	}

}
