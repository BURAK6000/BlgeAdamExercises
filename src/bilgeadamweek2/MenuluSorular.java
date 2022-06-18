package bilgeadamweek2;

import java.util.Scanner;

public class MenuluSorular {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean menuTekrar = true;

		while (menuTekrar) {
			System.out.println("=========Menu=============");
			System.out.println(
					"1: Disaridan girilen kelimenin icinde \"a\" harfi sayisini ve indeks numaralarini bulunuz. ");
			System.out.println("2: Girilen kelimenin icindeki secilen harfi yeni girilen harf ile degistirme. ");
			System.out.println("3: Disaridan girilen kelimeyinin polindrom olup olmadigini bulunuz: ");

			System.out.println(
					"4: Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp başlamadığımızı kontrol etsin\r\n"
							+ "//(a, b,c ile başlayanlar için ayrı ayrı sayfa açıldığını düşünün elimizde) a lar bir sayfa b ler bir sayfa c ler bir\r\n"
							+ "//sayfa gibi düşünelim diğer harfle başlayanlar için ise ayrı bir sayfa düşünelim girilen\r\n"
							+ "//5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa oluğunu ekrana yazdıralım.");

			System.out.println("0: Sistemden cikis");

			System.out.print("Secim yapiniz: ");

			int n = scanner.nextInt();
			int sayac = 0;
			scanner.nextLine();

			switch (n) {
			case 1:
				System.out.println("kelime giriniz: ");

				String kelimeString = scanner.nextLine();

				if (!kelimeString.contains("a")) {
					System.out.println("Harf bulunamadi! ");
				}
				for (int i = 0; i < kelimeString.length(); i++) {

					if (kelimeString.charAt(i) == 'a') {
						System.out.println("a'nin index numarasi: " + i);
						sayac++;
					}
				}
				System.out.println();
				break;
			case 2:
				System.out.print("Kelime giriniz: ");
				String kelimeString1 = scanner.nextLine();
				System.out.print("Yeni harfi giriniz: ");
				String harfStringNew = scanner.nextLine();
				System.out.print("Degisecek harfi giriniz: ");
				String harfStringOld = scanner.nextLine();

				if (kelimeString1.contains(harfStringOld)) {

					kelimeString1 = kelimeString1.replace(harfStringOld, harfStringNew);
					System.out.println("Yeni kelime: " + kelimeString1);

				} else {
					System.out.println("Harf kelime icinde mevcut degil!!!");
				}
				break;
			case 3:
				System.out.print("Kelime giriniz: ");
				String kelimeString2 = scanner.nextLine();

				String tersKelime = "";

				for (int i = 0; i < kelimeString2.length(); i++) {
					tersKelime += kelimeString2.charAt((kelimeString2.length() - 1) - i);

				}
				System.out.println(tersKelime);
				if (kelimeString2.equalsIgnoreCase(tersKelime)) {
					System.out.println("Girilen kelime Polindrom 'dur");
				} else {
					System.out.println("Girilen kelime Polindrom degildir!!!");
				}
				break;

			case 4:
				String sayfaString = "";
				int kelimeSayisi = 5;
				do {
					System.out.print("Kelime giriniz: ");
					String kelimeString3 = scanner.nextLine();
					if (kelimeString3.charAt(0) == 'a') {
						if (!sayfaString.contains("a")) {
							sayfaString += "a";
						}
					} else if (kelimeString3.charAt(0) == 'b') {
						if (!sayfaString.contains("b")) {
							sayfaString += "b";
						}
					} else if (kelimeString3.charAt(0) == 'c') {
						if (!sayfaString.contains("c")) {
							sayfaString += "c";
						}
					} else {
						if (!sayfaString.contains("x")) {
							sayfaString += "x";
						}
					}
					kelimeSayisi--;
				} while (kelimeSayisi > 0);
				System.out.println(sayfaString);
				System.out.println("Sayfa sayisi: " + sayfaString.length());

				/***
				 * 
				 * case 4 ->{ String defter = ""; for(int i = 0; i < 5; i++) { switch
				 * (scanner.nextLine().charAt(0)) { case 'a', 'A' ->{ if(!defter.contains("a"))
				 * defter+= "a";} case 'b', 'B' ->{ if(!defter.contains("b")) defter+= "b";}
				 * case 'c', 'C' ->{ if(!defter.contains("c")) defter+= "c";} default ->{
				 * if(!defter.contains("x")) defter+= "x";} } } System.out.println("Açılan sayfa
				 * sayısı : " + defter.length()); }
				 */

			case 0:
				System.out.println("Sistemden cikis yaptiniz!");
				menuTekrar = false;
				break;
			default:
				menuTekrar = false;
				System.out.println("Yanlis secim yaptiniz! ");
				break;
			}
		}
	}
}
