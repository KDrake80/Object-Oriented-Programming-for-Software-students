/*
 * Author Kevin Drake
 * Date 12/2/21
 * This Account class was Created for ass 9-7. I am now changing to add 2 subclasses Checking and Savings
 * for assignment 11-3
 */
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;

	public Account() {
		dateCreated = new java.util.Date();
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public java.util.Date getDate() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() { 
		double monthlyInterestRate = annualInterestRate / 100 / 12; 
		return monthlyInterestRate;
	}

	public double getMonthlyInterest() {
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
	}
	public void withdraw(double amount) {
		 balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	@Override
	public String toString() {
		return "Account was made on " + dateCreated + " and balance is " + getBalance()
			+ " Annual Interest rate is " + getAnnualInterestRate();
	}
}