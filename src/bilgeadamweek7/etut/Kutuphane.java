package bilgeadamweek7.etut;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Kutuphane {

	private List<Kitap> kitapListesi;
	private Map<String, List<String>> yazarKitapListesi;
	private Map<String, List<String>> turKitapListesi;
	private List<Yazar> yazarlarList;

	public Kutuphane() {
		super();
		
		this.kitapListesi = new ArrayList<Kitap>();
		this.yazarlarList = new ArrayList<Yazar>();
		this.yazarKitapListesi = new 
		
	}

	public Kutuphane(List<Kitap> kitapListesi, Map<String, List<String>> yazarKitapListesi,
			Map<String, List<String>> turKitapListesi, List<Yazar> yazarlarList) {
		super();
		this.kitapListesi = kitapListesi;
		this.yazarKitapListesi = yazarKitapListesi;
		this.turKitapListesi = turKitapListesi;
		this.yazarlarList = yazarlarList;
	}

	public List<Kitap> getKitapListesi() {
		return kitapListesi;
	}

	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}

	public Map<String, List<String>> getYazarKitapListesi() {
		return yazarKitapListesi;
	}

	public void setYazarKitapListesi(Map<String, List<String>> yazarKitapListesi) {
		this.yazarKitapListesi = yazarKitapListesi;
	}

	public Map<String, List<String>> getTurKitapListesi() {
		return turKitapListesi;
	}

	public void setTurKitapListesi(Map<String, List<String>> turKitapListesi) {
		this.turKitapListesi = turKitapListesi;
	}

	public List<Yazar> getYazarlarList() {
		return yazarlarList;
	}

	public void setYazarlarList(List<Yazar> yazarlarList) {
		this.yazarlarList = yazarlarList;
	}

}
