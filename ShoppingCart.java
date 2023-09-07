/**
 * This interface represents a Shopping Cart
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class ShoppingCart
{
	
	private ArrayBag<Item> myShoppingCart = new ArrayBag<Item>(); //an ArrayBag holding items in shopping cart
	
	
	/**
	 * Adds an Item to the shopping cart
	 * @param item the item to add
	 * @return whether addition was successful or not
	 */
	public boolean addItem(Item item) 
	{
		return myShoppingCart.add(item);
	} // end addItem
	
	
	/**
	 * Removes a specific item from the bag if possible
	 * @param item The item which to remove
	 * @return whether the removal was successful or not
	 */
	public boolean removeItem(Item item)
	{
		return myShoppingCart.remove(item);
	} // end removeItem
	
	
	/**
	 * Finds the number of items in the shopping cart
	 * @return the number of items contained in the cart
	 */
	public int getNumberofItems() 
	{
		return myShoppingCart.getCurrentSize();
	} // end getNumberofItems
	
	
	/**
	 * Removes a random Item from the shopping Cart
	 */
	public void removeRandomItem() 
	{
		myShoppingCart.remove();
	} // end removeRandomItem
	
	
	/**
	 * Checks if the shopping cart is empty
	 * @return true if the shopping cart is empty, false if not
	 */
	public boolean isEmpty() 
	{
		return myShoppingCart.isEmpty();
	} // end isEmpty
	
	
	/**
	 * Removes all of the items from the shopping cart
	 */
	public void emptyShoppingCart() 
	{
		while(!myShoppingCart.isEmpty())
			removeRandomItem();
	} // end emptyShoppingCart
	
	
	/**
	 * Checks if the shopping cart contains a certain item
	 * @param item the Item for which to check
	 * @return true if the shopping cart contains the item, false if not
	 */
	public boolean contains(Item item) 
	{
		return myShoppingCart.contains(item);
	} // end contains
	
	/**
	 * Checks how many times a specific Item is in the shopping cart
	 * @param item The item for which to check for
	 * @return the number of times the specified item is in the cart
	 */
	public int checkFrequency(Item item) 
	{
		return myShoppingCart.getFrequencyOf(item);
	} // end checkFrequency
	
	
	/**
	 * Converts the shopping cart into an Array of Items
	 * @return an array of Items in the shopping cart
	 */
	public Object[] toArray() 
	{
		return myShoppingCart.toArray();
	} // end toArray
	

	/**
	 * Calculates the total price of all the items in the shopping cart
	 * @return total price of all items
	 */
	public double calculateTotalPrice() 
	{
		Object[] items = toArray();
		double totalPrice = 0;
		
		for(Object i: items)
		{
			totalPrice += ((Item) i).getItemPrice();
		}
		
		return totalPrice;
	} // end calculateTotalPrice
	
	
	/**
	 * Iterates through the shopping cart and removes the most expensive item
	 * @return whether removal was successful or not
	 */
	public boolean removeMostExpensive() 
	{
		if(isEmpty())
			return false;
		
		Object[] items = toArray();
		Item mostExpensive = new Item();
		
		for(Object i: items)
		{
			if(((Item) i).getItemPrice() > mostExpensive.getItemPrice())
				mostExpensive = (Item) i;
		} // end for
		
		return removeItem(mostExpensive);
		
	} // end removeMostExpensive
	

	/**
	 * Displays all of the items contained in the cart to the console
	 */
	public void displayAllItems() 
	{
		if(isEmpty())
		{
			System.out.println("\nThere is nothing in the cart!");
			return;
		}
		
		Object[] items = toArray();
		
		System.out.println();
		for(Object i: items)
		{
			System.out.println("Item Name: " + ((Item) i).getItemName());
			System.out.println("Item Price: " + ((Item) i).getItemPrice() + "\n");
		}
	} // end displayAllItems
	
	
} // end class