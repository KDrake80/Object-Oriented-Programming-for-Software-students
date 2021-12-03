/*
 * Author Kevin Drake
 * Date 12/2/21
 * This Class Defines Checking Accounts
 */
public class CheckingAccount extends Account {
		private double limit = 100.0;
		
	public CheckingAccount() {
		super();
	}
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	@Override
	public void withdraw(double amount) {
		if (amount < super.getBalance() + limit)
			super.withdraw(amount);
		else 
			System.out.println("Insufficient Funds!");
	}
	@Override
	public String toString() {
		return super.toString() + " and the overdraft limit is " + limit + ".";
	}
}
