
public class Employee extends Person {

	private int office_number;
	private int salary;
	private MyDate date_hired;

	public Employee(String name, String address, String phone_number, String email_address, int office_number,
			int salary, MyDate date_hired) {
		super(name, address, phone_number, email_address);
		this.office_number = office_number;
		this.salary = salary;
		this.date_hired = date_hired;
	}

	public int getOfficeNumber() {
		return office_number;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public MyDate getDateHired(){
		return date_hired;
	}
	
	public String toString(){
		return "Office: " + this.getOfficeNumber() + "\n" + super.toString();
	}
}
