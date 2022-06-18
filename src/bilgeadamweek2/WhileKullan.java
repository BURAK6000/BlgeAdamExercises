package bilgeadamweek2;

public class WhileKullan {

	public static void main(String[] args) {
		int toplam = 0;
		int i = 0;
		int temp = 1;
		while (temp < 50) {
			toplam += i;
			temp += (i + 1);
			i++;
		}
		System.out.println("Toplam: " + toplam);

	}

}
