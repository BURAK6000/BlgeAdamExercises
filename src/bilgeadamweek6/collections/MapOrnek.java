package bilgeadamweek6.collections;

import java.util.HashMap;
import java.util.Map;

public class MapOrnek {
	public static void main(String[] args) {

		String[] ogrenci = { "Ayse", "Ece", "Mahmut" };

		Integer[][] notlar = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		Map<String, Integer[]> notMap = new HashMap<String, Integer[]>();

		for (int i = 0; i < notlar.length; i++) {

			notMap.put(ogrenci[i], notlar[i]);
		}

		for (Integer integer : notMap.getOrDefault(ogrenci, notlar[1])) {

			System.out.println(integer);

		}

	}

}
