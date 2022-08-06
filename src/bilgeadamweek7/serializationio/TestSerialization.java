package bilgeadamweek7.serializationio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class TestSerialization {

	public static void main(String[] args) {

		Ogrenci ogrenci = new Ogrenci("Ali", LocalDate.of(2000, 12, 12));

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("test1111111.txt");

			ObjectOutputStream yazObjectOutputStream = null;

			try {
				yazObjectOutputStream = new ObjectOutputStream(fileOutputStream);

				yazObjectOutputStream.writeObject(ogrenci);

				System.out.println("Serilestirme basarili");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

		}

		try {
			FileInputStream file2 = new FileInputStream("test1111111.txt");

			try {
				ObjectInputStream okuInputStream = new ObjectInputStream(file2);

				try {
					Ogrenci ogrenci2 = (Ogrenci) okuInputStream.readObject();

					System.out.println(ogrenci2);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
