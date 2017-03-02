import java.util.*;
public class PrintingDistinctNumbers {

	public static void main(String[] arg){
		
		Scanner myScanner = new Scanner(System.in);
		int[] myArray = new int[10];
		int counter = 0;
		int[] newArray = new int[10];

		for(int i = 0; i <= 9; i++){
			System.out.print("Enter an integer to store: ");
			int temp = myScanner.nextInt();
			if(checkNew(temp, myArray)){
				myArray[i] = temp;
				newArray[counter] = temp;
				counter++;
			}
		}
		

		printElements(myArray);
		System.out.println();
	
		printElements(newArray);
		int[] finalArray = new int[counter];
		for(int i = 0; i < finalArray.length; i++){
			finalArray[i] = newArray[i];
		}
		
		System.out.println();
		printElements(finalArray);
	}
	
	public static void printElements(int[] arr){
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static boolean checkNew(int val, int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == val)
				return false;
		}
		
		return true;
	}
	
}
