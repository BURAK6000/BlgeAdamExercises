package bilgeadamweek2;

public class ArraysSum {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 3, 5, 13, 1, 2, 3, 5, 13, 13, 23 };
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 13) {
				if (nums.length > i + 1 && nums[i + 1] == 13) {
					i++;
				}
				i++;
				continue;

			}
			sum += nums[i];

		}
		System.out.println("toplam: " + sum);
	}
}
