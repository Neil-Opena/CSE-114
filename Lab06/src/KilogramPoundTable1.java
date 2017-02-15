
public class KilogramPoundTable1 {
	public static void main(String[] args){
		System.out.println("Kilograms    Pounds");
		for(int i = 1;i<=199;i+=2){
			System.out.println(i + "        " + String.format("%.1f",(i*2.2)));
		}
	}
}
