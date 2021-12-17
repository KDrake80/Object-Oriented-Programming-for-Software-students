/*
 * Author Kevin Drake
 * Date 12/15/21
 * This Class Defines the Account object to store items from the Item Class
 */
import java.util.*;
public class Account extends Item {
	private String accountName = " ";
	private ArrayList<Item> items;
	private int itemCount;
	private Date dateCreated;
	/** Default Constructor */
	public Account() {
		dateCreated = new Date();
		itemCount = 0;
		items = new ArrayList<Item>();
	}
	/** Constructor with Specified Name */ 
	public Account(String accountName) {
		this.accountName = accountName;
		dateCreated = new Date();
		items = new ArrayList<Item>();
	}
	/** Getter Method for Account Name */
	public String getName() {
		return accountName;
	}
	/** Mutator Method for Account Name*/
	public void setName(String accountName) {
		this.accountName = accountName;
	}
	/** Getter Method for DateCreated  */
	public Date getDateCreated() {
		return dateCreated;
	}
	/** Getter Method for ItemCount  */
	public int getItemCount() {
		return itemCount;
	}
	/** Method to Add Item */
	public void addNewItem(String name, String description, double price) {
		Item item = new Item(name);
		item.setDescription(description);
		item.setPrice(price);
		items.add(item);
		itemCount++;
	}
	/** Method to remove Item */
	public void removeItem(Account one, int index) {
		one.addNewItem(getItemName(index), getItemDescription(index), getItemPrice(index));
		items.remove(index);
		itemCount--;
	}
	/** Method to get ItemName from ArrayList */
	public String getItemName(int index) {
		return items.get(index).getItemName();
	}
	/** Method to get Description from ArrayList */
	public String getItemDescription(int index) {
		return items.get(index).getDescription();
	}
	/** Method to get Price from ArrayList */
	public double getItemPrice(int index) {
		return items.get(index).getPrice();
	}
	/** Method to print Item from ArrayList */
	public String printItem(int index) {
		return items.get(index).toString();
	}
	/** Method to print ArrayList */
	public void printItemList() {
		for (int i = 0; i < items.size(); i++)
			System.out.println(printItem(i));
	}
	/** Method to Acquire an Item from ArrayList */
	public Item getItem(int index) {
		return items.get(index);
	}
	/** Overriding Item's toString method */
	@Override
	public String toString() {
		return getName() + " \nItems to sell: " + getItemCount() + " \nAccount created on: " + getDateCreated();
	}
}
