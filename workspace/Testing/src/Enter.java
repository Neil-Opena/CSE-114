import java.util.*;
public class Enter {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			String readString = scanner.nextLine();
			if (readString.equals("")){
			    System.out.println("Enter Key pressed.");
			    break;
			} else{
				System.out.println(readString);
			}
		}

	}
}
