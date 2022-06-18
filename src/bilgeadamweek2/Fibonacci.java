package bilgeadamweek2;

public class Fibonacci {
	public static void main(String[] args) {

		int k = 11;
		int a = 0, b = 1;

		int fib = 0;

		for (int i = 0; i < k; i++) {

			System.out.print(fib + ",");
			fib = (a + b);
			a = b;
			b = fib;

		}

	}

}
