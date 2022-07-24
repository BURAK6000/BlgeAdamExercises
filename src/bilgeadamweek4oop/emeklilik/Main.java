package bilgeadamweek4oop.emeklilik;

public class Main {

	public static void main(String[] args) {
		Man man = new Man("burak", 1994);
		Woman woman = new Woman("ayse", 1994);

		System.out.println(man.getCinsiyet().getName());

	}

}
