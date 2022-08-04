package BusinessLogicLayer;

import java.util.Iterator;

import DataAccessLayer.FoodType;

// Will soon be iterable (be able to use for each loops). 
public class ShoppingCart implements Cart, Iterable<Integer> {
	
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

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new CartIterator();
	}
	
	private class CartIterator implements Iterator<Integer> {

		private int foodTypeOrdinal;
		
		
		public CartIterator() {
			foodTypeOrdinal = 0;
		}
		
		@Override
		public boolean hasNext() {
			return foodTypeOrdinal < FoodType.values().length;
		}

		@Override
		public Integer next() {
			return cart[foodTypeOrdinal++];
		}
		
	}
}
