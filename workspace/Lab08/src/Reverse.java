import java.util.*;
public class Reverse {

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer to print in reverse order:");
		int num = myScanner.nextInt();
		
		reverse(num);
		
	}
	
	public static void reverse(int number){
		String intConverted = "" + number + "";
		String intReversed = "";
		for(int i = intConverted.length()-1; (i >= 0 );i--){
			intReversed += intConverted.charAt(i);
			
		}
		
		System.out.print(intReversed);
		
		
	}
	
	
}
