package bilgeadamweek7.etut;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Manager {

	Kutuphane kutuphane;

	public Manager() {

		kutuphane = new Kutuphane();

	}

	public void veriTabaniOlustur() {

		BufferedWriter bufferedWriter = null;

		try {
			bufferedWriter = new BufferedWriter(new FileWriter(File.kontrolPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Kontrol() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(File.kontrolPath));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String deger = "";

		try {
			deger = reader.readLine();

		} catch (

		Exception e) {
			// TODO: handle exception
		}
	}

	public void okuma(String path) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));

			String deger = "";

			try {
				while ((deger = reader.readLine()) != null) {
					String[] array = deger.split(",");

					Kitap kitap = new Kitap(array[0], array[1], array[2]);

					kutuphane.getKitapListesi().add(kitap);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			System.out.println(e.toString());
		}

	}

	public void serilestirme(Kitap kitap) {
		ObjectOutputStream objectOutputStream;

		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(File.ikinciDegerOkumaPath, true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deserialize() {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(File.ikinciDegerOkumaPath));

			Kitap kitap;

			try {

				while ((kitap = (Kitap) objectInputStream.readObject()) != null) {

				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Manager manager = new Manager();

		File file = new File();

		manager.okuma(file.ilkDegerOkumaPath);

		manager.kutuphane.getKitapListesi().forEach(System.out::println);

	}

}
