package bilgeadamweek6.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansiBulma {

	public static void main(String[] args) {

		// harfFrekansiBulma().forEach((x, y) -> System.out.println(x + "= " + y));

		harfFrekansiBulma().entrySet().forEach(System.out::println);

	}

	public static Map<Character, Integer> harfFrekansiBulma() {
		Map<Character, Integer> frekansMap = new HashMap<Character, Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir string degeri giriniz: ");

		String ifadeString = scanner.nextLine();

		for (int i = 0; i < ifadeString.length(); i++) {

			if (frekansMap.containsKey(ifadeString.charAt(i))) {

				frekansMap.replace(ifadeString.charAt(i), frekansMap.get(ifadeString.charAt(i)) + 1);
			} else {

				frekansMap.put(ifadeString.charAt(i), 1);
			}
		}

		return frekansMap;
	}

}
