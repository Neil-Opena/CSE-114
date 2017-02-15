import java.util.*;
public class NumberOdd {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number to check if it is odd: ");
		int number = myScanner.nextInt();
		System.out.print("Is " + number + " odd? ");
		if(number % 2 == 1){
			System.out.println("true");
		} else{
			System.out.println("false");
		}
	}
}
