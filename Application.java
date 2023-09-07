/**
 * This interface tests the ShoppingCart class and its methods
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 *
 */

public class Application 
{

	public static void main(String[] args)
	{
		
		// Initializing a shopping cart
		ShoppingCart myShoppingCart = new ShoppingCart();
		
		// Initializing items that may be put in the cart
		Item apple = new Item("Apple", 2);
		Item chocolateBar = new Item("Chocolate Bar", 3);
		Item potatoChips = new Item("Potato Chips" , 4);
		Item toiletPaper = new Item("Toilet Paper", 9);
		Item mirror = new Item("Mirror", 25);
		Item flashlight = new Item("Flashlight", 12);
		
		// Adding the initialized items to the shopping cart
		myShoppingCart.addItem(apple);
		myShoppingCart.addItem(chocolateBar);
		myShoppingCart.addItem(mirror);

		// Testing displayAllItems method
		System.out.println("Testing the displayAllItems method: ");
		myShoppingCart.displayAllItems();
		
		// Testing the getNumberofItems method
		System.out.println("\nTesting the getNumberofItems method (expected 3)");
		System.out.println("Number of items in cart: " + myShoppingCart.getNumberofItems());

		// Testing calculateTotalPrice method
		System.out.println("\nTesting the calculateTotalPrice method: (expected output 30.0) ");
		System.out.println("Total Price: " + myShoppingCart.calculateTotalPrice());
		
		// Testing removeMostExpensive method (should remove the mirror)
		System.out.println("\nTesting the removeMostExpensive method: (expected that mirror will be removed)");
		myShoppingCart.removeMostExpensive();
		myShoppingCart.displayAllItems();
		
		// Testing the removeItem method
		System.out.println("\nTesting the removeItem method with apple as argument. (expected that apple is removed)");
		myShoppingCart.removeItem(apple);
		myShoppingCart.displayAllItems();

		// Testing the isEmpty method
		System.out.println("Testing the isEmpty method (expected false)");
		System.out.println("Is the cart empty? " + myShoppingCart.isEmpty());
		
		myShoppingCart.addItem(flashlight);
		myShoppingCart.addItem(flashlight);
		myShoppingCart.addItem(potatoChips);
		myShoppingCart.addItem(toiletPaper);
		
		// Testing if the three items above were added
		System.out.println("\nChecking to see if 3 items were successfully added.");
		myShoppingCart.displayAllItems();
		
		// Testing the contains method
		System.out.println("\nTesting the contains method with apple as the argument (expected false)");
		System.out.println("Does the cart contain an apple? " + myShoppingCart.contains(apple));
		System.out.println("\nTesting the contains method with flashlight as the argument (expected true)");
		System.out.println("Does the cart contain a flashlight? " + myShoppingCart.contains(flashlight));
		
		// Testing the checkFrequency method
		System.out.println("\nTesting the checkFrequency method on flashlight. (expected 2)");
		System.out.println("How many flashlights does the shopping cart have? " + myShoppingCart.checkFrequency(flashlight));
		
		//Testing the emptyShoppingCart method
		System.out.println("\nTesting the emptyShoppingCart method");
		myShoppingCart.emptyShoppingCart();
		myShoppingCart.displayAllItems();
		
	} // end main
	
} // end class
