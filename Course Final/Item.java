/*
 * Author Kevin Drake
 * Date 12/15/16
 * This Class defines the Item Object to be able to add the Items to an Account
 */
import java.util.*;
public class Item {
	private String itemName = " ";
	private String description = " ";
	private double price = 0.0;
	private Date dateCreated;
	/** Default Constructor */
	public Item() {
		dateCreated = new Date();
	}
	/** Constructor with Specified Name */
	public Item(String itemName) {
		this.itemName = itemName;
		dateCreated = new Date();
	}
	/** Getter method for ItemName */
	public String getItemName() {
		return itemName;
	}
	/** Setter method for ItemName */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/** Getter method for Price */
	public double getPrice() {
		return price;
	}
	/** Setter method for Price */
	public void setPrice(double price) {
		this.price = price;
	}
	/** Getter method for Description */
	public String getDescription() {
		return description;
	}
	/** Setter method for Description */
	public void setDescription(String description) {
		this.description = description;
	}
	/** Getter method for DateCreated */
	public Date getItemDateCreated(){
		return dateCreated;
	}
	/** Overriding Object's toString method */
	@Override
	public String toString() {
		return getItemName() + "\n" +  getDescription() + "\n$" + getPrice() + "\n";
	}
}
