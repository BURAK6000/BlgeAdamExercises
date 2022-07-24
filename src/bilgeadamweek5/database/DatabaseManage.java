package bilgeadamweek5.database;

import java.util.Scanner;

public class DatabaseManage {

	IDatabase iDatabase;

	public DatabaseManage(IDatabase database) {
		this.iDatabase = database;

	}

	public void menu() {

		Scanner scanner = new Scanner(System.in);

		System.out
				.print("< Gerçekleştirilecek İşlemler >\n-------------" + "----\n[1] - Veri Ekle\n[2] - Veri Sil\n[3] -"
						+ " Veri Getir\n[4] - Veri Güncelle\n-------------" + "----\n->Kararınız:");

		int karar = scanner.nextInt();

		switch (karar) {
		case 1: {
			iDatabase.add();

		}
			break;
		case 2: {
			iDatabase.delete();

		}
			break;
		case 3: {
			iDatabase.get();

		}
			break;
		case 4: {
			iDatabase.update();
		}
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + karar);
		}

	}

}
