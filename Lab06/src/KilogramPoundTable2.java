
public class KilogramPoundTable2 {
	public static void main(String[] args){
		
		System.out.println("Kilograms    Pounds    Pounds    Kilograms");
		for(int i = 1,j=20;i<=199 || j<=515;i+=2,j+=5){
			
			System.out.print(i + "        " + String.format("%.2f",(i*2.2)));
			System.out.println("        " + j + "        " + String.format("%.2f", j/2.2));
		}
		
	}
}
