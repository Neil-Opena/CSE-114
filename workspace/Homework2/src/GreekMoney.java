import java.util.*;

public class GreekMoney {
	
	public static void main(String[] args){
		
		boolean notQuit = true;
		Scanner myScanner = new Scanner(System.in);
		
		while(notQuit){
			printInstructions();
			int choice = myScanner.nextInt();
			switch(choice){
				case (1):
					System.out.println("Enter number of talents:");
					int talents = myScanner.nextInt();
					System.out.println("Enter number of minae:");
					int minae = myScanner.nextInt();
					System.out.println("Enter number of drachmae:");
					int drachmae = myScanner.nextInt();
					System.out.println("Enter number of oboloi:");
					int oboloi = myScanner.nextInt();
					System.out.println(howManyOboloi(talents,minae,drachmae,oboloi) + " obolois");
					break;
				case (0):
					notQuit = false;
					break;
				default:
					System.out.println("Invalid choice (Enter an int)");
			}
			
		}
		
		System.out.println("Program successfully terminated");
		
	}
	
	public static int howManyOboloi(int talents, int minae, int drachmae, int oboloi){
		int totalMinae = (talents * 60) + minae;
		int totalDrachmae = (totalMinae * 70) + drachmae;
		int totalOboloi = (totalDrachmae * 6) + oboloi;
		return totalOboloi;
	}
	
	public static void printInstructions(){
		System.out.println("Press 1 to run the program");
		System.out.println("press 0 to quit the program");
		
	}
}
