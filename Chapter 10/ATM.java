/*
 * Author Kevin Drake
 * Date 11/30/21
 * This creates an ATM program that will create 10 accounts in an array. It uses the account class from assignment 9-7.
 */
import java.util.*;
public class ATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
			accounts[i].getId();
		}
		Account main = getAccount(accounts);
		choose(accounts, main);
	}
	public static Account getAccount(Account[] accounts) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = input.nextInt();
		if (id >= 10) {
			System.out.println("Enter a valid ID #: ");
			id = input.nextInt();
		}
		Account main = accounts[id];
		return main;
	}
	public static Account choose(Account[] accounts, Account main) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nAccount ID # is: " + main.getId());
		System.out.println("Main Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.println("Enter your Choice: ");
		int choice = input.nextInt();
		
		if (choice == 1) {
			System.out.printf("The current account balance is " + main.getBalance());
			choose(accounts, main);
		}
		else if (choice == 2) {
			System.out.println("Enter an Amount to withdraw: ");
			double w = input.nextDouble();
			main.withdraw(w);
			choose(accounts, main);
		}
		else if (choice == 3) {
			System.out.println("Enter an Amount to deposit: ");
			double d = input.nextDouble();
			main.deposit(d);
			choose(accounts, main);
		}
		else if (choice == 4) {
			main = getAccount(accounts);
			choose(accounts, main);
		}
		else {
			System.out.println("Invalid Entry!");
			choose(accounts, main);
		}
		return main;
	}
}