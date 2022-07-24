package bilgeadamweek4oop.emeklilik;

import java.util.Scanner;

public class Manager {

	Person[] persons;
	Man man;
	Woman woman;

	public Manager() {
		persons = new Person[2];
	}

	public void register() {

	}

	public Person selectGender() {

		Person person;

		Scanner scanner = new Scanner(System.in);

		for (Gender gender : Gender.values()) {
			System.out.println(gender.getNo() + "-" + gender.getName());

		}

		System.out.println("bir secim yapiniz: ");
		int select = scanner.nextInt();
		scanner.nextLine();

		if (select == 1) {
			person = new Man();
			return bilgileriGir(person);

		} else {
			person = new Woman();
			return bilgileriGir(person);
		}
	}

	public Person bilgileriGir(Person person) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ad girin");
		person.setName(scanner.nextLine());
		System.out.println("Dogum yılını girin:");
		person.setDogumYil(scanner.nextInt());
		return person;

	}

}
