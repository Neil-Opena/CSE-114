import java.util.*;
public class Temperatures {
	public static void main(String[] args){
		/*
		 I added a main method so that it will be easier to grade
		 The required methods are below the main method
		 */
		
		
		boolean notQuit = true;
		printInstructions();
		while(notQuit){
			Scanner input = new Scanner(System.in);
			System.out.println("\n--------------------------------------------");
			System.out.print("Enter a choice: ");
			int choice = input.nextInt();
			input.nextLine(); // clear input buffer
			
			switch(choice){
				case(1):
					System.out.print("Fahrenheit to convert to celsius: ");
					double fahrenheit = input.nextDouble();
					double celsius = fahrenheit2Celsius(fahrenheit);
					System.out.println("\n" + fahrenheit + "\u00b0 Fahrenheit = " + celsius + "\u00b0 Celsius");
					break;
				case(2):
					
					break;
				case(3):
					
					break;
				case(4):
					
					break;
				case(5):
					
					break;
				case(6):
					
					break;
				case(7):
					
					break;
				case(8):
					
					break;
				case(0):
					notQuit = false;
					break;
				default:
					System.out.println("Invalid choice, try again");
				
			}
			
			
		}
		System.out.println("Successfully exited");
		
	}
	
	public static void printInstructions(){
		System.out.println("Enter 1 - to convert fahrenheit to celsius");
		System.out.println("Enter 2 - to convert fahrenheit to kelvin");
		System.out.println("Enter 3 - to convert fahrenheit to rankine");
		System.out.println("Enter 4 - to convert celsius to fahrenheit");
		System.out.println("Enter 5 - to convert celsius to kelvin");
		System.out.println("Enter 6 - to convert celsius to rankine");
		System.out.println("Enter 7 - to convert kelvin to fahrenheit");
		System.out.println("Enter 8 - to convert kelvin to celsius");
		
		System.out.println("Enter 0 - to quit");
		;
		
	}
	
	public static double fahrenheit2Celsius(double fahrenheit){
		double celsius = 0d;
		return celsius;
	}
	
	public static double fahrenheit2Kelvin(double fahrenheit){
		return 0.0d;
	}
	
	public static double fahrenheit2Rankine(double fahrenheit){
		return 0.0d;
	}
	
	public static double celsius2Fahrenheit(double celsius){
		return 0.0d;
	}
	
	public static double celsius2Kelvin(double celsius){
		return 0.0d;
	}
	
	public static double celsius2Rankine(double celsius){
		return 0.0d;
	}
	
	public static double kelvin2Fahrenheit(double kelvin){
		return 0.0d;
	}
	
	public static double kelvin2Celsius(double kelvin){
		return 0.0d;
	}
}
