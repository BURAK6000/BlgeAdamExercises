package bilgeadamweek3.uygulama;

import java.util.Scanner;

public class Uygulama {
	Scanner scanner = new Scanner(System.in);

	KUllanici kUllanici;

	int ziyaretciSayisi;

	public void katiyOl() {
		kUllanici = new KUllanici();
		System.out.println("lütfen isminizi giriniz:");
		String isimString = scanner.nextLine();
		System.out.println("lütfen email giriniz:");
		String emailString = scanner.nextLine();
		System.out.println("lütfen sifre giriniz:");
		String sifreString = scanner.nextLine();

	}

}
