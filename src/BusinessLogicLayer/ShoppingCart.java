package BusinessLogicLayer;

import DataAccessLayer.FoodType;

// Will soon be iterable (be able to use for each loops)
public class ShoppingCart implements Cart {
	
	private int[] cart;
	private int numberOfItems;
	
	public ShoppingCart() {
		cart = new int[FoodType.values().length];
		numberOfItems = 0;
	}
	
	public boolean isEmpty() {
		return numberOfItems == 0;
	}
	
	public int totalNumberOfItems() {
		return numberOfItems;
	}

	public void add(FoodType FOOD_TYPE) {
		numberOfItems++;
		cart[FOOD_TYPE.ordinal()]++;
	}
	
	public void remove(FoodType FOOD_TYPE) {
		numberOfItems--;
		cart[FOOD_TYPE.ordinal()]--;
	}
	
	public int get(FoodType FOOD_TYPE) {
		return cart[FOOD_TYPE.ordinal()];
	}
}
