package bilgeadamweek7.designpattern.singelton;

public class Robot {

	private static Robot instanceRobot = null;

	private Robot() {

	}

	public static Robot getInstance() {

		if (instanceRobot == null)

			instanceRobot = new Robot();

		return instanceRobot;

	}

	public void calis() {
		System.out.println(hashCode() + " ----> robot calisiyor. ");
	}

}
