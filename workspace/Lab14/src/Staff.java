
public class Staff extends Employee {
	private String title;
	public Staff(String b, String bruh, double nah, MyDate c, String d, String e, String f, int z, String g) {
		super(bruh, nah, c, d, e, f, z, g);
		title = b;
	}
	
	public String toString(){
		return super.toString() + " title: " + title;
	}
}
