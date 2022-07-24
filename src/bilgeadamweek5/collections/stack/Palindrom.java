package bilgeadamweek5.collections.stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrom {
	public static void main(String[] args) {

		Palindrom palindrom = new Palindrom();

		System.out.println(palindrom.ispalindrom("abc"));

	}

	public Boolean ispalindrom(String ifade1) {
		Boolean kontrol = true;
		Scanner scanner = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		System.out.print("Bir metin giriniz: ");
		String ifade = scanner.nextLine();
		for (int i = 0; i < ifade.length(); i++) {

			if (stack.push(ifade.charAt(i)).equals(ifade1.charAt((ifade.length() - 1) - i))) {
				kontrol = true;
			} else {
				kontrol = false;
				break;
			}
		}
		return kontrol;
	}
}
