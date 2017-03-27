import java.util.Calendar;

/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

public class Account {
	private int id = 0;
	private double balance = 1000;
	private double annualInterestRate = 4.50;
	private java.util.Date dateCreated;
	
	public Account(){
		dateCreated = new java.util.Date();
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public void withDraw(double amount){
		if(amount >= balance){
			System.out.println("Not enough money");	
		}else{
			balance -= amount;
		}
	}
	
	public void deposit(double amount){
		balance += amount;
	}
}
