import java.util.*;
public class Animals {
	public static void main(String[] args){
		/*
		 * I added a main method, and a scanner to make testing this program easier
		 */
		Scanner myScanner = new Scanner(System.in);
		boolean notQuit = true;
		
		
		while(notQuit){
			printInstructions();
			int response = myScanner.nextInt();
			myScanner.nextLine(); // clear input buffer
			
			switch(response){
				case (1):
					System.out.print("Enter the budget: ");
					double budget = myScanner.nextDouble();
					myScanner.nextLine();
					
					System.out.print("Enter the number of dogs: ");
					int numDogs = myScanner.nextInt();
					myScanner.nextLine();
					
					System.out.print("Enter the number of cats: ");
					int numCats = myScanner.nextInt();
					myScanner.nextLine();
					
					double price = pricePerCat(budget,numDogs,numCats);
					System.out.println("\n$" + price + " per cat");
					break;
				case(0):
					notQuit = false;
					break;
				default:
					System.out.println("Unknown response (Enter an integer)");
					printInstructions();
			
			}
			
		}
		
		System.out.println("Program quit successfully");
	}
	
	public static double pricePerCat(double budget, int dogs, int cats){
		int ratio = (dogs * 3) + cats;
		double priceEach = budget/ratio;
		return priceEach;
	}
	
	public static void printInstructions(){
		System.out.println("==============================================");
		System.out.println("Enter 1 to run pricePerCat method again");
		System.out.println("Enter 0 to quit");
	}
}
