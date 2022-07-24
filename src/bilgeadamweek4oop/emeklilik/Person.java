package bilgeadamweek4oop.emeklilik;

public abstract class Person {

	private String name;

	private int dogumYil;

	private Gender cinsiyet;

	private int emeklilikYasi;

	public Person() {

	}

	public Person(String name, int dogumYil) {
		super();
		this.name = name;
		this.dogumYil = dogumYil;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDogumYil() {
		return dogumYil;
	}

	public void setDogumYil(int dogumYil) {
		this.dogumYil = dogumYil;
	}

	public Gender getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Gender cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public int getEmeklilikYasi() {
		return emeklilikYasi;
	}

	public void setEmeklilikYasi(int emeklilikYasi) {
		this.emeklilikYasi = emeklilikYasi;
	}

}
