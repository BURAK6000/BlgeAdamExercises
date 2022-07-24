package bilgeadamweek4oop.bilgisayar;

public class Main {

	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar();

		Klavye klavye = new Klavye();
		GucKullanimi gucKullanimi = new GucKullanimi();

		klavye.gucKullanimi = new GucKullanimi();

		klavye.gucKullanimi.sarjMiktari = 100;

		klavye.bilgisayarAc();
		klavye.bilgisayarCalistir();
		klavye.bilgisayarCalistir();
		klavye.bilgisayarCalistir();

		klavye.gucKullanimi.sarjKullanimi();

	}

}
