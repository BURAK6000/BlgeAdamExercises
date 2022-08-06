package bilgeadamweek7.etut;

import java.io.Serializable;

public class Kitap implements Serializable {

	private String isimString;
	private String yazarIsmiString;
	private String kitapTurString;

	public Kitap() {
		super();
	}

	public Kitap(String isimString, String yazar, String kitapTurString) {
		super();
		this.isimString = isimString;
		this.yazarIsmiString = yazar;
		this.kitapTurString = kitapTurString;
	}

	public String getIsimString() {
		return isimString;
	}

	public void setIsimString(String isimString) {
		this.isimString = isimString;
	}

	public String getYazarIsmiString() {
		return yazarIsmiString;
	}

	public void setYazarIsmiString(String yazarIsmiString) {
		this.yazarIsmiString = yazarIsmiString;
	}

	public String getKitapTurString() {
		return kitapTurString;
	}

	public void setKitapTurString(String kitapTurString) {
		this.kitapTurString = kitapTurString;
	}

}
