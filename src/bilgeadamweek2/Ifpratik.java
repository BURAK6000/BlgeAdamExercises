package bilgeadamweek2;

public class Ifpratik {

	public static void main(String[] args) {

		int n = 50;

		for (int i = 1; i <= n * n; i++) {
			if (i < n || i > n * (n - 1) || i % n == 1) {
				System.out.print("*");
			} else if (i % n == 0) {
				System.out.print("*");
				System.out.println();
			} else {
				System.out.print(" ");
			}

		}

	}

}
