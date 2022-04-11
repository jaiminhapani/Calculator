import java.util.Scanner;

/**
 * 
 */

/**
 * @author jaiminhapani
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstValue = 0, secondValue = 0;
		String inputOperation = "";
		String reset = "N";

		try (Scanner scan = new Scanner(System.in)) {

			do {
				System.out.print("Enter a first value : ");
				firstValue = scan.nextDouble();

				System.out.print("Enter a second value : ");
				secondValue = scan.nextDouble();

				System.out.print("Enter operation symbol that you want to use (+ , -, *, /, %, ^) : ");
				inputOperation = scan.next();

				double result = calculation(firstValue, secondValue, inputOperation);
				System.out.println("Result : " + result);

				System.out.println("Do you want to reset? Y/N");
				reset = scan.next();

				while (reset.equalsIgnoreCase("N")) {
					System.out.println("----------------------------------------------------------------------------");
					firstValue = result;
					System.out.print("Enter a second value : ");
					secondValue = scan.nextDouble();

					System.out.print("Enter operation symbol that you want to use (+ , -, *, /, %, ^) : ");
					inputOperation = scan.next();

					result = calculation(firstValue, secondValue, inputOperation);
					System.out.println("Result : " + result);

					System.out.println("Do you want to reset? Y/N");
					reset = scan.next();
				}
				System.out.println("\n============================================================================\n");
			} while (true);
		} catch (

		Exception e) {
			System.out.println("Error!");
		}

	}

	static double calculation(double firstValue, double secondValue, String inputOperation) {
		double result = 0;
		switch (inputOperation) {
		case "+":
			result = firstValue + secondValue;
			break;
		case "-":
			result = firstValue - secondValue;
			break;
		case "*":
			result = firstValue * secondValue;
			break;
		case "/":
			result = firstValue / secondValue;
			break;
		case "%":
			result = firstValue % secondValue;
			break;
		case "^":
			result = Math.pow(firstValue, secondValue);
			break;
		default:
			result = 0;
			System.out.println("Please use valid operation to perform");
		}
		return result;
	}

}
