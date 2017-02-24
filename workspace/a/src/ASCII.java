import java.util.*;
public class ASCII {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code (0-127): ");
		char myChar = (char)input.nextInt();
		System.out.println(myChar);
	}
}
