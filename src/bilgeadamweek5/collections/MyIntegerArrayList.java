package bilgeadamweek5.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyIntegerArrayList {
	List<Integer> ciftSayilar = new ArrayList<Integer>();
	List<Integer> tekSayilar = new ArrayList<Integer>();

	public static void main(String[] args) {
		MyIntegerArrayList myIntegerArrayList = new MyIntegerArrayList();
		Random random = new Random();

		for (int i = 0; i < 35; i++) {

			Integer n = random.nextInt(100);

			if (n % 2 == 0) {
				myIntegerArrayList.ciftSayilar.add(n);

			} else {
				myIntegerArrayList.tekSayilar.add(n);
			}
		}
		System.out.println("------------------------------Cift Sayilar------------------------------");
		System.out.println();

		myIntegerArrayList.ciftSayilar.forEach(c -> System.out.print(c + ","));
		System.out.println();
		System.out.println("------------------------------Tek Sayilar------------------------------");
		System.out.println();

		myIntegerArrayList.tekSayilar.forEach(t -> System.out.print(t + ","));

	}

}
