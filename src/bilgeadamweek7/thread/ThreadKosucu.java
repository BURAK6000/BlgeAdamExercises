package bilgeadamweek7.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadKosucu extends Thread {

	String kosucuString;
	int mesafe;
	long sure;

	public ThreadKosucu(String kosucuString, int mesafe) {

		this.kosucuString = kosucuString;
		this.mesafe = mesafe;
	}

	@Override
	public void run() {

		System.out.println(kosucuString + " yarisa basladi.");

		long start = System.currentTimeMillis();

		for (int i = 0; i < mesafe; i++) {

			if ((i + 1) % 10 == 0) {
				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(kosucuString + " " + (i + 1) + " mesafesindedir.");
			}
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		sure = end - start;

		System.out.println(kosucuString + " adli kosucu 100 metreyi " + sure + " mili saniyede bitiriyor. ");

	}

	public static void main(String[] args) {

		yaris();

	}

	/*
	 * thread havuzu olusturma
	 */

	public static void yaris() {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			executorService.submit(new ThreadKosucu((i + 1) + ". kosucu", 100));

		}
		executorService.shutdown();

	}

}
