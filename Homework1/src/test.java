import java.util.*;
public class test {
	public static void main(String[] args){
		int x = 21;
		int y = 6;
		int z = 11;
		int min;
		
		if((x < y) && (x < z))
			min = x;
		else if((y < x) && (y < z))
			min = y;
		else
			min = z;
		
		System.out.print(min);
	}
}
