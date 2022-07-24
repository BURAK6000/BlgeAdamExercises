package bilgeadamweek6.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public void setString() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("kelime giriniz: ");

		String kelimeString = scanner.nextLine();

		Set<Character> hashSet = new HashSet<Character>();

		Set<Character> tekrarhashSet = new HashSet<Character>();

		for (int i = 0; i < kelimeString.length(); i++) {
			if (!tekrarhashSet.contains(kelimeString.charAt(i)) && !hashSet.add(kelimeString.charAt(i))) {
				tekrarhashSet.add(kelimeString.charAt(i));
				hashSet.remove((kelimeString.charAt(i)));

			}
		}
		System.out.println("tekrar etmeyen elemanlar");
		hashSet.forEach(s -> System.out.println(s + " "));
		System.out.println("tekrar eden elemanlar");
		tekrarhashSet.forEach(s -> System.out.println(s + " "));
	}

	public static void main(String[] args) {
		SetOrnek setOrnek = new SetOrnek();

		setOrnek.setString();

	}

}
