package bilgeadamweek6.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class SansliNumara {
	public static void main(String[] args) {
		SansliNumara sansliNumara = new SansliNumara();

		// sansliNumara.sayıOlustur().entrySet().forEach(System.out::println);

		// System.out.println(sansliNumara.listeyeEkle(sansliNumara.sayıOlustur()).size());

		sansliNumara.seteEkle(sansliNumara.listeyeEkle(sansliNumara.sayıOlustur()), 10).stream().filter(x -> x > 50);

		sansliNumara.seteEkle(sansliNumara.listeyeEkle(sansliNumara.sayıOlustur()), 10).stream().reduce(0,
				(s1, s2) -> s1 + s2);

		System.out.println("50'den buyuk sayilarin toplami");

		Optional<Integer> toplamOptional = Optional
				.ofNullable(sansliNumara.seteEkle(sansliNumara.listeyeEkle(sansliNumara.sayıOlustur()), 10).stream()
						.filter(x -> x < 50).reduce((x1, x2) -> x1 + x2).get());

	}

	public Map<Integer, Integer> sayıOlustur() {
		Random random = new Random();
		Map<Integer, Integer> sansliSayiMap = new HashMap<Integer, Integer>();
		int sayi;
		int toplamSayi = 10000;

		for (int i = 0; i < toplamSayi; i++) {
			sayi = random.nextInt(1, 101);

			if (sansliSayiMap.containsKey(sayi)) {

				sansliSayiMap.replace(sayi, sansliSayiMap.get(sayi) + 1);
			} else {

				sansliSayiMap.put(sayi, 1);
			}
		}
		return sansliSayiMap;
	}

	public List<Integer> listeyeEkle(Map<Integer, Integer> maplistesi) {
		List<Integer> listeMapIntegers = new ArrayList<Integer>();

		for (Entry<Integer, Integer> sayilar : maplistesi.entrySet()) {

			for (int i = 0; i < sayilar.getValue(); i++) {

				listeMapIntegers.add(sayilar.getKey());
			}

		}

		return listeMapIntegers;
	}

	/*
	 * 
	 * for dongusu yerine while kullanılacak
	 */

	public Set<Integer> seteEkle(List<Integer> list, int sayi) {
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < sayi; i++) {
			int eklenecekSayi = random.nextInt(list.size());
			if (set.contains(eklenecekSayi)) {
				i--;
			} else {
				set.add(list.get(eklenecekSayi));
			}
		}
		set.forEach(x -> System.out.println(x));

		return set;

	}

}
