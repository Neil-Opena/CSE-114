import java.util.*;
public class Patterm {
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a number for n:");
		int n = myScanner.nextInt();
		
		for(int i = 1;i <= n; i ++){
			System.out.print(i);
			for(int j = i - 1;j>0 ;j--){
				System.out.print(j);
			}
			System.out.println();
			
		}
		
	}
}
