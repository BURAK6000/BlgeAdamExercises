package bilgeadamweek5.collections.stack;

import java.util.Random;

public class Tabak {
	int id;
	boolean isKirli;

	public Tabak() {
		Random random = new Random();
		this.isKirli = random.nextBoolean();
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", isKirli=" + isKirli + "]";
	}

}
