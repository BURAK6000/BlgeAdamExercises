package bilgeadamweek1;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float endPrice = 100;
		float priceWithoutVat = endPrice / 1.18f;

		float rawPrice = priceWithoutVat / 1.15f;

		System.out.println("KDV'siz fiyat = " + priceWithoutVat);
		System.out.println("Ham fiyat = " + rawPrice);

//		 ctrl +shift+c

	}

}
