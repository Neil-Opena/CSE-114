import java.util.*;
public class Temperatures {
	public static void main(String[] args){
		/*
		 I added a main method so that it will be easier to grade
		 The required methods are below the main method
		 */
		
		boolean notQuit = true;
		double fahrenheit, celsius,kelvin, rankine;
		
		printInstructions();
		while(notQuit){
			Scanner input = new Scanner(System.in);
			System.out.println("\n--------------------------------------------");
			System.out.print("Enter a choice: ");
			int choice = input.nextInt();
			input.nextLine(); // clear input buffer
			
			switch(choice){
			
				case(1):
					System.out.print("Fahrenheit to convert to Celsius: ");
					fahrenheit = input.nextDouble();
					celsius = fahrenheit2Celsius(fahrenheit);
					System.out.println("\n" + fahrenheit + "\u00b0 Fahrenheit = " + celsius + "\u00b0 Celsius");
					break;
				case(2):
					System.out.print("Fahrenheit to convert to Kelvin: ");
					fahrenheit = input.nextDouble();
					kelvin = fahrenheit2Kelvin(fahrenheit);
					System.out.println("\n" + fahrenheit + "\u00b0 Fahrenheit = " + kelvin + " Kelvin");
					break;
				case(3):
					System.out.print("Fahrenheit to convert to Rankine: ");
					fahrenheit = input.nextDouble();
					rankine = fahrenheit2Rankine(fahrenheit);
					System.out.println("\n" + fahrenheit + "\u00b0 Fahrenheit = " + rankine + "\u00b0 Rankine");
					break;
				case(4):
					System.out.print("Celsius to convert to Fahrenheit: ");
					celsius = input.nextDouble();
					fahrenheit = celsius2Fahrenheit(celsius);
					System.out.println("\n" + celsius + "\u00b0 Celsius = " + fahrenheit + "\u00b0 Fahrenheit");
					break;
				case(5):
					System.out.print("Celsius to convert to Kelvin: ");
					celsius = input.nextDouble();
					kelvin = celsius2Kelvin(celsius);
					System.out.println("\n" + celsius + "\u00b0 Celsius = " + kelvin + " Kelvin");
					break;
				case(6):
					System.out.print("Celsius to convert to Rankine: ");
					celsius = input.nextDouble();
					rankine = celsius2Rankine(celsius);
					System.out.println("\n" + celsius + "\u00b0 Celsius = " + rankine + "\u00b0 Rankine");
					break;
				case(7):
					System.out.print("Kelvin to convert to Fahrenheit: ");
					kelvin = input.nextDouble();
					fahrenheit = kelvin2Fahrenheit(kelvin);
					System.out.println("\n" + kelvin + " Kelvin = " + fahrenheit + "\u00b0 Fahrenheit");
					break;
				case(8):
					System.out.print("Kelvin to convert to Celsius: ");
					kelvin = input.nextDouble();
					celsius = kelvin2Celsius(kelvin);
					System.out.println("\n" + kelvin + " Kelvin = " + celsius + "\u00b0 Celsius");
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
		double celsius = (((fahrenheit) - 32) * (5.0/9));
		return celsius;
	}
	
	public static double fahrenheit2Kelvin(double fahrenheit){
		double kelvin = (((fahrenheit) + 459.67) * (5.0/9));
		return kelvin;
	}
	
	public static double fahrenheit2Rankine(double fahrenheit){
		double rankine = ((fahrenheit) + 459.67);
		return rankine;
	}
	
	public static double celsius2Fahrenheit(double celsius){
		double fahrenheit = (((celsius) * (9.0 / 5)) + 32);
		return fahrenheit;
	}
	
	public static double celsius2Kelvin(double celsius){
		double kelvin = ((celsius) + 273.15);
		return kelvin;
	}
	
	public static double celsius2Rankine(double celsius){
		double rankine = (((celsius) + 273.15) * (9.0/5));
		return rankine;
	}
	
	public static double kelvin2Fahrenheit(double kelvin){
		double fahrenheit = (((kelvin) * (9.0/5)) - 459.67);
		return fahrenheit;
	}
	
	public static double kelvin2Celsius(double kelvin){
		double celsius = ((kelvin) - 273.15);
		return celsius;
	}
}
