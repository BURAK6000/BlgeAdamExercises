package bilgeadamweek4oop.emeklilik;

public class Woman extends Person {

	public Woman() {

		setEmeklilikYasi(60);

		setCinsiyet(Gender.woman);

	}

	public Woman(String name, int dogumYil) {

		super(name, dogumYil);
		setEmeklilikYasi(60);

		setCinsiyet(Gender.woman);

	}

}
