package bilgeadamweek7.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaksiThread implements Runnable {

	int taksiId;

	long beklemeSuresi;
	List<Integer> musteriNolariIntegers = new ArrayList<Integer>();

	long musteriSayisi;

	public TaksiThread(int taksiId) {
		Random random = new Random();

		this.taksiId = taksiId;
		this.beklemeSuresi = random.nextLong(1000, 5000);

	}

	@Override
	public void run() {

		while (!Durak.kuyruk.isEmpty()) {

			int musteriNo = Durak.kuyruk.poll();
			musteriNolariIntegers.add(musteriNo);
			System.out.println(taksiId + ". Taksi --> " + musteriNolariIntegers.size() + " musterisini aldi.");
		}

		try {
			Thread.sleep(beklemeSuresi);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		musteriSayisi = musteriNolariIntegers.size();

		System.out.println(taksiId + ". Taksisinin mesayisi sona erdi.");

	}

}
