package q2;

import java.util.Scanner;
import java.util.logging.Logger;

public class DriverClient {

	private static final Logger logger = Logger.getLogger(DriverClient.class.getName());

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			logger.info("Enter a number");
			int n = scanner.nextInt();

			int x = n + (n * 50) / 100;
			int y = x + (x * 30) / 100;

			if (y < 2 * n) {
				logger.info("output is " + y);
			}

			y = x + (x * 35) / 100;

			if (y > 2 * n) {
				throw new NotDesiredOutputException("not desired output");
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
		} finally {
			scanner.close();
		}

	}

}
