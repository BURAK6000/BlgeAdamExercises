package bilgeadamweek4oop.odeme;

public class KartlaOdeme extends Odeme {

	double chipPara;
	int kalanBorc;

	public int borcOde() {

		kalanBorc = borc - odemeMiktari;

		System.out.println("kalan borc: " + kalanBorc);
		return kalanBorc;

	}

	public double chipPara() {
		chipPara = kalanBorc * 0.1;
		return chipPara;

	}
}
