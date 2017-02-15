import java.util.*;
public class DivisibleBy {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = myScanner.nextInt();
		System.out.print("Is " + number + " divisible by 5 and 6? ");
		if((number % 5 == 0) && (number % 6 ==0)){
			System.out.println("true");
		} else{
			System.out.println("false");
		}
		
		System.out.print("Is " + number + " divisible by 5 or 6? ");
		if((number % 5 == 0) || (number % 6 == 0)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		System.out.print("Is " + number + " divisible by 5 or 6, but not both? ");
		if((number % 5 == 0) ^ (number % 6 == 0)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
