package bilgeadamweek7.trycatch.ornek1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		extractedMethod();
	}

	/*
	 * extractedMethod da kendimiz trycatch yarattık ve burda throw ile
	 * fırlattıgımız hatayı yine trtcatch ile yakaladık.
	 * 
	 * throw ile fırlatmayı trycatch kullanmadan da yapabiliriz ama burada hata
	 * fırlatıldıgı anda donguden cıkılır.
	 * 
	 * trycatch ile dongu devam eder.
	 * 
	 * 
	 */
	private static void extractedMethod() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("Sayi giriniz. ");
			int sayi = scanner.nextInt();
			if (sayi < 0) {
				try {

					throw new EksiDegerException("Deger sıfırdan kucuk olamaz!");

				} catch (EksiDegerException e) {
					System.out.println(e.getMessage());

					// TODO: handle exception
				}
			}
		}
	}

}
