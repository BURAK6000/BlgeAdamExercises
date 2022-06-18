package bilgeadamweek2;

public class MatrisOdd {

	public static void main(String[] args) {

		int[][] matris = { { 56, 23, 678, 231 }, { 234, 21, 78, 26 }, { 654, 33, 32, 67 }, { 189, 35, 56, 89 } };
		int k = 0;
		int[] dizi = new int[matris.length * matris[0].length];
		System.out.print("{ ");
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					k++;
					dizi[k] = matris[i][j];
					System.out.print(dizi[k] + ",");
				}
			}
		}
		System.out.print(" }");
	}
}
