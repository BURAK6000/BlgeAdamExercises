package bilgeadamweek4oop.emeklilik;

public class Man extends Person {

	public Man() {
		setEmeklilikYasi(65);
		setCinsiyet(Gender.man);

	}

	public Man(String name, int dogumYil) {

		super(name, dogumYil);
		setEmeklilikYasi(65);
		setCinsiyet(Gender.man);

	}

	@Override
	public String toString() {
		return "Man [getName()=" + getName() + ", getDogumYil()=" + getDogumYil() + ", getCinsiyet()=" + getCinsiyet()
				+ ", getEmeklilikYasi()=" + getEmeklilikYasi() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
