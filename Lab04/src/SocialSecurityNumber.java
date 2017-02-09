import java.util.*;
public class SocialSecurityNumber {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("(Valid Social Security Number: ###-##-###)");
		System.out.println("Enter a valid Social Security Number: ");
		
		String ssn = myScanner.nextLine();
		
		if((ssn.charAt(3) == '-') && (ssn.charAt(6) == '-') && ssn.length() == 10){
			int counter = 0;
			for(int i = 0;i<ssn.length();i++){
				if((ssn.charAt(i) == '1')||(ssn.charAt(i) == '2')||(ssn.charAt(i) == '3')||(ssn.charAt(i) == '4')||(ssn.charAt(i) == '5')||(ssn.charAt(i) == '6')||(ssn.charAt(i) == '7')||(ssn.charAt(i) == '8')||(ssn.charAt(i) == '9')){
					counter+=1;
				}
			}
			
			if(counter == 8){
				System.out.println(ssn + " is a valid Social Security Number");
			} else{
				System.out.println(ssn + " is an invalid Social Security Number");
			}
			
		} else{
			System.out.println(ssn + " is an invalid Social Security Number");
		}
		
	}
}
