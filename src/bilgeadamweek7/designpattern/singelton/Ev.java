package bilgeadamweek7.designpattern.singelton;

public class Ev {

	public static void main(String[] args) {

		EvHalki evHalki = new EvHalki();

//		Robot robot1 = Robot.getInstance();
//
//		Robot robot2 = Robot.getInstance();
//
//		System.out.println(robot1);
//		System.out.println(robot2);

		Thread evHalki1 = new Thread(evHalki);
		Thread evHalki2 = new Thread(evHalki);

		evHalki1.start();
		evHalki2.start();

	}

}
