package bilgeadamweek7.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Durak {

	List<TaksiThread> taksilerListesiList = new ArrayList<TaksiThread>();

	static Queue<Integer> kuyruk = new LinkedList<Integer>();

	public Durak() {
		this.kuyrukOlustur();
	}

	public void kuyrukOlustur() {

		for (int i = 1; i < 101; i++) {

			kuyruk.offer(i);

		}
	}

	public void taksiOlustur() {
		for (int i = 0; i < 11; i++) {

			taksilerListesiList.add(new TaksiThread(i));

		}
	}

	public void musteriAl() {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			executorService.submit(taksilerListesiList.get(i));

		}
		executorService.shutdown();
	}

	public static void main(String[] args) {

		Durak durak = new Durak();
		durak.taksiOlustur();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		durak.musteriAl();

	}

}
