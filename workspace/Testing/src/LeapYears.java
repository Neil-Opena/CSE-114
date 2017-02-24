import java.util.*;

public class LeapYears {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		int total = 0;
		System.out.print("Enter the starting year:");
		int startYear = myScanner.nextInt();
		System.out.print("Enter the ending year:");
		int endYear = myScanner.nextInt();

		for (int j = startYear; j <= endYear; j++) {
			if (j % 4 == 0) {
				System.out.print(j + " ");
				total++;
				if(total % 10 == 0){
					System.out.println();
				}
			} 
			
		} System.out.println("\nThere were " + total + " leap years from " + startYear + " to " + endYear);
		

	}

}
