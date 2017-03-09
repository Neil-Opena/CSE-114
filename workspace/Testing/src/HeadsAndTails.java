import java.util.*;

public class HeadsAndTails {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer representing the state of the coins:");
		int state = myScanner.nextInt();

		int[][] coins = new int[3][3];
		
		int[] binary = new int[9];
		int temp = state;
		int i = 0;
		while(temp > 0){
			int rem = temp % 2;
			temp = temp / 2;
			binary[i] = rem;
			i++;
		}
		
		int[] reverse = new int[9];
		for(int j = reverse.length - 1, k = 0; j >= 0; j--, k++){
			reverse[j] = binary[k];
		}
		
		for(int j = 0; j < reverse.length; j++){
			System.out.print(reverse[j] + " ");
		}System.out.println();
		int num = 0;
		for(int j = 0; j < coins.length; j++){
			for(int b = 0; b < coins[j].length; b++){
				if(num < reverse.length){
					coins[j][b] = reverse[num];
					num++;
				}
			}
		}

		for (int x = 0; x < coins.length; x++) {
			for (int z = 0; z < coins[x].length; z++) {
				if (coins[x][z] == 0 && z < 2)
					System.out.print("H ");
				else if (coins[x][z] == 0)
					System.out.print("H");
				else if (coins[x][z] == 1 && z < 2)
					System.out.print("T ");
				else
					System.out.print("T");

			}
			System.out.println();
		}

	}
}