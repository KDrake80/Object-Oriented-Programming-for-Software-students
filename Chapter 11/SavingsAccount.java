/*
 * Author Kevin Drake
 * Date 12/2/21
 * This Class Defines a Savings Account
 */
public class SavingsAccount extends Account {
	private double limit = 0;
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	@Override
	public void withdraw(double amount) {
		if (amount < super.getBalance())
			super.withdraw(amount);
		else 
			System.out.println("Insufficient Funds!");
	}
	@Override
	public String toString() {
		return super.toString() + " and cannot be overdrawn.";
	}
}
