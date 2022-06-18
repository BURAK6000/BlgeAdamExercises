package bilgeadamweek2;

public class ArraysSehirler {

	public static void main(String[] args) {

		String s = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir";

		String[] s1 = s.split(";");
		String[] s2;

		for (int i = 0; i < s1.length; i++) {
			s2 = s1[i].split("-");
			System.out.println(s2[1] + " 'n plaka kodu: " + s2[0]);

		}

	}

}
