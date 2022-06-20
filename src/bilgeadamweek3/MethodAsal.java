package bilgeadamweek3;

public class MethodAsal {

	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {

			isPrime(i);
		}
	}

	private static void isPrime(int i) {
		boolean kontrol = true;

		for (int j = 2; j <= Math.sqrt(i); j++) {

			if (i % j == 0) {
				kontrol = false;
				break;
			}
		}
		if (kontrol) {
			System.out.println(i + " sayisi asal sayidir...");
		}

	}

}
