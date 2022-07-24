package bilgeadamweek5.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {

	public static void main(String[] args) {
		QueueMusteri queueMusteri;

		Queue<QueueMusteri> bankaSırasi = new PriorityQueue<QueueMusteri>();
		bankaSırasi.offer(new QueueMusteri("kisi1", 66));
		bankaSırasi.offer(new QueueMusteri("kisi2", 12));
		bankaSırasi.offer(new QueueMusteri("kisi3", 45));
		bankaSırasi.offer(new QueueMusteri("kisi4", 76));
		bankaSırasi.offer(new QueueMusteri("kisi5", 17));
		bankaSırasi.offer(new QueueMusteri("kisi6", 76));
		bankaSırasi.offer(new QueueMusteri("kisi7", 32));
		bankaSırasi.offer(new QueueMusteri("kisi8", 6));
		bankaSırasi.offer(new QueueMusteri("kisi9", 45));
		bankaSırasi.offer(new QueueMusteri("kisi10", 90));

		while (bankaSırasi.isEmpty() == false) {

			System.out.println(bankaSırasi.poll());
		}

	}

}
