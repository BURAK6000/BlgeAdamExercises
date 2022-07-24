package bilgeadamweek5.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOncelikli implements Comparable<QueueOncelikli> {
	String adString;
	String sikayetString;

	public QueueOncelikli(String adString, String sikayetString) {
		super();
		this.adString = adString;
		this.sikayetString = sikayetString;

	}

	@Override
	public int compareTo(QueueOncelikli o) {
		if (o.sikayetString.equalsIgnoreCase("Apandist"))
			return 1;
		else if (o.sikayetString.equalsIgnoreCase("Bas agrisi")) {
			return -1;
		}
		return 0;

	}

	@Override
	public String toString() {
		return "QueueOncelikli [adString=" + adString + ", sikayetString=" + sikayetString + "]";
	}

	public static void main(String[] args) {
		Queue<QueueOncelikli> hastaSirasi = new PriorityQueue<>();
		hastaSirasi.offer(new QueueOncelikli("2", "yanik"));
		hastaSirasi.offer(new QueueOncelikli("3", "yanik"));
		hastaSirasi.offer(new QueueOncelikli("4", "apandist"));
		hastaSirasi.offer(new QueueOncelikli("5", "bas agrisi"));
		hastaSirasi.offer(new QueueOncelikli("6", "apandist"));
		hastaSirasi.offer(new QueueOncelikli("1", "apandist"));
		hastaSirasi.offer(new QueueOncelikli("7", "yanik"));
		hastaSirasi.offer(new QueueOncelikli("8", "apandist"));
		hastaSirasi.offer(new QueueOncelikli("9", "apandist"));
		hastaSirasi.offer(new QueueOncelikli("10", "bas agrisi"));
		hastaSirasi.offer(new QueueOncelikli("11", "bas agrisi"));
		hastaSirasi.offer(new QueueOncelikli("12", "bas agrisi"));
		hastaSirasi.offer(new QueueOncelikli("13", "bas agrisi"));

		while (hastaSirasi.isEmpty() == false) {

			System.out.println(hastaSirasi.poll());
		}
	}

}
