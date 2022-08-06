package bilgeadamweek7.designpattern.singelton;

public class EvHalki implements Runnable {

	public void robotCagir() {

		Robot.getInstance().calis();
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);

			Robot.getInstance().calis();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
