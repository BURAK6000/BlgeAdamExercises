package bilgeadamweek5.database;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DatabaseManage databaseManage;
		System.out.println("============== Menu ==============");

		Scanner scanner = new Scanner(System.in);
		System.out.println("1- MySQL, 2-Oracle");
		System.out.print("Kararınız: ");

		int karar = scanner.nextInt();

		scanner.nextLine();

		switch (karar) {
		case 1: {
			databaseManage = new DatabaseManage(new MysqlDatabase());
			databaseManage.iDatabase.login();

			databaseManage.menu();

		}
			break;
		case 2: {
			databaseManage = new DatabaseManage(new OracleDatabase());

			databaseManage.iDatabase.login();

			databaseManage.menu();

		}
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + karar);
		}

	}

}
