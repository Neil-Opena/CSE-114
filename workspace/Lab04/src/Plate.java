import java.util.*;
public class Plate {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		boolean notQuit = true;
		System.out.println("Press '1' to generate a plate, 'any other number' to quit: ");
		while(notQuit){
			int response = input.nextInt();
			input.nextLine();
			
			if(response == 1){
				
				System.out.println("Generating...");
				String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				int numbers = (int)(Math.random()*10000);
				String selectedLetters = "";
				for(int i = 0;i<3;i++){
					selectedLetters += letters.charAt((int)(Math.random()*26));
				}
				System.out.println(selectedLetters + numbers);
			} else{
				notQuit = false;
			}
		}
		
		System.out.println("Successfully exited program");
		
	}
}
