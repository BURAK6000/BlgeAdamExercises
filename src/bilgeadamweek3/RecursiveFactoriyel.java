package bilgeadamweek3;

public class RecursiveFactoriyel {
	public static void main(String[] args) {
		System.out.println(factoriyel(10));

	}

	public static int factoriyel(int sayi) {
		if (sayi > 1) {
			return sayi * factoriyel(sayi - 1);

		} else {
			return 1;
		}

	}

}
