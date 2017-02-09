import java.util.*;
public class Payroll {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		input.nextLine();
		
		double grossSalary = hours * payRate;
		double federalTax = grossSalary * .2;
		double stateTax = grossSalary * .09;
		
		System.out.println("==========================================================");
		System.out.println("Employee name: " + name);
		System.out.println("Gross salary: $" + String.format("%.2f",grossSalary));
		System.out.println("Federal tax withholding (20%) = $" + String.format("%.2f",federalTax));
		System.out.println("State tax withholding (9%) = $" + String.format("%.2f",stateTax));
		System.out.println("Net pay: $" + String.format("%.2f", grossSalary - federalTax - stateTax));
		
	}
}
