package bilgeadamweek7.thread;

public class RunnableOrnek implements Runnable {

	String name;

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(this.name + " " + (i + 1) + " kez calisiyor");

		}
	}

	public static void main(String[] args) {

		RunnableOrnek threadOlusturOrnek = new RunnableOrnek();

		Thread simpleThread3 = new Thread(threadOlusturOrnek);
		Thread simpleThread4 = new Thread(threadOlusturOrnek);

		simpleThread3.start();
		simpleThread4.start();

	}

}
