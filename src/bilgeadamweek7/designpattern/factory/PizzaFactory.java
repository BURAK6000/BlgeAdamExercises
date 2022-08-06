package bilgeadamweek7.designpattern.factory;

public class PizzaFactory {

	public static Pizza getPizza(EPizzaTur tur, EPizzaBoyut boyut, EPizzaHamurTuru hamurTuru) throws Exception {

		switch (tur) {
		case VEGAN:
			return new VeganPizza(tur, boyut, hamurTuru);
		case TAVUKLU:
			return new VeganPizza(tur, boyut, hamurTuru);
		default:
			throw new Exception("Boyle bir pizza turu bulunmamaktadir");
		}
	}

}
