package bilgeadamweek5.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDeneme {
	public static void main(String[] args) throws InterruptedException {
		QueueDeneme queueDeneme = new QueueDeneme();
		queueDeneme.ramazanPideKuyrugu();
	}

	public void ramazanPideKuyrugu() throws InterruptedException {
		Random random = new Random();
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Kisi1");
		queue.offer("Kisi2");
		queue.offer("Kisi3");
		queue.offer("Kisi4");
		queue.offer("Kisi5");
		queue.offer("Kisi6");
		queue.offer("Kisi7");
		queue.offer("Kisi8");
		queue.offer("Kisi9");
		queue.offer("Kisi10");
		queue.offer("Kisi11");
		queue.offer("Kisi12");
		int pideSayisi = 1 + random.nextInt(10);

		queue.forEach(q -> System.out.println(q));

		System.out.println("========== Pide Alabilenler =========");

		while (pideSayisi != 0) {
			System.out.println(queue.poll());
			pideSayisi--;
			Thread.sleep(1000);

		}

		System.out.println("========== Pide Alamayanlar =========");

		queue.forEach(q -> System.out.println(q));
	}

}
