import java.util.*;
public class Multiples {
	
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter one number:");
		int num1 = stdin.nextInt();
		System.out.print("Enter a second number:");
		int num2 = stdin.nextInt();
		
		if(isMultiple(num1, num2)){
			System.out.println(num2 + " is a multiple of " + num1);
		}else{
			System.out.println(num2 + " is not a multiple of " + num1);
		}
		
		boolean notQuit = true;
		while(notQuit){
			System.out.print("Do you want to enter another pair(y/n)?");
			char response = stdin.next().charAt(0);
			if(response == 'n'){
				notQuit = false;
				break;
			}
			
			System.out.print("Enter one number:");
			num1 = stdin.nextInt();
			System.out.print("Enter a second number:");
			num2 = stdin.nextInt();
			
			if(isMultiple(num1, num2)){
				System.out.println(num2 + " is a multiple of " + num1);
			}else{
				System.out.println(num2 + " is not a multiple of " + num1);
			}
			
		}
	}
	
	public static boolean isMultiple(int first, int second){
		if(second % first == 0)
			return true;
		return false;
	}
	
	
}

