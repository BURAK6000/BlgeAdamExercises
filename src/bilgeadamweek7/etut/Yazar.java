package bilgeadamweek7.etut;

import java.io.Serializable;
import java.util.List;

public class Yazar implements Serializable {

	private String isimString;
	private List<Kitap> kitapListesi;

	public Yazar() {
		super();
	}

	public Yazar(String isimString) {
		super();
		this.isimString = isimString;
	}

	@Override
	public String toString() {
		return "Yazar [isimString=" + isimString + ", kitapListesi=" + kitapListesi + "]";
	}

	public String getIsimString() {
		return isimString;
	}

	public void setIsimString(String isimString) {
		this.isimString = isimString;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}

	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}

}
