package bilgeadamweek7.fileornek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {

		String path = "C:\\Users\\user\\eclipse-workspace\\Examples\\src\\bilgeadamweek7\\fileornek\\fileornek1.txt";
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(path, true);

			FileInputStream fileInputStream = new FileInputStream(path);

			try {
				fileOutputStream.write(65);
				byte[] array = { 101, 12, 12, 46 };
				fileOutputStream.write(array);

				System.out.println(fileInputStream.read());

				int deger;
				while ((deger = fileInputStream.read()) != -1) {
					System.out.println((char) deger);
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
