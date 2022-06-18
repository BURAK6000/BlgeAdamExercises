package bilgeadamweek2;

public class ArraysIf {

	public static void main(String[] args) {
		int start = 5;
		int end = 55;
		String[] diziStrings = new String[end - start];

		for (int i = 0; i < diziStrings.length; i++) {

			if ((start + i) % 3 == 0 && (start + i) % 5 == 0) {
				diziStrings[i] = "bilgeAdam";

			}

			else if ((start + i) % 3 == 0) {
				diziStrings[i] = "bilge";

			} else if ((start + i) % 5 == 0) {
				diziStrings[i] = "adam";

			} else {
				diziStrings[i] = "" + (start + i);
			}
			System.out.println(diziStrings[i]);

		}

	}

}
