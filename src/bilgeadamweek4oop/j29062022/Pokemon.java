package bilgeadamweek4oop.j29062022;

public class Pokemon {

	String name;
	String type;
	int health;

	public Pokemon(String isim, int saglik) {
		name = isim;
		health = saglik;

	}

	public Pokemon() {

	}

	public void dodge() {
		System.out.println(name + "adlı pokemon saldırıdan kacınıyor");

	}

	public void attack() {

		System.out.println(name + "adlı pokemon saldırıyor");
	}

}
