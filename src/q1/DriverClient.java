package q1;

import java.util.logging.Logger;

public class DriverClient {

	private static final Logger logger = Logger.getLogger(DriverClient.class.getName());

	public static void main(String[] args) {
		int age = 17;
		if (age <= 18) {
			throw new NotEligibleException("Not eligible to vote");
		} else {
			logger.info("eligible to vote");
		}

	}

}
