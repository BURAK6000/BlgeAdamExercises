package bilgeadamweek7.fileornek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIslem {

	public static void main(String[] args) {

		menu();
	}

	public static void menu() {
		FileSabit fileSabit = new FileSabit();
		Scanner scanner = new Scanner(System.in);

		System.out.println("0- Cikis");
		System.out.println("1- Dosya Yarat");
		System.out.println("2- Ekle");
		System.out.println("3- Okuma");
		System.out.println("4- Harf Degistir");
		System.out.println("5- Dosya Silme");

		int n;

		do {

			System.out.println("Lütfen Islem Seciniz ");
			n = scanner.nextInt();
			switch (n) {
			case 1: {
				try {
					dosyaYarat(fileSabit.file);
				} catch (Exception e) {
					System.out.println(e.toString());

				}
				break;

			}
			case 2:
				try {
					ekle(fileSabit.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}
				break;
			case 3:
				try {
					okuma(fileSabit.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}
				break;
			case 4:
				try {
					harfDegistir(fileSabit.file, "a", "e");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				dosyaSil(fileSabit.path);
				break;
			case 0:
				System.out.println("Sistemden cikiliyor...");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		} while (n != 0);
	}

	public static void dosyaYarat(File file) throws Exception {

		if (file.exists()) {
			throw new Exception("Dosya mevcuttur");
		} else {
			System.out.println("Dosya olusturuluyor...");
			file.createNewFile();

			Thread.sleep(1000);
			System.out.println("Dosya olusturuldu.");
		}

	}

	public static void ekle(File file) throws Exception {

		Scanner scanner = new Scanner(System.in);
		BufferedWriter bufferedWriter = null;

		if (file.exists()) {
			try {
				bufferedWriter = new BufferedWriter(new FileWriter(file, true));

				try {

					System.out.println("Ifade giriniz...");
					bufferedWriter.write(scanner.nextLine() + "\n");
					bufferedWriter.flush();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			} finally {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			throw new Exception("Dosya mevcut degil");
		}

	}

	public static void okuma(File file) throws Exception {

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			String ifadeString = "";
			while ((ifadeString = bufferedReader.readLine()) != null) {
				System.out.println(ifadeString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} finally {

		}
	}

	public static void harfDegistir(File file, String degisecekString, String yerineGelecekString) throws Exception {
		String ifadeString = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			while ((ifadeString = bufferedReader.readLine()) != null) {

				ifadeString = ifadeString.replace(degisecekString, yerineGelecekString);
				System.out.println(ifadeString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

	public static void dosyaSil(Path path) {

		try {
			System.out.println("Dosya siliniyor...");
			Files.deleteIfExists(path);

			System.out.println("Dosya silindi.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}
