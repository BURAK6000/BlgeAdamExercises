package bilgeadamweek2;

public class StringTrtoEng {

	public static void main(String[] args) {

		String metinString = "BİüüüüLGEADAM";

		String[] trDiziString = { "Ç", "ü", "ç", "ö", "ı", "İ", "Ö", "Ü", "Ş", "ş" };
		String[] engDiziString = { "C", "u", "c", "o", "i", "I", "O", "U", "S", "s" };

		for (int i = 0; i < engDiziString.length; i++) {

			if (metinString.contains(trDiziString[i])) {
				metinString = metinString.replace(trDiziString[i], engDiziString[i]);
			}

		}
		System.out.println(metinString);

	}

}
