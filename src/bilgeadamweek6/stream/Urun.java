package bilgeadamweek6.stream;

public class Urun {

	public Urun(String isimString, double fiyat) {
		super();
		this.isimString = isimString;
		this.fiyat = fiyat;
	}

	private String isimString;
	private double fiyat;

	public String getIsimString() {
		return isimString;
	}

	public void setIsimString(String isimString) {
		this.isimString = isimString;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Urun [isimString=" + isimString + ", fiyat=" + fiyat + "]";
	}

}
