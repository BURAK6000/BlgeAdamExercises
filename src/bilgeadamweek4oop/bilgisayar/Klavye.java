package bilgeadamweek4oop.bilgisayar;

/**
 * @author user
 *
 */

public class Klavye {

	Bilgisayar bilgisayar;

	GucKullanimi gucKullanimi;

	/**
	 * 
	 */
	public void bilgisayarAc() {

		System.out.println("Bilgisayar acildi");
		gucKullanimi.sarjMiktari--;
	}

	public void bilgisayarCalistir() {

		System.out.println("Bilgisayar calisiyor");
		gucKullanimi.sarjMiktari = gucKullanimi.sarjMiktari - 5;
	}

	public void bilgisayarKapat() {

		System.out.println("Bilgisayar kapatıldı");
	}

}
