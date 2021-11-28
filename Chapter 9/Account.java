/*
 * Author Kevin Drake
 * Date 11/25/21
 * This Program creates an Account object, with specific data variables. Then allows you to deposit, and withdraw. It will display the current
 *  balance, the current monthly interest, and date the "Account" was created.
 */
import java.util.*;
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private double monthlyInterestRate;
	
	public Account() {
	}
	public Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = (newId >= 0) ? newId : 0;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = (newBalance >= 0) ? newBalance : 0;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = (newAnnualInterestRate >= 0) ? newAnnualInterestRate : 0;
	}
	public Date getDate() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
	  return monthlyInterestRate = annualInterestRate / 100 / 12; 
	}
	public double getMonthlyInterest() {
		double monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}
	public double withdraw(double amount) {
		return balance -= amount;
	}
	public double deposit(double amount) {
		return balance += amount;
	}
	
	/** Test Program [MAIN Method] */
	public static void main(String[] args) {
		Account one = new Account(1122, 20000);
		one.setAnnualInterestRate(4.5);
		one.withdraw(2500);
		one.deposit(3000);
		System.out.printf("The current balance of the account is: $%.2f\n", one.balance);
		one.getMonthlyInterestRate();
		System.out.printf("The Monthly Interest will be $%.2f\n", one.getMonthlyInterest());
		System.out.println("The date the account was created was " + one.getDate());
	}
}