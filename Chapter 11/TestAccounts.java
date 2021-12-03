/*
 * Author Kevin Drake
 * Date 12/2/21
 * This class tests both subclasses and superclass for Accounts
 */
public class TestAccounts {
	public static void main(String[] args) {
		Account one = new Account(1, 100);
		CheckingAccount two = new CheckingAccount(2, 200);
		SavingsAccount three = new SavingsAccount(3, 300);
		one.setAnnualInterestRate(4.5);
		two.setAnnualInterestRate(4.5);
		three.setAnnualInterestRate(4.5);
	
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
		System.out.println("Checking balance is: " + two.getBalance());
		System.out.println("Savings Balance is: " + three.getBalance());
		two.withdraw(250);
		System.out.println("Checking new balance is: " + two.getBalance());
		System.out.println("Trying to Overdraft Savings");
		three.withdraw(301);
		two.withdraw(51);
		
	}
}
