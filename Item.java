/**
 * This class represents an Item
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Item 
{
	
	private double price; // holds the price of the item
	private String name; // holds the name of the item

	/**
	 * Default constructor sets name to unknown, and price to 0
	 */
	public Item()
	{
		this("Unknown", 0);
	} // end default constructor
	
	/**
	 * Preferred constructor sets name and price to values of user's choosing
	 * @param itemName The name to set the item to
	 * @param itemPrice The price to set the item to
	 */
	public Item(String itemName, double itemPrice)
	{
		price = itemPrice;
		name = itemName;
	} // end preferred constructor
	
	/**
	 * Gets the name of the current Item
	 * @return the name of the Item
	 */
	public String getItemName() 
	{
		return name;
	} // end getItemName
	
	/**
	 * Sets the name of the current Item
	 * @param productName the name of the product to set the item to
	 */
	public void setItemName(String productName) 
	{
		name = productName;
	} // end setItemName
	
	/**
	 * Gets the price of the current Item
	 * @return the price of the Item
	 */
	public double getItemPrice() 
	{
		return price;
	} // end getItemPrice
	
	/**
	 * Sets the price of the current item
	 * @param itemPrice the price to set the item to
	 */
	public void setItemPrice(double itemPrice) 
	{
		price = itemPrice;
	} // end setItemPrice
	
} // end class
