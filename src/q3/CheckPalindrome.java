package q3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class CheckPalindrome {

	private static final Logger logger = Logger.getLogger(CheckPalindrome.class.getName());

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		logger.info("Enter a number");
		try {
			int number = scanner.nextInt();
			checkPalindrome(number);
		} catch (InputMismatchException ex) {
			throw new InvalidFormatException("Please input nos only");
		} catch (Exception ex) {
			logger.info(ex.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void checkPalindrome(int no) {

	}
}
