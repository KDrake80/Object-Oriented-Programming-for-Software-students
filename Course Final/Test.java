/*
 * Author Kevin Drake
 * Date 12/15/21
 * This is the Test Class that Allows you to Create an Account. Add Items to that Account, browse
 * other account's items Select an Item, and move the Item from one Account to Another.
 */
import java.util.*;
public class Test {
	public static void main(String[] args) {
		/** Creating Test Accounts and Items */
		Account tom = new Account("Tom Jenkins");
		tom.addNewItem("Recliner Chair", "Dark Brown Leather, Footrest", 30.00);
		tom.addNewItem("Lava Lamp", "Very Sentimental, Needs new Light-Bulb", 10.00);	
		Account sarah = new Account("Sarah Jenkins");
		sarah.addNewItem("Childrens Bed Sheets", "Dino Print, 4 years old", 20.00);
		sarah.addNewItem("Knife Block", "Black and gray, Includes all original knives, scissors, and knife sharpener", 45.00);
		sarah.addNewItem("Colored Wax Skull Candles", "HANDMADE! Limited Supplies", 30.00);
		Account jim = new Account("Jim Stevens");
		jim.addNewItem("Compound Hunting Bow", "Used one time, Accepting Offers, Black and Green", 950.00);
		jim.addNewItem("Kawasaki Snowmobile", "Never been used, No Repair History, Engine sounds great", 3250.00);
		jim.addNewItem("Nail Gun", "A little Wear and tear, Orange Black, accepting Best Offer", 55.00);
		jim.addNewItem("King Sized Mattress", "!!BARELY USED!!", 1000.00);
		
		/** Create Client Account */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name ");
		String accountName = input.nextLine();
		Account client = new Account(accountName);
		String choice = "";
		/** Prompt User to Choose what To Do with Account*/
		while (!choice.equalsIgnoreCase("Exit")) {
			System.out.println("Type: \n'New' to add a new item to your account \n'View' to view your Account \n" + 
					"'Browse' to see what Other User's are selling \n'Exit' to exit");
				choice = input.nextLine();
				/** Prompt User to Enter Item Information */
			if (choice.equalsIgnoreCase("New")) {
				System.out.println("Enter the Item Name");
				String itemName = input.nextLine();
				System.out.println("Enter short Description of item");
				String d = input.nextLine();
				System.out.println("Enter the price");
				String p = input.nextLine();
				double price = Double.parseDouble(p);
				client.addNewItem(itemName, d, price);
			}
			/** Display User Account Information */
			else if(choice.equalsIgnoreCase("View")) {
				System.out.println(client.toString());
				client.printItemList();
			}
			/** Display Other Accounts, and process the 'Purchase'*/ 
			else if (choice.equalsIgnoreCase("Browse")) {
				System.out.println(tom.toString());
				System.out.println(sarah.toString());
				System.out.println(jim.toString());
				System.out.println("Which Account to Look at Tom, Sarah, Jim?");
				String cName = input.nextLine();
				if (cName.equalsIgnoreCase("Tom")) 
					buy(tom, client);
				else if (cName.equalsIgnoreCase("Sarah"))
					buy(sarah, client);
				else if (cName.equalsIgnoreCase("Jim"))
					buy(jim, client);
				else
					System.out.println("Invalid");	
			}
			else if (choice.equalsIgnoreCase("Exit")) {
				System.exit(0);
			}
		}
	}
	/** This Method is used to process the purchase from one Account to the Other */
	public static void buy(Account a, Account b) {
		Scanner input = new Scanner(System.in);
		a.printItemList();
		System.out.println("Which Item number starting at 0");
		String x = input.nextLine();
		int s = Integer.parseInt(x);
		System.out.println(a.getName() + " is selling " + a.getItemName(s) + " to " + b.getName());
		a.removeItem(b, s);
		
	}
}


