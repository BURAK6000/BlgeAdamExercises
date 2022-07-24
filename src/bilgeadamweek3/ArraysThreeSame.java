package bilgeadamweek3;

public class ArraysThreeSame {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 6, 7, 8, 34, 5, 66, 78 };

		System.out.println(isThreeSame(nums));
	}

	private static boolean isThreeSame(int[] nums) {
		int j, k, l = 1;
		boolean kontrol = false;

		for (int i = 0; i < nums.length; i++) {
			j = i + 1;
			k = j + 1;
			if (k < nums.length) {
				if ((nums[k] - nums[j] == l) && (nums[j] - nums[i] == l)) {
					kontrol = true;
					break;

				}
			}
		}
		return kontrol;
	}
}
