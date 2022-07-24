package bilgeadamweek5.collections.queue;

public class QueueMusteri implements Comparable<QueueMusteri> {

	String adString;
	int yas;

	public QueueMusteri(String adString, int yas) {
		super();
		this.adString = adString;
		this.yas = yas;

	}

	@Override
	public String toString() {
		return "QueueMusteri [adString=" + adString + ", yas=" + yas + "]";
	}

	@Override

	public int compareTo(QueueMusteri musteri) {
		if (musteri.yas > 40) {
			return 1;
		} else if (40 > musteri.yas) {
			return -1;

		} else {
			return 0;
		}

	}

}
