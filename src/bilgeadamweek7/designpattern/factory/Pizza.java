package bilgeadamweek7.designpattern.factory;

import java.util.UUID;

public abstract class Pizza {

	private String productId;
	private EPizzaTur tur;
	private EPizzaBoyut boyut;
	private EPizzaHamurTuru hamurTuru;

	public Pizza(EPizzaTur tur, EPizzaBoyut boyut, EPizzaHamurTuru hamurTuru) {
		super();
		this.tur = tur;
		this.productId = UUID.randomUUID().toString();
		this.boyut = boyut;
		this.hamurTuru = hamurTuru;

	}

	@Override
	public String toString() {
		return "Pizza [productId=" + productId + ", tur=" + tur + ", boyut=" + boyut + ", hamurTuru=" + hamurTuru + "]";
	}

	public EPizzaTur getTur() {
		return tur;
	}

	public void setTur(EPizzaTur tur) {
		this.tur = tur;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public EPizzaBoyut getBoyut() {
		return boyut;
	}

	public void setBoyut(EPizzaBoyut boyut) {
		this.boyut = boyut;
	}

	public EPizzaHamurTuru getHamurTuru() {
		return hamurTuru;
	}

	public void setHamurTuru(EPizzaHamurTuru hamurTuru) {
		this.hamurTuru = hamurTuru;
	}

}
