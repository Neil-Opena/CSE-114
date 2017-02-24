import java.util.*;

public class Part1 {

	public static void main(String[] args) {
		boolean notQuit = true;
		Scanner myScanner = new Scanner(System.in);
		int sum = 0, negativeNums = 0, positiveNums = 0;

		while (notQuit) {
			printInstructions();
			int inputValue = myScanner.nextInt();

			switch (inputValue) {
				case (0):
					notQuit = false;
					break;
				default:
					sum += inputValue;
					if (inputValue < 0) {
						negativeNums++;
					} else {
						positiveNums++;
					}
					break;
			}
		}

		double average = ((double) sum) / (negativeNums + positiveNums);
		System.out.println("================================");
		System.out.println(positiveNums + " positive values");
		System.out.println(negativeNums + " negative values");
		System.out.println("\nAverage: " + average);

	}

	public static void printInstructions() {
		System.out.println("Enter any integer to read in (0) to quit: ");
	}

}
