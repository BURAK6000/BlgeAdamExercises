package bilgeadamweek5.collections;

import java.util.ArrayList;
import java.util.List;

public class MyArraylist {

	public static void main(String[] args) {

		List<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Ankara");
		myArrayList.add("Izmir");
		myArrayList.add("Adana");
		myArrayList.add("Malatya");
		myArrayList.add("Van");
		myArrayList.add("Hakkari");
		myArrayList.add("Antalya");

		for (int i = 0; i < myArrayList.size(); i++) {

			if (myArrayList.get(i).contains("An")) {

			}

		}
		myArrayList.forEach(l -> System.out.println(l));

	}

}
