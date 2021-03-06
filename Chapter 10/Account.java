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
		private Date dateCreated;
		
		public Account() {
		}
		public Account(int newId, double newBalance){
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
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
			balance = newBalance;
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
		double monthlyInterestRate = annualInterestRate / 100 / 12; 
		return monthlyInterestRate;
		}
		
		public double getMonthlyInterest() {
			double monthlyInterest = balance * getMonthlyInterestRate();
			return monthlyInterest;
		}
		public double withdraw(double amount) {
			return balance -= amount;
		}
		public double deposit(double amount) {
			return balance += amount;
		}
}
