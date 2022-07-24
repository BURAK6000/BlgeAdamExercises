package bilgeadamweek5.collections.stack;

import java.util.Random;
import java.util.Stack;

public class Test {
	Stack<Tabak> kirliStack;
	Stack<Tabak> temizStack;

	public Test() {
		kirliStack = new Stack<Tabak>();
		temizStack = new Stack<Tabak>();
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.randomTabakUret();

//		System.out.println("======= Kirli Tabaklar ========");
//		while (test.kirliStack.isEmpty() == false) {
//			System.out.println(test.kirliStack.pop());
//
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println("======= Temiz Tabaklar ========");
//		while (test.temizStack.isEmpty() == false) {
//			System.out.println(test.temizStack.pop());
//		}

		test.secim();
		System.out.println();
		test.secim();
		System.out.println();
		test.secim();
		System.out.println();
		test.secim();
		System.out.println();
		test.secim();
		System.out.println();
		test.secim();
	}

	public void randomTabakUret() {
		for (int i = 0; i < 10; i++) {
			Tabak tabak = new Tabak();
			tabak.id = i + 1;
			if (tabak.isKirli) {
				kirliStack.push(tabak);
			} else {
				temizStack.push(tabak);
			}
		}
	}

	public void temizle() {

		if (!kirliStack.isEmpty()) {

			Tabak tabak = kirliStack.pop();
			tabak.isKirli = false;
			temizStack.push(tabak);
			System.out.println(tabak.id + ". tabak temizlenmiştir.");
		} else {
			System.out.println("Kirli tabak kalmamiştir.");
		}
	}

	public void kullan() {
		if (!temizStack.isEmpty()) {

			Tabak tabak = temizStack.pop();
			tabak.isKirli = true;
			kirliStack.push(tabak);
			System.out.println(tabak.id + ". tabak kullanıldı.");
		} else {
			System.out.println("Temiz tabak kalmamiştir.");
		}

	}

	public void secim() {

		Random random = new Random();
		int n = random.nextInt(2) + 1;
		if (n == 1) {
			System.out.println("Temizle metodu calıştı");

			temizle();

		} else {

			System.out.println("Kullan metodu calıştı");
			kullan();

		}

	}

}
