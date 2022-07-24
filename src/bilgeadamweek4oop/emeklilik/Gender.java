package bilgeadamweek4oop.emeklilik;

public enum Gender {

	man(1, "erkek"), woman(2, "kadın");

	private int no;
	private String name;

	private Gender(int no, String name) {
		this.name = name;
		this.no = no;

	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

}
