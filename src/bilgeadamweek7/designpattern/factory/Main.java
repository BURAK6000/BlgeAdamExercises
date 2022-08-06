package bilgeadamweek7.designpattern.factory;

public class Main {

	public static void main(String[] args) {

		try {
			Pizza pizza = PizzaFactory.getPizza(EPizzaTur.VEGAN, EPizzaBoyut.ORTA, EPizzaHamurTuru.INCE);
			Pizza pizza1 = PizzaFactory.getPizza(EPizzaTur.VEGAN, EPizzaBoyut.BUYUK, EPizzaHamurTuru.KALIN);
			Pizza pizza2 = PizzaFactory.getPizza(EPizzaTur.TAVUKLU, EPizzaBoyut.ORTA, EPizzaHamurTuru.INCE);
			Pizza pizza3 = PizzaFactory.getPizza(EPizzaTur.TAVUKLU, EPizzaBoyut.KUCUK, EPizzaHamurTuru.KALIN);

			System.out.println("1. pizza--> " + pizza);
			System.out.println("2. pizza--> " + pizza1);
			System.out.println("3. pizza--> " + pizza2);
			System.out.println("4. pizza--> " + pizza3);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
