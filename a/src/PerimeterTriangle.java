import java.util.*;

public class PerimeterTriangle {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter edge 1:");
		int edge1 = myScanner.nextInt();
		System.out.println("Enter edge 2:");
		int edge2 = myScanner.nextInt();
		System.out.println("Enter edge 3:");
		int edge3 = myScanner.nextInt();

		if (((edge1 + edge2) <= edge3) || ((edge2 + edge3) <= edge1) || ((edge1 + edge3) <= edge2)){
			System.out.println("INVALID");
		} else {
			System.out.println("Perimeter: " + (edge1 + edge2 + edge3));
		}

	}

}
