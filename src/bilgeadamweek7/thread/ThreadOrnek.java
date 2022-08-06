package bilgeadamweek7.thread;

public class ThreadOrnek extends Thread {

	String nameString;

	public ThreadOrnek(String name) {
		this.nameString = name;

	}

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(this.nameString + " " + (i + 1) + " kez calisiyor");

		}
	}

	public static void main(String[] args) {

		ThreadOrnek threadOrnek = new ThreadOrnek("burak");
		ThreadOrnek threadOrnek1 = new ThreadOrnek("halil");

		threadOrnek.start();
		threadOrnek1.start();

	}

}
