package bilgeadamweek2;

public class TekCiftOrani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tek = 0, cift = 0;
		double average;

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				cift += i;
			} else {
				tek += i;

			}
		}

		average = (double) cift / tek;

		System.out.println("Cift sayilar toplaminin tek sayilar toplamina orani: " + average);

	}

}
