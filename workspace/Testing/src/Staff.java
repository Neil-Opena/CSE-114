
public class Staff extends Employee {

	private String title;

	public Staff(String name, String address, String phone_number, String email_address, int office_number, int salary,
			MyDate date_hired, String title) {
		super(name, address, phone_number, email_address, office_number, salary, date_hired);
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String toString(){
		return "Staff: " + super.getName() + "\nSalary: $" + super.getSalary() + "\nDate Hired: " + super.getDateHired().getDate() + "\n\n"  + super.toString();
	}

}
